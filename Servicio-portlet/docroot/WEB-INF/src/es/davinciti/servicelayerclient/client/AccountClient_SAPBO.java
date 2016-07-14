package es.davinciti.servicelayerclient.client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;

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


public class AccountClient_SAPBO {
	
/* ------------------ CLASES DE CONEXION ------------------------------ */
	public void login(ConnectionData connectionData) throws Exception {	
		String result = "";
		//logger.info("AccountClient - login() running...");
		//logger.info("credentials: " + credentials);
		//System.out.println("AccountClient - login() running...");		
		// Inicializamos parametros
		final String server = connectionData.getServer();
		String url = "https://"+server+":"+connectionData.getPort()+connectionData.getUrl()+Constants.LOGIN_END_POINT;
		JSONObject json = JSONFactoryUtil.createJSONObject();
		json.put("CompanyDB", connectionData.getCompanyDB());
		json.put("UserName", connectionData.getUsername());
		json.put("Password", connectionData.getPassword());	
		//System.out.println("url: " + url+" - json : "+json.toString());
		// Iniciamos Conexión
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
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        con.setDoOutput(true);
    	con.setDoInput(true);	            
        // Send post request
    	DataOutputStream wr = new DataOutputStream(con.getOutputStream());
    	wr.writeBytes(json.toString());
    	wr.flush();
    	wr.close();

    	int responseCode = con.getResponseCode();
    	System.out.println("\nSending 'login' request to URL : " + url+" with Post parameters : " + json.toString()+" and Response Code : " + responseCode);
    	//System.out.println("Post parameters : " + json.toString());
    	//System.out.println("Response Code : " + responseCode);

    	BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
    	String inputLine;
    	StringBuffer response = new StringBuffer();

    	while ((inputLine = in.readLine()) != null) {
    		response.append(inputLine);
    	}
    	in.close();
    	String sessionId = "";
    	try {
    		sessionId = JSONFactoryUtil.createJSONObject(response.toString()).getString("SessionId");
    		connectionData.setSessionId(sessionId);
    		ConnectionDataLocalServiceUtil.updateConnectionData(connectionData);
    	} catch(Exception e) {
    		System.out.println("login ERROR : "+e.getMessage());
    	}
    	result = response.toString(); 		
		//System.out.println("result : "+result);		
		//return result;
	}
	
	public String test(ConnectionData connectionData) {
		String result = "";
		//System.out.println("AccountClient - test() running...");
		String sessionId = connectionData.getSessionId();
		if (!sessionId.contentEquals("")) {
			try {
				// Inicializamos parametros
				final String server = connectionData.getServer();
				String url = "https://"+server+":"+connectionData.getPort()+connectionData.getUrl()+"/Currencies('USD')";				
				//System.out.println("url: " + url+" - sessionId : "+sessionId);
				// Iniciamos Conexión
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
		        con.setRequestMethod("GET");
		        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		        con.setRequestProperty("Cookie", "B1SESSION="+sessionId);
		        con.setDoOutput(true);
		    	con.setDoInput(true);	            
		        // Send post request
		    	//DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		    	//wr.writeBytes(json.toString());
		    	//wr.flush();
		    	//wr.close();
		
		    	int responseCode = con.getResponseCode();
		    	System.out.println("\nSending 'GET' request to URL : " + url);
		    	//System.out.println("Post parameters : " + json.toString());
		    	System.out.println("Response Code : " + responseCode);
		
		    	BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		    	String inputLine;
		    	StringBuffer response = new StringBuffer();
		
		    	while ((inputLine = in.readLine()) != null) {
		    		response.append(inputLine);
		    	}
		    	in.close();		    	
		    	String nameDivisa = "";
		    	try {
		    		nameDivisa = JSONFactoryUtil.createJSONObject(response.toString()).getString("Name");
		    	} catch(Exception e) {
		    		System.out.println("login ERROR : "+e.getMessage());
		    	}
		    	
		    	result = nameDivisa;	 		
			} catch(Exception e) {			
				//e.printStackTrace();
				System.out.println("Error en la Conexión. "+e.getMessage());
				result = e.getMessage();
			}
		}		
		//System.out.println("result : "+result);		
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
	
	public void logout(ConnectionData connectionData) throws Exception {
		//System.out.println("AccountClient - logout() running...");
		String result = "";
		String sessionId = connectionData.getSessionId();
		if (!sessionId.contentEquals("")) {
			// Inicializamos parametros		
			final String server = connectionData.getServer();
			String url = "https://"+server+":"+connectionData.getPort()+connectionData.getUrl()+Constants.LOGOUT_END_POINT;				
			//System.out.println("url: " + url+" - sessionId : "+sessionId);
			// Iniciamos Conexión
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
	        con.setRequestMethod("POST");
	        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	        con.addRequestProperty("Cookie", "B1SESSION="+sessionId);
	        con.setDoOutput(true);
	    	con.setDoInput(true);	        
	
	    	int responseCode = con.getResponseCode();
	    	System.out.println("\nSending 'logout' request to URL : " + url+" with Response Code : " + responseCode);
	    	//System.out.println("Cookie parameters : - B1SESSION=" + sessionId);
	    	//System.out.println("Response Code : " + responseCode);	 						
		}
	}

/* -------------------- CLASES DE SERVICIOS ----------------------- */
			
	private String getMethodJSON(ConnectionData conData, String methodName) throws Exception {
		String result = "";
		String sessionId = conData.getSessionId();
		if (!sessionId.contentEquals("")) {
			// Inicializamos parametros
			final String server = conData.getServer();
			String url = "https://"+server+":"+conData.getPort()+conData.getUrl()+"/"+methodName;			
			//System.out.println("url: " + url+" - sessionId : "+sessionId);
			// Iniciamos Conexión
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
	        con.setRequestMethod("GET");
	        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	        con.setRequestProperty("Cookie", "B1SESSION="+sessionId);
	        con.setDoOutput(true);
	    	con.setDoInput(true);	            
	    	BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    	String inputLine;
	    	StringBuffer response = new StringBuffer();	
	    	while ((inputLine = in.readLine()) != null) {
	    		response.append(inputLine);
	    	}
	    	in.close();
	    	
	    	result = response.toString();	    	
	    	//System.out.println("AccountClient_SAPBO _ getMethodJSON - method : "+methodName+" - result : "+result);				
		}
		
		return result;
	}
	
	public String getInfo(String methodName, long configId) {
		String result = "";
		JSONArray jsonArrayF = JSONFactoryUtil.createJSONArray();
		if (configId > 0) {
			try {
				// Recuperamos el ConnectionData
				ConnectionData conData = ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0);
				// Iniciamos conexión
				login(conData);
				// Recuperamos información del método
				result = getMethodJSON(conData, methodName);
				JSONObject resJson = JSONFactoryUtil.createJSONObject(result.toString());
				JSONArray jsonArrayI = JSONFactoryUtil.createJSONArray(resJson.getString("value"));
				if (!resJson.has("odata.nextLink")) {
					for (int index = 0; index < jsonArrayI.length(); index++) {
			    		JSONObject jsonObject = jsonArrayI.getJSONObject(index);
			    		jsonArrayF.put(jsonObject);
			    	}
				} else {
			    	// Si tiene paginación, iteramos		    	
					while (resJson.has("odata.nextLink")) {	    		
			    		String newMethodName = resJson.getString("odata.nextLink").substring(resJson.getString("odata.nextLink").lastIndexOf("/")+1, resJson.getString("odata.nextLink").length());
				    	result = getMethodJSON(conData, newMethodName);
				    	JSONArray jsonArrayIT = JSONFactoryUtil.createJSONArray(resJson.getString("value"));
				    	for (int index = 0; index < jsonArrayIT.length(); index++) {
				    		JSONObject jsonObjectT = jsonArrayIT.getJSONObject(index);
				    		jsonArrayF.put(jsonObjectT);
				    	}			    	
				    	resJson = JSONFactoryUtil.createJSONObject(result.toString());			    		
				    }
				}
		    	result = jsonArrayF.toString();
				//System.out.println("AccountClient_SAPBO _ getInfo - result : "+result);	
				// Realizamos logout
				logout(conData);				
			} catch(Exception e) { 
				System.out.println("AccountClient_SAPBO _ getInfo - Error en la Conexión. "+e.getMessage());			
			}
		}		
		
		return result;
	}
	
}
