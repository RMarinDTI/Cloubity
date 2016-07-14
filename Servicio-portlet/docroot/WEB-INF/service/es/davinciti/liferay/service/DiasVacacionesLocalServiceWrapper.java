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
 * Provides a wrapper for {@link DiasVacacionesLocalService}.
 *
 * @author Cmes
 * @see DiasVacacionesLocalService
 * @generated
 */
public class DiasVacacionesLocalServiceWrapper
	implements DiasVacacionesLocalService,
		ServiceWrapper<DiasVacacionesLocalService> {
	public DiasVacacionesLocalServiceWrapper(
		DiasVacacionesLocalService diasVacacionesLocalService) {
		_diasVacacionesLocalService = diasVacacionesLocalService;
	}

	/**
	* Adds the dias vacaciones to the database. Also notifies the appropriate model listeners.
	*
	* @param diasVacaciones the dias vacaciones
	* @return the dias vacaciones that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.DiasVacaciones addDiasVacaciones(
		es.davinciti.liferay.model.DiasVacaciones diasVacaciones)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _diasVacacionesLocalService.addDiasVacaciones(diasVacaciones);
	}

	/**
	* Creates a new dias vacaciones with the primary key. Does not add the dias vacaciones to the database.
	*
	* @param diasVacacionesId the primary key for the new dias vacaciones
	* @return the new dias vacaciones
	*/
	@Override
	public es.davinciti.liferay.model.DiasVacaciones createDiasVacaciones(
		long diasVacacionesId) {
		return _diasVacacionesLocalService.createDiasVacaciones(diasVacacionesId);
	}

	/**
	* Deletes the dias vacaciones with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param diasVacacionesId the primary key of the dias vacaciones
	* @return the dias vacaciones that was removed
	* @throws PortalException if a dias vacaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.DiasVacaciones deleteDiasVacaciones(
		long diasVacacionesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _diasVacacionesLocalService.deleteDiasVacaciones(diasVacacionesId);
	}

	/**
	* Deletes the dias vacaciones from the database. Also notifies the appropriate model listeners.
	*
	* @param diasVacaciones the dias vacaciones
	* @return the dias vacaciones that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.DiasVacaciones deleteDiasVacaciones(
		es.davinciti.liferay.model.DiasVacaciones diasVacaciones)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _diasVacacionesLocalService.deleteDiasVacaciones(diasVacaciones);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _diasVacacionesLocalService.dynamicQuery();
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
		return _diasVacacionesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _diasVacacionesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _diasVacacionesLocalService.dynamicQuery(dynamicQuery, start,
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
		return _diasVacacionesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _diasVacacionesLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.davinciti.liferay.model.DiasVacaciones fetchDiasVacaciones(
		long diasVacacionesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _diasVacacionesLocalService.fetchDiasVacaciones(diasVacacionesId);
	}

	/**
	* Returns the dias vacaciones with the primary key.
	*
	* @param diasVacacionesId the primary key of the dias vacaciones
	* @return the dias vacaciones
	* @throws PortalException if a dias vacaciones with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.DiasVacaciones getDiasVacaciones(
		long diasVacacionesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _diasVacacionesLocalService.getDiasVacaciones(diasVacacionesId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _diasVacacionesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dias vacacioneses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dias vacacioneses
	* @param end the upper bound of the range of dias vacacioneses (not inclusive)
	* @return the range of dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.DiasVacaciones> getDiasVacacioneses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _diasVacacionesLocalService.getDiasVacacioneses(start, end);
	}

	/**
	* Returns the number of dias vacacioneses.
	*
	* @return the number of dias vacacioneses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDiasVacacionesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _diasVacacionesLocalService.getDiasVacacionesesCount();
	}

	/**
	* Updates the dias vacaciones in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param diasVacaciones the dias vacaciones
	* @return the dias vacaciones that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.DiasVacaciones updateDiasVacaciones(
		es.davinciti.liferay.model.DiasVacaciones diasVacaciones)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _diasVacacionesLocalService.updateDiasVacaciones(diasVacaciones);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _diasVacacionesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_diasVacacionesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _diasVacacionesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.DiasVacaciones> findByCompanyIdUserIdYear(
		long companyId, long userId, int year) {
		return _diasVacacionesLocalService.findByCompanyIdUserIdYear(companyId,
			userId, year);
	}

	@Override
	public int getDiasDisponibles(long companyId, long userId, int year) {
		return _diasVacacionesLocalService.getDiasDisponibles(companyId,
			userId, year);
	}

	@Override
	public java.util.List<com.liferay.portal.model.User> getSearchUser(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _diasVacacionesLocalService.getSearchUser(name);
	}

	@Override
	public int getSearchUserCount(java.lang.String name) {
		return _diasVacacionesLocalService.getSearchUserCount(name);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DiasVacacionesLocalService getWrappedDiasVacacionesLocalService() {
		return _diasVacacionesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDiasVacacionesLocalService(
		DiasVacacionesLocalService diasVacacionesLocalService) {
		_diasVacacionesLocalService = diasVacacionesLocalService;
	}

	@Override
	public DiasVacacionesLocalService getWrappedService() {
		return _diasVacacionesLocalService;
	}

	@Override
	public void setWrappedService(
		DiasVacacionesLocalService diasVacacionesLocalService) {
		_diasVacacionesLocalService = diasVacacionesLocalService;
	}

	private DiasVacacionesLocalService _diasVacacionesLocalService;
}