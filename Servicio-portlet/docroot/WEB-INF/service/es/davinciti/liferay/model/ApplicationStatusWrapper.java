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
 * This class is a wrapper for {@link ApplicationStatus}.
 * </p>
 *
 * @author Cmes
 * @see ApplicationStatus
 * @generated
 */
public class ApplicationStatusWrapper implements ApplicationStatus,
	ModelWrapper<ApplicationStatus> {
	public ApplicationStatusWrapper(ApplicationStatus applicationStatus) {
		_applicationStatus = applicationStatus;
	}

	@Override
	public Class<?> getModelClass() {
		return ApplicationStatus.class;
	}

	@Override
	public String getModelClassName() {
		return ApplicationStatus.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("applicationStatusId", getApplicationStatusId());
		attributes.put("applicationName", getApplicationName());
		attributes.put("statusId", getStatusId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long applicationStatusId = (Long)attributes.get("applicationStatusId");

		if (applicationStatusId != null) {
			setApplicationStatusId(applicationStatusId);
		}

		String applicationName = (String)attributes.get("applicationName");

		if (applicationName != null) {
			setApplicationName(applicationName);
		}

		String statusId = (String)attributes.get("statusId");

		if (statusId != null) {
			setStatusId(statusId);
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
	* Returns the primary key of this application status.
	*
	* @return the primary key of this application status
	*/
	@Override
	public long getPrimaryKey() {
		return _applicationStatus.getPrimaryKey();
	}

	/**
	* Sets the primary key of this application status.
	*
	* @param primaryKey the primary key of this application status
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_applicationStatus.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the application status ID of this application status.
	*
	* @return the application status ID of this application status
	*/
	@Override
	public long getApplicationStatusId() {
		return _applicationStatus.getApplicationStatusId();
	}

	/**
	* Sets the application status ID of this application status.
	*
	* @param applicationStatusId the application status ID of this application status
	*/
	@Override
	public void setApplicationStatusId(long applicationStatusId) {
		_applicationStatus.setApplicationStatusId(applicationStatusId);
	}

	/**
	* Returns the application name of this application status.
	*
	* @return the application name of this application status
	*/
	@Override
	public java.lang.String getApplicationName() {
		return _applicationStatus.getApplicationName();
	}

	/**
	* Sets the application name of this application status.
	*
	* @param applicationName the application name of this application status
	*/
	@Override
	public void setApplicationName(java.lang.String applicationName) {
		_applicationStatus.setApplicationName(applicationName);
	}

	/**
	* Returns the status ID of this application status.
	*
	* @return the status ID of this application status
	*/
	@Override
	public java.lang.String getStatusId() {
		return _applicationStatus.getStatusId();
	}

	/**
	* Sets the status ID of this application status.
	*
	* @param statusId the status ID of this application status
	*/
	@Override
	public void setStatusId(java.lang.String statusId) {
		_applicationStatus.setStatusId(statusId);
	}

	/**
	* Returns the name of this application status.
	*
	* @return the name of this application status
	*/
	@Override
	public java.lang.String getName() {
		return _applicationStatus.getName();
	}

	/**
	* Sets the name of this application status.
	*
	* @param name the name of this application status
	*/
	@Override
	public void setName(java.lang.String name) {
		_applicationStatus.setName(name);
	}

	/**
	* Returns the description of this application status.
	*
	* @return the description of this application status
	*/
	@Override
	public java.lang.String getDescription() {
		return _applicationStatus.getDescription();
	}

	/**
	* Sets the description of this application status.
	*
	* @param description the description of this application status
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_applicationStatus.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _applicationStatus.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_applicationStatus.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _applicationStatus.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_applicationStatus.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _applicationStatus.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _applicationStatus.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_applicationStatus.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _applicationStatus.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_applicationStatus.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_applicationStatus.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_applicationStatus.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ApplicationStatusWrapper((ApplicationStatus)_applicationStatus.clone());
	}

	@Override
	public int compareTo(
		es.davinciti.liferay.model.ApplicationStatus applicationStatus) {
		return _applicationStatus.compareTo(applicationStatus);
	}

	@Override
	public int hashCode() {
		return _applicationStatus.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.ApplicationStatus> toCacheModel() {
		return _applicationStatus.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.ApplicationStatus toEscapedModel() {
		return new ApplicationStatusWrapper(_applicationStatus.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.ApplicationStatus toUnescapedModel() {
		return new ApplicationStatusWrapper(_applicationStatus.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _applicationStatus.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _applicationStatus.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_applicationStatus.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApplicationStatusWrapper)) {
			return false;
		}

		ApplicationStatusWrapper applicationStatusWrapper = (ApplicationStatusWrapper)obj;

		if (Validator.equals(_applicationStatus,
					applicationStatusWrapper._applicationStatus)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ApplicationStatus getWrappedApplicationStatus() {
		return _applicationStatus;
	}

	@Override
	public ApplicationStatus getWrappedModel() {
		return _applicationStatus;
	}

	@Override
	public void resetOriginalValues() {
		_applicationStatus.resetOriginalValues();
	}

	private ApplicationStatus _applicationStatus;
}