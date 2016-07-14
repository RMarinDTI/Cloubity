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
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="es.davinciti.liferay.service.ConnectionConfigsLocalServiceUtil" %>
<%@page import="es.davinciti.liferay.model.ConnectionConfigs" %>
<%@page import="com.liferay.portal.kernel.util.*"%>
<%@page import="com.liferay.portal.kernel.dao.orm.*"%>
<%@page import="java.util.*"%>
<%@page import="javax.portlet.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="es.davinciti.liferay.service.ClpSerializer"%>
<%@page import="com.liferay.portal.kernel.bean.PortletBeanLocatorUtil"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.security.auth.CompanyThreadLocal"%>
<%@page import="es.davinciti.util.Constants"%>

<portlet:defineObjects />

<% if(SessionErrors.contains(renderRequest.getPortletSession(),"migrarUsuarios-form-error")){%>
	<liferay-ui:error key="migrarUsuarios-form-error" message="Error en la Migración." />
<%} %>
<% if(SessionMessages.contains(renderRequest.getPortletSession(),"migrarUsuarios-form-success")) {%>
	<liferay-ui:success key="migrarUsuarios-form-success" message="Migración Realizada Correctamente." />
<%} %>

<%
	long companyId = CompanyThreadLocal.getCompanyId();
	long configId = 0;
	ClassLoader classLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),"portletClassLoader");
	DynamicQuery dq = DynamicQueryFactoryUtil.forClass(ConnectionConfigs.class, classLoader).add(PropertyFactoryUtil.forName("companyId").eq(companyId));
	List<ConnectionConfigs> parsList = (List<ConnectionConfigs>)ConnectionConfigsLocalServiceUtil.dynamicQuery(dq);
    PortletURL portletURLPa = renderResponse.createRenderURL();
    String currentURL = PortalUtil.getCurrentURL(request);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String configDate = "";
    String typeDate = "";
    String actionDate = "";
    String dataDate = "";
    String conType = "";
    String conActionType = "";
    String server = "";
    String url = "";
    String migResult = ParamUtil.get(request, "result", "");
%>

<%!
   com.liferay.portal.kernel.dao.search.SearchContainer<ConnectionConfigs> searchContainer = null;
%>

<h4>Conexión Disponible</h4>

<liferay-ui:search-container delta="10" emptyResultsMessage="No hay Conexiones ERP disponibles" iteratorURL="<%= portletURLPa %>">
    <liferay-ui:search-container-results>	    
    <% 	
        results = ListUtil.subList(parsList, searchContainer.getStart(), searchContainer.getEnd());
        total = parsList.size();
        pageContext.setAttribute("results", results);
    	pageContext.setAttribute("total", total);
    %>
    </liferay-ui:search-container-results>
	
    <liferay-ui:search-container-row
        className="es.davinciti.liferay.model.ConnectionConfigs"
        keyProperty="configId"
        modelVar="configs" escapedModel="<%= true %>"
    >
       			
    	
    	<liferay-ui:search-container-column-text 
            name="Company ID"
            value="<%= String.valueOf(configs.getCompanyId()) %>"
        />
        
        <%
        try {
        	configDate = dateFormat.format(configs.getDisableDate());
        } catch(Exception e) { }
        %>
        <liferay-ui:search-container-column-text
            name="Disable Date"
            value='<%= configDate %>'
        />
        
        <%	        
        try {
        	conType = ConnectionConfigsLocalServiceUtil.getConnectionTypes(configs.getConfigId()).get(0).getName();
        } catch(Exception e) { }
        %>	        
        <liferay-ui:search-container-column-text
            name="Connection Type"
            value="<%= conType %>"
        />
        
        <%
        try {
        	typeDate = dateFormat.format(ConnectionConfigsLocalServiceUtil.getConnectionTypes(configs.getConfigId()).get(0).getDisableDate());
        } catch(Exception e) { }
        %>
        <liferay-ui:search-container-column-text
            name="Type Disable Date"
            value='<%= typeDate %>'
        />
        
        <%	        
        try {
        	conActionType = ConnectionConfigsLocalServiceUtil.getConnectionActionTypes(configs.getConfigId()).get(0).getName();
        } catch(Exception e) { }
        %>	    
        <liferay-ui:search-container-column-text
            name="Connection Action Type"
            value="<%= conActionType %>"
        />
        
        <%
        try {
        	actionDate = dateFormat.format(ConnectionConfigsLocalServiceUtil.getConnectionActionTypes(configs.getConfigId()).get(0).getDisableDate());
        } catch(Exception e) { }
        %>
        <liferay-ui:search-container-column-text
            name="Action Disable Date"
            value='<%= actionDate %>'
        />
        
        <%	        
        try {
        	server = ConnectionConfigsLocalServiceUtil.getConnectionData(configs.getConfigId()).get(0).getServer();
        } catch(Exception e) { }
        %>	   
        <liferay-ui:search-container-column-text
            name="Server"
            value="<%= server %>"
        />
        
        <%	        
        try {
        	url = ConnectionConfigsLocalServiceUtil.getConnectionData(configs.getConfigId()).get(0).getUrl();
        } catch(Exception e) { }
        %>	  
        <liferay-ui:search-container-column-text
            name="Url"
            value="<%= url %>"
        />	        
        
        <%
        try {
        	dataDate = dateFormat.format(ConnectionConfigsLocalServiceUtil.getConnectionData(configs.getConfigId()).get(0).getDisableDate());
        } catch(Exception e) { }
        %>
        <liferay-ui:search-container-column-text
            name="Data Disable Date"
            value='<%= dataDate %>'
        />        
        
        <% configId = configs.getConfigId(); %>
    </liferay-ui:search-container-row>	    
	
    <liferay-ui:search-iterator />
</liferay-ui:search-container>


<c:if test='<%= conType.contentEquals("SAP BO") %>' >
	<portlet:actionURL var="migrarUsuariosURL" name="migrarUsuariosSAP"  windowState="normal" />
	
	<form action="<%= migrarUsuariosURL.toString() %>" method="POST">
		<aui:fieldset label="Migrar Usuarios">	
			<aui:layout>
				<aui:input type="text" name="configId" value='<%= configId %>' readonly="true" label="Configuration ID" />
				<aui:input type="hidden" name="methodName" value='<%= Constants.GET_USUARIOS_SAP %>' />
				<aui:button-row>
					<aui:button type="submit" value="Migrar Usuarios"/>
		      	</aui:button-row>			
			</aui:layout>	
		</aui:fieldset>
	</form>
</c:if>

<c:if test='<%= conType.contentEquals("SAGE") %>' >
	<portlet:actionURL var="migrarUsuariosURL" name="migrarUsuariosSAGE"  windowState="normal" />
	
	<form action="<%= migrarUsuariosURL.toString() %>" method="POST">
		<aui:fieldset label="Migrar Usuarios">	
			<aui:layout>
				<aui:input type="text" name="configId" value='<%= configId %>' readonly="true" label="Configuration ID" />
				<aui:input type="hidden" name="methodName" value='<%= Constants.SAGE_MIGRATE_USUARIOS %>' />
				<aui:button-row>
					<aui:button type="submit" value="Migrar Usuarios"/>
		      	</aui:button-row>			
			</aui:layout>	
		</aui:fieldset>
	</form>
</c:if>

<c:if test='<%= !migResult.contentEquals("") %>'>
	<h4>Resultado de la Migración</h4>
	<p><%= migResult %></p>
</c:if>