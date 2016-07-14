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

import es.davinciti.liferay.model.SapEmployee;

/**
 * The persistence interface for the sap employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see SapEmployeePersistenceImpl
 * @see SapEmployeeUtil
 * @generated
 */
public interface SapEmployeePersistence extends BasePersistence<SapEmployee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SapEmployeeUtil} to access the sap employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the sap employees where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @return the matching sap employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.SapEmployee> findByEmployeeId(
		long employeeID)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.SapEmployee> findByEmployeeId(
		long employeeID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.SapEmployee> findByEmployeeId(
		long employeeID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first sap employee in the ordered set where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sap employee
	* @throws es.davinciti.liferay.NoSuchSapEmployeeException if a matching sap employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SapEmployee findByEmployeeId_First(
		long employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSapEmployeeException;

	/**
	* Returns the first sap employee in the ordered set where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sap employee, or <code>null</code> if a matching sap employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SapEmployee fetchByEmployeeId_First(
		long employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last sap employee in the ordered set where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sap employee
	* @throws es.davinciti.liferay.NoSuchSapEmployeeException if a matching sap employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SapEmployee findByEmployeeId_Last(
		long employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSapEmployeeException;

	/**
	* Returns the last sap employee in the ordered set where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sap employee, or <code>null</code> if a matching sap employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SapEmployee fetchByEmployeeId_Last(
		long employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public es.davinciti.liferay.model.SapEmployee[] findByEmployeeId_PrevAndNext(
		long sapEmployeeId, long employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSapEmployeeException;

	/**
	* Removes all the sap employees where employeeID = &#63; from the database.
	*
	* @param employeeID the employee i d
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEmployeeId(long employeeID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sap employees where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @return the number of matching sap employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByEmployeeId(long employeeID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sap employees where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching sap employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.SapEmployee> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.SapEmployee> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.SapEmployee> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first sap employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sap employee
	* @throws es.davinciti.liferay.NoSuchSapEmployeeException if a matching sap employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SapEmployee findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSapEmployeeException;

	/**
	* Returns the first sap employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sap employee, or <code>null</code> if a matching sap employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SapEmployee fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last sap employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sap employee
	* @throws es.davinciti.liferay.NoSuchSapEmployeeException if a matching sap employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SapEmployee findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSapEmployeeException;

	/**
	* Returns the last sap employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sap employee, or <code>null</code> if a matching sap employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SapEmployee fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public es.davinciti.liferay.model.SapEmployee[] findByUserId_PrevAndNext(
		long sapEmployeeId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSapEmployeeException;

	/**
	* Removes all the sap employees where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sap employees where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching sap employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the sap employee in the entity cache if it is enabled.
	*
	* @param sapEmployee the sap employee
	*/
	public void cacheResult(es.davinciti.liferay.model.SapEmployee sapEmployee);

	/**
	* Caches the sap employees in the entity cache if it is enabled.
	*
	* @param sapEmployees the sap employees
	*/
	public void cacheResult(
		java.util.List<es.davinciti.liferay.model.SapEmployee> sapEmployees);

	/**
	* Creates a new sap employee with the primary key. Does not add the sap employee to the database.
	*
	* @param sapEmployeeId the primary key for the new sap employee
	* @return the new sap employee
	*/
	public es.davinciti.liferay.model.SapEmployee create(long sapEmployeeId);

	/**
	* Removes the sap employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sapEmployeeId the primary key of the sap employee
	* @return the sap employee that was removed
	* @throws es.davinciti.liferay.NoSuchSapEmployeeException if a sap employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SapEmployee remove(long sapEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSapEmployeeException;

	public es.davinciti.liferay.model.SapEmployee updateImpl(
		es.davinciti.liferay.model.SapEmployee sapEmployee)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sap employee with the primary key or throws a {@link es.davinciti.liferay.NoSuchSapEmployeeException} if it could not be found.
	*
	* @param sapEmployeeId the primary key of the sap employee
	* @return the sap employee
	* @throws es.davinciti.liferay.NoSuchSapEmployeeException if a sap employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SapEmployee findByPrimaryKey(
		long sapEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSapEmployeeException;

	/**
	* Returns the sap employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sapEmployeeId the primary key of the sap employee
	* @return the sap employee, or <code>null</code> if a sap employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SapEmployee fetchByPrimaryKey(
		long sapEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sap employees.
	*
	* @return the sap employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.SapEmployee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.SapEmployee> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.SapEmployee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the sap employees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sap employees.
	*
	* @return the number of sap employees
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}