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
 * This class is a wrapper for {@link SapEmployee}.
 * </p>
 *
 * @author Cmes
 * @see SapEmployee
 * @generated
 */
public class SapEmployeeWrapper implements SapEmployee,
	ModelWrapper<SapEmployee> {
	public SapEmployeeWrapper(SapEmployee sapEmployee) {
		_sapEmployee = sapEmployee;
	}

	@Override
	public Class<?> getModelClass() {
		return SapEmployee.class;
	}

	@Override
	public String getModelClassName() {
		return SapEmployee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sapEmployeeId", getSapEmployeeId());
		attributes.put("employeeID", getEmployeeID());
		attributes.put("userId", getUserId());
		attributes.put("middleName", getMiddleName());
		attributes.put("gender", getGender());
		attributes.put("jobTitle", getJobTitle());
		attributes.put("employeeType", getEmployeeType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sapEmployeeId = (Long)attributes.get("sapEmployeeId");

		if (sapEmployeeId != null) {
			setSapEmployeeId(sapEmployeeId);
		}

		Long employeeID = (Long)attributes.get("employeeID");

		if (employeeID != null) {
			setEmployeeID(employeeID);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String jobTitle = (String)attributes.get("jobTitle");

		if (jobTitle != null) {
			setJobTitle(jobTitle);
		}

		String employeeType = (String)attributes.get("employeeType");

		if (employeeType != null) {
			setEmployeeType(employeeType);
		}
	}

	/**
	* Returns the primary key of this sap employee.
	*
	* @return the primary key of this sap employee
	*/
	@Override
	public long getPrimaryKey() {
		return _sapEmployee.getPrimaryKey();
	}

	/**
	* Sets the primary key of this sap employee.
	*
	* @param primaryKey the primary key of this sap employee
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_sapEmployee.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the sap employee ID of this sap employee.
	*
	* @return the sap employee ID of this sap employee
	*/
	@Override
	public long getSapEmployeeId() {
		return _sapEmployee.getSapEmployeeId();
	}

	/**
	* Sets the sap employee ID of this sap employee.
	*
	* @param sapEmployeeId the sap employee ID of this sap employee
	*/
	@Override
	public void setSapEmployeeId(long sapEmployeeId) {
		_sapEmployee.setSapEmployeeId(sapEmployeeId);
	}

	/**
	* Returns the employee i d of this sap employee.
	*
	* @return the employee i d of this sap employee
	*/
	@Override
	public long getEmployeeID() {
		return _sapEmployee.getEmployeeID();
	}

	/**
	* Sets the employee i d of this sap employee.
	*
	* @param employeeID the employee i d of this sap employee
	*/
	@Override
	public void setEmployeeID(long employeeID) {
		_sapEmployee.setEmployeeID(employeeID);
	}

	/**
	* Returns the user ID of this sap employee.
	*
	* @return the user ID of this sap employee
	*/
	@Override
	public long getUserId() {
		return _sapEmployee.getUserId();
	}

	/**
	* Sets the user ID of this sap employee.
	*
	* @param userId the user ID of this sap employee
	*/
	@Override
	public void setUserId(long userId) {
		_sapEmployee.setUserId(userId);
	}

	/**
	* Returns the user uuid of this sap employee.
	*
	* @return the user uuid of this sap employee
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sapEmployee.getUserUuid();
	}

	/**
	* Sets the user uuid of this sap employee.
	*
	* @param userUuid the user uuid of this sap employee
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_sapEmployee.setUserUuid(userUuid);
	}

	/**
	* Returns the middle name of this sap employee.
	*
	* @return the middle name of this sap employee
	*/
	@Override
	public java.lang.String getMiddleName() {
		return _sapEmployee.getMiddleName();
	}

	/**
	* Sets the middle name of this sap employee.
	*
	* @param middleName the middle name of this sap employee
	*/
	@Override
	public void setMiddleName(java.lang.String middleName) {
		_sapEmployee.setMiddleName(middleName);
	}

	/**
	* Returns the gender of this sap employee.
	*
	* @return the gender of this sap employee
	*/
	@Override
	public java.lang.String getGender() {
		return _sapEmployee.getGender();
	}

	/**
	* Sets the gender of this sap employee.
	*
	* @param gender the gender of this sap employee
	*/
	@Override
	public void setGender(java.lang.String gender) {
		_sapEmployee.setGender(gender);
	}

	/**
	* Returns the job title of this sap employee.
	*
	* @return the job title of this sap employee
	*/
	@Override
	public java.lang.String getJobTitle() {
		return _sapEmployee.getJobTitle();
	}

	/**
	* Sets the job title of this sap employee.
	*
	* @param jobTitle the job title of this sap employee
	*/
	@Override
	public void setJobTitle(java.lang.String jobTitle) {
		_sapEmployee.setJobTitle(jobTitle);
	}

	/**
	* Returns the employee type of this sap employee.
	*
	* @return the employee type of this sap employee
	*/
	@Override
	public java.lang.String getEmployeeType() {
		return _sapEmployee.getEmployeeType();
	}

	/**
	* Sets the employee type of this sap employee.
	*
	* @param employeeType the employee type of this sap employee
	*/
	@Override
	public void setEmployeeType(java.lang.String employeeType) {
		_sapEmployee.setEmployeeType(employeeType);
	}

	@Override
	public boolean isNew() {
		return _sapEmployee.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_sapEmployee.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _sapEmployee.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sapEmployee.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _sapEmployee.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _sapEmployee.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sapEmployee.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sapEmployee.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_sapEmployee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_sapEmployee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sapEmployee.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SapEmployeeWrapper((SapEmployee)_sapEmployee.clone());
	}

	@Override
	public int compareTo(es.davinciti.liferay.model.SapEmployee sapEmployee) {
		return _sapEmployee.compareTo(sapEmployee);
	}

	@Override
	public int hashCode() {
		return _sapEmployee.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.SapEmployee> toCacheModel() {
		return _sapEmployee.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.SapEmployee toEscapedModel() {
		return new SapEmployeeWrapper(_sapEmployee.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.SapEmployee toUnescapedModel() {
		return new SapEmployeeWrapper(_sapEmployee.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sapEmployee.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sapEmployee.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sapEmployee.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SapEmployeeWrapper)) {
			return false;
		}

		SapEmployeeWrapper sapEmployeeWrapper = (SapEmployeeWrapper)obj;

		if (Validator.equals(_sapEmployee, sapEmployeeWrapper._sapEmployee)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SapEmployee getWrappedSapEmployee() {
		return _sapEmployee;
	}

	@Override
	public SapEmployee getWrappedModel() {
		return _sapEmployee;
	}

	@Override
	public void resetOriginalValues() {
		_sapEmployee.resetOriginalValues();
	}

	private SapEmployee _sapEmployee;
}