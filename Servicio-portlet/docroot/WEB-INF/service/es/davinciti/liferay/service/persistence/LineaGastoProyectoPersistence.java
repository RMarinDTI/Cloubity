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

import es.davinciti.liferay.model.LineaGastoProyecto;

/**
 * The persistence interface for the linea gasto proyecto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoProyectoPersistenceImpl
 * @see LineaGastoProyectoUtil
 * @generated
 */
public interface LineaGastoProyectoPersistence extends BasePersistence<LineaGastoProyecto> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LineaGastoProyectoUtil} to access the linea gasto proyecto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the linea gasto proyecto in the entity cache if it is enabled.
	*
	* @param lineaGastoProyecto the linea gasto proyecto
	*/
	public void cacheResult(
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto);

	/**
	* Caches the linea gasto proyectos in the entity cache if it is enabled.
	*
	* @param lineaGastoProyectos the linea gasto proyectos
	*/
	public void cacheResult(
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos);

	/**
	* Creates a new linea gasto proyecto with the primary key. Does not add the linea gasto proyecto to the database.
	*
	* @param proyectoId the primary key for the new linea gasto proyecto
	* @return the new linea gasto proyecto
	*/
	public es.davinciti.liferay.model.LineaGastoProyecto create(long proyectoId);

	/**
	* Removes the linea gasto proyecto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param proyectoId the primary key of the linea gasto proyecto
	* @return the linea gasto proyecto that was removed
	* @throws es.davinciti.liferay.NoSuchLineaGastoProyectoException if a linea gasto proyecto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoProyecto remove(long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoProyectoException;

	public es.davinciti.liferay.model.LineaGastoProyecto updateImpl(
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the linea gasto proyecto with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoProyectoException} if it could not be found.
	*
	* @param proyectoId the primary key of the linea gasto proyecto
	* @return the linea gasto proyecto
	* @throws es.davinciti.liferay.NoSuchLineaGastoProyectoException if a linea gasto proyecto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoProyecto findByPrimaryKey(
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoProyectoException;

	/**
	* Returns the linea gasto proyecto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param proyectoId the primary key of the linea gasto proyecto
	* @return the linea gasto proyecto, or <code>null</code> if a linea gasto proyecto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoProyecto fetchByPrimaryKey(
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gasto proyectos.
	*
	* @return the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the linea gasto proyectos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoProyectoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linea gasto proyectos
	* @param end the upper bound of the range of linea gasto proyectos (not inclusive)
	* @return the range of linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gasto proyectos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoProyectoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linea gasto proyectos
	* @param end the upper bound of the range of linea gasto proyectos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the linea gasto proyectos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto proyectos.
	*
	* @return the number of linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gasto clientes associated with the linea gasto proyecto.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @return the linea gasto clientes associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the linea gasto clientes associated with the linea gasto proyecto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoProyectoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param start the lower bound of the range of linea gasto proyectos
	* @param end the upper bound of the range of linea gasto proyectos (not inclusive)
	* @return the range of linea gasto clientes associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gasto clientes associated with the linea gasto proyecto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoProyectoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param start the lower bound of the range of linea gasto proyectos
	* @param end the upper bound of the range of linea gasto proyectos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gasto clientes associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto clientes associated with the linea gasto proyecto.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @return the number of linea gasto clientes associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public int getLineaGastoClientesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto cliente is associated with the linea gasto proyecto.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientePK the primary key of the linea gasto cliente
	* @return <code>true</code> if the linea gasto cliente is associated with the linea gasto proyecto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoCliente(long pk, long lineaGastoClientePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto proyecto has any linea gasto clientes associated with it.
	*
	* @param pk the primary key of the linea gasto proyecto to check for associations with linea gasto clientes
	* @return <code>true</code> if the linea gasto proyecto has any linea gasto clientes associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoClientes(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto proyecto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientePK the primary key of the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoCliente(long pk, long lineaGastoClientePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto proyecto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoCliente the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoCliente(long pk,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto proyecto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientePKs the primary keys of the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoClientes(long pk, long[] lineaGastoClientePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto proyecto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientes the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoClientes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the linea gasto proyecto and its linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto to clear the associated linea gasto clientes from
	* @throws SystemException if a system exception occurred
	*/
	public void clearLineaGastoClientes(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto proyecto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientePK the primary key of the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoCliente(long pk, long lineaGastoClientePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto proyecto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoCliente the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoCliente(long pk,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto proyecto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientePKs the primary keys of the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoClientes(long pk, long[] lineaGastoClientePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto proyecto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientes the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoClientes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto clientes associated with the linea gasto proyecto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientePKs the primary keys of the linea gasto clientes to be associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoClientes(long pk, long[] lineaGastoClientePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto clientes associated with the linea gasto proyecto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientes the linea gasto clientes to be associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoClientes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gastos associated with the linea gasto proyecto.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @return the linea gastos associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the linea gastos associated with the linea gasto proyecto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoProyectoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param start the lower bound of the range of linea gasto proyectos
	* @param end the upper bound of the range of linea gasto proyectos (not inclusive)
	* @return the range of linea gastos associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gastos associated with the linea gasto proyecto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoProyectoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param start the lower bound of the range of linea gasto proyectos
	* @param end the upper bound of the range of linea gasto proyectos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gastos associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gastos associated with the linea gasto proyecto.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @return the number of linea gastos associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public int getLineaGastosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto is associated with the linea gasto proyecto.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoPK the primary key of the linea gasto
	* @return <code>true</code> if the linea gasto is associated with the linea gasto proyecto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto proyecto has any linea gastos associated with it.
	*
	* @param pk the primary key of the linea gasto proyecto to check for associations with linea gastos
	* @return <code>true</code> if the linea gasto proyecto has any linea gastos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto proyecto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto proyecto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto proyecto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto proyecto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the linea gasto proyecto and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto to clear the associated linea gastos from
	* @throws SystemException if a system exception occurred
	*/
	public void clearLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto proyecto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto proyecto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto proyecto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto proyecto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gastos associated with the linea gasto proyecto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoPKs the primary keys of the linea gastos to be associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gastos associated with the linea gasto proyecto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastos the linea gastos to be associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;
}