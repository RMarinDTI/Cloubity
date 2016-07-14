<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="com.liferay.portal.kernel.util.*"%>
<%@ page import="javax.portlet.*" %>

<%@ page import="es.davinciti.liferay.model.*"%>
<%@ page import="es.davinciti.liferay.service.*"%>

<portlet:defineObjects />

<%
    ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	LineaGasto lineaGasto = (LineaGasto) row.getObject();    
    long lineaGastoId = lineaGasto.getLineagastoId();
    long notagastoId = ParamUtil.getLong(request, "notaGastoId", 0);
    String backURL = ParamUtil.getString(request, "backURL", "");
    String vista = ParamUtil.getString(request, "vista", "U"); 
    if (backURL.contains("vista=")) backURL = backURL.substring(0, backURL.indexOf("vista=")+6)+vista;
    else backURL += "?vista="+vista;
    String status = "";
    try {
    	status = NotaGastoLocalServiceUtil.getNotaGasto(notagastoId).getStatus();
    } catch(Exception e) { }
    
    //System.out.println("actions.jsp - lineaGastoId : "+lineaGastoId+" - notagastoId : "+notagastoId);
%>

<liferay-ui:icon-menu>
	<portlet:renderURL var="editURL">
		<portlet:param name="<%= ActionRequest.ACTION_NAME %>" value="editLineaGasto" />
		<portlet:param name="jspPage" value="/html/lineagastos/edit.jsp" />
		<portlet:param name="lineaGastoId" value="<%= String.valueOf(lineaGastoId) %>" />
		<portlet:param name="notaGastoId" value="<%= String.valueOf(notagastoId) %>" />
		<portlet:param name="vista" value="<%= vista %>" />
		<portlet:param name="backURL" value="<%= backURL %>" />
	</portlet:renderURL>
    <liferay-ui:icon image="edit" url="<%= editURL.toString() %>" />    
	<%    	
    	String deleteConfirmL = "javascript:confirmDeleteL('"+status+"', '"+notagastoId+"');";
    %>
    <liferay-ui:icon-delete url="<%= deleteConfirmL %>" confirmation="delete-confirmation-expenses-note-line" />
</liferay-ui:icon-menu> 

<portlet:actionURL var="deleteURL" name="deleteLineaGasto" />

<form method="post" action="<%= deleteURL.toString() %>" style="margin:0;padding:0;" id="deleteFormL" name="deleteFormL" >
	<aui:input type="hidden" name="lineaGastoId" value="<%= String.valueOf(lineaGastoId) %>" />
	<aui:input type="hidden" name="notaGastoId" value="" />	
</form>

<script>

	function confirmDeleteL(status, notaId) {
		if (parseInt(status) == 1 || parseInt(status) == 3) {			
			$("#<portlet:namespace/>notaGastoId").val(notaId);			
			$("#deleteFormL").submit();
		} else {
			var msg = "<liferay-ui:message key='note-line-delete-exception-status' />";
			alert(msg);
		}
	}

</script>