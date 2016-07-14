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

import es.davinciti.liferay.model.Calendario;

/**
 * The persistence interface for the calendario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see CalendarioPersistenceImpl
 * @see CalendarioUtil
 * @generated
 */
public interface CalendarioPersistence extends BasePersistence<Calendario> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CalendarioUtil} to access the calendario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the calendarios where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @return the matching calendarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.Calendario> findByCompanyIdUserIdYear(
		long companyId, long userId, int year)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the calendarios where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CalendarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @param start the lower bound of the range of calendarios
	* @param end the upper bound of the range of calendarios (not inclusive)
	* @return the range of matching calendarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.Calendario> findByCompanyIdUserIdYear(
		long companyId, long userId, int year, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the calendarios where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CalendarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @param start the lower bound of the range of calendarios
	* @param end the upper bound of the range of calendarios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching calendarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.Calendario> findByCompanyIdUserIdYear(
		long companyId, long userId, int year, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first calendario in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching calendario
	* @throws es.davinciti.liferay.NoSuchCalendarioException if a matching calendario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.Calendario findByCompanyIdUserIdYear_First(
		long companyId, long userId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchCalendarioException;

	/**
	* Returns the first calendario in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching calendario, or <code>null</code> if a matching calendario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.Calendario fetchByCompanyIdUserIdYear_First(
		long companyId, long userId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last calendario in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching calendario
	* @throws es.davinciti.liferay.NoSuchCalendarioException if a matching calendario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.Calendario findByCompanyIdUserIdYear_Last(
		long companyId, long userId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchCalendarioException;

	/**
	* Returns the last calendario in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching calendario, or <code>null</code> if a matching calendario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.Calendario fetchByCompanyIdUserIdYear_Last(
		long companyId, long userId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the calendarios before and after the current calendario in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* @param calendarioId the primary key of the current calendario
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next calendario
	* @throws es.davinciti.liferay.NoSuchCalendarioException if a calendario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.Calendario[] findByCompanyIdUserIdYear_PrevAndNext(
		long calendarioId, long companyId, long userId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchCalendarioException;

	/**
	* Removes all the calendarios where companyId = &#63; and userId = &#63; and year = &#63; from the database.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyIdUserIdYear(long companyId, long userId,
		int year) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of calendarios where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @return the number of matching calendarios
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyIdUserIdYear(long companyId, long userId, int year)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the calendario in the entity cache if it is enabled.
	*
	* @param calendario the calendario
	*/
	public void cacheResult(es.davinciti.liferay.model.Calendario calendario);

	/**
	* Caches the calendarios in the entity cache if it is enabled.
	*
	* @param calendarios the calendarios
	*/
	public void cacheResult(
		java.util.List<es.davinciti.liferay.model.Calendario> calendarios);

	/**
	* Creates a new calendario with the primary key. Does not add the calendario to the database.
	*
	* @param calendarioId the primary key for the new calendario
	* @return the new calendario
	*/
	public es.davinciti.liferay.model.Calendario create(long calendarioId);

	/**
	* Removes the calendario with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param calendarioId the primary key of the calendario
	* @return the calendario that was removed
	* @throws es.davinciti.liferay.NoSuchCalendarioException if a calendario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.Calendario remove(long calendarioId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchCalendarioException;

	public es.davinciti.liferay.model.Calendario updateImpl(
		es.davinciti.liferay.model.Calendario calendario)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the calendario with the primary key or throws a {@link es.davinciti.liferay.NoSuchCalendarioException} if it could not be found.
	*
	* @param calendarioId the primary key of the calendario
	* @return the calendario
	* @throws es.davinciti.liferay.NoSuchCalendarioException if a calendario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.Calendario findByPrimaryKey(
		long calendarioId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchCalendarioException;

	/**
	* Returns the calendario with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param calendarioId the primary key of the calendario
	* @return the calendario, or <code>null</code> if a calendario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.Calendario fetchByPrimaryKey(
		long calendarioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the calendarios.
	*
	* @return the calendarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.Calendario> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the calendarios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CalendarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of calendarios
	* @param end the upper bound of the range of calendarios (not inclusive)
	* @return the range of calendarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.Calendario> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the calendarios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CalendarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of calendarios
	* @param end the upper bound of the range of calendarios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of calendarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.Calendario> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the calendarios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of calendarios.
	*
	* @return the number of calendarios
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}