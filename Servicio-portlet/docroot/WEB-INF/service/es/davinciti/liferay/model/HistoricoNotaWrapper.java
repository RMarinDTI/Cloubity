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
 * This class is a wrapper for {@link HistoricoNota}.
 * </p>
 *
 * @author Cmes
 * @see HistoricoNota
 * @generated
 */
public class HistoricoNotaWrapper implements HistoricoNota,
	ModelWrapper<HistoricoNota> {
	public HistoricoNotaWrapper(HistoricoNota historicoNota) {
		_historicoNota = historicoNota;
	}

	@Override
	public Class<?> getModelClass() {
		return HistoricoNota.class;
	}

	@Override
	public String getModelClassName() {
		return HistoricoNota.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("historiconotaId", getHistoriconotaId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("comments", getComments());
		attributes.put("updateAt", getUpdateAt());
		attributes.put("prevStatus", getPrevStatus());
		attributes.put("newStatus", getNewStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long historiconotaId = (Long)attributes.get("historiconotaId");

		if (historiconotaId != null) {
			setHistoriconotaId(historiconotaId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}

		String updateAt = (String)attributes.get("updateAt");

		if (updateAt != null) {
			setUpdateAt(updateAt);
		}

		String prevStatus = (String)attributes.get("prevStatus");

		if (prevStatus != null) {
			setPrevStatus(prevStatus);
		}

		String newStatus = (String)attributes.get("newStatus");

		if (newStatus != null) {
			setNewStatus(newStatus);
		}
	}

	/**
	* Returns the primary key of this historico nota.
	*
	* @return the primary key of this historico nota
	*/
	@Override
	public long getPrimaryKey() {
		return _historicoNota.getPrimaryKey();
	}

	/**
	* Sets the primary key of this historico nota.
	*
	* @param primaryKey the primary key of this historico nota
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_historicoNota.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the historiconota ID of this historico nota.
	*
	* @return the historiconota ID of this historico nota
	*/
	@Override
	public long getHistoriconotaId() {
		return _historicoNota.getHistoriconotaId();
	}

	/**
	* Sets the historiconota ID of this historico nota.
	*
	* @param historiconotaId the historiconota ID of this historico nota
	*/
	@Override
	public void setHistoriconotaId(long historiconotaId) {
		_historicoNota.setHistoriconotaId(historiconotaId);
	}

	/**
	* Returns the company ID of this historico nota.
	*
	* @return the company ID of this historico nota
	*/
	@Override
	public long getCompanyId() {
		return _historicoNota.getCompanyId();
	}

	/**
	* Sets the company ID of this historico nota.
	*
	* @param companyId the company ID of this historico nota
	*/
	@Override
	public void setCompanyId(long companyId) {
		_historicoNota.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this historico nota.
	*
	* @return the user ID of this historico nota
	*/
	@Override
	public long getUserId() {
		return _historicoNota.getUserId();
	}

	/**
	* Sets the user ID of this historico nota.
	*
	* @param userId the user ID of this historico nota
	*/
	@Override
	public void setUserId(long userId) {
		_historicoNota.setUserId(userId);
	}

	/**
	* Returns the user uuid of this historico nota.
	*
	* @return the user uuid of this historico nota
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historicoNota.getUserUuid();
	}

	/**
	* Sets the user uuid of this historico nota.
	*
	* @param userUuid the user uuid of this historico nota
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_historicoNota.setUserUuid(userUuid);
	}

	/**
	* Returns the comments of this historico nota.
	*
	* @return the comments of this historico nota
	*/
	@Override
	public java.lang.String getComments() {
		return _historicoNota.getComments();
	}

	/**
	* Sets the comments of this historico nota.
	*
	* @param comments the comments of this historico nota
	*/
	@Override
	public void setComments(java.lang.String comments) {
		_historicoNota.setComments(comments);
	}

	/**
	* Returns the update at of this historico nota.
	*
	* @return the update at of this historico nota
	*/
	@Override
	public java.lang.String getUpdateAt() {
		return _historicoNota.getUpdateAt();
	}

	/**
	* Sets the update at of this historico nota.
	*
	* @param updateAt the update at of this historico nota
	*/
	@Override
	public void setUpdateAt(java.lang.String updateAt) {
		_historicoNota.setUpdateAt(updateAt);
	}

	/**
	* Returns the prev status of this historico nota.
	*
	* @return the prev status of this historico nota
	*/
	@Override
	public java.lang.String getPrevStatus() {
		return _historicoNota.getPrevStatus();
	}

	/**
	* Sets the prev status of this historico nota.
	*
	* @param prevStatus the prev status of this historico nota
	*/
	@Override
	public void setPrevStatus(java.lang.String prevStatus) {
		_historicoNota.setPrevStatus(prevStatus);
	}

	/**
	* Returns the new status of this historico nota.
	*
	* @return the new status of this historico nota
	*/
	@Override
	public java.lang.String getNewStatus() {
		return _historicoNota.getNewStatus();
	}

	/**
	* Sets the new status of this historico nota.
	*
	* @param newStatus the new status of this historico nota
	*/
	@Override
	public void setNewStatus(java.lang.String newStatus) {
		_historicoNota.setNewStatus(newStatus);
	}

	@Override
	public boolean isNew() {
		return _historicoNota.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_historicoNota.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _historicoNota.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_historicoNota.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _historicoNota.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _historicoNota.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_historicoNota.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _historicoNota.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_historicoNota.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_historicoNota.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_historicoNota.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new HistoricoNotaWrapper((HistoricoNota)_historicoNota.clone());
	}

	@Override
	public int compareTo(es.davinciti.liferay.model.HistoricoNota historicoNota) {
		return _historicoNota.compareTo(historicoNota);
	}

	@Override
	public int hashCode() {
		return _historicoNota.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.HistoricoNota> toCacheModel() {
		return _historicoNota.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.HistoricoNota toEscapedModel() {
		return new HistoricoNotaWrapper(_historicoNota.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.HistoricoNota toUnescapedModel() {
		return new HistoricoNotaWrapper(_historicoNota.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _historicoNota.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _historicoNota.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_historicoNota.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HistoricoNotaWrapper)) {
			return false;
		}

		HistoricoNotaWrapper historicoNotaWrapper = (HistoricoNotaWrapper)obj;

		if (Validator.equals(_historicoNota, historicoNotaWrapper._historicoNota)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public HistoricoNota getWrappedHistoricoNota() {
		return _historicoNota;
	}

	@Override
	public HistoricoNota getWrappedModel() {
		return _historicoNota;
	}

	@Override
	public void resetOriginalValues() {
		_historicoNota.resetOriginalValues();
	}

	private HistoricoNota _historicoNota;
}