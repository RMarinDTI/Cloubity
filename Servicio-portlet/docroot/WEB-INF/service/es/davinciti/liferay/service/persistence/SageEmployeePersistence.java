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

import es.davinciti.liferay.model.SageEmployee;

/**
 * The persistence interface for the sage employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see SageEmployeePersistenceImpl
 * @see SageEmployeeUtil
 * @generated
 */
public interface SageEmployeePersistence extends BasePersistence<SageEmployee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SageEmployeeUtil} to access the sage employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the sage employees where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @return the matching sage employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.SageEmployee> findByEmployeeId(
		java.lang.String employeeID)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.SageEmployee> findByEmployeeId(
		java.lang.String employeeID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.SageEmployee> findByEmployeeId(
		java.lang.String employeeID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first sage employee in the ordered set where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sage employee
	* @throws es.davinciti.liferay.NoSuchSageEmployeeException if a matching sage employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SageEmployee findByEmployeeId_First(
		java.lang.String employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSageEmployeeException;

	/**
	* Returns the first sage employee in the ordered set where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sage employee, or <code>null</code> if a matching sage employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SageEmployee fetchByEmployeeId_First(
		java.lang.String employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last sage employee in the ordered set where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sage employee
	* @throws es.davinciti.liferay.NoSuchSageEmployeeException if a matching sage employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SageEmployee findByEmployeeId_Last(
		java.lang.String employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSageEmployeeException;

	/**
	* Returns the last sage employee in the ordered set where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sage employee, or <code>null</code> if a matching sage employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SageEmployee fetchByEmployeeId_Last(
		java.lang.String employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public es.davinciti.liferay.model.SageEmployee[] findByEmployeeId_PrevAndNext(
		long sageEmployeeId, java.lang.String employeeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSageEmployeeException;

	/**
	* Removes all the sage employees where employeeID = &#63; from the database.
	*
	* @param employeeID the employee i d
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEmployeeId(java.lang.String employeeID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sage employees where employeeID = &#63;.
	*
	* @param employeeID the employee i d
	* @return the number of matching sage employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByEmployeeId(java.lang.String employeeID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sage employees where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching sage employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.SageEmployee> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.SageEmployee> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.SageEmployee> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first sage employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sage employee
	* @throws es.davinciti.liferay.NoSuchSageEmployeeException if a matching sage employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SageEmployee findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSageEmployeeException;

	/**
	* Returns the first sage employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sage employee, or <code>null</code> if a matching sage employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SageEmployee fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last sage employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sage employee
	* @throws es.davinciti.liferay.NoSuchSageEmployeeException if a matching sage employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SageEmployee findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSageEmployeeException;

	/**
	* Returns the last sage employee in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sage employee, or <code>null</code> if a matching sage employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SageEmployee fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public es.davinciti.liferay.model.SageEmployee[] findByUserId_PrevAndNext(
		long sageEmployeeId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSageEmployeeException;

	/**
	* Removes all the sage employees where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sage employees where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching sage employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the sage employee in the entity cache if it is enabled.
	*
	* @param sageEmployee the sage employee
	*/
	public void cacheResult(
		es.davinciti.liferay.model.SageEmployee sageEmployee);

	/**
	* Caches the sage employees in the entity cache if it is enabled.
	*
	* @param sageEmployees the sage employees
	*/
	public void cacheResult(
		java.util.List<es.davinciti.liferay.model.SageEmployee> sageEmployees);

	/**
	* Creates a new sage employee with the primary key. Does not add the sage employee to the database.
	*
	* @param sageEmployeeId the primary key for the new sage employee
	* @return the new sage employee
	*/
	public es.davinciti.liferay.model.SageEmployee create(long sageEmployeeId);

	/**
	* Removes the sage employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sageEmployeeId the primary key of the sage employee
	* @return the sage employee that was removed
	* @throws es.davinciti.liferay.NoSuchSageEmployeeException if a sage employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SageEmployee remove(long sageEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSageEmployeeException;

	public es.davinciti.liferay.model.SageEmployee updateImpl(
		es.davinciti.liferay.model.SageEmployee sageEmployee)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sage employee with the primary key or throws a {@link es.davinciti.liferay.NoSuchSageEmployeeException} if it could not be found.
	*
	* @param sageEmployeeId the primary key of the sage employee
	* @return the sage employee
	* @throws es.davinciti.liferay.NoSuchSageEmployeeException if a sage employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SageEmployee findByPrimaryKey(
		long sageEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchSageEmployeeException;

	/**
	* Returns the sage employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sageEmployeeId the primary key of the sage employee
	* @return the sage employee, or <code>null</code> if a sage employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.SageEmployee fetchByPrimaryKey(
		long sageEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sage employees.
	*
	* @return the sage employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.SageEmployee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.SageEmployee> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.SageEmployee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the sage employees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sage employees.
	*
	* @return the number of sage employees
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}