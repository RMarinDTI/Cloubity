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

package es.davinciti.liferay.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import es.davinciti.liferay.model.LineaGastoCliente;

import java.util.List;

/**
 * The persistence utility for the linea gasto cliente service. This utility wraps {@link LineaGastoClientePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoClientePersistence
 * @see LineaGastoClientePersistenceImpl
 * @generated
 */
public class LineaGastoClienteUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(LineaGastoCliente lineaGastoCliente) {
		getPersistence().clearCache(lineaGastoCliente);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LineaGastoCliente> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LineaGastoCliente> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LineaGastoCliente> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LineaGastoCliente update(LineaGastoCliente lineaGastoCliente)
		throws SystemException {
		return getPersistence().update(lineaGastoCliente);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LineaGastoCliente update(
		LineaGastoCliente lineaGastoCliente, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(lineaGastoCliente, serviceContext);
	}

	/**
	* Returns all the linea gasto clientes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the linea gasto clientes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of linea gasto clientes
	* @param end the upper bound of the range of linea gasto clientes (not inclusive)
	* @return the range of matching linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the linea gasto clientes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of linea gasto clientes
	* @param end the upper bound of the range of linea gasto clientes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first linea gasto cliente in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linea gasto cliente
	* @throws es.davinciti.liferay.NoSuchLineaGastoClienteException if a matching linea gasto cliente could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCliente findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoClienteException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first linea gasto cliente in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linea gasto cliente, or <code>null</code> if a matching linea gasto cliente could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCliente fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last linea gasto cliente in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linea gasto cliente
	* @throws es.davinciti.liferay.NoSuchLineaGastoClienteException if a matching linea gasto cliente could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCliente findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoClienteException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last linea gasto cliente in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linea gasto cliente, or <code>null</code> if a matching linea gasto cliente could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCliente fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the linea gasto clientes before and after the current linea gasto cliente in the ordered set where companyId = &#63;.
	*
	* @param clienteId the primary key of the current linea gasto cliente
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next linea gasto cliente
	* @throws es.davinciti.liferay.NoSuchLineaGastoClienteException if a linea gasto cliente with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCliente[] findByCompanyId_PrevAndNext(
		long clienteId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoClienteException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(clienteId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the linea gasto clientes where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of linea gasto clientes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Caches the linea gasto cliente in the entity cache if it is enabled.
	*
	* @param lineaGastoCliente the linea gasto cliente
	*/
	public static void cacheResult(
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente) {
		getPersistence().cacheResult(lineaGastoCliente);
	}

	/**
	* Caches the linea gasto clientes in the entity cache if it is enabled.
	*
	* @param lineaGastoClientes the linea gasto clientes
	*/
	public static void cacheResult(
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes) {
		getPersistence().cacheResult(lineaGastoClientes);
	}

	/**
	* Creates a new linea gasto cliente with the primary key. Does not add the linea gasto cliente to the database.
	*
	* @param clienteId the primary key for the new linea gasto cliente
	* @return the new linea gasto cliente
	*/
	public static es.davinciti.liferay.model.LineaGastoCliente create(
		long clienteId) {
		return getPersistence().create(clienteId);
	}

	/**
	* Removes the linea gasto cliente with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param clienteId the primary key of the linea gasto cliente
	* @return the linea gasto cliente that was removed
	* @throws es.davinciti.liferay.NoSuchLineaGastoClienteException if a linea gasto cliente with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCliente remove(
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoClienteException {
		return getPersistence().remove(clienteId);
	}

	public static es.davinciti.liferay.model.LineaGastoCliente updateImpl(
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(lineaGastoCliente);
	}

	/**
	* Returns the linea gasto cliente with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoClienteException} if it could not be found.
	*
	* @param clienteId the primary key of the linea gasto cliente
	* @return the linea gasto cliente
	* @throws es.davinciti.liferay.NoSuchLineaGastoClienteException if a linea gasto cliente with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCliente findByPrimaryKey(
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoClienteException {
		return getPersistence().findByPrimaryKey(clienteId);
	}

	/**
	* Returns the linea gasto cliente with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param clienteId the primary key of the linea gasto cliente
	* @return the linea gasto cliente, or <code>null</code> if a linea gasto cliente with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCliente fetchByPrimaryKey(
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(clienteId);
	}

	/**
	* Returns all the linea gasto clientes.
	*
	* @return the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the linea gasto clientes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linea gasto clientes
	* @param end the upper bound of the range of linea gasto clientes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the linea gasto clientes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of linea gasto clientes.
	*
	* @return the number of linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the linea gastos associated with the linea gasto cliente.
	*
	* @param pk the primary key of the linea gasto cliente
	* @return the linea gastos associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastos(pk);
	}

	/**
	* Returns a range of all the linea gastos associated with the linea gasto cliente.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto cliente
	* @param start the lower bound of the range of linea gasto clientes
	* @param end the upper bound of the range of linea gasto clientes (not inclusive)
	* @return the range of linea gastos associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastos(pk, start, end);
	}

	/**
	* Returns an ordered range of all the linea gastos associated with the linea gasto cliente.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto cliente
	* @param start the lower bound of the range of linea gasto clientes
	* @param end the upper bound of the range of linea gasto clientes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gastos associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastos(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of linea gastos associated with the linea gasto cliente.
	*
	* @param pk the primary key of the linea gasto cliente
	* @return the number of linea gastos associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastosSize(pk);
	}

	/**
	* Returns <code>true</code> if the linea gasto is associated with the linea gasto cliente.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoPK the primary key of the linea gasto
	* @return <code>true</code> if the linea gasto is associated with the linea gasto cliente; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGasto(pk, lineaGastoPK);
	}

	/**
	* Returns <code>true</code> if the linea gasto cliente has any linea gastos associated with it.
	*
	* @param pk the primary key of the linea gasto cliente to check for associations with linea gastos
	* @return <code>true</code> if the linea gasto cliente has any linea gastos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGastos(pk);
	}

	/**
	* Adds an association between the linea gasto cliente and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGasto(pk, lineaGastoPK);
	}

	/**
	* Adds an association between the linea gasto cliente and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGasto(pk, lineaGasto);
	}

	/**
	* Adds an association between the linea gasto cliente and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastos(pk, lineaGastoPKs);
	}

	/**
	* Adds an association between the linea gasto cliente and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastos(pk, lineaGastos);
	}

	/**
	* Clears all associations between the linea gasto cliente and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente to clear the associated linea gastos from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearLineaGastos(pk);
	}

	/**
	* Removes the association between the linea gasto cliente and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGasto(pk, lineaGastoPK);
	}

	/**
	* Removes the association between the linea gasto cliente and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGasto(pk, lineaGasto);
	}

	/**
	* Removes the association between the linea gasto cliente and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastos(pk, lineaGastoPKs);
	}

	/**
	* Removes the association between the linea gasto cliente and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastos(pk, lineaGastos);
	}

	/**
	* Sets the linea gastos associated with the linea gasto cliente, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoPKs the primary keys of the linea gastos to be associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastos(pk, lineaGastoPKs);
	}

	/**
	* Sets the linea gastos associated with the linea gasto cliente, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastos the linea gastos to be associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastos(pk, lineaGastos);
	}

	/**
	* Returns all the linea gasto proyectos associated with the linea gasto cliente.
	*
	* @param pk the primary key of the linea gasto cliente
	* @return the linea gasto proyectos associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoProyectos(pk);
	}

	/**
	* Returns a range of all the linea gasto proyectos associated with the linea gasto cliente.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto cliente
	* @param start the lower bound of the range of linea gasto clientes
	* @param end the upper bound of the range of linea gasto clientes (not inclusive)
	* @return the range of linea gasto proyectos associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoProyectos(pk, start, end);
	}

	/**
	* Returns an ordered range of all the linea gasto proyectos associated with the linea gasto cliente.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto cliente
	* @param start the lower bound of the range of linea gasto clientes
	* @param end the upper bound of the range of linea gasto clientes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gasto proyectos associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getLineaGastoProyectos(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of linea gasto proyectos associated with the linea gasto cliente.
	*
	* @param pk the primary key of the linea gasto cliente
	* @return the number of linea gasto proyectos associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoProyectosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoProyectosSize(pk);
	}

	/**
	* Returns <code>true</code> if the linea gasto proyecto is associated with the linea gasto cliente.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	* @return <code>true</code> if the linea gasto proyecto is associated with the linea gasto cliente; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoProyecto(long pk,
		long lineaGastoProyectoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsLineaGastoProyecto(pk, lineaGastoProyectoPK);
	}

	/**
	* Returns <code>true</code> if the linea gasto cliente has any linea gasto proyectos associated with it.
	*
	* @param pk the primary key of the linea gasto cliente to check for associations with linea gasto proyectos
	* @return <code>true</code> if the linea gasto cliente has any linea gasto proyectos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoProyectos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGastoProyectos(pk);
	}

	/**
	* Adds an association between the linea gasto cliente and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoProyecto(long pk, long lineaGastoProyectoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoProyecto(pk, lineaGastoProyectoPK);
	}

	/**
	* Adds an association between the linea gasto cliente and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyecto the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoProyecto(long pk,
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoProyecto(pk, lineaGastoProyecto);
	}

	/**
	* Adds an association between the linea gasto cliente and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoProyectos(long pk,
		long[] lineaGastoProyectoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoProyectos(pk, lineaGastoProyectoPKs);
	}

	/**
	* Adds an association between the linea gasto cliente and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectos the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoProyectos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoProyectos(pk, lineaGastoProyectos);
	}

	/**
	* Clears all associations between the linea gasto cliente and its linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente to clear the associated linea gasto proyectos from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoProyectos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearLineaGastoProyectos(pk);
	}

	/**
	* Removes the association between the linea gasto cliente and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoProyecto(long pk,
		long lineaGastoProyectoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoProyecto(pk, lineaGastoProyectoPK);
	}

	/**
	* Removes the association between the linea gasto cliente and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyecto the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoProyecto(long pk,
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoProyecto(pk, lineaGastoProyecto);
	}

	/**
	* Removes the association between the linea gasto cliente and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoProyectos(long pk,
		long[] lineaGastoProyectoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoProyectos(pk, lineaGastoProyectoPKs);
	}

	/**
	* Removes the association between the linea gasto cliente and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectos the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoProyectos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoProyectos(pk, lineaGastoProyectos);
	}

	/**
	* Sets the linea gasto proyectos associated with the linea gasto cliente, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos to be associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoProyectos(long pk,
		long[] lineaGastoProyectoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoProyectos(pk, lineaGastoProyectoPKs);
	}

	/**
	* Sets the linea gasto proyectos associated with the linea gasto cliente, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectos the linea gasto proyectos to be associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoProyectos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoProyectos(pk, lineaGastoProyectos);
	}

	public static LineaGastoClientePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LineaGastoClientePersistence)PortletBeanLocatorUtil.locate(es.davinciti.liferay.service.ClpSerializer.getServletContextName(),
					LineaGastoClientePersistence.class.getName());

			ReferenceRegistry.registerReference(LineaGastoClienteUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LineaGastoClientePersistence persistence) {
	}

	private static LineaGastoClientePersistence _persistence;
}