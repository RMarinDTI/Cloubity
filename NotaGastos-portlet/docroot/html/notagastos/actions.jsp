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
    //System.out.println("actions.jsp  - notaGastoId : "+notaGastoId);
%>

<liferay-ui:icon-menu>
	<portlet:renderURL var="editURL">		
		<portlet:param name="jspPage" value="/html/notagastos/edit.jsp" />
		<portlet:param name="notaGastoId" value="<%= String.valueOf(notaGastoId) %>" />
		<portlet:param name="backURL" value="<%= PortalUtil.getCurrentURL(request) %>" />
		<portlet:param name="vista" value="U" />
	</portlet:renderURL>
    <liferay-ui:icon image="edit" url="<%= editURL.toString() %>" />
    <%
    	String sendValidateConfirm = "javascript:confirmSendValidate('"+LineaGastoLocalServiceUtil.getNotaGastoLineaGastosCount(notaGastoId)+"','"+notaGastoId+"');";
    	String deleteConfirm = "javascript:confirmDelete('"+notaGastoId+"');";
    %>
    <liferay-ui:icon image="send-to-validate" src="/NotaGastos-portlet/icons/edit_guest.png" url="<%= sendValidateConfirm %>" />
    <liferay-ui:icon-delete url="<%= deleteConfirm %>" confirmation="delete-confirmation-expenses-note" />
</liferay-ui:icon-menu> 

<portlet:actionURL var="sendValidateURL" name="sendValidateNotaGasto" windowState="normal" />	
<portlet:actionURL var="deleteURL" name="deleteNotaGasto" windowState="normal" />
	
<form method="post" action="<%= sendValidateURL.toString() %>" style="margin:0;padding:0;" id="sendValidateForm" name="sendValidateForm" >
	<aui:input type="hidden" name="notaGastoSValId" value="" />
</form>

<form method="post" action="<%= deleteURL.toString() %>" style="margin:0;padding:0;" id="deleteForm" name="deleteForm" >
	<aui:input type="hidden" name="notaGastoDelId" value="" />
	<aui:input type="hidden" name="vista" value="U" />
</form>

<script>

	function confirmSendValidate(number, notaId) {
		//alert("confirmValidate - number : "+number);
		var msg = "";
		if (parseInt(number) == 0) { 
			msg = '<liferay-ui:message key="validate-expenses-note-nolines" />';
			alert(msg);
		} else { 
			msg = '<liferay-ui:message key="sendValidate-confirmation-expenses-note" />';			
			if(confirm(msg)) {
				$("#<portlet:namespace/>notaGastoSValId").val(notaId);
				$("#sendValidateForm").submit();	
			}
		}		
	}
	
	function confirmDelete(notaId) {
		//alert("confirmDelete - notaId : "+notaId);
		$("#<portlet:namespace/>notaGastoDelId").val(notaId);
		//alert("#<portlet:namespace/>notaGastoDelId : "+$("#<portlet:namespace/>notaGastoDelId").val());
		//alert("#deleteForm ? "+$("#deleteForm"));
		$("#deleteForm").submit();		
	}

</script>