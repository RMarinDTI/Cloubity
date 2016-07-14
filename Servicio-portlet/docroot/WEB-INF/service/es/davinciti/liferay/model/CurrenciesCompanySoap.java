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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.CurrenciesCompanyServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.CurrenciesCompanyServiceSoap
 * @generated
 */
public class CurrenciesCompanySoap implements Serializable {
	public static CurrenciesCompanySoap toSoapModel(CurrenciesCompany model) {
		CurrenciesCompanySoap soapModel = new CurrenciesCompanySoap();

		soapModel.setCurrenciescompanyId(model.getCurrenciescompanyId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCurrenciesJson(model.getCurrenciesJson());

		return soapModel;
	}

	public static CurrenciesCompanySoap[] toSoapModels(
		CurrenciesCompany[] models) {
		CurrenciesCompanySoap[] soapModels = new CurrenciesCompanySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CurrenciesCompanySoap[][] toSoapModels(
		CurrenciesCompany[][] models) {
		CurrenciesCompanySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CurrenciesCompanySoap[models.length][models[0].length];
		}
		else {
			soapModels = new CurrenciesCompanySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CurrenciesCompanySoap[] toSoapModels(
		List<CurrenciesCompany> models) {
		List<CurrenciesCompanySoap> soapModels = new ArrayList<CurrenciesCompanySoap>(models.size());

		for (CurrenciesCompany model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CurrenciesCompanySoap[soapModels.size()]);
	}

	public CurrenciesCompanySoap() {
	}

	public long getPrimaryKey() {
		return _currenciescompanyId;
	}

	public void setPrimaryKey(long pk) {
		setCurrenciescompanyId(pk);
	}

	public long getCurrenciescompanyId() {
		return _currenciescompanyId;
	}

	public void setCurrenciescompanyId(long currenciescompanyId) {
		_currenciescompanyId = currenciescompanyId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public String getCurrenciesJson() {
		return _currenciesJson;
	}

	public void setCurrenciesJson(String currenciesJson) {
		_currenciesJson = currenciesJson;
	}

	private long _currenciescompanyId;
	private long _companyId;
	private String _currenciesJson;
}