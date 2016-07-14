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
 * Provides a wrapper for {@link TipoDiaCalendarLocalService}.
 *
 * @author Cmes
 * @see TipoDiaCalendarLocalService
 * @generated
 */
public class TipoDiaCalendarLocalServiceWrapper
	implements TipoDiaCalendarLocalService,
		ServiceWrapper<TipoDiaCalendarLocalService> {
	public TipoDiaCalendarLocalServiceWrapper(
		TipoDiaCalendarLocalService tipoDiaCalendarLocalService) {
		_tipoDiaCalendarLocalService = tipoDiaCalendarLocalService;
	}

	/**
	* Adds the tipo dia calendar to the database. Also notifies the appropriate model listeners.
	*
	* @param tipoDiaCalendar the tipo dia calendar
	* @return the tipo dia calendar that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.TipoDiaCalendar addTipoDiaCalendar(
		es.davinciti.liferay.model.TipoDiaCalendar tipoDiaCalendar)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDiaCalendarLocalService.addTipoDiaCalendar(tipoDiaCalendar);
	}

	/**
	* Creates a new tipo dia calendar with the primary key. Does not add the tipo dia calendar to the database.
	*
	* @param tipoDiaCalendarId the primary key for the new tipo dia calendar
	* @return the new tipo dia calendar
	*/
	@Override
	public es.davinciti.liferay.model.TipoDiaCalendar createTipoDiaCalendar(
		long tipoDiaCalendarId) {
		return _tipoDiaCalendarLocalService.createTipoDiaCalendar(tipoDiaCalendarId);
	}

	/**
	* Deletes the tipo dia calendar with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipoDiaCalendarId the primary key of the tipo dia calendar
	* @return the tipo dia calendar that was removed
	* @throws PortalException if a tipo dia calendar with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.TipoDiaCalendar deleteTipoDiaCalendar(
		long tipoDiaCalendarId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tipoDiaCalendarLocalService.deleteTipoDiaCalendar(tipoDiaCalendarId);
	}

	/**
	* Deletes the tipo dia calendar from the database. Also notifies the appropriate model listeners.
	*
	* @param tipoDiaCalendar the tipo dia calendar
	* @return the tipo dia calendar that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.TipoDiaCalendar deleteTipoDiaCalendar(
		es.davinciti.liferay.model.TipoDiaCalendar tipoDiaCalendar)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDiaCalendarLocalService.deleteTipoDiaCalendar(tipoDiaCalendar);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tipoDiaCalendarLocalService.dynamicQuery();
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
		return _tipoDiaCalendarLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.TipoDiaCalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tipoDiaCalendarLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.TipoDiaCalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tipoDiaCalendarLocalService.dynamicQuery(dynamicQuery, start,
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
		return _tipoDiaCalendarLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tipoDiaCalendarLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.davinciti.liferay.model.TipoDiaCalendar fetchTipoDiaCalendar(
		long tipoDiaCalendarId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDiaCalendarLocalService.fetchTipoDiaCalendar(tipoDiaCalendarId);
	}

	/**
	* Returns the tipo dia calendar with the primary key.
	*
	* @param tipoDiaCalendarId the primary key of the tipo dia calendar
	* @return the tipo dia calendar
	* @throws PortalException if a tipo dia calendar with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.TipoDiaCalendar getTipoDiaCalendar(
		long tipoDiaCalendarId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tipoDiaCalendarLocalService.getTipoDiaCalendar(tipoDiaCalendarId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tipoDiaCalendarLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tipo dia calendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.TipoDiaCalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipo dia calendars
	* @param end the upper bound of the range of tipo dia calendars (not inclusive)
	* @return the range of tipo dia calendars
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.TipoDiaCalendar> getTipoDiaCalendars(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDiaCalendarLocalService.getTipoDiaCalendars(start, end);
	}

	/**
	* Returns the number of tipo dia calendars.
	*
	* @return the number of tipo dia calendars
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTipoDiaCalendarsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDiaCalendarLocalService.getTipoDiaCalendarsCount();
	}

	/**
	* Updates the tipo dia calendar in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tipoDiaCalendar the tipo dia calendar
	* @return the tipo dia calendar that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.TipoDiaCalendar updateTipoDiaCalendar(
		es.davinciti.liferay.model.TipoDiaCalendar tipoDiaCalendar)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDiaCalendarLocalService.updateTipoDiaCalendar(tipoDiaCalendar);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tipoDiaCalendarLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tipoDiaCalendarLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tipoDiaCalendarLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.TipoDiaCalendar> findByDescripcion(
		java.lang.String descripcion) {
		return _tipoDiaCalendarLocalService.findByDescripcion(descripcion);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TipoDiaCalendarLocalService getWrappedTipoDiaCalendarLocalService() {
		return _tipoDiaCalendarLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTipoDiaCalendarLocalService(
		TipoDiaCalendarLocalService tipoDiaCalendarLocalService) {
		_tipoDiaCalendarLocalService = tipoDiaCalendarLocalService;
	}

	@Override
	public TipoDiaCalendarLocalService getWrappedService() {
		return _tipoDiaCalendarLocalService;
	}

	@Override
	public void setWrappedService(
		TipoDiaCalendarLocalService tipoDiaCalendarLocalService) {
		_tipoDiaCalendarLocalService = tipoDiaCalendarLocalService;
	}

	private TipoDiaCalendarLocalService _tipoDiaCalendarLocalService;
}