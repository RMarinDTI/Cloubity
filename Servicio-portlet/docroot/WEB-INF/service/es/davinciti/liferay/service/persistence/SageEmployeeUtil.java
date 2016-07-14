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

import es.davinciti.liferay.model.SageEmployee;

import java.util.List;

/**
 * The persistence utility for the sage employee service. This utility wraps {@link SageEmployeePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see SageEmployeePersistence
 * @see SageEmployeePersistenceImpl
 * @generated
 */
public class SageEmployeeUtil {
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
	public static void clearCache(SageEmployee sageEmployee) {
		getPersistence().clearCache(sageEmployee);
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
	public static List<SageEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SageEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SageEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static SageEmployee update(SageEmployee sageEmployee)
		throws SystemException {
		return getPersistence().update(sageEmployee);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static SageEmployee update(SageEmployee sageEmployee,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(sageEmployee, serviceContext);
	}

	/**
	* Returns all the sage employees where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @return the matching sage employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SageEmployee> findByEmployeeId(
		java.lang.String employeeID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEmployeeId(employeeID);
	}

	/**
	* Returns a range of all the sage employees where employeeID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SageEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param employeeID the employee i d
	* @param start the lower bound of the range of sage employees
	* @param end the upper bound of the range of sage employees (not inclusive)
	* @return the range of matching sage employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SageEmployee> findByEmployeeId(
		java.lang.String employeeID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEmployeeId(employeeID, start, end);
	}

	/**
	* Returns an ordered range of all the sage employees where employeeID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SageEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param employeeID the employee i d
	* @param start the lower bound of the range of sage employees
	* @param end the upper bound of the range of sage employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sage employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SageEmployee> findByEmployeeId(
		java.lang.String employeeID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEmployeeId(employeeID, start, end, orderByComparator);
	}

	/**
	* Returns the first sage employee in the ordered set where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sage employee
	* @throws es.davinciti.liferay.NoSuchSageEmployeeException if a matching sage employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SageEmployee findByEmployeeId_First(
		java.lang.String employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSageEmployeeException {
		return getPersistence()
				   .findByEmployeeId_First(employeeID, orderByComparator);
	}

	/**
	* Returns the first sage employee in the ordered set where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sage employee, or <code>null</code> if a matching sage employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SageEmployee fetchByEmployeeId_First(
		java.lang.String employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEmployeeId_First(employeeID, orderByComparator);
	}

	/**
	* Returns the last sage employee in the ordered set where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sage employee
	* @throws es.davinciti.liferay.NoSuchSageEmployeeException if a matching sage employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SageEmployee findByEmployeeId_Last(
		java.lang.String employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSageEmployeeException {
		return getPersistence()
				   .findByEmployeeId_Last(employeeID, orderByComparator);
	}

	/**
	* Returns the last sage employee in the ordered set where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sage employee, or <code>null</code> if a matching sage employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SageEmployee fetchByEmployeeId_Last(
		java.lang.String employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEmployeeId_Last(employeeID, orderByComparator);
	}

	/**
	* Returns the sage employees before and after the current sage employee in the ordered set where employeeID = &#63;.
	*
	* @param sageEmployeeId the primary key of the current sage employee
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sage employee
	* @throws es.davinciti.liferay.NoSuchSageEmployeeException if a sage employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SageEmployee[] findByEmployeeId_PrevAndNext(
		long sageEmployeeId, java.lang.String employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSageEmployeeException {
		return getPersistence()
				   .findByEmployeeId_PrevAndNext(sageEmployeeId, employeeID,
			orderByComparator);
	}

	/**
	* Removes all the sage employees where employeeID = &#63; from the database.
	*
	* @param employeeID the employee i d
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEmployeeId(java.lang.String employeeID)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByEmployeeId(employeeID);
	}

	/**
	* Returns the number of sage employees where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @return the number of matching sage employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEmployeeId(java.lang.String employeeID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEmployeeId(employeeID);
	}

	/**
	* Returns all the sage employees where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching sage employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SageEmployee> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the sage employees where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SageEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of sage employees
	* @param end the upper bound of the range of sage employees (not inclusive)
	* @return the range of matching sage employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SageEmployee> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the sage employees where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SageEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of sage employees
	* @param end the upper bound of the range of sage employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sage employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SageEmployee> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first sage employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sage employee
	* @throws es.davinciti.liferay.NoSuchSageEmployeeException if a matching sage employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SageEmployee findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSageEmployeeException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first sage employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sage employee, or <code>null</code> if a matching sage employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SageEmployee fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last sage employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sage employee
	* @throws es.davinciti.liferay.NoSuchSageEmployeeException if a matching sage employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SageEmployee findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSageEmployeeException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last sage employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sage employee, or <code>null</code> if a matching sage employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SageEmployee fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the sage employees before and after the current sage employee in the ordered set where userId = &#63;.
	*
	* @param sageEmployeeId the primary key of the current sage employee
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sage employee
	* @throws es.davinciti.liferay.NoSuchSageEmployeeException if a sage employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SageEmployee[] findByUserId_PrevAndNext(
		long sageEmployeeId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSageEmployeeException {
		return getPersistence()
				   .findByUserId_PrevAndNext(sageEmployeeId, userId,
			orderByComparator);
	}

	/**
	* Removes all the sage employees where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of sage employees where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching sage employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Caches the sage employee in the entity cache if it is enabled.
	*
	* @param sageEmployee the sage employee
	*/
	public static void cacheResult(
		es.davinciti.liferay.model.SageEmployee sageEmployee) {
		getPersistence().cacheResult(sageEmployee);
	}

	/**
	* Caches the sage employees in the entity cache if it is enabled.
	*
	* @param sageEmployees the sage employees
	*/
	public static void cacheResult(
		java.util.List<es.davinciti.liferay.model.SageEmployee> sageEmployees) {
		getPersistence().cacheResult(sageEmployees);
	}

	/**
	* Creates a new sage employee with the primary key. Does not add the sage employee to the database.
	*
	* @param sageEmployeeId the primary key for the new sage employee
	* @return the new sage employee
	*/
	public static es.davinciti.liferay.model.SageEmployee create(
		long sageEmployeeId) {
		return getPersistence().create(sageEmployeeId);
	}

	/**
	* Removes the sage employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sageEmployeeId the primary key of the sage employee
	* @return the sage employee that was removed
	* @throws es.davinciti.liferay.NoSuchSageEmployeeException if a sage employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SageEmployee remove(
		long sageEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSageEmployeeException {
		return getPersistence().remove(sageEmployeeId);
	}

	public static es.davinciti.liferay.model.SageEmployee updateImpl(
		es.davinciti.liferay.model.SageEmployee sageEmployee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(sageEmployee);
	}

	/**
	* Returns the sage employee with the primary key or throws a {@link es.davinciti.liferay.NoSuchSageEmployeeException} if it could not be found.
	*
	* @param sageEmployeeId the primary key of the sage employee
	* @return the sage employee
	* @throws es.davinciti.liferay.NoSuchSageEmployeeException if a sage employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SageEmployee findByPrimaryKey(
		long sageEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSageEmployeeException {
		return getPersistence().findByPrimaryKey(sageEmployeeId);
	}

	/**
	* Returns the sage employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sageEmployeeId the primary key of the sage employee
	* @return the sage employee, or <code>null</code> if a sage employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SageEmployee fetchByPrimaryKey(
		long sageEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(sageEmployeeId);
	}

	/**
	* Returns all the sage employees.
	*
	* @return the sage employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SageEmployee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the sage employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SageEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sage employees
	* @param end the upper bound of the range of sage employees (not inclusive)
	* @return the range of sage employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SageEmployee> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the sage employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SageEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sage employees
	* @param end the upper bound of the range of sage employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sage employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SageEmployee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the sage employees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of sage employees.
	*
	* @return the number of sage employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SageEmployeePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SageEmployeePersistence)PortletBeanLocatorUtil.locate(es.davinciti.liferay.service.ClpSerializer.getServletContextName(),
					SageEmployeePersistence.class.getName());

			ReferenceRegistry.registerReference(SageEmployeeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(SageEmployeePersistence persistence) {
	}

	private static SageEmployeePersistence _persistence;
}