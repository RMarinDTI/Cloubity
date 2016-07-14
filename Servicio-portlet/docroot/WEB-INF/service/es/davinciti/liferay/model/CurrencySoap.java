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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.CurrencyServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.CurrencyServiceSoap
 * @generated
 */
public class CurrencySoap implements Serializable {
	public static CurrencySoap toSoapModel(Currency model) {
		CurrencySoap soapModel = new CurrencySoap();

		soapModel.setCurrencyId(model.getCurrencyId());
		soapModel.setCcyMnrUnts(model.getCcyMnrUnts());
		soapModel.setCcyName(model.getCcyName());
		soapModel.setCcyNumber(model.getCcyNumber());
		soapModel.setCode(model.getCode());
		soapModel.setCountryName(model.getCountryName());

		return soapModel;
	}

	public static CurrencySoap[] toSoapModels(Currency[] models) {
		CurrencySoap[] soapModels = new CurrencySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CurrencySoap[][] toSoapModels(Currency[][] models) {
		CurrencySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CurrencySoap[models.length][models[0].length];
		}
		else {
			soapModels = new CurrencySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CurrencySoap[] toSoapModels(List<Currency> models) {
		List<CurrencySoap> soapModels = new ArrayList<CurrencySoap>(models.size());

		for (Currency model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CurrencySoap[soapModels.size()]);
	}

	public CurrencySoap() {
	}

	public long getPrimaryKey() {
		return _currencyId;
	}

	public void setPrimaryKey(long pk) {
		setCurrencyId(pk);
	}

	public long getCurrencyId() {
		return _currencyId;
	}

	public void setCurrencyId(long currencyId) {
		_currencyId = currencyId;
	}

	public String getCcyMnrUnts() {
		return _ccyMnrUnts;
	}

	public void setCcyMnrUnts(String ccyMnrUnts) {
		_ccyMnrUnts = ccyMnrUnts;
	}

	public String getCcyName() {
		return _ccyName;
	}

	public void setCcyName(String ccyName) {
		_ccyName = ccyName;
	}

	public String getCcyNumber() {
		return _ccyNumber;
	}

	public void setCcyNumber(String ccyNumber) {
		_ccyNumber = ccyNumber;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public String getCountryName() {
		return _countryName;
	}

	public void setCountryName(String countryName) {
		_countryName = countryName;
	}

	private long _currencyId;
	private String _ccyMnrUnts;
	private String _ccyName;
	private String _ccyNumber;
	private String _code;
	private String _countryName;
}