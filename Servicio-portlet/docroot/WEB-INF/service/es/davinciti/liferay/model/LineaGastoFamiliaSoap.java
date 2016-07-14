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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.LineaGastoFamiliaServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.LineaGastoFamiliaServiceSoap
 * @generated
 */
public class LineaGastoFamiliaSoap implements Serializable {
	public static LineaGastoFamiliaSoap toSoapModel(LineaGastoFamilia model) {
		LineaGastoFamiliaSoap soapModel = new LineaGastoFamiliaSoap();

		soapModel.setFamiliaId(model.getFamiliaId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static LineaGastoFamiliaSoap[] toSoapModels(
		LineaGastoFamilia[] models) {
		LineaGastoFamiliaSoap[] soapModels = new LineaGastoFamiliaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LineaGastoFamiliaSoap[][] toSoapModels(
		LineaGastoFamilia[][] models) {
		LineaGastoFamiliaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LineaGastoFamiliaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LineaGastoFamiliaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LineaGastoFamiliaSoap[] toSoapModels(
		List<LineaGastoFamilia> models) {
		List<LineaGastoFamiliaSoap> soapModels = new ArrayList<LineaGastoFamiliaSoap>(models.size());

		for (LineaGastoFamilia model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LineaGastoFamiliaSoap[soapModels.size()]);
	}

	public LineaGastoFamiliaSoap() {
	}

	public long getPrimaryKey() {
		return _familiaId;
	}

	public void setPrimaryKey(long pk) {
		setFamiliaId(pk);
	}

	public long getFamiliaId() {
		return _familiaId;
	}

	public void setFamiliaId(long familiaId) {
		_familiaId = familiaId;
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

	private long _familiaId;
	private long _companyId;
	private String _name;
	private String _description;
}