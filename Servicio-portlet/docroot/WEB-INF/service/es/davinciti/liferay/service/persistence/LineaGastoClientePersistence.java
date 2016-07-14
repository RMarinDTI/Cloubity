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

import com.liferay.portal.service.persistence.BasePersistence;

import es.davinciti.liferay.model.LineaGastoCliente;

/**
 * The persistence interface for the linea gasto cliente service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoClientePersistenceImpl
 * @see LineaGastoClienteUtil
 * @generated
 */
public interface LineaGastoClientePersistence extends BasePersistence<LineaGastoCliente> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LineaGastoClienteUtil} to access the linea gasto cliente persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the linea gasto clientes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first linea gasto cliente in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linea gasto cliente
	* @throws es.davinciti.liferay.NoSuchLineaGastoClienteException if a matching linea gasto cliente could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoCliente findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoClienteException;

	/**
	* Returns the first linea gasto cliente in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linea gasto cliente, or <code>null</code> if a matching linea gasto cliente could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoCliente fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last linea gasto cliente in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linea gasto cliente
	* @throws es.davinciti.liferay.NoSuchLineaGastoClienteException if a matching linea gasto cliente could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoCliente findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoClienteException;

	/**
	* Returns the last linea gasto cliente in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linea gasto cliente, or <code>null</code> if a matching linea gasto cliente could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoCliente fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public es.davinciti.liferay.model.LineaGastoCliente[] findByCompanyId_PrevAndNext(
		long clienteId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoClienteException;

	/**
	* Removes all the linea gasto clientes where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto clientes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the linea gasto cliente in the entity cache if it is enabled.
	*
	* @param lineaGastoCliente the linea gasto cliente
	*/
	public void cacheResult(
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente);

	/**
	* Caches the linea gasto clientes in the entity cache if it is enabled.
	*
	* @param lineaGastoClientes the linea gasto clientes
	*/
	public void cacheResult(
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes);

	/**
	* Creates a new linea gasto cliente with the primary key. Does not add the linea gasto cliente to the database.
	*
	* @param clienteId the primary key for the new linea gasto cliente
	* @return the new linea gasto cliente
	*/
	public es.davinciti.liferay.model.LineaGastoCliente create(long clienteId);

	/**
	* Removes the linea gasto cliente with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param clienteId the primary key of the linea gasto cliente
	* @return the linea gasto cliente that was removed
	* @throws es.davinciti.liferay.NoSuchLineaGastoClienteException if a linea gasto cliente with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoCliente remove(long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoClienteException;

	public es.davinciti.liferay.model.LineaGastoCliente updateImpl(
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the linea gasto cliente with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoClienteException} if it could not be found.
	*
	* @param clienteId the primary key of the linea gasto cliente
	* @return the linea gasto cliente
	* @throws es.davinciti.liferay.NoSuchLineaGastoClienteException if a linea gasto cliente with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoCliente findByPrimaryKey(
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoClienteException;

	/**
	* Returns the linea gasto cliente with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param clienteId the primary key of the linea gasto cliente
	* @return the linea gasto cliente, or <code>null</code> if a linea gasto cliente with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoCliente fetchByPrimaryKey(
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gasto clientes.
	*
	* @return the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the linea gasto clientes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto clientes.
	*
	* @return the number of linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gastos associated with the linea gasto cliente.
	*
	* @param pk the primary key of the linea gasto cliente
	* @return the linea gastos associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gastos associated with the linea gasto cliente.
	*
	* @param pk the primary key of the linea gasto cliente
	* @return the number of linea gastos associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public int getLineaGastosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto is associated with the linea gasto cliente.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoPK the primary key of the linea gasto
	* @return <code>true</code> if the linea gasto is associated with the linea gasto cliente; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto cliente has any linea gastos associated with it.
	*
	* @param pk the primary key of the linea gasto cliente to check for associations with linea gastos
	* @return <code>true</code> if the linea gasto cliente has any linea gastos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto cliente and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto cliente and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto cliente and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto cliente and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the linea gasto cliente and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente to clear the associated linea gastos from
	* @throws SystemException if a system exception occurred
	*/
	public void clearLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto cliente and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto cliente and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto cliente and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto cliente and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gastos associated with the linea gasto cliente, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoPKs the primary keys of the linea gastos to be associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gastos associated with the linea gasto cliente, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastos the linea gastos to be associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gasto proyectos associated with the linea gasto cliente.
	*
	* @param pk the primary key of the linea gasto cliente
	* @return the linea gasto proyectos associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto proyectos associated with the linea gasto cliente.
	*
	* @param pk the primary key of the linea gasto cliente
	* @return the number of linea gasto proyectos associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public int getLineaGastoProyectosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto proyecto is associated with the linea gasto cliente.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	* @return <code>true</code> if the linea gasto proyecto is associated with the linea gasto cliente; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoProyecto(long pk, long lineaGastoProyectoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto cliente has any linea gasto proyectos associated with it.
	*
	* @param pk the primary key of the linea gasto cliente to check for associations with linea gasto proyectos
	* @return <code>true</code> if the linea gasto cliente has any linea gasto proyectos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoProyectos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto cliente and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoProyecto(long pk, long lineaGastoProyectoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto cliente and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyecto the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoProyecto(long pk,
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto cliente and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoProyectos(long pk, long[] lineaGastoProyectoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto cliente and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectos the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoProyectos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the linea gasto cliente and its linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente to clear the associated linea gasto proyectos from
	* @throws SystemException if a system exception occurred
	*/
	public void clearLineaGastoProyectos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto cliente and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoProyecto(long pk, long lineaGastoProyectoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto cliente and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyecto the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoProyecto(long pk,
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto cliente and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoProyectos(long pk, long[] lineaGastoProyectoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto cliente and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectos the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoProyectos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto proyectos associated with the linea gasto cliente, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos to be associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoProyectos(long pk, long[] lineaGastoProyectoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto proyectos associated with the linea gasto cliente, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto cliente
	* @param lineaGastoProyectos the linea gasto proyectos to be associated with the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoProyectos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws com.liferay.portal.kernel.exception.SystemException;
}