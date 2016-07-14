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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.ConnectionDataServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.ConnectionDataServiceSoap
 * @generated
 */
public class ConnectionDataSoap implements Serializable {
	public static ConnectionDataSoap toSoapModel(ConnectionData model) {
		ConnectionDataSoap soapModel = new ConnectionDataSoap();

		soapModel.setConnectionDataId(model.getConnectionDataId());
		soapModel.setCompanyDB(model.getCompanyDB());
		soapModel.setUsername(model.getUsername());
		soapModel.setPassword(model.getPassword());
		soapModel.setUrl(model.getUrl());
		soapModel.setServer(model.getServer());
		soapModel.setPort(model.getPort());
		soapModel.setAccessToken(model.getAccessToken());
		soapModel.setRefreshToken(model.getRefreshToken());
		soapModel.setDisableDate(model.getDisableDate());
		soapModel.setSecretKey(model.getSecretKey());
		soapModel.setApplicationToken(model.getApplicationToken());
		soapModel.setClientId(model.getClientId());
		soapModel.setTokenType(model.getTokenType());
		soapModel.setExpiresIn(model.getExpiresIn());
		soapModel.setScope(model.getScope());
		soapModel.setClavePrimaria(model.getClavePrimaria());
		soapModel.setClaveSecundaria(model.getClaveSecundaria());
		soapModel.setSessionId(model.getSessionId());
		soapModel.setEncodedClientCredentials(model.getEncodedClientCredentials());
		soapModel.setState(model.getState());
		soapModel.setWebSecretKey(model.getWebSecretKey());
		soapModel.setApplicationCode(model.getApplicationCode());

		return soapModel;
	}

	public static ConnectionDataSoap[] toSoapModels(ConnectionData[] models) {
		ConnectionDataSoap[] soapModels = new ConnectionDataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ConnectionDataSoap[][] toSoapModels(ConnectionData[][] models) {
		ConnectionDataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ConnectionDataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ConnectionDataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ConnectionDataSoap[] toSoapModels(List<ConnectionData> models) {
		List<ConnectionDataSoap> soapModels = new ArrayList<ConnectionDataSoap>(models.size());

		for (ConnectionData model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ConnectionDataSoap[soapModels.size()]);
	}

	public ConnectionDataSoap() {
	}

	public long getPrimaryKey() {
		return _connectionDataId;
	}

	public void setPrimaryKey(long pk) {
		setConnectionDataId(pk);
	}

	public long getConnectionDataId() {
		return _connectionDataId;
	}

	public void setConnectionDataId(long connectionDataId) {
		_connectionDataId = connectionDataId;
	}

	public String getCompanyDB() {
		return _companyDB;
	}

	public void setCompanyDB(String companyDB) {
		_companyDB = companyDB;
	}

	public String getUsername() {
		return _username;
	}

	public void setUsername(String username) {
		_username = username;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public String getServer() {
		return _server;
	}

	public void setServer(String server) {
		_server = server;
	}

	public String getPort() {
		return _port;
	}

	public void setPort(String port) {
		_port = port;
	}

	public String getAccessToken() {
		return _accessToken;
	}

	public void setAccessToken(String accessToken) {
		_accessToken = accessToken;
	}

	public String getRefreshToken() {
		return _refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		_refreshToken = refreshToken;
	}

	public Date getDisableDate() {
		return _disableDate;
	}

	public void setDisableDate(Date disableDate) {
		_disableDate = disableDate;
	}

	public String getSecretKey() {
		return _secretKey;
	}

	public void setSecretKey(String secretKey) {
		_secretKey = secretKey;
	}

	public String getApplicationToken() {
		return _applicationToken;
	}

	public void setApplicationToken(String applicationToken) {
		_applicationToken = applicationToken;
	}

	public String getClientId() {
		return _clientId;
	}

	public void setClientId(String clientId) {
		_clientId = clientId;
	}

	public String getTokenType() {
		return _tokenType;
	}

	public void setTokenType(String tokenType) {
		_tokenType = tokenType;
	}

	public int getExpiresIn() {
		return _expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		_expiresIn = expiresIn;
	}

	public String getScope() {
		return _scope;
	}

	public void setScope(String scope) {
		_scope = scope;
	}

	public String getClavePrimaria() {
		return _clavePrimaria;
	}

	public void setClavePrimaria(String clavePrimaria) {
		_clavePrimaria = clavePrimaria;
	}

	public String getClaveSecundaria() {
		return _claveSecundaria;
	}

	public void setClaveSecundaria(String claveSecundaria) {
		_claveSecundaria = claveSecundaria;
	}

	public String getSessionId() {
		return _sessionId;
	}

	public void setSessionId(String sessionId) {
		_sessionId = sessionId;
	}

	public String getEncodedClientCredentials() {
		return _encodedClientCredentials;
	}

	public void setEncodedClientCredentials(String encodedClientCredentials) {
		_encodedClientCredentials = encodedClientCredentials;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public String getWebSecretKey() {
		return _webSecretKey;
	}

	public void setWebSecretKey(String webSecretKey) {
		_webSecretKey = webSecretKey;
	}

	public String getApplicationCode() {
		return _applicationCode;
	}

	public void setApplicationCode(String applicationCode) {
		_applicationCode = applicationCode;
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
}