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
 * This class is a wrapper for {@link LineaGastoCliente}.
 * </p>
 *
 * @author Cmes
 * @see LineaGastoCliente
 * @generated
 */
public class LineaGastoClienteWrapper implements LineaGastoCliente,
	ModelWrapper<LineaGastoCliente> {
	public LineaGastoClienteWrapper(LineaGastoCliente lineaGastoCliente) {
		_lineaGastoCliente = lineaGastoCliente;
	}

	@Override
	public Class<?> getModelClass() {
		return LineaGastoCliente.class;
	}

	@Override
	public String getModelClassName() {
		return LineaGastoCliente.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("clienteId", getClienteId());
		attributes.put("companyId", getCompanyId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long clienteId = (Long)attributes.get("clienteId");

		if (clienteId != null) {
			setClienteId(clienteId);
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
	* Returns the primary key of this linea gasto cliente.
	*
	* @return the primary key of this linea gasto cliente
	*/
	@Override
	public long getPrimaryKey() {
		return _lineaGastoCliente.getPrimaryKey();
	}

	/**
	* Sets the primary key of this linea gasto cliente.
	*
	* @param primaryKey the primary key of this linea gasto cliente
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lineaGastoCliente.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cliente ID of this linea gasto cliente.
	*
	* @return the cliente ID of this linea gasto cliente
	*/
	@Override
	public long getClienteId() {
		return _lineaGastoCliente.getClienteId();
	}

	/**
	* Sets the cliente ID of this linea gasto cliente.
	*
	* @param clienteId the cliente ID of this linea gasto cliente
	*/
	@Override
	public void setClienteId(long clienteId) {
		_lineaGastoCliente.setClienteId(clienteId);
	}

	/**
	* Returns the company ID of this linea gasto cliente.
	*
	* @return the company ID of this linea gasto cliente
	*/
	@Override
	public long getCompanyId() {
		return _lineaGastoCliente.getCompanyId();
	}

	/**
	* Sets the company ID of this linea gasto cliente.
	*
	* @param companyId the company ID of this linea gasto cliente
	*/
	@Override
	public void setCompanyId(long companyId) {
		_lineaGastoCliente.setCompanyId(companyId);
	}

	/**
	* Returns the name of this linea gasto cliente.
	*
	* @return the name of this linea gasto cliente
	*/
	@Override
	public java.lang.String getName() {
		return _lineaGastoCliente.getName();
	}

	/**
	* Sets the name of this linea gasto cliente.
	*
	* @param name the name of this linea gasto cliente
	*/
	@Override
	public void setName(java.lang.String name) {
		_lineaGastoCliente.setName(name);
	}

	/**
	* Returns the description of this linea gasto cliente.
	*
	* @return the description of this linea gasto cliente
	*/
	@Override
	public java.lang.String getDescription() {
		return _lineaGastoCliente.getDescription();
	}

	/**
	* Sets the description of this linea gasto cliente.
	*
	* @param description the description of this linea gasto cliente
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_lineaGastoCliente.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _lineaGastoCliente.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_lineaGastoCliente.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _lineaGastoCliente.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lineaGastoCliente.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _lineaGastoCliente.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _lineaGastoCliente.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lineaGastoCliente.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lineaGastoCliente.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_lineaGastoCliente.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_lineaGastoCliente.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lineaGastoCliente.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LineaGastoClienteWrapper((LineaGastoCliente)_lineaGastoCliente.clone());
	}

	@Override
	public int compareTo(
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente) {
		return _lineaGastoCliente.compareTo(lineaGastoCliente);
	}

	@Override
	public int hashCode() {
		return _lineaGastoCliente.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.LineaGastoCliente> toCacheModel() {
		return _lineaGastoCliente.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.LineaGastoCliente toEscapedModel() {
		return new LineaGastoClienteWrapper(_lineaGastoCliente.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.LineaGastoCliente toUnescapedModel() {
		return new LineaGastoClienteWrapper(_lineaGastoCliente.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lineaGastoCliente.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lineaGastoCliente.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCliente.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LineaGastoClienteWrapper)) {
			return false;
		}

		LineaGastoClienteWrapper lineaGastoClienteWrapper = (LineaGastoClienteWrapper)obj;

		if (Validator.equals(_lineaGastoCliente,
					lineaGastoClienteWrapper._lineaGastoCliente)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LineaGastoCliente getWrappedLineaGastoCliente() {
		return _lineaGastoCliente;
	}

	@Override
	public LineaGastoCliente getWrappedModel() {
		return _lineaGastoCliente;
	}

	@Override
	public void resetOriginalValues() {
		_lineaGastoCliente.resetOriginalValues();
	}

	private LineaGastoCliente _lineaGastoCliente;
}