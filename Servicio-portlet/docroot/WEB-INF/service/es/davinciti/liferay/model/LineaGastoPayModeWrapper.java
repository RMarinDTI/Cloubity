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
 * This class is a wrapper for {@link LineaGastoPayMode}.
 * </p>
 *
 * @author Cmes
 * @see LineaGastoPayMode
 * @generated
 */
public class LineaGastoPayModeWrapper implements LineaGastoPayMode,
	ModelWrapper<LineaGastoPayMode> {
	public LineaGastoPayModeWrapper(LineaGastoPayMode lineaGastoPayMode) {
		_lineaGastoPayMode = lineaGastoPayMode;
	}

	@Override
	public Class<?> getModelClass() {
		return LineaGastoPayMode.class;
	}

	@Override
	public String getModelClassName() {
		return LineaGastoPayMode.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("paymodeId", getPaymodeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long paymodeId = (Long)attributes.get("paymodeId");

		if (paymodeId != null) {
			setPaymodeId(paymodeId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this linea gasto pay mode.
	*
	* @return the primary key of this linea gasto pay mode
	*/
	@Override
	public long getPrimaryKey() {
		return _lineaGastoPayMode.getPrimaryKey();
	}

	/**
	* Sets the primary key of this linea gasto pay mode.
	*
	* @param primaryKey the primary key of this linea gasto pay mode
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lineaGastoPayMode.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the paymode ID of this linea gasto pay mode.
	*
	* @return the paymode ID of this linea gasto pay mode
	*/
	@Override
	public long getPaymodeId() {
		return _lineaGastoPayMode.getPaymodeId();
	}

	/**
	* Sets the paymode ID of this linea gasto pay mode.
	*
	* @param paymodeId the paymode ID of this linea gasto pay mode
	*/
	@Override
	public void setPaymodeId(long paymodeId) {
		_lineaGastoPayMode.setPaymodeId(paymodeId);
	}

	/**
	* Returns the company ID of this linea gasto pay mode.
	*
	* @return the company ID of this linea gasto pay mode
	*/
	@Override
	public long getCompanyId() {
		return _lineaGastoPayMode.getCompanyId();
	}

	/**
	* Sets the company ID of this linea gasto pay mode.
	*
	* @param companyId the company ID of this linea gasto pay mode
	*/
	@Override
	public void setCompanyId(long companyId) {
		_lineaGastoPayMode.setCompanyId(companyId);
	}

	/**
	* Returns the name of this linea gasto pay mode.
	*
	* @return the name of this linea gasto pay mode
	*/
	@Override
	public java.lang.String getName() {
		return _lineaGastoPayMode.getName();
	}

	/**
	* Sets the name of this linea gasto pay mode.
	*
	* @param name the name of this linea gasto pay mode
	*/
	@Override
	public void setName(java.lang.String name) {
		_lineaGastoPayMode.setName(name);
	}

	/**
	* Returns the description of this linea gasto pay mode.
	*
	* @return the description of this linea gasto pay mode
	*/
	@Override
	public java.lang.String getDescription() {
		return _lineaGastoPayMode.getDescription();
	}

	/**
	* Sets the description of this linea gasto pay mode.
	*
	* @param description the description of this linea gasto pay mode
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_lineaGastoPayMode.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _lineaGastoPayMode.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_lineaGastoPayMode.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _lineaGastoPayMode.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lineaGastoPayMode.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _lineaGastoPayMode.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _lineaGastoPayMode.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lineaGastoPayMode.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lineaGastoPayMode.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_lineaGastoPayMode.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_lineaGastoPayMode.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lineaGastoPayMode.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LineaGastoPayModeWrapper((LineaGastoPayMode)_lineaGastoPayMode.clone());
	}

	@Override
	public int compareTo(
		es.davinciti.liferay.model.LineaGastoPayMode lineaGastoPayMode) {
		return _lineaGastoPayMode.compareTo(lineaGastoPayMode);
	}

	@Override
	public int hashCode() {
		return _lineaGastoPayMode.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.LineaGastoPayMode> toCacheModel() {
		return _lineaGastoPayMode.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.LineaGastoPayMode toEscapedModel() {
		return new LineaGastoPayModeWrapper(_lineaGastoPayMode.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.LineaGastoPayMode toUnescapedModel() {
		return new LineaGastoPayModeWrapper(_lineaGastoPayMode.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lineaGastoPayMode.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lineaGastoPayMode.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoPayMode.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LineaGastoPayModeWrapper)) {
			return false;
		}

		LineaGastoPayModeWrapper lineaGastoPayModeWrapper = (LineaGastoPayModeWrapper)obj;

		if (Validator.equals(_lineaGastoPayMode,
					lineaGastoPayModeWrapper._lineaGastoPayMode)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LineaGastoPayMode getWrappedLineaGastoPayMode() {
		return _lineaGastoPayMode;
	}

	@Override
	public LineaGastoPayMode getWrappedModel() {
		return _lineaGastoPayMode;
	}

	@Override
	public void resetOriginalValues() {
		_lineaGastoPayMode.resetOriginalValues();
	}

	private LineaGastoPayMode _lineaGastoPayMode;
}