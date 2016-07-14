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

import com.liferay.portal.service.persistence.BasePersistence;

import es.davinciti.liferay.model.OrganizationSageCompany;

/**
 * The persistence interface for the organization sage company service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see OrganizationSageCompanyPersistenceImpl
 * @see OrganizationSageCompanyUtil
 * @generated
 */
public interface OrganizationSageCompanyPersistence extends BasePersistence<OrganizationSageCompany> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OrganizationSageCompanyUtil} to access the organization sage company persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the organization sage companies where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> findByOrganizationId(
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> findByOrganizationId(
		long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> findByOrganizationId(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first organization sage company in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching organization sage company
	* @throws es.davinciti.liferay.NoSuchOrganizationSageCompanyException if a matching organization sage company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.OrganizationSageCompany findByOrganizationId_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchOrganizationSageCompanyException;

	/**
	* Returns the first organization sage company in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching organization sage company, or <code>null</code> if a matching organization sage company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.OrganizationSageCompany fetchByOrganizationId_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last organization sage company in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching organization sage company
	* @throws es.davinciti.liferay.NoSuchOrganizationSageCompanyException if a matching organization sage company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.OrganizationSageCompany findByOrganizationId_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchOrganizationSageCompanyException;

	/**
	* Returns the last organization sage company in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching organization sage company, or <code>null</code> if a matching organization sage company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.OrganizationSageCompany fetchByOrganizationId_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public es.davinciti.liferay.model.OrganizationSageCompany[] findByOrganizationId_PrevAndNext(
		long orgsagecompanyId, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchOrganizationSageCompanyException;

	/**
	* Removes all the organization sage companies where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByOrganizationId(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of organization sage companies where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public int countByOrganizationId(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the organization sage company in the entity cache if it is enabled.
	*
	* @param organizationSageCompany the organization sage company
	*/
	public void cacheResult(
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany);

	/**
	* Caches the organization sage companies in the entity cache if it is enabled.
	*
	* @param organizationSageCompanies the organization sage companies
	*/
	public void cacheResult(
		java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> organizationSageCompanies);

	/**
	* Creates a new organization sage company with the primary key. Does not add the organization sage company to the database.
	*
	* @param orgsagecompanyId the primary key for the new organization sage company
	* @return the new organization sage company
	*/
	public es.davinciti.liferay.model.OrganizationSageCompany create(
		long orgsagecompanyId);

	/**
	* Removes the organization sage company with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orgsagecompanyId the primary key of the organization sage company
	* @return the organization sage company that was removed
	* @throws es.davinciti.liferay.NoSuchOrganizationSageCompanyException if a organization sage company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.OrganizationSageCompany remove(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchOrganizationSageCompanyException;

	public es.davinciti.liferay.model.OrganizationSageCompany updateImpl(
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the organization sage company with the primary key or throws a {@link es.davinciti.liferay.NoSuchOrganizationSageCompanyException} if it could not be found.
	*
	* @param orgsagecompanyId the primary key of the organization sage company
	* @return the organization sage company
	* @throws es.davinciti.liferay.NoSuchOrganizationSageCompanyException if a organization sage company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.OrganizationSageCompany findByPrimaryKey(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchOrganizationSageCompanyException;

	/**
	* Returns the organization sage company with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orgsagecompanyId the primary key of the organization sage company
	* @return the organization sage company, or <code>null</code> if a organization sage company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.OrganizationSageCompany fetchByPrimaryKey(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the organization sage companies.
	*
	* @return the organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the organization sage companies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of organization sage companies.
	*
	* @return the number of organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the nota gastos associated with the organization sage company.
	*
	* @param pk the primary key of the organization sage company
	* @return the nota gastos associated with the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of nota gastos associated with the organization sage company.
	*
	* @param pk the primary key of the organization sage company
	* @return the number of nota gastos associated with the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public int getNotaGastosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the nota gasto is associated with the organization sage company.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastoPK the primary key of the nota gasto
	* @return <code>true</code> if the nota gasto is associated with the organization sage company; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsNotaGasto(long pk, long notaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the organization sage company has any nota gastos associated with it.
	*
	* @param pk the primary key of the organization sage company to check for associations with nota gastos
	* @return <code>true</code> if the organization sage company has any nota gastos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsNotaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the organization sage company and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastoPK the primary key of the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public void addNotaGasto(long pk, long notaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the organization sage company and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGasto the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public void addNotaGasto(long pk,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the organization sage company and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastoPKs the primary keys of the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public void addNotaGastos(long pk, long[] notaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the organization sage company and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastos the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public void addNotaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the organization sage company and its nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company to clear the associated nota gastos from
	* @throws SystemException if a system exception occurred
	*/
	public void clearNotaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the organization sage company and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastoPK the primary key of the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public void removeNotaGasto(long pk, long notaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the organization sage company and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGasto the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public void removeNotaGasto(long pk,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the organization sage company and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastoPKs the primary keys of the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public void removeNotaGastos(long pk, long[] notaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the organization sage company and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastos the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public void removeNotaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the nota gastos associated with the organization sage company, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastoPKs the primary keys of the nota gastos to be associated with the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public void setNotaGastos(long pk, long[] notaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the nota gastos associated with the organization sage company, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the organization sage company
	* @param notaGastos the nota gastos to be associated with the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public void setNotaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;
}