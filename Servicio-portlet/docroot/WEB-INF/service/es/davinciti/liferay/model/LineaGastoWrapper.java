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
 * This class is a wrapper for {@link LineaGasto}.
 * </p>
 *
 * @author Cmes
 * @see LineaGasto
 * @generated
 */
public class LineaGastoWrapper implements LineaGasto, ModelWrapper<LineaGasto> {
	public LineaGastoWrapper(LineaGasto lineaGasto) {
		_lineaGasto = lineaGasto;
	}

	@Override
	public Class<?> getModelClass() {
		return LineaGasto.class;
	}

	@Override
	public String getModelClassName() {
		return LineaGasto.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("lineagastoId", getLineagastoId());
		attributes.put("date", getDate());
		attributes.put("amount", getAmount());
		attributes.put("documentId", getDocumentId());
		attributes.put("comments", getComments());
		attributes.put("status", getStatus());
		attributes.put("price", getPrice());
		attributes.put("quantity", getQuantity());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long lineagastoId = (Long)attributes.get("lineagastoId");

		if (lineagastoId != null) {
			setLineagastoId(lineagastoId);
		}

		String date = (String)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		String amount = (String)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		String documentId = (String)attributes.get("documentId");

		if (documentId != null) {
			setDocumentId(documentId);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String price = (String)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		String quantity = (String)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}
	}

	/**
	* Returns the primary key of this linea gasto.
	*
	* @return the primary key of this linea gasto
	*/
	@Override
	public long getPrimaryKey() {
		return _lineaGasto.getPrimaryKey();
	}

	/**
	* Sets the primary key of this linea gasto.
	*
	* @param primaryKey the primary key of this linea gasto
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lineaGasto.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the lineagasto ID of this linea gasto.
	*
	* @return the lineagasto ID of this linea gasto
	*/
	@Override
	public long getLineagastoId() {
		return _lineaGasto.getLineagastoId();
	}

	/**
	* Sets the lineagasto ID of this linea gasto.
	*
	* @param lineagastoId the lineagasto ID of this linea gasto
	*/
	@Override
	public void setLineagastoId(long lineagastoId) {
		_lineaGasto.setLineagastoId(lineagastoId);
	}

	/**
	* Returns the date of this linea gasto.
	*
	* @return the date of this linea gasto
	*/
	@Override
	public java.lang.String getDate() {
		return _lineaGasto.getDate();
	}

	/**
	* Sets the date of this linea gasto.
	*
	* @param date the date of this linea gasto
	*/
	@Override
	public void setDate(java.lang.String date) {
		_lineaGasto.setDate(date);
	}

	/**
	* Returns the amount of this linea gasto.
	*
	* @return the amount of this linea gasto
	*/
	@Override
	public java.lang.String getAmount() {
		return _lineaGasto.getAmount();
	}

	/**
	* Sets the amount of this linea gasto.
	*
	* @param amount the amount of this linea gasto
	*/
	@Override
	public void setAmount(java.lang.String amount) {
		_lineaGasto.setAmount(amount);
	}

	/**
	* Returns the document ID of this linea gasto.
	*
	* @return the document ID of this linea gasto
	*/
	@Override
	public java.lang.String getDocumentId() {
		return _lineaGasto.getDocumentId();
	}

	/**
	* Sets the document ID of this linea gasto.
	*
	* @param documentId the document ID of this linea gasto
	*/
	@Override
	public void setDocumentId(java.lang.String documentId) {
		_lineaGasto.setDocumentId(documentId);
	}

	/**
	* Returns the comments of this linea gasto.
	*
	* @return the comments of this linea gasto
	*/
	@Override
	public java.lang.String getComments() {
		return _lineaGasto.getComments();
	}

	/**
	* Sets the comments of this linea gasto.
	*
	* @param comments the comments of this linea gasto
	*/
	@Override
	public void setComments(java.lang.String comments) {
		_lineaGasto.setComments(comments);
	}

	/**
	* Returns the status of this linea gasto.
	*
	* @return the status of this linea gasto
	*/
	@Override
	public java.lang.String getStatus() {
		return _lineaGasto.getStatus();
	}

	/**
	* Sets the status of this linea gasto.
	*
	* @param status the status of this linea gasto
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_lineaGasto.setStatus(status);
	}

	/**
	* Returns the price of this linea gasto.
	*
	* @return the price of this linea gasto
	*/
	@Override
	public java.lang.String getPrice() {
		return _lineaGasto.getPrice();
	}

	/**
	* Sets the price of this linea gasto.
	*
	* @param price the price of this linea gasto
	*/
	@Override
	public void setPrice(java.lang.String price) {
		_lineaGasto.setPrice(price);
	}

	/**
	* Returns the quantity of this linea gasto.
	*
	* @return the quantity of this linea gasto
	*/
	@Override
	public java.lang.String getQuantity() {
		return _lineaGasto.getQuantity();
	}

	/**
	* Sets the quantity of this linea gasto.
	*
	* @param quantity the quantity of this linea gasto
	*/
	@Override
	public void setQuantity(java.lang.String quantity) {
		_lineaGasto.setQuantity(quantity);
	}

	@Override
	public boolean isNew() {
		return _lineaGasto.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_lineaGasto.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _lineaGasto.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lineaGasto.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _lineaGasto.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _lineaGasto.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lineaGasto.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lineaGasto.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_lineaGasto.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_lineaGasto.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lineaGasto.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LineaGastoWrapper((LineaGasto)_lineaGasto.clone());
	}

	@Override
	public int compareTo(es.davinciti.liferay.model.LineaGasto lineaGasto) {
		return _lineaGasto.compareTo(lineaGasto);
	}

	@Override
	public int hashCode() {
		return _lineaGasto.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.LineaGasto> toCacheModel() {
		return _lineaGasto.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.LineaGasto toEscapedModel() {
		return new LineaGastoWrapper(_lineaGasto.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.LineaGasto toUnescapedModel() {
		return new LineaGastoWrapper(_lineaGasto.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lineaGasto.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lineaGasto.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGasto.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LineaGastoWrapper)) {
			return false;
		}

		LineaGastoWrapper lineaGastoWrapper = (LineaGastoWrapper)obj;

		if (Validator.equals(_lineaGasto, lineaGastoWrapper._lineaGasto)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LineaGasto getWrappedLineaGasto() {
		return _lineaGasto;
	}

	@Override
	public LineaGasto getWrappedModel() {
		return _lineaGasto;
	}

	@Override
	public void resetOriginalValues() {
		_lineaGasto.resetOriginalValues();
	}

	private LineaGasto _lineaGasto;
}