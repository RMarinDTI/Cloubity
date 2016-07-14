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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.LineaGastoPayModeServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.LineaGastoPayModeServiceSoap
 * @generated
 */
public class LineaGastoPayModeSoap implements Serializable {
	public static LineaGastoPayModeSoap toSoapModel(LineaGastoPayMode model) {
		LineaGastoPayModeSoap soapModel = new LineaGastoPayModeSoap();

		soapModel.setPaymodeId(model.getPaymodeId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static LineaGastoPayModeSoap[] toSoapModels(
		LineaGastoPayMode[] models) {
		LineaGastoPayModeSoap[] soapModels = new LineaGastoPayModeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LineaGastoPayModeSoap[][] toSoapModels(
		LineaGastoPayMode[][] models) {
		LineaGastoPayModeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LineaGastoPayModeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LineaGastoPayModeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LineaGastoPayModeSoap[] toSoapModels(
		List<LineaGastoPayMode> models) {
		List<LineaGastoPayModeSoap> soapModels = new ArrayList<LineaGastoPayModeSoap>(models.size());

		for (LineaGastoPayMode model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LineaGastoPayModeSoap[soapModels.size()]);
	}

	public LineaGastoPayModeSoap() {
	}

	public long getPrimaryKey() {
		return _paymodeId;
	}

	public void setPrimaryKey(long pk) {
		setPaymodeId(pk);
	}

	public long getPaymodeId() {
		return _paymodeId;
	}

	public void setPaymodeId(long paymodeId) {
		_paymodeId = paymodeId;
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

	private long _paymodeId;
	private long _companyId;
	private String _name;
	private String _description;
}