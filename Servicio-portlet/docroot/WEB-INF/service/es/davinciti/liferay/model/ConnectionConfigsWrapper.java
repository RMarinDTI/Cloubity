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
 * This class is a wrapper for {@link ConnectionConfigs}.
 * </p>
 *
 * @author Cmes
 * @see ConnectionConfigs
 * @generated
 */
public class ConnectionConfigsWrapper implements ConnectionConfigs,
	ModelWrapper<ConnectionConfigs> {
	public ConnectionConfigsWrapper(ConnectionConfigs connectionConfigs) {
		_connectionConfigs = connectionConfigs;
	}

	@Override
	public Class<?> getModelClass() {
		return ConnectionConfigs.class;
	}

	@Override
	public String getModelClassName() {
		return ConnectionConfigs.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("configId", getConfigId());
		attributes.put("companyId", getCompanyId());
		attributes.put("installationId", getInstallationId());
		attributes.put("companyCode", getCompanyCode());
		attributes.put("productCode", getProductCode());
		attributes.put("disableDate", getDisableDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long configId = (Long)attributes.get("configId");

		if (configId != null) {
			setConfigId(configId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String installationId = (String)attributes.get("installationId");

		if (installationId != null) {
			setInstallationId(installationId);
		}

		String companyCode = (String)attributes.get("companyCode");

		if (companyCode != null) {
			setCompanyCode(companyCode);
		}

		String productCode = (String)attributes.get("productCode");

		if (productCode != null) {
			setProductCode(productCode);
		}

		Date disableDate = (Date)attributes.get("disableDate");

		if (disableDate != null) {
			setDisableDate(disableDate);
		}
	}

	/**
	* Returns the primary key of this connection configs.
	*
	* @return the primary key of this connection configs
	*/
	@Override
	public long getPrimaryKey() {
		return _connectionConfigs.getPrimaryKey();
	}

	/**
	* Sets the primary key of this connection configs.
	*
	* @param primaryKey the primary key of this connection configs
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_connectionConfigs.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the config ID of this connection configs.
	*
	* @return the config ID of this connection configs
	*/
	@Override
	public long getConfigId() {
		return _connectionConfigs.getConfigId();
	}

	/**
	* Sets the config ID of this connection configs.
	*
	* @param configId the config ID of this connection configs
	*/
	@Override
	public void setConfigId(long configId) {
		_connectionConfigs.setConfigId(configId);
	}

	/**
	* Returns the company ID of this connection configs.
	*
	* @return the company ID of this connection configs
	*/
	@Override
	public long getCompanyId() {
		return _connectionConfigs.getCompanyId();
	}

	/**
	* Sets the company ID of this connection configs.
	*
	* @param companyId the company ID of this connection configs
	*/
	@Override
	public void setCompanyId(long companyId) {
		_connectionConfigs.setCompanyId(companyId);
	}

	/**
	* Returns the installation ID of this connection configs.
	*
	* @return the installation ID of this connection configs
	*/
	@Override
	public java.lang.String getInstallationId() {
		return _connectionConfigs.getInstallationId();
	}

	/**
	* Sets the installation ID of this connection configs.
	*
	* @param installationId the installation ID of this connection configs
	*/
	@Override
	public void setInstallationId(java.lang.String installationId) {
		_connectionConfigs.setInstallationId(installationId);
	}

	/**
	* Returns the company code of this connection configs.
	*
	* @return the company code of this connection configs
	*/
	@Override
	public java.lang.String getCompanyCode() {
		return _connectionConfigs.getCompanyCode();
	}

	/**
	* Sets the company code of this connection configs.
	*
	* @param companyCode the company code of this connection configs
	*/
	@Override
	public void setCompanyCode(java.lang.String companyCode) {
		_connectionConfigs.setCompanyCode(companyCode);
	}

	/**
	* Returns the product code of this connection configs.
	*
	* @return the product code of this connection configs
	*/
	@Override
	public java.lang.String getProductCode() {
		return _connectionConfigs.getProductCode();
	}

	/**
	* Sets the product code of this connection configs.
	*
	* @param productCode the product code of this connection configs
	*/
	@Override
	public void setProductCode(java.lang.String productCode) {
		_connectionConfigs.setProductCode(productCode);
	}

	/**
	* Returns the disable date of this connection configs.
	*
	* @return the disable date of this connection configs
	*/
	@Override
	public java.util.Date getDisableDate() {
		return _connectionConfigs.getDisableDate();
	}

	/**
	* Sets the disable date of this connection configs.
	*
	* @param disableDate the disable date of this connection configs
	*/
	@Override
	public void setDisableDate(java.util.Date disableDate) {
		_connectionConfigs.setDisableDate(disableDate);
	}

	@Override
	public boolean isNew() {
		return _connectionConfigs.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_connectionConfigs.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _connectionConfigs.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_connectionConfigs.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _connectionConfigs.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _connectionConfigs.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_connectionConfigs.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _connectionConfigs.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_connectionConfigs.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_connectionConfigs.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_connectionConfigs.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ConnectionConfigsWrapper((ConnectionConfigs)_connectionConfigs.clone());
	}

	@Override
	public int compareTo(
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs) {
		return _connectionConfigs.compareTo(connectionConfigs);
	}

	@Override
	public int hashCode() {
		return _connectionConfigs.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.ConnectionConfigs> toCacheModel() {
		return _connectionConfigs.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.ConnectionConfigs toEscapedModel() {
		return new ConnectionConfigsWrapper(_connectionConfigs.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.ConnectionConfigs toUnescapedModel() {
		return new ConnectionConfigsWrapper(_connectionConfigs.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _connectionConfigs.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _connectionConfigs.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigs.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConnectionConfigsWrapper)) {
			return false;
		}

		ConnectionConfigsWrapper connectionConfigsWrapper = (ConnectionConfigsWrapper)obj;

		if (Validator.equals(_connectionConfigs,
					connectionConfigsWrapper._connectionConfigs)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ConnectionConfigs getWrappedConnectionConfigs() {
		return _connectionConfigs;
	}

	@Override
	public ConnectionConfigs getWrappedModel() {
		return _connectionConfigs;
	}

	@Override
	public void resetOriginalValues() {
		_connectionConfigs.resetOriginalValues();
	}

	private ConnectionConfigs _connectionConfigs;
}