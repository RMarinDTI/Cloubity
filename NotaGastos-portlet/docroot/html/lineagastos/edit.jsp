<%
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page import="javax.portlet.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@ page import="com.liferay.portal.kernel.json.*" %>
<%@ page import="com.liferay.portal.model.*"%>
<%@ page import="com.liferay.portal.service.*"%>
<%@ page import="es.davinciti.liferay.service.*" %>
<%@ page import="es.davinciti.liferay.model.*" %>
<%@ page import="es.davinciti.liferay.model.Currency" %>
<%@ page import="es.davinciti.util.Constants" %>

<%@ page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@ page import="com.liferay.portal.kernel.util.*"%>
<%@ page import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil"%>
<%@ page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>

<script src="//code.jquery.com/jquery-1.10.2.js"></script>

<portlet:defineObjects />

<% ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY); 
long userId = themeDisplay.getUserId();
long companyId = themeDisplay.getCompanyId();
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
long groupId = GroupLocalServiceUtil.getGroup(companyId, Constants.USUARIO_GUEST).getGroupId();
boolean isAdmin = UserGroupRoleLocalServiceUtil.hasUserGroupRole(userId, groupId, Constants.USUARIO_ADMINISTRADOR_ROLE);
boolean isValidad = UserGroupRoleLocalServiceUtil.hasUserGroupRole(userId, groupId, Constants.USUARIO_VALIDADOR_ROLE);
String backURL = ParamUtil.getString(request, "backURL", "");
long notagastoId = ParamUtil.getLong(request, "notaGastoId", 0);
long lineagastoId = ParamUtil.getLong(request, "lineaGastoId", 0);
String firstTime = ParamUtil.getString(request, "firstTime", "");
String vista = ParamUtil.getString(request, "vista", "U");
if (backURL.contains("vista=")) backURL = backURL.substring(0, backURL.indexOf("vista=")+6)+vista;
else backURL += "?vista="+vista;
//System.out.println("lineagasto edit.jsp - lineagastoId : "+lineagastoId+" - firstTime : "+firstTime);
String disabled = "disabled-field";
if (notagastoId > 0) {
	String status = NotaGastoLocalServiceUtil.getNotaGasto(notagastoId).getStatus();
	if (status.contentEquals("1") || status.contentEquals("3")) disabled = "";
}
//System.out.println("notagasto edit.jsp - notaGastoId : "+notagastoId+" - disabled : "+disabled+" - vista : "+vista);
%>

<portlet:actionURL var="editLineaGastoURL" name="editLineaGasto" windowState="normal" />

<ul class="tab">	
  <c:if test="<%= isAdmin || isValidad || request.isUserInRole(Constants.ADMINISTRADOR_ROLE) %>">
  	<li><a href="#" id="tabDepartamentoV" class="tablinks" ><liferay-ui:message key='validated-expenses-notes'/></a></li>
  	<li><a href="#" id="tabDepartamento" class="tablinks" ><liferay-ui:message key='validate'/></a></li>
  </c:if>
  <li><a href="#" id="tabUsuarioHist" class="tablinks" ><liferay-ui:message key='historial'/></a></li>  
  <li><a href="#" id="tabUsuario" class="tablinks" ><liferay-ui:message key='notas-gastos'/></a></li>  
</ul>

<div id="DepartamentoV" class="tabcontent">	
	<div style="width:100%;" >		
		<div id="full" >
			<liferay-ui:header backLabel="back" title="back" backURL="<%= backURL %>" />
			<form method="post" action="<%= editLineaGastoURL.toString() %>" id="lineaGastoForm" name="lineaGastoForm" enctype="multipart/form-data">
				<aui:input type="hidden" name="notagastoId" value="<%= notagastoId %>" />
				<aui:input type="hidden" name="lineagastoId" value="<%= lineagastoId %>" />				
				<aui:input type="hidden" name="firstTime" value="<%= firstTime %>" />		
				<aui:input type="hidden" name="vista" value="<%= vista %>" />
				<aui:fieldset label="line-expenses-note-data">
					<aui:layout>			
						<aui:column columnWidth="15" first="true">
						<% List<LineaGastoFamilia> families = new ArrayList<LineaGastoFamilia>();
							try {
								families = LineaGastoFamiliaLocalServiceUtil.getLineaGastoFamilias(-1, -1);	
							} catch(Exception e) { }								
						%>
							<aui:select name="familia" label="family" cssClass="<%= disabled %>" >
								<aui:option value="0"><liferay-ui:message key='select-option'/></aui:option>
							<% for (LineaGastoFamilia family : families) { %>
								<aui:option value="<%= family.getFamiliaId() %>" selected='<%= LineaGastoLocalServiceUtil.hasLineaGastoFamiliaLineaGasto(family.getFamiliaId(), lineagastoId) %>'><%= family.getName() %></aui:option>	
							<% } %>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="25">
							<aui:select name="categoria" label="category" style="width:350px;" cssClass="<%= disabled %>" >
								<aui:option value="0"><liferay-ui:message key='select-option' /></aui:option>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="15">
						<% List<LineaGastoCliente> clients = new ArrayList<LineaGastoCliente>();
							try {
								clients = LineaGastoClienteLocalServiceUtil.findByCompanyId(companyId);	
							} catch(Exception e) { }								
						%>	
							<aui:select name="cliente" label="client" cssClass="<%= disabled %>" >
								<aui:option value="0"><liferay-ui:message key='select-option'/></aui:option>
							<% for (LineaGastoCliente client : clients) { %>
								<aui:option value="<%= client.getClienteId() %>" selected='<%= LineaGastoLocalServiceUtil.hasLineaGastoClienteLineaGasto(client.getClienteId(), lineagastoId) %>' ><%= client.getName() %></aui:option>	
							<% } %>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="15">
							<aui:select name="proyecto" label="project" cssClass="<%= disabled %>" >
								<aui:option value="0"><liferay-ui:message key='select-option' /></aui:option>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="10">
							<aui:input type="text" name="date" label="date" style="width:100px;cursor:pointer;" readonly="true" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDate() : "" %>' cssClass="<%= disabled %>" />
							<aui:input type="hidden" name="dateIni" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDate() : "" %>' />
						</aui:column>
						<aui:column columnWidth="20" last="true">
						<% List<LineaGastoPayMode> paymodes = new ArrayList<LineaGastoPayMode>();
							try {
								paymodes = LineaGastoPayModeLocalServiceUtil.getLineaGastoPayModes(-1, -1);
							} catch(Exception e) { }						
						%>
							<aui:select name="paymode" label="Paymode" cssClass="<%= disabled %>" >
								<aui:option value="0"><liferay-ui:message key='select-option' /></aui:option>
							<% for (LineaGastoPayMode paymode : paymodes) { %>
								<aui:option value="<%= paymode.getPaymodeId() %>" selected='<%= LineaGastoLocalServiceUtil.hasLineaGastoPayModeLineaGasto(paymode.getPaymodeId(), lineagastoId) %>' ><%= paymode.getName() %></aui:option>
							<% } %>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="10" first="true">
							<div id="changePrice" style="display:none">
								<aui:input type="text" label="price" name="price" readonly='true' value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getPrice() : "0" %>' style="width:100px;" cssClass="<%= disabled %>" />
							</div>
						</aui:column>
						<aui:column columnWidth="10">
							<div id="needQuantity" style="display:none">
								<aui:input type="text" label="quantity" name="quantity" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getQuantity() : "0" %>' style="width:100px;" cssClass="<%= disabled %>" />
							</div>
						</aui:column>						
						<aui:column columnWidth="10">
							<aui:input type="text" label="import" name="amount" readonly='true' value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getAmount() : "0" %>' style="width:100px;" cssClass="<%= disabled %>" />
						</aui:column>
						<aui:column columnWidth="10">
						<% List<String> currencies = new ArrayList<String>();
							try {
								JSONArray jsonCurrencies = JSONFactoryUtil.createJSONArray(CurrenciesCompanyLocalServiceUtil.findByCompanyId(companyId).get(0).getCurrenciesJson());
								//System.out.println("jsonCurrencies : "+jsonCurrencies.toString());
								for (int i=0; i<jsonCurrencies.length(); i++) {
									JSONObject jsonObject = jsonCurrencies.getJSONObject(i);
									currencies.add(jsonObject.getString("currencyId"));
								}
							} catch(Exception e) { }
						%>
							<aui:select name="currencyId" label="Currency" style="width:100px;" cssClass="<%= disabled %>" >
							<% for (String currencyId : currencies) { %>
								<aui:option value="<%= currencyId %>" selected='<%= LineaGastoLocalServiceUtil.hasCurrencyLineaGasto(Long.parseLong(currencyId), lineagastoId) %>'><%= CurrencyLocalServiceUtil.getCurrency(Long.parseLong(currencyId)).getCcyName() %></aui:option>
							<% } %>
							</aui:select>
						</aui:column>
						 <aui:column columnWidth="15">
					    	<c:if test='<%= lineagastoId > 0 && !LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDocumentId().contentEquals("0") %>'>
					    		<div id="lineaLogoMostrar" style="cursor:pointer;position:relative;" onClick='javascript: MostrarLogo();'>[ <liferay-ui:message key='mostrar-imagen'/> ]</div>
					    		<div id="lineaLogoOcultar" style="visibility:hidden;cursor:pointer;position:relative;" onClick='javascript: OcultarLogo();'>[ <liferay-ui:message key="ocultar-imagen" /> ]</div>
					    		<div id="lineaLogo" style="visibility:hidden;width:0px; height:0px;">
					    		<%
					    		String logo = "";
					    		if (lineagastoId > 0) {
					    			try {
					    				DLFileEntry file = DLFileEntryLocalServiceUtil.getFileEntry(Long.parseLong(LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDocumentId()));
					    				logo = themeDisplay.getPortalURL()+"/c/document_library/get_file?uuid="+file.getUuid()+"&groupId="+themeDisplay.getScopeGroupId();
					    			} catch(Exception e) { }
					    			if (!logo.contentEquals("")) { %>
					    		<img src="<%= logo %>" width="auto" height="100px" />
								<%  } 
					    		} %>									
					    		</div>
					    	</c:if>
					    </aui:column>										
						<aui:column columnWidth="25">
							<aui:input type="file" name="document" label="Document" cssClass="<%= disabled %>" />
							<aui:input type="hidden" name="documentId" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDocumentId() : "0" %>' />
						</aui:column>
						 <aui:column columnWidth="20" last="true">
							<aui:input type="textarea" name="comments" label="Comments" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getComments() : "0" %>' cssClass="<%= disabled %>" />
						</aui:column>
						<aui:button-row style="text-align:center; width:100%;">
							<aui:button type="submit" value="submit" cssClass="<%= disabled %>" /> 
	    				</aui:button-row>	
	    			</aui:layout>
			 	</aui:fieldset>	
			</form>
		</div>
	</div>
</div>

<div id="Departamento" class="tabcontent">	
	<div style="width:100%;" >		
		<div id="full" >	
			<liferay-ui:header backLabel="back" title="back" backURL="<%= backURL %>" />
			<form method="post" action="<%= editLineaGastoURL.toString() %>" id="lineaGastoForm" name="lineaGastoForm" enctype="multipart/form-data">
				<aui:input type="hidden" name="notagastoId" value="<%= notagastoId %>" />
				<aui:input type="hidden" name="lineagastoId" value="<%= lineagastoId %>" />				
				<aui:input type="hidden" name="firstTime" value="<%= firstTime %>" />		
				<aui:input type="hidden" name="vista" value="<%= vista %>" />
				<aui:fieldset label="line-expenses-note-data">
					<aui:layout>			
						<aui:column columnWidth="15" first="true">
						<% List<LineaGastoFamilia> families = new ArrayList<LineaGastoFamilia>();
							try {
								families = LineaGastoFamiliaLocalServiceUtil.getLineaGastoFamilias(-1, -1);	
							} catch(Exception e) { }								
						%>
							<aui:select name="familia" label="family" cssClass="<%= disabled %>" >
								<aui:option value="0"><liferay-ui:message key='select-option'/></aui:option>
							<% for (LineaGastoFamilia family : families) { %>
								<aui:option value="<%= family.getFamiliaId() %>" selected='<%= LineaGastoLocalServiceUtil.hasLineaGastoFamiliaLineaGasto(family.getFamiliaId(), lineagastoId) %>'><%= family.getName() %></aui:option>	
							<% } %>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="25">
							<aui:select name="categoria" label="category" style="width:350px;" cssClass="<%= disabled %>" >
								<aui:option value="0"><liferay-ui:message key='select-option' /></aui:option>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="15">
						<% List<LineaGastoCliente> clients = new ArrayList<LineaGastoCliente>();
							try {
								clients = LineaGastoClienteLocalServiceUtil.findByCompanyId(companyId);	
							} catch(Exception e) { }								
						%>	
							<aui:select name="cliente" label="client" cssClass="<%= disabled %>" >
								<aui:option value="0"><liferay-ui:message key='select-option'/></aui:option>
							<% for (LineaGastoCliente client : clients) { %>
								<aui:option value="<%= client.getClienteId() %>" selected='<%= LineaGastoLocalServiceUtil.hasLineaGastoClienteLineaGasto(client.getClienteId(), lineagastoId) %>' ><%= client.getName() %></aui:option>	
							<% } %>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="15">
							<aui:select name="proyecto" label="project" cssClass="<%= disabled %>" >
								<aui:option value="0"><liferay-ui:message key='select-option' /></aui:option>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="10">
							<aui:input type="text" name="date" label="date" style="width:100px;cursor:pointer;" readonly="true" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDate() : "" %>' cssClass="<%= disabled %>" />
							<aui:input type="hidden" name="dateIni" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDate() : "" %>' />
						</aui:column>
						<aui:column columnWidth="20" last="true">
						<% List<LineaGastoPayMode> paymodes = new ArrayList<LineaGastoPayMode>();
							try {
								paymodes = LineaGastoPayModeLocalServiceUtil.getLineaGastoPayModes(-1, -1);
							} catch(Exception e) { }						
						%>
							<aui:select name="paymode" label="Paymode" cssClass="<%= disabled %>" >
								<aui:option value="0"><liferay-ui:message key='select-option' /></aui:option>
							<% for (LineaGastoPayMode paymode : paymodes) { %>
								<aui:option value="<%= paymode.getPaymodeId() %>" selected='<%= LineaGastoLocalServiceUtil.hasLineaGastoPayModeLineaGasto(paymode.getPaymodeId(), lineagastoId) %>' ><%= paymode.getName() %></aui:option>
							<% } %>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="10" first="true">
							<div id="changePrice" style="display:none">
								<aui:input type="text" label="price" name="price" readonly='true' value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getPrice() : "0" %>' style="width:100px;" cssClass="<%= disabled %>" />
							</div>
						</aui:column>
						<aui:column columnWidth="10">
							<div id="needQuantity" style="display:none">
								<aui:input type="text" label="quantity" name="quantity" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getQuantity() : "0" %>' style="width:100px;" cssClass="<%= disabled %>" />
							</div>
						</aui:column>						
						<aui:column columnWidth="10">
							<aui:input type="text" label="import" name="amount" readonly='true' value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getAmount() : "0" %>' style="width:100px;" cssClass="<%= disabled %>" />
						</aui:column>
						<aui:column columnWidth="10">
						<% List<String> currencies = new ArrayList<String>();
							try {
								JSONArray jsonCurrencies = JSONFactoryUtil.createJSONArray(CurrenciesCompanyLocalServiceUtil.findByCompanyId(companyId).get(0).getCurrenciesJson());
								//System.out.println("jsonCurrencies : "+jsonCurrencies.toString());
								for (int i=0; i<jsonCurrencies.length(); i++) {
									JSONObject jsonObject = jsonCurrencies.getJSONObject(i);
									currencies.add(jsonObject.getString("currencyId"));
								}
							} catch(Exception e) { }
						%>
							<aui:select name="currencyId" label="Currency" style="width:100px;" cssClass="<%= disabled %>" >
							<% for (String currencyId : currencies) { %>
								<aui:option value="<%= currencyId %>" selected='<%= LineaGastoLocalServiceUtil.hasCurrencyLineaGasto(Long.parseLong(currencyId), lineagastoId) %>'><%= CurrencyLocalServiceUtil.getCurrency(Long.parseLong(currencyId)).getCcyName() %></aui:option>
							<% } %>
							</aui:select>
						</aui:column>
						 <aui:column columnWidth="15">
					    	<c:if test='<%= lineagastoId > 0 && !LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDocumentId().contentEquals("0") %>'>
					    		<div id="lineaLogoMostrar" style="cursor:pointer;position:relative;" onClick='javascript: MostrarLogo();'>[ <liferay-ui:message key='mostrar-imagen'/> ]</div>
					    		<div id="lineaLogoOcultar" style="visibility:hidden;cursor:pointer;position:relative;" onClick='javascript: OcultarLogo();'>[ <liferay-ui:message key="ocultar-imagen" /> ]</div>
					    		<div id="lineaLogo" style="visibility:hidden;width:0px; height:0px;">
					    		<%
					    		String logo = "";
					    		if (lineagastoId > 0) {
					    			try {
					    				DLFileEntry file = DLFileEntryLocalServiceUtil.getFileEntry(Long.parseLong(LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDocumentId()));
					    				logo = themeDisplay.getPortalURL()+"/c/document_library/get_file?uuid="+file.getUuid()+"&groupId="+themeDisplay.getScopeGroupId();
					    			} catch(Exception e) { }
					    			if (!logo.contentEquals("")) { %>
					    		<img src="<%= logo %>" width="auto" height="100px" />
								<%  } 
					    		} %>									
					    		</div>
					    	</c:if>
					    </aui:column>										
						<aui:column columnWidth="25">
							<aui:input type="file" name="document" label="Document" cssClass="<%= disabled %>" />
							<aui:input type="hidden" name="documentId" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDocumentId() : "0" %>' />
						</aui:column>
						 <aui:column columnWidth="20" last="true">
							<aui:input type="textarea" name="comments" label="Comments" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getComments() : "0" %>' cssClass="<%= disabled %>" />
						</aui:column>
						<aui:button-row style="text-align:center; width:100%;">
							<aui:button type="submit" value="submit" cssClass="<%= disabled %>" /> 
	    				</aui:button-row>	
	    			</aui:layout>
			 	</aui:fieldset>	
			</form>
		</div>		
	</div>	
</div>

<div id="UsuarioHist" class="tabcontent">
	<div style="width:100%;" >
		<div id="full" >		
			<liferay-ui:header backLabel="back" title="back" backURL="<%= backURL %>" />
			<form method="post" action="<%= editLineaGastoURL.toString() %>" id="lineaGastoForm" name="lineaGastoForm" enctype="multipart/form-data">
				<aui:input type="hidden" name="notagastoId" value="<%= notagastoId %>" />
				<aui:input type="hidden" name="lineagastoId" value="<%= lineagastoId %>" />				
				<aui:input type="hidden" name="firstTime" value="<%= firstTime %>" />		
				<aui:input type="hidden" name="vista" value="<%= vista %>" />
				<aui:fieldset label="line-expenses-note-data">
					<aui:layout>			
						<aui:column columnWidth="15" first="true">
						<% List<LineaGastoFamilia> families = new ArrayList<LineaGastoFamilia>();
							try {
								families = LineaGastoFamiliaLocalServiceUtil.getLineaGastoFamilias(-1, -1);	
							} catch(Exception e) { }								
						%>
							<aui:select name="familia" label="family" cssClass="<%= disabled %>" >
								<aui:option value="0"><liferay-ui:message key='select-option'/></aui:option>
							<% for (LineaGastoFamilia family : families) { %>
								<aui:option value="<%= family.getFamiliaId() %>" selected='<%= LineaGastoLocalServiceUtil.hasLineaGastoFamiliaLineaGasto(family.getFamiliaId(), lineagastoId) %>'><%= family.getName() %></aui:option>	
							<% } %>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="25">
							<aui:select name="categoria" label="category" style="width:350px;" cssClass="<%= disabled %>" >
								<aui:option value="0"><liferay-ui:message key='select-option' /></aui:option>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="15">
						<% List<LineaGastoCliente> clients = new ArrayList<LineaGastoCliente>();
							try {
								clients = LineaGastoClienteLocalServiceUtil.findByCompanyId(companyId);	
							} catch(Exception e) { }								
						%>	
							<aui:select name="cliente" label="client" cssClass="<%= disabled %>" >
								<aui:option value="0"><liferay-ui:message key='select-option'/></aui:option>
							<% for (LineaGastoCliente client : clients) { %>
								<aui:option value="<%= client.getClienteId() %>" selected='<%= LineaGastoLocalServiceUtil.hasLineaGastoClienteLineaGasto(client.getClienteId(), lineagastoId) %>' ><%= client.getName() %></aui:option>	
							<% } %>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="15">
							<aui:select name="proyecto" label="project" cssClass="<%= disabled %>" >
								<aui:option value="0"><liferay-ui:message key='select-option' /></aui:option>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="10">
							<aui:input type="text" name="date" label="date" style="width:100px;cursor:pointer;" readonly="true" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDate() : "" %>' cssClass="<%= disabled %>" />
							<aui:input type="hidden" name="dateIni" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDate() : "" %>' />
						</aui:column>
						<aui:column columnWidth="20" last="true">
						<% List<LineaGastoPayMode> paymodes = new ArrayList<LineaGastoPayMode>();
							try {
								paymodes = LineaGastoPayModeLocalServiceUtil.getLineaGastoPayModes(-1, -1);
							} catch(Exception e) { }						
						%>
							<aui:select name="paymode" label="Paymode" cssClass="<%= disabled %>" >
								<aui:option value="0"><liferay-ui:message key='select-option' /></aui:option>
							<% for (LineaGastoPayMode paymode : paymodes) { %>
								<aui:option value="<%= paymode.getPaymodeId() %>" selected='<%= LineaGastoLocalServiceUtil.hasLineaGastoPayModeLineaGasto(paymode.getPaymodeId(), lineagastoId) %>' ><%= paymode.getName() %></aui:option>
							<% } %>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="10" first="true">
							<div id="changePrice" style="display:none">
								<aui:input type="text" label="price" name="price" readonly='true' value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getPrice() : "0" %>' style="width:100px;" cssClass="<%= disabled %>" />
							</div>
						</aui:column>
						<aui:column columnWidth="10">
							<div id="needQuantity" style="display:none">
								<aui:input type="text" label="quantity" name="quantity" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getQuantity() : "0" %>' style="width:100px;" cssClass="<%= disabled %>" />
							</div>
						</aui:column>						
						<aui:column columnWidth="10">
							<aui:input type="text" label="import" name="amount" readonly='true' value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getAmount() : "0" %>' style="width:100px;" cssClass="<%= disabled %>" />
						</aui:column>
						<aui:column columnWidth="10">
						<% List<String> currencies = new ArrayList<String>();
							try {
								JSONArray jsonCurrencies = JSONFactoryUtil.createJSONArray(CurrenciesCompanyLocalServiceUtil.findByCompanyId(companyId).get(0).getCurrenciesJson());
								//System.out.println("jsonCurrencies : "+jsonCurrencies.toString());
								for (int i=0; i<jsonCurrencies.length(); i++) {
									JSONObject jsonObject = jsonCurrencies.getJSONObject(i);
									currencies.add(jsonObject.getString("currencyId"));
								}
							} catch(Exception e) { }
						%>
							<aui:select name="currencyId" label="Currency" style="width:100px;" cssClass="<%= disabled %>" >
							<% for (String currencyId : currencies) { %>
								<aui:option value="<%= currencyId %>" selected='<%= LineaGastoLocalServiceUtil.hasCurrencyLineaGasto(Long.parseLong(currencyId), lineagastoId) %>'><%= CurrencyLocalServiceUtil.getCurrency(Long.parseLong(currencyId)).getCcyName() %></aui:option>
							<% } %>
							</aui:select>
						</aui:column>
						 <aui:column columnWidth="15">
					    	<c:if test='<%= lineagastoId > 0 && !LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDocumentId().contentEquals("0") %>'>
					    		<div id="lineaLogoMostrar" style="cursor:pointer;position:relative;" onClick='javascript: MostrarLogo();'>[ <liferay-ui:message key='mostrar-imagen'/> ]</div>
					    		<div id="lineaLogoOcultar" style="visibility:hidden;cursor:pointer;position:relative;" onClick='javascript: OcultarLogo();'>[ <liferay-ui:message key="ocultar-imagen" /> ]</div>
					    		<div id="lineaLogo" style="visibility:hidden;width:0px; height:0px;">
					    		<%
					    		String logo = "";
					    		if (lineagastoId > 0) {
					    			try {
					    				DLFileEntry file = DLFileEntryLocalServiceUtil.getFileEntry(Long.parseLong(LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDocumentId()));
					    				logo = themeDisplay.getPortalURL()+"/c/document_library/get_file?uuid="+file.getUuid()+"&groupId="+themeDisplay.getScopeGroupId();
					    			} catch(Exception e) { }
					    			if (!logo.contentEquals("")) { %>
					    		<img src="<%= logo %>" width="auto" height="100px" />
								<%  } 
					    		} %>									
					    		</div>
					    	</c:if>
					    </aui:column>										
						<aui:column columnWidth="25">
							<aui:input type="file" name="document" label="Document" cssClass="<%= disabled %>" />
							<aui:input type="hidden" name="documentId" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDocumentId() : "0" %>' />
						</aui:column>
						 <aui:column columnWidth="20" last="true">
							<aui:input type="textarea" name="comments" label="Comments" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getComments() : "0" %>' cssClass="<%= disabled %>" />
						</aui:column>
						<aui:button-row style="text-align:center; width:100%;">
							<aui:button type="submit" value="submit" cssClass="<%= disabled %>" /> 
	    				</aui:button-row>	
	    			</aui:layout>
			 	</aui:fieldset>	
			</form>
		</div>
	</div>	
</div>

<div id="Usuario" class="tabcontent">
	<div style="width:100%;" >
		<div id="full" >
			<liferay-ui:header backLabel="back" title="back" backURL="<%= backURL %>" />
			<form method="post" action="<%= editLineaGastoURL.toString() %>" id="lineaGastoForm" name="lineaGastoForm" enctype="multipart/form-data">
				<aui:input type="hidden" name="notagastoId" value="<%= notagastoId %>" />
				<aui:input type="hidden" name="lineagastoId" value="<%= lineagastoId %>" />				
				<aui:input type="hidden" name="firstTime" value="<%= firstTime %>" />
				<aui:input type="hidden" name="vista" value="<%= vista %>" />				
				<aui:fieldset label="line-expenses-note-data">
					<aui:layout>			
						<aui:column columnWidth="15" first="true">
						<% List<LineaGastoFamilia> families = new ArrayList<LineaGastoFamilia>();
							try {
								families = LineaGastoFamiliaLocalServiceUtil.getLineaGastoFamilias(-1, -1);	
							} catch(Exception e) { }								
						%>
							<aui:select name="familia" label="family" >
								<aui:option value="0"><liferay-ui:message key='select-option'/></aui:option>
							<% for (LineaGastoFamilia family : families) { %>
								<aui:option value="<%= family.getFamiliaId() %>" selected='<%= LineaGastoLocalServiceUtil.hasLineaGastoFamiliaLineaGasto(family.getFamiliaId(), lineagastoId) %>'><%= family.getName() %></aui:option>	
							<% } %>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="25">
							<aui:select name="categoria" label="category" style="width:350px;">
								<aui:option value="0"><liferay-ui:message key='select-option' /></aui:option>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="15">
						<% List<LineaGastoCliente> clients = new ArrayList<LineaGastoCliente>();
							try {
								clients = LineaGastoClienteLocalServiceUtil.findByCompanyId(companyId);	
							} catch(Exception e) { }								
						%>	
							<aui:select name="cliente" label="client" >
								<aui:option value="0"><liferay-ui:message key='select-option'/></aui:option>
							<% for (LineaGastoCliente client : clients) { %>
								<aui:option value="<%= client.getClienteId() %>" selected='<%= LineaGastoLocalServiceUtil.hasLineaGastoClienteLineaGasto(client.getClienteId(), lineagastoId) %>' ><%= client.getName() %></aui:option>	
							<% } %>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="15">
							<aui:select name="proyecto" label="project" >
								<aui:option value="0"><liferay-ui:message key='select-option' /></aui:option>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="10">
							<aui:input type="text" name="date" label="date" style="width:100px;cursor:pointer;" readonly="true" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDate() : "" %>' />
							<aui:input type="hidden" name="dateIni" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDate() : "" %>' />
						</aui:column>
						<aui:column columnWidth="20" last="true">
						<% List<LineaGastoPayMode> paymodes = new ArrayList<LineaGastoPayMode>();
							try {
								paymodes = LineaGastoPayModeLocalServiceUtil.getLineaGastoPayModes(-1, -1);
							} catch(Exception e) { }						
						%>
							<aui:select name="paymode" label="Paymode" >
								<aui:option value="0"><liferay-ui:message key='select-option' /></aui:option>
							<% for (LineaGastoPayMode paymode : paymodes) { %>
								<aui:option value="<%= paymode.getPaymodeId() %>" selected='<%= LineaGastoLocalServiceUtil.hasLineaGastoPayModeLineaGasto(paymode.getPaymodeId(), lineagastoId) %>' ><%= paymode.getName() %></aui:option>
							<% } %>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="10" first="true">
							<div id="changePrice" style="display:none">
								<aui:input type="text" label="price" name="price" readonly='true' value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getPrice() : "0" %>' style="width:100px;" />
							</div>
						</aui:column>
						<aui:column columnWidth="10">
							<div id="needQuantity" style="display:none">
								<aui:input type="text" label="quantity" name="quantity" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getQuantity() : "0" %>' style="width:100px;" />
							</div>
						</aui:column>						
						<aui:column columnWidth="10">
							<aui:input type="text" label="import" name="amount" readonly='true' value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getAmount() : "0" %>' style="width:100px;" />
						</aui:column>
						<aui:column columnWidth="10">
						<% List<String> currencies = new ArrayList<String>();
							try {
								JSONArray jsonCurrencies = JSONFactoryUtil.createJSONArray(CurrenciesCompanyLocalServiceUtil.findByCompanyId(companyId).get(0).getCurrenciesJson());
								//System.out.println("jsonCurrencies : "+jsonCurrencies.toString());
								for (int i=0; i<jsonCurrencies.length(); i++) {
									JSONObject jsonObject = jsonCurrencies.getJSONObject(i);
									currencies.add(jsonObject.getString("currencyId"));
								}
							} catch(Exception e) { }
						%>
							<aui:select name="currencyId" label="Currency" style="width:100px;">
							<% for (String currencyId : currencies) { %>
								<aui:option value="<%= currencyId %>" selected='<%= LineaGastoLocalServiceUtil.hasCurrencyLineaGasto(Long.parseLong(currencyId), lineagastoId) %>'><%= CurrencyLocalServiceUtil.getCurrency(Long.parseLong(currencyId)).getCcyName() %></aui:option>
							<% } %>
							</aui:select>
						</aui:column>
						 <aui:column columnWidth="15">
					    	<c:if test='<%= lineagastoId > 0 && !LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDocumentId().contentEquals("0") %>'>
					    		<div id="lineaLogoMostrar" style="cursor:pointer;position:relative;" onClick='javascript: MostrarLogo();'>[ <liferay-ui:message key='mostrar-imagen'/> ]</div>
					    		<div id="lineaLogoOcultar" style="visibility:hidden;cursor:pointer;position:relative;" onClick='javascript: OcultarLogo();'>[ <liferay-ui:message key="ocultar-imagen" /> ]</div>
					    		<div id="lineaLogo" style="visibility:hidden;width:0px; height:0px;">
					    		<%
					    		String logo = "";
					    		if (lineagastoId > 0) {
					    			try {
					    				DLFileEntry file = DLFileEntryLocalServiceUtil.getFileEntry(Long.parseLong(LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDocumentId()));
					    				logo = themeDisplay.getPortalURL()+"/c/document_library/get_file?uuid="+file.getUuid()+"&groupId="+themeDisplay.getScopeGroupId();
					    			} catch(Exception e) { }
					    			if (!logo.contentEquals("")) { %>
					    		<img src="<%= logo %>" width="auto" height="100px" />
								<%  } 
					    		} %>									
					    		</div>
					    	</c:if>
					    </aui:column>										
						<aui:column columnWidth="25">
							<aui:input type="file" name="document" label="Document" />
							<aui:input type="hidden" name="documentId" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getDocumentId() : "0" %>' />
						</aui:column>
						 <aui:column columnWidth="20" last="true">
							<aui:input type="textarea" name="comments" label="Comments" value='<%= lineagastoId > 0 ? LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId).getComments() : "0" %>' />
						</aui:column>
						<aui:button-row style="text-align:center; width:100%;">
							<aui:button type="submit" value="submit"/> 
	    				</aui:button-row>	
	    			</aui:layout>
			 	</aui:fieldset>	
			</form>
		</div>
	</div>
</div>

<portlet:resourceURL var="resourceURL" ></portlet:resourceURL>

<c:set var="projectId"><%= LineaGastoProyectoLocalServiceUtil.getLineaGastoLineaGastoProyectos(lineagastoId).get(0).getProyectoId() %></c:set>
<c:set var="categoriaId"><%= LineaGastoCategoriaLocalServiceUtil.getLineaGastoLineaGastoCategorias(lineagastoId).get(0).getCategoriaId() %></c:set>
<c:set var="locale"><%= themeDisplay.getLocale().toString().split("_")[0] %></c:set>
<c:set var="startDateNota"><%= notagastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notagastoId).getStartDate() : "" %></c:set>
<c:set var="endDateNota"><%= notagastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notagastoId).getEndDate() : "" %></c:set>
<c:set var="dateSuperior"><%= LanguageUtil.format(themeDisplay.getLocale(), "date-superior-endDate", notagastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notagastoId).getEndDate() : "", false) %></c:set>
<c:set var="dateInferior"><%= LanguageUtil.format(themeDisplay.getLocale(), "date-inferior-startDate", notagastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notagastoId).getEndDate() : "", false) %></c:set>

<aui:script>

	AUI().use('aui-base','aui-io-request','aui-node', function(A){
		
		// Categorias - Familia
		A.one("#<portlet:namespace/>familia").on('change',function(){   
			//alert("select change - familia val : "+A.one("#<portlet:namespace/>familia").val());
			A.io.request('<%=resourceURL%>', {	         
			    method: 'POST',
			    data: { 
			    	<portlet:namespace/>familiaId : A.one("#<portlet:namespace/>familia").val()				
			    },
			    dataType: 'json',
			    on: {
			        success: function() {
						var categoriesList = this.get('responseData');
						var categoryId = ${categoriaId};
						//alert("categoriesList : "+categoriesList);
						A.one('#<portlet:namespace />categoria').empty();
						A.one('#<portlet:namespace />categoria').append("<option value='0'><liferay-ui:message key='select-option'/></option>");												
						for(var i in categoriesList){
							var selected = false;							
							if (categoriesList[i].categoriaId-categoryId == 0) selected = true;							
			                if (selected) A.one('#<portlet:namespace />categoria').append("<option value='"+ categoriesList[i].categoriaId +"' selected='' >"+categoriesList[i].name+"</option> ");
			                else A.one('#<portlet:namespace />categoria').append("<option value='"+ categoriesList[i].categoriaId +"' >"+categoriesList[i].name+"</option> ");
			            }
			        }
			    }
			});
	    });
		// Proyectos - Cliente
		A.one("#<portlet:namespace/>cliente").on('change',function(){   
			//alert("select change - familia val : "+A.one("#<portlet:namespace/>familia").val());
			A.io.request('<%=resourceURL%>', {	         
			    method: 'POST',
			    data: { 
			    	<portlet:namespace/>clienteId : A.one("#<portlet:namespace/>cliente").val()			    	
			    },
			    dataType: 'json',
			    on: {
			        success: function() {
						var projectsList = this.get('responseData');
						var projectId = ${projectId};
						//alert("categoriesList : "+categoriesList);
						A.one('#<portlet:namespace />proyecto').empty();
						A.one('#<portlet:namespace />proyecto').append("<option value='0'><liferay-ui:message key='select-option'/></option>");
						for(var j in projectsList){
			                var selected = false;
			                if (projectsList[j].proyectoId-projectId == 0) selected=true;
							if (selected) A.one('#<portlet:namespace />proyecto').append("<option value='"+ projectsList[j].proyectoId +"' selected='' >"+projectsList[j].name+"</option> ");
							else A.one('#<portlet:namespace />proyecto').append("<option value='"+ projectsList[j].proyectoId +"' >"+projectsList[j].name+"</option> ");
			            }
			        }
			    }
			});
	    });		
		// Categoria
		A.one("#<portlet:namespace/>categoria").on('change',function(){   
			//alert("select change - familia val : "+A.one("#<portlet:namespace/>familia").val());
			A.io.request('<%=resourceURL%>', {	         
			    method: 'POST',
			    data: { 
			    	<portlet:namespace/>categoriaId : A.one("#<portlet:namespace/>categoria").val()			    	
			    },
			    dataType: 'json',
			    on: {
			        success: function() {
						var categoria = this.get('responseData');
						var first = A.one('#<portlet:namespace />firstTime').val();
						if (first == "" || first == "2") {						
							A.one('#<portlet:namespace />amount').val("0");
							A.one('#<portlet:namespace />price').val("0");
							A.one('#<portlet:namespace />quantity').val("0");
							A.one('#<portlet:namespace />price').val(categoria.price);
							A.one('#<portlet:namespace />firstTime').val("2");
						}
						if (first == "1") A.one('#<portlet:namespace />firstTime').val("");
						if (parseInt(categoria.changePrice, 10) == 1) A.one('#<portlet:namespace />price').set("readonly", "false");
						else A.one('#<portlet:namespace />price').set("readonly", "true");
						if (parseInt(categoria.needQuantity, 10) == 1) {
							A.one("#needQuantity").show();
							A.one("#changePrice").show();
							A.one('#<portlet:namespace />amount').set("readonly", "true");
						}
						else {
							A.one("#needQuantity").hide();
							A.one("#changePrice").hide();
							A.one('#<portlet:namespace />amount').set("readonly", "false");
						}												
			        }
			    }
			});
	    });		
		// Cálculo del Amount cuando cambia Price
		A.one("#<portlet:namespace/>price").on('change',function(){
			var price = A.one("#<portlet:namespace/>price").val();
			var quantity = A.one("#<portlet:namespace/>quantity").val();
			var total = price * quantity;
			A.one("#<portlet:namespace/>amount").val(total);			
		});
		// Cálculo del Amount cuando cambia Quantity
		A.one("#<portlet:namespace/>quantity").on('change',function(){
			var price = A.one("#<portlet:namespace/>price").val();
			var quantity = A.one("#<portlet:namespace/>quantity").val();
			var total = price * quantity;
			A.one("#<portlet:namespace/>amount").val(total);			
		});
		
	});
	
	var runShowSelects1 = function() {		
		YUI().ready('event', 'node-event-simulate', function(Y){
			Y.one("#<portlet:namespace/>familia").simulate('change');
			Y.one("#<portlet:namespace/>cliente").simulate('change');
		});
	};
	
	var runShowSelects2 = function() {		
		YUI().ready('event', 'node-event-simulate', function(Y){
			Y.one("#<portlet:namespace/>categoria").simulate('change');			
		});
	};
	
	YUI({lang: '${locale}'}).use('aui-datepicker', 'event', function(Y) {
		new Y.DatePicker({
			trigger: '#<portlet:namespace/>date',
			mask: '%d/%m/%Y',
		    popover: {
		    	zIndex: 1
		    },
		    on: {
		    	selectionChange: function(event) {
		    		event.preventDefault();		    		
		    		//Y.one("#<portlet:namespace/>startDate").simulate('change');
		    		var date = new Date(event.newSelection);
		    		var startDate ='${startDateNota}'; 
					var endDate = '${endDateNota}';					
					if (startDate != "") startDate = new Date(startDate.split("/")[2]+"-"+startDate.split("/")[1]+"-"+startDate.split("/")[0])
					if (endDate != "") endDate = new Date(endDate.split("/")[2]+"-"+endDate.split("/")[1]+"-"+endDate.split("/")[0])
					//alert("date : "+event.newSelection+" - startDate : "+startDate+" - endDate : "+endDate);
					var dateIni = Y.one("#<portlet:namespace/>dateIni").val();
					if (date > endDate) {
						alert("${dateSuperior}");
						Y.one("#<portlet:namespace/>date").val(dateIni);	
					} else if (date < startDate) {
						alert("${dateInferior}");
						Y.one("#<portlet:namespace/>date").val(dateIni);
					} else { 
						var day = date.getDate() >= 10 ? date.getDate() : "0"+date.getDate(); 
						var month = (date.getMonth()+1) >= 10 ? (date.getMonth()+1) : "0"+(date.getMonth()+1); 
						var newDate = day + "/" + month + "/" + date.getFullYear();
						Y.one("#<portlet:namespace/>date").val(newDate);
						Y.one("#<portlet:namespace/>dateIni").val(newDate);
					}
		    	}
		    }
		});
	});

</aui:script>

<script>

	$(document).ready(function() {	
		$(".tab li a").addClass('disabled');
		if ($("#<portlet:namespace/>vista").val() == "V") $("#tabDepartamentoV").trigger("click");
		else if ($("#<portlet:namespace/>vista").val() == "D") $("#tabDepartamento").trigger("click");
		else if ($("#<portlet:namespace/>vista").val() == "H") $("#tabUsuarioHist").trigger("click");
		else $("#tabUsuario").trigger("click");	
		setTimeout(runShowSelects1, 500);
		setTimeout(runShowSelects2, 800);		
	});

</script>

