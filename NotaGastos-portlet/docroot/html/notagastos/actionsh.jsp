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

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="javax.portlet.*" %>

<%@ page import="es.davinciti.liferay.model.*"%>
<%@ page import="es.davinciti.liferay.service.*"%>

<portlet:defineObjects />

<%
    ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	NotaGasto notaGasto = (NotaGasto) row.getObject();    
    long notaGastoId = notaGasto.getNotagastoId();
    //System.out.println("actionsh.jsp  - notaGastoId : "+notaGastoId);
%>

<liferay-ui:icon-menu>
	<portlet:renderURL var="viewURL">		
		<portlet:param name="jspPage" value="/html/notagastos/edit.jsp" />
		<portlet:param name="notaGastoId" value="<%= String.valueOf(notaGastoId) %>" />
		<portlet:param name="backURL" value="<%= PortalUtil.getCurrentURL(request) %>" />
		<portlet:param name="vista" value="H" />		
	</portlet:renderURL>
    <liferay-ui:icon image="view" url="<%= viewURL.toString() %>" />
    <%    	
    	String deleteConfirmH = "javascript:confirmDeleteH('"+notaGasto.getStatus()+"', '"+notaGastoId+"');";
    %>
    <liferay-ui:icon-delete url="<%= deleteConfirmH %>" confirmation="delete-confirmation-expenses-note" />
</liferay-ui:icon-menu> 

<portlet:actionURL var="deleteURLH" name="deleteNotaGasto" windowState="normal" />
	
<form method="post" action="<%= deleteURLH.toString() %>" style="margin:0;padding:0;" id="deleteFormH" name="deleteFormH" >
	<aui:input type="hidden" name="notaGastoDelHId" value="" />
	<aui:input type="hidden" name="vista" value="H" />
</form>

<script>

	function confirmDeleteH(status, notaId) {
		if (parseInt(status) == 1 || parseInt(status) == 3) {			
			$("#<portlet:namespace/>notaGastoDelHId").val(notaId);			
			$("#deleteFormH").submit();
		} else {
			var msg = "<liferay-ui:message key='expenses-note-delete-exception-status' />";
			alert(msg);
		}
	}

</script>