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
 * Provides a wrapper for {@link HistoricoNotaLocalService}.
 *
 * @author Cmes
 * @see HistoricoNotaLocalService
 * @generated
 */
public class HistoricoNotaLocalServiceWrapper
	implements HistoricoNotaLocalService,
		ServiceWrapper<HistoricoNotaLocalService> {
	public HistoricoNotaLocalServiceWrapper(
		HistoricoNotaLocalService historicoNotaLocalService) {
		_historicoNotaLocalService = historicoNotaLocalService;
	}

	/**
	* Adds the historico nota to the database. Also notifies the appropriate model listeners.
	*
	* @param historicoNota the historico nota
	* @return the historico nota that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.HistoricoNota addHistoricoNota(
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historicoNotaLocalService.addHistoricoNota(historicoNota);
	}

	/**
	* Creates a new historico nota with the primary key. Does not add the historico nota to the database.
	*
	* @param historiconotaId the primary key for the new historico nota
	* @return the new historico nota
	*/
	@Override
	public es.davinciti.liferay.model.HistoricoNota createHistoricoNota(
		long historiconotaId) {
		return _historicoNotaLocalService.createHistoricoNota(historiconotaId);
	}

	/**
	* Deletes the historico nota with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param historiconotaId the primary key of the historico nota
	* @return the historico nota that was removed
	* @throws PortalException if a historico nota with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.HistoricoNota deleteHistoricoNota(
		long historiconotaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _historicoNotaLocalService.deleteHistoricoNota(historiconotaId);
	}

	/**
	* Deletes the historico nota from the database. Also notifies the appropriate model listeners.
	*
	* @param historicoNota the historico nota
	* @return the historico nota that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.HistoricoNota deleteHistoricoNota(
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historicoNotaLocalService.deleteHistoricoNota(historicoNota);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _historicoNotaLocalService.dynamicQuery();
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
		return _historicoNotaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.HistoricoNotaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _historicoNotaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.HistoricoNotaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _historicoNotaLocalService.dynamicQuery(dynamicQuery, start,
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
		return _historicoNotaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _historicoNotaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.davinciti.liferay.model.HistoricoNota fetchHistoricoNota(
		long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historicoNotaLocalService.fetchHistoricoNota(historiconotaId);
	}

	/**
	* Returns the historico nota with the primary key.
	*
	* @param historiconotaId the primary key of the historico nota
	* @return the historico nota
	* @throws PortalException if a historico nota with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.HistoricoNota getHistoricoNota(
		long historiconotaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _historicoNotaLocalService.getHistoricoNota(historiconotaId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _historicoNotaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the historico notas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.HistoricoNotaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of historico notas
	* @param end the upper bound of the range of historico notas (not inclusive)
	* @return the range of historico notas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.HistoricoNota> getHistoricoNotas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historicoNotaLocalService.getHistoricoNotas(start, end);
	}

	/**
	* Returns the number of historico notas.
	*
	* @return the number of historico notas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getHistoricoNotasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historicoNotaLocalService.getHistoricoNotasCount();
	}

	/**
	* Updates the historico nota in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param historicoNota the historico nota
	* @return the historico nota that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.HistoricoNota updateHistoricoNota(
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historicoNotaLocalService.updateHistoricoNota(historicoNota);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addNotaGastoHistoricoNota(long notagastoId, long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_historicoNotaLocalService.addNotaGastoHistoricoNota(notagastoId,
			historiconotaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addNotaGastoHistoricoNota(long notagastoId,
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws com.liferay.portal.kernel.exception.SystemException {
		_historicoNotaLocalService.addNotaGastoHistoricoNota(notagastoId,
			historicoNota);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addNotaGastoHistoricoNotas(long notagastoId,
		long[] historiconotaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_historicoNotaLocalService.addNotaGastoHistoricoNotas(notagastoId,
			historiconotaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addNotaGastoHistoricoNotas(long notagastoId,
		java.util.List<es.davinciti.liferay.model.HistoricoNota> HistoricoNotas)
		throws com.liferay.portal.kernel.exception.SystemException {
		_historicoNotaLocalService.addNotaGastoHistoricoNotas(notagastoId,
			HistoricoNotas);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearNotaGastoHistoricoNotas(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_historicoNotaLocalService.clearNotaGastoHistoricoNotas(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteNotaGastoHistoricoNota(long notagastoId,
		long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_historicoNotaLocalService.deleteNotaGastoHistoricoNota(notagastoId,
			historiconotaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteNotaGastoHistoricoNota(long notagastoId,
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws com.liferay.portal.kernel.exception.SystemException {
		_historicoNotaLocalService.deleteNotaGastoHistoricoNota(notagastoId,
			historicoNota);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteNotaGastoHistoricoNotas(long notagastoId,
		long[] historiconotaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_historicoNotaLocalService.deleteNotaGastoHistoricoNotas(notagastoId,
			historiconotaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteNotaGastoHistoricoNotas(long notagastoId,
		java.util.List<es.davinciti.liferay.model.HistoricoNota> HistoricoNotas)
		throws com.liferay.portal.kernel.exception.SystemException {
		_historicoNotaLocalService.deleteNotaGastoHistoricoNotas(notagastoId,
			HistoricoNotas);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.HistoricoNota> getNotaGastoHistoricoNotas(
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historicoNotaLocalService.getNotaGastoHistoricoNotas(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.HistoricoNota> getNotaGastoHistoricoNotas(
		long notagastoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historicoNotaLocalService.getNotaGastoHistoricoNotas(notagastoId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.HistoricoNota> getNotaGastoHistoricoNotas(
		long notagastoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historicoNotaLocalService.getNotaGastoHistoricoNotas(notagastoId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getNotaGastoHistoricoNotasCount(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historicoNotaLocalService.getNotaGastoHistoricoNotasCount(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasNotaGastoHistoricoNota(long notagastoId,
		long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historicoNotaLocalService.hasNotaGastoHistoricoNota(notagastoId,
			historiconotaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasNotaGastoHistoricoNotas(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historicoNotaLocalService.hasNotaGastoHistoricoNotas(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setNotaGastoHistoricoNotas(long notagastoId,
		long[] historiconotaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_historicoNotaLocalService.setNotaGastoHistoricoNotas(notagastoId,
			historiconotaIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _historicoNotaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_historicoNotaLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _historicoNotaLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public HistoricoNotaLocalService getWrappedHistoricoNotaLocalService() {
		return _historicoNotaLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedHistoricoNotaLocalService(
		HistoricoNotaLocalService historicoNotaLocalService) {
		_historicoNotaLocalService = historicoNotaLocalService;
	}

	@Override
	public HistoricoNotaLocalService getWrappedService() {
		return _historicoNotaLocalService;
	}

	@Override
	public void setWrappedService(
		HistoricoNotaLocalService historicoNotaLocalService) {
		_historicoNotaLocalService = historicoNotaLocalService;
	}

	private HistoricoNotaLocalService _historicoNotaLocalService;
}