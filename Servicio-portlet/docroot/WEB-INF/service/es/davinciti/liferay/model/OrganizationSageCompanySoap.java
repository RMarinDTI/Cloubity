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
 * This class is used by SOAP remote services, specifically {@link es.davinciti.liferay.service.http.OrganizationSageCompanyServiceSoap}.
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.http.OrganizationSageCompanyServiceSoap
 * @generated
 */
public class OrganizationSageCompanySoap implements Serializable {
	public static OrganizationSageCompanySoap toSoapModel(
		OrganizationSageCompany model) {
		OrganizationSageCompanySoap soapModel = new OrganizationSageCompanySoap();

		soapModel.setOrgsagecompanyId(model.getOrgsagecompanyId());
		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setSageCompanyId(model.getSageCompanyId());

		return soapModel;
	}

	public static OrganizationSageCompanySoap[] toSoapModels(
		OrganizationSageCompany[] models) {
		OrganizationSageCompanySoap[] soapModels = new OrganizationSageCompanySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OrganizationSageCompanySoap[][] toSoapModels(
		OrganizationSageCompany[][] models) {
		OrganizationSageCompanySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OrganizationSageCompanySoap[models.length][models[0].length];
		}
		else {
			soapModels = new OrganizationSageCompanySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OrganizationSageCompanySoap[] toSoapModels(
		List<OrganizationSageCompany> models) {
		List<OrganizationSageCompanySoap> soapModels = new ArrayList<OrganizationSageCompanySoap>(models.size());

		for (OrganizationSageCompany model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OrganizationSageCompanySoap[soapModels.size()]);
	}

	public OrganizationSageCompanySoap() {
	}

	public long getPrimaryKey() {
		return _orgsagecompanyId;
	}

	public void setPrimaryKey(long pk) {
		setOrgsagecompanyId(pk);
	}

	public long getOrgsagecompanyId() {
		return _orgsagecompanyId;
	}

	public void setOrgsagecompanyId(long orgsagecompanyId) {
		_orgsagecompanyId = orgsagecompanyId;
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public String getSageCompanyId() {
		return _sageCompanyId;
	}

	public void setSageCompanyId(String sageCompanyId) {
		_sageCompanyId = sageCompanyId;
	}

	private long _orgsagecompanyId;
	private long _organizationId;
	private String _sageCompanyId;
}