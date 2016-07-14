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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.ConnectionTypesServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.ConnectionTypesServiceSoap
 * @generated
 */
public class ConnectionTypesSoap implements Serializable {
	public static ConnectionTypesSoap toSoapModel(ConnectionTypes model) {
		ConnectionTypesSoap soapModel = new ConnectionTypesSoap();

		soapModel.setConnectionTypeId(model.getConnectionTypeId());
		soapModel.setName(model.getName());
		soapModel.setDisableDate(model.getDisableDate());

		return soapModel;
	}

	public static ConnectionTypesSoap[] toSoapModels(ConnectionTypes[] models) {
		ConnectionTypesSoap[] soapModels = new ConnectionTypesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ConnectionTypesSoap[][] toSoapModels(
		ConnectionTypes[][] models) {
		ConnectionTypesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ConnectionTypesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ConnectionTypesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ConnectionTypesSoap[] toSoapModels(
		List<ConnectionTypes> models) {
		List<ConnectionTypesSoap> soapModels = new ArrayList<ConnectionTypesSoap>(models.size());

		for (ConnectionTypes model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ConnectionTypesSoap[soapModels.size()]);
	}

	public ConnectionTypesSoap() {
	}

	public long getPrimaryKey() {
		return _connectionTypeId;
	}

	public void setPrimaryKey(long pk) {
		setConnectionTypeId(pk);
	}

	public long getConnectionTypeId() {
		return _connectionTypeId;
	}

	public void setConnectionTypeId(long connectionTypeId) {
		_connectionTypeId = connectionTypeId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Date getDisableDate() {
		return _disableDate;
	}

	public void setDisableDate(Date disableDate) {
		_disableDate = disableDate;
	}

	private long _connectionTypeId;
	private String _name;
	private Date _disableDate;
}