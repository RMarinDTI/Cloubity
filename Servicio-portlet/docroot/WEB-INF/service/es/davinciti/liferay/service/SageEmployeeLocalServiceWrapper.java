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
 * Provides a wrapper for {@link SageEmployeeLocalService}.
 *
 * @author Cmes
 * @see SageEmployeeLocalService
 * @generated
 */
public class SageEmployeeLocalServiceWrapper implements SageEmployeeLocalService,
	ServiceWrapper<SageEmployeeLocalService> {
	public SageEmployeeLocalServiceWrapper(
		SageEmployeeLocalService sageEmployeeLocalService) {
		_sageEmployeeLocalService = sageEmployeeLocalService;
	}

	/**
	* Adds the sage employee to the database. Also notifies the appropriate model listeners.
	*
	* @param sageEmployee the sage employee
	* @return the sage employee that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.SageEmployee addSageEmployee(
		es.davinciti.liferay.model.SageEmployee sageEmployee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sageEmployeeLocalService.addSageEmployee(sageEmployee);
	}

	/**
	* Creates a new sage employee with the primary key. Does not add the sage employee to the database.
	*
	* @param sageEmployeeId the primary key for the new sage employee
	* @return the new sage employee
	*/
	@Override
	public es.davinciti.liferay.model.SageEmployee createSageEmployee(
		long sageEmployeeId) {
		return _sageEmployeeLocalService.createSageEmployee(sageEmployeeId);
	}

	/**
	* Deletes the sage employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sageEmployeeId the primary key of the sage employee
	* @return the sage employee that was removed
	* @throws PortalException if a sage employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.SageEmployee deleteSageEmployee(
		long sageEmployeeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sageEmployeeLocalService.deleteSageEmployee(sageEmployeeId);
	}

	/**
	* Deletes the sage employee from the database. Also notifies the appropriate model listeners.
	*
	* @param sageEmployee the sage employee
	* @return the sage employee that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.SageEmployee deleteSageEmployee(
		es.davinciti.liferay.model.SageEmployee sageEmployee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sageEmployeeLocalService.deleteSageEmployee(sageEmployee);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sageEmployeeLocalService.dynamicQuery();
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
		return _sageEmployeeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SageEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _sageEmployeeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SageEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _sageEmployeeLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _sageEmployeeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _sageEmployeeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.davinciti.liferay.model.SageEmployee fetchSageEmployee(
		long sageEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sageEmployeeLocalService.fetchSageEmployee(sageEmployeeId);
	}

	/**
	* Returns the sage employee with the primary key.
	*
	* @param sageEmployeeId the primary key of the sage employee
	* @return the sage employee
	* @throws PortalException if a sage employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.SageEmployee getSageEmployee(
		long sageEmployeeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sageEmployeeLocalService.getSageEmployee(sageEmployeeId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sageEmployeeLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<es.davinciti.liferay.model.SageEmployee> getSageEmployees(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sageEmployeeLocalService.getSageEmployees(start, end);
	}

	/**
	* Returns the number of sage employees.
	*
	* @return the number of sage employees
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSageEmployeesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sageEmployeeLocalService.getSageEmployeesCount();
	}

	/**
	* Updates the sage employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sageEmployee the sage employee
	* @return the sage employee that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.SageEmployee updateSageEmployee(
		es.davinciti.liferay.model.SageEmployee sageEmployee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sageEmployeeLocalService.updateSageEmployee(sageEmployee);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _sageEmployeeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sageEmployeeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sageEmployeeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.SageEmployee> findByUserId(
		long userId) {
		return _sageEmployeeLocalService.findByUserId(userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SageEmployeeLocalService getWrappedSageEmployeeLocalService() {
		return _sageEmployeeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSageEmployeeLocalService(
		SageEmployeeLocalService sageEmployeeLocalService) {
		_sageEmployeeLocalService = sageEmployeeLocalService;
	}

	@Override
	public SageEmployeeLocalService getWrappedService() {
		return _sageEmployeeLocalService;
	}

	@Override
	public void setWrappedService(
		SageEmployeeLocalService sageEmployeeLocalService) {
		_sageEmployeeLocalService = sageEmployeeLocalService;
	}

	private SageEmployeeLocalService _sageEmployeeLocalService;
}