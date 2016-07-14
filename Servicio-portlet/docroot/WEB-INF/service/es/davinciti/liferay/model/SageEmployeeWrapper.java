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
 * This class is a wrapper for {@link SageEmployee}.
 * </p>
 *
 * @author Cmes
 * @see SageEmployee
 * @generated
 */
public class SageEmployeeWrapper implements SageEmployee,
	ModelWrapper<SageEmployee> {
	public SageEmployeeWrapper(SageEmployee sageEmployee) {
		_sageEmployee = sageEmployee;
	}

	@Override
	public Class<?> getModelClass() {
		return SageEmployee.class;
	}

	@Override
	public String getModelClassName() {
		return SageEmployee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sageEmployeeId", getSageEmployeeId());
		attributes.put("userId", getUserId());
		attributes.put("employeeID", getEmployeeID());
		attributes.put("applicationId", getApplicationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("personId", getPersonId());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("seniority", getSeniority());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sageEmployeeId = (Long)attributes.get("sageEmployeeId");

		if (sageEmployeeId != null) {
			setSageEmployeeId(sageEmployeeId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String employeeID = (String)attributes.get("employeeID");

		if (employeeID != null) {
			setEmployeeID(employeeID);
		}

		String applicationId = (String)attributes.get("applicationId");

		if (applicationId != null) {
			setApplicationId(applicationId);
		}

		String companyId = (String)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String personId = (String)attributes.get("personId");

		if (personId != null) {
			setPersonId(personId);
		}

		String startDate = (String)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		String endDate = (String)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		String seniority = (String)attributes.get("seniority");

		if (seniority != null) {
			setSeniority(seniority);
		}
	}

	/**
	* Returns the primary key of this sage employee.
	*
	* @return the primary key of this sage employee
	*/
	@Override
	public long getPrimaryKey() {
		return _sageEmployee.getPrimaryKey();
	}

	/**
	* Sets the primary key of this sage employee.
	*
	* @param primaryKey the primary key of this sage employee
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_sageEmployee.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the sage employee ID of this sage employee.
	*
	* @return the sage employee ID of this sage employee
	*/
	@Override
	public long getSageEmployeeId() {
		return _sageEmployee.getSageEmployeeId();
	}

	/**
	* Sets the sage employee ID of this sage employee.
	*
	* @param sageEmployeeId the sage employee ID of this sage employee
	*/
	@Override
	public void setSageEmployeeId(long sageEmployeeId) {
		_sageEmployee.setSageEmployeeId(sageEmployeeId);
	}

	/**
	* Returns the user ID of this sage employee.
	*
	* @return the user ID of this sage employee
	*/
	@Override
	public long getUserId() {
		return _sageEmployee.getUserId();
	}

	/**
	* Sets the user ID of this sage employee.
	*
	* @param userId the user ID of this sage employee
	*/
	@Override
	public void setUserId(long userId) {
		_sageEmployee.setUserId(userId);
	}

	/**
	* Returns the user uuid of this sage employee.
	*
	* @return the user uuid of this sage employee
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sageEmployee.getUserUuid();
	}

	/**
	* Sets the user uuid of this sage employee.
	*
	* @param userUuid the user uuid of this sage employee
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_sageEmployee.setUserUuid(userUuid);
	}

	/**
	* Returns the employee i d of this sage employee.
	*
	* @return the employee i d of this sage employee
	*/
	@Override
	public java.lang.String getEmployeeID() {
		return _sageEmployee.getEmployeeID();
	}

	/**
	* Sets the employee i d of this sage employee.
	*
	* @param employeeID the employee i d of this sage employee
	*/
	@Override
	public void setEmployeeID(java.lang.String employeeID) {
		_sageEmployee.setEmployeeID(employeeID);
	}

	/**
	* Returns the application ID of this sage employee.
	*
	* @return the application ID of this sage employee
	*/
	@Override
	public java.lang.String getApplicationId() {
		return _sageEmployee.getApplicationId();
	}

	/**
	* Sets the application ID of this sage employee.
	*
	* @param applicationId the application ID of this sage employee
	*/
	@Override
	public void setApplicationId(java.lang.String applicationId) {
		_sageEmployee.setApplicationId(applicationId);
	}

	/**
	* Returns the company ID of this sage employee.
	*
	* @return the company ID of this sage employee
	*/
	@Override
	public java.lang.String getCompanyId() {
		return _sageEmployee.getCompanyId();
	}

	/**
	* Sets the company ID of this sage employee.
	*
	* @param companyId the company ID of this sage employee
	*/
	@Override
	public void setCompanyId(java.lang.String companyId) {
		_sageEmployee.setCompanyId(companyId);
	}

	/**
	* Returns the person ID of this sage employee.
	*
	* @return the person ID of this sage employee
	*/
	@Override
	public java.lang.String getPersonId() {
		return _sageEmployee.getPersonId();
	}

	/**
	* Sets the person ID of this sage employee.
	*
	* @param personId the person ID of this sage employee
	*/
	@Override
	public void setPersonId(java.lang.String personId) {
		_sageEmployee.setPersonId(personId);
	}

	/**
	* Returns the start date of this sage employee.
	*
	* @return the start date of this sage employee
	*/
	@Override
	public java.lang.String getStartDate() {
		return _sageEmployee.getStartDate();
	}

	/**
	* Sets the start date of this sage employee.
	*
	* @param startDate the start date of this sage employee
	*/
	@Override
	public void setStartDate(java.lang.String startDate) {
		_sageEmployee.setStartDate(startDate);
	}

	/**
	* Returns the end date of this sage employee.
	*
	* @return the end date of this sage employee
	*/
	@Override
	public java.lang.String getEndDate() {
		return _sageEmployee.getEndDate();
	}

	/**
	* Sets the end date of this sage employee.
	*
	* @param endDate the end date of this sage employee
	*/
	@Override
	public void setEndDate(java.lang.String endDate) {
		_sageEmployee.setEndDate(endDate);
	}

	/**
	* Returns the seniority of this sage employee.
	*
	* @return the seniority of this sage employee
	*/
	@Override
	public java.lang.String getSeniority() {
		return _sageEmployee.getSeniority();
	}

	/**
	* Sets the seniority of this sage employee.
	*
	* @param seniority the seniority of this sage employee
	*/
	@Override
	public void setSeniority(java.lang.String seniority) {
		_sageEmployee.setSeniority(seniority);
	}

	@Override
	public boolean isNew() {
		return _sageEmployee.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_sageEmployee.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _sageEmployee.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sageEmployee.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _sageEmployee.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _sageEmployee.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sageEmployee.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sageEmployee.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_sageEmployee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_sageEmployee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sageEmployee.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SageEmployeeWrapper((SageEmployee)_sageEmployee.clone());
	}

	@Override
	public int compareTo(es.davinciti.liferay.model.SageEmployee sageEmployee) {
		return _sageEmployee.compareTo(sageEmployee);
	}

	@Override
	public int hashCode() {
		return _sageEmployee.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.SageEmployee> toCacheModel() {
		return _sageEmployee.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.SageEmployee toEscapedModel() {
		return new SageEmployeeWrapper(_sageEmployee.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.SageEmployee toUnescapedModel() {
		return new SageEmployeeWrapper(_sageEmployee.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sageEmployee.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sageEmployee.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sageEmployee.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SageEmployeeWrapper)) {
			return false;
		}

		SageEmployeeWrapper sageEmployeeWrapper = (SageEmployeeWrapper)obj;

		if (Validator.equals(_sageEmployee, sageEmployeeWrapper._sageEmployee)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SageEmployee getWrappedSageEmployee() {
		return _sageEmployee;
	}

	@Override
	public SageEmployee getWrappedModel() {
		return _sageEmployee;
	}

	@Override
	public void resetOriginalValues() {
		_sageEmployee.resetOriginalValues();
	}

	private SageEmployee _sageEmployee;
}