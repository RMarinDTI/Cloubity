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
 * This class is a wrapper for {@link CurrenciesCompany}.
 * </p>
 *
 * @author Cmes
 * @see CurrenciesCompany
 * @generated
 */
public class CurrenciesCompanyWrapper implements CurrenciesCompany,
	ModelWrapper<CurrenciesCompany> {
	public CurrenciesCompanyWrapper(CurrenciesCompany currenciesCompany) {
		_currenciesCompany = currenciesCompany;
	}

	@Override
	public Class<?> getModelClass() {
		return CurrenciesCompany.class;
	}

	@Override
	public String getModelClassName() {
		return CurrenciesCompany.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("currenciescompanyId", getCurrenciescompanyId());
		attributes.put("companyId", getCompanyId());
		attributes.put("currenciesJson", getCurrenciesJson());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long currenciescompanyId = (Long)attributes.get("currenciescompanyId");

		if (currenciescompanyId != null) {
			setCurrenciescompanyId(currenciescompanyId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String currenciesJson = (String)attributes.get("currenciesJson");

		if (currenciesJson != null) {
			setCurrenciesJson(currenciesJson);
		}
	}

	/**
	* Returns the primary key of this currencies company.
	*
	* @return the primary key of this currencies company
	*/
	@Override
	public long getPrimaryKey() {
		return _currenciesCompany.getPrimaryKey();
	}

	/**
	* Sets the primary key of this currencies company.
	*
	* @param primaryKey the primary key of this currencies company
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_currenciesCompany.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the currenciescompany ID of this currencies company.
	*
	* @return the currenciescompany ID of this currencies company
	*/
	@Override
	public long getCurrenciescompanyId() {
		return _currenciesCompany.getCurrenciescompanyId();
	}

	/**
	* Sets the currenciescompany ID of this currencies company.
	*
	* @param currenciescompanyId the currenciescompany ID of this currencies company
	*/
	@Override
	public void setCurrenciescompanyId(long currenciescompanyId) {
		_currenciesCompany.setCurrenciescompanyId(currenciescompanyId);
	}

	/**
	* Returns the company ID of this currencies company.
	*
	* @return the company ID of this currencies company
	*/
	@Override
	public long getCompanyId() {
		return _currenciesCompany.getCompanyId();
	}

	/**
	* Sets the company ID of this currencies company.
	*
	* @param companyId the company ID of this currencies company
	*/
	@Override
	public void setCompanyId(long companyId) {
		_currenciesCompany.setCompanyId(companyId);
	}

	/**
	* Returns the currencies json of this currencies company.
	*
	* @return the currencies json of this currencies company
	*/
	@Override
	public java.lang.String getCurrenciesJson() {
		return _currenciesCompany.getCurrenciesJson();
	}

	/**
	* Sets the currencies json of this currencies company.
	*
	* @param currenciesJson the currencies json of this currencies company
	*/
	@Override
	public void setCurrenciesJson(java.lang.String currenciesJson) {
		_currenciesCompany.setCurrenciesJson(currenciesJson);
	}

	@Override
	public boolean isNew() {
		return _currenciesCompany.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_currenciesCompany.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _currenciesCompany.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_currenciesCompany.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _currenciesCompany.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _currenciesCompany.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_currenciesCompany.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _currenciesCompany.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_currenciesCompany.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_currenciesCompany.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_currenciesCompany.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CurrenciesCompanyWrapper((CurrenciesCompany)_currenciesCompany.clone());
	}

	@Override
	public int compareTo(
		es.davinciti.liferay.model.CurrenciesCompany currenciesCompany) {
		return _currenciesCompany.compareTo(currenciesCompany);
	}

	@Override
	public int hashCode() {
		return _currenciesCompany.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.CurrenciesCompany> toCacheModel() {
		return _currenciesCompany.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.CurrenciesCompany toEscapedModel() {
		return new CurrenciesCompanyWrapper(_currenciesCompany.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.CurrenciesCompany toUnescapedModel() {
		return new CurrenciesCompanyWrapper(_currenciesCompany.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _currenciesCompany.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _currenciesCompany.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_currenciesCompany.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CurrenciesCompanyWrapper)) {
			return false;
		}

		CurrenciesCompanyWrapper currenciesCompanyWrapper = (CurrenciesCompanyWrapper)obj;

		if (Validator.equals(_currenciesCompany,
					currenciesCompanyWrapper._currenciesCompany)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CurrenciesCompany getWrappedCurrenciesCompany() {
		return _currenciesCompany;
	}

	@Override
	public CurrenciesCompany getWrappedModel() {
		return _currenciesCompany;
	}

	@Override
	public void resetOriginalValues() {
		_currenciesCompany.resetOriginalValues();
	}

	private CurrenciesCompany _currenciesCompany;
}