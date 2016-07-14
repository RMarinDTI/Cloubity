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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page import="javax.portlet.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.model.*"%>
<%@ page import="com.liferay.portal.service.*"%>
<%@ page import="es.davinciti.liferay.service.*" %>
<%@ page import="es.davinciti.liferay.model.*" %>
<%@ page import="es.davinciti.util.Constants" %>

<%@ page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@ page import="com.liferay.portal.kernel.util.*"%>

<script src="//code.jquery.com/jquery-1.10.2.js"></script>

<portlet:defineObjects />

<% ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY); 
long userId = themeDisplay.getUserId();
long companyId = themeDisplay.getCompanyId();
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
long groupId = GroupLocalServiceUtil.getGroup(companyId, Constants.USUARIO_GUEST).getGroupId();
boolean isAdmin = UserGroupRoleLocalServiceUtil.hasUserGroupRole(userId, groupId, Constants.USUARIO_ADMINISTRADOR_ROLE);
boolean isValidad = UserGroupRoleLocalServiceUtil.hasUserGroupRole(userId, groupId, Constants.USUARIO_VALIDADOR_ROLE);
String backURL = ParamUtil.getString(request, "backURL");
String vista = ParamUtil.getString(request, "vista", "U");
%>

<aui:input type="hidden" name="vista" value="<%= vista %>" />

<portlet:actionURL var="addNotaGastoURL" name="addNotaGasto" windowState="normal" />

<ul class="tab" >	
  <c:if test="<%= isAdmin || isValidad || request.isUserInRole(Constants.ADMINISTRADOR_ROLE) %>">
  	<li><a href="#" id="tabDepartamento" class="tablinks" ><liferay-ui:message key='validate'/></a></li>
  </c:if>
  <li><a href="#" id="tabUsuarioHist" class="tablinks" ><liferay-ui:message key='historial'/></a></li>  
  <li><a href="#" id="tabUsuario" class="tablinks" ><liferay-ui:message key='notas-gastos'/></a></li>  
</ul>

<div id="Departamento" class="tabcontent">	
	<div style="width:100%;" >		
		<div id="full" >	
			
		</div>		
	</div>	
</div>

<div id="UsuarioHist" class="tabcontent">
	<div style="width:100%;" >
		<div id="full" >		
			
		</div>		
	</div>	
</div>

<div id="Usuario" class="tabcontent">
	<div style="width:100%;" >
		<div id="full" >	
			<liferay-ui:header backLabel="back" title="back" backURL="<%= backURL %>" />
			<form method="post" action="<%= addNotaGastoURL.toString() %>" id="notaGastoForm" name="notaGastoForm">
				<aui:input type="hidden" name="companyId" value="<%= companyId %>" />
				<aui:input type="hidden" name="userId" value="<%= userId %>" />
				<aui:input type="hidden" name="date" value="<%= dateFormat.format(new Date())  %>" />
				<aui:fieldset label="new-expenses-note-data">
					<aui:layout>			
			 		    <aui:column columnWidth="15" first="true">
			 		    	<aui:select name="organizationId" label="Organization">
								<% List<Organization> userOrganizations = OrganizationLocalServiceUtil.getUserOrganizations(userId);
								for (Organization userOrganization : userOrganizations) { %>
									<aui:option value="<%=userOrganization.getOrganizationId()%>"><%=userOrganization.getName()%></aui:option>
											
								<% 	List<Organization> userSubOrganizations = OrganizationLocalServiceUtil.getSuborganizations(companyId, userOrganization.getOrganizationId()); 
									for (Organization userSubOrganization : userSubOrganizations) { %>
									<aui:option value="<%=userSubOrganization.getOrganizationId()%>"><%=userSubOrganization.getName()%></aui:option>
								<% } 
								} %>
							</aui:select>
			 		    </aui:column>
			 		    <aui:column columnWidth="20" >
			 		    	<aui:input type="text" name="description" label="Description" style="width:270px;" />
			 		    </aui:column>
			 		    <aui:column columnWidth="15" >
			 		    	<aui:input type="text" name="startDate" label="startDate" style="width:120px;cursor:pointer;" readonly="true" />
			 		    </aui:column>
			 		    <aui:column columnWidth="15" >
			 		    	<aui:input type="text" name="endDate" label="endDate" style="width:120px;cursor:pointer;" readonly="true" />
			 		    </aui:column>
			 		    <aui:column columnWidth="35" last="true">
			 		    	<aui:input type="textarea" name="comments" label="Comments" />
			 		    </aui:column> 		    
			 		    <aui:button-row style="text-align:center; width:100%;">
							<aui:button type="submit" value="submit"/> 
			    		</aui:button-row>		 		    
			 		</aui:layout>
			 	</aui:fieldset>
			</form>
		</div>
	</div>
</div>

<c:set var="locale"><%= themeDisplay.getLocale().toString().split("_")[0] %></c:set>

<aui:script>

	YUI({lang: '${locale}'}).use('aui-datepicker', function(Y) {
		new Y.DatePicker({
			trigger: '#<portlet:namespace/>startDate',
			mask: '%d/%m/%Y',
		    popover: {
		    	zIndex: 1
		    }
		});
	});
	
	YUI({lang: '${locale}'}).use('aui-datepicker', function(Y) {
		new Y.DatePicker({
			trigger: '#<portlet:namespace/>endDate',
			mask: '%d/%m/%Y',
		    popover: {
		    	zIndex: 1
		    }
		});
	});

</aui:script>

<script>
	
	$(document).ready(function() {
		$(".tab li a").addClass('disabled');
		if ($("#vista").val() == "D") $("#tabDepartamento").trigger("click");
		else if ($("#vista").val() == "H") $("#tabUsuarioHist").trigger("click");
		else $("#tabUsuario").trigger("click");
		
	});

</script>