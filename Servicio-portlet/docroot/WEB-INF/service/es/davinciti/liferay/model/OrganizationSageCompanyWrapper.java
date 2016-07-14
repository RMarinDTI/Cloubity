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
 * This class is a wrapper for {@link OrganizationSageCompany}.
 * </p>
 *
 * @author Cmes
 * @see OrganizationSageCompany
 * @generated
 */
public class OrganizationSageCompanyWrapper implements OrganizationSageCompany,
	ModelWrapper<OrganizationSageCompany> {
	public OrganizationSageCompanyWrapper(
		OrganizationSageCompany organizationSageCompany) {
		_organizationSageCompany = organizationSageCompany;
	}

	@Override
	public Class<?> getModelClass() {
		return OrganizationSageCompany.class;
	}

	@Override
	public String getModelClassName() {
		return OrganizationSageCompany.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("orgsagecompanyId", getOrgsagecompanyId());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("sageCompanyId", getSageCompanyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long orgsagecompanyId = (Long)attributes.get("orgsagecompanyId");

		if (orgsagecompanyId != null) {
			setOrgsagecompanyId(orgsagecompanyId);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		String sageCompanyId = (String)attributes.get("sageCompanyId");

		if (sageCompanyId != null) {
			setSageCompanyId(sageCompanyId);
		}
	}

	/**
	* Returns the primary key of this organization sage company.
	*
	* @return the primary key of this organization sage company
	*/
	@Override
	public long getPrimaryKey() {
		return _organizationSageCompany.getPrimaryKey();
	}

	/**
	* Sets the primary key of this organization sage company.
	*
	* @param primaryKey the primary key of this organization sage company
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_organizationSageCompany.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the orgsagecompany ID of this organization sage company.
	*
	* @return the orgsagecompany ID of this organization sage company
	*/
	@Override
	public long getOrgsagecompanyId() {
		return _organizationSageCompany.getOrgsagecompanyId();
	}

	/**
	* Sets the orgsagecompany ID of this organization sage company.
	*
	* @param orgsagecompanyId the orgsagecompany ID of this organization sage company
	*/
	@Override
	public void setOrgsagecompanyId(long orgsagecompanyId) {
		_organizationSageCompany.setOrgsagecompanyId(orgsagecompanyId);
	}

	/**
	* Returns the organization ID of this organization sage company.
	*
	* @return the organization ID of this organization sage company
	*/
	@Override
	public long getOrganizationId() {
		return _organizationSageCompany.getOrganizationId();
	}

	/**
	* Sets the organization ID of this organization sage company.
	*
	* @param organizationId the organization ID of this organization sage company
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_organizationSageCompany.setOrganizationId(organizationId);
	}

	/**
	* Returns the sage company ID of this organization sage company.
	*
	* @return the sage company ID of this organization sage company
	*/
	@Override
	public java.lang.String getSageCompanyId() {
		return _organizationSageCompany.getSageCompanyId();
	}

	/**
	* Sets the sage company ID of this organization sage company.
	*
	* @param sageCompanyId the sage company ID of this organization sage company
	*/
	@Override
	public void setSageCompanyId(java.lang.String sageCompanyId) {
		_organizationSageCompany.setSageCompanyId(sageCompanyId);
	}

	@Override
	public boolean isNew() {
		return _organizationSageCompany.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_organizationSageCompany.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _organizationSageCompany.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_organizationSageCompany.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _organizationSageCompany.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _organizationSageCompany.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_organizationSageCompany.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _organizationSageCompany.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_organizationSageCompany.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_organizationSageCompany.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_organizationSageCompany.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OrganizationSageCompanyWrapper((OrganizationSageCompany)_organizationSageCompany.clone());
	}

	@Override
	public int compareTo(
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany) {
		return _organizationSageCompany.compareTo(organizationSageCompany);
	}

	@Override
	public int hashCode() {
		return _organizationSageCompany.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.davinciti.liferay.model.OrganizationSageCompany> toCacheModel() {
		return _organizationSageCompany.toCacheModel();
	}

	@Override
	public es.davinciti.liferay.model.OrganizationSageCompany toEscapedModel() {
		return new OrganizationSageCompanyWrapper(_organizationSageCompany.toEscapedModel());
	}

	@Override
	public es.davinciti.liferay.model.OrganizationSageCompany toUnescapedModel() {
		return new OrganizationSageCompanyWrapper(_organizationSageCompany.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _organizationSageCompany.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _organizationSageCompany.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_organizationSageCompany.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrganizationSageCompanyWrapper)) {
			return false;
		}

		OrganizationSageCompanyWrapper organizationSageCompanyWrapper = (OrganizationSageCompanyWrapper)obj;

		if (Validator.equals(_organizationSageCompany,
					organizationSageCompanyWrapper._organizationSageCompany)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public OrganizationSageCompany getWrappedOrganizationSageCompany() {
		return _organizationSageCompany;
	}

	@Override
	public OrganizationSageCompany getWrappedModel() {
		return _organizationSageCompany;
	}

	@Override
	public void resetOriginalValues() {
		_organizationSageCompany.resetOriginalValues();
	}

	private OrganizationSageCompany _organizationSageCompany;
}