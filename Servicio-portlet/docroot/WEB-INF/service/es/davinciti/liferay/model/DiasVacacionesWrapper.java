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
 * This class is a wrapper for {@link DiasVacaciones}.
 * </p>
 *
 * @author Cmes
 * @see DiasVacaciones
 * @generated
 */
public class DiasVacacionesWrapper implements DiasVacaciones,
	ModelWrapper<DiasVacaciones> {
	public DiasVacacionesWrapper(DiasVacaciones diasVacaciones) {
		_diasVacaciones = diasVacaciones;
	}

	@Override
	public Class<?> getModelClass() {
		return DiasVacaciones.class;
	}

	@Override
	public String getModelClassName() {
		return DiasVacaciones.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("diasVacacionesId", getDiasVacacionesId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("year", getYear());
		attributes.put("disponibles", getDisponibles());
		attributes.put("solicitados", getSolicitados());
		attributes.put("aprobados", getAprobados());
		attributes.put("pendientes", getPendientes());
		attributes.put("asignado", getAsignado());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long diasVacacionesId = (Long)attributes.get("diasVacacionesId");

		if (diasVacacionesId != null) {
			setDiasVacacionesId(diasVacacionesId);
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

		Integer disponibles = (Integer)attributes.get("disponibles");

		if (disponibles != null) {
			setDisponibles(disponibles);
		}

		Integer solicitados = (Integer)attributes.get("solicitados");

		if (solicitados != null) {
			setSolicitados(solicitados);
		}

		Integer aprobados = (Integer)attributes.get("aprobados");

		if (aprobados != null) {
			setAprobados(aprobados);
		}

		Integer pendientes = (Integer)attributes.get("pendientes");

		if (pendientes != null) {
			setPendientes(pendientes);
		}

		String asignado = (String)attributes.get("asignado");

		if (asignado != null) {
			setAsignado(asignado);
		}
	}

	/**
	* Returns the primary key of this dias vacaciones.
	*
	* @return the primary key of this dias vacaciones
	*/
	@Override
	public long getPrimaryKey() {
		return _diasVacaciones.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dias vacaciones.
	*
	* @param primaryKey the primary key of this dias vacaciones
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_diasVacaciones.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dias vacaciones ID of this dias vacaciones.
	*
	* @return the dias vacaciones ID of this dias vacaciones
	*/
	@Override
	public long getDiasVacacionesId() {
		return _diasVacaciones.getDiasVacacionesId();
	}

	/**
	* Sets the dias vacaciones ID of this dias vacaciones.
	*
	* @param diasVacacionesId the dias vacaciones ID of this dias vacaciones
	*/
	@Override
	public void setDiasVacacionesId(long diasVacacionesId) {
		_diasVacaciones.setDiasVacacionesId(diasVacacionesId);
	}

	/**
	* Returns the company ID of this dias vacaciones.
	*
	* @return the company ID of this dias vacaciones
	*/
	@Override
	public long getCompanyId() {
		return _diasVacaciones.getCompanyId();
	}

	/**
	* Sets the company ID of this dias vacaciones.
	*
	* @param companyId the company ID of this dias vacaciones
	*/
	@Override
	public void setCompanyId(long companyId) {
		_diasVacaciones.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this dias vacaciones.
	*
	* @return the user ID of this dias vacaciones
	*/
	@Override
	public long getUserId() {
		return _diasVacaciones.getUserId();
	}

	/**
	* Sets the user ID of this dias vacaciones.
	*
	* @param userId the user ID of this dias vacaciones
	*/
	@Override
	public void setUserId(long userId) {
		_diasVacaciones.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dias vacaciones.
	*
	* @return the user uuid of this dias vacaciones
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _diasVacaciones.getUserUuid();
	}

	/**
	* Sets the user uuid of this dias vacaciones.
	*
	* @param userUuid the user uuid of this dias vacaciones
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_diasVacaciones.setUserUuid(userUuid);
	}

	/**
	* Returns the year of this dias vacaciones.
	*
	* @return the year of this dias vacaciones
	*/
	@Override
	public int getYear() {
		return _diasVacaciones.getYear();
	}

	/**
	* Sets the year of this dias vacaciones.
	*
	* @param year the year of this dias vacaciones
	*/
	@Override
	public void setYear(int year) {
		_diasVacaciones.setYear(year);
	}

	/**
	* Returns the disponibles of this dias vacaciones.
	*
	* @return the disponibles of this dias vacaciones
	*/
	@Override
	public int getDisponibles() {
		return _diasVacaciones.getDisponibles();
	}

	/**
	* Sets the disponibles of this dias vacaciones.
	*
	* @param disponibles the disponibles of this dias vacaciones
	*/
	@Override
	public void setDisponibles(int disponibles) {
		_diasVacaciones.setDisponibles(disponibles);
	}

	/**
	* Returns the solicitados of this dias vacaciones.
	*
	* @return the solicitados of this dias vacaciones
	*/
	@Override
	public int getSolicitados() {
		return _diasVacaciones.getSolicitados();
	}

	/**
	* Sets the solicitados of this dias vacaciones.
	*
	* @param solicitados the solicitados of this dias vacaciones
	*/
	@Override
	public void setSolicitados(int solicitados) {
		_diasVacaciones.setSolicitados(solicitados);
	}

	/**
	* Returns the aprobados of this dias vacaciones.
	*
	* @return the aprobados of this dias vacaciones
	*/
	@Override
	public int getAprobados() {
		return _diasVacaciones.getAprobados();
	}

	/**
	* Sets the aprobados of this dias vacaciones.
	*
	* @param aprobados the aprobados of this dias vacaciones
	*/
	@Override
	public void setAprobados(int aprobados) {
		_diasVacaciones.setAprobados(aprobados);
	}

	/**
	* Returns the pendientes of this dias vacaciones.
	*
	* @return the pendientes of this dias vacaciones
	*/
	@Override
	public int getPendientes() {
		return _diasVacaciones.getPendientes();
	}

	/**
	* Sets the pendientes of this dias vacaciones.
	*
	* @param pendientes the pendientes of this dias vacaciones
	*/
	@Override
	public void setPendientes(int pendientes) {
		_diasVacaciones.setPendientes(pendientes);
	}

	/**
	* Returns the asignado of this dias vacaciones.
	*
	* @return the asignado of this dias vacaciones
	*/
	@Override
	public java.lang.String getAsignado() {
		return _diasVacaciones.getAsignado();
	}

	/**
	* Sets the asignado of this dias vacaciones.
	*
	* @param asignado the asignado of this dias vacaciones
	*/
	@Override
	public void setAsignado(java.lang.String asignado) {
		_diasVacaciones.setAsignado(asignado);
	}

	@Override
	public boolean isNew() {
		return _diasVacaciones.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_diasVacaciones.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _diasVacaciones.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_diasVacaciones.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _diasVacaciones.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _diasVacaciones.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_diasVacaciones.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _diasVacaciones.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_diasVacaciones.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_diasVacaciones.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_diasVacaciones.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DiasVacacionesWrapper((DiasVacaciones)_diasVacaciones.clone());
	}

	@Override
	public int compareTo(
		es.davinciti.liferay.model.DiasVacaciones diasVacaciones) {
		return _diasVacaciones.compareTo(diasVacaciones);
	}

	@Override
	public int hashCode() {
		return _diasVacaciones.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.DiasVacaciones> toCacheModel() {
		return _diasVacaciones.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.DiasVacaciones toEscapedModel() {
		return new DiasVacacionesWrapper(_diasVacaciones.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.DiasVacaciones toUnescapedModel() {
		return new DiasVacacionesWrapper(_diasVacaciones.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _diasVacaciones.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _diasVacaciones.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_diasVacaciones.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DiasVacacionesWrapper)) {
			return false;
		}

		DiasVacacionesWrapper diasVacacionesWrapper = (DiasVacacionesWrapper)obj;

		if (Validator.equals(_diasVacaciones,
					diasVacacionesWrapper._diasVacaciones)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DiasVacaciones getWrappedDiasVacaciones() {
		return _diasVacaciones;
	}

	@Override
	public DiasVacaciones getWrappedModel() {
		return _diasVacaciones;
	}

	@Override
	public void resetOriginalValues() {
		_diasVacaciones.resetOriginalValues();
	}

	private DiasVacaciones _diasVacaciones;
}