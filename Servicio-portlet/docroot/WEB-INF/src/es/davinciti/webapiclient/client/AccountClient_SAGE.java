package es.davinciti.webapiclient.client;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import es.davinciti.liferay.model.ConnectionData;
import es.davinciti.liferay.service.ConnectionConfigsLocalServiceUtil;
import es.davinciti.liferay.service.ConnectionDataLocalServiceUtil;
import es.davinciti.util.Constants;

public class AccountClient_SAGE {	
	
	public String testConnection(long configId) throws Exception {
		//System.out.println("AccountClient_SAGE _ testConnection : running...");
		String result = "";
		// Inicializamos lo necesario
		ConnectionData conData = ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0);
		String refreshToken = conData.getRefreshToken();
		// Comprobamos si es Primera Conexión
		if (refreshToken.contentEquals("")) {
			// Inicializamos conexión
			result = startAuthorizationAttempt(conData);								
		} // Si no es Primera conexión
		else { 
			// Asignamos el token de refresco
			boolean acToken = getAccessToken(conData);
			// Volvemos a recuperar el conData con los datos actualizados
			conData = ConnectionDataLocalServiceUtil.getConnectionConfigsConnectionDatas(configId).get(0);
			//System.out.println("testConnection - acToken : "+acToken);
			// Si tenemos conexión correcta, ejecutamos función de test
			if (acToken) {
				List<String> headers = new ArrayList<String>();
				result = getInfo(Constants.SAGE_GET_COMPANIES, configId, headers);
				if (result.contains("$resources")) {
					JSONObject jsonResult = JSONFactoryUtil.createJSONObject(result);
					JSONArray jsonResources = JSONFactoryUtil.createJSONArray(jsonResult.getString("$resources"));
					JSONObject jsonCompany = jsonResources.getJSONObject(0);
					result = "El nombre de la 1era Company es : "+jsonCompany.getString("name");
				}
			}
		}		
		
		return result;		
	}
	
	public String getInfo(String methodName, long configId, List<String> headers) throws Exception {
		String result = "";
		//System.out.println("AccountClient_SAGE _ getInfo - methodName : "+methodName+" - configId : "+configId+" running...");
		// Comprobamos métodos especiales
		result = SpecialMethodsGet(methodName, configId, headers);
		if (!result.contentEquals("")) {
			return result;
		}
		// Inicializamos lo necesario		
		ConnectionData conData = ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0);		
		// Realizamos la conexión al método solicitado
		String url = "https://"+Constants.SAGE_SERVICES_HOST+Constants.SAGE_MURANO_URL+methodName;		
		//System.out.println("\nSending '"+methodName+"' request to URL : " + url);				
		URL Url = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection)Url.openConnection();	
		con.setRequestMethod("GET");
	    con.setRequestProperty("Content-Type", "application/json");
	    String basicAuth = "Bearer " + conData.getAccessToken();
	    con.setRequestProperty("Authorization", basicAuth);
	    con.setRequestProperty("ocp-apim-subscription-key", conData.getClavePrimaria());
	    con.setRequestProperty("X-Site", ConnectionConfigsLocalServiceUtil.getConnectionConfigs(ConnectionConfigsLocalServiceUtil.getConnectionDataConnectionConfigses(conData.getConnectionDataId()).get(0).getConfigId()).getInstallationId());
	    con.setRequestProperty("authorisation-sls-applicationClient-token", conData.getApplicationToken());
	    //con.setRequestProperty("User-Agent", Constants.SAGE_USER_AGENT);
	    // Comprobamos si hay más cabeceras
	    for (String header : headers) {
	    	//System.out.println("getInfo - header : "+header);
	    	con.setRequestProperty(header.split(Constants.SEPARADOR)[0], header.split(Constants.SEPARADOR)[1]);
	    }
	    //System.out.println("Sending '"+methodName+"' HttpHeaders \n- basicAuth : " + basicAuth+" \n- ocp-apim-subscription-key : "+conData.getClavePrimaria()+" \n- X-Site : "+ConnectionConfigsLocalServiceUtil.getConnectionConfigs(ConnectionConfigsLocalServiceUtil.getConnectionDataConnectionConfigses(conData.getConnectionDataId()).get(0).getConfigId()).getInstallationId()+" \n- authorisation-sls-applicationClient-token : "+conData.getApplicationToken());
	    con.setDoOutput(false);
    	con.setDoInput(true);
    	int responseCode = con.getResponseCode();
    	//System.out.println(" ---- Response Code : " + responseCode);    	
    	BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
    	String inputLine;
    	StringBuffer response = new StringBuffer();

    	while ((inputLine = in.readLine()) != null) {
    		response.append(inputLine);
    	}
    	in.close();    	
    	
    	result = response.toString();
    	//System.out.println("accountClient_SAGE - getInfo ["+methodName+"] - responseCode : "+responseCode+" - response : "+result);
    	    	
    	if (responseCode != 200) {
    		JSONObject jsonResponse = JSONFactoryUtil.createJSONObject(result);
    		result = jsonResponse.getString("message");
    	}   	
    	
		return result;
	}	
	
	public String setInfo(String methodName, long configId, List<String> headers, JSONArray paramsData, Locale locale) {
		String result = "";
		//System.out.println("AccountClient_SAGE _ setInfo - methodName : "+methodName+" - configId : "+configId+" - headers : "+headers.toString()+" - paramsData : "+paramsData+" running...");
		try {
			// Comprobamos métodos especiales
			result = SpecialMethodsPost(methodName, configId, paramsData, locale);
			//System.out.println("AccountClient_SAGE _ setInfo - result after specialmethodspost: "+result);
			if (!result.contentEquals("")) {
				return result;
			}
		} catch(Exception e) {
			System.out.println("setInfo SpecialMethodsPost ERROR : "+e.getMessage());
		}
		if (result.contentEquals("")) {
			try {
				// Inicializamos lo necesario		
				ConnectionData conData = ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0);
				// Realizamos la conexión al método solicitado
				String url = "https://"+Constants.SAGE_SERVICES_HOST+Constants.SAGE_MURANO_URL+methodName;						
				URL Url = new URL(url);
				HttpsURLConnection con = (HttpsURLConnection)Url.openConnection();
				con.setRequestMethod("POST");
			    con.setRequestProperty("Content-Type", "application/json");
			    con.setRequestProperty("Accept", "application/json");
			    String basicAuth = "Bearer " + conData.getAccessToken();
			    con.setRequestProperty("Authorization", basicAuth);
			    con.setRequestProperty("ocp-apim-subscription-key", conData.getClavePrimaria());
			    con.setRequestProperty("X-Site", ConnectionConfigsLocalServiceUtil.getConnectionConfigs(ConnectionConfigsLocalServiceUtil.getConnectionDataConnectionConfigses(conData.getConnectionDataId()).get(0).getConfigId()).getInstallationId());
			    con.setRequestProperty("authorisation-sls-applicationClient-token", conData.getApplicationToken());
			    // Comprobamos si hay más cabeceras
			    for (String header : headers) {
			    	//System.out.println("getInfo - header : "+header.split(Constants.SEPARADOR)[0]+" , "+header.split(Constants.SEPARADOR)[1]);
			    	con.setRequestProperty(header.split(Constants.SEPARADOR)[0], header.split(Constants.SEPARADOR)[1]);
			    }
			    System.out.println("headers - Authorization : "+basicAuth+" - ocp-apim-subscription-key : "+conData.getClavePrimaria()+" - X-Site : "+
			    		ConnectionConfigsLocalServiceUtil.getConnectionConfigs(ConnectionConfigsLocalServiceUtil.getConnectionDataConnectionConfigses(conData.getConnectionDataId()).get(0).getConfigId()).getInstallationId()+
			    		" - authorisation-sls-applicationClient-token : "+conData.getApplicationToken()+" - headers(sin tratar) : "+headers);
			    con.setDoOutput(true);
		    	con.setDoInput(true);	    
		    	OutputStreamWriter streamWriter = new OutputStreamWriter(con.getOutputStream());        
			    // Preparamos el envío de los campos POST
			    //System.out.println("setInfo - paramsData.length() : "+paramsData.length()+" - paramsData : "+paramsData.toString());
				for (int i=0; i<paramsData.length(); i++) {
					JSONObject paramJson = paramsData.getJSONObject(i);
					//System.out.println("setInfo - paramJson : "+paramJson.toString());
					streamWriter.write(paramJson.toString());
				}
				streamWriter.flush();
						
		    	int responseCode = con.getResponseCode();
		    	//System.out.println("setInfo - methodName : "+methodName+" - Response Code : "+responseCode);		    	
		    	//StringBuilder stringBuilder = new StringBuilder();
		    	InputStream in = new BufferedInputStream(con.getInputStream());
		        //BufferedInputStream bufferedReader = new BufferedInputStream(streamReader);
		        JSONObject response = JSONFactoryUtil.createJSONObject(getResponseText(in));		        
		    	//System.out.println("accountClient_SAGE - setInfo ["+methodName+"] - responseCode : "+responseCode+" - response : "+stringBuilder.toString());
		        con.disconnect();
		        result = String.valueOf(responseCode);		        
		    	//System.out.println("setInfo ["+methodName+"] - responseCode : "+responseCode+" - response : "+result);
			} catch(Exception e) {
				System.out.println("setInfo ERROR : "+e.getMessage());
			}
		} 
		
		return result;
	}
	
	private static String getResponseText(InputStream inStream) {
	    // very nice trick from 
	    // http://weblogs.java.net/blog/pat/archive/2004/10/stupid_scanner_1.html
	    return new Scanner(inStream).useDelimiter("\\A").next();
	}
	
	public String SpecialMethodsGet(String methodName, long configId, List<String> headers) {
		String result = "";
		Methods methods = new Methods();
		// Comprobamos si es algún método especial
		// Migrar Usuarios
		if (methodName.contentEquals(Constants.SAGE_MIGRATE_USUARIOS)) {			
			result = methods.MigrarUsuarios(configId);
		}		
		
		return result;		
	}
	
	public String SpecialMethodsPost(String methodName, long configId, JSONArray paramsData, Locale locale) {
		//System.out.println("SpecialMethodsPost - methodName : "+methodName);
		String result = "";
		Methods methods = new Methods();
		// Comprobamos si es algún método especial
		// Validar Nota
		if (methodName.contentEquals(Constants.METODO_ESPECIAL_VALIDAR_NOTAGASTO)) {			
			result = methods.validarNotaGasto(configId, paramsData, locale);
			//System.out.println("SpecialMethodsPost - result : "+result);
		}		
		
		return result;
	}
	
	public String webGetAccessToken(ConnectionData conData, String code) throws Exception {
		//System.out.println("AccountClient_SAGE _ webGetAccessToken running...");
		String result = "";
		try {
			//long configId = ConnectionConfigsLocalServiceUtil.getConnectionDataConnectionConfigses(conData.getConnectionDataId()).get(0).getConfigId();
			String url = "https://"+Constants.SAGE_CONNECTION_URL+Constants.ACCESS_TOKEN;		
			String basicAuth = "Basic "+conData.getEncodedClientCredentials();
			URLConnection con = new URL(url).openConnection();
			con.setDoOutput(true);
			String content =
				"grant_type=authorization_code"+
				"&redirect_uri="+ URLEncoder.encode(Constants.REDIRECT_URI, "UTF-8")+	
				"&code="+code;			
			con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");			
			con.setRequestProperty("Authorization", basicAuth);
			con.setRequestProperty("Content-Length", String.valueOf(content.getBytes().length));			
			//System.out.println("Content-Length : "+content.getBytes().length);			
			DataOutputStream output = new DataOutputStream(con.getOutputStream()); 
			output.writeBytes(content);
			output.flush();
			output.close();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    	String inputLine;
	    	StringBuffer response = new StringBuffer();
	
	    	while ((inputLine = in.readLine()) != null) {
	    		response.append(inputLine);
	    	}
	    	in.close();		
	    	
	    	result = response.toString();	    	    				
			//System.out.println("webGetAccessToken - response : "+result);			
			if (result.contains("access_token")) {
				JSONObject jsonResp = JSONFactoryUtil.createJSONObject(result);
				conData.setAccessToken(jsonResp.getString("access_token"));
				conData.setRefreshToken(jsonResp.getString("refresh_token"));
				ConnectionDataLocalServiceUtil.updateConnectionData(conData);
			}		
	    	
			result = "OK";
		} catch(Exception e) {
			//e.printStackTrace();
			System.out.println("webGetAccessToken ERROR "+e.getMessage());
		}
		
		return result;
	}
	
	public boolean getAccessToken(ConnectionData conData) throws Exception {		
		//System.out.println("AccountClient_SAGE _ getAccessToken : running...");		
		boolean isOk = false;		
		String url = "https://"+Constants.SAGE_CONNECTION_URL+Constants.ACCESS_TOKEN;		
		URL Url = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection)Url.openConnection();
		con.setRequestMethod("POST");
	    con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	    String basicAuth = "Basic " + conData.getEncodedClientCredentials();
	    con.setRequestProperty("Authorization", basicAuth);
	    String formParams = "?grant_type=refresh_token";
	    formParams += "&refresh_token="+conData.getRefreshToken();
	    con.setDoOutput(true);
    	con.setDoInput(true);
    	//System.out.println("Sending 'getAccessToken' request to URL : " + url+" with Post parameters : " + formParams+" - authorization : "+conData.getEncodedClientCredentials());
	    DataOutputStream wr = new DataOutputStream(con.getOutputStream());	    	     
	    wr.writeBytes(formParams);
    	wr.flush();
    	wr.close();
    	int responseCode = con.getResponseCode();
    	//System.out.println(" ---- Response Code : " + responseCode);
    	//System.out.println("Post parameters : " + json.toString());
    	//System.out.println("Response Code : " + responseCode);
    	BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
    	String inputLine;
    	StringBuffer response = new StringBuffer();
    	while ((inputLine = in.readLine()) != null) {
    		response.append(inputLine);
    	}
    	in.close();
    	//System.out.println("getAccessToken - response : "+response.toString());    	
	    // Si todo ha ido bien
    	if (responseCode == 200) {
    		String refreshToken = JSONFactoryUtil.createJSONObject(response.toString()).getString("refresh_token");
    		String accessToken = JSONFactoryUtil.createJSONObject(response.toString()).getString("access_token");
    		//System.out.println("refresh token : "+refreshToken+" - accessToken : "+accessToken);
    		conData.setAccessToken(accessToken);
    		conData.setRefreshToken(refreshToken);
    		ConnectionDataLocalServiceUtil.updateConnectionData(conData);
    		isOk = true;
    	}   	
		
    	return isOk;
	}	
	
	public String startAuthorizationAttempt(ConnectionData conData) throws Exception {
		//System.out.println("AccountClient_SAGE _ startAuthorizationAttempt : running...");
		String result = "";
		// Recuperamos los valores del resultado de logueo en formulario SAGEID
		result = authorizationAttempt(conData);			
		//System.out.println("AccountClient_SAGE _ startAuthorizationAttempt : finished");
		
		return result;
	}	
	
	private String authorizationAttempt(ConnectionData conData) {
		//System.out.println("AccountClient_SAGE _ authorizationAttempt : running...");
		String result = ""; 
		try {
			String url = "https://"+Constants.SAGE_CONNECTION_URL+Constants.START_AUTHORIZATION;
			// build parameters list
			String formParams = "response_type=code";
			formParams += "&client_id="+URLEncoder.encode(conData.getClientId(), "UTF-8");
			formParams += "&redirect_uri="+URLEncoder.encode(Constants.REDIRECT_URI, "UTF-8");
			formParams += "&state="+URLEncoder.encode(conData.getState(), "UTF-8");
			formParams += "&scope="+URLEncoder.encode(conData.getScope(), "UTF-8");
			formParams += "&template_name=Sage2013";
			url += "?"+formParams;
				    	
	    	result = url;
		} catch(Exception e) {
			System.out.println("AccountClient_SAGE _ authorizationAttempt - ERROR : "+e.getMessage());
		}    	
		
		return result;
	}
	
	public String getApplicationCode(String secretKey, String applicationCode, String Server) {
		//System.out.println("AccountClient_SAGE _ getApplicationCode : running...");
		String result = "";
		final String server = Server;
		try {
			String url = "https://"+Constants.SAGE_APPLICATION_TOKEN_URL;
			URL Url = new URL(url);
			HttpsURLConnection con = (HttpsURLConnection)Url.openConnection();
			SSLContext sslc = SSLContext.getInstance("TLS");
	        TrustManager[] trustManagerArray = { new NullX509TrustManager() };
	        sslc.init(null, trustManagerArray, null);
	        con.setSSLSocketFactory(sslc.getSocketFactory());
	        con.setHostnameVerifier(new HostnameVerifier(){
			    public boolean verify(String hostname, SSLSession sslSession) {
			    	if (hostname.equals(server)) {
			    		return true;
			    	}
			    	else {
			    		return false;
			    	}        		    	                        
			    }
			});			
			con.setDoOutput(true);
			String content =
				"secretKey=" + secretKey +
				"&applicationCode=" + applicationCode;			
			con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");			
			//System.out.println("Content-Length : "+content.getBytes().length);			
			DataOutputStream output = new DataOutputStream(con.getOutputStream()); 
			output.writeBytes(content);
			output.flush();
			output.close();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    	String inputLine;
	    	StringBuffer response = new StringBuffer();
	
	    	while ((inputLine = in.readLine()) != null) {
	    		response.append(inputLine);
	    	}
	    	in.close();		
	    	
	    	result = response.toString();	    	    				
			//System.out.println("getApplicationCode - response : "+result);			
			if (result.contains("token")) {
				JSONObject applicationToken = JSONFactoryUtil.createJSONObject(result);
				result = applicationToken.getString("token");
				//System.out.println("getApplicationCode - token : "+result);
			}
			
		} catch(Exception e) { 
			System.out.println("getApplicationCode ERROR "+e.getMessage());
		}
		
		return result;
	}
	
	private static class NullX509TrustManager implements X509TrustManager {
		
	    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
	    	//logger.info("checkClientTrusted...");
	    	System.out.println("checkClientTrusted...");
	    }
	    
	    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
	    	//logger.info("checkServerTrusted...");
	    	System.out.println("checkServerTrusted...");
	    }
	    
	    public X509Certificate[] getAcceptedIssuers() {
	        return new X509Certificate[0];
	    }
	}
	
}
