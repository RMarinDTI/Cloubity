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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ConnectionTypes}.
 * </p>
 *
 * @author Cmes
 * @see ConnectionTypes
 * @generated
 */
public class ConnectionTypesWrapper implements ConnectionTypes,
	ModelWrapper<ConnectionTypes> {
	public ConnectionTypesWrapper(ConnectionTypes connectionTypes) {
		_connectionTypes = connectionTypes;
	}

	@Override
	public Class<?> getModelClass() {
		return ConnectionTypes.class;
	}

	@Override
	public String getModelClassName() {
		return ConnectionTypes.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("connectionTypeId", getConnectionTypeId());
		attributes.put("name", getName());
		attributes.put("disableDate", getDisableDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long connectionTypeId = (Long)attributes.get("connectionTypeId");

		if (connectionTypeId != null) {
			setConnectionTypeId(connectionTypeId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Date disableDate = (Date)attributes.get("disableDate");

		if (disableDate != null) {
			setDisableDate(disableDate);
		}
	}

	/**
	* Returns the primary key of this connection types.
	*
	* @return the primary key of this connection types
	*/
	@Override
	public long getPrimaryKey() {
		return _connectionTypes.getPrimaryKey();
	}

	/**
	* Sets the primary key of this connection types.
	*
	* @param primaryKey the primary key of this connection types
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_connectionTypes.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the connection type ID of this connection types.
	*
	* @return the connection type ID of this connection types
	*/
	@Override
	public long getConnectionTypeId() {
		return _connectionTypes.getConnectionTypeId();
	}

	/**
	* Sets the connection type ID of this connection types.
	*
	* @param connectionTypeId the connection type ID of this connection types
	*/
	@Override
	public void setConnectionTypeId(long connectionTypeId) {
		_connectionTypes.setConnectionTypeId(connectionTypeId);
	}

	/**
	* Returns the name of this connection types.
	*
	* @return the name of this connection types
	*/
	@Override
	public java.lang.String getName() {
		return _connectionTypes.getName();
	}

	/**
	* Sets the name of this connection types.
	*
	* @param name the name of this connection types
	*/
	@Override
	public void setName(java.lang.String name) {
		_connectionTypes.setName(name);
	}

	/**
	* Returns the disable date of this connection types.
	*
	* @return the disable date of this connection types
	*/
	@Override
	public java.util.Date getDisableDate() {
		return _connectionTypes.getDisableDate();
	}

	/**
	* Sets the disable date of this connection types.
	*
	* @param disableDate the disable date of this connection types
	*/
	@Override
	public void setDisableDate(java.util.Date disableDate) {
		_connectionTypes.setDisableDate(disableDate);
	}

	@Override
	public boolean isNew() {
		return _connectionTypes.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_connectionTypes.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _connectionTypes.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_connectionTypes.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _connectionTypes.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _connectionTypes.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_connectionTypes.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _connectionTypes.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_connectionTypes.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_connectionTypes.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_connectionTypes.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ConnectionTypesWrapper((ConnectionTypes)_connectionTypes.clone());
	}

	@Override
	public int compareTo(
		es.davinciti.liferay.model.ConnectionTypes connectionTypes) {
		return _connectionTypes.compareTo(connectionTypes);
	}

	@Override
	public int hashCode() {
		return _connectionTypes.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.ConnectionTypes> toCacheModel() {
		return _connectionTypes.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.ConnectionTypes toEscapedModel() {
		return new ConnectionTypesWrapper(_connectionTypes.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.ConnectionTypes toUnescapedModel() {
		return new ConnectionTypesWrapper(_connectionTypes.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _connectionTypes.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _connectionTypes.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionTypes.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConnectionTypesWrapper)) {
			return false;
		}

		ConnectionTypesWrapper connectionTypesWrapper = (ConnectionTypesWrapper)obj;

		if (Validator.equals(_connectionTypes,
					connectionTypesWrapper._connectionTypes)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ConnectionTypes getWrappedConnectionTypes() {
		return _connectionTypes;
	}

	@Override
	public ConnectionTypes getWrappedModel() {
		return _connectionTypes;
	}

	@Override
	public void resetOriginalValues() {
		_connectionTypes.resetOriginalValues();
	}

	private ConnectionTypes _connectionTypes;
}