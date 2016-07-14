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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.LineaGastoProyectoServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.LineaGastoProyectoServiceSoap
 * @generated
 */
public class LineaGastoProyectoSoap implements Serializable {
	public static LineaGastoProyectoSoap toSoapModel(LineaGastoProyecto model) {
		LineaGastoProyectoSoap soapModel = new LineaGastoProyectoSoap();

		soapModel.setProyectoId(model.getProyectoId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setCodeName(model.getCodeName());
		soapModel.setSageCompanyId(model.getSageCompanyId());

		return soapModel;
	}

	public static LineaGastoProyectoSoap[] toSoapModels(
		LineaGastoProyecto[] models) {
		LineaGastoProyectoSoap[] soapModels = new LineaGastoProyectoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LineaGastoProyectoSoap[][] toSoapModels(
		LineaGastoProyecto[][] models) {
		LineaGastoProyectoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LineaGastoProyectoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LineaGastoProyectoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LineaGastoProyectoSoap[] toSoapModels(
		List<LineaGastoProyecto> models) {
		List<LineaGastoProyectoSoap> soapModels = new ArrayList<LineaGastoProyectoSoap>(models.size());

		for (LineaGastoProyecto model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LineaGastoProyectoSoap[soapModels.size()]);
	}

	public LineaGastoProyectoSoap() {
	}

	public long getPrimaryKey() {
		return _proyectoId;
	}

	public void setPrimaryKey(long pk) {
		setProyectoId(pk);
	}

	public long getProyectoId() {
		return _proyectoId;
	}

	public void setProyectoId(long proyectoId) {
		_proyectoId = proyectoId;
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

	public String getCodeName() {
		return _codeName;
	}

	public void setCodeName(String codeName) {
		_codeName = codeName;
	}

	public String getSageCompanyId() {
		return _sageCompanyId;
	}

	public void setSageCompanyId(String sageCompanyId) {
		_sageCompanyId = sageCompanyId;
	}

	private long _proyectoId;
	private String _name;
	private String _description;
	private String _codeName;
	private String _sageCompanyId;
}