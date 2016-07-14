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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.DiasVacacionesServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.DiasVacacionesServiceSoap
 * @generated
 */
public class DiasVacacionesSoap implements Serializable {
	public static DiasVacacionesSoap toSoapModel(DiasVacaciones model) {
		DiasVacacionesSoap soapModel = new DiasVacacionesSoap();

		soapModel.setDiasVacacionesId(model.getDiasVacacionesId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setYear(model.getYear());
		soapModel.setDisponibles(model.getDisponibles());
		soapModel.setSolicitados(model.getSolicitados());
		soapModel.setAprobados(model.getAprobados());
		soapModel.setPendientes(model.getPendientes());
		soapModel.setAsignado(model.getAsignado());

		return soapModel;
	}

	public static DiasVacacionesSoap[] toSoapModels(DiasVacaciones[] models) {
		DiasVacacionesSoap[] soapModels = new DiasVacacionesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DiasVacacionesSoap[][] toSoapModels(DiasVacaciones[][] models) {
		DiasVacacionesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DiasVacacionesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DiasVacacionesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DiasVacacionesSoap[] toSoapModels(List<DiasVacaciones> models) {
		List<DiasVacacionesSoap> soapModels = new ArrayList<DiasVacacionesSoap>(models.size());

		for (DiasVacaciones model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DiasVacacionesSoap[soapModels.size()]);
	}

	public DiasVacacionesSoap() {
	}

	public long getPrimaryKey() {
		return _diasVacacionesId;
	}

	public void setPrimaryKey(long pk) {
		setDiasVacacionesId(pk);
	}

	public long getDiasVacacionesId() {
		return _diasVacacionesId;
	}

	public void setDiasVacacionesId(long diasVacacionesId) {
		_diasVacacionesId = diasVacacionesId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public int getYear() {
		return _year;
	}

	public void setYear(int year) {
		_year = year;
	}

	public int getDisponibles() {
		return _disponibles;
	}

	public void setDisponibles(int disponibles) {
		_disponibles = disponibles;
	}

	public int getSolicitados() {
		return _solicitados;
	}

	public void setSolicitados(int solicitados) {
		_solicitados = solicitados;
	}

	public int getAprobados() {
		return _aprobados;
	}

	public void setAprobados(int aprobados) {
		_aprobados = aprobados;
	}

	public int getPendientes() {
		return _pendientes;
	}

	public void setPendientes(int pendientes) {
		_pendientes = pendientes;
	}

	public String getAsignado() {
		return _asignado;
	}

	public void setAsignado(String asignado) {
		_asignado = asignado;
	}

	private long _diasVacacionesId;
	private long _companyId;
	private long _userId;
	private int _year;
	private int _disponibles;
	private int _solicitados;
	private int _aprobados;
	private int _pendientes;
	private String _asignado;
}