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
 * This class is a wrapper for {@link NotaGasto}.
 * </p>
 *
 * @author Cmes
 * @see NotaGasto
 * @generated
 */
public class NotaGastoWrapper implements NotaGasto, ModelWrapper<NotaGasto> {
	public NotaGastoWrapper(NotaGasto notaGasto) {
		_notaGasto = notaGasto;
	}

	@Override
	public Class<?> getModelClass() {
		return NotaGasto.class;
	}

	@Override
	public String getModelClassName() {
		return NotaGasto.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("notagastoId", getNotagastoId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("description", getDescription());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("comments", getComments());
		attributes.put("status", getStatus());
		attributes.put("amount", getAmount());
		attributes.put("createDate", getCreateDate());
		attributes.put("updateDate", getUpdateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long notagastoId = (Long)attributes.get("notagastoId");

		if (notagastoId != null) {
			setNotagastoId(notagastoId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String startDate = (String)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		String endDate = (String)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String amount = (String)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		String createDate = (String)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String updateDate = (String)attributes.get("updateDate");

		if (updateDate != null) {
			setUpdateDate(updateDate);
		}
	}

	/**
	* Returns the primary key of this nota gasto.
	*
	* @return the primary key of this nota gasto
	*/
	@Override
	public long getPrimaryKey() {
		return _notaGasto.getPrimaryKey();
	}

	/**
	* Sets the primary key of this nota gasto.
	*
	* @param primaryKey the primary key of this nota gasto
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_notaGasto.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the notagasto ID of this nota gasto.
	*
	* @return the notagasto ID of this nota gasto
	*/
	@Override
	public long getNotagastoId() {
		return _notaGasto.getNotagastoId();
	}

	/**
	* Sets the notagasto ID of this nota gasto.
	*
	* @param notagastoId the notagasto ID of this nota gasto
	*/
	@Override
	public void setNotagastoId(long notagastoId) {
		_notaGasto.setNotagastoId(notagastoId);
	}

	/**
	* Returns the company ID of this nota gasto.
	*
	* @return the company ID of this nota gasto
	*/
	@Override
	public long getCompanyId() {
		return _notaGasto.getCompanyId();
	}

	/**
	* Sets the company ID of this nota gasto.
	*
	* @param companyId the company ID of this nota gasto
	*/
	@Override
	public void setCompanyId(long companyId) {
		_notaGasto.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this nota gasto.
	*
	* @return the user ID of this nota gasto
	*/
	@Override
	public long getUserId() {
		return _notaGasto.getUserId();
	}

	/**
	* Sets the user ID of this nota gasto.
	*
	* @param userId the user ID of this nota gasto
	*/
	@Override
	public void setUserId(long userId) {
		_notaGasto.setUserId(userId);
	}

	/**
	* Returns the user uuid of this nota gasto.
	*
	* @return the user uuid of this nota gasto
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGasto.getUserUuid();
	}

	/**
	* Sets the user uuid of this nota gasto.
	*
	* @param userUuid the user uuid of this nota gasto
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_notaGasto.setUserUuid(userUuid);
	}

	/**
	* Returns the description of this nota gasto.
	*
	* @return the description of this nota gasto
	*/
	@Override
	public java.lang.String getDescription() {
		return _notaGasto.getDescription();
	}

	/**
	* Sets the description of this nota gasto.
	*
	* @param description the description of this nota gasto
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_notaGasto.setDescription(description);
	}

	/**
	* Returns the start date of this nota gasto.
	*
	* @return the start date of this nota gasto
	*/
	@Override
	public java.lang.String getStartDate() {
		return _notaGasto.getStartDate();
	}

	/**
	* Sets the start date of this nota gasto.
	*
	* @param startDate the start date of this nota gasto
	*/
	@Override
	public void setStartDate(java.lang.String startDate) {
		_notaGasto.setStartDate(startDate);
	}

	/**
	* Returns the end date of this nota gasto.
	*
	* @return the end date of this nota gasto
	*/
	@Override
	public java.lang.String getEndDate() {
		return _notaGasto.getEndDate();
	}

	/**
	* Sets the end date of this nota gasto.
	*
	* @param endDate the end date of this nota gasto
	*/
	@Override
	public void setEndDate(java.lang.String endDate) {
		_notaGasto.setEndDate(endDate);
	}

	/**
	* Returns the comments of this nota gasto.
	*
	* @return the comments of this nota gasto
	*/
	@Override
	public java.lang.String getComments() {
		return _notaGasto.getComments();
	}

	/**
	* Sets the comments of this nota gasto.
	*
	* @param comments the comments of this nota gasto
	*/
	@Override
	public void setComments(java.lang.String comments) {
		_notaGasto.setComments(comments);
	}

	/**
	* Returns the status of this nota gasto.
	*
	* @return the status of this nota gasto
	*/
	@Override
	public java.lang.String getStatus() {
		return _notaGasto.getStatus();
	}

	/**
	* Sets the status of this nota gasto.
	*
	* @param status the status of this nota gasto
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_notaGasto.setStatus(status);
	}

	/**
	* Returns the amount of this nota gasto.
	*
	* @return the amount of this nota gasto
	*/
	@Override
	public java.lang.String getAmount() {
		return _notaGasto.getAmount();
	}

	/**
	* Sets the amount of this nota gasto.
	*
	* @param amount the amount of this nota gasto
	*/
	@Override
	public void setAmount(java.lang.String amount) {
		_notaGasto.setAmount(amount);
	}

	/**
	* Returns the create date of this nota gasto.
	*
	* @return the create date of this nota gasto
	*/
	@Override
	public java.lang.String getCreateDate() {
		return _notaGasto.getCreateDate();
	}

	/**
	* Sets the create date of this nota gasto.
	*
	* @param createDate the create date of this nota gasto
	*/
	@Override
	public void setCreateDate(java.lang.String createDate) {
		_notaGasto.setCreateDate(createDate);
	}

	/**
	* Returns the update date of this nota gasto.
	*
	* @return the update date of this nota gasto
	*/
	@Override
	public java.lang.String getUpdateDate() {
		return _notaGasto.getUpdateDate();
	}

	/**
	* Sets the update date of this nota gasto.
	*
	* @param updateDate the update date of this nota gasto
	*/
	@Override
	public void setUpdateDate(java.lang.String updateDate) {
		_notaGasto.setUpdateDate(updateDate);
	}

	@Override
	public boolean isNew() {
		return _notaGasto.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_notaGasto.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _notaGasto.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_notaGasto.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _notaGasto.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _notaGasto.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_notaGasto.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _notaGasto.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_notaGasto.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_notaGasto.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_notaGasto.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new NotaGastoWrapper((NotaGasto)_notaGasto.clone());
	}

	@Override
	public int compareTo(es.davinciti.liferay.model.NotaGasto notaGasto) {
		return _notaGasto.compareTo(notaGasto);
	}

	@Override
	public int hashCode() {
		return _notaGasto.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.NotaGasto> toCacheModel() {
		return _notaGasto.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.NotaGasto toEscapedModel() {
		return new NotaGastoWrapper(_notaGasto.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.NotaGasto toUnescapedModel() {
		return new NotaGastoWrapper(_notaGasto.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _notaGasto.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _notaGasto.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGasto.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NotaGastoWrapper)) {
			return false;
		}

		NotaGastoWrapper notaGastoWrapper = (NotaGastoWrapper)obj;

		if (Validator.equals(_notaGasto, notaGastoWrapper._notaGasto)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public NotaGasto getWrappedNotaGasto() {
		return _notaGasto;
	}

	@Override
	public NotaGasto getWrappedModel() {
		return _notaGasto;
	}

	@Override
	public void resetOriginalValues() {
		_notaGasto.resetOriginalValues();
	}

	private NotaGasto _notaGasto;
}