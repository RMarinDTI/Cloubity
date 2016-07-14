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

import es.davinciti.liferay.model.LineaGastoFamilia;

/**
 * The persistence interface for the linea gasto familia service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoFamiliaPersistenceImpl
 * @see LineaGastoFamiliaUtil
 * @generated
 */
public interface LineaGastoFamiliaPersistence extends BasePersistence<LineaGastoFamilia> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LineaGastoFamiliaUtil} to access the linea gasto familia persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the linea gasto familias where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the linea gasto familias where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of linea gasto familias
	* @param end the upper bound of the range of linea gasto familias (not inclusive)
	* @return the range of matching linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gasto familias where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of linea gasto familias
	* @param end the upper bound of the range of linea gasto familias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first linea gasto familia in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linea gasto familia
	* @throws es.davinciti.liferay.NoSuchLineaGastoFamiliaException if a matching linea gasto familia could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoFamilia findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoFamiliaException;

	/**
	* Returns the first linea gasto familia in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linea gasto familia, or <code>null</code> if a matching linea gasto familia could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoFamilia fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last linea gasto familia in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linea gasto familia
	* @throws es.davinciti.liferay.NoSuchLineaGastoFamiliaException if a matching linea gasto familia could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoFamilia findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoFamiliaException;

	/**
	* Returns the last linea gasto familia in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linea gasto familia, or <code>null</code> if a matching linea gasto familia could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoFamilia fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the linea gasto familias before and after the current linea gasto familia in the ordered set where companyId = &#63;.
	*
	* @param familiaId the primary key of the current linea gasto familia
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next linea gasto familia
	* @throws es.davinciti.liferay.NoSuchLineaGastoFamiliaException if a linea gasto familia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoFamilia[] findByCompanyId_PrevAndNext(
		long familiaId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoFamiliaException;

	/**
	* Removes all the linea gasto familias where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto familias where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the linea gasto familia in the entity cache if it is enabled.
	*
	* @param lineaGastoFamilia the linea gasto familia
	*/
	public void cacheResult(
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia);

	/**
	* Caches the linea gasto familias in the entity cache if it is enabled.
	*
	* @param lineaGastoFamilias the linea gasto familias
	*/
	public void cacheResult(
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias);

	/**
	* Creates a new linea gasto familia with the primary key. Does not add the linea gasto familia to the database.
	*
	* @param familiaId the primary key for the new linea gasto familia
	* @return the new linea gasto familia
	*/
	public es.davinciti.liferay.model.LineaGastoFamilia create(long familiaId);

	/**
	* Removes the linea gasto familia with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param familiaId the primary key of the linea gasto familia
	* @return the linea gasto familia that was removed
	* @throws es.davinciti.liferay.NoSuchLineaGastoFamiliaException if a linea gasto familia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoFamilia remove(long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoFamiliaException;

	public es.davinciti.liferay.model.LineaGastoFamilia updateImpl(
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the linea gasto familia with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoFamiliaException} if it could not be found.
	*
	* @param familiaId the primary key of the linea gasto familia
	* @return the linea gasto familia
	* @throws es.davinciti.liferay.NoSuchLineaGastoFamiliaException if a linea gasto familia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoFamilia findByPrimaryKey(
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoFamiliaException;

	/**
	* Returns the linea gasto familia with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param familiaId the primary key of the linea gasto familia
	* @return the linea gasto familia, or <code>null</code> if a linea gasto familia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoFamilia fetchByPrimaryKey(
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gasto familias.
	*
	* @return the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the linea gasto familias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linea gasto familias
	* @param end the upper bound of the range of linea gasto familias (not inclusive)
	* @return the range of linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gasto familias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linea gasto familias
	* @param end the upper bound of the range of linea gasto familias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the linea gasto familias from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto familias.
	*
	* @return the number of linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gastos associated with the linea gasto familia.
	*
	* @param pk the primary key of the linea gasto familia
	* @return the linea gastos associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the linea gastos associated with the linea gasto familia.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto familia
	* @param start the lower bound of the range of linea gasto familias
	* @param end the upper bound of the range of linea gasto familias (not inclusive)
	* @return the range of linea gastos associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gastos associated with the linea gasto familia.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto familia
	* @param start the lower bound of the range of linea gasto familias
	* @param end the upper bound of the range of linea gasto familias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gastos associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gastos associated with the linea gasto familia.
	*
	* @param pk the primary key of the linea gasto familia
	* @return the number of linea gastos associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public int getLineaGastosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto is associated with the linea gasto familia.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoPK the primary key of the linea gasto
	* @return <code>true</code> if the linea gasto is associated with the linea gasto familia; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto familia has any linea gastos associated with it.
	*
	* @param pk the primary key of the linea gasto familia to check for associations with linea gastos
	* @return <code>true</code> if the linea gasto familia has any linea gastos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto familia and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto familia and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto familia and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto familia and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the linea gasto familia and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia to clear the associated linea gastos from
	* @throws SystemException if a system exception occurred
	*/
	public void clearLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto familia and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto familia and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto familia and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto familia and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gastos associated with the linea gasto familia, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoPKs the primary keys of the linea gastos to be associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gastos associated with the linea gasto familia, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastos the linea gastos to be associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gasto categorias associated with the linea gasto familia.
	*
	* @param pk the primary key of the linea gasto familia
	* @return the linea gasto categorias associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the linea gasto categorias associated with the linea gasto familia.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto familia
	* @param start the lower bound of the range of linea gasto familias
	* @param end the upper bound of the range of linea gasto familias (not inclusive)
	* @return the range of linea gasto categorias associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gasto categorias associated with the linea gasto familia.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto familia
	* @param start the lower bound of the range of linea gasto familias
	* @param end the upper bound of the range of linea gasto familias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gasto categorias associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto categorias associated with the linea gasto familia.
	*
	* @param pk the primary key of the linea gasto familia
	* @return the number of linea gasto categorias associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public int getLineaGastoCategoriasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto categoria is associated with the linea gasto familia.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	* @return <code>true</code> if the linea gasto categoria is associated with the linea gasto familia; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoCategoria(long pk,
		long lineaGastoCategoriaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto familia has any linea gasto categorias associated with it.
	*
	* @param pk the primary key of the linea gasto familia to check for associations with linea gasto categorias
	* @return <code>true</code> if the linea gasto familia has any linea gasto categorias associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoCategorias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto familia and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoCategoria(long pk, long lineaGastoCategoriaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto familia and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategoria the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoCategoria(long pk,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto familia and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoCategorias(long pk, long[] lineaGastoCategoriaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto familia and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategorias the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoCategorias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the linea gasto familia and its linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia to clear the associated linea gasto categorias from
	* @throws SystemException if a system exception occurred
	*/
	public void clearLineaGastoCategorias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto familia and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoCategoria(long pk, long lineaGastoCategoriaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto familia and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategoria the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoCategoria(long pk,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto familia and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoCategorias(long pk,
		long[] lineaGastoCategoriaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto familia and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategorias the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoCategorias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto categorias associated with the linea gasto familia, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias to be associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoCategorias(long pk, long[] lineaGastoCategoriaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto categorias associated with the linea gasto familia, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategorias the linea gasto categorias to be associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoCategorias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException;
}