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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for OrganizationSageCompany. This utility wraps
 * {@link es.davinciti.liferay.service.impl.OrganizationSageCompanyLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Cmes
 * @see OrganizationSageCompanyLocalService
 * @see es.davinciti.liferay.service.base.OrganizationSageCompanyLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.impl.OrganizationSageCompanyLocalServiceImpl
 * @generated
 */
public class OrganizationSageCompanyLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.davinciti.liferay.service.impl.OrganizationSageCompanyLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the organization sage company to the database. Also notifies the appropriate model listeners.
	*
	* @param organizationSageCompany the organization sage company
	* @return the organization sage company that was added
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.OrganizationSageCompany addOrganizationSageCompany(
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addOrganizationSageCompany(organizationSageCompany);
	}

	/**
	* Creates a new organization sage company with the primary key. Does not add the organization sage company to the database.
	*
	* @param orgsagecompanyId the primary key for the new organization sage company
	* @return the new organization sage company
	*/
	public static es.davinciti.liferay.model.OrganizationSageCompany createOrganizationSageCompany(
		long orgsagecompanyId) {
		return getService().createOrganizationSageCompany(orgsagecompanyId);
	}

	/**
	* Deletes the organization sage company with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orgsagecompanyId the primary key of the organization sage company
	* @return the organization sage company that was removed
	* @throws PortalException if a organization sage company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.OrganizationSageCompany deleteOrganizationSageCompany(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteOrganizationSageCompany(orgsagecompanyId);
	}

	/**
	* Deletes the organization sage company from the database. Also notifies the appropriate model listeners.
	*
	* @param organizationSageCompany the organization sage company
	* @return the organization sage company that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.OrganizationSageCompany deleteOrganizationSageCompany(
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteOrganizationSageCompany(organizationSageCompany);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static es.davinciti.liferay.model.OrganizationSageCompany fetchOrganizationSageCompany(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchOrganizationSageCompany(orgsagecompanyId);
	}

	/**
	* Returns the organization sage company with the primary key.
	*
	* @param orgsagecompanyId the primary key of the organization sage company
	* @return the organization sage company
	* @throws PortalException if a organization sage company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.OrganizationSageCompany getOrganizationSageCompany(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrganizationSageCompany(orgsagecompanyId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> getOrganizationSageCompanies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrganizationSageCompanies(start, end);
	}

	/**
	* Returns the number of organization sage companies.
	*
	* @return the number of organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public static int getOrganizationSageCompaniesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrganizationSageCompaniesCount();
	}

	/**
	* Updates the organization sage company in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param organizationSageCompany the organization sage company
	* @return the organization sage company that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.OrganizationSageCompany updateOrganizationSageCompany(
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateOrganizationSageCompany(organizationSageCompany);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastoOrganizationSageCompany(long notagastoId,
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addNotaGastoOrganizationSageCompany(notagastoId, orgsagecompanyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastoOrganizationSageCompany(long notagastoId,
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addNotaGastoOrganizationSageCompany(notagastoId,
			organizationSageCompany);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastoOrganizationSageCompanies(long notagastoId,
		long[] orgsagecompanyIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addNotaGastoOrganizationSageCompanies(notagastoId,
			orgsagecompanyIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastoOrganizationSageCompanies(long notagastoId,
		java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> OrganizationSageCompanies)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addNotaGastoOrganizationSageCompanies(notagastoId,
			OrganizationSageCompanies);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearNotaGastoOrganizationSageCompanies(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearNotaGastoOrganizationSageCompanies(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteNotaGastoOrganizationSageCompany(
		long notagastoId, long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteNotaGastoOrganizationSageCompany(notagastoId,
			orgsagecompanyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteNotaGastoOrganizationSageCompany(
		long notagastoId,
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteNotaGastoOrganizationSageCompany(notagastoId,
			organizationSageCompany);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteNotaGastoOrganizationSageCompanies(
		long notagastoId, long[] orgsagecompanyIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteNotaGastoOrganizationSageCompanies(notagastoId,
			orgsagecompanyIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteNotaGastoOrganizationSageCompanies(
		long notagastoId,
		java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> OrganizationSageCompanies)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteNotaGastoOrganizationSageCompanies(notagastoId,
			OrganizationSageCompanies);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> getNotaGastoOrganizationSageCompanies(
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getNotaGastoOrganizationSageCompanies(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> getNotaGastoOrganizationSageCompanies(
		long notagastoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getNotaGastoOrganizationSageCompanies(notagastoId, start,
			end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> getNotaGastoOrganizationSageCompanies(
		long notagastoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getNotaGastoOrganizationSageCompanies(notagastoId, start,
			end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getNotaGastoOrganizationSageCompaniesCount(
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getNotaGastoOrganizationSageCompaniesCount(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasNotaGastoOrganizationSageCompany(
		long notagastoId, long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasNotaGastoOrganizationSageCompany(notagastoId,
			orgsagecompanyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasNotaGastoOrganizationSageCompanies(
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasNotaGastoOrganizationSageCompanies(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setNotaGastoOrganizationSageCompanies(long notagastoId,
		long[] orgsagecompanyIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.setNotaGastoOrganizationSageCompanies(notagastoId,
			orgsagecompanyIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> findByOrganizationId(
		long organizationId) {
		return getService().findByOrganizationId(organizationId);
	}

	public static void clearService() {
		_service = null;
	}

	public static OrganizationSageCompanyLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					OrganizationSageCompanyLocalService.class.getName());

			if (invokableLocalService instanceof OrganizationSageCompanyLocalService) {
				_service = (OrganizationSageCompanyLocalService)invokableLocalService;
			}
			else {
				_service = new OrganizationSageCompanyLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(OrganizationSageCompanyLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(OrganizationSageCompanyLocalService service) {
	}

	private static OrganizationSageCompanyLocalService _service;
}