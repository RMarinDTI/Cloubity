<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="javax.portlet.*" %>

<%@ page import="es.davinciti.liferay.model.ConnectionConfigs"%>

<portlet:defineObjects />

<%
    ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	ConnectionConfigs configs = (ConnectionConfigs) row.getObject();
    String name = ConnectionConfigs.class.getName();
    long configId = configs.getConfigId();
%>

<liferay-ui:icon-menu>
	<portlet:renderURL var="editURL">
		<portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="editConexionErp" />
		<portlet:param name="jspPage" value="/html/conexiones/edit.jsp" />
		<portlet:param name="configId" value="<%= String.valueOf(configId) %>" />
	</portlet:renderURL>
    <liferay-ui:icon image="edit" url="<%= editURL.toString() %>" />
    
    <portlet:actionURL var="deleteURL">
		<portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="deleteConexionErp" />
	    <portlet:param name="configId" value="<%= String.valueOf(configId) %>" />
	</portlet:actionURL>
    <liferay-ui:icon-delete url="<%= deleteURL.toString()%>" confirmation="¿Está seguro de que quiere borrar esta Configuración?" />
</liferay-ui:icon-menu> 