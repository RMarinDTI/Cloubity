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
 * Provides a wrapper for {@link LineaGastoLocalService}.
 *
 * @author Cmes
 * @see LineaGastoLocalService
 * @generated
 */
public class LineaGastoLocalServiceWrapper implements LineaGastoLocalService,
	ServiceWrapper<LineaGastoLocalService> {
	public LineaGastoLocalServiceWrapper(
		LineaGastoLocalService lineaGastoLocalService) {
		_lineaGastoLocalService = lineaGastoLocalService;
	}

	/**
	* Adds the linea gasto to the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGasto the linea gasto
	* @return the linea gasto that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGasto addLineaGasto(
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.addLineaGasto(lineaGasto);
	}

	/**
	* Creates a new linea gasto with the primary key. Does not add the linea gasto to the database.
	*
	* @param lineagastoId the primary key for the new linea gasto
	* @return the new linea gasto
	*/
	@Override
	public es.davinciti.liferay.model.LineaGasto createLineaGasto(
		long lineagastoId) {
		return _lineaGastoLocalService.createLineaGasto(lineagastoId);
	}

	/**
	* Deletes the linea gasto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lineagastoId the primary key of the linea gasto
	* @return the linea gasto that was removed
	* @throws PortalException if a linea gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGasto deleteLineaGasto(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.deleteLineaGasto(lineagastoId);
	}

	/**
	* Deletes the linea gasto from the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGasto the linea gasto
	* @return the linea gasto that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGasto deleteLineaGasto(
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.deleteLineaGasto(lineaGasto);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _lineaGastoLocalService.dynamicQuery();
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
		return _lineaGastoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _lineaGastoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _lineaGastoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _lineaGastoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _lineaGastoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.davinciti.liferay.model.LineaGasto fetchLineaGasto(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.fetchLineaGasto(lineagastoId);
	}

	/**
	* Returns the linea gasto with the primary key.
	*
	* @param lineagastoId the primary key of the linea gasto
	* @return the linea gasto
	* @throws PortalException if a linea gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGasto getLineaGasto(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGasto(lineagastoId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the linea gastos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @return the range of linea gastos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastos(start, end);
	}

	/**
	* Returns the number of linea gastos.
	*
	* @return the number of linea gastos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastosCount();
	}

	/**
	* Updates the linea gasto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lineaGasto the linea gasto
	* @return the linea gasto that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGasto updateLineaGasto(
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.updateLineaGasto(lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addNotaGastoLineaGasto(long notagastoId, long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addNotaGastoLineaGasto(notagastoId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addNotaGastoLineaGasto(long notagastoId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addNotaGastoLineaGasto(notagastoId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addNotaGastoLineaGastos(long notagastoId, long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addNotaGastoLineaGastos(notagastoId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addNotaGastoLineaGastos(long notagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addNotaGastoLineaGastos(notagastoId, LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearNotaGastoLineaGastos(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.clearNotaGastoLineaGastos(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteNotaGastoLineaGasto(long notagastoId, long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteNotaGastoLineaGasto(notagastoId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteNotaGastoLineaGasto(long notagastoId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteNotaGastoLineaGasto(notagastoId,
			lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteNotaGastoLineaGastos(long notagastoId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteNotaGastoLineaGastos(notagastoId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteNotaGastoLineaGastos(long notagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteNotaGastoLineaGastos(notagastoId,
			LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getNotaGastoLineaGastos(
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getNotaGastoLineaGastos(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getNotaGastoLineaGastos(
		long notagastoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getNotaGastoLineaGastos(notagastoId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getNotaGastoLineaGastos(
		long notagastoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getNotaGastoLineaGastos(notagastoId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getNotaGastoLineaGastosCount(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getNotaGastoLineaGastosCount(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasNotaGastoLineaGasto(long notagastoId, long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.hasNotaGastoLineaGasto(notagastoId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasNotaGastoLineaGastos(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.hasNotaGastoLineaGastos(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setNotaGastoLineaGastos(long notagastoId, long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.setNotaGastoLineaGastos(notagastoId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoPayModeLineaGasto(long paymodeId, long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoPayModeLineaGasto(paymodeId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoPayModeLineaGasto(long paymodeId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoPayModeLineaGasto(paymodeId,
			lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoPayModeLineaGastos(long paymodeId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoPayModeLineaGastos(paymodeId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoPayModeLineaGastos(long paymodeId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoPayModeLineaGastos(paymodeId,
			LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearLineaGastoPayModeLineaGastos(long paymodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.clearLineaGastoPayModeLineaGastos(paymodeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoPayModeLineaGasto(long paymodeId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoPayModeLineaGasto(paymodeId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoPayModeLineaGasto(long paymodeId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoPayModeLineaGasto(paymodeId,
			lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoPayModeLineaGastos(long paymodeId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoPayModeLineaGastos(paymodeId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoPayModeLineaGastos(long paymodeId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoPayModeLineaGastos(paymodeId,
			LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoPayModeLineaGastos(
		long paymodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoPayModeLineaGastos(paymodeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoPayModeLineaGastos(
		long paymodeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoPayModeLineaGastos(paymodeId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoPayModeLineaGastos(
		long paymodeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoPayModeLineaGastos(paymodeId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoPayModeLineaGastosCount(long paymodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoPayModeLineaGastosCount(paymodeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoPayModeLineaGasto(long paymodeId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.hasLineaGastoPayModeLineaGasto(paymodeId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoPayModeLineaGastos(long paymodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.hasLineaGastoPayModeLineaGastos(paymodeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setLineaGastoPayModeLineaGastos(long paymodeId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.setLineaGastoPayModeLineaGastos(paymodeId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addCurrencyLineaGasto(long currencyId, long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addCurrencyLineaGasto(currencyId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addCurrencyLineaGasto(long currencyId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addCurrencyLineaGasto(currencyId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addCurrencyLineaGastos(long currencyId, long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addCurrencyLineaGastos(currencyId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addCurrencyLineaGastos(long currencyId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addCurrencyLineaGastos(currencyId, LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearCurrencyLineaGastos(long currencyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.clearCurrencyLineaGastos(currencyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteCurrencyLineaGasto(long currencyId, long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteCurrencyLineaGasto(currencyId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteCurrencyLineaGasto(long currencyId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteCurrencyLineaGasto(currencyId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteCurrencyLineaGastos(long currencyId, long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteCurrencyLineaGastos(currencyId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteCurrencyLineaGastos(long currencyId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteCurrencyLineaGastos(currencyId,
			LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getCurrencyLineaGastos(
		long currencyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getCurrencyLineaGastos(currencyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getCurrencyLineaGastos(
		long currencyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getCurrencyLineaGastos(currencyId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getCurrencyLineaGastos(
		long currencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getCurrencyLineaGastos(currencyId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCurrencyLineaGastosCount(long currencyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getCurrencyLineaGastosCount(currencyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasCurrencyLineaGasto(long currencyId, long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.hasCurrencyLineaGasto(currencyId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasCurrencyLineaGastos(long currencyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.hasCurrencyLineaGastos(currencyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setCurrencyLineaGastos(long currencyId, long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.setCurrencyLineaGastos(currencyId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoFamiliaLineaGasto(long familiaId, long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoFamiliaLineaGasto(familiaId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoFamiliaLineaGasto(long familiaId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoFamiliaLineaGasto(familiaId,
			lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoFamiliaLineaGastos(long familiaId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoFamiliaLineaGastos(familiaId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoFamiliaLineaGastos(long familiaId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoFamiliaLineaGastos(familiaId,
			LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearLineaGastoFamiliaLineaGastos(long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.clearLineaGastoFamiliaLineaGastos(familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoFamiliaLineaGasto(long familiaId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoFamiliaLineaGasto(familiaId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoFamiliaLineaGasto(long familiaId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoFamiliaLineaGasto(familiaId,
			lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoFamiliaLineaGastos(long familiaId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoFamiliaLineaGastos(familiaId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoFamiliaLineaGastos(long familiaId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoFamiliaLineaGastos(familiaId,
			LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoFamiliaLineaGastos(
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoFamiliaLineaGastos(familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoFamiliaLineaGastos(
		long familiaId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoFamiliaLineaGastos(familiaId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoFamiliaLineaGastos(
		long familiaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoFamiliaLineaGastos(familiaId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoFamiliaLineaGastosCount(long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoFamiliaLineaGastosCount(familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoFamiliaLineaGasto(long familiaId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.hasLineaGastoFamiliaLineaGasto(familiaId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoFamiliaLineaGastos(long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.hasLineaGastoFamiliaLineaGastos(familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setLineaGastoFamiliaLineaGastos(long familiaId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.setLineaGastoFamiliaLineaGastos(familiaId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoCategoriaLineaGasto(long categoriaId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoCategoriaLineaGasto(categoriaId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoCategoriaLineaGasto(long categoriaId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoCategoriaLineaGasto(categoriaId,
			lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoCategoriaLineaGastos(long categoriaId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoCategoriaLineaGastos(categoriaId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoCategoriaLineaGastos(long categoriaId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoCategoriaLineaGastos(categoriaId,
			LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearLineaGastoCategoriaLineaGastos(long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.clearLineaGastoCategoriaLineaGastos(categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoCategoriaLineaGasto(long categoriaId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoCategoriaLineaGasto(categoriaId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoCategoriaLineaGasto(long categoriaId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoCategoriaLineaGasto(categoriaId,
			lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoCategoriaLineaGastos(long categoriaId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoCategoriaLineaGastos(categoriaId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoCategoriaLineaGastos(long categoriaId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoCategoriaLineaGastos(categoriaId,
			LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoCategoriaLineaGastos(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoCategoriaLineaGastos(categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoCategoriaLineaGastos(
		long categoriaId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoCategoriaLineaGastos(categoriaId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoCategoriaLineaGastos(
		long categoriaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoCategoriaLineaGastos(categoriaId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoCategoriaLineaGastosCount(long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoCategoriaLineaGastosCount(categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoCategoriaLineaGasto(long categoriaId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.hasLineaGastoCategoriaLineaGasto(categoriaId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoCategoriaLineaGastos(long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.hasLineaGastoCategoriaLineaGastos(categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setLineaGastoCategoriaLineaGastos(long categoriaId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.setLineaGastoCategoriaLineaGastos(categoriaId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoClienteLineaGasto(long clienteId, long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoClienteLineaGasto(clienteId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoClienteLineaGasto(long clienteId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoClienteLineaGasto(clienteId,
			lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoClienteLineaGastos(long clienteId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoClienteLineaGastos(clienteId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoClienteLineaGastos(long clienteId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoClienteLineaGastos(clienteId,
			LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearLineaGastoClienteLineaGastos(long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.clearLineaGastoClienteLineaGastos(clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoClienteLineaGasto(long clienteId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoClienteLineaGasto(clienteId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoClienteLineaGasto(long clienteId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoClienteLineaGasto(clienteId,
			lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoClienteLineaGastos(long clienteId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoClienteLineaGastos(clienteId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoClienteLineaGastos(long clienteId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoClienteLineaGastos(clienteId,
			LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoClienteLineaGastos(
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoClienteLineaGastos(clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoClienteLineaGastos(
		long clienteId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoClienteLineaGastos(clienteId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoClienteLineaGastos(
		long clienteId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoClienteLineaGastos(clienteId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoClienteLineaGastosCount(long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoClienteLineaGastosCount(clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoClienteLineaGasto(long clienteId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.hasLineaGastoClienteLineaGasto(clienteId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoClienteLineaGastos(long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.hasLineaGastoClienteLineaGastos(clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setLineaGastoClienteLineaGastos(long clienteId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.setLineaGastoClienteLineaGastos(clienteId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoProyectoLineaGasto(long proyectoId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoProyectoLineaGasto(proyectoId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoProyectoLineaGasto(long proyectoId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoProyectoLineaGasto(proyectoId,
			lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoProyectoLineaGastos(long proyectoId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoProyectoLineaGastos(proyectoId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoProyectoLineaGastos(long proyectoId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.addLineaGastoProyectoLineaGastos(proyectoId,
			LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearLineaGastoProyectoLineaGastos(long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.clearLineaGastoProyectoLineaGastos(proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoProyectoLineaGasto(long proyectoId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoProyectoLineaGasto(proyectoId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoProyectoLineaGasto(long proyectoId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoProyectoLineaGasto(proyectoId,
			lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoProyectoLineaGastos(long proyectoId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoProyectoLineaGastos(proyectoId,
			lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoProyectoLineaGastos(long proyectoId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.deleteLineaGastoProyectoLineaGastos(proyectoId,
			LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoProyectoLineaGastos(
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoProyectoLineaGastos(proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoProyectoLineaGastos(
		long proyectoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoProyectoLineaGastos(proyectoId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoProyectoLineaGastos(
		long proyectoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoProyectoLineaGastos(proyectoId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoProyectoLineaGastosCount(long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.getLineaGastoProyectoLineaGastosCount(proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoProyectoLineaGasto(long proyectoId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.hasLineaGastoProyectoLineaGasto(proyectoId,
			lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoProyectoLineaGastos(long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoLocalService.hasLineaGastoProyectoLineaGastos(proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setLineaGastoProyectoLineaGastos(long proyectoId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoLocalService.setLineaGastoProyectoLineaGastos(proyectoId,
			lineagastoIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _lineaGastoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_lineaGastoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lineaGastoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> findByDate(
		java.lang.String date) {
		return _lineaGastoLocalService.findByDate(date);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGasto> findByNotaGastoCategoryDate(
		long notagastoId, long lineagastoId) {
		return _lineaGastoLocalService.findByNotaGastoCategoryDate(notagastoId,
			lineagastoId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LineaGastoLocalService getWrappedLineaGastoLocalService() {
		return _lineaGastoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLineaGastoLocalService(
		LineaGastoLocalService lineaGastoLocalService) {
		_lineaGastoLocalService = lineaGastoLocalService;
	}

	@Override
	public LineaGastoLocalService getWrappedService() {
		return _lineaGastoLocalService;
	}

	@Override
	public void setWrappedService(LineaGastoLocalService lineaGastoLocalService) {
		_lineaGastoLocalService = lineaGastoLocalService;
	}

	private LineaGastoLocalService _lineaGastoLocalService;
}