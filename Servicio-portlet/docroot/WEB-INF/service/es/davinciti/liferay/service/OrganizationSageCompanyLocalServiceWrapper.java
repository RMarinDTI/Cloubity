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

package es.davinciti.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OrganizationSageCompanyLocalService}.
 *
 * @author Cmes
 * @see OrganizationSageCompanyLocalService
 * @generated
 */
public class OrganizationSageCompanyLocalServiceWrapper
	implements OrganizationSageCompanyLocalService,
		ServiceWrapper<OrganizationSageCompanyLocalService> {
	public OrganizationSageCompanyLocalServiceWrapper(
		OrganizationSageCompanyLocalService organizationSageCompanyLocalService) {
		_organizationSageCompanyLocalService = organizationSageCompanyLocalService;
	}

	/**
	* Adds the organization sage company to the database. Also notifies the appropriate model listeners.
	*
	* @param organizationSageCompany the organization sage company
	* @return the organization sage company that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.OrganizationSageCompany addOrganizationSageCompany(
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.addOrganizationSageCompany(organizationSageCompany);
	}

	/**
	* Creates a new organization sage company with the primary key. Does not add the organization sage company to the database.
	*
	* @param orgsagecompanyId the primary key for the new organization sage company
	* @return the new organization sage company
	*/
	@Override
	public es.davinciti.liferay.model.OrganizationSageCompany createOrganizationSageCompany(
		long orgsagecompanyId) {
		return _organizationSageCompanyLocalService.createOrganizationSageCompany(orgsagecompanyId);
	}

	/**
	* Deletes the organization sage company with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orgsagecompanyId the primary key of the organization sage company
	* @return the organization sage company that was removed
	* @throws PortalException if a organization sage company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.OrganizationSageCompany deleteOrganizationSageCompany(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.deleteOrganizationSageCompany(orgsagecompanyId);
	}

	/**
	* Deletes the organization sage company from the database. Also notifies the appropriate model listeners.
	*
	* @param organizationSageCompany the organization sage company
	* @return the organization sage company that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.OrganizationSageCompany deleteOrganizationSageCompany(
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.deleteOrganizationSageCompany(organizationSageCompany);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _organizationSageCompanyLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.OrganizationSageCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.OrganizationSageCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.davinciti.liferay.model.OrganizationSageCompany fetchOrganizationSageCompany(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.fetchOrganizationSageCompany(orgsagecompanyId);
	}

	/**
	* Returns the organization sage company with the primary key.
	*
	* @param orgsagecompanyId the primary key of the organization sage company
	* @return the organization sage company
	* @throws PortalException if a organization sage company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.OrganizationSageCompany getOrganizationSageCompany(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.getOrganizationSageCompany(orgsagecompanyId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the organization sage companies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.OrganizationSageCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of organization sage companies
	* @param end the upper bound of the range of organization sage companies (not inclusive)
	* @return the range of organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> getOrganizationSageCompanies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.getOrganizationSageCompanies(start,
			end);
	}

	/**
	* Returns the number of organization sage companies.
	*
	* @return the number of organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOrganizationSageCompaniesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.getOrganizationSageCompaniesCount();
	}

	/**
	* Updates the organization sage company in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param organizationSageCompany the organization sage company
	* @return the organization sage company that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.OrganizationSageCompany updateOrganizationSageCompany(
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.updateOrganizationSageCompany(organizationSageCompany);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addNotaGastoOrganizationSageCompany(long notagastoId,
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_organizationSageCompanyLocalService.addNotaGastoOrganizationSageCompany(notagastoId,
			orgsagecompanyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addNotaGastoOrganizationSageCompany(long notagastoId,
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		_organizationSageCompanyLocalService.addNotaGastoOrganizationSageCompany(notagastoId,
			organizationSageCompany);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addNotaGastoOrganizationSageCompanies(long notagastoId,
		long[] orgsagecompanyIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_organizationSageCompanyLocalService.addNotaGastoOrganizationSageCompanies(notagastoId,
			orgsagecompanyIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addNotaGastoOrganizationSageCompanies(long notagastoId,
		java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> OrganizationSageCompanies)
		throws com.liferay.portal.kernel.exception.SystemException {
		_organizationSageCompanyLocalService.addNotaGastoOrganizationSageCompanies(notagastoId,
			OrganizationSageCompanies);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearNotaGastoOrganizationSageCompanies(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_organizationSageCompanyLocalService.clearNotaGastoOrganizationSageCompanies(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteNotaGastoOrganizationSageCompany(long notagastoId,
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_organizationSageCompanyLocalService.deleteNotaGastoOrganizationSageCompany(notagastoId,
			orgsagecompanyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteNotaGastoOrganizationSageCompany(long notagastoId,
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		_organizationSageCompanyLocalService.deleteNotaGastoOrganizationSageCompany(notagastoId,
			organizationSageCompany);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteNotaGastoOrganizationSageCompanies(long notagastoId,
		long[] orgsagecompanyIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_organizationSageCompanyLocalService.deleteNotaGastoOrganizationSageCompanies(notagastoId,
			orgsagecompanyIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteNotaGastoOrganizationSageCompanies(long notagastoId,
		java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> OrganizationSageCompanies)
		throws com.liferay.portal.kernel.exception.SystemException {
		_organizationSageCompanyLocalService.deleteNotaGastoOrganizationSageCompanies(notagastoId,
			OrganizationSageCompanies);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> getNotaGastoOrganizationSageCompanies(
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.getNotaGastoOrganizationSageCompanies(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> getNotaGastoOrganizationSageCompanies(
		long notagastoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.getNotaGastoOrganizationSageCompanies(notagastoId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> getNotaGastoOrganizationSageCompanies(
		long notagastoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.getNotaGastoOrganizationSageCompanies(notagastoId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getNotaGastoOrganizationSageCompaniesCount(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.getNotaGastoOrganizationSageCompaniesCount(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasNotaGastoOrganizationSageCompany(long notagastoId,
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.hasNotaGastoOrganizationSageCompany(notagastoId,
			orgsagecompanyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasNotaGastoOrganizationSageCompanies(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _organizationSageCompanyLocalService.hasNotaGastoOrganizationSageCompanies(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setNotaGastoOrganizationSageCompanies(long notagastoId,
		long[] orgsagecompanyIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_organizationSageCompanyLocalService.setNotaGastoOrganizationSageCompanies(notagastoId,
			orgsagecompanyIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _organizationSageCompanyLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_organizationSageCompanyLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _organizationSageCompanyLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> findByOrganizationId(
		long organizationId) {
		return _organizationSageCompanyLocalService.findByOrganizationId(organizationId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OrganizationSageCompanyLocalService getWrappedOrganizationSageCompanyLocalService() {
		return _organizationSageCompanyLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOrganizationSageCompanyLocalService(
		OrganizationSageCompanyLocalService organizationSageCompanyLocalService) {
		_organizationSageCompanyLocalService = organizationSageCompanyLocalService;
	}

	@Override
	public OrganizationSageCompanyLocalService getWrappedService() {
		return _organizationSageCompanyLocalService;
	}

	@Override
	public void setWrappedService(
		OrganizationSageCompanyLocalService organizationSageCompanyLocalService) {
		_organizationSageCompanyLocalService = organizationSageCompanyLocalService;
	}

	private OrganizationSageCompanyLocalService _organizationSageCompanyLocalService;
}