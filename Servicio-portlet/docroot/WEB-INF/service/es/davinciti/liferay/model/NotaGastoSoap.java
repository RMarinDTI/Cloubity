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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.NotaGastoServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.NotaGastoServiceSoap
 * @generated
 */
public class NotaGastoSoap implements Serializable {
	public static NotaGastoSoap toSoapModel(NotaGasto model) {
		NotaGastoSoap soapModel = new NotaGastoSoap();

		soapModel.setNotagastoId(model.getNotagastoId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setDescription(model.getDescription());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setComments(model.getComments());
		soapModel.setStatus(model.getStatus());
		soapModel.setAmount(model.getAmount());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setUpdateDate(model.getUpdateDate());

		return soapModel;
	}

	public static NotaGastoSoap[] toSoapModels(NotaGasto[] models) {
		NotaGastoSoap[] soapModels = new NotaGastoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NotaGastoSoap[][] toSoapModels(NotaGasto[][] models) {
		NotaGastoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NotaGastoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NotaGastoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NotaGastoSoap[] toSoapModels(List<NotaGasto> models) {
		List<NotaGastoSoap> soapModels = new ArrayList<NotaGastoSoap>(models.size());

		for (NotaGasto model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NotaGastoSoap[soapModels.size()]);
	}

	public NotaGastoSoap() {
	}

	public long getPrimaryKey() {
		return _notagastoId;
	}

	public void setPrimaryKey(long pk) {
		setNotagastoId(pk);
	}

	public long getNotagastoId() {
		return _notagastoId;
	}

	public void setNotagastoId(long notagastoId) {
		_notagastoId = notagastoId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getStartDate() {
		return _startDate;
	}

	public void setStartDate(String startDate) {
		_startDate = startDate;
	}

	public String getEndDate() {
		return _endDate;
	}

	public void setEndDate(String endDate) {
		_endDate = endDate;
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

	public String getAmount() {
		return _amount;
	}

	public void setAmount(String amount) {
		_amount = amount;
	}

	public String getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(String createDate) {
		_createDate = createDate;
	}

	public String getUpdateDate() {
		return _updateDate;
	}

	public void setUpdateDate(String updateDate) {
		_updateDate = updateDate;
	}

	private long _notagastoId;
	private long _companyId;
	private long _userId;
	private String _description;
	private String _startDate;
	private String _endDate;
	private String _comments;
	private String _status;
	private String _amount;
	private String _createDate;
	private String _updateDate;
}