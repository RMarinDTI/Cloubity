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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.ConnectionActionTypesServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.ConnectionActionTypesServiceSoap
 * @generated
 */
public class ConnectionActionTypesSoap implements Serializable {
	public static ConnectionActionTypesSoap toSoapModel(
		ConnectionActionTypes model) {
		ConnectionActionTypesSoap soapModel = new ConnectionActionTypesSoap();

		soapModel.setConnectionActionTypeId(model.getConnectionActionTypeId());
		soapModel.setName(model.getName());
		soapModel.setDisableDate(model.getDisableDate());

		return soapModel;
	}

	public static ConnectionActionTypesSoap[] toSoapModels(
		ConnectionActionTypes[] models) {
		ConnectionActionTypesSoap[] soapModels = new ConnectionActionTypesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ConnectionActionTypesSoap[][] toSoapModels(
		ConnectionActionTypes[][] models) {
		ConnectionActionTypesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ConnectionActionTypesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ConnectionActionTypesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ConnectionActionTypesSoap[] toSoapModels(
		List<ConnectionActionTypes> models) {
		List<ConnectionActionTypesSoap> soapModels = new ArrayList<ConnectionActionTypesSoap>(models.size());

		for (ConnectionActionTypes model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ConnectionActionTypesSoap[soapModels.size()]);
	}

	public ConnectionActionTypesSoap() {
	}

	public long getPrimaryKey() {
		return _connectionActionTypeId;
	}

	public void setPrimaryKey(long pk) {
		setConnectionActionTypeId(pk);
	}

	public long getConnectionActionTypeId() {
		return _connectionActionTypeId;
	}

	public void setConnectionActionTypeId(long connectionActionTypeId) {
		_connectionActionTypeId = connectionActionTypeId;
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

	private long _connectionActionTypeId;
	private String _name;
	private Date _disableDate;
}