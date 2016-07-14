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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.ConnectionConfigsServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.ConnectionConfigsServiceSoap
 * @generated
 */
public class ConnectionConfigsSoap implements Serializable {
	public static ConnectionConfigsSoap toSoapModel(ConnectionConfigs model) {
		ConnectionConfigsSoap soapModel = new ConnectionConfigsSoap();

		soapModel.setConfigId(model.getConfigId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setInstallationId(model.getInstallationId());
		soapModel.setCompanyCode(model.getCompanyCode());
		soapModel.setProductCode(model.getProductCode());
		soapModel.setDisableDate(model.getDisableDate());

		return soapModel;
	}

	public static ConnectionConfigsSoap[] toSoapModels(
		ConnectionConfigs[] models) {
		ConnectionConfigsSoap[] soapModels = new ConnectionConfigsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ConnectionConfigsSoap[][] toSoapModels(
		ConnectionConfigs[][] models) {
		ConnectionConfigsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ConnectionConfigsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ConnectionConfigsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ConnectionConfigsSoap[] toSoapModels(
		List<ConnectionConfigs> models) {
		List<ConnectionConfigsSoap> soapModels = new ArrayList<ConnectionConfigsSoap>(models.size());

		for (ConnectionConfigs model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ConnectionConfigsSoap[soapModels.size()]);
	}

	public ConnectionConfigsSoap() {
	}

	public long getPrimaryKey() {
		return _configId;
	}

	public void setPrimaryKey(long pk) {
		setConfigId(pk);
	}

	public long getConfigId() {
		return _configId;
	}

	public void setConfigId(long configId) {
		_configId = configId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public String getInstallationId() {
		return _installationId;
	}

	public void setInstallationId(String installationId) {
		_installationId = installationId;
	}

	public String getCompanyCode() {
		return _companyCode;
	}

	public void setCompanyCode(String companyCode) {
		_companyCode = companyCode;
	}

	public String getProductCode() {
		return _productCode;
	}

	public void setProductCode(String productCode) {
		_productCode = productCode;
	}

	public Date getDisableDate() {
		return _disableDate;
	}

	public void setDisableDate(Date disableDate) {
		_disableDate = disableDate;
	}

	private long _configId;
	private long _companyId;
	private String _installationId;
	private String _companyCode;
	private String _productCode;
	private Date _disableDate;
}