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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.LineaGastoCategoriaServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.LineaGastoCategoriaServiceSoap
 * @generated
 */
public class LineaGastoCategoriaSoap implements Serializable {
	public static LineaGastoCategoriaSoap toSoapModel(LineaGastoCategoria model) {
		LineaGastoCategoriaSoap soapModel = new LineaGastoCategoriaSoap();

		soapModel.setCategoriaId(model.getCategoriaId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setCategoryCode(model.getCategoryCode());
		soapModel.setAccountCode(model.getAccountCode());
		soapModel.setChangePrice(model.getChangePrice());
		soapModel.setNeedQuantity(model.getNeedQuantity());
		soapModel.setPrice(model.getPrice());

		return soapModel;
	}

	public static LineaGastoCategoriaSoap[] toSoapModels(
		LineaGastoCategoria[] models) {
		LineaGastoCategoriaSoap[] soapModels = new LineaGastoCategoriaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LineaGastoCategoriaSoap[][] toSoapModels(
		LineaGastoCategoria[][] models) {
		LineaGastoCategoriaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LineaGastoCategoriaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LineaGastoCategoriaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LineaGastoCategoriaSoap[] toSoapModels(
		List<LineaGastoCategoria> models) {
		List<LineaGastoCategoriaSoap> soapModels = new ArrayList<LineaGastoCategoriaSoap>(models.size());

		for (LineaGastoCategoria model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LineaGastoCategoriaSoap[soapModels.size()]);
	}

	public LineaGastoCategoriaSoap() {
	}

	public long getPrimaryKey() {
		return _categoriaId;
	}

	public void setPrimaryKey(long pk) {
		setCategoriaId(pk);
	}

	public long getCategoriaId() {
		return _categoriaId;
	}

	public void setCategoriaId(long categoriaId) {
		_categoriaId = categoriaId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getCategoryCode() {
		return _categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		_categoryCode = categoryCode;
	}

	public String getAccountCode() {
		return _accountCode;
	}

	public void setAccountCode(String accountCode) {
		_accountCode = accountCode;
	}

	public String getChangePrice() {
		return _changePrice;
	}

	public void setChangePrice(String changePrice) {
		_changePrice = changePrice;
	}

	public String getNeedQuantity() {
		return _needQuantity;
	}

	public void setNeedQuantity(String needQuantity) {
		_needQuantity = needQuantity;
	}

	public String getPrice() {
		return _price;
	}

	public void setPrice(String price) {
		_price = price;
	}

	private long _categoriaId;
	private String _name;
	private String _description;
	private String _categoryCode;
	private String _accountCode;
	private String _changePrice;
	private String _needQuantity;
	private String _price;
}