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

import es.davinciti.liferay.model.LineaGasto;

/**
 * The persistence interface for the linea gasto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoPersistenceImpl
 * @see LineaGastoUtil
 * @generated
 */
public interface LineaGastoPersistence extends BasePersistence<LineaGasto> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LineaGastoUtil} to access the linea gasto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the linea gastos where date = &#63;.
	*
	* @param date the date
	* @return the matching linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> findByDate(
		java.lang.String date)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the linea gastos where date = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param date the date
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @return the range of matching linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> findByDate(
		java.lang.String date, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gastos where date = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param date the date
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> findByDate(
		java.lang.String date, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first linea gasto in the ordered set where date = &#63;.
	*
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linea gasto
	* @throws es.davinciti.liferay.NoSuchLineaGastoException if a matching linea gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGasto findByDate_First(
		java.lang.String date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoException;

	/**
	* Returns the first linea gasto in the ordered set where date = &#63;.
	*
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linea gasto, or <code>null</code> if a matching linea gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGasto fetchByDate_First(
		java.lang.String date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last linea gasto in the ordered set where date = &#63;.
	*
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linea gasto
	* @throws es.davinciti.liferay.NoSuchLineaGastoException if a matching linea gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGasto findByDate_Last(
		java.lang.String date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoException;

	/**
	* Returns the last linea gasto in the ordered set where date = &#63;.
	*
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linea gasto, or <code>null</code> if a matching linea gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGasto fetchByDate_Last(
		java.lang.String date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the linea gastos before and after the current linea gasto in the ordered set where date = &#63;.
	*
	* @param lineagastoId the primary key of the current linea gasto
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next linea gasto
	* @throws es.davinciti.liferay.NoSuchLineaGastoException if a linea gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGasto[] findByDate_PrevAndNext(
		long lineagastoId, java.lang.String date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoException;

	/**
	* Removes all the linea gastos where date = &#63; from the database.
	*
	* @param date the date
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDate(java.lang.String date)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gastos where date = &#63;.
	*
	* @param date the date
	* @return the number of matching linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public int countByDate(java.lang.String date)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the linea gasto in the entity cache if it is enabled.
	*
	* @param lineaGasto the linea gasto
	*/
	public void cacheResult(es.davinciti.liferay.model.LineaGasto lineaGasto);

	/**
	* Caches the linea gastos in the entity cache if it is enabled.
	*
	* @param lineaGastos the linea gastos
	*/
	public void cacheResult(
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos);

	/**
	* Creates a new linea gasto with the primary key. Does not add the linea gasto to the database.
	*
	* @param lineagastoId the primary key for the new linea gasto
	* @return the new linea gasto
	*/
	public es.davinciti.liferay.model.LineaGasto create(long lineagastoId);

	/**
	* Removes the linea gasto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lineagastoId the primary key of the linea gasto
	* @return the linea gasto that was removed
	* @throws es.davinciti.liferay.NoSuchLineaGastoException if a linea gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGasto remove(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoException;

	public es.davinciti.liferay.model.LineaGasto updateImpl(
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the linea gasto with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoException} if it could not be found.
	*
	* @param lineagastoId the primary key of the linea gasto
	* @return the linea gasto
	* @throws es.davinciti.liferay.NoSuchLineaGastoException if a linea gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGasto findByPrimaryKey(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoException;

	/**
	* Returns the linea gasto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param lineagastoId the primary key of the linea gasto
	* @return the linea gasto, or <code>null</code> if a linea gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGasto fetchByPrimaryKey(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gastos.
	*
	* @return the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGasto> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gastos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the linea gastos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gastos.
	*
	* @return the number of linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the nota gastos associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the nota gastos associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the nota gastos associated with the linea gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @return the range of nota gastos associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the nota gastos associated with the linea gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nota gastos associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of nota gastos associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the number of nota gastos associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public int getNotaGastosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the nota gasto is associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastoPK the primary key of the nota gasto
	* @return <code>true</code> if the nota gasto is associated with the linea gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsNotaGasto(long pk, long notaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto has any nota gastos associated with it.
	*
	* @param pk the primary key of the linea gasto to check for associations with nota gastos
	* @return <code>true</code> if the linea gasto has any nota gastos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsNotaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastoPK the primary key of the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public void addNotaGasto(long pk, long notaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGasto the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public void addNotaGasto(long pk,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastoPKs the primary keys of the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public void addNotaGastos(long pk, long[] notaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastos the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public void addNotaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the linea gasto and its nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto to clear the associated nota gastos from
	* @throws SystemException if a system exception occurred
	*/
	public void clearNotaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastoPK the primary key of the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public void removeNotaGasto(long pk, long notaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGasto the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public void removeNotaGasto(long pk,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastoPKs the primary keys of the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public void removeNotaGastos(long pk, long[] notaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastos the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public void removeNotaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the nota gastos associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastoPKs the primary keys of the nota gastos to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setNotaGastos(long pk, long[] notaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the nota gastos associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastos the nota gastos to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setNotaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gasto pay modes associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the linea gasto pay modes associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> getLineaGastoPayModes(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the linea gasto pay modes associated with the linea gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @return the range of linea gasto pay modes associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> getLineaGastoPayModes(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gasto pay modes associated with the linea gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gasto pay modes associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> getLineaGastoPayModes(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto pay modes associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the number of linea gasto pay modes associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public int getLineaGastoPayModesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto pay mode is associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModePK the primary key of the linea gasto pay mode
	* @return <code>true</code> if the linea gasto pay mode is associated with the linea gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoPayMode(long pk, long lineaGastoPayModePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto has any linea gasto pay modes associated with it.
	*
	* @param pk the primary key of the linea gasto to check for associations with linea gasto pay modes
	* @return <code>true</code> if the linea gasto has any linea gasto pay modes associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoPayModes(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto pay mode. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModePK the primary key of the linea gasto pay mode
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoPayMode(long pk, long lineaGastoPayModePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto pay mode. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayMode the linea gasto pay mode
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoPayMode(long pk,
		es.davinciti.liferay.model.LineaGastoPayMode lineaGastoPayMode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto pay modes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModePKs the primary keys of the linea gasto pay modes
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoPayModes(long pk, long[] lineaGastoPayModePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto pay modes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModes the linea gasto pay modes
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoPayModes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> lineaGastoPayModes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the linea gasto and its linea gasto pay modes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto to clear the associated linea gasto pay modes from
	* @throws SystemException if a system exception occurred
	*/
	public void clearLineaGastoPayModes(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto pay mode. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModePK the primary key of the linea gasto pay mode
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoPayMode(long pk, long lineaGastoPayModePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto pay mode. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayMode the linea gasto pay mode
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoPayMode(long pk,
		es.davinciti.liferay.model.LineaGastoPayMode lineaGastoPayMode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto pay modes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModePKs the primary keys of the linea gasto pay modes
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoPayModes(long pk, long[] lineaGastoPayModePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto pay modes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModes the linea gasto pay modes
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoPayModes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> lineaGastoPayModes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto pay modes associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModePKs the primary keys of the linea gasto pay modes to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoPayModes(long pk, long[] lineaGastoPayModePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto pay modes associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModes the linea gasto pay modes to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoPayModes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> lineaGastoPayModes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the currencies associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the currencies associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.Currency> getCurrencies(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the currencies associated with the linea gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @return the range of currencies associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.Currency> getCurrencies(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the currencies associated with the linea gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of currencies associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.Currency> getCurrencies(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of currencies associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the number of currencies associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public int getCurrenciesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the currency is associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @param currencyPK the primary key of the currency
	* @return <code>true</code> if the currency is associated with the linea gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsCurrency(long pk, long currencyPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto has any currencies associated with it.
	*
	* @param pk the primary key of the linea gasto to check for associations with currencies
	* @return <code>true</code> if the linea gasto has any currencies associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsCurrencies(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the currency. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currencyPK the primary key of the currency
	* @throws SystemException if a system exception occurred
	*/
	public void addCurrency(long pk, long currencyPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the currency. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currency the currency
	* @throws SystemException if a system exception occurred
	*/
	public void addCurrency(long pk,
		es.davinciti.liferay.model.Currency currency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the currencies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currencyPKs the primary keys of the currencies
	* @throws SystemException if a system exception occurred
	*/
	public void addCurrencies(long pk, long[] currencyPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the currencies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currencies the currencies
	* @throws SystemException if a system exception occurred
	*/
	public void addCurrencies(long pk,
		java.util.List<es.davinciti.liferay.model.Currency> currencies)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the linea gasto and its currencies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto to clear the associated currencies from
	* @throws SystemException if a system exception occurred
	*/
	public void clearCurrencies(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the currency. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currencyPK the primary key of the currency
	* @throws SystemException if a system exception occurred
	*/
	public void removeCurrency(long pk, long currencyPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the currency. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currency the currency
	* @throws SystemException if a system exception occurred
	*/
	public void removeCurrency(long pk,
		es.davinciti.liferay.model.Currency currency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the currencies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currencyPKs the primary keys of the currencies
	* @throws SystemException if a system exception occurred
	*/
	public void removeCurrencies(long pk, long[] currencyPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the currencies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currencies the currencies
	* @throws SystemException if a system exception occurred
	*/
	public void removeCurrencies(long pk,
		java.util.List<es.davinciti.liferay.model.Currency> currencies)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the currencies associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currencyPKs the primary keys of the currencies to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setCurrencies(long pk, long[] currencyPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the currencies associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currencies the currencies to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setCurrencies(long pk,
		java.util.List<es.davinciti.liferay.model.Currency> currencies)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gasto familias associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the linea gasto familias associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the linea gasto familias associated with the linea gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @return the range of linea gasto familias associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gasto familias associated with the linea gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gasto familias associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto familias associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the number of linea gasto familias associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public int getLineaGastoFamiliasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto familia is associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	* @return <code>true</code> if the linea gasto familia is associated with the linea gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoFamilia(long pk, long lineaGastoFamiliaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto has any linea gasto familias associated with it.
	*
	* @param pk the primary key of the linea gasto to check for associations with linea gasto familias
	* @return <code>true</code> if the linea gasto has any linea gasto familias associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoFamilias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoFamilia(long pk, long lineaGastoFamiliaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamilia the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoFamilia(long pk,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoFamilias(long pk, long[] lineaGastoFamiliaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamilias the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoFamilias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the linea gasto and its linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto to clear the associated linea gasto familias from
	* @throws SystemException if a system exception occurred
	*/
	public void clearLineaGastoFamilias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoFamilia(long pk, long lineaGastoFamiliaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamilia the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoFamilia(long pk,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoFamilias(long pk, long[] lineaGastoFamiliaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamilias the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoFamilias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto familias associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoFamilias(long pk, long[] lineaGastoFamiliaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto familias associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamilias the linea gasto familias to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoFamilias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gasto categorias associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the linea gasto categorias associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the linea gasto categorias associated with the linea gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @return the range of linea gasto categorias associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gasto categorias associated with the linea gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gasto categorias associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto categorias associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the number of linea gasto categorias associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public int getLineaGastoCategoriasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto categoria is associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	* @return <code>true</code> if the linea gasto categoria is associated with the linea gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoCategoria(long pk,
		long lineaGastoCategoriaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto has any linea gasto categorias associated with it.
	*
	* @param pk the primary key of the linea gasto to check for associations with linea gasto categorias
	* @return <code>true</code> if the linea gasto has any linea gasto categorias associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoCategorias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoCategoria(long pk, long lineaGastoCategoriaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategoria the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoCategoria(long pk,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoCategorias(long pk, long[] lineaGastoCategoriaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategorias the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoCategorias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the linea gasto and its linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto to clear the associated linea gasto categorias from
	* @throws SystemException if a system exception occurred
	*/
	public void clearLineaGastoCategorias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoCategoria(long pk, long lineaGastoCategoriaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategoria the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoCategoria(long pk,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoCategorias(long pk,
		long[] lineaGastoCategoriaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategorias the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoCategorias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto categorias associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoCategorias(long pk, long[] lineaGastoCategoriaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto categorias associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategorias the linea gasto categorias to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoCategorias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gasto clientes associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the linea gasto clientes associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the linea gasto clientes associated with the linea gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @return the range of linea gasto clientes associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gasto clientes associated with the linea gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gasto clientes associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto clientes associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the number of linea gasto clientes associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public int getLineaGastoClientesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto cliente is associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientePK the primary key of the linea gasto cliente
	* @return <code>true</code> if the linea gasto cliente is associated with the linea gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoCliente(long pk, long lineaGastoClientePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto has any linea gasto clientes associated with it.
	*
	* @param pk the primary key of the linea gasto to check for associations with linea gasto clientes
	* @return <code>true</code> if the linea gasto has any linea gasto clientes associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoClientes(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientePK the primary key of the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoCliente(long pk, long lineaGastoClientePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCliente the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoCliente(long pk,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientePKs the primary keys of the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoClientes(long pk, long[] lineaGastoClientePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientes the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoClientes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the linea gasto and its linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto to clear the associated linea gasto clientes from
	* @throws SystemException if a system exception occurred
	*/
	public void clearLineaGastoClientes(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientePK the primary key of the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoCliente(long pk, long lineaGastoClientePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCliente the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoCliente(long pk,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientePKs the primary keys of the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoClientes(long pk, long[] lineaGastoClientePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientes the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoClientes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto clientes associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientePKs the primary keys of the linea gasto clientes to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoClientes(long pk, long[] lineaGastoClientePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto clientes associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientes the linea gasto clientes to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoClientes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gasto proyectos associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the linea gasto proyectos associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the linea gasto proyectos associated with the linea gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @return the range of linea gasto proyectos associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gasto proyectos associated with the linea gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto
	* @param start the lower bound of the range of linea gastos
	* @param end the upper bound of the range of linea gastos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gasto proyectos associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto proyectos associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the number of linea gasto proyectos associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public int getLineaGastoProyectosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto proyecto is associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	* @return <code>true</code> if the linea gasto proyecto is associated with the linea gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoProyecto(long pk, long lineaGastoProyectoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto has any linea gasto proyectos associated with it.
	*
	* @param pk the primary key of the linea gasto to check for associations with linea gasto proyectos
	* @return <code>true</code> if the linea gasto has any linea gasto proyectos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastoProyectos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoProyecto(long pk, long lineaGastoProyectoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyecto the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoProyecto(long pk,
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoProyectos(long pk, long[] lineaGastoProyectoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectos the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoProyectos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the linea gasto and its linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto to clear the associated linea gasto proyectos from
	* @throws SystemException if a system exception occurred
	*/
	public void clearLineaGastoProyectos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoProyecto(long pk, long lineaGastoProyectoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyecto the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoProyecto(long pk,
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoProyectos(long pk, long[] lineaGastoProyectoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectos the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastoProyectos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto proyectos associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoProyectos(long pk, long[] lineaGastoProyectoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gasto proyectos associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectos the linea gasto proyectos to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoProyectos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws com.liferay.portal.kernel.exception.SystemException;
}