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

import es.davinciti.liferay.model.DiasVacaciones;

import java.util.List;

/**
 * The persistence utility for the dias vacaciones service. This utility wraps {@link DiasVacacionesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see DiasVacacionesPersistence
 * @see DiasVacacionesPersistenceImpl
 * @generated
 */
public class DiasVacacionesUtil {
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
	public static void clearCache(DiasVacaciones diasVacaciones) {
		getPersistence().clearCache(diasVacaciones);
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
	public static List<DiasVacaciones> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DiasVacaciones> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DiasVacaciones> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DiasVacaciones update(DiasVacaciones diasVacaciones)
		throws SystemException {
		return getPersistence().update(diasVacaciones);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DiasVacaciones update(DiasVacaciones diasVacaciones,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(diasVacaciones, serviceContext);
	}

	/**
	* Returns all the dias vacacioneses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

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
	public static java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first dias vacaciones in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dias vacaciones
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.DiasVacaciones findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first dias vacaciones in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dias vacaciones, or <code>null</code> if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.DiasVacaciones fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last dias vacaciones in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dias vacaciones
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.DiasVacaciones findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last dias vacaciones in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dias vacaciones, or <code>null</code> if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.DiasVacaciones fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

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
	public static es.davinciti.liferay.model.DiasVacaciones[] findByCompanyId_PrevAndNext(
		long diasVacacionesId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(diasVacacionesId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the dias vacacioneses where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of dias vacacioneses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns all the dias vacacioneses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

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
	public static java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first dias vacaciones in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dias vacaciones
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.DiasVacaciones findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first dias vacaciones in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dias vacaciones, or <code>null</code> if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.DiasVacaciones fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last dias vacaciones in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dias vacaciones
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.DiasVacaciones findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last dias vacaciones in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dias vacaciones, or <code>null</code> if a matching dias vacaciones could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.DiasVacaciones fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

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
	public static es.davinciti.liferay.model.DiasVacaciones[] findByUserId_PrevAndNext(
		long diasVacacionesId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException {
		return getPersistence()
				   .findByUserId_PrevAndNext(diasVacacionesId, userId,
			orderByComparator);
	}

	/**
	* Removes all the dias vacacioneses where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of dias vacacioneses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the dias vacacioneses where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @return the matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByCompanyIdUserIdYear(
		long companyId, long userId, int year)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyIdUserIdYear(companyId, userId, year);
	}

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
	public static java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByCompanyIdUserIdYear(
		long companyId, long userId, int year, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyIdUserIdYear(companyId, userId, year, start,
			end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByCompanyIdUserIdYear(
		long companyId, long userId, int year, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyIdUserIdYear(companyId, userId, year, start,
			end, orderByComparator);
	}

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
	public static es.davinciti.liferay.model.DiasVacaciones findByCompanyIdUserIdYear_First(
		long companyId, long userId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException {
		return getPersistence()
				   .findByCompanyIdUserIdYear_First(companyId, userId, year,
			orderByComparator);
	}

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
	public static es.davinciti.liferay.model.DiasVacaciones fetchByCompanyIdUserIdYear_First(
		long companyId, long userId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyIdUserIdYear_First(companyId, userId, year,
			orderByComparator);
	}

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
	public static es.davinciti.liferay.model.DiasVacaciones findByCompanyIdUserIdYear_Last(
		long companyId, long userId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException {
		return getPersistence()
				   .findByCompanyIdUserIdYear_Last(companyId, userId, year,
			orderByComparator);
	}

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
	public static es.davinciti.liferay.model.DiasVacaciones fetchByCompanyIdUserIdYear_Last(
		long companyId, long userId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyIdUserIdYear_Last(companyId, userId, year,
			orderByComparator);
	}

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
	public static es.davinciti.liferay.model.DiasVacaciones[] findByCompanyIdUserIdYear_PrevAndNext(
		long diasVacacionesId, long companyId, long userId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException {
		return getPersistence()
				   .findByCompanyIdUserIdYear_PrevAndNext(diasVacacionesId,
			companyId, userId, year, orderByComparator);
	}

	/**
	* Removes all the dias vacacioneses where companyId = &#63; and userId = &#63; and year = &#63; from the database.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyIdUserIdYear(long companyId, long userId,
		int year) throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyIdUserIdYear(companyId, userId, year);
	}

	/**
	* Returns the number of dias vacacioneses where companyId = &#63; and userId = &#63; and year = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param year the year
	* @return the number of matching dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyIdUserIdYear(long companyId, long userId,
		int year) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByCompanyIdUserIdYear(companyId, userId, year);
	}

	/**
	* Caches the dias vacaciones in the entity cache if it is enabled.
	*
	* @param diasVacaciones the dias vacaciones
	*/
	public static void cacheResult(
		es.davinciti.liferay.model.DiasVacaciones diasVacaciones) {
		getPersistence().cacheResult(diasVacaciones);
	}

	/**
	* Caches the dias vacacioneses in the entity cache if it is enabled.
	*
	* @param diasVacacioneses the dias vacacioneses
	*/
	public static void cacheResult(
		java.util.List<es.davinciti.liferay.model.DiasVacaciones> diasVacacioneses) {
		getPersistence().cacheResult(diasVacacioneses);
	}

	/**
	* Creates a new dias vacaciones with the primary key. Does not add the dias vacaciones to the database.
	*
	* @param diasVacacionesId the primary key for the new dias vacaciones
	* @return the new dias vacaciones
	*/
	public static es.davinciti.liferay.model.DiasVacaciones create(
		long diasVacacionesId) {
		return getPersistence().create(diasVacacionesId);
	}

	/**
	* Removes the dias vacaciones with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param diasVacacionesId the primary key of the dias vacaciones
	* @return the dias vacaciones that was removed
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a dias vacaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.DiasVacaciones remove(
		long diasVacacionesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException {
		return getPersistence().remove(diasVacacionesId);
	}

	public static es.davinciti.liferay.model.DiasVacaciones updateImpl(
		es.davinciti.liferay.model.DiasVacaciones diasVacaciones)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(diasVacaciones);
	}

	/**
	* Returns the dias vacaciones with the primary key or throws a {@link es.davinciti.liferay.NoSuchDiasVacacionesException} if it could not be found.
	*
	* @param diasVacacionesId the primary key of the dias vacaciones
	* @return the dias vacaciones
	* @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a dias vacaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.DiasVacaciones findByPrimaryKey(
		long diasVacacionesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchDiasVacacionesException {
		return getPersistence().findByPrimaryKey(diasVacacionesId);
	}

	/**
	* Returns the dias vacaciones with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param diasVacacionesId the primary key of the dias vacaciones
	* @return the dias vacaciones, or <code>null</code> if a dias vacaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.DiasVacaciones fetchByPrimaryKey(
		long diasVacacionesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(diasVacacionesId);
	}

	/**
	* Returns all the dias vacacioneses.
	*
	* @return the dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.DiasVacaciones> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<es.davinciti.liferay.model.DiasVacaciones> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.DiasVacaciones> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dias vacacioneses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dias vacacioneses.
	*
	* @return the number of dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DiasVacacionesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DiasVacacionesPersistence)PortletBeanLocatorUtil.locate(es.davinciti.liferay.service.ClpSerializer.getServletContextName(),
					DiasVacacionesPersistence.class.getName());

			ReferenceRegistry.registerReference(DiasVacacionesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DiasVacacionesPersistence persistence) {
	}

	private static DiasVacacionesPersistence _persistence;
}