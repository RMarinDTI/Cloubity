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

import es.davinciti.liferay.model.CurrenciesCompany;

/**
 * The persistence interface for the currencies company service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see CurrenciesCompanyPersistenceImpl
 * @see CurrenciesCompanyUtil
 * @generated
 */
public interface CurrenciesCompanyPersistence extends BasePersistence<CurrenciesCompany> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CurrenciesCompanyUtil} to access the currencies company persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the currencies companies where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching currencies companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.CurrenciesCompany> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the currencies companies where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CurrenciesCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of currencies companies
	* @param end the upper bound of the range of currencies companies (not inclusive)
	* @return the range of matching currencies companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.CurrenciesCompany> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the currencies companies where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CurrenciesCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of currencies companies
	* @param end the upper bound of the range of currencies companies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching currencies companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.CurrenciesCompany> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first currencies company in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching currencies company
	* @throws es.davinciti.liferay.NoSuchCurrenciesCompanyException if a matching currencies company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.CurrenciesCompany findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchCurrenciesCompanyException;

	/**
	* Returns the first currencies company in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching currencies company, or <code>null</code> if a matching currencies company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.CurrenciesCompany fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last currencies company in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching currencies company
	* @throws es.davinciti.liferay.NoSuchCurrenciesCompanyException if a matching currencies company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.CurrenciesCompany findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchCurrenciesCompanyException;

	/**
	* Returns the last currencies company in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching currencies company, or <code>null</code> if a matching currencies company could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.CurrenciesCompany fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the currencies companies before and after the current currencies company in the ordered set where companyId = &#63;.
	*
	* @param currenciescompanyId the primary key of the current currencies company
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next currencies company
	* @throws es.davinciti.liferay.NoSuchCurrenciesCompanyException if a currencies company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.CurrenciesCompany[] findByCompanyId_PrevAndNext(
		long currenciescompanyId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchCurrenciesCompanyException;

	/**
	* Removes all the currencies companies where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of currencies companies where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching currencies companies
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the currencies company in the entity cache if it is enabled.
	*
	* @param currenciesCompany the currencies company
	*/
	public void cacheResult(
		es.davinciti.liferay.model.CurrenciesCompany currenciesCompany);

	/**
	* Caches the currencies companies in the entity cache if it is enabled.
	*
	* @param currenciesCompanies the currencies companies
	*/
	public void cacheResult(
		java.util.List<es.davinciti.liferay.model.CurrenciesCompany> currenciesCompanies);

	/**
	* Creates a new currencies company with the primary key. Does not add the currencies company to the database.
	*
	* @param currenciescompanyId the primary key for the new currencies company
	* @return the new currencies company
	*/
	public es.davinciti.liferay.model.CurrenciesCompany create(
		long currenciescompanyId);

	/**
	* Removes the currencies company with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param currenciescompanyId the primary key of the currencies company
	* @return the currencies company that was removed
	* @throws es.davinciti.liferay.NoSuchCurrenciesCompanyException if a currencies company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.CurrenciesCompany remove(
		long currenciescompanyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchCurrenciesCompanyException;

	public es.davinciti.liferay.model.CurrenciesCompany updateImpl(
		es.davinciti.liferay.model.CurrenciesCompany currenciesCompany)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the currencies company with the primary key or throws a {@link es.davinciti.liferay.NoSuchCurrenciesCompanyException} if it could not be found.
	*
	* @param currenciescompanyId the primary key of the currencies company
	* @return the currencies company
	* @throws es.davinciti.liferay.NoSuchCurrenciesCompanyException if a currencies company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.CurrenciesCompany findByPrimaryKey(
		long currenciescompanyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchCurrenciesCompanyException;

	/**
	* Returns the currencies company with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param currenciescompanyId the primary key of the currencies company
	* @return the currencies company, or <code>null</code> if a currencies company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.CurrenciesCompany fetchByPrimaryKey(
		long currenciescompanyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the currencies companies.
	*
	* @return the currencies companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.CurrenciesCompany> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.CurrenciesCompany> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the currencies companies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CurrenciesCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of currencies companies
	* @param end the upper bound of the range of currencies companies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of currencies companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.CurrenciesCompany> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the currencies companies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of currencies companies.
	*
	* @return the number of currencies companies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}