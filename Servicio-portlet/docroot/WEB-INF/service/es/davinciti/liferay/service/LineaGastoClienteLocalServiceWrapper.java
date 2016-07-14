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
 * Provides a wrapper for {@link LineaGastoClienteLocalService}.
 *
 * @author Cmes
 * @see LineaGastoClienteLocalService
 * @generated
 */
public class LineaGastoClienteLocalServiceWrapper
	implements LineaGastoClienteLocalService,
		ServiceWrapper<LineaGastoClienteLocalService> {
	public LineaGastoClienteLocalServiceWrapper(
		LineaGastoClienteLocalService lineaGastoClienteLocalService) {
		_lineaGastoClienteLocalService = lineaGastoClienteLocalService;
	}

	/**
	* Adds the linea gasto cliente to the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoCliente the linea gasto cliente
	* @return the linea gasto cliente that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoCliente addLineaGastoCliente(
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.addLineaGastoCliente(lineaGastoCliente);
	}

	/**
	* Creates a new linea gasto cliente with the primary key. Does not add the linea gasto cliente to the database.
	*
	* @param clienteId the primary key for the new linea gasto cliente
	* @return the new linea gasto cliente
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoCliente createLineaGastoCliente(
		long clienteId) {
		return _lineaGastoClienteLocalService.createLineaGastoCliente(clienteId);
	}

	/**
	* Deletes the linea gasto cliente with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param clienteId the primary key of the linea gasto cliente
	* @return the linea gasto cliente that was removed
	* @throws PortalException if a linea gasto cliente with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoCliente deleteLineaGastoCliente(
		long clienteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.deleteLineaGastoCliente(clienteId);
	}

	/**
	* Deletes the linea gasto cliente from the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoCliente the linea gasto cliente
	* @return the linea gasto cliente that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoCliente deleteLineaGastoCliente(
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.deleteLineaGastoCliente(lineaGastoCliente);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _lineaGastoClienteLocalService.dynamicQuery();
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
		return _lineaGastoClienteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _lineaGastoClienteLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _lineaGastoClienteLocalService.dynamicQuery(dynamicQuery, start,
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
		return _lineaGastoClienteLocalService.dynamicQueryCount(dynamicQuery);
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
		return _lineaGastoClienteLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.davinciti.liferay.model.LineaGastoCliente fetchLineaGastoCliente(
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.fetchLineaGastoCliente(clienteId);
	}

	/**
	* Returns the linea gasto cliente with the primary key.
	*
	* @param clienteId the primary key of the linea gasto cliente
	* @return the linea gasto cliente
	* @throws PortalException if a linea gasto cliente with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoCliente getLineaGastoCliente(
		long clienteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.getLineaGastoCliente(clienteId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the linea gasto clientes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linea gasto clientes
	* @param end the upper bound of the range of linea gasto clientes (not inclusive)
	* @return the range of linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.getLineaGastoClientes(start, end);
	}

	/**
	* Returns the number of linea gasto clientes.
	*
	* @return the number of linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoClientesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.getLineaGastoClientesCount();
	}

	/**
	* Updates the linea gasto cliente in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoCliente the linea gasto cliente
	* @return the linea gasto cliente that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoCliente updateLineaGastoCliente(
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.updateLineaGastoCliente(lineaGastoCliente);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoLineaGastoCliente(long lineagastoId, long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.addLineaGastoLineaGastoCliente(lineagastoId,
			clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoLineaGastoCliente(long lineagastoId,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.addLineaGastoLineaGastoCliente(lineagastoId,
			lineaGastoCliente);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoLineaGastoClientes(long lineagastoId,
		long[] clienteIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.addLineaGastoLineaGastoClientes(lineagastoId,
			clienteIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoLineaGastoClientes(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> LineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.addLineaGastoLineaGastoClientes(lineagastoId,
			LineaGastoClientes);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearLineaGastoLineaGastoClientes(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.clearLineaGastoLineaGastoClientes(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoLineaGastoCliente(long lineagastoId,
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.deleteLineaGastoLineaGastoCliente(lineagastoId,
			clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoLineaGastoCliente(long lineagastoId,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.deleteLineaGastoLineaGastoCliente(lineagastoId,
			lineaGastoCliente);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoLineaGastoClientes(long lineagastoId,
		long[] clienteIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.deleteLineaGastoLineaGastoClientes(lineagastoId,
			clienteIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoLineaGastoClientes(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> LineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.deleteLineaGastoLineaGastoClientes(lineagastoId,
			LineaGastoClientes);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoLineaGastoClientes(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.getLineaGastoLineaGastoClientes(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoLineaGastoClientes(
		long lineagastoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.getLineaGastoLineaGastoClientes(lineagastoId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoLineaGastoClientes(
		long lineagastoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.getLineaGastoLineaGastoClientes(lineagastoId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoLineaGastoClientesCount(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.getLineaGastoLineaGastoClientesCount(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoLineaGastoCliente(long lineagastoId,
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.hasLineaGastoLineaGastoCliente(lineagastoId,
			clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoLineaGastoClientes(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.hasLineaGastoLineaGastoClientes(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setLineaGastoLineaGastoClientes(long lineagastoId,
		long[] clienteIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.setLineaGastoLineaGastoClientes(lineagastoId,
			clienteIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoProyectoLineaGastoCliente(long proyectoId,
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.addLineaGastoProyectoLineaGastoCliente(proyectoId,
			clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoProyectoLineaGastoCliente(long proyectoId,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.addLineaGastoProyectoLineaGastoCliente(proyectoId,
			lineaGastoCliente);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoProyectoLineaGastoClientes(long proyectoId,
		long[] clienteIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.addLineaGastoProyectoLineaGastoClientes(proyectoId,
			clienteIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoProyectoLineaGastoClientes(long proyectoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> LineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.addLineaGastoProyectoLineaGastoClientes(proyectoId,
			LineaGastoClientes);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearLineaGastoProyectoLineaGastoClientes(long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.clearLineaGastoProyectoLineaGastoClientes(proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoProyectoLineaGastoCliente(long proyectoId,
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.deleteLineaGastoProyectoLineaGastoCliente(proyectoId,
			clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoProyectoLineaGastoCliente(long proyectoId,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.deleteLineaGastoProyectoLineaGastoCliente(proyectoId,
			lineaGastoCliente);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoProyectoLineaGastoClientes(long proyectoId,
		long[] clienteIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.deleteLineaGastoProyectoLineaGastoClientes(proyectoId,
			clienteIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoProyectoLineaGastoClientes(long proyectoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> LineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.deleteLineaGastoProyectoLineaGastoClientes(proyectoId,
			LineaGastoClientes);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoProyectoLineaGastoClientes(
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.getLineaGastoProyectoLineaGastoClientes(proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoProyectoLineaGastoClientes(
		long proyectoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.getLineaGastoProyectoLineaGastoClientes(proyectoId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoProyectoLineaGastoClientes(
		long proyectoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.getLineaGastoProyectoLineaGastoClientes(proyectoId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoProyectoLineaGastoClientesCount(long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.getLineaGastoProyectoLineaGastoClientesCount(proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoProyectoLineaGastoCliente(long proyectoId,
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.hasLineaGastoProyectoLineaGastoCliente(proyectoId,
			clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoProyectoLineaGastoClientes(long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoClienteLocalService.hasLineaGastoProyectoLineaGastoClientes(proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setLineaGastoProyectoLineaGastoClientes(long proyectoId,
		long[] clienteIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoClienteLocalService.setLineaGastoProyectoLineaGastoClientes(proyectoId,
			clienteIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _lineaGastoClienteLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_lineaGastoClienteLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lineaGastoClienteLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> findByCompanyId(
		long companyId) {
		return _lineaGastoClienteLocalService.findByCompanyId(companyId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LineaGastoClienteLocalService getWrappedLineaGastoClienteLocalService() {
		return _lineaGastoClienteLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLineaGastoClienteLocalService(
		LineaGastoClienteLocalService lineaGastoClienteLocalService) {
		_lineaGastoClienteLocalService = lineaGastoClienteLocalService;
	}

	@Override
	public LineaGastoClienteLocalService getWrappedService() {
		return _lineaGastoClienteLocalService;
	}

	@Override
	public void setWrappedService(
		LineaGastoClienteLocalService lineaGastoClienteLocalService) {
		_lineaGastoClienteLocalService = lineaGastoClienteLocalService;
	}

	private LineaGastoClienteLocalService _lineaGastoClienteLocalService;
}