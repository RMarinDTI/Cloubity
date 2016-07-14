 /**
 /**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package es.davinciti.liferay.service.impl;

import java.util.ArrayList;
import java.util.List;

import es.davinciti.liferay.model.ConnectionActionTypes;
import es.davinciti.liferay.model.ConnectionConfigs;
import es.davinciti.liferay.model.ConnectionData;
import es.davinciti.liferay.model.ConnectionTypes;
import es.davinciti.liferay.service.ConnectionConfigsLocalServiceUtil;
import es.davinciti.liferay.service.ConnectionTypesLocalServiceUtil;
import es.davinciti.liferay.service.base.ConnectionConfigsLocalServiceBaseImpl;
import es.davinciti.liferay.service.persistence.ConnectionConfigsUtil;
import es.davinciti.servicelayerclient.client.AccountClient_SAPBO;
import es.davinciti.webapiclient.client.AccountClient_SAGE;

/**
 * The implementation of the connection configs local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.ConnectionConfigsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.ConnectionConfigsLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.ConnectionConfigsLocalServiceUtil
 */
public class ConnectionConfigsLocalServiceImpl
	extends ConnectionConfigsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.ConnectionConfigsLocalServiceUtil} to access the connection configs local service.
	 */
	
	public List<ConnectionTypes> getConnectionTypes(long connectionConfigsId) {
			
		List<ConnectionTypes> connectionTypesList = new ArrayList<ConnectionTypes>();
		
		try {
			connectionTypesList = ConnectionConfigsUtil.getConnectionTypeses(connectionConfigsId);
			
		} catch(Exception e) {
			
		}
			
		return connectionTypesList;
	
	}
	
	public List<ConnectionActionTypes> getConnectionActionTypes(long connectionConfigsId) {
		
		List<ConnectionActionTypes> connectionActionTypesList = new ArrayList<ConnectionActionTypes>();
		
		try {
			connectionActionTypesList = ConnectionConfigsUtil.getConnectionActionTypeses(connectionConfigsId);
			
		} catch(Exception e) { }
		
		return connectionActionTypesList;	
	}
	
	
	public List<ConnectionData> getConnectionData(long connectionConfigsId) {
		
		List<ConnectionData> connectionDataList = new ArrayList<ConnectionData>();
		
		try {
			connectionDataList = ConnectionConfigsUtil.getConnectionDatas(connectionConfigsId);
			
		} catch(Exception e) { }
		
		return connectionDataList;	
	}
	
	public void deleteConnectionTypes(long connectionConfigsId) {
		try {
			List<ConnectionTypes> connectionTypeses = ConnectionConfigsUtil.getConnectionTypeses(connectionConfigsId); 
			ConnectionConfigsUtil.removeConnectionTypeses(connectionConfigsId, connectionTypeses);
			ConnectionConfigsUtil.clearConnectionTypeses(connectionConfigsId);
			
		} catch(Exception e) { }		
	}
	
	public void deleteConnectionActionTypes(long connectionConfigsId) {
		try {
			List<ConnectionActionTypes> connectionActionTypeses = ConnectionConfigsUtil.getConnectionActionTypeses(connectionConfigsId); 
			ConnectionConfigsUtil.removeConnectionActionTypeses(connectionConfigsId, connectionActionTypeses);
			ConnectionConfigsUtil.clearConnectionActionTypeses(connectionConfigsId);
			
		} catch(Exception e) { }		
	}
	
	public void deleteConnectionData(long connectionConfigsId) {
		try {
			List<ConnectionData> connectionDatas = ConnectionConfigsUtil.getConnectionDatas(connectionConfigsId); 
			ConnectionConfigsUtil.removeConnectionDatas(connectionConfigsId, connectionDatas);			
			ConnectionConfigsUtil.clearConnectionDatas(connectionConfigsId);			
			
		} catch(Exception e) { }		
	}
	
	public String testConnectionErp(long configId) throws Exception {
		String result = "";
		//System.out.println("testConnectionErp - configId : "+configId);
		// Inicializamos lo necesario
		ConnectionTypes connectionTypes = ConnectionTypesLocalServiceUtil.getConnectionConfigsConnectionTypeses(configId).get(0);
		ConnectionData connectionData = ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0);
		//System.out.println("connectionTypes.getName() : "+connectionTypes.getName());			
		// Conexion SAGE
		if (connectionTypes.getName().equalsIgnoreCase("SAGE")) {
			AccountClient_SAGE accountClient = new AccountClient_SAGE();
			result = accountClient.testConnection(configId);
			//System.out.println("testConnectionErp - result : "+result);				
		} 
		// Conexion SAP BO
		if (connectionTypes.getName().equalsIgnoreCase("SAP BO")) {
			AccountClient_SAPBO accountClient = new AccountClient_SAPBO();	
			accountClient.login(connectionData);
			result = accountClient.test(connectionData);				
			accountClient.logout(connectionData);
			result = "Conexión testeada correctamente. La respuesta recibida sobre el nombre de la divisa USD es : "+result;				     		        								
			//System.out.println("result : "+result);				
		} 		
		
		return result;
	}
	
	public String getInfo(String methodName, long configId, List<String> headers) {
		String result = "";
		String conNameType = "";
		//System.out.println("ConnectionConfigsLocalServiceImpl _ getInfo - methodName : "+methodName);
		try {
			conNameType = ConnectionTypesLocalServiceUtil.getConnectionConfigsConnectionTypeses(configId).get(0).getName();			
		} catch(Exception e) {
			result = e.getMessage();
		}
		if (!conNameType.contentEquals("")) {
			//System.out.println("ConnectionConfigsLocalServiceImpl _ getInfo - conNameType : "+conNameType);
			if (conNameType.contentEquals("SAGE")) {
				AccountClient_SAGE accountClient = new AccountClient_SAGE();
				try {
					result = accountClient.getInfo(methodName, configId, headers);
				} catch(Exception e) {
					result = e.getMessage();
				}
				//System.out.println("ConnectionConfigsLocalServiceImpl _ getInfo - SAGE result : "+result);
			}
			if (conNameType.contentEquals("SAP BO")) {
				AccountClient_SAPBO accountClient = new AccountClient_SAPBO();
				result = accountClient.getInfo(methodName, configId);
				//System.out.println("ConnectionConfigsLocalServiceImpl _ getInfo - SAP BO result : "+result);
			}
		}
		
		return result;
	}
	
	public String getWebAccessToken(long configId, String code) {
		String result = "";
		try {
			ConnectionData conData = ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0);
			AccountClient_SAGE accountClient = new AccountClient_SAGE();
			result = accountClient.webGetAccessToken(conData, code);
		} catch(Exception e) { }
		
		return result;
		
	}
	
	public String getApplicationCode(String secretKey, String applicationCode, String server) {
		String result = "";
		
		AccountClient_SAGE accountClient = new AccountClient_SAGE();
		result = accountClient.getApplicationCode(secretKey, applicationCode, server);		
		
		return result;
	}
	
	public List<ConnectionConfigs> findByCompanyId (long companyId) {
		List<ConnectionConfigs> connections = new ArrayList<ConnectionConfigs>();
		
		try {
			connections = ConnectionConfigsUtil.findByCompanyId(companyId);
		} catch(Exception e) { }
		
		return connections;
	}
}