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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.TipoDiaCalendarServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.TipoDiaCalendarServiceSoap
 * @generated
 */
public class TipoDiaCalendarSoap implements Serializable {
	public static TipoDiaCalendarSoap toSoapModel(TipoDiaCalendar model) {
		TipoDiaCalendarSoap soapModel = new TipoDiaCalendarSoap();

		soapModel.setTipoDiaCalendarId(model.getTipoDiaCalendarId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setFondoColor(model.getFondoColor());
		soapModel.setLetraColor(model.getLetraColor());
		soapModel.setStrong(model.getStrong());

		return soapModel;
	}

	public static TipoDiaCalendarSoap[] toSoapModels(TipoDiaCalendar[] models) {
		TipoDiaCalendarSoap[] soapModels = new TipoDiaCalendarSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TipoDiaCalendarSoap[][] toSoapModels(
		TipoDiaCalendar[][] models) {
		TipoDiaCalendarSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TipoDiaCalendarSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TipoDiaCalendarSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TipoDiaCalendarSoap[] toSoapModels(
		List<TipoDiaCalendar> models) {
		List<TipoDiaCalendarSoap> soapModels = new ArrayList<TipoDiaCalendarSoap>(models.size());

		for (TipoDiaCalendar model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TipoDiaCalendarSoap[soapModels.size()]);
	}

	public TipoDiaCalendarSoap() {
	}

	public long getPrimaryKey() {
		return _tipoDiaCalendarId;
	}

	public void setPrimaryKey(long pk) {
		setTipoDiaCalendarId(pk);
	}

	public long getTipoDiaCalendarId() {
		return _tipoDiaCalendarId;
	}

	public void setTipoDiaCalendarId(long tipoDiaCalendarId) {
		_tipoDiaCalendarId = tipoDiaCalendarId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public String getFondoColor() {
		return _fondoColor;
	}

	public void setFondoColor(String fondoColor) {
		_fondoColor = fondoColor;
	}

	public String getLetraColor() {
		return _letraColor;
	}

	public void setLetraColor(String letraColor) {
		_letraColor = letraColor;
	}

	public String getStrong() {
		return _strong;
	}

	public void setStrong(String strong) {
		_strong = strong;
	}

	private long _tipoDiaCalendarId;
	private String _descripcion;
	private String _fondoColor;
	private String _letraColor;
	private String _strong;
}