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
 * Provides the local service utility for CurrenciesCompany. This utility wraps
 * {@link es.davinciti.liferay.service.impl.CurrenciesCompanyLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Cmes
 * @see CurrenciesCompanyLocalService
 * @see es.davinciti.liferay.service.base.CurrenciesCompanyLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.impl.CurrenciesCompanyLocalServiceImpl
 * @generated
 */
public class CurrenciesCompanyLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.davinciti.liferay.service.impl.CurrenciesCompanyLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the currencies company to the database. Also notifies the appropriate model listeners.
	*
	* @param currenciesCompany the currencies company
	* @return the currencies company that was added
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.CurrenciesCompany addCurrenciesCompany(
		es.davinciti.liferay.model.CurrenciesCompany currenciesCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCurrenciesCompany(currenciesCompany);
	}

	/**
	* Creates a new currencies company with the primary key. Does not add the currencies company to the database.
	*
	* @param currenciescompanyId the primary key for the new currencies company
	* @return the new currencies company
	*/
	public static es.davinciti.liferay.model.CurrenciesCompany createCurrenciesCompany(
		long currenciescompanyId) {
		return getService().createCurrenciesCompany(currenciescompanyId);
	}

	/**
	* Deletes the currencies company with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param currenciescompanyId the primary key of the currencies company
	* @return the currencies company that was removed
	* @throws PortalException if a currencies company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.CurrenciesCompany deleteCurrenciesCompany(
		long currenciescompanyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCurrenciesCompany(currenciescompanyId);
	}

	/**
	* Deletes the currencies company from the database. Also notifies the appropriate model listeners.
	*
	* @param currenciesCompany the currencies company
	* @return the currencies company that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.CurrenciesCompany deleteCurrenciesCompany(
		es.davinciti.liferay.model.CurrenciesCompany currenciesCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCurrenciesCompany(currenciesCompany);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CurrenciesCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CurrenciesCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static es.davinciti.liferay.model.CurrenciesCompany fetchCurrenciesCompany(
		long currenciescompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCurrenciesCompany(currenciescompanyId);
	}

	/**
	* Returns the currencies company with the primary key.
	*
	* @param currenciescompanyId the primary key of the currencies company
	* @return the currencies company
	* @throws PortalException if a currencies company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.CurrenciesCompany getCurrenciesCompany(
		long currenciescompanyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCurrenciesCompany(currenciescompanyId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the currencies companies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CurrenciesCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of currencies companies
	* @param end the upper bound of the range of currencies companies (not inclusive)
	* @return the range of currencies companies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.CurrenciesCompany> getCurrenciesCompanies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCurrenciesCompanies(start, end);
	}

	/**
	* Returns the number of currencies companies.
	*
	* @return the number of currencies companies
	* @throws SystemException if a system exception occurred
	*/
	public static int getCurrenciesCompaniesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCurrenciesCompaniesCount();
	}

	/**
	* Updates the currencies company in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param currenciesCompany the currencies company
	* @return the currencies company that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.CurrenciesCompany updateCurrenciesCompany(
		es.davinciti.liferay.model.CurrenciesCompany currenciesCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCurrenciesCompany(currenciesCompany);
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

	public static java.util.List<es.davinciti.liferay.model.CurrenciesCompany> findByCompanyId(
		long companyId) {
		return getService().findByCompanyId(companyId);
	}

	public static void clearService() {
		_service = null;
	}

	public static CurrenciesCompanyLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CurrenciesCompanyLocalService.class.getName());

			if (invokableLocalService instanceof CurrenciesCompanyLocalService) {
				_service = (CurrenciesCompanyLocalService)invokableLocalService;
			}
			else {
				_service = new CurrenciesCompanyLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CurrenciesCompanyLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CurrenciesCompanyLocalService service) {
	}

	private static CurrenciesCompanyLocalService _service;
}