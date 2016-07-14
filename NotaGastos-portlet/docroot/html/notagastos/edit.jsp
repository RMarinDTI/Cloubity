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

<%@ page import="es.davinciti.util.Constants" %>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@ page import="es.davinciti.liferay.service.*" %>
<%@ page import="es.davinciti.liferay.model.*" %>
<%@ page import="com.liferay.portal.model.*"%>
<%@ page import="com.liferay.portal.service.*"%>

<%@ page import="com.liferay.portal.kernel.dao.orm.*"%>
<%@ page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@ page import="com.liferay.portal.kernel.util.*"%>
<%@ page import="com.liferay.portal.kernel.bean.PortletBeanLocatorUtil"%>
<%@ page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@ page import="com.liferay.portal.kernel.servlet.SessionMessages"%>

<%@ page import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil"%>
<%@ page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>

<script src="//code.jquery.com/jquery-1.10.2.js"></script>

<portlet:defineObjects />

<% ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY); 
long userId = themeDisplay.getUserId();
long companyId = themeDisplay.getCompanyId();
long notaGastoId = ParamUtil.getLong(request, "notaGastoId", 0);
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
long groupId = GroupLocalServiceUtil.getGroup(companyId, Constants.USUARIO_GUEST).getGroupId();
boolean isAdmin = UserGroupRoleLocalServiceUtil.hasUserGroupRole(userId, groupId, Constants.USUARIO_ADMINISTRADOR_ROLE);
boolean isValidad = UserGroupRoleLocalServiceUtil.hasUserGroupRole(userId, groupId, Constants.USUARIO_VALIDADOR_ROLE);
String backURL = ParamUtil.getString(request, "backURL", "");
PortletURL portletURLPa = renderResponse.createRenderURL();
PortletURL portletURLPaH = renderResponse.createRenderURL();
PortletURL portletURLPaD = renderResponse.createRenderURL();
PortletURL portletURLPaV = renderResponse.createRenderURL();
String vista = ParamUtil.getString(request, "vista", "U"); 
if (backURL.contains("vista=")) backURL = backURL.substring(0, backURL.indexOf("vista=")+6)+vista;
else backURL += "?vista="+vista;
String disabled = "disabled-field";
if (notaGastoId > 0) {
	String status = NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getStatus();
	if (status.contentEquals("1") || status.contentEquals("3")) disabled = "";
}
//System.out.println("notagasto edit.jsp - notaGastoId : "+notaGastoId+" - disabled : "+disabled+" - vista : "+vista);
%>

<portlet:actionURL var="editNotaGastoURL" name="editNotaGasto" windowState="normal" />

<portlet:renderURL var="addLineaGastoURL" >
	<portlet:param name="jspPage" value="/html/lineagastos/add.jsp" />
	<portlet:param name="backURL" value="<%= themeDisplay.getURLCurrent() %>" />
	<portlet:param name="notaGastoId" value="<%= String.valueOf(notaGastoId) %>" />
	<portlet:param name="vista" value="<%= vista %>" />
</portlet:renderURL>

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
			<form method="post" action="<%= editNotaGastoURL.toString() %>" id="notaGastoForm" name="notaGastoForm">
				<aui:input type="hidden" name="nostagastoId" value="<%= notaGastoId %>" />
				<aui:input type="hidden" name="companyId" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getCompanyId() : "" %>' />
				<aui:input type="hidden" name="userId" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getUserId() : "" %>' />
				<aui:input type="hidden" name="date" value='<%= dateFormat.format(new Date())  %>' />
				<aui:input type="hidden" name="backURL" value='<%= backURL  %>' />
				<aui:input type="hidden" name="vista" value='<%= vista  %>' />
				<aui:fieldset label="expenses-note-data">
					<aui:layout>		
						<aui:column columnWidth="10" first="true">			 		    	
			 		     	<aui:input type="text" name="amount" label="total-amount" style="width:100px;" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getAmount() : "" %>' readonly="true" />			 		     			 		     
			 		    </aui:column> 		    	
			 		    <aui:column columnWidth="15">
			 		    	<aui:select name="organizationId" label="Organization" style="width:210px;" cssClass="<%= disabled %>" >
								<% List<Organization> userOrganizations = OrganizationLocalServiceUtil.getUserOrganizations(userId);
								for (Organization userOrganization : userOrganizations) { %>
									<aui:option value="<%=userOrganization.getOrganizationId()%>" ><%=userOrganization.getName()%></aui:option>
											
								<% 	List<Organization> userSubOrganizations = OrganizationLocalServiceUtil.getSuborganizations(companyId, userOrganization.getOrganizationId()); 
									for (Organization userSubOrganization : userSubOrganizations) { %>
									<aui:option value="<%=userSubOrganization.getOrganizationId()%>" ><%=userSubOrganization.getName()%></aui:option>
								<% } 
								} %>
							</aui:select>
			 		    </aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="description" label="Description" style="width:270px;" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getDescription() : "" %>' cssClass="<%= disabled %>" />
			 		    </aui:column> 		    
			 		    <aui:column columnWidth="10">										 		    		 		    	
			 		    	<aui:input type="text" name="startDate" label="startDate" style="width:100px;cursor:pointer;" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getStartDate() : "" %>' readonly="true" cssClass="<%= disabled %>" />			 		    	
			 		    	<aui:input type="hidden" name="startDateIni" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getStartDate() : "" %>' />
						</aui:column>
			 		    <aui:column columnWidth="10">
			 		    	<aui:input type="text" name="endDate" label="endDate" style="width:100px;cursor:pointer;" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getEndDate() : "" %>' readonly="true" cssClass="<%= disabled %>" />
			 		    	<aui:input type="hidden" name="endDateIni" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getEndDate() : "" %>' />
			 		    </aui:column>			 		     
			 		    <aui:column columnWidth="25" last="true">
			 		    	<aui:input type="textarea" name="comments" label="Comments" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getComments() : "" %>' cssClass="<%= disabled %>" />
			 		    </aui:column>			 		    
			 		    <aui:button-row style="text-align:center; width:100%;" >
							<aui:button type="submit" value="submit" cssClass="<%= disabled %>" /> 
			    		</aui:button-row>			    				 		    
			 		</aui:layout>
			 	</aui:fieldset>
			</form>
			<c:if test="<%= notaGastoId > 0 %>">
							
				<% List<LineaGasto> parsListV = (List<LineaGasto>)LineaGastoLocalServiceUtil.getNotaGastoLineaGastos(notaGastoId); %>
				<%!
					com.liferay.portal.kernel.dao.search.SearchContainer<LineaGasto> searchContainer = null;
				%>
			<liferay-ui:search-container curParam="depVCur" delta="50" emptyResultsMessage="no-any-expenses-lines" iteratorURL="<%= portletURLPaV %>">
			    <liferay-ui:search-container-results>	    
			    <% 	results = ListUtil.subList(parsListV, searchContainer.getStart(), searchContainer.getEnd());
			        total = parsListV.size();
			        pageContext.setAttribute("results", results);
			    	pageContext.setAttribute("total", total);
			    %>
			    </liferay-ui:search-container-results>
			
			    <liferay-ui:search-container-row 
			    	className="es.davinciti.liferay.model.LineaGasto"
			        keyProperty="lineagastoId"
			        modelVar="lineaV" escapedModel="<%= true %>"
			    >
			    	<portlet:renderURL var="editLineaGastoURL">
						<portlet:param name="jspPage" value="/html/lineagastos/edit.jsp" />
						<portlet:param name="lineaGastoId" value="<%= String.valueOf(lineaV.getLineagastoId()) %>" />
						<portlet:param name="notaGastoId" value="<%= String.valueOf(notaGastoId) %>" />
						<portlet:param name="backURL" value="<%= themeDisplay.getURLCurrent() %>" />
						<portlet:param name="firstTime" value="1" />
						<portlet:param name="vista" value="V" />
		    		</portlet:renderURL>		    
			    	
				    <liferay-ui:search-container-column-text
						name="import"
						value="<%= lineaV.getAmount() %>"
						href="<%= editLineaGastoURL.toString() %>"					
					/>
				    
				    <liferay-ui:search-container-column-text
						name="date"
						value="<%= lineaV.getDate() %>"
						
					/>			    	
					
					<% String docName = "";
				    try {
				    	docName = DLFileEntryLocalServiceUtil.getFileEntry(Long.parseLong(lineaV.getDocumentId())).getTitle();
				    } catch(Exception e) { }
				    
				    %>
					<liferay-ui:search-container-column-text
						name="document"
						value='<%= docName %>'
					/>
					
					<liferay-ui:search-container-column-text
						name="Comments"
						value='<%= lineaV.getComments() %>'
					/>
					<% String paymodeName = "";
					try {
						paymodeName = LineaGastoPayModeLocalServiceUtil.getLineaGastoLineaGastoPayModes(lineaV.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%> 
					<liferay-ui:search-container-column-text
						name="Paymode"
						value="<%= paymodeName %>"
					/>			        
					
					<% String currencyName = "";
					try {
						currencyName = CurrencyLocalServiceUtil.getLineaGastoCurrencies(lineaV.getLineagastoId()).get(0).getCcyName();	
					} catch(Exception e) { }
					%>
					<liferay-ui:search-container-column-text
						name="Currency"
						value="<%= currencyName %>"
					/>
					
					<% String familyName = "";
					try {
						familyName = LineaGastoFamiliaLocalServiceUtil.getLineaGastoLineaGastoFamilias(lineaV.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%>					 
					<liferay-ui:search-container-column-text
						name="family"
						value="<%= familyName %>"
					/>
					
					<% String categoryName = "";
					try {
						categoryName = LineaGastoCategoriaLocalServiceUtil.getLineaGastoLineaGastoCategorias(lineaV.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%>
					<liferay-ui:search-container-column-text
						name="category"
						value="<%= categoryName %>"
					/>
					
					<% String clientName = "";
					try {
						clientName = LineaGastoClienteLocalServiceUtil.getLineaGastoLineaGastoClientes(lineaV.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%> 
					<liferay-ui:search-container-column-text
						name="client"
						value="<%= clientName %>"
					/>	        
					
					<% String projectName = "";
					try {
						projectName = LineaGastoProyectoLocalServiceUtil.getLineaGastoLineaGastoProyectos(lineaV.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%> 					
					<liferay-ui:search-container-column-text
						name="project"
						value="<%= projectName %>"
					/>        
					
					<liferay-ui:search-container-column-jsp
						align="right"
						path="/html/lineagastos/actions.jsp"
					/>					
			        
			    </liferay-ui:search-container-row>	    
			
			    <liferay-ui:search-iterator />
			</liferay-ui:search-container>
		
			<aui:button-row style="width:100%; text-align:center;">	
			    <aui:button onClick="<%=addLineaGastoURL.toString() %>" value="new-expense-line" cssClass="<%= disabled %>" />
			</aui:button-row>
				
			</c:if>
		</div>		
	</div>	
</div>

<div id="Departamento" class="tabcontent">	
	<div style="width:100%;" >		
		<div id="full" >			
			<liferay-ui:header backLabel="back" title="back" backURL="<%= backURL %>" />
			<form method="post" action="<%= editNotaGastoURL.toString() %>" id="notaGastoForm" name="notaGastoForm">
				<aui:input type="hidden" name="nostagastoId" value="<%= notaGastoId %>" />
				<aui:input type="hidden" name="companyId" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getCompanyId() : "" %>' />
				<aui:input type="hidden" name="userId" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getUserId() : "" %>' />
				<aui:input type="hidden" name="date" value='<%= dateFormat.format(new Date())  %>' />
				<aui:input type="hidden" name="backURL" value='<%= backURL  %>' />
				<aui:input type="hidden" name="vista" value='<%= vista  %>' />
				<aui:fieldset label="expenses-note-data">
					<aui:layout>		
						<aui:column columnWidth="10" first="true">			 		    	
			 		     	<aui:input type="text" name="amount" label="total-amount" style="width:100px;" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getAmount() : "" %>' readonly="true" />			 		     			 		     
			 		    </aui:column> 		    	
			 		    <aui:column columnWidth="15">
			 		    	<aui:select name="organizationId" label="Organization" style="width:210px;" cssClass="<%= disabled %>" >
								<% List<Organization> userOrganizations = OrganizationLocalServiceUtil.getUserOrganizations(userId);
								for (Organization userOrganization : userOrganizations) { %>
									<aui:option value="<%=userOrganization.getOrganizationId()%>" ><%=userOrganization.getName()%></aui:option>
											
								<% 	List<Organization> userSubOrganizations = OrganizationLocalServiceUtil.getSuborganizations(companyId, userOrganization.getOrganizationId()); 
									for (Organization userSubOrganization : userSubOrganizations) { %>
									<aui:option value="<%=userSubOrganization.getOrganizationId()%>" ><%=userSubOrganization.getName()%></aui:option>
								<% } 
								} %>
							</aui:select>
			 		    </aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="description" label="Description" style="width:270px;" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getDescription() : "" %>' cssClass="<%= disabled %>" />
			 		    </aui:column> 		    
			 		    <aui:column columnWidth="10">										 		    		 		    	
			 		    	<aui:input type="text" name="startDate" label="startDate" style="width:100px;cursor:pointer;" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getStartDate() : "" %>' readonly="true" cssClass="<%= disabled %>" />			 		    	
			 		    	<aui:input type="hidden" name="startDateIni" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getStartDate() : "" %>' />
						</aui:column>
			 		    <aui:column columnWidth="10">
			 		    	<aui:input type="text" name="endDate" label="endDate" style="width:100px;cursor:pointer;" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getEndDate() : "" %>' readonly="true" cssClass="<%= disabled %>" />
			 		    	<aui:input type="hidden" name="endDateIni" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getEndDate() : "" %>' />
			 		    </aui:column>			 		     
			 		    <aui:column columnWidth="25" last="true">
			 		    	<aui:input type="textarea" name="comments" label="Comments" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getComments() : "" %>' cssClass="<%= disabled %>" />
			 		    </aui:column>			 		    
			 		    <aui:button-row style="text-align:center; width:100%;" >
							<aui:button type="submit" value="submit" cssClass="<%= disabled %>" /> 
			    		</aui:button-row>			    				 		    
			 		</aui:layout>
			 	</aui:fieldset>
			</form>
			<c:if test="<%= notaGastoId > 0 %>">
							
				<% List<LineaGasto> parsListD = (List<LineaGasto>)LineaGastoLocalServiceUtil.getNotaGastoLineaGastos(notaGastoId); %>
				
			<liferay-ui:search-container curParam="depCur" delta="50" emptyResultsMessage="no-any-expenses-lines" iteratorURL="<%= portletURLPaD %>">
			    <liferay-ui:search-container-results>	    
			    <% 	results = ListUtil.subList(parsListD, searchContainer.getStart(), searchContainer.getEnd());
			        total = parsListD.size();
			        pageContext.setAttribute("results", results);
			    	pageContext.setAttribute("total", total);
			    %>
			    </liferay-ui:search-container-results>
			
			    <liferay-ui:search-container-row 
			    	className="es.davinciti.liferay.model.LineaGasto"
			        keyProperty="lineagastoId"
			        modelVar="lineaD" escapedModel="<%= true %>"
			    >
			    	<portlet:renderURL var="editLineaGastoURL">
						<portlet:param name="jspPage" value="/html/lineagastos/edit.jsp" />
						<portlet:param name="lineaGastoId" value="<%= String.valueOf(lineaD.getLineagastoId()) %>" />
						<portlet:param name="notaGastoId" value="<%= String.valueOf(notaGastoId) %>" />
						<portlet:param name="backURL" value="<%= themeDisplay.getURLCurrent() %>" />
						<portlet:param name="firstTime" value="1" />
						<portlet:param name="vista" value="D" />
		    		</portlet:renderURL>		    
			    	
				    <liferay-ui:search-container-column-text
						name="import"
						value="<%= lineaD.getAmount() %>"
						href="<%= editLineaGastoURL.toString() %>"					
					/>
				    
				    <liferay-ui:search-container-column-text
						name="date"
						value="<%= lineaD.getDate() %>"
						
					/>			    	
					
					<% String docName = "";
				    try {
				    	docName = DLFileEntryLocalServiceUtil.getFileEntry(Long.parseLong(lineaD.getDocumentId())).getTitle();
				    } catch(Exception e) { }
				    
				    %>
					<liferay-ui:search-container-column-text
						name="document"
						value='<%= docName %>'
					/>
					
					<liferay-ui:search-container-column-text
						name="Comments"
						value='<%= lineaD.getComments() %>'
					/>
					<% String paymodeName = "";
					try {
						paymodeName = LineaGastoPayModeLocalServiceUtil.getLineaGastoLineaGastoPayModes(lineaD.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%> 
					<liferay-ui:search-container-column-text
						name="Paymode"
						value="<%= paymodeName %>"
					/>			        
					
					<% String currencyName = "";
					try {
						currencyName = CurrencyLocalServiceUtil.getLineaGastoCurrencies(lineaD.getLineagastoId()).get(0).getCcyName();	
					} catch(Exception e) { }
					%>
					<liferay-ui:search-container-column-text
						name="Currency"
						value="<%= currencyName %>"
					/>
					
					<% String familyName = "";
					try {
						familyName = LineaGastoFamiliaLocalServiceUtil.getLineaGastoLineaGastoFamilias(lineaD.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%>					 
					<liferay-ui:search-container-column-text
						name="family"
						value="<%= familyName %>"
					/>
					
					<% String categoryName = "";
					try {
						categoryName = LineaGastoCategoriaLocalServiceUtil.getLineaGastoLineaGastoCategorias(lineaD.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%>
					<liferay-ui:search-container-column-text
						name="category"
						value="<%= categoryName %>"
					/>
					
					<% String clientName = "";
					try {
						clientName = LineaGastoClienteLocalServiceUtil.getLineaGastoLineaGastoClientes(lineaD.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%> 
					<liferay-ui:search-container-column-text
						name="client"
						value="<%= clientName %>"
					/>	        
					
					<% String projectName = "";
					try {
						projectName = LineaGastoProyectoLocalServiceUtil.getLineaGastoLineaGastoProyectos(lineaD.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%> 					
					<liferay-ui:search-container-column-text
						name="project"
						value="<%= projectName %>"
					/>        
					
					<liferay-ui:search-container-column-jsp
						align="right"
						path="/html/lineagastos/actions.jsp"
					/>					
			        
			    </liferay-ui:search-container-row>	    
			
			    <liferay-ui:search-iterator />
			</liferay-ui:search-container>
		
			<aui:button-row style="width:100%; text-align:center;">	
			    <aui:button onClick="<%=addLineaGastoURL.toString() %>" value="new-expense-line" cssClass="<%= disabled %>" />
			</aui:button-row>
				
			</c:if>
		</div>		
	</div>	
</div>

<div id="UsuarioHist" class="tabcontent">
	<div style="width:100%;" >
		<div id="full" >		
			<liferay-ui:header backLabel="back" title="back" backURL="<%= backURL %>" />
			<form method="post" action="<%= editNotaGastoURL.toString() %>" id="notaGastoForm" name="notaGastoForm">
				<aui:input type="hidden" name="nostagastoId" value="<%= notaGastoId %>" />
				<aui:input type="hidden" name="companyId" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getCompanyId() : "" %>' />
				<aui:input type="hidden" name="userId" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getUserId() : "" %>' />
				<aui:input type="hidden" name="date" value='<%= dateFormat.format(new Date())  %>' />
				<aui:input type="hidden" name="backURL" value='<%= backURL  %>' />
				<aui:input type="hidden" name="vista" value='<%= vista  %>' />
				<aui:fieldset label="expenses-note-data">
					<aui:layout>		
						<aui:column columnWidth="10" first="true">			 		    	
			 		     	<aui:input type="text" name="amount" label="total-amount" style="width:100px;" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getAmount() : "" %>' readonly="true" />			 		     			 		     
			 		    </aui:column> 		    	
			 		    <aui:column columnWidth="15">
			 		    	<aui:select name="organizationId" label="Organization" style="width:210px;" cssClass="<%= disabled %>" >
								<% List<Organization> userOrganizations = OrganizationLocalServiceUtil.getUserOrganizations(userId);
								for (Organization userOrganization : userOrganizations) { %>
									<aui:option value="<%=userOrganization.getOrganizationId()%>" ><%=userOrganization.getName()%></aui:option>
											
								<% 	List<Organization> userSubOrganizations = OrganizationLocalServiceUtil.getSuborganizations(companyId, userOrganization.getOrganizationId()); 
									for (Organization userSubOrganization : userSubOrganizations) { %>
									<aui:option value="<%=userSubOrganization.getOrganizationId()%>" ><%=userSubOrganization.getName()%></aui:option>
								<% } 
								} %>
							</aui:select>
			 		    </aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="description" label="Description" style="width:270px;" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getDescription() : "" %>' cssClass="<%= disabled %>" />
			 		    </aui:column> 		    
			 		    <aui:column columnWidth="10">										 		    		 		    	
			 		    	<aui:input type="text" name="startDate" label="startDate" style="width:100px;cursor:pointer;" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getStartDate() : "" %>' readonly="true" cssClass="<%= disabled %>" />			 		    	
			 		    	<aui:input type="hidden" name="startDateIni" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getStartDate() : "" %>' />
						</aui:column>
			 		    <aui:column columnWidth="10">
			 		    	<aui:input type="text" name="endDate" label="endDate" style="width:100px;cursor:pointer;" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getEndDate() : "" %>' readonly="true" cssClass="<%= disabled %>" />
			 		    	<aui:input type="hidden" name="endDateIni" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getEndDate() : "" %>' />
			 		    </aui:column>			 		     
			 		    <aui:column columnWidth="25" last="true">
			 		    	<aui:input type="textarea" name="comments" label="Comments" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getComments() : "" %>' cssClass="<%= disabled %>" />
			 		    </aui:column>			 		    
			 		    <aui:button-row style="text-align:center; width:100%;" >
							<aui:button type="submit" value="submit" cssClass="<%= disabled %>" /> 
			    		</aui:button-row>			    				 		    
			 		</aui:layout>
			 	</aui:fieldset>
			</form>
			<c:if test="<%= notaGastoId > 0 %>">
				<% if(SessionErrors.contains(renderRequest.getPortletSession(),"lineaGasto-add-error")){%>
					<liferay-ui:error key="lineaGasto-add-error" message="lineaGasto-add-error" />
				<%} %>
				<% if(SessionErrors.contains(renderRequest.getPortletSession(),"lineaGasto-edit-error")){%>
					<liferay-ui:error key="lineaGasto-edit-error" message="lineaGasto-edit-error" />
				<%} %>
				<% if(SessionErrors.contains(renderRequest.getPortletSession(),"lineaGasto-delete-error")){%>
					<liferay-ui:error key="lineaGasto-delete-error" message="lineaGasto-delete-error" />
				<%} %>
				<% if(SessionMessages.contains(renderRequest.getPortletSession(),"lineaGasto-add-success")) {%>
					<liferay-ui:success key="lineaGasto-add-success" message="lineaGasto-add-success" />
				<%} %>
				<% if(SessionMessages.contains(renderRequest.getPortletSession(),"lineaGasto-edit-success")) {%>
					<liferay-ui:success key="lineaGasto-edit-success" message="lineaGasto-edit-success" />
				<%} %>
				<% if(SessionMessages.contains(renderRequest.getPortletSession(),"lineaGasto-delete-success")) {%>
					<liferay-ui:success key="lineaGasto-delete-success" message="lineaGasto-delete-success" />
				<%} %>
				
				<% List<LineaGasto> parsListH = (List<LineaGasto>)LineaGastoLocalServiceUtil.getNotaGastoLineaGastos(notaGastoId); %>
				
			<liferay-ui:search-container curParam="historicCur" delta="50" emptyResultsMessage="no-any-expenses-lines" iteratorURL="<%= portletURLPaH %>">
			    <liferay-ui:search-container-results>	    
			    <% 	results = ListUtil.subList(parsListH, searchContainer.getStart(), searchContainer.getEnd());
			        total = parsListH.size();
			        pageContext.setAttribute("results", results);
			    	pageContext.setAttribute("total", total);
			    %>
			    </liferay-ui:search-container-results>
			
			    <liferay-ui:search-container-row 
			    	className="es.davinciti.liferay.model.LineaGasto"
			        keyProperty="lineagastoId"
			        modelVar="linea" escapedModel="<%= true %>"
			    >
			    	<portlet:renderURL var="editLineaGastoURL">
						<portlet:param name="jspPage" value="/html/lineagastos/edit.jsp" />
						<portlet:param name="lineaGastoId" value="<%= String.valueOf(linea.getLineagastoId()) %>" />
						<portlet:param name="notaGastoId" value="<%= String.valueOf(notaGastoId) %>" />
						<portlet:param name="backURL" value="<%= themeDisplay.getURLCurrent() %>" />
						<portlet:param name="firstTime" value="1" />
						<portlet:param name="vista" value="H" />
		    		</portlet:renderURL>		    
			    	
				    <liferay-ui:search-container-column-text
						name="import"
						value="<%= linea.getAmount() %>"
						href="<%= editLineaGastoURL.toString() %>"					
					/>
				    
				    <liferay-ui:search-container-column-text
						name="date"
						value="<%= linea.getDate() %>"
						
					/>			    	
					
					<% String docName = "";
				    try {
				    	docName = DLFileEntryLocalServiceUtil.getFileEntry(Long.parseLong(linea.getDocumentId())).getTitle();
				    } catch(Exception e) { }
				    
				    %>
					<liferay-ui:search-container-column-text
						name="document"
						value='<%= docName %>'
					/>
					
					<liferay-ui:search-container-column-text
						name="Comments"
						value='<%= linea.getComments() %>'
					/>
					<% String paymodeName = "";
					try {
						paymodeName = LineaGastoPayModeLocalServiceUtil.getLineaGastoLineaGastoPayModes(linea.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%> 
					<liferay-ui:search-container-column-text
						name="Paymode"
						value="<%= paymodeName %>"
					/>			        
					
					<% String currencyName = "";
					try {
						currencyName = CurrencyLocalServiceUtil.getLineaGastoCurrencies(linea.getLineagastoId()).get(0).getCcyName();	
					} catch(Exception e) { }
					%>
					<liferay-ui:search-container-column-text
						name="Currency"
						value="<%= currencyName %>"
					/>
					
					<% String familyName = "";
					try {
						familyName = LineaGastoFamiliaLocalServiceUtil.getLineaGastoLineaGastoFamilias(linea.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%>					 
					<liferay-ui:search-container-column-text
						name="family"
						value="<%= familyName %>"
					/>
					
					<% String categoryName = "";
					try {
						categoryName = LineaGastoCategoriaLocalServiceUtil.getLineaGastoLineaGastoCategorias(linea.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%>
					<liferay-ui:search-container-column-text
						name="category"
						value="<%= categoryName %>"
					/>
					
					<% String clientName = "";
					try {
						clientName = LineaGastoClienteLocalServiceUtil.getLineaGastoLineaGastoClientes(linea.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%> 
					<liferay-ui:search-container-column-text
						name="client"
						value="<%= clientName %>"
					/>	        
					
					<% String projectName = "";
					try {
						projectName = LineaGastoProyectoLocalServiceUtil.getLineaGastoLineaGastoProyectos(linea.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%> 					
					<liferay-ui:search-container-column-text
						name="project"
						value="<%= projectName %>"
					/>        
					
					<liferay-ui:search-container-column-jsp
						align="right"
						path="/html/lineagastos/actions.jsp"
					/>					
			        
			    </liferay-ui:search-container-row>	    
			
			    <liferay-ui:search-iterator />
			</liferay-ui:search-container>
		
			<aui:button-row style="width:100%; text-align:center;">	
			    <aui:button onClick="<%=addLineaGastoURL.toString() %>" value="new-expense-line" cssClass="<%= disabled %>" />
			</aui:button-row>
				
			</c:if>
		</div>		
	</div>	
</div>

<div id="Usuario" class="tabcontent">
	<div style="width:100%;" >
		<div id="full" >
			<liferay-ui:header backLabel="back" title="back" backURL="<%= backURL %>" />
			<form method="post" action="<%= editNotaGastoURL.toString() %>" id="notaGastoForm" name="notaGastoForm">
				<aui:input type="hidden" name="nostagastoId" value="<%= notaGastoId %>" />
				<aui:input type="hidden" name="companyId" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getCompanyId() : "" %>' />
				<aui:input type="hidden" name="userId" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getUserId() : "" %>' />
				<aui:input type="hidden" name="date" value='<%= dateFormat.format(new Date())  %>' />
				<aui:input type="hidden" name="backURL" value='<%= backURL  %>' />
				<aui:input type="hidden" name="vista" value='<%= vista  %>' />
				<aui:fieldset label="expenses-note-data">
					<aui:layout>		
						<aui:column columnWidth="10" first="true">			 		    	
			 		     	<aui:input type="text" name="amount" label="total-amount" style="width:100px;" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getAmount() : "" %>' readonly="true" />			 		     			 		     
			 		    </aui:column> 		    	
			 		    <aui:column columnWidth="15">
			 		    	<aui:select name="organizationId" label="Organization" style="width:210px;">
								<% List<Organization> userOrganizations = OrganizationLocalServiceUtil.getUserOrganizations(userId);
								for (Organization userOrganization : userOrganizations) { %>
									<aui:option value="<%=userOrganization.getOrganizationId()%>" ><%=userOrganization.getName()%></aui:option>
											
								<% 	List<Organization> userSubOrganizations = OrganizationLocalServiceUtil.getSuborganizations(companyId, userOrganization.getOrganizationId()); 
									for (Organization userSubOrganization : userSubOrganizations) { %>
									<aui:option value="<%=userSubOrganization.getOrganizationId()%>" ><%=userSubOrganization.getName()%></aui:option>
								<% } 
								} %>
							</aui:select>
			 		    </aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="description" label="Description" style="width:270px;" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getDescription() : "" %>' />
			 		    </aui:column> 		    
			 		    <aui:column columnWidth="10">										 		    		 		    	
			 		    	<aui:input type="text" name="startDate" label="startDate" style="width:100px;cursor:pointer;" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getStartDate() : "" %>' readonly="true" />			 		    	
			 		    	<aui:input type="hidden" name="startDateIni" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getStartDate() : "" %>' />
						</aui:column>
			 		    <aui:column columnWidth="10">
			 		    	<aui:input type="text" name="endDate" label="endDate" style="width:100px;cursor:pointer;" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getEndDate() : "" %>' readonly="true" />
			 		    	<aui:input type="hidden" name="endDateIni" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getEndDate() : "" %>' />
			 		    </aui:column>			 		     
			 		    <aui:column columnWidth="25" last="true">
			 		    	<aui:input type="textarea" name="comments" label="Comments" value='<%= notaGastoId > 0 ? NotaGastoLocalServiceUtil.getNotaGasto(notaGastoId).getComments() : "" %>' />
			 		    </aui:column>			 		    
			 		    <aui:button-row style="text-align:center; width:100%;">
							<aui:button type="submit" value="submit"/> 
			    		</aui:button-row>			    				 		    
			 		</aui:layout>
			 	</aui:fieldset>
			</form>
			<c:if test="<%= notaGastoId > 0 %>">
				<% if(SessionErrors.contains(renderRequest.getPortletSession(),"lineaGasto-add-error")){%>
					<liferay-ui:error key="lineaGasto-add-error" message="lineaGasto-add-error" />
				<%} %>
				<% if(SessionErrors.contains(renderRequest.getPortletSession(),"lineaGasto-edit-error")){%>
					<liferay-ui:error key="lineaGasto-edit-error" message="lineaGasto-edit-error" />
				<%} %>
				<% if(SessionErrors.contains(renderRequest.getPortletSession(),"lineaGasto-delete-error")){%>
					<liferay-ui:error key="lineaGasto-delete-error" message="lineaGasto-delete-error" />
				<%} %>
				<% if(SessionMessages.contains(renderRequest.getPortletSession(),"lineaGasto-add-success")) {%>
					<liferay-ui:success key="lineaGasto-add-success" message="lineaGasto-add-success" />
				<%} %>
				<% if(SessionMessages.contains(renderRequest.getPortletSession(),"lineaGasto-edit-success")) {%>
					<liferay-ui:success key="lineaGasto-edit-success" message="lineaGasto-edit-success" />
				<%} %>
				<% if(SessionMessages.contains(renderRequest.getPortletSession(),"lineaGasto-delete-success")) {%>
					<liferay-ui:success key="lineaGasto-delete-success" message="lineaGasto-delete-success" />
				<%} %>
				
				<% List<LineaGasto> parsList = (List<LineaGasto>)LineaGastoLocalServiceUtil.getNotaGastoLineaGastos(notaGastoId); %>
				<%!
					//com.liferay.portal.kernel.dao.search.SearchContainer<LineaGasto> searchContainer = null;
				%>
			<liferay-ui:search-container curParam="notesCur" delta="50" emptyResultsMessage="no-any-expenses-lines" iteratorURL="<%= portletURLPa %>">
			    <liferay-ui:search-container-results>	    
			    <% 	results = ListUtil.subList(parsList, searchContainer.getStart(), searchContainer.getEnd());
			        total = parsList.size();
			        pageContext.setAttribute("results", results);
			    	pageContext.setAttribute("total", total);
			    %>
			    </liferay-ui:search-container-results>
			
			    <liferay-ui:search-container-row 
			    	className="es.davinciti.liferay.model.LineaGasto"
			        keyProperty="lineagastoId"
			        modelVar="linea" escapedModel="<%= true %>"
			    >
			    	<portlet:renderURL var="editLineaGastoURL">
						<portlet:param name="jspPage" value="/html/lineagastos/edit.jsp" />
						<portlet:param name="lineaGastoId" value="<%= String.valueOf(linea.getLineagastoId()) %>" />
						<portlet:param name="notaGastoId" value="<%= String.valueOf(notaGastoId) %>" />
						<portlet:param name="backURL" value="<%= themeDisplay.getURLCurrent() %>" />
						<portlet:param name="firstTime" value="1" />
						<portlet:param name="vista" value="U" />
		    		</portlet:renderURL>		    
			    	
				    <liferay-ui:search-container-column-text
						name="import"
						value="<%= linea.getAmount() %>"
						href="<%= editLineaGastoURL.toString() %>"					
					/>
				    
				    <liferay-ui:search-container-column-text
						name="date"
						value="<%= linea.getDate() %>"
						
					/>			    	
					
					<% String docName = "";
				    try {
				    	docName = DLFileEntryLocalServiceUtil.getFileEntry(Long.parseLong(linea.getDocumentId())).getTitle();
				    } catch(Exception e) { }
				    
				    %>
					<liferay-ui:search-container-column-text
						name="document"
						value='<%= docName %>'
					/>
					
					<liferay-ui:search-container-column-text
						name="Comments"
						value='<%= linea.getComments() %>'
					/>
					<% String paymodeName = "";
					try {
						paymodeName = LineaGastoPayModeLocalServiceUtil.getLineaGastoLineaGastoPayModes(linea.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%> 
					<liferay-ui:search-container-column-text
						name="Paymode"
						value="<%= paymodeName %>"
					/>			        
					
					<% String currencyName = "";
					try {
						currencyName = CurrencyLocalServiceUtil.getLineaGastoCurrencies(linea.getLineagastoId()).get(0).getCcyName();	
					} catch(Exception e) { }
					%>
					<liferay-ui:search-container-column-text
						name="Currency"
						value="<%= currencyName %>"
					/>
					
					<% String familyName = "";
					try {
						familyName = LineaGastoFamiliaLocalServiceUtil.getLineaGastoLineaGastoFamilias(linea.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%>					 
					<liferay-ui:search-container-column-text
						name="family"
						value="<%= familyName %>"
					/>
					
					<% String categoryName = "";
					try {
						categoryName = LineaGastoCategoriaLocalServiceUtil.getLineaGastoLineaGastoCategorias(linea.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%>
					<liferay-ui:search-container-column-text
						name="category"
						value="<%= categoryName %>"
					/>
					
					<% String clientName = "";
					try {
						clientName = LineaGastoClienteLocalServiceUtil.getLineaGastoLineaGastoClientes(linea.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%> 
					<liferay-ui:search-container-column-text
						name="client"
						value="<%= clientName %>"
					/>	        
					
					<% String projectName = "";
					try {
						projectName = LineaGastoProyectoLocalServiceUtil.getLineaGastoLineaGastoProyectos(linea.getLineagastoId()).get(0).getName();
					} catch(Exception e) { }
					%> 					
					<liferay-ui:search-container-column-text
						name="project"
						value="<%= projectName %>"
					/>        
					
					<liferay-ui:search-container-column-jsp
						align="right"
						path="/html/lineagastos/actions.jsp"
					/>					
			        
			    </liferay-ui:search-container-row>	    
			
			    <liferay-ui:search-iterator />
			</liferay-ui:search-container>
		
			<aui:button-row style="width:100%; text-align:center;">	
			    <aui:button onClick="<%=addLineaGastoURL.toString() %>" value="new-expense-line" />
			</aui:button-row>
				
			</c:if>
		</div>
	</div>
</div>

<c:set var="locale"><%= themeDisplay.getLocale().toString().split("_")[0] %></c:set>
<c:set var="startDateError"><%= LanguageUtil.get(themeDisplay.getLocale(), "start-date-error") %></c:set>
<c:set var="endDateError"><%= LanguageUtil.get(themeDisplay.getLocale(), "end-date-error") %></c:set>
					
<aui:script>

	AUI().use('aui-base', 'aui-node', function(A) {
		
		A.one("#<portlet:namespace/>startDate").on('change',function() {
			var startDate = A.one("#<portlet:namespace/>startDate").val();
			var endDate = A.one("#<portlet:namespace/>endDate").val();
			if (startDate != "") startDate = new Date(startDate.split("/")[2]+"-"+startDate.split("/")[1]+"-"+startDate.split("/")[0])
			if (endDate != "") endDate = new Date(endDate.split("/")[2]+"-"+endDate.split("/")[1]+"-"+endDate.split("/")[0])
			alert("start date es menor? : "+(startDate<endDate)+" - es mayor? : "+(startDate>endDate)+" - son iguales? : "+(startDate==endDate));
			
			if (startDate > endDate) alert("${startDateError}");
		});
		
		A.one("#<portlet:namespace/>endDate").on('change',function(){
			var startDate = A.one("#<portlet:namespace/>startDate").val();
			var endDate = A.one("#<portlet:namespace/>endDate").val();
			
			//alert("endDate change - start : "+startDate+" - end : "+endDate);
		});
		
	});

	YUI({lang: '${locale}'}).use('aui-datepicker', 'event', 'node-event-simulate', function(Y) {
		new Y.DatePicker({
			trigger: '#<portlet:namespace/>startDate',
			mask: '%d/%m/%Y',
		    popover: {
		    	zIndex: 1
		    },
		    on: {
		    	selectionChange: function(event) {
		    		event.preventDefault();
		    		//Y.one("#<portlet:namespace/>startDate").simulate('change');
		    		var startDate = new Date(event.newSelection); 
					var endDate = Y.one("#<portlet:namespace/>endDate").val();
					var startDateIni = Y.one("#<portlet:namespace/>startDateIni").val();
					//if (startDate != "") startDate = new Date(startDate.split("/")[2]+"-"+startDate.split("/")[1]+"-"+startDate.split("/")[0])
					if (endDate != "") endDate = new Date(endDate.split("/")[2]+"-"+endDate.split("/")[1]+"-"+endDate.split("/")[0])
					//alert("startDate : "+startDate+" - enDate : "+endDate);
					//alert("start date es menor? : "+(startDate<endDate)+" - es mayor? : "+(startDate>endDate)+" - son iguales? : "+(startDate==endDate));
					if (startDate > endDate) {
						alert("${startDateError}");
						Y.one("#<portlet:namespace/>startDate").val(startDateIni);	
					} else  { 
						var day = startDate.getDate() >= 10 ? startDate.getDate() : "0"+startDate.getDate(); 
						var month = (startDate.getMonth()+1) >= 10 ? (startDate.getMonth()+1) : "0"+(startDate.getMonth()+1); 
						var newDate = day + "/" + month + "/" + startDate.getFullYear();
						Y.one("#<portlet:namespace/>startDate").val(newDate);
						Y.one("#<portlet:namespace/>startDateIni").val(newDate);
					}
		    	}
		    }
		});
	});
	
	YUI({lang: '${locale}'}).use('aui-datepicker', 'event', function(Y) {
		new Y.DatePicker({
			trigger: '#<portlet:namespace/>endDate',
			mask: '%d/%m/%Y',
		    popover: {
		    	zIndex: 1
		    },
		    on: {
		    	selectionChange: function(event) {
		    		event.preventDefault();
		    		//Y.one("#<portlet:namespace/>startDate").simulate('change');
		    		var startDate =  Y.one("#<portlet:namespace/>startDate").val();
					var endDate = new Date(event.newSelection);
					var endDateIni = Y.one("#<portlet:namespace/>endDateIni").val();
					//if (startDate != "") startDate = new Date(startDate.split("/")[2]+"-"+startDate.split("/")[1]+"-"+startDate.split("/")[0])
					if (startDate != "") startDate = new Date(startDate.split("/")[2]+"-"+startDate.split("/")[1]+"-"+startDate.split("/")[0])
					//alert("startDate : "+startDate+" - enDate : "+endDate);
					//alert("start date es menor? : "+(startDate<endDate)+" - es mayor? : "+(startDate>endDate)+" - son iguales? : "+(startDate==endDate));
					if (endDate < startDate) {
						alert("${endDateError}");
						Y.one("#<portlet:namespace/>endDate").val(endDateIni);	
					} else  { 
						var day = endDate.getDate() >= 10 ? endDate.getDate() : "0"+endDate.getDate(); 
						var month = (endDate.getMonth()+1) >= 10 ? (endDate.getMonth()+1) : "0"+(endDate.getMonth()+1); 
						var newDate = day + "/" + month + "/" + endDate.getFullYear();
						Y.one("#<portlet:namespace/>endDate").val(newDate);
						Y.one("#<portlet:namespace/>endDateIni").val(newDate);
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
	});

</script>