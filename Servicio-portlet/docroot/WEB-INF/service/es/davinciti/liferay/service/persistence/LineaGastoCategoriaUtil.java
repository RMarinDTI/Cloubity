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

import es.davinciti.liferay.model.LineaGastoCategoria;

import java.util.List;

/**
 * The persistence utility for the linea gasto categoria service. This utility wraps {@link LineaGastoCategoriaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoCategoriaPersistence
 * @see LineaGastoCategoriaPersistenceImpl
 * @generated
 */
public class LineaGastoCategoriaUtil {
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
	public static void clearCache(LineaGastoCategoria lineaGastoCategoria) {
		getPersistence().clearCache(lineaGastoCategoria);
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
	public static List<LineaGastoCategoria> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LineaGastoCategoria> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LineaGastoCategoria> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LineaGastoCategoria update(
		LineaGastoCategoria lineaGastoCategoria) throws SystemException {
		return getPersistence().update(lineaGastoCategoria);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LineaGastoCategoria update(
		LineaGastoCategoria lineaGastoCategoria, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(lineaGastoCategoria, serviceContext);
	}

	/**
	* Caches the linea gasto categoria in the entity cache if it is enabled.
	*
	* @param lineaGastoCategoria the linea gasto categoria
	*/
	public static void cacheResult(
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria) {
		getPersistence().cacheResult(lineaGastoCategoria);
	}

	/**
	* Caches the linea gasto categorias in the entity cache if it is enabled.
	*
	* @param lineaGastoCategorias the linea gasto categorias
	*/
	public static void cacheResult(
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias) {
		getPersistence().cacheResult(lineaGastoCategorias);
	}

	/**
	* Creates a new linea gasto categoria with the primary key. Does not add the linea gasto categoria to the database.
	*
	* @param categoriaId the primary key for the new linea gasto categoria
	* @return the new linea gasto categoria
	*/
	public static es.davinciti.liferay.model.LineaGastoCategoria create(
		long categoriaId) {
		return getPersistence().create(categoriaId);
	}

	/**
	* Removes the linea gasto categoria with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoriaId the primary key of the linea gasto categoria
	* @return the linea gasto categoria that was removed
	* @throws es.davinciti.liferay.NoSuchLineaGastoCategoriaException if a linea gasto categoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCategoria remove(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoCategoriaException {
		return getPersistence().remove(categoriaId);
	}

	public static es.davinciti.liferay.model.LineaGastoCategoria updateImpl(
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(lineaGastoCategoria);
	}

	/**
	* Returns the linea gasto categoria with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoCategoriaException} if it could not be found.
	*
	* @param categoriaId the primary key of the linea gasto categoria
	* @return the linea gasto categoria
	* @throws es.davinciti.liferay.NoSuchLineaGastoCategoriaException if a linea gasto categoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCategoria findByPrimaryKey(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoCategoriaException {
		return getPersistence().findByPrimaryKey(categoriaId);
	}

	/**
	* Returns the linea gasto categoria with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param categoriaId the primary key of the linea gasto categoria
	* @return the linea gasto categoria, or <code>null</code> if a linea gasto categoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCategoria fetchByPrimaryKey(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(categoriaId);
	}

	/**
	* Returns all the linea gasto categorias.
	*
	* @return the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the linea gasto categorias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoCategoriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linea gasto categorias
	* @param end the upper bound of the range of linea gasto categorias (not inclusive)
	* @return the range of linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the linea gasto categorias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoCategoriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linea gasto categorias
	* @param end the upper bound of the range of linea gasto categorias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the linea gasto categorias from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of linea gasto categorias.
	*
	* @return the number of linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the linea gasto familias associated with the linea gasto categoria.
	*
	* @param pk the primary key of the linea gasto categoria
	* @return the linea gasto familias associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoFamilias(pk);
	}

	/**
	* Returns a range of all the linea gasto familias associated with the linea gasto categoria.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoCategoriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto categoria
	* @param start the lower bound of the range of linea gasto categorias
	* @param end the upper bound of the range of linea gasto categorias (not inclusive)
	* @return the range of linea gasto familias associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoFamilias(pk, start, end);
	}

	/**
	* Returns an ordered range of all the linea gasto familias associated with the linea gasto categoria.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoCategoriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto categoria
	* @param start the lower bound of the range of linea gasto categorias
	* @param end the upper bound of the range of linea gasto categorias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gasto familias associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getLineaGastoFamilias(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of linea gasto familias associated with the linea gasto categoria.
	*
	* @param pk the primary key of the linea gasto categoria
	* @return the number of linea gasto familias associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoFamiliasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoFamiliasSize(pk);
	}

	/**
	* Returns <code>true</code> if the linea gasto familia is associated with the linea gasto categoria.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	* @return <code>true</code> if the linea gasto familia is associated with the linea gasto categoria; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoFamilia(long pk,
		long lineaGastoFamiliaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsLineaGastoFamilia(pk, lineaGastoFamiliaPK);
	}

	/**
	* Returns <code>true</code> if the linea gasto categoria has any linea gasto familias associated with it.
	*
	* @param pk the primary key of the linea gasto categoria to check for associations with linea gasto familias
	* @return <code>true</code> if the linea gasto categoria has any linea gasto familias associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoFamilias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGastoFamilias(pk);
	}

	/**
	* Adds an association between the linea gasto categoria and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoFamilia(long pk, long lineaGastoFamiliaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoFamilia(pk, lineaGastoFamiliaPK);
	}

	/**
	* Adds an association between the linea gasto categoria and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamilia the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoFamilia(long pk,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoFamilia(pk, lineaGastoFamilia);
	}

	/**
	* Adds an association between the linea gasto categoria and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoFamilias(long pk,
		long[] lineaGastoFamiliaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoFamilias(pk, lineaGastoFamiliaPKs);
	}

	/**
	* Adds an association between the linea gasto categoria and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamilias the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoFamilias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoFamilias(pk, lineaGastoFamilias);
	}

	/**
	* Clears all associations between the linea gasto categoria and its linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria to clear the associated linea gasto familias from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoFamilias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearLineaGastoFamilias(pk);
	}

	/**
	* Removes the association between the linea gasto categoria and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoFamilia(long pk, long lineaGastoFamiliaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoFamilia(pk, lineaGastoFamiliaPK);
	}

	/**
	* Removes the association between the linea gasto categoria and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamilia the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoFamilia(long pk,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoFamilia(pk, lineaGastoFamilia);
	}

	/**
	* Removes the association between the linea gasto categoria and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoFamilias(long pk,
		long[] lineaGastoFamiliaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoFamilias(pk, lineaGastoFamiliaPKs);
	}

	/**
	* Removes the association between the linea gasto categoria and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamilias the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoFamilias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoFamilias(pk, lineaGastoFamilias);
	}

	/**
	* Sets the linea gasto familias associated with the linea gasto categoria, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias to be associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoFamilias(long pk,
		long[] lineaGastoFamiliaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoFamilias(pk, lineaGastoFamiliaPKs);
	}

	/**
	* Sets the linea gasto familias associated with the linea gasto categoria, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamilias the linea gasto familias to be associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoFamilias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoFamilias(pk, lineaGastoFamilias);
	}

	/**
	* Returns all the linea gastos associated with the linea gasto categoria.
	*
	* @param pk the primary key of the linea gasto categoria
	* @return the linea gastos associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastos(pk);
	}

	/**
	* Returns a range of all the linea gastos associated with the linea gasto categoria.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoCategoriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto categoria
	* @param start the lower bound of the range of linea gasto categorias
	* @param end the upper bound of the range of linea gasto categorias (not inclusive)
	* @return the range of linea gastos associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastos(pk, start, end);
	}

	/**
	* Returns an ordered range of all the linea gastos associated with the linea gasto categoria.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoCategoriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto categoria
	* @param start the lower bound of the range of linea gasto categorias
	* @param end the upper bound of the range of linea gasto categorias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gastos associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastos(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of linea gastos associated with the linea gasto categoria.
	*
	* @param pk the primary key of the linea gasto categoria
	* @return the number of linea gastos associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastosSize(pk);
	}

	/**
	* Returns <code>true</code> if the linea gasto is associated with the linea gasto categoria.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoPK the primary key of the linea gasto
	* @return <code>true</code> if the linea gasto is associated with the linea gasto categoria; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGasto(pk, lineaGastoPK);
	}

	/**
	* Returns <code>true</code> if the linea gasto categoria has any linea gastos associated with it.
	*
	* @param pk the primary key of the linea gasto categoria to check for associations with linea gastos
	* @return <code>true</code> if the linea gasto categoria has any linea gastos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGastos(pk);
	}

	/**
	* Adds an association between the linea gasto categoria and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGasto(pk, lineaGastoPK);
	}

	/**
	* Adds an association between the linea gasto categoria and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGasto(pk, lineaGasto);
	}

	/**
	* Adds an association between the linea gasto categoria and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastos(pk, lineaGastoPKs);
	}

	/**
	* Adds an association between the linea gasto categoria and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastos(pk, lineaGastos);
	}

	/**
	* Clears all associations between the linea gasto categoria and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria to clear the associated linea gastos from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearLineaGastos(pk);
	}

	/**
	* Removes the association between the linea gasto categoria and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGasto(pk, lineaGastoPK);
	}

	/**
	* Removes the association between the linea gasto categoria and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGasto(pk, lineaGasto);
	}

	/**
	* Removes the association between the linea gasto categoria and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastos(pk, lineaGastoPKs);
	}

	/**
	* Removes the association between the linea gasto categoria and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastos(pk, lineaGastos);
	}

	/**
	* Sets the linea gastos associated with the linea gasto categoria, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoPKs the primary keys of the linea gastos to be associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastos(pk, lineaGastoPKs);
	}

	/**
	* Sets the linea gastos associated with the linea gasto categoria, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastos the linea gastos to be associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastos(pk, lineaGastos);
	}

	public static LineaGastoCategoriaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LineaGastoCategoriaPersistence)PortletBeanLocatorUtil.locate(es.davinciti.liferay.service.ClpSerializer.getServletContextName(),
					LineaGastoCategoriaPersistence.class.getName());

			ReferenceRegistry.registerReference(LineaGastoCategoriaUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LineaGastoCategoriaPersistence persistence) {
	}

	private static LineaGastoCategoriaPersistence _persistence;
}