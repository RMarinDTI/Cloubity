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
 * Provides a wrapper for {@link CalendarioLocalService}.
 *
 * @author Cmes
 * @see CalendarioLocalService
 * @generated
 */
public class CalendarioLocalServiceWrapper implements CalendarioLocalService,
	ServiceWrapper<CalendarioLocalService> {
	public CalendarioLocalServiceWrapper(
		CalendarioLocalService calendarioLocalService) {
		_calendarioLocalService = calendarioLocalService;
	}

	/**
	* Adds the calendario to the database. Also notifies the appropriate model listeners.
	*
	* @param calendario the calendario
	* @return the calendario that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.Calendario addCalendario(
		es.davinciti.liferay.model.Calendario calendario)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarioLocalService.addCalendario(calendario);
	}

	/**
	* Creates a new calendario with the primary key. Does not add the calendario to the database.
	*
	* @param calendarioId the primary key for the new calendario
	* @return the new calendario
	*/
	@Override
	public es.davinciti.liferay.model.Calendario createCalendario(
		long calendarioId) {
		return _calendarioLocalService.createCalendario(calendarioId);
	}

	/**
	* Deletes the calendario with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param calendarioId the primary key of the calendario
	* @return the calendario that was removed
	* @throws PortalException if a calendario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.Calendario deleteCalendario(
		long calendarioId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _calendarioLocalService.deleteCalendario(calendarioId);
	}

	/**
	* Deletes the calendario from the database. Also notifies the appropriate model listeners.
	*
	* @param calendario the calendario
	* @return the calendario that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.Calendario deleteCalendario(
		es.davinciti.liferay.model.Calendario calendario)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarioLocalService.deleteCalendario(calendario);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _calendarioLocalService.dynamicQuery();
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
		return _calendarioLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CalendarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _calendarioLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CalendarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _calendarioLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _calendarioLocalService.dynamicQueryCount(dynamicQuery);
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
		return _calendarioLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.davinciti.liferay.model.Calendario fetchCalendario(
		long calendarioId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarioLocalService.fetchCalendario(calendarioId);
	}

	/**
	* Returns the calendario with the primary key.
	*
	* @param calendarioId the primary key of the calendario
	* @return the calendario
	* @throws PortalException if a calendario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.Calendario getCalendario(
		long calendarioId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _calendarioLocalService.getCalendario(calendarioId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _calendarioLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<es.davinciti.liferay.model.Calendario> getCalendarios(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarioLocalService.getCalendarios(start, end);
	}

	/**
	* Returns the number of calendarios.
	*
	* @return the number of calendarios
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCalendariosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarioLocalService.getCalendariosCount();
	}

	/**
	* Updates the calendario in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param calendario the calendario
	* @return the calendario that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.Calendario updateCalendario(
		es.davinciti.liferay.model.Calendario calendario)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _calendarioLocalService.updateCalendario(calendario);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _calendarioLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_calendarioLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _calendarioLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.Calendario> findByCompanyIdUserIdYear(
		long companyId, long userId, int year) {
		return _calendarioLocalService.findByCompanyIdUserIdYear(companyId,
			userId, year);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CalendarioLocalService getWrappedCalendarioLocalService() {
		return _calendarioLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCalendarioLocalService(
		CalendarioLocalService calendarioLocalService) {
		_calendarioLocalService = calendarioLocalService;
	}

	@Override
	public CalendarioLocalService getWrappedService() {
		return _calendarioLocalService;
	}

	@Override
	public void setWrappedService(CalendarioLocalService calendarioLocalService) {
		_calendarioLocalService = calendarioLocalService;
	}

	private CalendarioLocalService _calendarioLocalService;
}