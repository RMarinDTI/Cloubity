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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.LineaGastoClienteServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.LineaGastoClienteServiceSoap
 * @generated
 */
public class LineaGastoClienteSoap implements Serializable {
	public static LineaGastoClienteSoap toSoapModel(LineaGastoCliente model) {
		LineaGastoClienteSoap soapModel = new LineaGastoClienteSoap();

		soapModel.setClienteId(model.getClienteId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static LineaGastoClienteSoap[] toSoapModels(
		LineaGastoCliente[] models) {
		LineaGastoClienteSoap[] soapModels = new LineaGastoClienteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LineaGastoClienteSoap[][] toSoapModels(
		LineaGastoCliente[][] models) {
		LineaGastoClienteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LineaGastoClienteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LineaGastoClienteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LineaGastoClienteSoap[] toSoapModels(
		List<LineaGastoCliente> models) {
		List<LineaGastoClienteSoap> soapModels = new ArrayList<LineaGastoClienteSoap>(models.size());

		for (LineaGastoCliente model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LineaGastoClienteSoap[soapModels.size()]);
	}

	public LineaGastoClienteSoap() {
	}

	public long getPrimaryKey() {
		return _clienteId;
	}

	public void setPrimaryKey(long pk) {
		setClienteId(pk);
	}

	public long getClienteId() {
		return _clienteId;
	}

	public void setClienteId(long clienteId) {
		_clienteId = clienteId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _clienteId;
	private long _companyId;
	private String _name;
	private String _description;
}