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
 * This class is a wrapper for {@link LineaGastoCategoria}.
 * </p>
 *
 * @author Cmes
 * @see LineaGastoCategoria
 * @generated
 */
public class LineaGastoCategoriaWrapper implements LineaGastoCategoria,
	ModelWrapper<LineaGastoCategoria> {
	public LineaGastoCategoriaWrapper(LineaGastoCategoria lineaGastoCategoria) {
		_lineaGastoCategoria = lineaGastoCategoria;
	}

	@Override
	public Class<?> getModelClass() {
		return LineaGastoCategoria.class;
	}

	@Override
	public String getModelClassName() {
		return LineaGastoCategoria.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("categoriaId", getCategoriaId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("categoryCode", getCategoryCode());
		attributes.put("accountCode", getAccountCode());
		attributes.put("changePrice", getChangePrice());
		attributes.put("needQuantity", getNeedQuantity());
		attributes.put("price", getPrice());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long categoriaId = (Long)attributes.get("categoriaId");

		if (categoriaId != null) {
			setCategoriaId(categoriaId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String categoryCode = (String)attributes.get("categoryCode");

		if (categoryCode != null) {
			setCategoryCode(categoryCode);
		}

		String accountCode = (String)attributes.get("accountCode");

		if (accountCode != null) {
			setAccountCode(accountCode);
		}

		String changePrice = (String)attributes.get("changePrice");

		if (changePrice != null) {
			setChangePrice(changePrice);
		}

		String needQuantity = (String)attributes.get("needQuantity");

		if (needQuantity != null) {
			setNeedQuantity(needQuantity);
		}

		String price = (String)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}
	}

	/**
	* Returns the primary key of this linea gasto categoria.
	*
	* @return the primary key of this linea gasto categoria
	*/
	@Override
	public long getPrimaryKey() {
		return _lineaGastoCategoria.getPrimaryKey();
	}

	/**
	* Sets the primary key of this linea gasto categoria.
	*
	* @param primaryKey the primary key of this linea gasto categoria
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lineaGastoCategoria.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the categoria ID of this linea gasto categoria.
	*
	* @return the categoria ID of this linea gasto categoria
	*/
	@Override
	public long getCategoriaId() {
		return _lineaGastoCategoria.getCategoriaId();
	}

	/**
	* Sets the categoria ID of this linea gasto categoria.
	*
	* @param categoriaId the categoria ID of this linea gasto categoria
	*/
	@Override
	public void setCategoriaId(long categoriaId) {
		_lineaGastoCategoria.setCategoriaId(categoriaId);
	}

	/**
	* Returns the name of this linea gasto categoria.
	*
	* @return the name of this linea gasto categoria
	*/
	@Override
	public java.lang.String getName() {
		return _lineaGastoCategoria.getName();
	}

	/**
	* Sets the name of this linea gasto categoria.
	*
	* @param name the name of this linea gasto categoria
	*/
	@Override
	public void setName(java.lang.String name) {
		_lineaGastoCategoria.setName(name);
	}

	/**
	* Returns the description of this linea gasto categoria.
	*
	* @return the description of this linea gasto categoria
	*/
	@Override
	public java.lang.String getDescription() {
		return _lineaGastoCategoria.getDescription();
	}

	/**
	* Sets the description of this linea gasto categoria.
	*
	* @param description the description of this linea gasto categoria
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_lineaGastoCategoria.setDescription(description);
	}

	/**
	* Returns the category code of this linea gasto categoria.
	*
	* @return the category code of this linea gasto categoria
	*/
	@Override
	public java.lang.String getCategoryCode() {
		return _lineaGastoCategoria.getCategoryCode();
	}

	/**
	* Sets the category code of this linea gasto categoria.
	*
	* @param categoryCode the category code of this linea gasto categoria
	*/
	@Override
	public void setCategoryCode(java.lang.String categoryCode) {
		_lineaGastoCategoria.setCategoryCode(categoryCode);
	}

	/**
	* Returns the account code of this linea gasto categoria.
	*
	* @return the account code of this linea gasto categoria
	*/
	@Override
	public java.lang.String getAccountCode() {
		return _lineaGastoCategoria.getAccountCode();
	}

	/**
	* Sets the account code of this linea gasto categoria.
	*
	* @param accountCode the account code of this linea gasto categoria
	*/
	@Override
	public void setAccountCode(java.lang.String accountCode) {
		_lineaGastoCategoria.setAccountCode(accountCode);
	}

	/**
	* Returns the change price of this linea gasto categoria.
	*
	* @return the change price of this linea gasto categoria
	*/
	@Override
	public java.lang.String getChangePrice() {
		return _lineaGastoCategoria.getChangePrice();
	}

	/**
	* Sets the change price of this linea gasto categoria.
	*
	* @param changePrice the change price of this linea gasto categoria
	*/
	@Override
	public void setChangePrice(java.lang.String changePrice) {
		_lineaGastoCategoria.setChangePrice(changePrice);
	}

	/**
	* Returns the need quantity of this linea gasto categoria.
	*
	* @return the need quantity of this linea gasto categoria
	*/
	@Override
	public java.lang.String getNeedQuantity() {
		return _lineaGastoCategoria.getNeedQuantity();
	}

	/**
	* Sets the need quantity of this linea gasto categoria.
	*
	* @param needQuantity the need quantity of this linea gasto categoria
	*/
	@Override
	public void setNeedQuantity(java.lang.String needQuantity) {
		_lineaGastoCategoria.setNeedQuantity(needQuantity);
	}

	/**
	* Returns the price of this linea gasto categoria.
	*
	* @return the price of this linea gasto categoria
	*/
	@Override
	public java.lang.String getPrice() {
		return _lineaGastoCategoria.getPrice();
	}

	/**
	* Sets the price of this linea gasto categoria.
	*
	* @param price the price of this linea gasto categoria
	*/
	@Override
	public void setPrice(java.lang.String price) {
		_lineaGastoCategoria.setPrice(price);
	}

	@Override
	public boolean isNew() {
		return _lineaGastoCategoria.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_lineaGastoCategoria.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _lineaGastoCategoria.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lineaGastoCategoria.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _lineaGastoCategoria.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _lineaGastoCategoria.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lineaGastoCategoria.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lineaGastoCategoria.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_lineaGastoCategoria.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_lineaGastoCategoria.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lineaGastoCategoria.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LineaGastoCategoriaWrapper((LineaGastoCategoria)_lineaGastoCategoria.clone());
	}

	@Override
	public int compareTo(
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria) {
		return _lineaGastoCategoria.compareTo(lineaGastoCategoria);
	}

	@Override
	public int hashCode() {
		return _lineaGastoCategoria.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.LineaGastoCategoria> toCacheModel() {
		return _lineaGastoCategoria.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.LineaGastoCategoria toEscapedModel() {
		return new LineaGastoCategoriaWrapper(_lineaGastoCategoria.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.LineaGastoCategoria toUnescapedModel() {
		return new LineaGastoCategoriaWrapper(_lineaGastoCategoria.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lineaGastoCategoria.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lineaGastoCategoria.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoria.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LineaGastoCategoriaWrapper)) {
			return false;
		}

		LineaGastoCategoriaWrapper lineaGastoCategoriaWrapper = (LineaGastoCategoriaWrapper)obj;

		if (Validator.equals(_lineaGastoCategoria,
					lineaGastoCategoriaWrapper._lineaGastoCategoria)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LineaGastoCategoria getWrappedLineaGastoCategoria() {
		return _lineaGastoCategoria;
	}

	@Override
	public LineaGastoCategoria getWrappedModel() {
		return _lineaGastoCategoria;
	}

	@Override
	public void resetOriginalValues() {
		_lineaGastoCategoria.resetOriginalValues();
	}

	private LineaGastoCategoria _lineaGastoCategoria;
}