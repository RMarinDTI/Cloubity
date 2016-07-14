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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.CalendarioServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.CalendarioServiceSoap
 * @generated
 */
public class CalendarioSoap implements Serializable {
	public static CalendarioSoap toSoapModel(Calendario model) {
		CalendarioSoap soapModel = new CalendarioSoap();

		soapModel.setCalendarioId(model.getCalendarioId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setYear(model.getYear());
		soapModel.setCalendarJson(model.getCalendarJson());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static CalendarioSoap[] toSoapModels(Calendario[] models) {
		CalendarioSoap[] soapModels = new CalendarioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CalendarioSoap[][] toSoapModels(Calendario[][] models) {
		CalendarioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CalendarioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CalendarioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CalendarioSoap[] toSoapModels(List<Calendario> models) {
		List<CalendarioSoap> soapModels = new ArrayList<CalendarioSoap>(models.size());

		for (Calendario model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CalendarioSoap[soapModels.size()]);
	}

	public CalendarioSoap() {
	}

	public long getPrimaryKey() {
		return _calendarioId;
	}

	public void setPrimaryKey(long pk) {
		setCalendarioId(pk);
	}

	public long getCalendarioId() {
		return _calendarioId;
	}

	public void setCalendarioId(long calendarioId) {
		_calendarioId = calendarioId;
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

	public String getCalendarJson() {
		return _calendarJson;
	}

	public void setCalendarJson(String calendarJson) {
		_calendarJson = calendarJson;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	private long _calendarioId;
	private long _companyId;
	private long _userId;
	private int _year;
	private String _calendarJson;
	private String _status;
}