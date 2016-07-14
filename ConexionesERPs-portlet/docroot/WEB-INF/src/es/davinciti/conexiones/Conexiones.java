package es.davinciti.conexiones;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import es.davinciti.liferay.model.ConnectionActionTypes;
import es.davinciti.liferay.model.ConnectionConfigs;
import es.davinciti.liferay.model.ConnectionData;
import es.davinciti.liferay.model.ConnectionTypes;
import es.davinciti.liferay.model.LineaGasto;
import es.davinciti.liferay.service.ConnectionActionTypesLocalServiceUtil;
import es.davinciti.liferay.service.ConnectionConfigsLocalServiceUtil;
import es.davinciti.liferay.service.ConnectionDataLocalServiceUtil;
import es.davinciti.liferay.service.ConnectionTypesLocalServiceUtil;
import es.davinciti.liferay.service.persistence.NotaGastoUtil;


/**
 * Portlet implementation class Conexiones
 */
public class Conexiones extends MVCPortlet {
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public void addConexionErp(ActionRequest actionRequest, ActionResponse actionResponse) {
		// Recogemos todos los datos
		/* CONFIG */
		String disableDateConfigs = ParamUtil.get(actionRequest, "disbaleDateConfigs", "");
		String companyId = ParamUtil.get(actionRequest, "companyId", "");
		String installationId = ParamUtil.get(actionRequest, "installationId", "");
		String companyCode = ParamUtil.get(actionRequest, "companyCode", "");
		String productCode = ParamUtil.get(actionRequest, "productCode", "");
		/* CONNECTION TYPE */
		long connectionTypeId = ParamUtil.getLong(actionRequest, "nameType", 0);
		String disableDateType = ParamUtil.get(actionRequest, "disableDateType", "");
		/* ACTION TYPE */
		String nameAction = ParamUtil.get(actionRequest, "nameAction", "");
		String disableDateAction = ParamUtil.get(actionRequest, "disableDateAction", "");
		/* CONNECTION DATA */
		String companyDB = ParamUtil.get(actionRequest, "companyDB", "");
		String disableDateData = ParamUtil.get(actionRequest, "disbaleDateData", "");
		String password = ParamUtil.get(actionRequest, "password", "");
		String port = ParamUtil.get(actionRequest, "port", "");
		String server = ParamUtil.get(actionRequest, "server", "");
		String url = ParamUtil.get(actionRequest, "url", "");
		String username = ParamUtil.get(actionRequest, "username", "");
		String secretKey = ParamUtil.get(actionRequest, "secretKey", "");
		String clientId = ParamUtil.get(actionRequest, "clientId", "");
		String clavePrimaria = ParamUtil.get(actionRequest, "clavePrimaria", "");
		String claveSecundaria = ParamUtil.get(actionRequest, "claveSecundaria", "");
		String scope = ParamUtil.get(actionRequest, "scope", "");
		String webSecretKey = ParamUtil.get(actionRequest, "webSecretKey", "");
		String applicationCode = ParamUtil.get(actionRequest, "applicationCode", "");
		// Generamos todas las entidades hijas
		// long connectionTypeId = 0;
		long connectionActionTypeId = 0;
		long connectionDataId = 0;	
		/* CONNECTION TYPES */
		if (connectionTypeId > 0) { 
			try {
				ConnectionTypes connectionTypes = ConnectionTypesLocalServiceUtil.getConnectionTypes(connectionTypeId);
				connectionTypes.setDisableDate(disableDateType.contentEquals("") ? null : dateFormat.parse(disableDateType));
				ConnectionTypesLocalServiceUtil.updateConnectionTypes(connectionTypes);
			} catch(Exception e) { 
				SessionErrors.add(actionRequest.getPortletSession(),"connectionTypes-form-error");
	            //e.printStackTrace();
				System.out.println("");
			}
		}
		/* ACTION TYPES */
		if (connectionTypeId > 0) {		
			try {				
				connectionActionTypeId = CounterLocalServiceUtil.increment(ConnectionActionTypes.class.getName());
				ConnectionActionTypes connectionActionTypes = ConnectionActionTypesLocalServiceUtil.createConnectionActionTypes(connectionActionTypeId);
				connectionActionTypes.setName(nameAction);
				connectionActionTypes.setDisableDate(disableDateAction.contentEquals("") ? null : dateFormat.parse(disableDateAction));
				connectionActionTypes = ConnectionActionTypesLocalServiceUtil.addConnectionActionTypes(connectionActionTypes);
				connectionActionTypeId = connectionActionTypes.getConnectionActionTypeId();
			} catch(Exception e) {
				SessionErrors.add(actionRequest.getPortletSession(),"connectionActionTypes-form-error");
	            e.printStackTrace();
			}
		}
		/* CONNECTION DATA */
		if (connectionActionTypeId > 0) {		
			try {				
				connectionDataId = CounterLocalServiceUtil.increment(ConnectionData.class.getName());
				ConnectionData connectionData = ConnectionDataLocalServiceUtil.createConnectionData(connectionDataId);
				connectionData.setCompanyDB(companyDB);
				connectionData.setDisableDate(disableDateData.contentEquals("") ? null : dateFormat.parse(disableDateData));
				connectionData.setPassword(password);
				connectionData.setPort(port);
				connectionData.setServer(server);
				connectionData.setUrl(url);
				connectionData.setUsername(username);
				connectionData.setSecretKey(secretKey);
				connectionData.setClientId(clientId);
				connectionData.setClavePrimaria(clavePrimaria);
				connectionData.setClaveSecundaria(claveSecundaria);
				connectionData.setScope(scope);
				connectionData.setWebSecretKey(webSecretKey);
				connectionData.setApplicationCode(applicationCode);
				// Si es SAGE y estan informados el ClientId y la SecretKey, calculamos en Base64 el encodedClientCredentials
				if (!clientId.contentEquals("") && !webSecretKey.contentEquals("")) {
					String plainCreds = new String (clientId + ":" + webSecretKey);
					byte[] plainCredsBytes = plainCreds.getBytes();
					String base64Creds = Base64.encode(plainCredsBytes);
					connectionData.setEncodedClientCredentials(base64Creds);
				}
				// Si es SAGE y estan informadas la WebSecretKey y el applicationCode, pedimos el ApplicationToken
				if (!secretKey.contentEquals("") && !applicationCode.contentEquals("")) {
					String applicationToken = ConnectionConfigsLocalServiceUtil.getApplicationCode(secretKey, applicationCode, server);
					connectionData.setApplicationToken(applicationToken);
				}				
				// Generamos el state necesario para las conexiones SAGE
				connectionData.setState(UUID.randomUUID().toString());
				connectionData = ConnectionDataLocalServiceUtil.addConnectionData(connectionData);
				connectionDataId = connectionData.getConnectionDataId();
			} catch(Exception e) {
				SessionErrors.add(actionRequest.getPortletSession(),"connectionData-form-error");
	            e.printStackTrace();
			}
		}
		// Si todo ha ido bien
		/* CONNECTION CONFIGS */
		if (connectionDataId > 0) {
			try {				
				long connectionConfigsId = CounterLocalServiceUtil.increment(ConnectionConfigs.class.getName());
				ConnectionConfigs connectionConfigs = ConnectionConfigsLocalServiceUtil.createConnectionConfigs(connectionConfigsId);
				connectionConfigs.setDisableDate(disableDateConfigs.contentEquals("") ? null : dateFormat.parse(disableDateConfigs));
				connectionConfigs.setCompanyId(Long.parseLong(companyId));
				connectionConfigs.setInstallationId(installationId);
				connectionConfigs.setCompanyCode(companyCode);
				connectionConfigs.setProductCode(productCode);
				connectionConfigs = ConnectionConfigsLocalServiceUtil.addConnectionConfigs(connectionConfigs);
				// Las Foreign Keys
				//System.out.println("Foreign Keys - connectionConfigsId : "+connectionConfigsId+" - connectionTypeId : "+connectionTypeId+" - connectionActionTypeId : "+connectionActionTypeId+" - connectionDataId : "+connectionDataId);
				ConnectionConfigsLocalServiceUtil.addConnectionTypesConnectionConfigs(connectionTypeId, connectionConfigs);
				ConnectionConfigsLocalServiceUtil.addConnectionActionTypesConnectionConfigs(connectionActionTypeId, connectionConfigs);
				ConnectionConfigsLocalServiceUtil.addConnectionDataConnectionConfigs(connectionDataId, connectionConfigs);									
				
				SessionMessages.add(actionRequest.getPortletSession(),"connectionConfigs-form-ok");
			} catch(Exception e) {
				SessionErrors.add(actionRequest.getPortletSession(),"connectionConfigs-form-error");
	            e.printStackTrace();
			}
		}
	
	}
	
	public void editConexionErp(ActionRequest actionRequest, ActionResponse actionResponse) {
		long configId = ParamUtil.getLong(actionRequest, "configId", 0);
		//System.out.println("Conexiones - editConexionErp : configId = "+configId);
		if (configId > 0) {			
			// Recogemos todos los datos
			/* CONFIG */
			String disableDateConfigs = ParamUtil.get(actionRequest, "disbaleDateConfigs", "");
			String companyId = ParamUtil.get(actionRequest, "companyId", "");
			String installationId = ParamUtil.get(actionRequest, "installationId", "");
			String companyCode = ParamUtil.get(actionRequest, "companyCode", "");
			String productCode = ParamUtil.get(actionRequest, "productCode", "");
			/* CONNECTION TYPE */
			long connectionTypeId = ParamUtil.getLong(actionRequest, "nameType", 0);
			String disableDateType = ParamUtil.get(actionRequest, "disableDateType", "");
			/* ACTION TYPE */
			String nameAction = ParamUtil.get(actionRequest, "nameAction", "");
			String disableDateAction = ParamUtil.get(actionRequest, "disableDateAction", "");
			/* CONNECTION DATA */
			String companyDB = ParamUtil.get(actionRequest, "companyDB", "");
			String disableDateData = ParamUtil.get(actionRequest, "disbaleDateData", "");
			String password = ParamUtil.get(actionRequest, "password", "");
			String port = ParamUtil.get(actionRequest, "port", "");
			String server = ParamUtil.get(actionRequest, "server", "");
			String url = ParamUtil.get(actionRequest, "url", "");
			String username = ParamUtil.get(actionRequest, "username", "");
			String secretKey = ParamUtil.get(actionRequest, "secretKey", "");
			String clientId = ParamUtil.get(actionRequest, "clientId", "");
			String clavePrimaria = ParamUtil.get(actionRequest, "clavePrimaria", "");
			String claveSecundaria = ParamUtil.get(actionRequest, "claveSecundaria", "");
			String scope = ParamUtil.get(actionRequest, "scope", "");
			String webSecretKey = ParamUtil.get(actionRequest, "webSecretKey", "");
			String applicationCode = ParamUtil.get(actionRequest, "applicationCode", "");
			String accessToken = ParamUtil.get(actionRequest, "accessToken", "");
			String refreshToken = ParamUtil.get(actionRequest, "refreshToken", "");
			try {
				ConnectionConfigs connectionConfigs = ConnectionConfigsLocalServiceUtil.getConnectionConfigs(configId);
				/* CONNECTION TYPES */
				ConnectionConfigsLocalServiceUtil.deleteConnectionTypes(configId);
				ConnectionTypes connectionTypes = ConnectionTypesLocalServiceUtil.getConnectionTypes(connectionTypeId);
				connectionTypes.setDisableDate(disableDateType.contentEquals("") ? null : dateFormat.parse(disableDateType));
				ConnectionTypesLocalServiceUtil.updateConnectionTypes(connectionTypes);
				ConnectionConfigsLocalServiceUtil.addConnectionTypesConnectionConfigs(connectionTypeId, configId);
				/* ACTION TYPES */
				ConnectionActionTypes connectionActionTypes = ConnectionConfigsLocalServiceUtil.getConnectionActionTypes(configId).get(0);
				connectionActionTypes.setName(nameAction);
				connectionActionTypes.setDisableDate(disableDateAction.contentEquals("") ? null : dateFormat.parse(disableDateAction));
				ConnectionActionTypesLocalServiceUtil.updateConnectionActionTypes(connectionActionTypes);
				/* CONNECTION DATA */
				ConnectionData connectionData = ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0);
				connectionData.setCompanyDB(companyDB);
				connectionData.setDisableDate(disableDateData.contentEquals("") ? null : dateFormat.parse(disableDateData));
				connectionData.setPassword(password);
				connectionData.setPort(port);
				connectionData.setServer(server);
				connectionData.setUrl(url);
				connectionData.setUsername(username);
				connectionData.setSecretKey(secretKey);
				connectionData.setClientId(clientId);
				connectionData.setClavePrimaria(clavePrimaria);
				connectionData.setClaveSecundaria(claveSecundaria);
				connectionData.setScope(scope);
				connectionData.setWebSecretKey(webSecretKey);
				connectionData.setApplicationCode(applicationCode);
				connectionData.setAccessToken(accessToken);
				connectionData.setRefreshToken(refreshToken);
				// Si es SAGE y estan informados el ClientId y la SecretKey, calculamos en Base64 el encodedClientCredentials
				if (!clientId.contentEquals("") && !webSecretKey.contentEquals("")) {
					String plainCreds = new String (clientId + ":" + webSecretKey);
					byte[] plainCredsBytes = plainCreds.getBytes();
					String base64Creds = Base64.encode(plainCredsBytes);
					connectionData.setEncodedClientCredentials(base64Creds);
				}
				// Si es SAGE y estan informadas la WebSecretKey y el applicationCode, pedimos el ApplicationToken
				if (!secretKey.contentEquals("") && !applicationCode.contentEquals("")) {
					String applicationToken = ConnectionConfigsLocalServiceUtil.getApplicationCode(secretKey, applicationCode, server);
					connectionData.setApplicationToken(applicationToken);
				}				
				connectionData = ConnectionDataLocalServiceUtil.updateConnectionData(connectionData);
				/* CONNECTION CONFIGS */
				connectionConfigs.setDisableDate(disableDateConfigs.contentEquals("") ? null : dateFormat.parse(disableDateConfigs));
				connectionConfigs.setCompanyId(Long.parseLong(companyId));
				connectionConfigs.setInstallationId(installationId);
				connectionConfigs.setCompanyCode(companyCode);
				connectionConfigs.setProductCode(productCode);
				ConnectionConfigsLocalServiceUtil.updateConnectionConfigs(connectionConfigs);
				
				SessionMessages.add(actionRequest.getPortletSession(),"connectionConfigs-update-success");
				
			} catch(Exception e) {
				SessionErrors.add(actionRequest.getPortletSession(),"connectionConfigs-update-error");
	            e.printStackTrace();
			}
		}		
				
	}
	
	public void deleteConexionErp(ActionRequest actionRequest, ActionResponse actionResponse) {
		long configId = ParamUtil.getLong(actionRequest, "configId", 0);
		
		if (configId > 0) { 
			try { 
				// Limpiamos las tablas hijas relacionadas
				ConnectionConfigsLocalServiceUtil.deleteConnectionTypes(configId);
				ConnectionConfigsLocalServiceUtil.deleteConnectionActionTypes(configId);
				ConnectionConfigsLocalServiceUtil.deleteConnectionData(configId);
				
				ConnectionConfigsLocalServiceUtil.deleteConnectionConfigs(configId);
				
				SessionMessages.add(actionRequest.getPortletSession(),"connectionConfigs-delete-success");
			} catch(Exception e) {
				SessionErrors.add(actionRequest.getPortletSession(),"connectionConfigs-delete-error");
	            e.printStackTrace();
			}
		}		
	}

}
