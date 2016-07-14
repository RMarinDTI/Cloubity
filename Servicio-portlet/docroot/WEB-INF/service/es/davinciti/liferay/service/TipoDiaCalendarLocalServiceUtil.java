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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for TipoDiaCalendar. This utility wraps
 * {@link es.davinciti.liferay.service.impl.TipoDiaCalendarLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Cmes
 * @see TipoDiaCalendarLocalService
 * @see es.davinciti.liferay.service.base.TipoDiaCalendarLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.impl.TipoDiaCalendarLocalServiceImpl
 * @generated
 */
public class TipoDiaCalendarLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.davinciti.liferay.service.impl.TipoDiaCalendarLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the tipo dia calendar to the database. Also notifies the appropriate model listeners.
	*
	* @param tipoDiaCalendar the tipo dia calendar
	* @return the tipo dia calendar that was added
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.TipoDiaCalendar addTipoDiaCalendar(
		es.davinciti.liferay.model.TipoDiaCalendar tipoDiaCalendar)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTipoDiaCalendar(tipoDiaCalendar);
	}

	/**
	* Creates a new tipo dia calendar with the primary key. Does not add the tipo dia calendar to the database.
	*
	* @param tipoDiaCalendarId the primary key for the new tipo dia calendar
	* @return the new tipo dia calendar
	*/
	public static es.davinciti.liferay.model.TipoDiaCalendar createTipoDiaCalendar(
		long tipoDiaCalendarId) {
		return getService().createTipoDiaCalendar(tipoDiaCalendarId);
	}

	/**
	* Deletes the tipo dia calendar with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipoDiaCalendarId the primary key of the tipo dia calendar
	* @return the tipo dia calendar that was removed
	* @throws PortalException if a tipo dia calendar with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.TipoDiaCalendar deleteTipoDiaCalendar(
		long tipoDiaCalendarId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTipoDiaCalendar(tipoDiaCalendarId);
	}

	/**
	* Deletes the tipo dia calendar from the database. Also notifies the appropriate model listeners.
	*
	* @param tipoDiaCalendar the tipo dia calendar
	* @return the tipo dia calendar that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.TipoDiaCalendar deleteTipoDiaCalendar(
		es.davinciti.liferay.model.TipoDiaCalendar tipoDiaCalendar)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTipoDiaCalendar(tipoDiaCalendar);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static es.davinciti.liferay.model.TipoDiaCalendar fetchTipoDiaCalendar(
		long tipoDiaCalendarId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTipoDiaCalendar(tipoDiaCalendarId);
	}

	/**
	* Returns the tipo dia calendar with the primary key.
	*
	* @param tipoDiaCalendarId the primary key of the tipo dia calendar
	* @return the tipo dia calendar
	* @throws PortalException if a tipo dia calendar with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.TipoDiaCalendar getTipoDiaCalendar(
		long tipoDiaCalendarId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTipoDiaCalendar(tipoDiaCalendarId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<es.davinciti.liferay.model.TipoDiaCalendar> getTipoDiaCalendars(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTipoDiaCalendars(start, end);
	}

	/**
	* Returns the number of tipo dia calendars.
	*
	* @return the number of tipo dia calendars
	* @throws SystemException if a system exception occurred
	*/
	public static int getTipoDiaCalendarsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTipoDiaCalendarsCount();
	}

	/**
	* Updates the tipo dia calendar in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tipoDiaCalendar the tipo dia calendar
	* @return the tipo dia calendar that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.TipoDiaCalendar updateTipoDiaCalendar(
		es.davinciti.liferay.model.TipoDiaCalendar tipoDiaCalendar)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTipoDiaCalendar(tipoDiaCalendar);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<es.davinciti.liferay.model.TipoDiaCalendar> findByDescripcion(
		java.lang.String descripcion) {
		return getService().findByDescripcion(descripcion);
	}

	public static void clearService() {
		_service = null;
	}

	public static TipoDiaCalendarLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TipoDiaCalendarLocalService.class.getName());

			if (invokableLocalService instanceof TipoDiaCalendarLocalService) {
				_service = (TipoDiaCalendarLocalService)invokableLocalService;
			}
			else {
				_service = new TipoDiaCalendarLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(TipoDiaCalendarLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(TipoDiaCalendarLocalService service) {
	}

	private static TipoDiaCalendarLocalService _service;
}