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

package es.davinciti.liferay.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import es.davinciti.liferay.model.OrganizationSageCompany;

import java.util.List;

/**
 * The persistence utility for the organization sage company service. This utility wraps {@link OrganizationSageCompanyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see OrganizationSageCompanyPersistence
 * @see OrganizationSageCompanyPersistenceImpl
 * @generated
 */
public class OrganizationSageCompanyUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(
		OrganizationSageCompany organizationSageCompany) {
		getPersistence().clearCache(organizationSageCompany);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OrganizationSageCompany> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OrganizationSageCompany> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OrganizationSageCompany> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static OrganizationSageCompany update(
		OrganizationSageCompany organizationSageCompany)
		throws SystemException {
		return getPersistence().update(organizationSageCompany);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static OrganizationSageCompany update(
		OrganizationSageCompany organizationSageCompany,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(organizationSageCompany, serviceContext);
	}

	/**
	* Returns all the organization sage companies where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> findByOrganizationId(
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOrganizationId(organizationId);
	}

	/**
	* Returns a range of all the organization sage companies where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.OrganizationSageCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of organization sage companies
	* @param end the upper bound of the range of organization sage companies (not inclusive)
	* @return the range of matching organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> findByOrganizationId(
		long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOrganizationId(organizationId, start, end);
	}

	/**
	* Returns an ordered range of all the organization sage companies where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.OrganizationSageCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of organization sage companies
	* @param end the upper bound of the range of organization sage companies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> findByOrganizationId(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOrganizationId(organizationId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first organization sage company in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching organization sage company
	* @throws es.davinciti.liferay.NoSuchOrganizationSageCompanyException if a matching organization sage company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.OrganizationSageCompany findByOrganizationId_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchOrganizationSageCompanyException {
		return getPersistence()
				   .findByOrganizationId_First(organizationId, orderByComparator);
	}

	/**
	* Returns the first organization sage company in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching organization sage company, or <code>null</code> if a matching organization sage company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.OrganizationSageCompany fetchByOrganizationId_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOrganizationId_First(organizationId,
			orderByComparator);
	}

	/**
	* Returns the last organization sage company in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching organization sage company
	* @throws es.davinciti.liferay.NoSuchOrganizationSageCompanyException if a matching organization sage company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.OrganizationSageCompany findByOrganizationId_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchOrganizationSageCompanyException {
		return getPersistence()
				   .findByOrganizationId_Last(organizationId, orderByComparator);
	}

	/**
	* Returns the last organization sage company in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching organization sage company, or <code>null</code> if a matching organization sage company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.OrganizationSageCompany fetchByOrganizationId_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOrganizationId_Last(organizationId, orderByComparator);
	}

	/**
	* Returns the organization sage companies before and after the current organization sage company in the ordered set where organizationId = &#63;.
	*
	* @param orgsagecompanyId the primary key of the current organization sage company
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next organization sage company
	* @throws es.davinciti.liferay.NoSuchOrganizationSageCompanyException if a organization sage company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.OrganizationSageCompany[] findByOrganizationId_PrevAndNext(
		long orgsagecompanyId, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchOrganizationSageCompanyException {
		return getPersistence()
				   .findByOrganizationId_PrevAndNext(orgsagecompanyId,
			organizationId, orderByComparator);
	}

	/**
	* Removes all the organization sage companies where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByOrganizationId(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByOrganizationId(organizationId);
	}

	/**
	* Returns the number of organization sage companies where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByOrganizationId(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByOrganizationId(organizationId);
	}

	/**
	* Caches the organization sage company in the entity cache if it is enabled.
	*
	* @param organizationSageCompany the organization sage company
	*/
	public static void cacheResult(
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany) {
		getPersistence().cacheResult(organizationSageCompany);
	}

	/**
	* Caches the organization sage companies in the entity cache if it is enabled.
	*
	* @param organizationSageCompanies the organization sage companies
	*/
	public static void cacheResult(
		java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> organizationSageCompanies) {
		getPersistence().cacheResult(organizationSageCompanies);
	}

	/**
	* Creates a new organization sage company with the primary key. Does not add the organization sage company to the database.
	*
	* @param orgsagecompanyId the primary key for the new organization sage company
	* @return the new organization sage company
	*/
	public static es.davinciti.liferay.model.OrganizationSageCompany create(
		long orgsagecompanyId) {
		return getPersistence().create(orgsagecompanyId);
	}

	/**
	* Removes the organization sage company with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orgsagecompanyId the primary key of the organization sage company
	* @return the organization sage company that was removed
	* @throws es.davinciti.liferay.NoSuchOrganizationSageCompanyException if a organization sage company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.OrganizationSageCompany remove(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchOrganizationSageCompanyException {
		return getPersistence().remove(orgsagecompanyId);
	}

	public static es.davinciti.liferay.model.OrganizationSageCompany updateImpl(
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(organizationSageCompany);
	}

	/**
	* Returns the organization sage company with the primary key or throws a {@link es.davinciti.liferay.NoSuchOrganizationSageCompanyException} if it could not be found.
	*
	* @param orgsagecompanyId the primary key of the organization sage company
	* @return the organization sage company
	* @throws es.davinciti.liferay.NoSuchOrganizationSageCompanyException if a organization sage company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.OrganizationSageCompany findByPrimaryKey(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchOrganizationSageCompanyException {
		return getPersistence().findByPrimaryKey(orgsagecompanyId);
	}

	/**
	* Returns the organization sage company with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orgsagecompanyId the primary key of the organization sage company
	* @return the organization sage company, or <code>null</code> if a organization sage company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.OrganizationSageCompany fetchByPrimaryKey(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(orgsagecompanyId);
	}

	/**
	* Returns all the organization sage companies.
	*
	* @return the organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the organization sage companies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.OrganizationSageCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of organization sage companies
	* @param end the upper bound of the range of organization sage companies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the organization sage companies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of organization sage companies.
	*
	* @return the number of organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the nota gastos associated with the organization sage company.
	*
	* @param pk the primary key of the organization sage company
	* @return the nota gastos associated with the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getNotaGastos(pk);
	}

	/**
	* Returns a range of all the nota gastos associated with the organization sage company.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.OrganizationSageCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the organization sage company
	* @param start the lower bound of the range of organization sage companies
	* @param end the upper bound of the range of organization sage companies (not inclusive)
	* @return the range of nota gastos associated with the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getNotaGastos(pk, start, end);
	}

	/**
	* Returns an ordered range of all the nota gastos associated with the organization sage company.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.OrganizationSageCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the organization sage company
	* @param start the lower bound of the range of organization sage companies
	* @param end the upper bound of the range of organization sage companies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nota gastos associated with the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getNotaGastos(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of nota gastos associated with the organization sage company.
	*
	* @param pk the primary key of the organization sage company
	* @return the number of nota gastos associated with the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public static int getNotaGastosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getNotaGastosSize(pk);
	}

	/**
	* Returns <code>true</code> if the nota gasto is associated with the organization sage company.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastoPK the primary key of the nota gasto
	* @return <code>true</code> if the nota gasto is associated with the organization sage company; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsNotaGasto(long pk, long notaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsNotaGasto(pk, notaGastoPK);
	}

	/**
	* Returns <code>true</code> if the organization sage company has any nota gastos associated with it.
	*
	* @param pk the primary key of the organization sage company to check for associations with nota gastos
	* @return <code>true</code> if the organization sage company has any nota gastos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsNotaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsNotaGastos(pk);
	}

	/**
	* Adds an association between the organization sage company and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastoPK the primary key of the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGasto(long pk, long notaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addNotaGasto(pk, notaGastoPK);
	}

	/**
	* Adds an association between the organization sage company and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGasto the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGasto(long pk,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addNotaGasto(pk, notaGasto);
	}

	/**
	* Adds an association between the organization sage company and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastoPKs the primary keys of the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastos(long pk, long[] notaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addNotaGastos(pk, notaGastoPKs);
	}

	/**
	* Adds an association between the organization sage company and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastos the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addNotaGastos(pk, notaGastos);
	}

	/**
	* Clears all associations between the organization sage company and its nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company to clear the associated nota gastos from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearNotaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearNotaGastos(pk);
	}

	/**
	* Removes the association between the organization sage company and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastoPK the primary key of the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeNotaGasto(long pk, long notaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeNotaGasto(pk, notaGastoPK);
	}

	/**
	* Removes the association between the organization sage company and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGasto the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeNotaGasto(long pk,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeNotaGasto(pk, notaGasto);
	}

	/**
	* Removes the association between the organization sage company and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastoPKs the primary keys of the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeNotaGastos(long pk, long[] notaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeNotaGastos(pk, notaGastoPKs);
	}

	/**
	* Removes the association between the organization sage company and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastos the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeNotaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeNotaGastos(pk, notaGastos);
	}

	/**
	* Sets the nota gastos associated with the organization sage company, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastoPKs the primary keys of the nota gastos to be associated with the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public static void setNotaGastos(long pk, long[] notaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setNotaGastos(pk, notaGastoPKs);
	}

	/**
	* Sets the nota gastos associated with the organization sage company, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastos the nota gastos to be associated with the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public static void setNotaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setNotaGastos(pk, notaGastos);
	}

	public static OrganizationSageCompanyPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OrganizationSageCompanyPersistence)PortletBeanLocatorUtil.locate(es.davinciti.liferay.service.ClpSerializer.getServletContextName(),
					OrganizationSageCompanyPersistence.class.getName());

			ReferenceRegistry.registerReference(OrganizationSageCompanyUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(OrganizationSageCompanyPersistence persistence) {
	}

	private static OrganizationSageCompanyPersistence _persistence;
}