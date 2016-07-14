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
 * This class is a wrapper for {@link TipoDiaCalendar}.
 * </p>
 *
 * @author Cmes
 * @see TipoDiaCalendar
 * @generated
 */
public class TipoDiaCalendarWrapper implements TipoDiaCalendar,
	ModelWrapper<TipoDiaCalendar> {
	public TipoDiaCalendarWrapper(TipoDiaCalendar tipoDiaCalendar) {
		_tipoDiaCalendar = tipoDiaCalendar;
	}

	@Override
	public Class<?> getModelClass() {
		return TipoDiaCalendar.class;
	}

	@Override
	public String getModelClassName() {
		return TipoDiaCalendar.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tipoDiaCalendarId", getTipoDiaCalendarId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("fondoColor", getFondoColor());
		attributes.put("letraColor", getLetraColor());
		attributes.put("strong", getStrong());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tipoDiaCalendarId = (Long)attributes.get("tipoDiaCalendarId");

		if (tipoDiaCalendarId != null) {
			setTipoDiaCalendarId(tipoDiaCalendarId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String fondoColor = (String)attributes.get("fondoColor");

		if (fondoColor != null) {
			setFondoColor(fondoColor);
		}

		String letraColor = (String)attributes.get("letraColor");

		if (letraColor != null) {
			setLetraColor(letraColor);
		}

		String strong = (String)attributes.get("strong");

		if (strong != null) {
			setStrong(strong);
		}
	}

	/**
	* Returns the primary key of this tipo dia calendar.
	*
	* @return the primary key of this tipo dia calendar
	*/
	@Override
	public long getPrimaryKey() {
		return _tipoDiaCalendar.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tipo dia calendar.
	*
	* @param primaryKey the primary key of this tipo dia calendar
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tipoDiaCalendar.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the tipo dia calendar ID of this tipo dia calendar.
	*
	* @return the tipo dia calendar ID of this tipo dia calendar
	*/
	@Override
	public long getTipoDiaCalendarId() {
		return _tipoDiaCalendar.getTipoDiaCalendarId();
	}

	/**
	* Sets the tipo dia calendar ID of this tipo dia calendar.
	*
	* @param tipoDiaCalendarId the tipo dia calendar ID of this tipo dia calendar
	*/
	@Override
	public void setTipoDiaCalendarId(long tipoDiaCalendarId) {
		_tipoDiaCalendar.setTipoDiaCalendarId(tipoDiaCalendarId);
	}

	/**
	* Returns the descripcion of this tipo dia calendar.
	*
	* @return the descripcion of this tipo dia calendar
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _tipoDiaCalendar.getDescripcion();
	}

	/**
	* Sets the descripcion of this tipo dia calendar.
	*
	* @param descripcion the descripcion of this tipo dia calendar
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_tipoDiaCalendar.setDescripcion(descripcion);
	}

	/**
	* Returns the fondo color of this tipo dia calendar.
	*
	* @return the fondo color of this tipo dia calendar
	*/
	@Override
	public java.lang.String getFondoColor() {
		return _tipoDiaCalendar.getFondoColor();
	}

	/**
	* Sets the fondo color of this tipo dia calendar.
	*
	* @param fondoColor the fondo color of this tipo dia calendar
	*/
	@Override
	public void setFondoColor(java.lang.String fondoColor) {
		_tipoDiaCalendar.setFondoColor(fondoColor);
	}

	/**
	* Returns the letra color of this tipo dia calendar.
	*
	* @return the letra color of this tipo dia calendar
	*/
	@Override
	public java.lang.String getLetraColor() {
		return _tipoDiaCalendar.getLetraColor();
	}

	/**
	* Sets the letra color of this tipo dia calendar.
	*
	* @param letraColor the letra color of this tipo dia calendar
	*/
	@Override
	public void setLetraColor(java.lang.String letraColor) {
		_tipoDiaCalendar.setLetraColor(letraColor);
	}

	/**
	* Returns the strong of this tipo dia calendar.
	*
	* @return the strong of this tipo dia calendar
	*/
	@Override
	public java.lang.String getStrong() {
		return _tipoDiaCalendar.getStrong();
	}

	/**
	* Sets the strong of this tipo dia calendar.
	*
	* @param strong the strong of this tipo dia calendar
	*/
	@Override
	public void setStrong(java.lang.String strong) {
		_tipoDiaCalendar.setStrong(strong);
	}

	@Override
	public boolean isNew() {
		return _tipoDiaCalendar.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tipoDiaCalendar.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tipoDiaCalendar.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tipoDiaCalendar.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tipoDiaCalendar.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tipoDiaCalendar.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tipoDiaCalendar.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tipoDiaCalendar.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tipoDiaCalendar.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tipoDiaCalendar.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tipoDiaCalendar.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TipoDiaCalendarWrapper((TipoDiaCalendar)_tipoDiaCalendar.clone());
	}

	@Override
	public int compareTo(
		es.davinciti.liferay.model.TipoDiaCalendar tipoDiaCalendar) {
		return _tipoDiaCalendar.compareTo(tipoDiaCalendar);
	}

	@Override
	public int hashCode() {
		return _tipoDiaCalendar.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.TipoDiaCalendar> toCacheModel() {
		return _tipoDiaCalendar.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.TipoDiaCalendar toEscapedModel() {
		return new TipoDiaCalendarWrapper(_tipoDiaCalendar.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.TipoDiaCalendar toUnescapedModel() {
		return new TipoDiaCalendarWrapper(_tipoDiaCalendar.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tipoDiaCalendar.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tipoDiaCalendar.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tipoDiaCalendar.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TipoDiaCalendarWrapper)) {
			return false;
		}

		TipoDiaCalendarWrapper tipoDiaCalendarWrapper = (TipoDiaCalendarWrapper)obj;

		if (Validator.equals(_tipoDiaCalendar,
					tipoDiaCalendarWrapper._tipoDiaCalendar)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TipoDiaCalendar getWrappedTipoDiaCalendar() {
		return _tipoDiaCalendar;
	}

	@Override
	public TipoDiaCalendar getWrappedModel() {
		return _tipoDiaCalendar;
	}

	@Override
	public void resetOriginalValues() {
		_tipoDiaCalendar.resetOriginalValues();
	}

	private TipoDiaCalendar _tipoDiaCalendar;
}