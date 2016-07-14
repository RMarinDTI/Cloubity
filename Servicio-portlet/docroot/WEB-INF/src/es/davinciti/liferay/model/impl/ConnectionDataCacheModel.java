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

package es.davinciti.liferay.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import es.davinciti.liferay.model.ConnectionData;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ConnectionData in entity cache.
 *
 * @author Cmes
 * @see ConnectionData
 * @generated
 */
public class ConnectionDataCacheModel implements CacheModel<ConnectionData>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{connectionDataId=");
		sb.append(connectionDataId);
		sb.append(", companyDB=");
		sb.append(companyDB);
		sb.append(", username=");
		sb.append(username);
		sb.append(", password=");
		sb.append(password);
		sb.append(", url=");
		sb.append(url);
		sb.append(", server=");
		sb.append(server);
		sb.append(", port=");
		sb.append(port);
		sb.append(", accessToken=");
		sb.append(accessToken);
		sb.append(", refreshToken=");
		sb.append(refreshToken);
		sb.append(", disableDate=");
		sb.append(disableDate);
		sb.append(", secretKey=");
		sb.append(secretKey);
		sb.append(", applicationToken=");
		sb.append(applicationToken);
		sb.append(", clientId=");
		sb.append(clientId);
		sb.append(", tokenType=");
		sb.append(tokenType);
		sb.append(", expiresIn=");
		sb.append(expiresIn);
		sb.append(", scope=");
		sb.append(scope);
		sb.append(", clavePrimaria=");
		sb.append(clavePrimaria);
		sb.append(", claveSecundaria=");
		sb.append(claveSecundaria);
		sb.append(", sessionId=");
		sb.append(sessionId);
		sb.append(", encodedClientCredentials=");
		sb.append(encodedClientCredentials);
		sb.append(", state=");
		sb.append(state);
		sb.append(", webSecretKey=");
		sb.append(webSecretKey);
		sb.append(", applicationCode=");
		sb.append(applicationCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ConnectionData toEntityModel() {
		ConnectionDataImpl connectionDataImpl = new ConnectionDataImpl();

		connectionDataImpl.setConnectionDataId(connectionDataId);

		if (companyDB == null) {
			connectionDataImpl.setCompanyDB(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setCompanyDB(companyDB);
		}

		if (username == null) {
			connectionDataImpl.setUsername(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setUsername(username);
		}

		if (password == null) {
			connectionDataImpl.setPassword(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setPassword(password);
		}

		if (url == null) {
			connectionDataImpl.setUrl(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setUrl(url);
		}

		if (server == null) {
			connectionDataImpl.setServer(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setServer(server);
		}

		if (port == null) {
			connectionDataImpl.setPort(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setPort(port);
		}

		if (accessToken == null) {
			connectionDataImpl.setAccessToken(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setAccessToken(accessToken);
		}

		if (refreshToken == null) {
			connectionDataImpl.setRefreshToken(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setRefreshToken(refreshToken);
		}

		if (disableDate == Long.MIN_VALUE) {
			connectionDataImpl.setDisableDate(null);
		}
		else {
			connectionDataImpl.setDisableDate(new Date(disableDate));
		}

		if (secretKey == null) {
			connectionDataImpl.setSecretKey(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setSecretKey(secretKey);
		}

		if (applicationToken == null) {
			connectionDataImpl.setApplicationToken(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setApplicationToken(applicationToken);
		}

		if (clientId == null) {
			connectionDataImpl.setClientId(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setClientId(clientId);
		}

		if (tokenType == null) {
			connectionDataImpl.setTokenType(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setTokenType(tokenType);
		}

		connectionDataImpl.setExpiresIn(expiresIn);

		if (scope == null) {
			connectionDataImpl.setScope(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setScope(scope);
		}

		if (clavePrimaria == null) {
			connectionDataImpl.setClavePrimaria(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setClavePrimaria(clavePrimaria);
		}

		if (claveSecundaria == null) {
			connectionDataImpl.setClaveSecundaria(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setClaveSecundaria(claveSecundaria);
		}

		if (sessionId == null) {
			connectionDataImpl.setSessionId(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setSessionId(sessionId);
		}

		if (encodedClientCredentials == null) {
			connectionDataImpl.setEncodedClientCredentials(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setEncodedClientCredentials(encodedClientCredentials);
		}

		if (state == null) {
			connectionDataImpl.setState(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setState(state);
		}

		if (webSecretKey == null) {
			connectionDataImpl.setWebSecretKey(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setWebSecretKey(webSecretKey);
		}

		if (applicationCode == null) {
			connectionDataImpl.setApplicationCode(StringPool.BLANK);
		}
		else {
			connectionDataImpl.setApplicationCode(applicationCode);
		}

		connectionDataImpl.resetOriginalValues();

		return connectionDataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		connectionDataId = objectInput.readLong();
		companyDB = objectInput.readUTF();
		username = objectInput.readUTF();
		password = objectInput.readUTF();
		url = objectInput.readUTF();
		server = objectInput.readUTF();
		port = objectInput.readUTF();
		accessToken = objectInput.readUTF();
		refreshToken = objectInput.readUTF();
		disableDate = objectInput.readLong();
		secretKey = objectInput.readUTF();
		applicationToken = objectInput.readUTF();
		clientId = objectInput.readUTF();
		tokenType = objectInput.readUTF();
		expiresIn = objectInput.readInt();
		scope = objectInput.readUTF();
		clavePrimaria = objectInput.readUTF();
		claveSecundaria = objectInput.readUTF();
		sessionId = objectInput.readUTF();
		encodedClientCredentials = objectInput.readUTF();
		state = objectInput.readUTF();
		webSecretKey = objectInput.readUTF();
		applicationCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(connectionDataId);

		if (companyDB == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(companyDB);
		}

		if (username == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(username);
		}

		if (password == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(password);
		}

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}

		if (server == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(server);
		}

		if (port == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(port);
		}

		if (accessToken == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(accessToken);
		}

		if (refreshToken == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(refreshToken);
		}

		objectOutput.writeLong(disableDate);

		if (secretKey == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secretKey);
		}

		if (applicationToken == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicationToken);
		}

		if (clientId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(clientId);
		}

		if (tokenType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tokenType);
		}

		objectOutput.writeInt(expiresIn);

		if (scope == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(scope);
		}

		if (clavePrimaria == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(clavePrimaria);
		}

		if (claveSecundaria == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(claveSecundaria);
		}

		if (sessionId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sessionId);
		}

		if (encodedClientCredentials == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(encodedClientCredentials);
		}

		if (state == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (webSecretKey == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(webSecretKey);
		}

		if (applicationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicationCode);
		}
	}

	public long connectionDataId;
	public String companyDB;
	public String username;
	public String password;
	public String url;
	public String server;
	public String port;
	public String accessToken;
	public String refreshToken;
	public long disableDate;
	public String secretKey;
	public String applicationToken;
	public String clientId;
	public String tokenType;
	public int expiresIn;
	public String scope;
	public String clavePrimaria;
	public String claveSecundaria;
	public String sessionId;
	public String encodedClientCredentials;
	public String state;
	public String webSecretKey;
	public String applicationCode;
}