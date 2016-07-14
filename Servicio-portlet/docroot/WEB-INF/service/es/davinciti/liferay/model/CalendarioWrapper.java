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
 * This class is a wrapper for {@link Calendario}.
 * </p>
 *
 * @author Cmes
 * @see Calendario
 * @generated
 */
public class CalendarioWrapper implements Calendario, ModelWrapper<Calendario> {
	public CalendarioWrapper(Calendario calendario) {
		_calendario = calendario;
	}

	@Override
	public Class<?> getModelClass() {
		return Calendario.class;
	}

	@Override
	public String getModelClassName() {
		return Calendario.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("calendarioId", getCalendarioId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("year", getYear());
		attributes.put("calendarJson", getCalendarJson());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long calendarioId = (Long)attributes.get("calendarioId");

		if (calendarioId != null) {
			setCalendarioId(calendarioId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Integer year = (Integer)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		String calendarJson = (String)attributes.get("calendarJson");

		if (calendarJson != null) {
			setCalendarJson(calendarJson);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this calendario.
	*
	* @return the primary key of this calendario
	*/
	@Override
	public long getPrimaryKey() {
		return _calendario.getPrimaryKey();
	}

	/**
	* Sets the primary key of this calendario.
	*
	* @param primaryKey the primary key of this calendario
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_calendario.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the calendario ID of this calendario.
	*
	* @return the calendario ID of this calendario
	*/
	@Override
	public long getCalendarioId() {
		return _calendario.getCalendarioId();
	}

	/**
	* Sets the calendario ID of this calendario.
	*
	* @param calendarioId the calendario ID of this calendario
	*/
	@Override
	public void setCalendarioId(long calendarioId) {
		_calendario.setCalendarioId(calendarioId);
	}

	/**
	* Returns the company ID of this calendario.
	*
	* @return the company ID of this calendario
	*/
	@Override
	public long getCompanyId() {
		return _calendario.getCompanyId();
	}

	/**
	* Sets the company ID of this calendario.
	*
	* @param companyId the company ID of this calendario
	*/
	@Override
	public void setCompanyId(long companyId) {
		_calendario.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this calendario.
	*
	* @return the user ID of this calendario
	*/
	@Override
	public long getUserId() {
		return _calendario.getUserId();
	}

	/**
	* Sets the user ID of this calendario.
	*
	* @param userId the user ID of this calendario
	*/
	@Override
	public void setUserId(long userId) {
		_calendario.setUserId(userId);
	}

	/**
	* Returns the user uuid of this calendario.
	*
	* @return the user uuid of this calendario
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendario.getUserUuid();
	}

	/**
	* Sets the user uuid of this calendario.
	*
	* @param userUuid the user uuid of this calendario
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_calendario.setUserUuid(userUuid);
	}

	/**
	* Returns the year of this calendario.
	*
	* @return the year of this calendario
	*/
	@Override
	public int getYear() {
		return _calendario.getYear();
	}

	/**
	* Sets the year of this calendario.
	*
	* @param year the year of this calendario
	*/
	@Override
	public void setYear(int year) {
		_calendario.setYear(year);
	}

	/**
	* Returns the calendar json of this calendario.
	*
	* @return the calendar json of this calendario
	*/
	@Override
	public java.lang.String getCalendarJson() {
		return _calendario.getCalendarJson();
	}

	/**
	* Sets the calendar json of this calendario.
	*
	* @param calendarJson the calendar json of this calendario
	*/
	@Override
	public void setCalendarJson(java.lang.String calendarJson) {
		_calendario.setCalendarJson(calendarJson);
	}

	/**
	* Returns the status of this calendario.
	*
	* @return the status of this calendario
	*/
	@Override
	public java.lang.String getStatus() {
		return _calendario.getStatus();
	}

	/**
	* Sets the status of this calendario.
	*
	* @param status the status of this calendario
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_calendario.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _calendario.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_calendario.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _calendario.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_calendario.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _calendario.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _calendario.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_calendario.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _calendario.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_calendario.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_calendario.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_calendario.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CalendarioWrapper((Calendario)_calendario.clone());
	}

	@Override
	public int compareTo(es.davinciti.liferay.model.Calendario calendario) {
		return _calendario.compareTo(calendario);
	}

	@Override
	public int hashCode() {
		return _calendario.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.Calendario> toCacheModel() {
		return _calendario.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.Calendario toEscapedModel() {
		return new CalendarioWrapper(_calendario.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.Calendario toUnescapedModel() {
		return new CalendarioWrapper(_calendario.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _calendario.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _calendario.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_calendario.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CalendarioWrapper)) {
			return false;
		}

		CalendarioWrapper calendarioWrapper = (CalendarioWrapper)obj;

		if (Validator.equals(_calendario, calendarioWrapper._calendario)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Calendario getWrappedCalendario() {
		return _calendario;
	}

	@Override
	public Calendario getWrappedModel() {
		return _calendario;
	}

	@Override
	public void resetOriginalValues() {
		_calendario.resetOriginalValues();
	}

	private Calendario _calendario;
}