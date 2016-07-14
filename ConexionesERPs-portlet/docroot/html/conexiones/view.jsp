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


<portlet:defineObjects />

<%
	ClassLoader classLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),"portletClassLoader");
	DynamicQuery dq = DynamicQueryFactoryUtil.forClass(ConnectionConfigs.class, classLoader).addOrder(OrderFactoryUtil.asc("companyId"));
	List<ConnectionConfigs> parsList = (List<ConnectionConfigs>)ConnectionConfigsLocalServiceUtil.dynamicQuery(dq);
    PortletURL portletURLPa = renderResponse.createRenderURL();
    String currentURL = PortalUtil.getCurrentURL(request);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String configDate = "";
    String typeDate = "";
    String actionDate = "";
    String dataDate = "";
%>
	<% if(SessionErrors.contains(renderRequest.getPortletSession(),"connectionTypes-form-error")){%>
		<liferay-ui:error key="connectionTypes-form-error" message="Error al Generar la Conexión al Crear el Connection Type asociado." />
	<%} %>
	<% if(SessionErrors.contains(renderRequest.getPortletSession(),"connectionActionTypes-form-error")){%>
		<liferay-ui:error key="connectionActionTypes-form-error" message="Error al Generar la Conexión al Crear el Connection Action Type asociado." />
	<%} %>
	<% if(SessionErrors.contains(renderRequest.getPortletSession(),"connectionData-form-error")){%>
		<liferay-ui:error key="connectionData-form-error" message="Error al Generar la Conexión al Crear la Connection Data asociada." />
	<%} %>
	<% if(SessionErrors.contains(renderRequest.getPortletSession(),"connectionConfigs-form-error")){%>
		<liferay-ui:error key="connectionConfigs-form-error" message="Error al Generar la Conexión." />
	<%} %>
	<% if(SessionErrors.contains(renderRequest.getPortletSession(),"connectionConfigs-update-error")){%>
		<liferay-ui:error key="connectionConfigs-update-error" message="Error al Modificar la Conexión." />
	<%} %>
	<% if(SessionErrors.contains(renderRequest.getPortletSession(),"connectionConfigs-delete-error")){%>
		<liferay-ui:error key="connectionConfigs-update-error" message="Error al Eliminar la Conexión." />
	<%} %>
	<% if(SessionMessages.contains(renderRequest.getPortletSession(),"connectionConfigs-form-success")) {%>
		<liferay-ui:success key="connectionConfigs-form-success" message="Conexión Generada correctamente." />
	<%} %>
	<% if(SessionMessages.contains(renderRequest.getPortletSession(),"connectionConfigs-update-success")) {%>
		<liferay-ui:success key="connectionConfigs-update-success" message="Conexión Modificada correctamente." />
	<%} %>
	<% if(SessionMessages.contains(renderRequest.getPortletSession(),"connectionConfigs-delete-success")) {%>
		<liferay-ui:success key="connectionConfigs-delete-success" message="Conexión Eliminada correctamente." />
	<%} %>
	
	<portlet:renderURL var="addConexionesURL">
		<portlet:param name="jspPage" value="/html/conexiones/add.jsp" />
    </portlet:renderURL>       
	
	<%!
		com.liferay.portal.kernel.dao.search.SearchContainer<ConnectionConfigs> searchContainer = null;
	%>
	
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
	    	<portlet:renderURL var="editConexionesURL">
				<portlet:param name="jspPage" value="/html/conexiones/edit.jsp" />
				<portlet:param name="configId" value="<%= String.valueOf(configs.getConfigId()) %>" />
    		</portlet:renderURL>
    		
	    	<liferay-ui:search-container-column-text
	            name="Company ID"
	            value="<%= String.valueOf(configs.getCompanyId()) %>"
	            href="<%= editConexionesURL.toString() %>"
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
	        
	        <liferay-ui:search-container-column-text
	            name="Connection Type"
	            value="<%= ConnectionConfigsLocalServiceUtil.getConnectionTypes(configs.getConfigId()).get(0).getName() %>"
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
	        
	         <liferay-ui:search-container-column-text
	            name="Connection Action Type"
	            value="<%= ConnectionConfigsLocalServiceUtil.getConnectionActionTypes(configs.getConfigId()).get(0).getName() %>"
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
	         
	         <liferay-ui:search-container-column-text
	            name="Server"
	            value="<%= ConnectionConfigsLocalServiceUtil.getConnectionData(configs.getConfigId()).get(0).getServer() %>"
	        />
	        
	        <liferay-ui:search-container-column-text
	            name="Url"
	            value="<%= ConnectionConfigsLocalServiceUtil.getConnectionData(configs.getConfigId()).get(0).getUrl() %>"
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
	        
	        <liferay-ui:search-container-column-jsp
			    align="right"
			    path="/html/conexiones/acciones/conexiones_actions.jsp"
			/>
	        
	    </liferay-ui:search-container-row>	    
	
	    <liferay-ui:search-iterator />
	</liferay-ui:search-container>

	<aui:button-row>	
	    <aui:button onClick="<%= addConexionesURL.toString() %>" value="Añadir Conexión" />
	</aui:button-row>