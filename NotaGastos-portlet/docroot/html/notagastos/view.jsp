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

<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="java.util.*" %>
<%@ page import="javax.portlet.*" %>

<%@ page import="es.davinciti.util.Constants" %>

<%@ page import="com.liferay.portal.model.*"%>
<%@ page import="com.liferay.portal.util.*"%>
<%@ page import="com.liferay.portal.service.*"%>
<%@ page import="es.davinciti.liferay.model.*"%>
<%@ page import="es.davinciti.liferay.service.*" %>

<%@ page import="com.liferay.portal.kernel.util.*"%>
<%@ page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@ page import="com.liferay.portal.kernel.bean.PortletBeanLocatorUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.orm.*"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>

<script src="//code.jquery.com/jquery-1.10.2.js"></script>

<portlet:defineObjects />

<% ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY); 
Locale locale = themeDisplay.getLocale();
long userId = themeDisplay.getUserId();
long companyId = themeDisplay.getCompanyId();
String companyName = CompanyLocalServiceUtil.getCompany(companyId).getName(); 
long groupId = GroupLocalServiceUtil.getGroup(companyId, Constants.USUARIO_GUEST).getGroupId();
boolean isAdmin = UserGroupRoleLocalServiceUtil.hasUserGroupRole(userId, groupId, Constants.USUARIO_ADMINISTRADOR_ROLE);
boolean isValidad = UserGroupRoleLocalServiceUtil.hasUserGroupRole(userId, groupId, Constants.USUARIO_VALIDADOR_ROLE);
ClassLoader classLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),"portletClassLoader");
//Validated Notes List
DynamicQuery dqv = DynamicQueryFactoryUtil.forClass(NotaGasto.class, classLoader).addOrder(OrderFactoryUtil.asc("companyId"));
Junction conjunctionV = RestrictionsFactoryUtil.conjunction();
conjunctionV.add(RestrictionsFactoryUtil.eq("companyId", companyId));
dqv.add(conjunctionV);
Junction disjunctionV = RestrictionsFactoryUtil.disjunction();
disjunctionV.add(RestrictionsFactoryUtil.eq("status", "4"));
disjunctionV.add(RestrictionsFactoryUtil.eq("status", "5"));
dqv.add(disjunctionV);
List<NotaGasto> parsListV = new ArrayList<NotaGasto>();
try {
	parsListV = NotaGastoLocalServiceUtil.dynamicQuery(dqv);
} catch(Exception e) { }
PortletURL portletURLPaV = renderResponse.createRenderURL();
// Validate Notes List
DynamicQuery dqd = DynamicQueryFactoryUtil.forClass(NotaGasto.class, classLoader).addOrder(OrderFactoryUtil.asc("companyId"));
Junction conjunctionD = RestrictionsFactoryUtil.conjunction();
conjunctionD.add(RestrictionsFactoryUtil.eq("companyId", companyId));
conjunctionD.add(RestrictionsFactoryUtil.eq("status", "2"));
dqd.add(conjunctionD);
List<NotaGasto> parsListD = new ArrayList<NotaGasto>();
try {
	parsListD = NotaGastoLocalServiceUtil.dynamicQuery(dqd);
} catch(Exception e) { }
PortletURL portletURLPaD = renderResponse.createRenderURL();
// User List
DynamicQuery dq = DynamicQueryFactoryUtil.forClass(NotaGasto.class, classLoader).addOrder(OrderFactoryUtil.asc("companyId"));
Junction conjunction = RestrictionsFactoryUtil.conjunction();
conjunction.add(RestrictionsFactoryUtil.eq("companyId", companyId));
conjunction.add(RestrictionsFactoryUtil.eq("userId", userId));
dq.add(conjunction);
Junction disjunction = RestrictionsFactoryUtil.disjunction();
disjunction.add(RestrictionsFactoryUtil.eq("status", "1"));
disjunction.add(RestrictionsFactoryUtil.eq("status", "3"));
dq.add(disjunction);
List<NotaGasto> parsList = new ArrayList<NotaGasto>();
try {
	parsList = NotaGastoLocalServiceUtil.dynamicQuery(dq);
} catch(Exception e) { }
PortletURL portletURLPa = renderResponse.createRenderURL();
//Historic List
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
String vista = ParamUtil.getString(request, "vista", "");
//System.out.println("notagasto view.jsp - vista : "+vista);
if (vista.contentEquals("")) {
	HttpServletRequest httpReq = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(renderRequest));	 
	try {
		vista = httpReq.getParameter("vista");
	} catch(Exception e) { 
		System.out.println("notagasto view.jsp - vistaURL ERROR : "+e.getMessage());
	}	
	//if (vistaURL.equals(null)) System.out.println("vista null!!");
	//vista = vistaURL;
	//else vista = "U";
}
//System.out.println("notagasto view.jsp - vista final : "+vista);

%>

<portlet:renderURL var="addNotaGastoURL">
	<portlet:param name="jspPage" value="/html/notagastos/add.jsp" />	
	<portlet:param name="backURL" value="<%= themeDisplay.getURLCurrent() %>" />
</portlet:renderURL>       

<ul class="tab">	
  <c:if test="<%= isAdmin || isValidad || request.isUserInRole(Constants.ADMINISTRADOR_ROLE) %>">
  	<li><a href="#" id="tabDepartamentoV" class="tablinks" ><liferay-ui:message key='validated-expenses-notes'/></a></li>
  	<li><a href="#" id="tabDepartamento" class="tablinks" ><liferay-ui:message key='validate'/></a></li>  	
  </c:if>
  <li><a href="#" id="tabUsuarioHist" class="tablinks" ><liferay-ui:message key='historial'/></a></li>  
  <li><a href="#" id="tabUsuario" class="tablinks" ><liferay-ui:message key='notas-gastos'/></a></li>  
</ul>

<aui:input type="hidden" name="vista" value="<%= vista %>" />

<div id="DepartamentoV" class="tabcontent">
	<div style="width:100%;" >
		<div id="full" >
			<liferay-ui:search-container curParam="departVCur" delta="50" emptyResultsMessage="no-any-expenses-notes" iteratorURL="<%= portletURLPaV %>">
			    <liferay-ui:search-container-results>	    
			    <% 	results = ListUtil.subList(parsListV, searchContainer.getStart(), searchContainer.getEnd());
			        total = parsListV.size();
			        pageContext.setAttribute("results", results);
			    	pageContext.setAttribute("total", total);
			    %>
			    </liferay-ui:search-container-results>
				
			    <liferay-ui:search-container-row			    	
			    	className="es.davinciti.liferay.model.NotaGasto"
			        keyProperty="notagastoId"
			        modelVar="notaV" escapedModel="<%= true %>"
			        rowVar="depVRow"			        			        
			    >			    	   		
			    	
			    <% depVRow.setClassName(notaV.getStatus().contentEquals("4") ? "note-css-pending" : "note-css-accounted"); %>
			    
			    	<portlet:renderURL var="editNotaGastoURL">
						<portlet:param name="jspPage" value="/html/notagastos/edit.jsp" />
						<portlet:param name="notaGastoId" value="<%= String.valueOf(notaV.getNotagastoId()) %>" />
						<portlet:param name="backURL" value="<%= themeDisplay.getURLCurrent() %>" />
						<portlet:param name="vista" value="V" />
		    		</portlet:renderURL>
			    	
			    	<liferay-ui:search-container-column-text
						name="Description"
						value="<%= notaV.getDescription() %>"
						href="<%= editNotaGastoURL.toString() %>"											
					/>
				    
				    <liferay-ui:search-container-column-text
						name="business"
						value="<%= CompanyLocalServiceUtil.getCompany(notaV.getCompanyId()).getName() %>"					
					/>	
					
					<liferay-ui:search-container-column-text
						name="Organization"
						value='<%= NotaGastoLocalServiceUtil.getOrganizationsSageCompanies(notaV.getNotagastoId()).get(0).getOrganizationId() > 0 ? OrganizationLocalServiceUtil.getOrganization(NotaGastoLocalServiceUtil.getOrganizationsSageCompanies(notaV.getNotagastoId()).get(0).getOrganizationId()).getName() : "" %>'
					/>
					
					<liferay-ui:search-container-column-text
						name="startDate"
						value='<%= notaV.getStartDate() %>'
					/>
					
					<liferay-ui:search-container-column-text
						name="endDate"
						value="<%= notaV.getEndDate() %>"
					/>			        
					
					<liferay-ui:search-container-column-text
						name="import"
						value='<%= notaV.getAmount() %>'
					/>
					 
					<liferay-ui:search-container-column-text
						name="Comments"
						value="<%= notaV.getComments() %>"
					/>
					
					<liferay-ui:search-container-column-text
						name="createDate"
						value="<%= notaV.getCreateDate() %>"
					/>	        
										
					<liferay-ui:search-container-column-text
						name="updateDate"
						value='<%= notaV.getUpdateDate() %>'
					/>        
					
					<% String lines = "0";
					try {
						lines = String.valueOf(LineaGastoLocalServiceUtil.getNotaGastoLineaGastosCount(notaV.getNotagastoId()));
					} catch(Exception e) { }					
					%>
					
					<liferay-ui:search-container-column-text
						name="expenses-lines-number"
						value='<%= lines %>'
					/>        
					
					<% String status = "";
					try {
						status = LanguageUtil.get(locale, ApplicationStatusLocalServiceUtil.getApplicationStatus(Long.parseLong(notaV.getStatus())).getName()).toUpperCase();
					} catch(Exception e) { }					
					%>
					
					<liferay-ui:search-container-column-text
						name="Status"
						value='<%= status %>'
					/>	
					
					<liferay-ui:search-container-column-jsp
						align="right"
						path="/html/notagastos/actionsv.jsp"
					/>								
			        
			    </liferay-ui:search-container-row>	    
			
			    <liferay-ui:search-iterator />
			</liferay-ui:search-container>
		</div>
	</div>
</div>

<div id="Departamento" class="tabcontent">	
	<div style="width:100%;" >		
		<div id="full" >	
			<% if(SessionErrors.contains(renderRequest.getPortletSession(),"notaGasto-validate-error")){%>
				<liferay-ui:error key="notaGasto-validate-error" message="notaGasto-validate-error" />
			<%} %>
			<% if(SessionErrors.contains(renderRequest.getPortletSession(),"notaGasto-deny-error")){%>
				<liferay-ui:error key="notaGasto-deny-error" message="notaGasto-deny-error" />
			<%} %>
			<% if(SessionMessages.contains(renderRequest.getPortletSession(),"notaGasto-validate-success")) {%>
				<liferay-ui:success key="notaGasto-validate-success" message="notaGasto-validate-success" />
			<%} %>
			<% if(SessionMessages.contains(renderRequest.getPortletSession(),"notaGasto-deny-success")) {%>
				<liferay-ui:success key="notaGasto-deny-success" message="notaGasto-deny-success" />
			<%} %>
			<liferay-ui:search-container curParam="departCur" delta="50" emptyResultsMessage="no-any-expenses-notes" iteratorURL="<%= portletURLPaD %>">
			    <liferay-ui:search-container-results>	    
			    <% 	results = ListUtil.subList(parsListD, searchContainer.getStart(), searchContainer.getEnd());
			        total = parsListD.size();
			        pageContext.setAttribute("results", results);
			    	pageContext.setAttribute("total", total);
			    %>
			    </liferay-ui:search-container-results>		    
				
			    <liferay-ui:search-container-row			    	
			    	className="es.davinciti.liferay.model.NotaGasto"
			        keyProperty="notagastoId"
			        modelVar="notaD" escapedModel="<%= true %>"
			        rowVar="depRow"			        
			    >			    	   		
			    
			    <% depRow.setClassName(notaD.getStatus().contentEquals("2") ? "note-css-processed" : ""); %>
			    
				    <portlet:renderURL var="editNotaGastoURL">
						<portlet:param name="jspPage" value="/html/notagastos/edit.jsp" />
						<portlet:param name="notaGastoId" value="<%= String.valueOf(notaD.getNotagastoId()) %>" />
						<portlet:param name="backURL" value="<%= themeDisplay.getURLCurrent() %>" />
						<portlet:param name="vista" value="D" />
		    		</portlet:renderURL>
			    
			    	<liferay-ui:search-container-column-text
						name="Description"
						value="<%= notaD.getDescription() %>"
						href="<%= editNotaGastoURL.toString() %>"					
					/>
				    
				    <liferay-ui:search-container-column-text
						name="business"
						value="<%= CompanyLocalServiceUtil.getCompany(notaD.getCompanyId()).getName() %>"					
					/>	
					
					<liferay-ui:search-container-column-text
						name="Organization"
						value='<%= NotaGastoLocalServiceUtil.getOrganizationsSageCompanies(notaD.getNotagastoId()).get(0).getOrganizationId() > 0 ? OrganizationLocalServiceUtil.getOrganization(NotaGastoLocalServiceUtil.getOrganizationsSageCompanies(notaD.getNotagastoId()).get(0).getOrganizationId()).getName() : "" %>'
					/>
					
					<liferay-ui:search-container-column-text
						name="startDate"
						value='<%= notaD.getStartDate() %>'
					/>
					
					<liferay-ui:search-container-column-text
						name="endDate"
						value="<%= notaD.getEndDate() %>"
					/>			        
					
					<liferay-ui:search-container-column-text
						name="import"
						value='<%= notaD.getAmount() %>'
					/>
					 
					<liferay-ui:search-container-column-text
						name="Comments"
						value="<%= notaD.getComments() %>"
					/>
					
					<liferay-ui:search-container-column-text
						name="createDate"
						value="<%= notaD.getCreateDate() %>"
					/>	        
										
					<liferay-ui:search-container-column-text
						name="updateDate"
						value='<%= notaD.getUpdateDate() %>'
					/>        
					
					<% String lines = "0";
					try {
						lines = String.valueOf(LineaGastoLocalServiceUtil.getNotaGastoLineaGastosCount(notaD.getNotagastoId()));
					} catch(Exception e) { }					
					%>
					
					<liferay-ui:search-container-column-text
						name="expenses-lines-number"
						value='<%= lines %>'
					/>        
					
					<% String status = "";
					try {
						status = LanguageUtil.get(locale, ApplicationStatusLocalServiceUtil.getApplicationStatus(Long.parseLong(notaD.getStatus())).getName()).toUpperCase();
					} catch(Exception e) { }					
					%>
					
					<liferay-ui:search-container-column-text
						name="Status"
						value='<%= status %>'
					/>        
					
					<liferay-ui:search-container-column-jsp
						align="right"
						path="/html/notagastos/actionsd.jsp"
					/>					
			        
			    </liferay-ui:search-container-row>	    
			
			    <liferay-ui:search-iterator />
			</liferay-ui:search-container>
		</div>		
	</div>	
</div>

<div id="UsuarioHist" class="tabcontent">
	<div style="width:100%;" >
		<div id="full" >			
			<liferay-ui:search-container curParam="historicCur" delta="50" emptyResultsMessage="no-any-expenses-notes" iteratorURL="<%= portletURLPaH %>">
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
			        modelVar="notaH" escapedModel="<%= true %>"
			        rowVar="histRow"
			    >
			    
			    <% String cssClass = "";
			    if (notaH.getStatus().contentEquals("1")) cssClass = "note-css-draft";
			    if (notaH.getStatus().contentEquals("2")) cssClass = "note-css-processed";
			    if (notaH.getStatus().contentEquals("3")) cssClass = "note-css-denied";
			    if (notaH.getStatus().contentEquals("4")) cssClass = "note-css-pending";
			    if (notaH.getStatus().contentEquals("5")) cssClass = "note-css-accounted";			    
			    histRow.setClassName(cssClass); 
			    %>			    
			    	<portlet:renderURL var="editNotaGastoURL">
						<portlet:param name="jspPage" value="/html/notagastos/edit.jsp" />
						<portlet:param name="notaGastoId" value="<%= String.valueOf(notaH.getNotagastoId()) %>" />
						<portlet:param name="backURL" value="<%= themeDisplay.getURLCurrent() %>" />
						<portlet:param name="vista" value="H" />
		    		</portlet:renderURL>   		
			    	
				    <liferay-ui:search-container-column-text
						name="Description"
						value="<%= notaH.getDescription() %>"
						href="<%= editNotaGastoURL.toString() %>"
					/>
				    
				    <liferay-ui:search-container-column-text
						name="business"
						value="<%= CompanyLocalServiceUtil.getCompany(notaH.getCompanyId()).getName() %>"					
					/>	
					
					<liferay-ui:search-container-column-text
						name="Organization"
						value='<%= NotaGastoLocalServiceUtil.getOrganizationsSageCompanies(notaH.getNotagastoId()).get(0).getOrganizationId() > 0 ? OrganizationLocalServiceUtil.getOrganization(NotaGastoLocalServiceUtil.getOrganizationsSageCompanies(notaH.getNotagastoId()).get(0).getOrganizationId()).getName() : "" %>'
					/>
					
					<liferay-ui:search-container-column-text
						name="startDate"
						value='<%= notaH.getStartDate() %>'
					/>
					
					<liferay-ui:search-container-column-text
						name="endDate"
						value="<%= notaH.getEndDate() %>"
					/>			        
					
					<liferay-ui:search-container-column-text
						name="import"
						value='<%= notaH.getAmount() %>'
					/>
					 
					<liferay-ui:search-container-column-text
						name="Comments"
						value="<%= notaH.getComments() %>"
					/>
					
					<liferay-ui:search-container-column-text
						name="createDate"
						value="<%= notaH.getCreateDate() %>"
					/>	        
										
					<liferay-ui:search-container-column-text
						name="updateDate"
						value='<%= notaH.getUpdateDate() %>'
					/>        
					
					<% String lines = "0";
					try {
						lines = String.valueOf(LineaGastoLocalServiceUtil.getNotaGastoLineaGastosCount(notaH.getNotagastoId()));
					} catch(Exception e) { }					
					%>
					
					<liferay-ui:search-container-column-text
						name="expenses-lines-number"
						value='<%= lines %>'
					/>        
					
					<% String status = "";
					try {
						status = LanguageUtil.get(locale, ApplicationStatusLocalServiceUtil.getApplicationStatus(Long.parseLong(notaH.getStatus())).getName()).toUpperCase();
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
			<% if(SessionErrors.contains(renderRequest.getPortletSession(),"notaGasto-delete-error")){%>
				<liferay-ui:error key="notaGasto-delete-error" message="notaGasto-delete-error" />
			<%} %>
			<% if(SessionErrors.contains(renderRequest.getPortletSession(),"notaGasto-edit-error")){%>
				<liferay-ui:error key="notaGasto-edit-error" message="notaGasto-edit-error" />
			<%} %>
			<% if(SessionErrors.contains(renderRequest.getPortletSession(),"notaGasto-add-error")){%>
				<liferay-ui:error key="notaGasto-add-error" message="notaGasto-add-error" />
			<%} %>			
			<% if(SessionErrors.contains(renderRequest.getPortletSession(),"notaGasto-sendValidate-error")){%>
				<liferay-ui:error key="notaGasto-sendValidate-error" message="notaGasto-sendValidate-error" />
			<%} %>
			<% if(SessionMessages.contains(renderRequest.getPortletSession(),"notaGasto-delete-success")) {%>
				<liferay-ui:success key="notaGasto-delete-success" message="notaGasto-delete-success" />
			<%} %>
			<% if(SessionMessages.contains(renderRequest.getPortletSession(),"notaGasto-edit-success")) {%>
				<liferay-ui:success key="notaGasto-edit-success" message="notaGasto-edit-success" />
			<%} %>
			<% if(SessionMessages.contains(renderRequest.getPortletSession(),"notaGasto-add-success")) {%>
				<liferay-ui:success key="notaGasto-add-success" message="notaGasto-add-success" />
			<%} %>			
			<% if(SessionMessages.contains(renderRequest.getPortletSession(),"notaGasto-sendValidate-success")) {%>
				<liferay-ui:success key="notaGasto-sendValidate-success" message="notaGasto-sendValidate-success" />
			<%} %>
			<%!
				com.liferay.portal.kernel.dao.search.SearchContainer<NotaGasto> searchContainer = null;
			%>
			<liferay-ui:search-container curParam="notesCur" delta="50" emptyResultsMessage="no-any-expenses-notes" iteratorURL="<%= portletURLPa %>">
			    <liferay-ui:search-container-results>	    
			    <% 	results = ListUtil.subList(parsList, searchContainer.getStart(), searchContainer.getEnd());
			        total = parsList.size();
			        pageContext.setAttribute("results", results);
			    	pageContext.setAttribute("total", total);
			    %>
			    </liferay-ui:search-container-results>
			
			    <liferay-ui:search-container-row 
			    	className="es.davinciti.liferay.model.NotaGasto"
			        keyProperty="notagastoId"
			        modelVar="nota" escapedModel="<%= true %>"
			        rowVar="userRow"
			    >
			    
			    <% userRow.setClassName(nota.getStatus().contentEquals("1") ? "note-css-draft" : "note-css-denied"); %>
			    
			    	<portlet:renderURL var="editNotaGastoURL">
						<portlet:param name="jspPage" value="/html/notagastos/edit.jsp" />
						<portlet:param name="notaGastoId" value="<%= String.valueOf(nota.getNotagastoId()) %>" />
						<portlet:param name="backURL" value="<%= themeDisplay.getURLCurrent() %>" />						
						<portlet:param name="vista" value="U" />
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
						status = LanguageUtil.get(locale, ApplicationStatusLocalServiceUtil.getApplicationStatus(Long.parseLong(nota.getStatus())).getName()).toUpperCase();
					} catch(Exception e) { }					
					%>
					
					<liferay-ui:search-container-column-text
						name="Status"
						value='<%= status %>'
					/>        
					
					<liferay-ui:search-container-column-jsp
						align="right"
						path="/html/notagastos/actions.jsp"
					/>					
			        
			    </liferay-ui:search-container-row>	    
			
			    <liferay-ui:search-iterator />
			</liferay-ui:search-container>
					
			<aui:button-row style="width:100%; text-align:center;">	
			    <aui:button onClick="<%= addNotaGastoURL.toString() %>" value="newNote" />
			</aui:button-row>
		</div>		
	</div>	
</div>

<c:set var="vistaG"><%= vista %></c:set>

<script>
	
	$(document).ready(function() {
		if ("${vistaG}" == "V") $("#tabDepartamentoV").trigger("click");
		if ("${vistaG}" == "D") $("#tabDepartamento").trigger("click");
		else if ("${vistaG}" == "H") $("#tabUsuarioHist").trigger("click");
		else $("#tabUsuario").trigger("click");
	});

</script>