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
    //System.out.println("actionsv.jsp  - notaGastoId : "+notaGastoId);
%>

<liferay-ui:icon-menu>
	<portlet:renderURL var="viewURL">		
		<portlet:param name="jspPage" value="/html/notagastos/edit.jsp" />
		<portlet:param name="notaGastoId" value="<%= String.valueOf(notaGastoId) %>" />
		<portlet:param name="backURL" value="<%= PortalUtil.getCurrentURL(request) %>" />
		<portlet:param name="vista" value="V" />		
	</portlet:renderURL>
    <liferay-ui:icon image="view" url="<%= viewURL.toString() %>" />    
</liferay-ui:icon-menu>