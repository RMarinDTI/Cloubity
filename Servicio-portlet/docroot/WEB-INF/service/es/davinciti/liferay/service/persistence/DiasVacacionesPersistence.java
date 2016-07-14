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

import es.davinciti.liferay.model.DiasVacaciones;

/**
 * The persistence interface for the dias vacaciones service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see DiasVacacionesPersistenceImpl
 * @see DiasVacacionesUtil
 * @generated
 */
public interface DiasVacacionesPersistence extends BasePersistence<DiasVacaciones> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DiasVacacionesUtil} to access the dias vacaciones persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dias vacacioneses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dias vacacioneses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of dias vacacioneses
	* @param end the upper bound of the range of dias vacacioneses (not inclusive)
	* @return the range of matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dias vacacioneses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of dias vacacioneses
	* @param end the upper bound of the range of dias vacacioneses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dias vacaciones in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dias vacaciones
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException;

	/**
	* Returns the first dias vacaciones in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dias vacaciones, or <code>null</code> if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dias vacaciones in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dias vacaciones
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException;

	/**
	* Returns the last dias vacaciones in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dias vacaciones, or <code>null</code> if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dias vacacioneses before and after the current dias vacaciones in the ordered set where companyId = &#63;.
	*
	* @param diasVacacionesId the primary key of the current dias vacaciones
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dias vacaciones
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a dias vacaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones[] findByCompanyId_PrevAndNext(
		long diasVacacionesId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException;

	/**
	* Removes all the dias vacacioneses where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dias vacacioneses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dias vacacioneses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dias vacacioneses where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of dias vacacioneses
	* @param end the upper bound of the range of dias vacacioneses (not inclusive)
	* @return the range of matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dias vacacioneses where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of dias vacacioneses
	* @param end the upper bound of the range of dias vacacioneses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dias vacaciones in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dias vacaciones
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException;

	/**
	* Returns the first dias vacaciones in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dias vacaciones, or <code>null</code> if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dias vacaciones in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dias vacaciones
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException;

	/**
	* Returns the last dias vacaciones in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dias vacaciones, or <code>null</code> if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dias vacacioneses before and after the current dias vacaciones in the ordered set where userId = &#63;.
	*
	* @param diasVacacionesId the primary key of the current dias vacaciones
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dias vacaciones
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a dias vacaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones[] findByUserId_PrevAndNext(
		long diasVacacionesId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException;

	/**
	* Removes all the dias vacacioneses where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dias vacacioneses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dias vacacioneses where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @return the matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByCompanyIdUserIdYear(
		long companyId, long userId, int year)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dias vacacioneses where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @param start the lower bound of the range of dias vacacioneses
	* @param end the upper bound of the range of dias vacacioneses (not inclusive)
	* @return the range of matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByCompanyIdUserIdYear(
		long companyId, long userId, int year, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dias vacacioneses where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @param start the lower bound of the range of dias vacacioneses
	* @param end the upper bound of the range of dias vacacioneses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByCompanyIdUserIdYear(
		long companyId, long userId, int year, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dias vacaciones in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dias vacaciones
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones findByCompanyIdUserIdYear_First(
		long companyId, long userId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException;

	/**
	* Returns the first dias vacaciones in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dias vacaciones, or <code>null</code> if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones fetchByCompanyIdUserIdYear_First(
		long companyId, long userId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dias vacaciones in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dias vacaciones
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones findByCompanyIdUserIdYear_Last(
		long companyId, long userId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException;

	/**
	* Returns the last dias vacaciones in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dias vacaciones, or <code>null</code> if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones fetchByCompanyIdUserIdYear_Last(
		long companyId, long userId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dias vacacioneses before and after the current dias vacaciones in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* @param diasVacacionesId the primary key of the current dias vacaciones
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dias vacaciones
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a dias vacaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones[] findByCompanyIdUserIdYear_PrevAndNext(
		long diasVacacionesId, long companyId, long userId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException;

	/**
	* Removes all the dias vacacioneses where companyId = &#63; and userId = &#63; and year = &#63; from the database.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyIdUserIdYear(long companyId, long userId,
		int year) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dias vacacioneses where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @return the number of matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyIdUserIdYear(long companyId, long userId, int year)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dias vacaciones in the entity cache if it is enabled.
	*
	* @param diasVacaciones the dias vacaciones
	*/
	public void cacheResult(
		es.davinciti.liferay.model.DiasVacaciones diasVacaciones);

	/**
	* Caches the dias vacacioneses in the entity cache if it is enabled.
	*
	* @param diasVacacioneses the dias vacacioneses
	*/
	public void cacheResult(
		java.util.List<es.davinciti.liferay.model.DiasVacaciones> diasVacacioneses);

	/**
	* Creates a new dias vacaciones with the primary key. Does not add the dias vacaciones to the database.
	*
	* @param diasVacacionesId the primary key for the new dias vacaciones
	* @return the new dias vacaciones
	*/
	public es.davinciti.liferay.model.DiasVacaciones create(
		long diasVacacionesId);

	/**
	* Removes the dias vacaciones with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param diasVacacionesId the primary key of the dias vacaciones
	* @return the dias vacaciones that was removed
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a dias vacaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones remove(
		long diasVacacionesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException;

	public es.davinciti.liferay.model.DiasVacaciones updateImpl(
		es.davinciti.liferay.model.DiasVacaciones diasVacaciones)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dias vacaciones with the primary key or throws a {@link es.davinciti.liferay.NoSuchDiasVacacionesException} if it could not be found.
	*
	* @param diasVacacionesId the primary key of the dias vacaciones
	* @return the dias vacaciones
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a dias vacaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones findByPrimaryKey(
		long diasVacacionesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException;

	/**
	* Returns the dias vacaciones with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param diasVacacionesId the primary key of the dias vacaciones
	* @return the dias vacaciones, or <code>null</code> if a dias vacaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.DiasVacaciones fetchByPrimaryKey(
		long diasVacacionesId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dias vacacioneses.
	*
	* @return the dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.DiasVacaciones> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dias vacacioneses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dias vacacioneses
	* @param end the upper bound of the range of dias vacacioneses (not inclusive)
	* @return the range of dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.DiasVacaciones> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dias vacacioneses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dias vacacioneses
	* @param end the upper bound of the range of dias vacacioneses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.DiasVacaciones> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dias vacacioneses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dias vacacioneses.
	*
	* @return the number of dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}