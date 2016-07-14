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
<%@ page import="com.liferay.portal.kernel.dao.orm.*"%>
<%@ page import="com.liferay.portal.kernel.bean.PortletBeanLocatorUtil"%>

<%@ page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@ page import="com.liferay.portal.kernel.util.*"%>

<script src="//code.jquery.com/jquery-1.10.2.js"></script>

<portlet:defineObjects />

<% ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY); 
long userId = themeDisplay.getUserId();
long companyId = themeDisplay.getCompanyId();
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
long groupId = GroupLocalServiceUtil.getGroup(companyId, Constants.USUARIO_GUEST).getGroupId();
boolean isAdmin = UserGroupRoleLocalServiceUtil.hasUserGroupRole(userId, groupId, Constants.USUARIO_ADMINISTRADOR_ROLE);
boolean isValidad = UserGroupRoleLocalServiceUtil.hasUserGroupRole(userId, groupId, Constants.USUARIO_VALIDADOR_ROLE);
String backURL = ParamUtil.getString(request, "backURL");
long notagastoId = ParamUtil.getLong(request, "notaGastoId", 0);
String vista = ParamUtil.getString(request, "vista", "U");
ClassLoader classLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),"portletClassLoader");
DynamicQuery dqh = DynamicQueryFactoryUtil.forClass(NotaGasto.class, classLoader).addOrder(OrderFactoryUtil.asc("companyId"));
Junction conjunctionH = RestrictionsFactoryUtil.conjunction();
conjunctionH.add(RestrictionsFactoryUtil.eq("companyId", companyId));
conjunctionH.add(RestrictionsFactoryUtil.eq("userId", userId));
dqh.add(conjunctionH);
List<NotaGasto> parsListH = new ArrayList<NotaGasto>();
try {
	parsListH = NotaGastoLocalServiceUtil.dynamicQuery(dqh);
} catch(Exception e) { }
PortletURL portletURLPaH = renderResponse.createRenderURL();
//System.out.println("lineagasto add.jsp - companyId : "+companyId+" - vista : "+vista);
%>

<portlet:actionURL var="addLineaGastoURL" name="addLineaGasto" windowState="normal" />

<ul class="tab">	
  <c:if test="<%= isAdmin || isValidad || request.isUserInRole(Constants.ADMINISTRADOR_ROLE) %>">
  	<li><a href="#" id="tabDepartamento" class="tablinks" ><liferay-ui:message key='validate'/></a></li>
  </c:if>
  <li><a href="#" id="tabUsuarioHist" class="tablinks" ><liferay-ui:message key='historial'/></a></li>  
  <li><a href="#" id="tabUsuario" class="tablinks" ><liferay-ui:message key='notas-gastos'/></a></li>  
</ul>

<div id="Departamento" class="tabcontent">	
	<div style="width:100%;" >		
		<div id="full">	
			
		</div>		
	</div>	
</div>

<div id="UsuarioHist" class="tabcontent">
	<div style="width:100%;" >
		<div id="full" >		
			<%!
				com.liferay.portal.kernel.dao.search.SearchContainer<NotaGasto> searchContainer = null;
			%>
			<liferay-ui:search-container id="historicCont" curParam="historicCur" delta="10" emptyResultsMessage="no-any-expenses-notes" iteratorURL="<%= portletURLPaH %>">
			    <liferay-ui:search-container-results>	    
			    <% 	results = ListUtil.subList(parsListH, searchContainer.getStart(), searchContainer.getEnd());
			        total = parsListH.size();
			        pageContext.setAttribute("results", results);
			    	pageContext.setAttribute("total", total);
			    %>
			    </liferay-ui:search-container-results>
			
			    <liferay-ui:search-container-row 
			    	className="es.davinciti.liferay.model.NotaGasto"
			        keyProperty="notagastoId"
			        modelVar="nota" escapedModel="<%= true %>"
			    >
			    	<portlet:renderURL var="editNotaGastoURL">
						<portlet:param name="jspPage" value="/html/notagastos/edit.jsp" />
						<portlet:param name="notaGastoId" value="<%= String.valueOf(nota.getNotagastoId()) %>" />
						<portlet:param name="backURL" value="<%= themeDisplay.getURLCurrent() %>" />
						<portlet:param name="vista" value="H" />
		    		</portlet:renderURL>   		
			    	
				    <liferay-ui:search-container-column-text
						name="Description"
						value="<%= nota.getDescription() %>"
						href="<%= editNotaGastoURL.toString() %>"
					/>
				    
				    <liferay-ui:search-container-column-text
						name="business"
						value="<%= CompanyLocalServiceUtil.getCompany(nota.getCompanyId()).getName() %>"					
					/>	
					
					<liferay-ui:search-container-column-text
						name="Organization"
						value='<%= NotaGastoLocalServiceUtil.getOrganizationsSageCompanies(nota.getNotagastoId()).get(0).getOrganizationId() > 0 ? OrganizationLocalServiceUtil.getOrganization(NotaGastoLocalServiceUtil.getOrganizationsSageCompanies(nota.getNotagastoId()).get(0).getOrganizationId()).getName() : "" %>'
					/>
					
					<liferay-ui:search-container-column-text
						name="startDate"
						value='<%= nota.getStartDate() %>'
					/>
					
					<liferay-ui:search-container-column-text
						name="endDate"
						value="<%= nota.getEndDate() %>"
					/>			        
					
					<liferay-ui:search-container-column-text
						name="import"
						value='<%= nota.getAmount() %>'
					/>
					 
					<liferay-ui:search-container-column-text
						name="Comments"
						value="<%= nota.getComments() %>"
					/>
					
					<liferay-ui:search-container-column-text
						name="createDate"
						value="<%= nota.getCreateDate() %>"
					/>	        
										
					<liferay-ui:search-container-column-text
						name="updateDate"
						value='<%= nota.getUpdateDate() %>'
					/>        
					
					<% String lines = "0";
					try {
						lines = String.valueOf(LineaGastoLocalServiceUtil.getNotaGastoLineaGastosCount(nota.getNotagastoId()));
					} catch(Exception e) { }					
					%>
					
					<liferay-ui:search-container-column-text
						name="expenses-lines-number"
						value='<%= lines %>'
					/>        
					
					<% String status = "";
					try {
						status = ApplicationStatusLocalServiceUtil.getApplicationStatus(Long.parseLong(nota.getStatus())).getName();
					} catch(Exception e) { }					
					%>
					
					<liferay-ui:search-container-column-text
						name="Status"
						value='<%= status %>'
					/>        
					
					<liferay-ui:search-container-column-jsp
						align="right"
						path="/html/notagastos/actionsh.jsp"
					/>					
			        
			    </liferay-ui:search-container-row>	    
			
			    <liferay-ui:search-iterator />
			</liferay-ui:search-container>	
		</div>
	</div>	
</div>

<div id="Usuario" class="tabcontent">
	<div style="width:100%;" >
		<div id="full" >
			<liferay-ui:header backLabel="back" title="back" backURL="<%= backURL %>" />
			<form method="post" action="<%= addLineaGastoURL.toString() %>" id="lineaGastoForm" name="lineaGastoForm" enctype="multipart/form-data">
				<aui:input type="hidden" name="notagastoId" value="<%= notagastoId %>" />
				<aui:input type="hidden" name="backURL" value="<%= backURL %>" />
				<aui:input type="hidden" name="vista" value="<%= vista %>" />
				<aui:fieldset label="new-expenses-note-line-data">
					<aui:layout>			
						<aui:column columnWidth="15" first="true">
						<% List<LineaGastoFamilia> families = new ArrayList<LineaGastoFamilia>();
							try {
								families = LineaGastoFamiliaLocalServiceUtil.findByCompanyId(companyId);	
							} catch(Exception e) { }								
						%>
							<aui:select name="familia" label="family" >
								<aui:option value="0"><liferay-ui:message key='select-option'/></aui:option>
							<% for (LineaGastoFamilia family : families) { %>
								<aui:option value="<%= family.getFamiliaId() %>"><%= family.getName() %></aui:option>	
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
								<aui:option value="<%= client.getClienteId() %>"><%= client.getName() %></aui:option>	
							<% } %>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="15">
							<aui:select name="proyecto" label="project" >
								<aui:option value="0"><liferay-ui:message key='select-option' /></aui:option>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="10">
							<aui:input type="text" name="date" label="date" style="width:100px;cursor:pointer;" readonly="true" />
							<aui:input type="hidden" name="dateIni" />
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
								<aui:option value="<%= paymode.getPaymodeId() %>" ><%= paymode.getName() %></aui:option>
							<% } %>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="10" first="true">
							<div id="changePrice" style="display:none">
								<aui:input type="text" label="price" name="price" value="0" style="width:100px;" >
									<aui:validator name="number" />
								</aui:input>
							</div>
						</aui:column>						
						<aui:column columnWidth="10">
							<div id="needQuantity" style="display:none">
								<aui:input type="text" label="quantity" name="quantity" value="0" style="width:100px;" >
									<aui:validator name="number" />
								</aui:input>
							</div>
						</aui:column>						
						<aui:column columnWidth="10">
							<aui:input type="text" label="import" name="amount" value="0" style="width:100px;" >
								<aui:validator name="number" />
							</aui:input>
						</aui:column>
						<aui:column columnWidth="15">
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
							<aui:select name="currency" label="Currency" style="width:150px;" >
								<aui:option value="0"><liferay-ui:message key='select-option' /></aui:option>			
							<% for (String currencyId : currencies) {
								Currency currency = CurrencyLocalServiceUtil.getCurrency(Long.parseLong(currencyId)); %>
								<aui:option value="<%= currency.getCurrencyId() %>"><%= currency.getCcyName() %></aui:option>	
							<% } %>
							</aui:select>
						</aui:column>										
						<aui:column columnWidth="25">
							<aui:input type="file" name="document" label="Document" />
						</aui:column>
						
						<aui:column columnWidth="30" last="true">
							<aui:input type="textarea" name="comments" label="Comments" />
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
						//alert("categoriesList : "+categoriesList);
						A.one('#<portlet:namespace />categoria').empty();
						A.one('#<portlet:namespace />categoria').append("<option value='0'><liferay-ui:message key='select-option'/></option>");
						for(var i in categoriesList){
			                A.one('#<portlet:namespace />categoria').append("<option value='"+ categoriesList[i].categoriaId +"' >"+categoriesList[i].name+"</option> ");
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
						//alert("categoriesList : "+categoriesList);
						A.one('#<portlet:namespace />proyecto').empty();
						A.one('#<portlet:namespace />proyecto').append("<option value='0'><liferay-ui:message key='select-option'/></option>");
						for(var j in projectsList){
			                A.one('#<portlet:namespace />proyecto').append("<option value='"+ projectsList[j].proyectoId +"' >"+projectsList[j].name+"</option> ");
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
						//alert("categoria success data - price : "+categoria.price+" - categoria changeprice == 1 :"+(parseInt(categoria.changePrice, 10)==1)+" - changePrice : "+categoria.changePrice+" - categoria needquantity == 1 : "+(parseInt(categoria.needQuantity, 10)==1)+" - needQuantity : "+categoria.needQuantity);
						A.one('#<portlet:namespace />amount').val("0");
						A.one('#<portlet:namespace />price').val("0");
						A.one('#<portlet:namespace />quantity').val("0");
						A.one('#<portlet:namespace />price').val(categoria.price);						
						if (parseInt(categoria.changePrice, 10) == 1) A.one('#<portlet:namespace />price').removeClass("disabled-field");
						else A.one('#<portlet:namespace />price').addClass("disabled-field");
						if (parseInt(categoria.needQuantity, 10) == 1) {
							A.one("#needQuantity").show();
							A.one("#changePrice").show();
							A.one('#<portlet:namespace />amount').addClass("disabled-field");
						}
						else {
							A.one("#needQuantity").hide();
							A.one("#changePrice").hide();
							A.one('#<portlet:namespace />amount').removeClass("disabled-field");
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
			A.one("#<portlet:namespace/>amount").val(total.toFixed(2));			
		});
		// Cálculo del Amount cuando cambia Quantity
		A.one("#<portlet:namespace/>quantity").on('change',function(){
			var price = A.one("#<portlet:namespace/>price").val();
			var quantity = A.one("#<portlet:namespace/>quantity").val();
			var total = price * quantity;			
			A.one("#<portlet:namespace/>amount").val(total.toFixed(2));			
		});
		
	});
	
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

<c:set var="vistaG"><%= vista %></c:set>

<script>

	$(document).ready(function() {	
		$(".tab li a").addClass('disabled');
		if ("${vistaG}" == "D") $("#tabDepartamento").trigger("click");
		else if ("${vistaG}" == "H") $("#tabUsuarioHist").trigger("click");
		else $("#tabUsuario").trigger("click");		
	});

</script>