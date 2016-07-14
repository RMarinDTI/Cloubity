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
    String conType = "";
    String conActionType = "";
    String server = "";
    String url = "";
%>

<%!
   com.liferay.portal.kernel.dao.search.SearchContainer<ConnectionConfigs> searchContainer = null;
%>

<h4>Seleccione la Conexión</h4>

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
	       	<portlet:actionURL var="testConexionesURL" name="testConnectionErp" windowState="normal">
				<portlet:param name="jspPage" value="/html/testconexiones/test.jsp" />
				<portlet:param name="configId" value="<%= String.valueOf(configs.getConfigId()) %>" />
			</portlet:actionURL>			
	    	
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
	        
	         <liferay-ui:search-container-column-text
	            name="Testear"
	            value="Testear"
	            href="<%= testConexionesURL.toString() %>"
	        />
	        
	    </liferay-ui:search-container-row>	    
	
	    <liferay-ui:search-iterator />
	</liferay-ui:search-container>