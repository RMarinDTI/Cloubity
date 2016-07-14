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
 * Provides a wrapper for {@link SapEmployeeLocalService}.
 *
 * @author Cmes
 * @see SapEmployeeLocalService
 * @generated
 */
public class SapEmployeeLocalServiceWrapper implements SapEmployeeLocalService,
	ServiceWrapper<SapEmployeeLocalService> {
	public SapEmployeeLocalServiceWrapper(
		SapEmployeeLocalService sapEmployeeLocalService) {
		_sapEmployeeLocalService = sapEmployeeLocalService;
	}

	/**
	* Adds the sap employee to the database. Also notifies the appropriate model listeners.
	*
	* @param sapEmployee the sap employee
	* @return the sap employee that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.SapEmployee addSapEmployee(
		es.davinciti.liferay.model.SapEmployee sapEmployee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sapEmployeeLocalService.addSapEmployee(sapEmployee);
	}

	/**
	* Creates a new sap employee with the primary key. Does not add the sap employee to the database.
	*
	* @param sapEmployeeId the primary key for the new sap employee
	* @return the new sap employee
	*/
	@Override
	public es.davinciti.liferay.model.SapEmployee createSapEmployee(
		long sapEmployeeId) {
		return _sapEmployeeLocalService.createSapEmployee(sapEmployeeId);
	}

	/**
	* Deletes the sap employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sapEmployeeId the primary key of the sap employee
	* @return the sap employee that was removed
	* @throws PortalException if a sap employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.SapEmployee deleteSapEmployee(
		long sapEmployeeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sapEmployeeLocalService.deleteSapEmployee(sapEmployeeId);
	}

	/**
	* Deletes the sap employee from the database. Also notifies the appropriate model listeners.
	*
	* @param sapEmployee the sap employee
	* @return the sap employee that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.SapEmployee deleteSapEmployee(
		es.davinciti.liferay.model.SapEmployee sapEmployee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sapEmployeeLocalService.deleteSapEmployee(sapEmployee);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sapEmployeeLocalService.dynamicQuery();
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
		return _sapEmployeeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SapEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _sapEmployeeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SapEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _sapEmployeeLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _sapEmployeeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _sapEmployeeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.davinciti.liferay.model.SapEmployee fetchSapEmployee(
		long sapEmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sapEmployeeLocalService.fetchSapEmployee(sapEmployeeId);
	}

	/**
	* Returns the sap employee with the primary key.
	*
	* @param sapEmployeeId the primary key of the sap employee
	* @return the sap employee
	* @throws PortalException if a sap employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.SapEmployee getSapEmployee(
		long sapEmployeeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sapEmployeeLocalService.getSapEmployee(sapEmployeeId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sapEmployeeLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<es.davinciti.liferay.model.SapEmployee> getSapEmployees(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sapEmployeeLocalService.getSapEmployees(start, end);
	}

	/**
	* Returns the number of sap employees.
	*
	* @return the number of sap employees
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSapEmployeesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sapEmployeeLocalService.getSapEmployeesCount();
	}

	/**
	* Updates the sap employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sapEmployee the sap employee
	* @return the sap employee that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.SapEmployee updateSapEmployee(
		es.davinciti.liferay.model.SapEmployee sapEmployee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sapEmployeeLocalService.updateSapEmployee(sapEmployee);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _sapEmployeeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sapEmployeeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sapEmployeeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SapEmployeeLocalService getWrappedSapEmployeeLocalService() {
		return _sapEmployeeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSapEmployeeLocalService(
		SapEmployeeLocalService sapEmployeeLocalService) {
		_sapEmployeeLocalService = sapEmployeeLocalService;
	}

	@Override
	public SapEmployeeLocalService getWrappedService() {
		return _sapEmployeeLocalService;
	}

	@Override
	public void setWrappedService(
		SapEmployeeLocalService sapEmployeeLocalService) {
		_sapEmployeeLocalService = sapEmployeeLocalService;
	}

	private SapEmployeeLocalService _sapEmployeeLocalService;
}