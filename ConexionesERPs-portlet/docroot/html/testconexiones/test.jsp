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

<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="es.davinciti.liferay.service.ConnectionConfigsLocalServiceUtil" %>
<%@page import="es.davinciti.liferay.service.ConnectionDataLocalServiceUtil" %>

<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>

<portlet:defineObjects />

<%
long configId = ParamUtil.getLong(request, "configId", 0);
String result = ParamUtil.get(request, "conexionTestResult", "");

//System.out.println("test.jsp - configId : "+configId+" - result : "+result);
%>

<% if(SessionErrors.contains(renderRequest.getPortletSession(),"test-conexionErp-error")){%>
	<liferay-ui:error key="test-conexionErp-error" message="Error al Ejecutar el Proceso de Testeo de la Conexión." />
<%} %>
<% if(SessionMessages.contains(renderRequest.getPortletSession(),"test-conexionErp-ok")) {%>
	<liferay-ui:success key="test-conexionErp-ok" message="Proceso de Testeo ejecutado correctamente." />
<%} %>
<%	if (result.indexOf("https") == 0) { %>	
	<h4>Primera Conexión para la CompanyID : <%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionConfigs(configId).getCompanyId() : "" %></h4>
	<p>Escriba los datos necesarios para Iniciar la Primera Conexión con SAGEID</p>
	<p><strong>UserName</strong> : <%= configId > 0 ? ConnectionDataLocalServiceUtil.getConnectionConfigsConnectionDatas(configId).get(0).getUsername() : "" %></p>
	<p><strong>Password</strong> : <%= configId > 0 ? ConnectionDataLocalServiceUtil.getConnectionConfigsConnectionDatas(configId).get(0).getPassword() : "" %></p>
	<p>Al finalizar, copiar el valor del parámetro <strong>code</strong> informado en la url de la nueva ventana, en el siguiente campo :</p>
	
	<script>
		var myWin = window.open("<%= result %>", "sageForm", "toolbar=yes,scrollbars=yes,resizable=yes,top=500,left=500,width=1000,height=300");
		//alert("myWin "+myWin.location);
	</script>
	
	<portlet:actionURL var="getWebAccessTokenURL" name="getWebAccessToken" windowState="normal" />
	
	<form action="<%= getWebAccessTokenURL.toString() %>" method="POST" name="formCode" id="formCode" > 
		<aui:input type="text" name="code" label="Code" inlineLabel="left" />
		<aui:input type="hidden" name="configId" value="<%= configId > 0 ? configId : 0 %>" />
		<aui:input type="hidden" name="test" value="test" />
		<aui:button-row>
			<aui:button type="button" value="submit" onclick="submitForm(myWin)" /> 
		</aui:button-row>	
	</form>
	
	<script>
		function submitForm(myWin) {			
			myWin.close();
			//alert("form submit : "+document.getElementById("formCode"));
			document.getElementById("formCode").submit();
		}		
	</script>
<%	} else { %>
	<h4>Resultados del Testeo de la Conexión para la CompanyID : <%= configId > 0 ? ConnectionConfigsLocalServiceUtil.getConnectionConfigs(configId).getCompanyId() : "" %></h4>
	<p><%= result %></p>
<%	} %>