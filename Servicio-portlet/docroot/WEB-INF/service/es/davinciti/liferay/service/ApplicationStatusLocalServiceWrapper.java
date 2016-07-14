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

package es.davinciti.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ApplicationStatusLocalService}.
 *
 * @author Cmes
 * @see ApplicationStatusLocalService
 * @generated
 */
public class ApplicationStatusLocalServiceWrapper
	implements ApplicationStatusLocalService,
		ServiceWrapper<ApplicationStatusLocalService> {
	public ApplicationStatusLocalServiceWrapper(
		ApplicationStatusLocalService applicationStatusLocalService) {
		_applicationStatusLocalService = applicationStatusLocalService;
	}

	/**
	* Adds the application status to the database. Also notifies the appropriate model listeners.
	*
	* @param applicationStatus the application status
	* @return the application status that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ApplicationStatus addApplicationStatus(
		es.davinciti.liferay.model.ApplicationStatus applicationStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applicationStatusLocalService.addApplicationStatus(applicationStatus);
	}

	/**
	* Creates a new application status with the primary key. Does not add the application status to the database.
	*
	* @param applicationStatusId the primary key for the new application status
	* @return the new application status
	*/
	@Override
	public es.davinciti.liferay.model.ApplicationStatus createApplicationStatus(
		long applicationStatusId) {
		return _applicationStatusLocalService.createApplicationStatus(applicationStatusId);
	}

	/**
	* Deletes the application status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param applicationStatusId the primary key of the application status
	* @return the application status that was removed
	* @throws PortalException if a application status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ApplicationStatus deleteApplicationStatus(
		long applicationStatusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _applicationStatusLocalService.deleteApplicationStatus(applicationStatusId);
	}

	/**
	* Deletes the application status from the database. Also notifies the appropriate model listeners.
	*
	* @param applicationStatus the application status
	* @return the application status that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ApplicationStatus deleteApplicationStatus(
		es.davinciti.liferay.model.ApplicationStatus applicationStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applicationStatusLocalService.deleteApplicationStatus(applicationStatus);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _applicationStatusLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applicationStatusLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ApplicationStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _applicationStatusLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ApplicationStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applicationStatusLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applicationStatusLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applicationStatusLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.davinciti.liferay.model.ApplicationStatus fetchApplicationStatus(
		long applicationStatusId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applicationStatusLocalService.fetchApplicationStatus(applicationStatusId);
	}

	/**
	* Returns the application status with the primary key.
	*
	* @param applicationStatusId the primary key of the application status
	* @return the application status
	* @throws PortalException if a application status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ApplicationStatus getApplicationStatus(
		long applicationStatusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _applicationStatusLocalService.getApplicationStatus(applicationStatusId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _applicationStatusLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<es.davinciti.liferay.model.ApplicationStatus> getApplicationStatuses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applicationStatusLocalService.getApplicationStatuses(start, end);
	}

	/**
	* Returns the number of application statuses.
	*
	* @return the number of application statuses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getApplicationStatusesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applicationStatusLocalService.getApplicationStatusesCount();
	}

	/**
	* Updates the application status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param applicationStatus the application status
	* @return the application status that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ApplicationStatus updateApplicationStatus(
		es.davinciti.liferay.model.ApplicationStatus applicationStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applicationStatusLocalService.updateApplicationStatus(applicationStatus);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _applicationStatusLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_applicationStatusLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _applicationStatusLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.ApplicationStatus> findByApplicationNameStatusId(
		java.lang.String appName, java.lang.String statusId) {
		return _applicationStatusLocalService.findByApplicationNameStatusId(appName,
			statusId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ApplicationStatusLocalService getWrappedApplicationStatusLocalService() {
		return _applicationStatusLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedApplicationStatusLocalService(
		ApplicationStatusLocalService applicationStatusLocalService) {
		_applicationStatusLocalService = applicationStatusLocalService;
	}

	@Override
	public ApplicationStatusLocalService getWrappedService() {
		return _applicationStatusLocalService;
	}

	@Override
	public void setWrappedService(
		ApplicationStatusLocalService applicationStatusLocalService) {
		_applicationStatusLocalService = applicationStatusLocalService;
	}

	private ApplicationStatusLocalService _applicationStatusLocalService;
}