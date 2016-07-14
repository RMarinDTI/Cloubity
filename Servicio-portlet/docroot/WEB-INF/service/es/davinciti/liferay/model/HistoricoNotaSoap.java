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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.HistoricoNotaServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.HistoricoNotaServiceSoap
 * @generated
 */
public class HistoricoNotaSoap implements Serializable {
	public static HistoricoNotaSoap toSoapModel(HistoricoNota model) {
		HistoricoNotaSoap soapModel = new HistoricoNotaSoap();

		soapModel.setHistoriconotaId(model.getHistoriconotaId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setComments(model.getComments());
		soapModel.setUpdateAt(model.getUpdateAt());
		soapModel.setPrevStatus(model.getPrevStatus());
		soapModel.setNewStatus(model.getNewStatus());

		return soapModel;
	}

	public static HistoricoNotaSoap[] toSoapModels(HistoricoNota[] models) {
		HistoricoNotaSoap[] soapModels = new HistoricoNotaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static HistoricoNotaSoap[][] toSoapModels(HistoricoNota[][] models) {
		HistoricoNotaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new HistoricoNotaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new HistoricoNotaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static HistoricoNotaSoap[] toSoapModels(List<HistoricoNota> models) {
		List<HistoricoNotaSoap> soapModels = new ArrayList<HistoricoNotaSoap>(models.size());

		for (HistoricoNota model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new HistoricoNotaSoap[soapModels.size()]);
	}

	public HistoricoNotaSoap() {
	}

	public long getPrimaryKey() {
		return _historiconotaId;
	}

	public void setPrimaryKey(long pk) {
		setHistoriconotaId(pk);
	}

	public long getHistoriconotaId() {
		return _historiconotaId;
	}

	public void setHistoriconotaId(long historiconotaId) {
		_historiconotaId = historiconotaId;
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

	public String getComments() {
		return _comments;
	}

	public void setComments(String comments) {
		_comments = comments;
	}

	public String getUpdateAt() {
		return _updateAt;
	}

	public void setUpdateAt(String updateAt) {
		_updateAt = updateAt;
	}

	public String getPrevStatus() {
		return _prevStatus;
	}

	public void setPrevStatus(String prevStatus) {
		_prevStatus = prevStatus;
	}

	public String getNewStatus() {
		return _newStatus;
	}

	public void setNewStatus(String newStatus) {
		_newStatus = newStatus;
	}

	private long _historiconotaId;
	private long _companyId;
	private long _userId;
	private String _comments;
	private String _updateAt;
	private String _prevStatus;
	private String _newStatus;
}