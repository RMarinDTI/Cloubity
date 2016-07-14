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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.LineaGastoServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.LineaGastoServiceSoap
 * @generated
 */
public class LineaGastoSoap implements Serializable {
	public static LineaGastoSoap toSoapModel(LineaGasto model) {
		LineaGastoSoap soapModel = new LineaGastoSoap();

		soapModel.setLineagastoId(model.getLineagastoId());
		soapModel.setDate(model.getDate());
		soapModel.setAmount(model.getAmount());
		soapModel.setDocumentId(model.getDocumentId());
		soapModel.setComments(model.getComments());
		soapModel.setStatus(model.getStatus());
		soapModel.setPrice(model.getPrice());
		soapModel.setQuantity(model.getQuantity());

		return soapModel;
	}

	public static LineaGastoSoap[] toSoapModels(LineaGasto[] models) {
		LineaGastoSoap[] soapModels = new LineaGastoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LineaGastoSoap[][] toSoapModels(LineaGasto[][] models) {
		LineaGastoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LineaGastoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LineaGastoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LineaGastoSoap[] toSoapModels(List<LineaGasto> models) {
		List<LineaGastoSoap> soapModels = new ArrayList<LineaGastoSoap>(models.size());

		for (LineaGasto model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LineaGastoSoap[soapModels.size()]);
	}

	public LineaGastoSoap() {
	}

	public long getPrimaryKey() {
		return _lineagastoId;
	}

	public void setPrimaryKey(long pk) {
		setLineagastoId(pk);
	}

	public long getLineagastoId() {
		return _lineagastoId;
	}

	public void setLineagastoId(long lineagastoId) {
		_lineagastoId = lineagastoId;
	}

	public String getDate() {
		return _date;
	}

	public void setDate(String date) {
		_date = date;
	}

	public String getAmount() {
		return _amount;
	}

	public void setAmount(String amount) {
		_amount = amount;
	}

	public String getDocumentId() {
		return _documentId;
	}

	public void setDocumentId(String documentId) {
		_documentId = documentId;
	}

	public String getComments() {
		return _comments;
	}

	public void setComments(String comments) {
		_comments = comments;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getPrice() {
		return _price;
	}

	public void setPrice(String price) {
		_price = price;
	}

	public String getQuantity() {
		return _quantity;
	}

	public void setQuantity(String quantity) {
		_quantity = quantity;
	}

	private long _lineagastoId;
	private String _date;
	private String _amount;
	private String _documentId;
	private String _comments;
	private String _status;
	private String _price;
	private String _quantity;
}