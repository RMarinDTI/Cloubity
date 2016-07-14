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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.ApplicationStatusServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.ApplicationStatusServiceSoap
 * @generated
 */
public class ApplicationStatusSoap implements Serializable {
	public static ApplicationStatusSoap toSoapModel(ApplicationStatus model) {
		ApplicationStatusSoap soapModel = new ApplicationStatusSoap();

		soapModel.setApplicationStatusId(model.getApplicationStatusId());
		soapModel.setApplicationName(model.getApplicationName());
		soapModel.setStatusId(model.getStatusId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static ApplicationStatusSoap[] toSoapModels(
		ApplicationStatus[] models) {
		ApplicationStatusSoap[] soapModels = new ApplicationStatusSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ApplicationStatusSoap[][] toSoapModels(
		ApplicationStatus[][] models) {
		ApplicationStatusSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ApplicationStatusSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ApplicationStatusSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ApplicationStatusSoap[] toSoapModels(
		List<ApplicationStatus> models) {
		List<ApplicationStatusSoap> soapModels = new ArrayList<ApplicationStatusSoap>(models.size());

		for (ApplicationStatus model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ApplicationStatusSoap[soapModels.size()]);
	}

	public ApplicationStatusSoap() {
	}

	public long getPrimaryKey() {
		return _applicationStatusId;
	}

	public void setPrimaryKey(long pk) {
		setApplicationStatusId(pk);
	}

	public long getApplicationStatusId() {
		return _applicationStatusId;
	}

	public void setApplicationStatusId(long applicationStatusId) {
		_applicationStatusId = applicationStatusId;
	}

	public String getApplicationName() {
		return _applicationName;
	}

	public void setApplicationName(String applicationName) {
		_applicationName = applicationName;
	}

	public String getStatusId() {
		return _statusId;
	}

	public void setStatusId(String statusId) {
		_statusId = statusId;
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

	private long _applicationStatusId;
	private String _applicationName;
	private String _statusId;
	private String _name;
	private String _description;
}