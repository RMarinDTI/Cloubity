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

import es.davinciti.liferay.model.SapEmployee;

import java.util.List;

/**
 * The persistence utility for the sap employee service. This utility wraps {@link SapEmployeePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see SapEmployeePersistence
 * @see SapEmployeePersistenceImpl
 * @generated
 */
public class SapEmployeeUtil {
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
	public static void clearCache(SapEmployee sapEmployee) {
		getPersistence().clearCache(sapEmployee);
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
	public static List<SapEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SapEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SapEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static SapEmployee update(SapEmployee sapEmployee)
		throws SystemException {
		return getPersistence().update(sapEmployee);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static SapEmployee update(SapEmployee sapEmployee,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(sapEmployee, serviceContext);
	}

	/**
	* Returns all the sap employees where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @return the matching sap employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SapEmployee> findByEmployeeId(
		long employeeID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEmployeeId(employeeID);
	}

	/**
	* Returns a range of all the sap employees where employeeID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SapEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param employeeID the employee i d
	* @param start the lower bound of the range of sap employees
	* @param end the upper bound of the range of sap employees (not inclusive)
	* @return the range of matching sap employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SapEmployee> findByEmployeeId(
		long employeeID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEmployeeId(employeeID, start, end);
	}

	/**
	* Returns an ordered range of all the sap employees where employeeID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SapEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param employeeID the employee i d
	* @param start the lower bound of the range of sap employees
	* @param end the upper bound of the range of sap employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sap employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SapEmployee> findByEmployeeId(
		long employeeID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEmployeeId(employeeID, start, end, orderByComparator);
	}

	/**
	* Returns the first sap employee in the ordered set where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sap employee
	* @throws es.davinciti.liferay.NoSuchSapEmployeeException if a matching sap employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SapEmployee findByEmployeeId_First(
		long employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSapEmployeeException {
		return getPersistence()
				   .findByEmployeeId_First(employeeID, orderByComparator);
	}

	/**
	* Returns the first sap employee in the ordered set where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sap employee, or <code>null</code> if a matching sap employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SapEmployee fetchByEmployeeId_First(
		long employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEmployeeId_First(employeeID, orderByComparator);
	}

	/**
	* Returns the last sap employee in the ordered set where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sap employee
	* @throws es.davinciti.liferay.NoSuchSapEmployeeException if a matching sap employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SapEmployee findByEmployeeId_Last(
		long employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSapEmployeeException {
		return getPersistence()
				   .findByEmployeeId_Last(employeeID, orderByComparator);
	}

	/**
	* Returns the last sap employee in the ordered set where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sap employee, or <code>null</code> if a matching sap employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SapEmployee fetchByEmployeeId_Last(
		long employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEmployeeId_Last(employeeID, orderByComparator);
	}

	/**
	* Returns the sap employees before and after the current sap employee in the ordered set where employeeID = &#63;.
	*
	* @param sapEmployeeId the primary key of the current sap employee
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sap employee
	* @throws es.davinciti.liferay.NoSuchSapEmployeeException if a sap employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SapEmployee[] findByEmployeeId_PrevAndNext(
		long sapEmployeeId, long employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSapEmployeeException {
		return getPersistence()
				   .findByEmployeeId_PrevAndNext(sapEmployeeId, employeeID,
			orderByComparator);
	}

	/**
	* Removes all the sap employees where employeeID = &#63; from the database.
	*
	* @param employeeID the employee i d
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEmployeeId(long employeeID)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByEmployeeId(employeeID);
	}

	/**
	* Returns the number of sap employees where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @return the number of matching sap employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEmployeeId(long employeeID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEmployeeId(employeeID);
	}

	/**
	* Returns all the sap employees where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching sap employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SapEmployee> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the sap employees where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SapEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of sap employees
	* @param end the upper bound of the range of sap employees (not inclusive)
	* @return the range of matching sap employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SapEmployee> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the sap employees where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SapEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of sap employees
	* @param end the upper bound of the range of sap employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sap employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SapEmployee> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first sap employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sap employee
	* @throws es.davinciti.liferay.NoSuchSapEmployeeException if a matching sap employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SapEmployee findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSapEmployeeException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first sap employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sap employee, or <code>null</code> if a matching sap employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SapEmployee fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last sap employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sap employee
	* @throws es.davinciti.liferay.NoSuchSapEmployeeException if a matching sap employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SapEmployee findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSapEmployeeException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last sap employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sap employee, or <code>null</code> if a matching sap employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SapEmployee fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the sap employees before and after the current sap employee in the ordered set where userId = &#63;.
	*
	* @param sapEmployeeId the primary key of the current sap employee
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sap employee
	* @throws es.davinciti.liferay.NoSuchSapEmployeeException if a sap employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SapEmployee[] findByUserId_PrevAndNext(
		long sapEmployeeId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSapEmployeeException {
		return getPersistence()
				   .findByUserId_PrevAndNext(sapEmployeeId, userId,
			orderByComparator);
	}

	/**
	* Removes all the sap employees where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of sap employees where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching sap employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Caches the sap employee in the entity cache if it is enabled.
	*
	* @param sapEmployee the sap employee
	*/
	public static void cacheResult(
		es.davinciti.liferay.model.SapEmployee sapEmployee) {
		getPersistence().cacheResult(sapEmployee);
	}

	/**
	* Caches the sap employees in the entity cache if it is enabled.
	*
	* @param sapEmployees the sap employees
	*/
	public static void cacheResult(
		java.util.List<es.davinciti.liferay.model.SapEmployee> sapEmployees) {
		getPersistence().cacheResult(sapEmployees);
	}

	/**
	* Creates a new sap employee with the primary key. Does not add the sap employee to the database.
	*
	* @param sapEmployeeId the primary key for the new sap employee
	* @return the new sap employee
	*/
	public static es.davinciti.liferay.model.SapEmployee create(
		long sapEmployeeId) {
		return getPersistence().create(sapEmployeeId);
	}

	/**
	* Removes the sap employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sapEmployeeId the primary key of the sap employee
	* @return the sap employee that was removed
	* @throws es.davinciti.liferay.NoSuchSapEmployeeException if a sap employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SapEmployee remove(
		long sapEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSapEmployeeException {
		return getPersistence().remove(sapEmployeeId);
	}

	public static es.davinciti.liferay.model.SapEmployee updateImpl(
		es.davinciti.liferay.model.SapEmployee sapEmployee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(sapEmployee);
	}

	/**
	* Returns the sap employee with the primary key or throws a {@link es.davinciti.liferay.NoSuchSapEmployeeException} if it could not be found.
	*
	* @param sapEmployeeId the primary key of the sap employee
	* @return the sap employee
	* @throws es.davinciti.liferay.NoSuchSapEmployeeException if a sap employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SapEmployee findByPrimaryKey(
		long sapEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSapEmployeeException {
		return getPersistence().findByPrimaryKey(sapEmployeeId);
	}

	/**
	* Returns the sap employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sapEmployeeId the primary key of the sap employee
	* @return the sap employee, or <code>null</code> if a sap employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.SapEmployee fetchByPrimaryKey(
		long sapEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(sapEmployeeId);
	}

	/**
	* Returns all the sap employees.
	*
	* @return the sap employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SapEmployee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the sap employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SapEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sap employees
	* @param end the upper bound of the range of sap employees (not inclusive)
	* @return the range of sap employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SapEmployee> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the sap employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SapEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sap employees
	* @param end the upper bound of the range of sap employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sap employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.SapEmployee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the sap employees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of sap employees.
	*
	* @return the number of sap employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SapEmployeePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SapEmployeePersistence)PortletBeanLocatorUtil.locate(es.davinciti.liferay.service.ClpSerializer.getServletContextName(),
					SapEmployeePersistence.class.getName());

			ReferenceRegistry.registerReference(SapEmployeeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(SapEmployeePersistence persistence) {
	}

	private static SapEmployeePersistence _persistence;
}