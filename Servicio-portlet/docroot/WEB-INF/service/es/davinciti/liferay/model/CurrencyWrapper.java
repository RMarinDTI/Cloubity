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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Currency}.
 * </p>
 *
 * @author Cmes
 * @see Currency
 * @generated
 */
public class CurrencyWrapper implements Currency, ModelWrapper<Currency> {
	public CurrencyWrapper(Currency currency) {
		_currency = currency;
	}

	@Override
	public Class<?> getModelClass() {
		return Currency.class;
	}

	@Override
	public String getModelClassName() {
		return Currency.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("currencyId", getCurrencyId());
		attributes.put("ccyMnrUnts", getCcyMnrUnts());
		attributes.put("ccyName", getCcyName());
		attributes.put("ccyNumber", getCcyNumber());
		attributes.put("code", getCode());
		attributes.put("countryName", getCountryName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long currencyId = (Long)attributes.get("currencyId");

		if (currencyId != null) {
			setCurrencyId(currencyId);
		}

		String ccyMnrUnts = (String)attributes.get("ccyMnrUnts");

		if (ccyMnrUnts != null) {
			setCcyMnrUnts(ccyMnrUnts);
		}

		String ccyName = (String)attributes.get("ccyName");

		if (ccyName != null) {
			setCcyName(ccyName);
		}

		String ccyNumber = (String)attributes.get("ccyNumber");

		if (ccyNumber != null) {
			setCcyNumber(ccyNumber);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String countryName = (String)attributes.get("countryName");

		if (countryName != null) {
			setCountryName(countryName);
		}
	}

	/**
	* Returns the primary key of this currency.
	*
	* @return the primary key of this currency
	*/
	@Override
	public long getPrimaryKey() {
		return _currency.getPrimaryKey();
	}

	/**
	* Sets the primary key of this currency.
	*
	* @param primaryKey the primary key of this currency
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_currency.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the currency ID of this currency.
	*
	* @return the currency ID of this currency
	*/
	@Override
	public long getCurrencyId() {
		return _currency.getCurrencyId();
	}

	/**
	* Sets the currency ID of this currency.
	*
	* @param currencyId the currency ID of this currency
	*/
	@Override
	public void setCurrencyId(long currencyId) {
		_currency.setCurrencyId(currencyId);
	}

	/**
	* Returns the ccy mnr unts of this currency.
	*
	* @return the ccy mnr unts of this currency
	*/
	@Override
	public java.lang.String getCcyMnrUnts() {
		return _currency.getCcyMnrUnts();
	}

	/**
	* Sets the ccy mnr unts of this currency.
	*
	* @param ccyMnrUnts the ccy mnr unts of this currency
	*/
	@Override
	public void setCcyMnrUnts(java.lang.String ccyMnrUnts) {
		_currency.setCcyMnrUnts(ccyMnrUnts);
	}

	/**
	* Returns the ccy name of this currency.
	*
	* @return the ccy name of this currency
	*/
	@Override
	public java.lang.String getCcyName() {
		return _currency.getCcyName();
	}

	/**
	* Sets the ccy name of this currency.
	*
	* @param ccyName the ccy name of this currency
	*/
	@Override
	public void setCcyName(java.lang.String ccyName) {
		_currency.setCcyName(ccyName);
	}

	/**
	* Returns the ccy number of this currency.
	*
	* @return the ccy number of this currency
	*/
	@Override
	public java.lang.String getCcyNumber() {
		return _currency.getCcyNumber();
	}

	/**
	* Sets the ccy number of this currency.
	*
	* @param ccyNumber the ccy number of this currency
	*/
	@Override
	public void setCcyNumber(java.lang.String ccyNumber) {
		_currency.setCcyNumber(ccyNumber);
	}

	/**
	* Returns the code of this currency.
	*
	* @return the code of this currency
	*/
	@Override
	public java.lang.String getCode() {
		return _currency.getCode();
	}

	/**
	* Sets the code of this currency.
	*
	* @param code the code of this currency
	*/
	@Override
	public void setCode(java.lang.String code) {
		_currency.setCode(code);
	}

	/**
	* Returns the country name of this currency.
	*
	* @return the country name of this currency
	*/
	@Override
	public java.lang.String getCountryName() {
		return _currency.getCountryName();
	}

	/**
	* Sets the country name of this currency.
	*
	* @param countryName the country name of this currency
	*/
	@Override
	public void setCountryName(java.lang.String countryName) {
		_currency.setCountryName(countryName);
	}

	@Override
	public boolean isNew() {
		return _currency.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_currency.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _currency.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_currency.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _currency.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _currency.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_currency.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _currency.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_currency.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_currency.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_currency.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CurrencyWrapper((Currency)_currency.clone());
	}

	@Override
	public int compareTo(es.davinciti.liferay.model.Currency currency) {
		return _currency.compareTo(currency);
	}

	@Override
	public int hashCode() {
		return _currency.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.Currency> toCacheModel() {
		return _currency.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.Currency toEscapedModel() {
		return new CurrencyWrapper(_currency.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.Currency toUnescapedModel() {
		return new CurrencyWrapper(_currency.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _currency.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _currency.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_currency.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CurrencyWrapper)) {
			return false;
		}

		CurrencyWrapper currencyWrapper = (CurrencyWrapper)obj;

		if (Validator.equals(_currency, currencyWrapper._currency)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Currency getWrappedCurrency() {
		return _currency;
	}

	@Override
	public Currency getWrappedModel() {
		return _currency;
	}

	@Override
	public void resetOriginalValues() {
		_currency.resetOriginalValues();
	}

	private Currency _currency;
}