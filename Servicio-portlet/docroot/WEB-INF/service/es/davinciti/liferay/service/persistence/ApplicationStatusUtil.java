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

import es.davinciti.liferay.model.ApplicationStatus;

import java.util.List;

/**
 * The persistence utility for the application status service. This utility wraps {@link ApplicationStatusPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see ApplicationStatusPersistence
 * @see ApplicationStatusPersistenceImpl
 * @generated
 */
public class ApplicationStatusUtil {
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
	public static void clearCache(ApplicationStatus applicationStatus) {
		getPersistence().clearCache(applicationStatus);
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
	public static List<ApplicationStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ApplicationStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ApplicationStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ApplicationStatus update(ApplicationStatus applicationStatus)
		throws SystemException {
		return getPersistence().update(applicationStatus);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ApplicationStatus update(
		ApplicationStatus applicationStatus, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(applicationStatus, serviceContext);
	}

	/**
	* Returns all the application statuses where applicationName = &#63; and statusId = &#63;.
	*
	* @param applicationName the application name
	* @param statusId the status ID
	* @return the matching application statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ApplicationStatus> findByApplicationNameStatusId(
		java.lang.String applicationName, java.lang.String statusId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByApplicationNameStatusId(applicationName, statusId);
	}

	/**
	* Returns a range of all the application statuses where applicationName = &#63; and statusId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ApplicationStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicationName the application name
	* @param statusId the status ID
	* @param start the lower bound of the range of application statuses
	* @param end the upper bound of the range of application statuses (not inclusive)
	* @return the range of matching application statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ApplicationStatus> findByApplicationNameStatusId(
		java.lang.String applicationName, java.lang.String statusId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByApplicationNameStatusId(applicationName, statusId,
			start, end);
	}

	/**
	* Returns an ordered range of all the application statuses where applicationName = &#63; and statusId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ApplicationStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicationName the application name
	* @param statusId the status ID
	* @param start the lower bound of the range of application statuses
	* @param end the upper bound of the range of application statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching application statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ApplicationStatus> findByApplicationNameStatusId(
		java.lang.String applicationName, java.lang.String statusId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByApplicationNameStatusId(applicationName, statusId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first application status in the ordered set where applicationName = &#63; and statusId = &#63;.
	*
	* @param applicationName the application name
	* @param statusId the status ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching application status
	* @throws es.davinciti.liferay.NoSuchApplicationStatusException if a matching application status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ApplicationStatus findByApplicationNameStatusId_First(
		java.lang.String applicationName, java.lang.String statusId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchApplicationStatusException {
		return getPersistence()
				   .findByApplicationNameStatusId_First(applicationName,
			statusId, orderByComparator);
	}

	/**
	* Returns the first application status in the ordered set where applicationName = &#63; and statusId = &#63;.
	*
	* @param applicationName the application name
	* @param statusId the status ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching application status, or <code>null</code> if a matching application status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ApplicationStatus fetchByApplicationNameStatusId_First(
		java.lang.String applicationName, java.lang.String statusId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByApplicationNameStatusId_First(applicationName,
			statusId, orderByComparator);
	}

	/**
	* Returns the last application status in the ordered set where applicationName = &#63; and statusId = &#63;.
	*
	* @param applicationName the application name
	* @param statusId the status ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching application status
	* @throws es.davinciti.liferay.NoSuchApplicationStatusException if a matching application status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ApplicationStatus findByApplicationNameStatusId_Last(
		java.lang.String applicationName, java.lang.String statusId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchApplicationStatusException {
		return getPersistence()
				   .findByApplicationNameStatusId_Last(applicationName,
			statusId, orderByComparator);
	}

	/**
	* Returns the last application status in the ordered set where applicationName = &#63; and statusId = &#63;.
	*
	* @param applicationName the application name
	* @param statusId the status ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching application status, or <code>null</code> if a matching application status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ApplicationStatus fetchByApplicationNameStatusId_Last(
		java.lang.String applicationName, java.lang.String statusId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByApplicationNameStatusId_Last(applicationName,
			statusId, orderByComparator);
	}

	/**
	* Returns the application statuses before and after the current application status in the ordered set where applicationName = &#63; and statusId = &#63;.
	*
	* @param applicationStatusId the primary key of the current application status
	* @param applicationName the application name
	* @param statusId the status ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next application status
	* @throws es.davinciti.liferay.NoSuchApplicationStatusException if a application status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ApplicationStatus[] findByApplicationNameStatusId_PrevAndNext(
		long applicationStatusId, java.lang.String applicationName,
		java.lang.String statusId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchApplicationStatusException {
		return getPersistence()
				   .findByApplicationNameStatusId_PrevAndNext(applicationStatusId,
			applicationName, statusId, orderByComparator);
	}

	/**
	* Removes all the application statuses where applicationName = &#63; and statusId = &#63; from the database.
	*
	* @param applicationName the application name
	* @param statusId the status ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByApplicationNameStatusId(
		java.lang.String applicationName, java.lang.String statusId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByApplicationNameStatusId(applicationName, statusId);
	}

	/**
	* Returns the number of application statuses where applicationName = &#63; and statusId = &#63;.
	*
	* @param applicationName the application name
	* @param statusId the status ID
	* @return the number of matching application statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByApplicationNameStatusId(
		java.lang.String applicationName, java.lang.String statusId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByApplicationNameStatusId(applicationName, statusId);
	}

	/**
	* Caches the application status in the entity cache if it is enabled.
	*
	* @param applicationStatus the application status
	*/
	public static void cacheResult(
		es.davinciti.liferay.model.ApplicationStatus applicationStatus) {
		getPersistence().cacheResult(applicationStatus);
	}

	/**
	* Caches the application statuses in the entity cache if it is enabled.
	*
	* @param applicationStatuses the application statuses
	*/
	public static void cacheResult(
		java.util.List<es.davinciti.liferay.model.ApplicationStatus> applicationStatuses) {
		getPersistence().cacheResult(applicationStatuses);
	}

	/**
	* Creates a new application status with the primary key. Does not add the application status to the database.
	*
	* @param applicationStatusId the primary key for the new application status
	* @return the new application status
	*/
	public static es.davinciti.liferay.model.ApplicationStatus create(
		long applicationStatusId) {
		return getPersistence().create(applicationStatusId);
	}

	/**
	* Removes the application status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param applicationStatusId the primary key of the application status
	* @return the application status that was removed
	* @throws es.davinciti.liferay.NoSuchApplicationStatusException if a application status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ApplicationStatus remove(
		long applicationStatusId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchApplicationStatusException {
		return getPersistence().remove(applicationStatusId);
	}

	public static es.davinciti.liferay.model.ApplicationStatus updateImpl(
		es.davinciti.liferay.model.ApplicationStatus applicationStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(applicationStatus);
	}

	/**
	* Returns the application status with the primary key or throws a {@link es.davinciti.liferay.NoSuchApplicationStatusException} if it could not be found.
	*
	* @param applicationStatusId the primary key of the application status
	* @return the application status
	* @throws es.davinciti.liferay.NoSuchApplicationStatusException if a application status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ApplicationStatus findByPrimaryKey(
		long applicationStatusId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchApplicationStatusException {
		return getPersistence().findByPrimaryKey(applicationStatusId);
	}

	/**
	* Returns the application status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param applicationStatusId the primary key of the application status
	* @return the application status, or <code>null</code> if a application status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ApplicationStatus fetchByPrimaryKey(
		long applicationStatusId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(applicationStatusId);
	}

	/**
	* Returns all the application statuses.
	*
	* @return the application statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ApplicationStatus> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the application statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ApplicationStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of application statuses
	* @param end the upper bound of the range of application statuses (not inclusive)
	* @return the range of application statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ApplicationStatus> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the application statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ApplicationStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of application statuses
	* @param end the upper bound of the range of application statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of application statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ApplicationStatus> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the application statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of application statuses.
	*
	* @return the number of application statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ApplicationStatusPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ApplicationStatusPersistence)PortletBeanLocatorUtil.locate(es.davinciti.liferay.service.ClpSerializer.getServletContextName(),
					ApplicationStatusPersistence.class.getName());

			ReferenceRegistry.registerReference(ApplicationStatusUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ApplicationStatusPersistence persistence) {
	}

	private static ApplicationStatusPersistence _persistence;
}