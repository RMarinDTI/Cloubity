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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.SapEmployeeServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.SapEmployeeServiceSoap
 * @generated
 */
public class SapEmployeeSoap implements Serializable {
	public static SapEmployeeSoap toSoapModel(SapEmployee model) {
		SapEmployeeSoap soapModel = new SapEmployeeSoap();

		soapModel.setSapEmployeeId(model.getSapEmployeeId());
		soapModel.setEmployeeID(model.getEmployeeID());
		soapModel.setUserId(model.getUserId());
		soapModel.setMiddleName(model.getMiddleName());
		soapModel.setGender(model.getGender());
		soapModel.setJobTitle(model.getJobTitle());
		soapModel.setEmployeeType(model.getEmployeeType());

		return soapModel;
	}

	public static SapEmployeeSoap[] toSoapModels(SapEmployee[] models) {
		SapEmployeeSoap[] soapModels = new SapEmployeeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SapEmployeeSoap[][] toSoapModels(SapEmployee[][] models) {
		SapEmployeeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SapEmployeeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SapEmployeeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SapEmployeeSoap[] toSoapModels(List<SapEmployee> models) {
		List<SapEmployeeSoap> soapModels = new ArrayList<SapEmployeeSoap>(models.size());

		for (SapEmployee model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SapEmployeeSoap[soapModels.size()]);
	}

	public SapEmployeeSoap() {
	}

	public long getPrimaryKey() {
		return _sapEmployeeId;
	}

	public void setPrimaryKey(long pk) {
		setSapEmployeeId(pk);
	}

	public long getSapEmployeeId() {
		return _sapEmployeeId;
	}

	public void setSapEmployeeId(long sapEmployeeId) {
		_sapEmployeeId = sapEmployeeId;
	}

	public long getEmployeeID() {
		return _employeeID;
	}

	public void setEmployeeID(long employeeID) {
		_employeeID = employeeID;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getMiddleName() {
		return _middleName;
	}

	public void setMiddleName(String middleName) {
		_middleName = middleName;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	public String getJobTitle() {
		return _jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		_jobTitle = jobTitle;
	}

	public String getEmployeeType() {
		return _employeeType;
	}

	public void setEmployeeType(String employeeType) {
		_employeeType = employeeType;
	}

	private long _sapEmployeeId;
	private long _employeeID;
	private long _userId;
	private String _middleName;
	private String _gender;
	private String _jobTitle;
	private String _employeeType;
}