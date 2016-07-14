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
 * Provides a wrapper for {@link NotaGastoLocalService}.
 *
 * @author Cmes
 * @see NotaGastoLocalService
 * @generated
 */
public class NotaGastoLocalServiceWrapper implements NotaGastoLocalService,
	ServiceWrapper<NotaGastoLocalService> {
	public NotaGastoLocalServiceWrapper(
		NotaGastoLocalService notaGastoLocalService) {
		_notaGastoLocalService = notaGastoLocalService;
	}

	/**
	* Adds the nota gasto to the database. Also notifies the appropriate model listeners.
	*
	* @param notaGasto the nota gasto
	* @return the nota gasto that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.NotaGasto addNotaGasto(
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.addNotaGasto(notaGasto);
	}

	/**
	* Creates a new nota gasto with the primary key. Does not add the nota gasto to the database.
	*
	* @param notagastoId the primary key for the new nota gasto
	* @return the new nota gasto
	*/
	@Override
	public es.davinciti.liferay.model.NotaGasto createNotaGasto(
		long notagastoId) {
		return _notaGastoLocalService.createNotaGasto(notagastoId);
	}

	/**
	* Deletes the nota gasto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param notagastoId the primary key of the nota gasto
	* @return the nota gasto that was removed
	* @throws PortalException if a nota gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.NotaGasto deleteNotaGasto(
		long notagastoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.deleteNotaGasto(notagastoId);
	}

	/**
	* Deletes the nota gasto from the database. Also notifies the appropriate model listeners.
	*
	* @param notaGasto the nota gasto
	* @return the nota gasto that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.NotaGasto deleteNotaGasto(
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.deleteNotaGasto(notaGasto);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _notaGastoLocalService.dynamicQuery();
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
		return _notaGastoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _notaGastoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _notaGastoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _notaGastoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _notaGastoLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public es.davinciti.liferay.model.NotaGasto fetchNotaGasto(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.fetchNotaGasto(notagastoId);
	}

	/**
	* Returns the nota gasto with the primary key.
	*
	* @param notagastoId the primary key of the nota gasto
	* @return the nota gasto
	* @throws PortalException if a nota gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.NotaGasto getNotaGasto(long notagastoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.getNotaGasto(notagastoId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the nota gastos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nota gastos
	* @param end the upper bound of the range of nota gastos (not inclusive)
	* @return the range of nota gastos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.getNotaGastos(start, end);
	}

	/**
	* Returns the number of nota gastos.
	*
	* @return the number of nota gastos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getNotaGastosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.getNotaGastosCount();
	}

	/**
	* Updates the nota gasto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param notaGasto the nota gasto
	* @return the nota gasto that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.NotaGasto updateNotaGasto(
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.updateNotaGasto(notaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addHistoricoNotaNotaGasto(long historiconotaId, long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.addHistoricoNotaNotaGasto(historiconotaId,
			notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addHistoricoNotaNotaGasto(long historiconotaId,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.addHistoricoNotaNotaGasto(historiconotaId,
			notaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addHistoricoNotaNotaGastos(long historiconotaId,
		long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.addHistoricoNotaNotaGastos(historiconotaId,
			notagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addHistoricoNotaNotaGastos(long historiconotaId,
		java.util.List<es.davinciti.liferay.model.NotaGasto> NotaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.addHistoricoNotaNotaGastos(historiconotaId,
			NotaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearHistoricoNotaNotaGastos(long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.clearHistoricoNotaNotaGastos(historiconotaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteHistoricoNotaNotaGasto(long historiconotaId,
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.deleteHistoricoNotaNotaGasto(historiconotaId,
			notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteHistoricoNotaNotaGasto(long historiconotaId,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.deleteHistoricoNotaNotaGasto(historiconotaId,
			notaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteHistoricoNotaNotaGastos(long historiconotaId,
		long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.deleteHistoricoNotaNotaGastos(historiconotaId,
			notagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteHistoricoNotaNotaGastos(long historiconotaId,
		java.util.List<es.davinciti.liferay.model.NotaGasto> NotaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.deleteHistoricoNotaNotaGastos(historiconotaId,
			NotaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.NotaGasto> getHistoricoNotaNotaGastos(
		long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.getHistoricoNotaNotaGastos(historiconotaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.NotaGasto> getHistoricoNotaNotaGastos(
		long historiconotaId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.getHistoricoNotaNotaGastos(historiconotaId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.NotaGasto> getHistoricoNotaNotaGastos(
		long historiconotaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.getHistoricoNotaNotaGastos(historiconotaId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getHistoricoNotaNotaGastosCount(long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.getHistoricoNotaNotaGastosCount(historiconotaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasHistoricoNotaNotaGasto(long historiconotaId,
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.hasHistoricoNotaNotaGasto(historiconotaId,
			notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasHistoricoNotaNotaGastos(long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.hasHistoricoNotaNotaGastos(historiconotaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setHistoricoNotaNotaGastos(long historiconotaId,
		long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.setHistoricoNotaNotaGastos(historiconotaId,
			notagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoNotaGasto(long lineagastoId, long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.addLineaGastoNotaGasto(lineagastoId, notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoNotaGasto(long lineagastoId,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.addLineaGastoNotaGasto(lineagastoId, notaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoNotaGastos(long lineagastoId, long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.addLineaGastoNotaGastos(lineagastoId,
			notagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoNotaGastos(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.NotaGasto> NotaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.addLineaGastoNotaGastos(lineagastoId, NotaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearLineaGastoNotaGastos(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.clearLineaGastoNotaGastos(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoNotaGasto(long lineagastoId, long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.deleteLineaGastoNotaGasto(lineagastoId,
			notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoNotaGasto(long lineagastoId,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.deleteLineaGastoNotaGasto(lineagastoId, notaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoNotaGastos(long lineagastoId,
		long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.deleteLineaGastoNotaGastos(lineagastoId,
			notagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoNotaGastos(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.NotaGasto> NotaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.deleteLineaGastoNotaGastos(lineagastoId,
			NotaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.NotaGasto> getLineaGastoNotaGastos(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.getLineaGastoNotaGastos(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.NotaGasto> getLineaGastoNotaGastos(
		long lineagastoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.getLineaGastoNotaGastos(lineagastoId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.NotaGasto> getLineaGastoNotaGastos(
		long lineagastoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.getLineaGastoNotaGastos(lineagastoId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoNotaGastosCount(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.getLineaGastoNotaGastosCount(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoNotaGasto(long lineagastoId, long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.hasLineaGastoNotaGasto(lineagastoId,
			notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoNotaGastos(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.hasLineaGastoNotaGastos(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setLineaGastoNotaGastos(long lineagastoId, long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.setLineaGastoNotaGastos(lineagastoId,
			notagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addOrganizationSageCompanyNotaGasto(long orgsagecompanyId,
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.addOrganizationSageCompanyNotaGasto(orgsagecompanyId,
			notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addOrganizationSageCompanyNotaGasto(long orgsagecompanyId,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.addOrganizationSageCompanyNotaGasto(orgsagecompanyId,
			notaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addOrganizationSageCompanyNotaGastos(long orgsagecompanyId,
		long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.addOrganizationSageCompanyNotaGastos(orgsagecompanyId,
			notagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addOrganizationSageCompanyNotaGastos(long orgsagecompanyId,
		java.util.List<es.davinciti.liferay.model.NotaGasto> NotaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.addOrganizationSageCompanyNotaGastos(orgsagecompanyId,
			NotaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearOrganizationSageCompanyNotaGastos(long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.clearOrganizationSageCompanyNotaGastos(orgsagecompanyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteOrganizationSageCompanyNotaGasto(long orgsagecompanyId,
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.deleteOrganizationSageCompanyNotaGasto(orgsagecompanyId,
			notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteOrganizationSageCompanyNotaGasto(long orgsagecompanyId,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.deleteOrganizationSageCompanyNotaGasto(orgsagecompanyId,
			notaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteOrganizationSageCompanyNotaGastos(long orgsagecompanyId,
		long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.deleteOrganizationSageCompanyNotaGastos(orgsagecompanyId,
			notagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteOrganizationSageCompanyNotaGastos(long orgsagecompanyId,
		java.util.List<es.davinciti.liferay.model.NotaGasto> NotaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.deleteOrganizationSageCompanyNotaGastos(orgsagecompanyId,
			NotaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.NotaGasto> getOrganizationSageCompanyNotaGastos(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.getOrganizationSageCompanyNotaGastos(orgsagecompanyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.NotaGasto> getOrganizationSageCompanyNotaGastos(
		long orgsagecompanyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.getOrganizationSageCompanyNotaGastos(orgsagecompanyId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.NotaGasto> getOrganizationSageCompanyNotaGastos(
		long orgsagecompanyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.getOrganizationSageCompanyNotaGastos(orgsagecompanyId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOrganizationSageCompanyNotaGastosCount(long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.getOrganizationSageCompanyNotaGastosCount(orgsagecompanyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasOrganizationSageCompanyNotaGasto(long orgsagecompanyId,
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.hasOrganizationSageCompanyNotaGasto(orgsagecompanyId,
			notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasOrganizationSageCompanyNotaGastos(long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notaGastoLocalService.hasOrganizationSageCompanyNotaGastos(orgsagecompanyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setOrganizationSageCompanyNotaGastos(long orgsagecompanyId,
		long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notaGastoLocalService.setOrganizationSageCompanyNotaGastos(orgsagecompanyId,
			notagastoIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _notaGastoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_notaGastoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _notaGastoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> getOrganizationsSageCompanies(
		long notaGastoId) {
		return _notaGastoLocalService.getOrganizationsSageCompanies(notaGastoId);
	}

	@Override
	public java.lang.String getSageCompany(long notagastoId) {
		return _notaGastoLocalService.getSageCompany(notagastoId);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.NotaGasto> findByCompanyIdUserId(
		long companyId, long userId) {
		return _notaGastoLocalService.findByCompanyIdUserId(companyId, userId);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.NotaGasto> findByCompanyId(
		long companyId) {
		return _notaGastoLocalService.findByCompanyId(companyId);
	}

	@Override
	public void deleteNotaGastoLineas(long notagastoId) {
		_notaGastoLocalService.deleteNotaGastoLineas(notagastoId);
	}

	@Override
	public java.lang.String validateNotaGasto(long notagastoId, long configId,
		long userId, java.util.Locale locale) {
		return _notaGastoLocalService.validateNotaGasto(notagastoId, configId,
			userId, locale);
	}

	@Override
	public java.lang.String getSageEmployeeId(long userId) {
		return _notaGastoLocalService.getSageEmployeeId(userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public NotaGastoLocalService getWrappedNotaGastoLocalService() {
		return _notaGastoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedNotaGastoLocalService(
		NotaGastoLocalService notaGastoLocalService) {
		_notaGastoLocalService = notaGastoLocalService;
	}

	@Override
	public NotaGastoLocalService getWrappedService() {
		return _notaGastoLocalService;
	}

	@Override
	public void setWrappedService(NotaGastoLocalService notaGastoLocalService) {
		_notaGastoLocalService = notaGastoLocalService;
	}

	private NotaGastoLocalService _notaGastoLocalService;
}