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
 * Provides the local service utility for LineaGastoCliente. This utility wraps
 * {@link es.davinciti.liferay.service.impl.LineaGastoClienteLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Cmes
 * @see LineaGastoClienteLocalService
 * @see es.davinciti.liferay.service.base.LineaGastoClienteLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.impl.LineaGastoClienteLocalServiceImpl
 * @generated
 */
public class LineaGastoClienteLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.davinciti.liferay.service.impl.LineaGastoClienteLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the linea gasto cliente to the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoCliente the linea gasto cliente
	* @return the linea gasto cliente that was added
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCliente addLineaGastoCliente(
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addLineaGastoCliente(lineaGastoCliente);
	}

	/**
	* Creates a new linea gasto cliente with the primary key. Does not add the linea gasto cliente to the database.
	*
	* @param clienteId the primary key for the new linea gasto cliente
	* @return the new linea gasto cliente
	*/
	public static es.davinciti.liferay.model.LineaGastoCliente createLineaGastoCliente(
		long clienteId) {
		return getService().createLineaGastoCliente(clienteId);
	}

	/**
	* Deletes the linea gasto cliente with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param clienteId the primary key of the linea gasto cliente
	* @return the linea gasto cliente that was removed
	* @throws PortalException if a linea gasto cliente with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCliente deleteLineaGastoCliente(
		long clienteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLineaGastoCliente(clienteId);
	}

	/**
	* Deletes the linea gasto cliente from the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoCliente the linea gasto cliente
	* @return the linea gasto cliente that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCliente deleteLineaGastoCliente(
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLineaGastoCliente(lineaGastoCliente);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static es.davinciti.liferay.model.LineaGastoCliente fetchLineaGastoCliente(
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchLineaGastoCliente(clienteId);
	}

	/**
	* Returns the linea gasto cliente with the primary key.
	*
	* @param clienteId the primary key of the linea gasto cliente
	* @return the linea gasto cliente
	* @throws PortalException if a linea gasto cliente with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCliente getLineaGastoCliente(
		long clienteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoCliente(clienteId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoClientes(start, end);
	}

	/**
	* Returns the number of linea gasto clientes.
	*
	* @return the number of linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoClientesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoClientesCount();
	}

	/**
	* Updates the linea gasto cliente in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoCliente the linea gasto cliente
	* @return the linea gasto cliente that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCliente updateLineaGastoCliente(
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLineaGastoCliente(lineaGastoCliente);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoLineaGastoCliente(long lineagastoId,
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoLineaGastoCliente(lineagastoId, clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoLineaGastoCliente(long lineagastoId,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoLineaGastoCliente(lineagastoId, lineaGastoCliente);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoLineaGastoClientes(long lineagastoId,
		long[] clienteIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoLineaGastoClientes(lineagastoId, clienteIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoLineaGastoClientes(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> LineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoLineaGastoClientes(lineagastoId, LineaGastoClientes);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoLineaGastoClientes(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearLineaGastoLineaGastoClientes(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoLineaGastoCliente(long lineagastoId,
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoLineaGastoCliente(lineagastoId, clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoLineaGastoCliente(long lineagastoId,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoLineaGastoCliente(lineagastoId, lineaGastoCliente);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoLineaGastoClientes(long lineagastoId,
		long[] clienteIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoLineaGastoClientes(lineagastoId, clienteIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoLineaGastoClientes(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> LineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoLineaGastoClientes(lineagastoId, LineaGastoClientes);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoLineaGastoClientes(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoLineaGastoClientes(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoLineaGastoClientes(
		long lineagastoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoLineaGastoClientes(lineagastoId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoLineaGastoClientes(
		long lineagastoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoLineaGastoClientes(lineagastoId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoLineaGastoClientesCount(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoLineaGastoClientesCount(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoLineaGastoCliente(long lineagastoId,
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasLineaGastoLineaGastoCliente(lineagastoId, clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoLineaGastoClientes(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasLineaGastoLineaGastoClientes(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoLineaGastoClientes(long lineagastoId,
		long[] clienteIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setLineaGastoLineaGastoClientes(lineagastoId, clienteIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoProyectoLineaGastoCliente(long proyectoId,
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoProyectoLineaGastoCliente(proyectoId, clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoProyectoLineaGastoCliente(long proyectoId,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoProyectoLineaGastoCliente(proyectoId,
			lineaGastoCliente);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoProyectoLineaGastoClientes(
		long proyectoId, long[] clienteIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoProyectoLineaGastoClientes(proyectoId, clienteIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoProyectoLineaGastoClientes(
		long proyectoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> LineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoProyectoLineaGastoClientes(proyectoId,
			LineaGastoClientes);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoProyectoLineaGastoClientes(
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearLineaGastoProyectoLineaGastoClientes(proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoProyectoLineaGastoCliente(
		long proyectoId, long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoProyectoLineaGastoCliente(proyectoId, clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoProyectoLineaGastoCliente(
		long proyectoId,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoProyectoLineaGastoCliente(proyectoId,
			lineaGastoCliente);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoProyectoLineaGastoClientes(
		long proyectoId, long[] clienteIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoProyectoLineaGastoClientes(proyectoId, clienteIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoProyectoLineaGastoClientes(
		long proyectoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> LineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoProyectoLineaGastoClientes(proyectoId,
			LineaGastoClientes);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoProyectoLineaGastoClientes(
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoProyectoLineaGastoClientes(proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoProyectoLineaGastoClientes(
		long proyectoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoProyectoLineaGastoClientes(proyectoId, start,
			end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoProyectoLineaGastoClientes(
		long proyectoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoProyectoLineaGastoClientes(proyectoId, start,
			end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoProyectoLineaGastoClientesCount(
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoProyectoLineaGastoClientesCount(proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoProyectoLineaGastoCliente(
		long proyectoId, long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasLineaGastoProyectoLineaGastoCliente(proyectoId, clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoProyectoLineaGastoClientes(
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasLineaGastoProyectoLineaGastoClientes(proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoProyectoLineaGastoClientes(
		long proyectoId, long[] clienteIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.setLineaGastoProyectoLineaGastoClientes(proyectoId, clienteIds);
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

	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> findByCompanyId(
		long companyId) {
		return getService().findByCompanyId(companyId);
	}

	public static void clearService() {
		_service = null;
	}

	public static LineaGastoClienteLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					LineaGastoClienteLocalService.class.getName());

			if (invokableLocalService instanceof LineaGastoClienteLocalService) {
				_service = (LineaGastoClienteLocalService)invokableLocalService;
			}
			else {
				_service = new LineaGastoClienteLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(LineaGastoClienteLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(LineaGastoClienteLocalService service) {
	}

	private static LineaGastoClienteLocalService _service;
}