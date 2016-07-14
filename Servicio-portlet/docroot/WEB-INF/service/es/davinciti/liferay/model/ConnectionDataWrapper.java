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

package es.davinciti.liferay.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ConnectionData}.
 * </p>
 *
 * @author Cmes
 * @see ConnectionData
 * @generated
 */
public class ConnectionDataWrapper implements ConnectionData,
	ModelWrapper<ConnectionData> {
	public ConnectionDataWrapper(ConnectionData connectionData) {
		_connectionData = connectionData;
	}

	@Override
	public Class<?> getModelClass() {
		return ConnectionData.class;
	}

	@Override
	public String getModelClassName() {
		return ConnectionData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("connectionDataId", getConnectionDataId());
		attributes.put("companyDB", getCompanyDB());
		attributes.put("username", getUsername());
		attributes.put("password", getPassword());
		attributes.put("url", getUrl());
		attributes.put("server", getServer());
		attributes.put("port", getPort());
		attributes.put("accessToken", getAccessToken());
		attributes.put("refreshToken", getRefreshToken());
		attributes.put("disableDate", getDisableDate());
		attributes.put("secretKey", getSecretKey());
		attributes.put("applicationToken", getApplicationToken());
		attributes.put("clientId", getClientId());
		attributes.put("tokenType", getTokenType());
		attributes.put("expiresIn", getExpiresIn());
		attributes.put("scope", getScope());
		attributes.put("clavePrimaria", getClavePrimaria());
		attributes.put("claveSecundaria", getClaveSecundaria());
		attributes.put("sessionId", getSessionId());
		attributes.put("encodedClientCredentials", getEncodedClientCredentials());
		attributes.put("state", getState());
		attributes.put("webSecretKey", getWebSecretKey());
		attributes.put("applicationCode", getApplicationCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long connectionDataId = (Long)attributes.get("connectionDataId");

		if (connectionDataId != null) {
			setConnectionDataId(connectionDataId);
		}

		String companyDB = (String)attributes.get("companyDB");

		if (companyDB != null) {
			setCompanyDB(companyDB);
		}

		String username = (String)attributes.get("username");

		if (username != null) {
			setUsername(username);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String server = (String)attributes.get("server");

		if (server != null) {
			setServer(server);
		}

		String port = (String)attributes.get("port");

		if (port != null) {
			setPort(port);
		}

		String accessToken = (String)attributes.get("accessToken");

		if (accessToken != null) {
			setAccessToken(accessToken);
		}

		String refreshToken = (String)attributes.get("refreshToken");

		if (refreshToken != null) {
			setRefreshToken(refreshToken);
		}

		Date disableDate = (Date)attributes.get("disableDate");

		if (disableDate != null) {
			setDisableDate(disableDate);
		}

		String secretKey = (String)attributes.get("secretKey");

		if (secretKey != null) {
			setSecretKey(secretKey);
		}

		String applicationToken = (String)attributes.get("applicationToken");

		if (applicationToken != null) {
			setApplicationToken(applicationToken);
		}

		String clientId = (String)attributes.get("clientId");

		if (clientId != null) {
			setClientId(clientId);
		}

		String tokenType = (String)attributes.get("tokenType");

		if (tokenType != null) {
			setTokenType(tokenType);
		}

		Integer expiresIn = (Integer)attributes.get("expiresIn");

		if (expiresIn != null) {
			setExpiresIn(expiresIn);
		}

		String scope = (String)attributes.get("scope");

		if (scope != null) {
			setScope(scope);
		}

		String clavePrimaria = (String)attributes.get("clavePrimaria");

		if (clavePrimaria != null) {
			setClavePrimaria(clavePrimaria);
		}

		String claveSecundaria = (String)attributes.get("claveSecundaria");

		if (claveSecundaria != null) {
			setClaveSecundaria(claveSecundaria);
		}

		String sessionId = (String)attributes.get("sessionId");

		if (sessionId != null) {
			setSessionId(sessionId);
		}

		String encodedClientCredentials = (String)attributes.get(
				"encodedClientCredentials");

		if (encodedClientCredentials != null) {
			setEncodedClientCredentials(encodedClientCredentials);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String webSecretKey = (String)attributes.get("webSecretKey");

		if (webSecretKey != null) {
			setWebSecretKey(webSecretKey);
		}

		String applicationCode = (String)attributes.get("applicationCode");

		if (applicationCode != null) {
			setApplicationCode(applicationCode);
		}
	}

	/**
	* Returns the primary key of this connection data.
	*
	* @return the primary key of this connection data
	*/
	@Override
	public long getPrimaryKey() {
		return _connectionData.getPrimaryKey();
	}

	/**
	* Sets the primary key of this connection data.
	*
	* @param primaryKey the primary key of this connection data
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_connectionData.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the connection data ID of this connection data.
	*
	* @return the connection data ID of this connection data
	*/
	@Override
	public long getConnectionDataId() {
		return _connectionData.getConnectionDataId();
	}

	/**
	* Sets the connection data ID of this connection data.
	*
	* @param connectionDataId the connection data ID of this connection data
	*/
	@Override
	public void setConnectionDataId(long connectionDataId) {
		_connectionData.setConnectionDataId(connectionDataId);
	}

	/**
	* Returns the company d b of this connection data.
	*
	* @return the company d b of this connection data
	*/
	@Override
	public java.lang.String getCompanyDB() {
		return _connectionData.getCompanyDB();
	}

	/**
	* Sets the company d b of this connection data.
	*
	* @param companyDB the company d b of this connection data
	*/
	@Override
	public void setCompanyDB(java.lang.String companyDB) {
		_connectionData.setCompanyDB(companyDB);
	}

	/**
	* Returns the username of this connection data.
	*
	* @return the username of this connection data
	*/
	@Override
	public java.lang.String getUsername() {
		return _connectionData.getUsername();
	}

	/**
	* Sets the username of this connection data.
	*
	* @param username the username of this connection data
	*/
	@Override
	public void setUsername(java.lang.String username) {
		_connectionData.setUsername(username);
	}

	/**
	* Returns the password of this connection data.
	*
	* @return the password of this connection data
	*/
	@Override
	public java.lang.String getPassword() {
		return _connectionData.getPassword();
	}

	/**
	* Sets the password of this connection data.
	*
	* @param password the password of this connection data
	*/
	@Override
	public void setPassword(java.lang.String password) {
		_connectionData.setPassword(password);
	}

	/**
	* Returns the url of this connection data.
	*
	* @return the url of this connection data
	*/
	@Override
	public java.lang.String getUrl() {
		return _connectionData.getUrl();
	}

	/**
	* Sets the url of this connection data.
	*
	* @param url the url of this connection data
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_connectionData.setUrl(url);
	}

	/**
	* Returns the server of this connection data.
	*
	* @return the server of this connection data
	*/
	@Override
	public java.lang.String getServer() {
		return _connectionData.getServer();
	}

	/**
	* Sets the server of this connection data.
	*
	* @param server the server of this connection data
	*/
	@Override
	public void setServer(java.lang.String server) {
		_connectionData.setServer(server);
	}

	/**
	* Returns the port of this connection data.
	*
	* @return the port of this connection data
	*/
	@Override
	public java.lang.String getPort() {
		return _connectionData.getPort();
	}

	/**
	* Sets the port of this connection data.
	*
	* @param port the port of this connection data
	*/
	@Override
	public void setPort(java.lang.String port) {
		_connectionData.setPort(port);
	}

	/**
	* Returns the access token of this connection data.
	*
	* @return the access token of this connection data
	*/
	@Override
	public java.lang.String getAccessToken() {
		return _connectionData.getAccessToken();
	}

	/**
	* Sets the access token of this connection data.
	*
	* @param accessToken the access token of this connection data
	*/
	@Override
	public void setAccessToken(java.lang.String accessToken) {
		_connectionData.setAccessToken(accessToken);
	}

	/**
	* Returns the refresh token of this connection data.
	*
	* @return the refresh token of this connection data
	*/
	@Override
	public java.lang.String getRefreshToken() {
		return _connectionData.getRefreshToken();
	}

	/**
	* Sets the refresh token of this connection data.
	*
	* @param refreshToken the refresh token of this connection data
	*/
	@Override
	public void setRefreshToken(java.lang.String refreshToken) {
		_connectionData.setRefreshToken(refreshToken);
	}

	/**
	* Returns the disable date of this connection data.
	*
	* @return the disable date of this connection data
	*/
	@Override
	public java.util.Date getDisableDate() {
		return _connectionData.getDisableDate();
	}

	/**
	* Sets the disable date of this connection data.
	*
	* @param disableDate the disable date of this connection data
	*/
	@Override
	public void setDisableDate(java.util.Date disableDate) {
		_connectionData.setDisableDate(disableDate);
	}

	/**
	* Returns the secret key of this connection data.
	*
	* @return the secret key of this connection data
	*/
	@Override
	public java.lang.String getSecretKey() {
		return _connectionData.getSecretKey();
	}

	/**
	* Sets the secret key of this connection data.
	*
	* @param secretKey the secret key of this connection data
	*/
	@Override
	public void setSecretKey(java.lang.String secretKey) {
		_connectionData.setSecretKey(secretKey);
	}

	/**
	* Returns the application token of this connection data.
	*
	* @return the application token of this connection data
	*/
	@Override
	public java.lang.String getApplicationToken() {
		return _connectionData.getApplicationToken();
	}

	/**
	* Sets the application token of this connection data.
	*
	* @param applicationToken the application token of this connection data
	*/
	@Override
	public void setApplicationToken(java.lang.String applicationToken) {
		_connectionData.setApplicationToken(applicationToken);
	}

	/**
	* Returns the client ID of this connection data.
	*
	* @return the client ID of this connection data
	*/
	@Override
	public java.lang.String getClientId() {
		return _connectionData.getClientId();
	}

	/**
	* Sets the client ID of this connection data.
	*
	* @param clientId the client ID of this connection data
	*/
	@Override
	public void setClientId(java.lang.String clientId) {
		_connectionData.setClientId(clientId);
	}

	/**
	* Returns the token type of this connection data.
	*
	* @return the token type of this connection data
	*/
	@Override
	public java.lang.String getTokenType() {
		return _connectionData.getTokenType();
	}

	/**
	* Sets the token type of this connection data.
	*
	* @param tokenType the token type of this connection data
	*/
	@Override
	public void setTokenType(java.lang.String tokenType) {
		_connectionData.setTokenType(tokenType);
	}

	/**
	* Returns the expires in of this connection data.
	*
	* @return the expires in of this connection data
	*/
	@Override
	public int getExpiresIn() {
		return _connectionData.getExpiresIn();
	}

	/**
	* Sets the expires in of this connection data.
	*
	* @param expiresIn the expires in of this connection data
	*/
	@Override
	public void setExpiresIn(int expiresIn) {
		_connectionData.setExpiresIn(expiresIn);
	}

	/**
	* Returns the scope of this connection data.
	*
	* @return the scope of this connection data
	*/
	@Override
	public java.lang.String getScope() {
		return _connectionData.getScope();
	}

	/**
	* Sets the scope of this connection data.
	*
	* @param scope the scope of this connection data
	*/
	@Override
	public void setScope(java.lang.String scope) {
		_connectionData.setScope(scope);
	}

	/**
	* Returns the clave primaria of this connection data.
	*
	* @return the clave primaria of this connection data
	*/
	@Override
	public java.lang.String getClavePrimaria() {
		return _connectionData.getClavePrimaria();
	}

	/**
	* Sets the clave primaria of this connection data.
	*
	* @param clavePrimaria the clave primaria of this connection data
	*/
	@Override
	public void setClavePrimaria(java.lang.String clavePrimaria) {
		_connectionData.setClavePrimaria(clavePrimaria);
	}

	/**
	* Returns the clave secundaria of this connection data.
	*
	* @return the clave secundaria of this connection data
	*/
	@Override
	public java.lang.String getClaveSecundaria() {
		return _connectionData.getClaveSecundaria();
	}

	/**
	* Sets the clave secundaria of this connection data.
	*
	* @param claveSecundaria the clave secundaria of this connection data
	*/
	@Override
	public void setClaveSecundaria(java.lang.String claveSecundaria) {
		_connectionData.setClaveSecundaria(claveSecundaria);
	}

	/**
	* Returns the session ID of this connection data.
	*
	* @return the session ID of this connection data
	*/
	@Override
	public java.lang.String getSessionId() {
		return _connectionData.getSessionId();
	}

	/**
	* Sets the session ID of this connection data.
	*
	* @param sessionId the session ID of this connection data
	*/
	@Override
	public void setSessionId(java.lang.String sessionId) {
		_connectionData.setSessionId(sessionId);
	}

	/**
	* Returns the encoded client credentials of this connection data.
	*
	* @return the encoded client credentials of this connection data
	*/
	@Override
	public java.lang.String getEncodedClientCredentials() {
		return _connectionData.getEncodedClientCredentials();
	}

	/**
	* Sets the encoded client credentials of this connection data.
	*
	* @param encodedClientCredentials the encoded client credentials of this connection data
	*/
	@Override
	public void setEncodedClientCredentials(
		java.lang.String encodedClientCredentials) {
		_connectionData.setEncodedClientCredentials(encodedClientCredentials);
	}

	/**
	* Returns the state of this connection data.
	*
	* @return the state of this connection data
	*/
	@Override
	public java.lang.String getState() {
		return _connectionData.getState();
	}

	/**
	* Sets the state of this connection data.
	*
	* @param state the state of this connection data
	*/
	@Override
	public void setState(java.lang.String state) {
		_connectionData.setState(state);
	}

	/**
	* Returns the web secret key of this connection data.
	*
	* @return the web secret key of this connection data
	*/
	@Override
	public java.lang.String getWebSecretKey() {
		return _connectionData.getWebSecretKey();
	}

	/**
	* Sets the web secret key of this connection data.
	*
	* @param webSecretKey the web secret key of this connection data
	*/
	@Override
	public void setWebSecretKey(java.lang.String webSecretKey) {
		_connectionData.setWebSecretKey(webSecretKey);
	}

	/**
	* Returns the application code of this connection data.
	*
	* @return the application code of this connection data
	*/
	@Override
	public java.lang.String getApplicationCode() {
		return _connectionData.getApplicationCode();
	}

	/**
	* Sets the application code of this connection data.
	*
	* @param applicationCode the application code of this connection data
	*/
	@Override
	public void setApplicationCode(java.lang.String applicationCode) {
		_connectionData.setApplicationCode(applicationCode);
	}

	@Override
	public boolean isNew() {
		return _connectionData.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_connectionData.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _connectionData.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_connectionData.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _connectionData.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _connectionData.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_connectionData.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _connectionData.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_connectionData.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_connectionData.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_connectionData.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ConnectionDataWrapper((ConnectionData)_connectionData.clone());
	}

	@Override
	public int compareTo(
		es.davinciti.liferay.model.ConnectionData connectionData) {
		return _connectionData.compareTo(connectionData);
	}

	@Override
	public int hashCode() {
		return _connectionData.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.ConnectionData> toCacheModel() {
		return _connectionData.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.ConnectionData toEscapedModel() {
		return new ConnectionDataWrapper(_connectionData.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.ConnectionData toUnescapedModel() {
		return new ConnectionDataWrapper(_connectionData.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _connectionData.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _connectionData.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionData.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConnectionDataWrapper)) {
			return false;
		}

		ConnectionDataWrapper connectionDataWrapper = (ConnectionDataWrapper)obj;

		if (Validator.equals(_connectionData,
					connectionDataWrapper._connectionData)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ConnectionData getWrappedConnectionData() {
		return _connectionData;
	}

	@Override
	public ConnectionData getWrappedModel() {
		return _connectionData;
	}

	@Override
	public void resetOriginalValues() {
		_connectionData.resetOriginalValues();
	}

	private ConnectionData _connectionData;
}