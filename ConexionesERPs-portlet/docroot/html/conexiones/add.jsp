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
<%@page import="javax.portlet.*"%>
<%@page import="java.util.*"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="es.davinciti.liferay.service.ConnectionTypesLocalServiceUtil" %>
<%@page import="es.davinciti.liferay.model.ConnectionTypes" %>

<portlet:defineObjects />

<portlet:actionURL var="addConexionURL" name="addConexionErp" windowState="normal" />
<%
	List<ConnectionTypes> connectionTypes = ConnectionTypesLocalServiceUtil.getConnectionTypeses(-1, -1);
%>

<div id="myTab">
	<ul class="nav nav-tabs">
    	<li class="active"><a href="#tab-1">SAGE</a></li>
    	<li><a href="#tab-2">SAP BO</a></li>
  	</ul>
	<div class="tab-content">
    	<div id="tab-1" class="tab-pane">
      		<form method="post" action="<%= addConexionURL.toString() %>" id="sage_form" name="sage_form">
				<aui:fieldset label="Datos de la Nueva Conexión - SAGE">
					<aui:layout>
						<aui:column columnWidth="100"><h4 style="text-align:center;">CONFIGURACIÓN</h4></aui:column>
			 		    <aui:column columnWidth="20" first="true">
			 		    	<aui:input type="text" name="companyId" label="Company ID" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="installationId" label="Installation ID" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="productCode" label="Product Code" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="disableDateConfigs" label="Disable Date (DD/MM/YYYY)" />
			 		    </aui:column>
			 		     <aui:column columnWidth="20" last="true">&nbsp;</aui:column>
			 		    <aui:column columnWidth="40" first="true"><h4 style="text-align:center;">TIPO DE CONEXIÓN</h4></aui:column>
			 		    <aui:column columnWidth="60" last="true"><h4 style="text-align:center;">TIPO DE ACCIÓN</h4></aui:column>
			 		    <aui:column columnWidth="20" first="true">
			 		    	<aui:select name="nameType" label ="Name">
							<% for (ConnectionTypes connectiontype : connectionTypes) { %>
		 						<aui:option value="<%= connectiontype.getConnectionTypeId() %>"><%= connectiontype.getName() %></aui:option>
							<% } %>
		 					</aui:select>	
			 		    </aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="disableDateType" label="Disable Date (DD/MM/YYYY)" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20">&nbsp;</aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="nameAction" label="Name" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20" last="true">
			 		    	<aui:input type="text" name="disableDateAction" label="Disable Date (DD/MM/YYYY)" />
			 		    </aui:column>
			 		    <aui:column columnWidth="100"><h4 style="text-align:center;">DATOS DE CONEXIÓN</h4></aui:column>
			 		    <aui:column columnWidth="20" first="true">
			 		    	<aui:input type="text" name="server" label="Server" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="url" label="Url" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="secretKey" label="Secret Key" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="clientId" label="Client ID" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20" last="true">
			 		    	<aui:input type="text" name="scope" label="Scope" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20" first="true">
			 		    	<aui:input type="text" name="clavePrimaria" label="Primary Key" />
			 		    </aui:column>			 		    
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="claveSecundaria" label="Secondary Key" />
			 		    </aui:column>			 
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="username" label="Username" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="password" label="Password" />
			 		    </aui:column>			 		    		    
			 		    <aui:column columnWidth="20" last="true">
			 		    	<aui:input type="text" name="disableDateData" label="Disable Date (DD/MM/YYYY)" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20" first="true">
			 		    	<aui:input type="text" name="webSecretKey" label="Web Secret Key" />
			 		    </aui:column>
			 		    <aui:column columnWidth="80" last="true">
			 		    	<aui:input type="text" name="applicationCode" label="Application Code" />
			 		    </aui:column>
			 		    <aui:button-row>
							<aui:button type="submit" value="submit"/> 
	      				</aui:button-row>		 		    
			 		</aui:layout>
			 	</aui:fieldset>
			</form>
    	</div>
    	<div id="tab-2">
      		<form method="post" action="<%= addConexionURL.toString() %>"  id="sap_form" name="sap_form">
				<aui:fieldset label="Datos de la Nueva Conexión - SAP BO">
					<aui:layout>
						<aui:column columnWidth="100"><h4 style="text-align:center;">CONFIGURACIÓN</h4></aui:column>
			 		    <aui:column columnWidth="20" first="true">
			 		    	<aui:input type="text" name="companyId" label="Company ID" />
			 		    </aui:column>
			 		    <aui:column columnWidth="80" last="true">
			 		    	<aui:input type="text" name="disableDateConfigs" label="Disable Date (DD/MM/YYYY)" />
			 		    </aui:column>			 		    
			 		    <aui:column columnWidth="40" first="true"><h4 style="text-align:center;">TIPO DE CONEXIÓN</h4></aui:column>
			 		    <aui:column columnWidth="60" last="true"><h4 style="text-align:center;">TIPO DE ACCIÓN</h4></aui:column>
			 		    <aui:column columnWidth="20" first="true">
			 		    	<aui:select name="nameType" label ="Name">
							<% for (ConnectionTypes connectiontype : connectionTypes) { %>
		 						<aui:option value="<%= connectiontype.getConnectionTypeId() %>"><%= connectiontype.getName() %></aui:option>
							<% } %>
		 					</aui:select>
			 		    </aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="disableDateType" label="Disable Date (DD/MM/YYYY)" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20">&nbsp;</aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="nameAction" label="Name" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20" last="true">
			 		    	<aui:input type="text" name="disableDateAction" label="Disable Date (DD/MM/YYYY)" />
			 		    </aui:column>
			 		    <aui:column columnWidth="100"><h4 style="text-align:center;">DATOS DE CONEXIÓN</h4></aui:column>
			 		    <aui:column columnWidth="20" first="true">
			 		    	<aui:input type="text" name="companyDB" label="Company DB" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="server" label="Server" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="port" label="Port" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20">
			 		    	<aui:input type="text" name="url" label="Url" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20" last="true">
			 		    	<aui:input type="text" name="disableDateData" label="Disable Date (DD/MM/YYYY)" />
			 		    </aui:column>
			 		    <aui:column columnWidth="20" first="true">
			 		    	<aui:input type="text" name="username" label="Username" />
			 		    </aui:column>
			 		    <aui:column columnWidth="80" last="true">
			 		    	<aui:input type="text" name="password" label="Password" />
			 		    </aui:column>			 		    
			 		    <aui:button-row>
							<aui:button type="submit" value="submit"/>
	      				</aui:button-row>		 		    
			 		</aui:layout>
			 	</aui:fieldset>
			</form>
    	</div>
    </div>
</div>

<script>
YUI().use(
  'aui-tabview',
  function(Y) {
    new Y.TabView(
      {
        srcNode: '#myTab'
      }
    ).render();
  }
);

</script>