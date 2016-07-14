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
 * This class is a wrapper for {@link LineaGastoFamilia}.
 * </p>
 *
 * @author Cmes
 * @see LineaGastoFamilia
 * @generated
 */
public class LineaGastoFamiliaWrapper implements LineaGastoFamilia,
	ModelWrapper<LineaGastoFamilia> {
	public LineaGastoFamiliaWrapper(LineaGastoFamilia lineaGastoFamilia) {
		_lineaGastoFamilia = lineaGastoFamilia;
	}

	@Override
	public Class<?> getModelClass() {
		return LineaGastoFamilia.class;
	}

	@Override
	public String getModelClassName() {
		return LineaGastoFamilia.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("familiaId", getFamiliaId());
		attributes.put("companyId", getCompanyId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long familiaId = (Long)attributes.get("familiaId");

		if (familiaId != null) {
			setFamiliaId(familiaId);
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
	* Returns the primary key of this linea gasto familia.
	*
	* @return the primary key of this linea gasto familia
	*/
	@Override
	public long getPrimaryKey() {
		return _lineaGastoFamilia.getPrimaryKey();
	}

	/**
	* Sets the primary key of this linea gasto familia.
	*
	* @param primaryKey the primary key of this linea gasto familia
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lineaGastoFamilia.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the familia ID of this linea gasto familia.
	*
	* @return the familia ID of this linea gasto familia
	*/
	@Override
	public long getFamiliaId() {
		return _lineaGastoFamilia.getFamiliaId();
	}

	/**
	* Sets the familia ID of this linea gasto familia.
	*
	* @param familiaId the familia ID of this linea gasto familia
	*/
	@Override
	public void setFamiliaId(long familiaId) {
		_lineaGastoFamilia.setFamiliaId(familiaId);
	}

	/**
	* Returns the company ID of this linea gasto familia.
	*
	* @return the company ID of this linea gasto familia
	*/
	@Override
	public long getCompanyId() {
		return _lineaGastoFamilia.getCompanyId();
	}

	/**
	* Sets the company ID of this linea gasto familia.
	*
	* @param companyId the company ID of this linea gasto familia
	*/
	@Override
	public void setCompanyId(long companyId) {
		_lineaGastoFamilia.setCompanyId(companyId);
	}

	/**
	* Returns the name of this linea gasto familia.
	*
	* @return the name of this linea gasto familia
	*/
	@Override
	public java.lang.String getName() {
		return _lineaGastoFamilia.getName();
	}

	/**
	* Sets the name of this linea gasto familia.
	*
	* @param name the name of this linea gasto familia
	*/
	@Override
	public void setName(java.lang.String name) {
		_lineaGastoFamilia.setName(name);
	}

	/**
	* Returns the description of this linea gasto familia.
	*
	* @return the description of this linea gasto familia
	*/
	@Override
	public java.lang.String getDescription() {
		return _lineaGastoFamilia.getDescription();
	}

	/**
	* Sets the description of this linea gasto familia.
	*
	* @param description the description of this linea gasto familia
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_lineaGastoFamilia.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _lineaGastoFamilia.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_lineaGastoFamilia.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _lineaGastoFamilia.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lineaGastoFamilia.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _lineaGastoFamilia.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _lineaGastoFamilia.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lineaGastoFamilia.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lineaGastoFamilia.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_lineaGastoFamilia.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_lineaGastoFamilia.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lineaGastoFamilia.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LineaGastoFamiliaWrapper((LineaGastoFamilia)_lineaGastoFamilia.clone());
	}

	@Override
	public int compareTo(
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia) {
		return _lineaGastoFamilia.compareTo(lineaGastoFamilia);
	}

	@Override
	public int hashCode() {
		return _lineaGastoFamilia.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.LineaGastoFamilia> toCacheModel() {
		return _lineaGastoFamilia.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.LineaGastoFamilia toEscapedModel() {
		return new LineaGastoFamiliaWrapper(_lineaGastoFamilia.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.LineaGastoFamilia toUnescapedModel() {
		return new LineaGastoFamiliaWrapper(_lineaGastoFamilia.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lineaGastoFamilia.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lineaGastoFamilia.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamilia.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LineaGastoFamiliaWrapper)) {
			return false;
		}

		LineaGastoFamiliaWrapper lineaGastoFamiliaWrapper = (LineaGastoFamiliaWrapper)obj;

		if (Validator.equals(_lineaGastoFamilia,
					lineaGastoFamiliaWrapper._lineaGastoFamilia)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LineaGastoFamilia getWrappedLineaGastoFamilia() {
		return _lineaGastoFamilia;
	}

	@Override
	public LineaGastoFamilia getWrappedModel() {
		return _lineaGastoFamilia;
	}

	@Override
	public void resetOriginalValues() {
		_lineaGastoFamilia.resetOriginalValues();
	}

	private LineaGastoFamilia _lineaGastoFamilia;
}