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

import es.davinciti.liferay.model.LineaGastoCategoria;

/**
 * The persistence interface for the linea gasto categoria service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoCategoriaPersistenceImpl
 * @see LineaGastoCategoriaUtil
 * @generated
 */
public interface LineaGastoCategoriaPersistence extends BasePersistence<LineaGastoCategoria> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LineaGastoCategoriaUtil} to access the linea gasto categoria persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the linea gasto categoria in the entity cache if it is enabled.
	*
	* @param lineaGastoCategoria the linea gasto categoria
	*/
	public void cacheResult(
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria);

	/**
	* Caches the linea gasto categorias in the entity cache if it is enabled.
	*
	* @param lineaGastoCategorias the linea gasto categorias
	*/
	public void cacheResult(
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias);

	/**
	* Creates a new linea gasto categoria with the primary key. Does not add the linea gasto categoria to the database.
	*
	* @param categoriaId the primary key for the new linea gasto categoria
	* @return the new linea gasto categoria
	*/
	public es.davinciti.liferay.model.LineaGastoCategoria create(
		long categoriaId);

	/**
	* Removes the linea gasto categoria with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoriaId the primary key of the linea gasto categoria
	* @return the linea gasto categoria that was removed
	* @throws es.davinciti.liferay.NoSuchLineaGastoCategoriaException if a linea gasto categoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoCategoria remove(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoCategoriaException;

	public es.davinciti.liferay.model.LineaGastoCategoria updateImpl(
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the linea gasto categoria with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoCategoriaException} if it could not be found.
	*
	* @param categoriaId the primary key of the linea gasto categoria
	* @return the linea gasto categoria
	* @throws es.davinciti.liferay.NoSuchLineaGastoCategoriaException if a linea gasto categoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoCategoria findByPrimaryKey(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoCategoriaException;

	/**
	* Returns the linea gasto categoria with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param categoriaId the primary key of the linea gasto categoria
	* @return the linea gasto categoria, or <code>null</code> if a linea gasto categoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoCategoria fetchByPrimaryKey(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gasto categorias.
	*
	* @return the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the linea gasto categorias from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto categorias.
	*
	* @return the number of linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gasto familias associated with the linea gasto categoria.
	*
	* @param pk the primary key of the linea gasto categoria
	* @return the linea gasto familias associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto familias associated with the linea gasto categoria.
	*
	* @param pk the primary key of the linea gasto categoria
	* @return the number of linea gasto familias associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public int getLineaGastoFamiliasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto familia is associated with the linea gasto categoria.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	* @return <code>true</code> if the linea gasto familia is associated with the linea gasto categoria; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoFamilia(long pk, long lineaGastoFamiliaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto categoria has any linea gasto familias associated with it.
	*
	* @param pk the primary key of the linea gasto categoria to check for associations with linea gasto familias
	* @return <code>true</code> if the linea gasto categoria has any linea gasto familias associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoFamilias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto categoria and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoFamilia(long pk, long lineaGastoFamiliaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto categoria and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamilia the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoFamilia(long pk,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto categoria and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoFamilias(long pk, long[] lineaGastoFamiliaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto categoria and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamilias the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoFamilias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the linea gasto categoria and its linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria to clear the associated linea gasto familias from
	* @throws SystemException if a system exception occurred
	*/
	public void clearLineaGastoFamilias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto categoria and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoFamilia(long pk, long lineaGastoFamiliaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto categoria and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamilia the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoFamilia(long pk,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto categoria and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoFamilias(long pk, long[] lineaGastoFamiliaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto categoria and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamilias the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoFamilias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto familias associated with the linea gasto categoria, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias to be associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoFamilias(long pk, long[] lineaGastoFamiliaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto familias associated with the linea gasto categoria, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoFamilias the linea gasto familias to be associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoFamilias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gastos associated with the linea gasto categoria.
	*
	* @param pk the primary key of the linea gasto categoria
	* @return the linea gastos associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gastos associated with the linea gasto categoria.
	*
	* @param pk the primary key of the linea gasto categoria
	* @return the number of linea gastos associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public int getLineaGastosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto is associated with the linea gasto categoria.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoPK the primary key of the linea gasto
	* @return <code>true</code> if the linea gasto is associated with the linea gasto categoria; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto categoria has any linea gastos associated with it.
	*
	* @param pk the primary key of the linea gasto categoria to check for associations with linea gastos
	* @return <code>true</code> if the linea gasto categoria has any linea gastos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto categoria and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto categoria and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto categoria and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto categoria and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the linea gasto categoria and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria to clear the associated linea gastos from
	* @throws SystemException if a system exception occurred
	*/
	public void clearLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto categoria and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto categoria and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto categoria and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto categoria and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gastos associated with the linea gasto categoria, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastoPKs the primary keys of the linea gastos to be associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gastos associated with the linea gasto categoria, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto categoria
	* @param lineaGastos the linea gastos to be associated with the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;
}