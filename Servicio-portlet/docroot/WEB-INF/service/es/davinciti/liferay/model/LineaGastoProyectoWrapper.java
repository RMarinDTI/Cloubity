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
 * This class is a wrapper for {@link LineaGastoProyecto}.
 * </p>
 *
 * @author Cmes
 * @see LineaGastoProyecto
 * @generated
 */
public class LineaGastoProyectoWrapper implements LineaGastoProyecto,
	ModelWrapper<LineaGastoProyecto> {
	public LineaGastoProyectoWrapper(LineaGastoProyecto lineaGastoProyecto) {
		_lineaGastoProyecto = lineaGastoProyecto;
	}

	@Override
	public Class<?> getModelClass() {
		return LineaGastoProyecto.class;
	}

	@Override
	public String getModelClassName() {
		return LineaGastoProyecto.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("proyectoId", getProyectoId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("codeName", getCodeName());
		attributes.put("sageCompanyId", getSageCompanyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long proyectoId = (Long)attributes.get("proyectoId");

		if (proyectoId != null) {
			setProyectoId(proyectoId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String codeName = (String)attributes.get("codeName");

		if (codeName != null) {
			setCodeName(codeName);
		}

		String sageCompanyId = (String)attributes.get("sageCompanyId");

		if (sageCompanyId != null) {
			setSageCompanyId(sageCompanyId);
		}
	}

	/**
	* Returns the primary key of this linea gasto proyecto.
	*
	* @return the primary key of this linea gasto proyecto
	*/
	@Override
	public long getPrimaryKey() {
		return _lineaGastoProyecto.getPrimaryKey();
	}

	/**
	* Sets the primary key of this linea gasto proyecto.
	*
	* @param primaryKey the primary key of this linea gasto proyecto
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lineaGastoProyecto.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the proyecto ID of this linea gasto proyecto.
	*
	* @return the proyecto ID of this linea gasto proyecto
	*/
	@Override
	public long getProyectoId() {
		return _lineaGastoProyecto.getProyectoId();
	}

	/**
	* Sets the proyecto ID of this linea gasto proyecto.
	*
	* @param proyectoId the proyecto ID of this linea gasto proyecto
	*/
	@Override
	public void setProyectoId(long proyectoId) {
		_lineaGastoProyecto.setProyectoId(proyectoId);
	}

	/**
	* Returns the name of this linea gasto proyecto.
	*
	* @return the name of this linea gasto proyecto
	*/
	@Override
	public java.lang.String getName() {
		return _lineaGastoProyecto.getName();
	}

	/**
	* Sets the name of this linea gasto proyecto.
	*
	* @param name the name of this linea gasto proyecto
	*/
	@Override
	public void setName(java.lang.String name) {
		_lineaGastoProyecto.setName(name);
	}

	/**
	* Returns the description of this linea gasto proyecto.
	*
	* @return the description of this linea gasto proyecto
	*/
	@Override
	public java.lang.String getDescription() {
		return _lineaGastoProyecto.getDescription();
	}

	/**
	* Sets the description of this linea gasto proyecto.
	*
	* @param description the description of this linea gasto proyecto
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_lineaGastoProyecto.setDescription(description);
	}

	/**
	* Returns the code name of this linea gasto proyecto.
	*
	* @return the code name of this linea gasto proyecto
	*/
	@Override
	public java.lang.String getCodeName() {
		return _lineaGastoProyecto.getCodeName();
	}

	/**
	* Sets the code name of this linea gasto proyecto.
	*
	* @param codeName the code name of this linea gasto proyecto
	*/
	@Override
	public void setCodeName(java.lang.String codeName) {
		_lineaGastoProyecto.setCodeName(codeName);
	}

	/**
	* Returns the sage company ID of this linea gasto proyecto.
	*
	* @return the sage company ID of this linea gasto proyecto
	*/
	@Override
	public java.lang.String getSageCompanyId() {
		return _lineaGastoProyecto.getSageCompanyId();
	}

	/**
	* Sets the sage company ID of this linea gasto proyecto.
	*
	* @param sageCompanyId the sage company ID of this linea gasto proyecto
	*/
	@Override
	public void setSageCompanyId(java.lang.String sageCompanyId) {
		_lineaGastoProyecto.setSageCompanyId(sageCompanyId);
	}

	@Override
	public boolean isNew() {
		return _lineaGastoProyecto.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_lineaGastoProyecto.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _lineaGastoProyecto.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lineaGastoProyecto.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _lineaGastoProyecto.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _lineaGastoProyecto.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lineaGastoProyecto.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lineaGastoProyecto.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_lineaGastoProyecto.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_lineaGastoProyecto.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lineaGastoProyecto.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LineaGastoProyectoWrapper((LineaGastoProyecto)_lineaGastoProyecto.clone());
	}

	@Override
	public int compareTo(
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto) {
		return _lineaGastoProyecto.compareTo(lineaGastoProyecto);
	}

	@Override
	public int hashCode() {
		return _lineaGastoProyecto.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.LineaGastoProyecto> toCacheModel() {
		return _lineaGastoProyecto.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.LineaGastoProyecto toEscapedModel() {
		return new LineaGastoProyectoWrapper(_lineaGastoProyecto.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.LineaGastoProyecto toUnescapedModel() {
		return new LineaGastoProyectoWrapper(_lineaGastoProyecto.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lineaGastoProyecto.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lineaGastoProyecto.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoProyecto.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LineaGastoProyectoWrapper)) {
			return false;
		}

		LineaGastoProyectoWrapper lineaGastoProyectoWrapper = (LineaGastoProyectoWrapper)obj;

		if (Validator.equals(_lineaGastoProyecto,
					lineaGastoProyectoWrapper._lineaGastoProyecto)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LineaGastoProyecto getWrappedLineaGastoProyecto() {
		return _lineaGastoProyecto;
	}

	@Override
	public LineaGastoProyecto getWrappedModel() {
		return _lineaGastoProyecto;
	}

	@Override
	public void resetOriginalValues() {
		_lineaGastoProyecto.resetOriginalValues();
	}

	private LineaGastoProyecto _lineaGastoProyecto;
}