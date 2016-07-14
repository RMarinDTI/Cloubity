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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.SageEmployeeServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.SageEmployeeServiceSoap
 * @generated
 */
public class SageEmployeeSoap implements Serializable {
	public static SageEmployeeSoap toSoapModel(SageEmployee model) {
		SageEmployeeSoap soapModel = new SageEmployeeSoap();

		soapModel.setSageEmployeeId(model.getSageEmployeeId());
		soapModel.setUserId(model.getUserId());
		soapModel.setEmployeeID(model.getEmployeeID());
		soapModel.setApplicationId(model.getApplicationId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setPersonId(model.getPersonId());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setSeniority(model.getSeniority());

		return soapModel;
	}

	public static SageEmployeeSoap[] toSoapModels(SageEmployee[] models) {
		SageEmployeeSoap[] soapModels = new SageEmployeeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SageEmployeeSoap[][] toSoapModels(SageEmployee[][] models) {
		SageEmployeeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SageEmployeeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SageEmployeeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SageEmployeeSoap[] toSoapModels(List<SageEmployee> models) {
		List<SageEmployeeSoap> soapModels = new ArrayList<SageEmployeeSoap>(models.size());

		for (SageEmployee model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SageEmployeeSoap[soapModels.size()]);
	}

	public SageEmployeeSoap() {
	}

	public long getPrimaryKey() {
		return _sageEmployeeId;
	}

	public void setPrimaryKey(long pk) {
		setSageEmployeeId(pk);
	}

	public long getSageEmployeeId() {
		return _sageEmployeeId;
	}

	public void setSageEmployeeId(long sageEmployeeId) {
		_sageEmployeeId = sageEmployeeId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getEmployeeID() {
		return _employeeID;
	}

	public void setEmployeeID(String employeeID) {
		_employeeID = employeeID;
	}

	public String getApplicationId() {
		return _applicationId;
	}

	public void setApplicationId(String applicationId) {
		_applicationId = applicationId;
	}

	public String getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(String companyId) {
		_companyId = companyId;
	}

	public String getPersonId() {
		return _personId;
	}

	public void setPersonId(String personId) {
		_personId = personId;
	}

	public String getStartDate() {
		return _startDate;
	}

	public void setStartDate(String startDate) {
		_startDate = startDate;
	}

	public String getEndDate() {
		return _endDate;
	}

	public void setEndDate(String endDate) {
		_endDate = endDate;
	}

	public String getSeniority() {
		return _seniority;
	}

	public void setSeniority(String seniority) {
		_seniority = seniority;
	}

	private long _sageEmployeeId;
	private long _userId;
	private String _employeeID;
	private String _applicationId;
	private String _companyId;
	private String _personId;
	private String _startDate;
	private String _endDate;
	private String _seniority;
}