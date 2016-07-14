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
<%@ page import="com.liferay.portal.theme.ThemeDisplay"%>

<portlet:defineObjects />

<%
    ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	NotaGasto notaGasto = (NotaGasto) row.getObject();    
    long notaGastoId = notaGasto.getNotagastoId();
    ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
    long companyId = themeDisplay.getCompanyId();
    long userId = themeDisplay.getUserId();
    //System.out.println("actionsd.jsp  - notaGastoId : "+notaGastoId+" - companyId : "+companyId+" - userId : "+userId);
%>

<liferay-ui:icon-menu>
	<portlet:renderURL var="viewURL">		
		<portlet:param name="jspPage" value="/html/notagastos/edit.jsp" />
		<portlet:param name="notaGastoId" value="<%= String.valueOf(notaGastoId) %>" />
		<portlet:param name="backURL" value="<%= PortalUtil.getCurrentURL(request) %>" />
		<portlet:param name="vista" value="D" />		
	</portlet:renderURL>
    <liferay-ui:icon image="view" url="<%= viewURL.toString() %>" />
	<%
    	String validateConfirm = "javascript:confirmValidate('"+notaGastoId+"', '"+notaGasto.getStatus()+"');";    	
    	String denyConfirm = "javascript:confirmDeny('"+notaGastoId+"', '"+notaGasto.getStatus()+"');";
    %>
    <liferay-ui:icon image="validateS" src="/NotaGastos-portlet/icons/icon-validate.png" url="<%= validateConfirm %>" />
    <liferay-ui:icon image="deny-expenses-note" src="/NotaGastos-portlet/icons/icon-deny.png" url="<%= denyConfirm %>" />
</liferay-ui:icon-menu> 

<portlet:actionURL var="validateURL" name="validateNotaGasto" windowState="normal" />	
<portlet:actionURL var="denyURL" name="denyNotaGasto" windowState="normal" />

<form method="post" action="<%=validateURL.toString() %>" style="margin:0;padding:0;" id="validateForm" name="validateForm" >
	<aui:input type="hidden" name="notaGastoValId" value="" />
	<aui:input type="hidden" name="companyId" value="<%= companyId %>" />
	<aui:input type="hidden" name="userId" value="<%= userId %>" />
</form>

<form method="post" action="<%=denyURL.toString() %>" style="margin:0;padding:0;" id="denyForm" name="denyForm" >
	<aui:input type="hidden" name="notaGastoDenId" value="" />
</form>

<script>

	function confirmValidate(notaId, status) {		
		if (parseInt(status) == 2) {	
			var msg = "<liferay-ui:message key='validate-expenses-note-confirm' />";
			if (confirm(msg)) {
				$("#<portlet:namespace/>notaGastoValId").val(notaId);			
				$("#validateForm").submit();
			}
		} else {
			var msg = "<liferay-ui:message key='expenses-note-validate-exception-status' />";
			alert(msg);
		}
	}
	
	function confirmDeny(notaId, status) {
		if (parseInt(status) == 2) {
			var msg = "<liferay-ui:message key='deny-expenses-note-confirm' />";
			if (confirm(msg)) {
				$("#<portlet:namespace/>notaGastoDenId").val(notaId);
				$("#denyForm").submit();
			}
		} else {
			var msg = "<liferay-ui:message key='expenses-note-deny-exception-status' />";
			alert(msg);
		}
	}

</script>