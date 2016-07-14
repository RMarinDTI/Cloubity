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
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page import="javax.portlet.*"%>
<%@page import="java.util.*"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="es.davinciti.liferay.service.ConnectionConfigsLocalServiceUtil" %>
<%@page import="es.davinciti.liferay.service.ConnectionTypesLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.dao.orm.*"%>

<%@page import="es.davinciti.liferay.service.ClpSerializer"%>
<%@page import="com.liferay.portal.kernel.bean.PortletBeanLocatorUtil"%>

<%@page import="es.davinciti.liferay.model.ConnectionConfigs" %>
<%@page import="es.davinciti.liferay.model.ConnectionTypes" %>

<portlet:defineObjects />

<%
	long configId = ParamUtil.getLong(request, "configId", 0);
	String instId = "";
		
	if (configId > 0) {
		instId = ConnectionConfigsLocalServiceUtil.getConnectionConfigs(configId).getInstallationId();	
	}	
	//System.out.println("edit.jsp - configId : "+configId+" - instId : "+instId);
%>


<portlet:actionURL var="editConexionURL" name="editConexionErp" windowState="normal" />

<c:if test='<%= !instId.contentEquals("") %>' >
	<aui:form method="post" action="<%= editConexionURL.toString() %>" >
		<aui:fieldset label="Datos de la Nueva Conexión - SAGE">
			<aui:layout>
				<aui:column columnWidth="100"><h4 style="text-align:center;">CONFIGURACIÓN</h4></aui:column>
	 		    <aui:column columnWidth="20" first="true">
	 		    	<aui:input type="text" name="companyId" label="Company ID" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionConfigs(configId).getCompanyId() : "" %>'/>
	 		    </aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="installationId" label="Installation ID" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionConfigs(configId).getInstallationId() : "" %>'/>
	 		    </aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="productCode" label="Product Code" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionConfigs(configId).getProductCode() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="disableDateConf" label="Disable Date" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionConfigs(configId).getDisableDate() : "" %>'/>
	 		    </aui:column>
	 		     <aui:column columnWidth="20" last="true">&nbsp;</aui:column>
	 		    <aui:column columnWidth="40" first="true"><h4 style="text-align:center;">TIPO DE CONEXIÓN</h4></aui:column>
	 		    <aui:column columnWidth="60" last="true"><h4 style="text-align:center;">TIPO DE ACCIÓN</h4></aui:column>
	 		    <aui:column columnWidth="20" first="true">
	 		       	<aui:select name="nameType" label ="Name">
 						<aui:option value="<%= ConnectionConfigsLocalServiceUtil.getConnectionTypes(configId).get(0).getConnectionTypeId() %>" selected="true" ><%= ConnectionConfigsLocalServiceUtil.getConnectionTypes(configId).get(0).getName() %></aui:option>
 					</aui:select>					 		    
	 		    </aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="disableDateType" label="Disable Date" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionTypes(configId).get(0).getDisableDate() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20">&nbsp;</aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="nameAction" label="Name" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionActionTypes(configId).get(0).getName() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20" last="true">
	 		    	<aui:input type="text" name="disableDateAction" label="Disable Date" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionActionTypes(configId).get(0).getDisableDate() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="100"><h4 style="text-align:center;">DATOS DE CONEXIÓN</h4></aui:column>
	 		    <aui:column columnWidth="20" first="true">
	 		    	<aui:input type="text" name="server" label="Server" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getServer() : "" %>'/>
	 		    </aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="url" label="Url" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getUrl() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="secretKey" label="Secret Key" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getSecretKey() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="clientId" label="Client ID" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getClientId() : "" %>' />
	 		    </aui:column>
	 		   <aui:column columnWidth="20" last="true">
	 		    	<aui:input type="text" name="scope" label="Scope" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getScope() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20" first="true">
	 		    	<aui:input type="text" name="clavePrimaria" label="Primary Key"  value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getClavePrimaria() : "" %>' />
	 		    </aui:column>			 		
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="claveSecundaria" label="Secondary Key" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getClaveSecundaria() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="username" label="Username" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getUsername() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="password" label="Password" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getPassword() : "" %>' />
	 		    </aui:column>			 		    		    
	 		    <aui:column columnWidth="20" last="true">
	 		    	<aui:input type="text" name="disableDateData" label="Disable Date" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getDisableDate() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20" first="true">
	 		    	<aui:input type="text" name="webSecretKey" label="Web Secret Key" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getWebSecretKey() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="applicationCode" label="Application Code" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getApplicationCode() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20" >
	 		    	<aui:input type="text" name="applicationToken" label="Application Token" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getApplicationToken() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="encodedClientCredentials" label="Encoded Client Credentials" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getEncodedClientCredentials() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20" last="true">
	 		    	<aui:input type="text" name="refreshToken" label="Refresh Token" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getRefreshToken() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="100">
	 		    	<aui:input type="text" name="accessToken" label="Access Token" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getAccessToken() : "" %>' />
	 		    </aui:column>
	 		    <aui:input type="hidden" name="configId" value="<%= configId %>" />
	 		    <aui:button-row>
					<aui:button type="submit" value="submit"/>
	    				</aui:button-row>		 		    
	 		</aui:layout>
	 	</aui:fieldset>
	</aui:form>
</c:if>
<c:if test='<%= instId.contentEquals("") %>' >    	
	<aui:form method="post" action="<%= editConexionURL.toString() %>" >
		<aui:fieldset label="Datos de la Nueva Conexión - SAP BO">
			<aui:layout>
				<aui:column columnWidth="100"><h4 style="text-align:center;">CONFIGURACIÓN</h4></aui:column>
	 		    <aui:column columnWidth="20" first="true">
	 		    	<aui:input type="text" name="companyId" label="Company ID" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionConfigs(configId).getCompanyId() : "" %>'/>
	 		    </aui:column>
	 		    <aui:column columnWidth="80" last="true">
	 		    	<aui:input type="text" name="disableDateConf" label="Disable Date" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionConfigs(configId).getDisableDate() : "" %>'/>
	 		    </aui:column>			 		    
	 		    <aui:column columnWidth="40" first="true"><h4 style="text-align:center;">TIPO DE CONEXIÓN</h4></aui:column>
	 		    <aui:column columnWidth="60" last="true"><h4 style="text-align:center;">TIPO DE ACCIÓN</h4></aui:column>
	 		    <aui:column columnWidth="20" first="true">
	 		    	<aui:select name="nameType" label ="Name">
 						<aui:option value="<%= ConnectionConfigsLocalServiceUtil.getConnectionTypes(configId).get(0).getConnectionTypeId() %>" selected="true" ><%= ConnectionConfigsLocalServiceUtil.getConnectionTypes(configId).get(0).getName() %></aui:option>
 					</aui:select>
	 		    </aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="disableDateType" label="Disable Date" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionTypes(configId).get(0).getDisableDate() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20">&nbsp;</aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="nameAction" label="Name" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionActionTypes(configId).get(0).getName() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20" last="true">
	 		    	<aui:input type="text" name="disableDateAction" label="Disable Date" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionActionTypes(configId).get(0).getDisableDate() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="100"><h4 style="text-align:center;">DATOS DE CONEXIÓN</h4></aui:column>
	 		    <aui:column columnWidth="20" first="true">
	 		    	<aui:input type="text" name="companyDB" label="Company DB" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getCompanyDB() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="server" label="Server" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getServer() : "" %>'/>
	 		    </aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="port" label="Port" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getPort() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20">
	 		    	<aui:input type="text" name="url" label="Url" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getUrl() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20" last="true">
	 		    	<aui:input type="text" name="disableDateData" label="Disable Date" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getDisableDate() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="20" first="true">
	 		    	<aui:input type="text" name="username" label="Username" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getUsername() : "" %>' />
	 		    </aui:column>
	 		    <aui:column columnWidth="80" last="true">
	 		    	<aui:input type="text" name="password" label="Password" value='<%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0).getPassword() : "" %>' />
	 		    </aui:column>	 		    
	 		    <aui:input type="hidden" name="configId" value="<%= configId %>" />
	 		    <aui:button-row>
					<aui:button type="submit" value="submit"/>
	    				</aui:button-row>		 		    
	 		</aui:layout>
	 	</aui:fieldset>
	</aui:form>
</c:if> 	