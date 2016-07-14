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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import es.davinciti.liferay.service.ClpSerializer;
import es.davinciti.liferay.service.ConnectionDataLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class ConnectionDataClp extends BaseModelImpl<ConnectionData>
	implements ConnectionData {
	public ConnectionDataClp() {
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
	public long getPrimaryKey() {
		return _connectionDataId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setConnectionDataId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _connectionDataId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getConnectionDataId() {
		return _connectionDataId;
	}

	@Override
	public void setConnectionDataId(long connectionDataId) {
		_connectionDataId = connectionDataId;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setConnectionDataId",
						long.class);

				method.invoke(_connectionDataRemoteModel, connectionDataId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCompanyDB() {
		return _companyDB;
	}

	@Override
	public void setCompanyDB(String companyDB) {
		_companyDB = companyDB;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyDB", String.class);

				method.invoke(_connectionDataRemoteModel, companyDB);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUsername() {
		return _username;
	}

	@Override
	public void setUsername(String username) {
		_username = username;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setUsername", String.class);

				method.invoke(_connectionDataRemoteModel, username);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassword() {
		return _password;
	}

	@Override
	public void setPassword(String password) {
		_password = password;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setPassword", String.class);

				method.invoke(_connectionDataRemoteModel, password);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUrl() {
		return _url;
	}

	@Override
	public void setUrl(String url) {
		_url = url;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setUrl", String.class);

				method.invoke(_connectionDataRemoteModel, url);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServer() {
		return _server;
	}

	@Override
	public void setServer(String server) {
		_server = server;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setServer", String.class);

				method.invoke(_connectionDataRemoteModel, server);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPort() {
		return _port;
	}

	@Override
	public void setPort(String port) {
		_port = port;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setPort", String.class);

				method.invoke(_connectionDataRemoteModel, port);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAccessToken() {
		return _accessToken;
	}

	@Override
	public void setAccessToken(String accessToken) {
		_accessToken = accessToken;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setAccessToken", String.class);

				method.invoke(_connectionDataRemoteModel, accessToken);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRefreshToken() {
		return _refreshToken;
	}

	@Override
	public void setRefreshToken(String refreshToken) {
		_refreshToken = refreshToken;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setRefreshToken", String.class);

				method.invoke(_connectionDataRemoteModel, refreshToken);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDisableDate() {
		return _disableDate;
	}

	@Override
	public void setDisableDate(Date disableDate) {
		_disableDate = disableDate;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setDisableDate", Date.class);

				method.invoke(_connectionDataRemoteModel, disableDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSecretKey() {
		return _secretKey;
	}

	@Override
	public void setSecretKey(String secretKey) {
		_secretKey = secretKey;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setSecretKey", String.class);

				method.invoke(_connectionDataRemoteModel, secretKey);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApplicationToken() {
		return _applicationToken;
	}

	@Override
	public void setApplicationToken(String applicationToken) {
		_applicationToken = applicationToken;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicationToken",
						String.class);

				method.invoke(_connectionDataRemoteModel, applicationToken);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getClientId() {
		return _clientId;
	}

	@Override
	public void setClientId(String clientId) {
		_clientId = clientId;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setClientId", String.class);

				method.invoke(_connectionDataRemoteModel, clientId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTokenType() {
		return _tokenType;
	}

	@Override
	public void setTokenType(String tokenType) {
		_tokenType = tokenType;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setTokenType", String.class);

				method.invoke(_connectionDataRemoteModel, tokenType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getExpiresIn() {
		return _expiresIn;
	}

	@Override
	public void setExpiresIn(int expiresIn) {
		_expiresIn = expiresIn;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setExpiresIn", int.class);

				method.invoke(_connectionDataRemoteModel, expiresIn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getScope() {
		return _scope;
	}

	@Override
	public void setScope(String scope) {
		_scope = scope;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setScope", String.class);

				method.invoke(_connectionDataRemoteModel, scope);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getClavePrimaria() {
		return _clavePrimaria;
	}

	@Override
	public void setClavePrimaria(String clavePrimaria) {
		_clavePrimaria = clavePrimaria;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setClavePrimaria", String.class);

				method.invoke(_connectionDataRemoteModel, clavePrimaria);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getClaveSecundaria() {
		return _claveSecundaria;
	}

	@Override
	public void setClaveSecundaria(String claveSecundaria) {
		_claveSecundaria = claveSecundaria;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setClaveSecundaria",
						String.class);

				method.invoke(_connectionDataRemoteModel, claveSecundaria);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSessionId() {
		return _sessionId;
	}

	@Override
	public void setSessionId(String sessionId) {
		_sessionId = sessionId;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setSessionId", String.class);

				method.invoke(_connectionDataRemoteModel, sessionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEncodedClientCredentials() {
		return _encodedClientCredentials;
	}

	@Override
	public void setEncodedClientCredentials(String encodedClientCredentials) {
		_encodedClientCredentials = encodedClientCredentials;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setEncodedClientCredentials",
						String.class);

				method.invoke(_connectionDataRemoteModel,
					encodedClientCredentials);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getState() {
		return _state;
	}

	@Override
	public void setState(String state) {
		_state = state;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setState", String.class);

				method.invoke(_connectionDataRemoteModel, state);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWebSecretKey() {
		return _webSecretKey;
	}

	@Override
	public void setWebSecretKey(String webSecretKey) {
		_webSecretKey = webSecretKey;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setWebSecretKey", String.class);

				method.invoke(_connectionDataRemoteModel, webSecretKey);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApplicationCode() {
		return _applicationCode;
	}

	@Override
	public void setApplicationCode(String applicationCode) {
		_applicationCode = applicationCode;

		if (_connectionDataRemoteModel != null) {
			try {
				Class<?> clazz = _connectionDataRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicationCode",
						String.class);

				method.invoke(_connectionDataRemoteModel, applicationCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getConnectionDataRemoteModel() {
		return _connectionDataRemoteModel;
	}

	public void setConnectionDataRemoteModel(
		BaseModel<?> connectionDataRemoteModel) {
		_connectionDataRemoteModel = connectionDataRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _connectionDataRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_connectionDataRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ConnectionDataLocalServiceUtil.addConnectionData(this);
		}
		else {
			ConnectionDataLocalServiceUtil.updateConnectionData(this);
		}
	}

	@Override
	public ConnectionData toEscapedModel() {
		return (ConnectionData)ProxyUtil.newProxyInstance(ConnectionData.class.getClassLoader(),
			new Class[] { ConnectionData.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ConnectionDataClp clone = new ConnectionDataClp();

		clone.setConnectionDataId(getConnectionDataId());
		clone.setCompanyDB(getCompanyDB());
		clone.setUsername(getUsername());
		clone.setPassword(getPassword());
		clone.setUrl(getUrl());
		clone.setServer(getServer());
		clone.setPort(getPort());
		clone.setAccessToken(getAccessToken());
		clone.setRefreshToken(getRefreshToken());
		clone.setDisableDate(getDisableDate());
		clone.setSecretKey(getSecretKey());
		clone.setApplicationToken(getApplicationToken());
		clone.setClientId(getClientId());
		clone.setTokenType(getTokenType());
		clone.setExpiresIn(getExpiresIn());
		clone.setScope(getScope());
		clone.setClavePrimaria(getClavePrimaria());
		clone.setClaveSecundaria(getClaveSecundaria());
		clone.setSessionId(getSessionId());
		clone.setEncodedClientCredentials(getEncodedClientCredentials());
		clone.setState(getState());
		clone.setWebSecretKey(getWebSecretKey());
		clone.setApplicationCode(getApplicationCode());

		return clone;
	}

	@Override
	public int compareTo(ConnectionData connectionData) {
		long primaryKey = connectionData.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConnectionDataClp)) {
			return false;
		}

		ConnectionDataClp connectionData = (ConnectionDataClp)obj;

		long primaryKey = connectionData.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{connectionDataId=");
		sb.append(getConnectionDataId());
		sb.append(", companyDB=");
		sb.append(getCompanyDB());
		sb.append(", username=");
		sb.append(getUsername());
		sb.append(", password=");
		sb.append(getPassword());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", server=");
		sb.append(getServer());
		sb.append(", port=");
		sb.append(getPort());
		sb.append(", accessToken=");
		sb.append(getAccessToken());
		sb.append(", refreshToken=");
		sb.append(getRefreshToken());
		sb.append(", disableDate=");
		sb.append(getDisableDate());
		sb.append(", secretKey=");
		sb.append(getSecretKey());
		sb.append(", applicationToken=");
		sb.append(getApplicationToken());
		sb.append(", clientId=");
		sb.append(getClientId());
		sb.append(", tokenType=");
		sb.append(getTokenType());
		sb.append(", expiresIn=");
		sb.append(getExpiresIn());
		sb.append(", scope=");
		sb.append(getScope());
		sb.append(", clavePrimaria=");
		sb.append(getClavePrimaria());
		sb.append(", claveSecundaria=");
		sb.append(getClaveSecundaria());
		sb.append(", sessionId=");
		sb.append(getSessionId());
		sb.append(", encodedClientCredentials=");
		sb.append(getEncodedClientCredentials());
		sb.append(", state=");
		sb.append(getState());
		sb.append(", webSecretKey=");
		sb.append(getWebSecretKey());
		sb.append(", applicationCode=");
		sb.append(getApplicationCode());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(73);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.ConnectionData");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>connectionDataId</column-name><column-value><![CDATA[");
		sb.append(getConnectionDataId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyDB</column-name><column-value><![CDATA[");
		sb.append(getCompanyDB());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>username</column-name><column-value><![CDATA[");
		sb.append(getUsername());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>password</column-name><column-value><![CDATA[");
		sb.append(getPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>server</column-name><column-value><![CDATA[");
		sb.append(getServer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>port</column-name><column-value><![CDATA[");
		sb.append(getPort());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accessToken</column-name><column-value><![CDATA[");
		sb.append(getAccessToken());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>refreshToken</column-name><column-value><![CDATA[");
		sb.append(getRefreshToken());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>disableDate</column-name><column-value><![CDATA[");
		sb.append(getDisableDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>secretKey</column-name><column-value><![CDATA[");
		sb.append(getSecretKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicationToken</column-name><column-value><![CDATA[");
		sb.append(getApplicationToken());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clientId</column-name><column-value><![CDATA[");
		sb.append(getClientId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tokenType</column-name><column-value><![CDATA[");
		sb.append(getTokenType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expiresIn</column-name><column-value><![CDATA[");
		sb.append(getExpiresIn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scope</column-name><column-value><![CDATA[");
		sb.append(getScope());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clavePrimaria</column-name><column-value><![CDATA[");
		sb.append(getClavePrimaria());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>claveSecundaria</column-name><column-value><![CDATA[");
		sb.append(getClaveSecundaria());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sessionId</column-name><column-value><![CDATA[");
		sb.append(getSessionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>encodedClientCredentials</column-name><column-value><![CDATA[");
		sb.append(getEncodedClientCredentials());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state</column-name><column-value><![CDATA[");
		sb.append(getState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>webSecretKey</column-name><column-value><![CDATA[");
		sb.append(getWebSecretKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicationCode</column-name><column-value><![CDATA[");
		sb.append(getApplicationCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _connectionDataId;
	private String _companyDB;
	private String _username;
	private String _password;
	private String _url;
	private String _server;
	private String _port;
	private String _accessToken;
	private String _refreshToken;
	private Date _disableDate;
	private String _secretKey;
	private String _applicationToken;
	private String _clientId;
	private String _tokenType;
	private int _expiresIn;
	private String _scope;
	private String _clavePrimaria;
	private String _claveSecundaria;
	private String _sessionId;
	private String _encodedClientCredentials;
	private String _state;
	private String _webSecretKey;
	private String _applicationCode;
	private BaseModel<?> _connectionDataRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}