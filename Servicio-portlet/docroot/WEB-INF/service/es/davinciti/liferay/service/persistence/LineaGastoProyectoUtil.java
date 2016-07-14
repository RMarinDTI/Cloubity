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

import es.davinciti.liferay.model.LineaGastoProyecto;

import java.util.List;

/**
 * The persistence utility for the linea gasto proyecto service. This utility wraps {@link LineaGastoProyectoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoProyectoPersistence
 * @see LineaGastoProyectoPersistenceImpl
 * @generated
 */
public class LineaGastoProyectoUtil {
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
	public static void clearCache(LineaGastoProyecto lineaGastoProyecto) {
		getPersistence().clearCache(lineaGastoProyecto);
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
	public static List<LineaGastoProyecto> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LineaGastoProyecto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LineaGastoProyecto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LineaGastoProyecto update(
		LineaGastoProyecto lineaGastoProyecto) throws SystemException {
		return getPersistence().update(lineaGastoProyecto);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LineaGastoProyecto update(
		LineaGastoProyecto lineaGastoProyecto, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(lineaGastoProyecto, serviceContext);
	}

	/**
	* Caches the linea gasto proyecto in the entity cache if it is enabled.
	*
	* @param lineaGastoProyecto the linea gasto proyecto
	*/
	public static void cacheResult(
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto) {
		getPersistence().cacheResult(lineaGastoProyecto);
	}

	/**
	* Caches the linea gasto proyectos in the entity cache if it is enabled.
	*
	* @param lineaGastoProyectos the linea gasto proyectos
	*/
	public static void cacheResult(
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos) {
		getPersistence().cacheResult(lineaGastoProyectos);
	}

	/**
	* Creates a new linea gasto proyecto with the primary key. Does not add the linea gasto proyecto to the database.
	*
	* @param proyectoId the primary key for the new linea gasto proyecto
	* @return the new linea gasto proyecto
	*/
	public static es.davinciti.liferay.model.LineaGastoProyecto create(
		long proyectoId) {
		return getPersistence().create(proyectoId);
	}

	/**
	* Removes the linea gasto proyecto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param proyectoId the primary key of the linea gasto proyecto
	* @return the linea gasto proyecto that was removed
	* @throws es.davinciti.liferay.NoSuchLineaGastoProyectoException if a linea gasto proyecto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoProyecto remove(
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoProyectoException {
		return getPersistence().remove(proyectoId);
	}

	public static es.davinciti.liferay.model.LineaGastoProyecto updateImpl(
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(lineaGastoProyecto);
	}

	/**
	* Returns the linea gasto proyecto with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoProyectoException} if it could not be found.
	*
	* @param proyectoId the primary key of the linea gasto proyecto
	* @return the linea gasto proyecto
	* @throws es.davinciti.liferay.NoSuchLineaGastoProyectoException if a linea gasto proyecto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoProyecto findByPrimaryKey(
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoProyectoException {
		return getPersistence().findByPrimaryKey(proyectoId);
	}

	/**
	* Returns the linea gasto proyecto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param proyectoId the primary key of the linea gasto proyecto
	* @return the linea gasto proyecto, or <code>null</code> if a linea gasto proyecto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoProyecto fetchByPrimaryKey(
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(proyectoId);
	}

	/**
	* Returns all the linea gasto proyectos.
	*
	* @return the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the linea gasto proyectos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of linea gasto proyectos.
	*
	* @return the number of linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the linea gasto clientes associated with the linea gasto proyecto.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @return the linea gasto clientes associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoClientes(pk);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoClientes(pk, start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getLineaGastoClientes(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of linea gasto clientes associated with the linea gasto proyecto.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @return the number of linea gasto clientes associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoClientesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoClientesSize(pk);
	}

	/**
	* Returns <code>true</code> if the linea gasto cliente is associated with the linea gasto proyecto.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientePK the primary key of the linea gasto cliente
	* @return <code>true</code> if the linea gasto cliente is associated with the linea gasto proyecto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoCliente(long pk,
		long lineaGastoClientePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsLineaGastoCliente(pk, lineaGastoClientePK);
	}

	/**
	* Returns <code>true</code> if the linea gasto proyecto has any linea gasto clientes associated with it.
	*
	* @param pk the primary key of the linea gasto proyecto to check for associations with linea gasto clientes
	* @return <code>true</code> if the linea gasto proyecto has any linea gasto clientes associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoClientes(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGastoClientes(pk);
	}

	/**
	* Adds an association between the linea gasto proyecto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientePK the primary key of the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCliente(long pk, long lineaGastoClientePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoCliente(pk, lineaGastoClientePK);
	}

	/**
	* Adds an association between the linea gasto proyecto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoCliente the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCliente(long pk,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoCliente(pk, lineaGastoCliente);
	}

	/**
	* Adds an association between the linea gasto proyecto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientePKs the primary keys of the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoClientes(long pk,
		long[] lineaGastoClientePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoClientes(pk, lineaGastoClientePKs);
	}

	/**
	* Adds an association between the linea gasto proyecto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientes the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoClientes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoClientes(pk, lineaGastoClientes);
	}

	/**
	* Clears all associations between the linea gasto proyecto and its linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto to clear the associated linea gasto clientes from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoClientes(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearLineaGastoClientes(pk);
	}

	/**
	* Removes the association between the linea gasto proyecto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientePK the primary key of the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoCliente(long pk, long lineaGastoClientePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoCliente(pk, lineaGastoClientePK);
	}

	/**
	* Removes the association between the linea gasto proyecto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoCliente the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoCliente(long pk,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoCliente(pk, lineaGastoCliente);
	}

	/**
	* Removes the association between the linea gasto proyecto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientePKs the primary keys of the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoClientes(long pk,
		long[] lineaGastoClientePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoClientes(pk, lineaGastoClientePKs);
	}

	/**
	* Removes the association between the linea gasto proyecto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientes the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoClientes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoClientes(pk, lineaGastoClientes);
	}

	/**
	* Sets the linea gasto clientes associated with the linea gasto proyecto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientePKs the primary keys of the linea gasto clientes to be associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoClientes(long pk,
		long[] lineaGastoClientePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoClientes(pk, lineaGastoClientePKs);
	}

	/**
	* Sets the linea gasto clientes associated with the linea gasto proyecto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoClientes the linea gasto clientes to be associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoClientes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoClientes(pk, lineaGastoClientes);
	}

	/**
	* Returns all the linea gastos associated with the linea gasto proyecto.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @return the linea gastos associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastos(pk);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastos(pk, start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastos(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of linea gastos associated with the linea gasto proyecto.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @return the number of linea gastos associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastosSize(pk);
	}

	/**
	* Returns <code>true</code> if the linea gasto is associated with the linea gasto proyecto.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoPK the primary key of the linea gasto
	* @return <code>true</code> if the linea gasto is associated with the linea gasto proyecto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGasto(pk, lineaGastoPK);
	}

	/**
	* Returns <code>true</code> if the linea gasto proyecto has any linea gastos associated with it.
	*
	* @param pk the primary key of the linea gasto proyecto to check for associations with linea gastos
	* @return <code>true</code> if the linea gasto proyecto has any linea gastos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGastos(pk);
	}

	/**
	* Adds an association between the linea gasto proyecto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGasto(pk, lineaGastoPK);
	}

	/**
	* Adds an association between the linea gasto proyecto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGasto(pk, lineaGasto);
	}

	/**
	* Adds an association between the linea gasto proyecto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastos(pk, lineaGastoPKs);
	}

	/**
	* Adds an association between the linea gasto proyecto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastos(pk, lineaGastos);
	}

	/**
	* Clears all associations between the linea gasto proyecto and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto to clear the associated linea gastos from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearLineaGastos(pk);
	}

	/**
	* Removes the association between the linea gasto proyecto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGasto(pk, lineaGastoPK);
	}

	/**
	* Removes the association between the linea gasto proyecto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGasto(pk, lineaGasto);
	}

	/**
	* Removes the association between the linea gasto proyecto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastos(pk, lineaGastoPKs);
	}

	/**
	* Removes the association between the linea gasto proyecto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastos(pk, lineaGastos);
	}

	/**
	* Sets the linea gastos associated with the linea gasto proyecto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastoPKs the primary keys of the linea gastos to be associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastos(pk, lineaGastoPKs);
	}

	/**
	* Sets the linea gastos associated with the linea gasto proyecto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto proyecto
	* @param lineaGastos the linea gastos to be associated with the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastos(pk, lineaGastos);
	}

	public static LineaGastoProyectoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LineaGastoProyectoPersistence)PortletBeanLocatorUtil.locate(es.davinciti.liferay.service.ClpSerializer.getServletContextName(),
					LineaGastoProyectoPersistence.class.getName());

			ReferenceRegistry.registerReference(LineaGastoProyectoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LineaGastoProyectoPersistence persistence) {
	}

	private static LineaGastoProyectoPersistence _persistence;
}