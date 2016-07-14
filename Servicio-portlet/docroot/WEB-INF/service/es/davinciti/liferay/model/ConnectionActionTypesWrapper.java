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
 * This class is a wrapper for {@link ConnectionActionTypes}.
 * </p>
 *
 * @author Cmes
 * @see ConnectionActionTypes
 * @generated
 */
public class ConnectionActionTypesWrapper implements ConnectionActionTypes,
	ModelWrapper<ConnectionActionTypes> {
	public ConnectionActionTypesWrapper(
		ConnectionActionTypes connectionActionTypes) {
		_connectionActionTypes = connectionActionTypes;
	}

	@Override
	public Class<?> getModelClass() {
		return ConnectionActionTypes.class;
	}

	@Override
	public String getModelClassName() {
		return ConnectionActionTypes.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("connectionActionTypeId", getConnectionActionTypeId());
		attributes.put("name", getName());
		attributes.put("disableDate", getDisableDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long connectionActionTypeId = (Long)attributes.get(
				"connectionActionTypeId");

		if (connectionActionTypeId != null) {
			setConnectionActionTypeId(connectionActionTypeId);
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
	* Returns the primary key of this connection action types.
	*
	* @return the primary key of this connection action types
	*/
	@Override
	public long getPrimaryKey() {
		return _connectionActionTypes.getPrimaryKey();
	}

	/**
	* Sets the primary key of this connection action types.
	*
	* @param primaryKey the primary key of this connection action types
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_connectionActionTypes.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the connection action type ID of this connection action types.
	*
	* @return the connection action type ID of this connection action types
	*/
	@Override
	public long getConnectionActionTypeId() {
		return _connectionActionTypes.getConnectionActionTypeId();
	}

	/**
	* Sets the connection action type ID of this connection action types.
	*
	* @param connectionActionTypeId the connection action type ID of this connection action types
	*/
	@Override
	public void setConnectionActionTypeId(long connectionActionTypeId) {
		_connectionActionTypes.setConnectionActionTypeId(connectionActionTypeId);
	}

	/**
	* Returns the name of this connection action types.
	*
	* @return the name of this connection action types
	*/
	@Override
	public java.lang.String getName() {
		return _connectionActionTypes.getName();
	}

	/**
	* Sets the name of this connection action types.
	*
	* @param name the name of this connection action types
	*/
	@Override
	public void setName(java.lang.String name) {
		_connectionActionTypes.setName(name);
	}

	/**
	* Returns the disable date of this connection action types.
	*
	* @return the disable date of this connection action types
	*/
	@Override
	public java.util.Date getDisableDate() {
		return _connectionActionTypes.getDisableDate();
	}

	/**
	* Sets the disable date of this connection action types.
	*
	* @param disableDate the disable date of this connection action types
	*/
	@Override
	public void setDisableDate(java.util.Date disableDate) {
		_connectionActionTypes.setDisableDate(disableDate);
	}

	@Override
	public boolean isNew() {
		return _connectionActionTypes.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_connectionActionTypes.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _connectionActionTypes.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_connectionActionTypes.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _connectionActionTypes.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _connectionActionTypes.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_connectionActionTypes.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _connectionActionTypes.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_connectionActionTypes.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_connectionActionTypes.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_connectionActionTypes.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ConnectionActionTypesWrapper((ConnectionActionTypes)_connectionActionTypes.clone());
	}

	@Override
	public int compareTo(
		es.davinciti.liferay.model.ConnectionActionTypes connectionActionTypes) {
		return _connectionActionTypes.compareTo(connectionActionTypes);
	}

	@Override
	public int hashCode() {
		return _connectionActionTypes.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.ConnectionActionTypes> toCacheModel() {
		return _connectionActionTypes.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.ConnectionActionTypes toEscapedModel() {
		return new ConnectionActionTypesWrapper(_connectionActionTypes.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.ConnectionActionTypes toUnescapedModel() {
		return new ConnectionActionTypesWrapper(_connectionActionTypes.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _connectionActionTypes.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _connectionActionTypes.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionActionTypes.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConnectionActionTypesWrapper)) {
			return false;
		}

		ConnectionActionTypesWrapper connectionActionTypesWrapper = (ConnectionActionTypesWrapper)obj;

		if (Validator.equals(_connectionActionTypes,
					connectionActionTypesWrapper._connectionActionTypes)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ConnectionActionTypes getWrappedConnectionActionTypes() {
		return _connectionActionTypes;
	}

	@Override
	public ConnectionActionTypes getWrappedModel() {
		return _connectionActionTypes;
	}

	@Override
	public void resetOriginalValues() {
		_connectionActionTypes.resetOriginalValues();
	}

	private ConnectionActionTypes _connectionActionTypes;
}