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

import es.davinciti.liferay.model.LineaGasto;

import java.util.List;

/**
 * The persistence utility for the linea gasto service. This utility wraps {@link LineaGastoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoPersistence
 * @see LineaGastoPersistenceImpl
 * @generated
 */
public class LineaGastoUtil {
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
	public static void clearCache(LineaGasto lineaGasto) {
		getPersistence().clearCache(lineaGasto);
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
	public static List<LineaGasto> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LineaGasto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LineaGasto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LineaGasto update(LineaGasto lineaGasto)
		throws SystemException {
		return getPersistence().update(lineaGasto);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LineaGasto update(LineaGasto lineaGasto,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(lineaGasto, serviceContext);
	}

	/**
	* Returns all the linea gastos where date = &#63;.
	*
	* @param date the date
	* @return the matching linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> findByDate(
		java.lang.String date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDate(date);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> findByDate(
		java.lang.String date, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDate(date, start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> findByDate(
		java.lang.String date, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDate(date, start, end, orderByComparator);
	}

	/**
	* Returns the first linea gasto in the ordered set where date = &#63;.
	*
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linea gasto
	* @throws es.davinciti.liferay.NoSuchLineaGastoException if a matching linea gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGasto findByDate_First(
		java.lang.String date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoException {
		return getPersistence().findByDate_First(date, orderByComparator);
	}

	/**
	* Returns the first linea gasto in the ordered set where date = &#63;.
	*
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linea gasto, or <code>null</code> if a matching linea gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGasto fetchByDate_First(
		java.lang.String date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDate_First(date, orderByComparator);
	}

	/**
	* Returns the last linea gasto in the ordered set where date = &#63;.
	*
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linea gasto
	* @throws es.davinciti.liferay.NoSuchLineaGastoException if a matching linea gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGasto findByDate_Last(
		java.lang.String date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoException {
		return getPersistence().findByDate_Last(date, orderByComparator);
	}

	/**
	* Returns the last linea gasto in the ordered set where date = &#63;.
	*
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linea gasto, or <code>null</code> if a matching linea gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGasto fetchByDate_Last(
		java.lang.String date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDate_Last(date, orderByComparator);
	}

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
	public static es.davinciti.liferay.model.LineaGasto[] findByDate_PrevAndNext(
		long lineagastoId, java.lang.String date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoException {
		return getPersistence()
				   .findByDate_PrevAndNext(lineagastoId, date, orderByComparator);
	}

	/**
	* Removes all the linea gastos where date = &#63; from the database.
	*
	* @param date the date
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDate(java.lang.String date)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDate(date);
	}

	/**
	* Returns the number of linea gastos where date = &#63;.
	*
	* @param date the date
	* @return the number of matching linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDate(java.lang.String date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDate(date);
	}

	/**
	* Caches the linea gasto in the entity cache if it is enabled.
	*
	* @param lineaGasto the linea gasto
	*/
	public static void cacheResult(
		es.davinciti.liferay.model.LineaGasto lineaGasto) {
		getPersistence().cacheResult(lineaGasto);
	}

	/**
	* Caches the linea gastos in the entity cache if it is enabled.
	*
	* @param lineaGastos the linea gastos
	*/
	public static void cacheResult(
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos) {
		getPersistence().cacheResult(lineaGastos);
	}

	/**
	* Creates a new linea gasto with the primary key. Does not add the linea gasto to the database.
	*
	* @param lineagastoId the primary key for the new linea gasto
	* @return the new linea gasto
	*/
	public static es.davinciti.liferay.model.LineaGasto create(
		long lineagastoId) {
		return getPersistence().create(lineagastoId);
	}

	/**
	* Removes the linea gasto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lineagastoId the primary key of the linea gasto
	* @return the linea gasto that was removed
	* @throws es.davinciti.liferay.NoSuchLineaGastoException if a linea gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGasto remove(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoException {
		return getPersistence().remove(lineagastoId);
	}

	public static es.davinciti.liferay.model.LineaGasto updateImpl(
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(lineaGasto);
	}

	/**
	* Returns the linea gasto with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoException} if it could not be found.
	*
	* @param lineagastoId the primary key of the linea gasto
	* @return the linea gasto
	* @throws es.davinciti.liferay.NoSuchLineaGastoException if a linea gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGasto findByPrimaryKey(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoException {
		return getPersistence().findByPrimaryKey(lineagastoId);
	}

	/**
	* Returns the linea gasto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param lineagastoId the primary key of the linea gasto
	* @return the linea gasto, or <code>null</code> if a linea gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGasto fetchByPrimaryKey(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(lineagastoId);
	}

	/**
	* Returns all the linea gastos.
	*
	* @return the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the linea gastos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of linea gastos.
	*
	* @return the number of linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the nota gastos associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the nota gastos associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getNotaGastos(pk);
	}

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
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getNotaGastos(pk, start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getNotaGastos(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of nota gastos associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the number of nota gastos associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static int getNotaGastosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getNotaGastosSize(pk);
	}

	/**
	* Returns <code>true</code> if the nota gasto is associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastoPK the primary key of the nota gasto
	* @return <code>true</code> if the nota gasto is associated with the linea gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsNotaGasto(long pk, long notaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsNotaGasto(pk, notaGastoPK);
	}

	/**
	* Returns <code>true</code> if the linea gasto has any nota gastos associated with it.
	*
	* @param pk the primary key of the linea gasto to check for associations with nota gastos
	* @return <code>true</code> if the linea gasto has any nota gastos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsNotaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsNotaGastos(pk);
	}

	/**
	* Adds an association between the linea gasto and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastoPK the primary key of the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGasto(long pk, long notaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addNotaGasto(pk, notaGastoPK);
	}

	/**
	* Adds an association between the linea gasto and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGasto the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGasto(long pk,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addNotaGasto(pk, notaGasto);
	}

	/**
	* Adds an association between the linea gasto and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastoPKs the primary keys of the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastos(long pk, long[] notaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addNotaGastos(pk, notaGastoPKs);
	}

	/**
	* Adds an association between the linea gasto and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastos the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addNotaGastos(pk, notaGastos);
	}

	/**
	* Clears all associations between the linea gasto and its nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto to clear the associated nota gastos from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearNotaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearNotaGastos(pk);
	}

	/**
	* Removes the association between the linea gasto and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastoPK the primary key of the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeNotaGasto(long pk, long notaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeNotaGasto(pk, notaGastoPK);
	}

	/**
	* Removes the association between the linea gasto and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGasto the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeNotaGasto(long pk,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeNotaGasto(pk, notaGasto);
	}

	/**
	* Removes the association between the linea gasto and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastoPKs the primary keys of the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeNotaGastos(long pk, long[] notaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeNotaGastos(pk, notaGastoPKs);
	}

	/**
	* Removes the association between the linea gasto and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastos the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeNotaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeNotaGastos(pk, notaGastos);
	}

	/**
	* Sets the nota gastos associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastoPKs the primary keys of the nota gastos to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setNotaGastos(long pk, long[] notaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setNotaGastos(pk, notaGastoPKs);
	}

	/**
	* Sets the nota gastos associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param notaGastos the nota gastos to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setNotaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setNotaGastos(pk, notaGastos);
	}

	/**
	* Returns all the linea gasto pay modes associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the linea gasto pay modes associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> getLineaGastoPayModes(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoPayModes(pk);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> getLineaGastoPayModes(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoPayModes(pk, start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> getLineaGastoPayModes(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getLineaGastoPayModes(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of linea gasto pay modes associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the number of linea gasto pay modes associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoPayModesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoPayModesSize(pk);
	}

	/**
	* Returns <code>true</code> if the linea gasto pay mode is associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModePK the primary key of the linea gasto pay mode
	* @return <code>true</code> if the linea gasto pay mode is associated with the linea gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoPayMode(long pk,
		long lineaGastoPayModePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsLineaGastoPayMode(pk, lineaGastoPayModePK);
	}

	/**
	* Returns <code>true</code> if the linea gasto has any linea gasto pay modes associated with it.
	*
	* @param pk the primary key of the linea gasto to check for associations with linea gasto pay modes
	* @return <code>true</code> if the linea gasto has any linea gasto pay modes associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoPayModes(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGastoPayModes(pk);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto pay mode. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModePK the primary key of the linea gasto pay mode
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoPayMode(long pk, long lineaGastoPayModePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoPayMode(pk, lineaGastoPayModePK);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto pay mode. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayMode the linea gasto pay mode
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoPayMode(long pk,
		es.davinciti.liferay.model.LineaGastoPayMode lineaGastoPayMode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoPayMode(pk, lineaGastoPayMode);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto pay modes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModePKs the primary keys of the linea gasto pay modes
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoPayModes(long pk,
		long[] lineaGastoPayModePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoPayModes(pk, lineaGastoPayModePKs);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto pay modes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModes the linea gasto pay modes
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoPayModes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> lineaGastoPayModes)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoPayModes(pk, lineaGastoPayModes);
	}

	/**
	* Clears all associations between the linea gasto and its linea gasto pay modes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto to clear the associated linea gasto pay modes from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoPayModes(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearLineaGastoPayModes(pk);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto pay mode. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModePK the primary key of the linea gasto pay mode
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoPayMode(long pk, long lineaGastoPayModePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoPayMode(pk, lineaGastoPayModePK);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto pay mode. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayMode the linea gasto pay mode
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoPayMode(long pk,
		es.davinciti.liferay.model.LineaGastoPayMode lineaGastoPayMode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoPayMode(pk, lineaGastoPayMode);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto pay modes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModePKs the primary keys of the linea gasto pay modes
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoPayModes(long pk,
		long[] lineaGastoPayModePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoPayModes(pk, lineaGastoPayModePKs);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto pay modes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModes the linea gasto pay modes
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoPayModes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> lineaGastoPayModes)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoPayModes(pk, lineaGastoPayModes);
	}

	/**
	* Sets the linea gasto pay modes associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModePKs the primary keys of the linea gasto pay modes to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoPayModes(long pk,
		long[] lineaGastoPayModePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoPayModes(pk, lineaGastoPayModePKs);
	}

	/**
	* Sets the linea gasto pay modes associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoPayModes the linea gasto pay modes to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoPayModes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> lineaGastoPayModes)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoPayModes(pk, lineaGastoPayModes);
	}

	/**
	* Returns all the currencies associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the currencies associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.Currency> getCurrencies(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getCurrencies(pk);
	}

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
	public static java.util.List<es.davinciti.liferay.model.Currency> getCurrencies(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getCurrencies(pk, start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.Currency> getCurrencies(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getCurrencies(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of currencies associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the number of currencies associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static int getCurrenciesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getCurrenciesSize(pk);
	}

	/**
	* Returns <code>true</code> if the currency is associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @param currencyPK the primary key of the currency
	* @return <code>true</code> if the currency is associated with the linea gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsCurrency(long pk, long currencyPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsCurrency(pk, currencyPK);
	}

	/**
	* Returns <code>true</code> if the linea gasto has any currencies associated with it.
	*
	* @param pk the primary key of the linea gasto to check for associations with currencies
	* @return <code>true</code> if the linea gasto has any currencies associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsCurrencies(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsCurrencies(pk);
	}

	/**
	* Adds an association between the linea gasto and the currency. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currencyPK the primary key of the currency
	* @throws SystemException if a system exception occurred
	*/
	public static void addCurrency(long pk, long currencyPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addCurrency(pk, currencyPK);
	}

	/**
	* Adds an association between the linea gasto and the currency. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currency the currency
	* @throws SystemException if a system exception occurred
	*/
	public static void addCurrency(long pk,
		es.davinciti.liferay.model.Currency currency)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addCurrency(pk, currency);
	}

	/**
	* Adds an association between the linea gasto and the currencies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currencyPKs the primary keys of the currencies
	* @throws SystemException if a system exception occurred
	*/
	public static void addCurrencies(long pk, long[] currencyPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addCurrencies(pk, currencyPKs);
	}

	/**
	* Adds an association between the linea gasto and the currencies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currencies the currencies
	* @throws SystemException if a system exception occurred
	*/
	public static void addCurrencies(long pk,
		java.util.List<es.davinciti.liferay.model.Currency> currencies)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addCurrencies(pk, currencies);
	}

	/**
	* Clears all associations between the linea gasto and its currencies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto to clear the associated currencies from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearCurrencies(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearCurrencies(pk);
	}

	/**
	* Removes the association between the linea gasto and the currency. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currencyPK the primary key of the currency
	* @throws SystemException if a system exception occurred
	*/
	public static void removeCurrency(long pk, long currencyPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeCurrency(pk, currencyPK);
	}

	/**
	* Removes the association between the linea gasto and the currency. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currency the currency
	* @throws SystemException if a system exception occurred
	*/
	public static void removeCurrency(long pk,
		es.davinciti.liferay.model.Currency currency)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeCurrency(pk, currency);
	}

	/**
	* Removes the association between the linea gasto and the currencies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currencyPKs the primary keys of the currencies
	* @throws SystemException if a system exception occurred
	*/
	public static void removeCurrencies(long pk, long[] currencyPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeCurrencies(pk, currencyPKs);
	}

	/**
	* Removes the association between the linea gasto and the currencies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currencies the currencies
	* @throws SystemException if a system exception occurred
	*/
	public static void removeCurrencies(long pk,
		java.util.List<es.davinciti.liferay.model.Currency> currencies)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeCurrencies(pk, currencies);
	}

	/**
	* Sets the currencies associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currencyPKs the primary keys of the currencies to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setCurrencies(long pk, long[] currencyPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setCurrencies(pk, currencyPKs);
	}

	/**
	* Sets the currencies associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param currencies the currencies to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setCurrencies(long pk,
		java.util.List<es.davinciti.liferay.model.Currency> currencies)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setCurrencies(pk, currencies);
	}

	/**
	* Returns all the linea gasto familias associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the linea gasto familias associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoFamilias(pk);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoFamilias(pk, start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getLineaGastoFamilias(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of linea gasto familias associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the number of linea gasto familias associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoFamiliasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoFamiliasSize(pk);
	}

	/**
	* Returns <code>true</code> if the linea gasto familia is associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	* @return <code>true</code> if the linea gasto familia is associated with the linea gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoFamilia(long pk,
		long lineaGastoFamiliaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsLineaGastoFamilia(pk, lineaGastoFamiliaPK);
	}

	/**
	* Returns <code>true</code> if the linea gasto has any linea gasto familias associated with it.
	*
	* @param pk the primary key of the linea gasto to check for associations with linea gasto familias
	* @return <code>true</code> if the linea gasto has any linea gasto familias associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoFamilias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGastoFamilias(pk);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoFamilia(long pk, long lineaGastoFamiliaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoFamilia(pk, lineaGastoFamiliaPK);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamilia the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoFamilia(long pk,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoFamilia(pk, lineaGastoFamilia);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoFamilias(long pk,
		long[] lineaGastoFamiliaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoFamilias(pk, lineaGastoFamiliaPKs);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamilias the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoFamilias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoFamilias(pk, lineaGastoFamilias);
	}

	/**
	* Clears all associations between the linea gasto and its linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto to clear the associated linea gasto familias from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoFamilias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearLineaGastoFamilias(pk);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoFamilia(long pk, long lineaGastoFamiliaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoFamilia(pk, lineaGastoFamiliaPK);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamilia the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoFamilia(long pk,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoFamilia(pk, lineaGastoFamilia);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoFamilias(long pk,
		long[] lineaGastoFamiliaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoFamilias(pk, lineaGastoFamiliaPKs);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamilias the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoFamilias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoFamilias(pk, lineaGastoFamilias);
	}

	/**
	* Sets the linea gasto familias associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoFamilias(long pk,
		long[] lineaGastoFamiliaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoFamilias(pk, lineaGastoFamiliaPKs);
	}

	/**
	* Sets the linea gasto familias associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoFamilias the linea gasto familias to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoFamilias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoFamilias(pk, lineaGastoFamilias);
	}

	/**
	* Returns all the linea gasto categorias associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the linea gasto categorias associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoCategorias(pk);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoCategorias(pk, start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getLineaGastoCategorias(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of linea gasto categorias associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the number of linea gasto categorias associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoCategoriasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoCategoriasSize(pk);
	}

	/**
	* Returns <code>true</code> if the linea gasto categoria is associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	* @return <code>true</code> if the linea gasto categoria is associated with the linea gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoCategoria(long pk,
		long lineaGastoCategoriaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsLineaGastoCategoria(pk, lineaGastoCategoriaPK);
	}

	/**
	* Returns <code>true</code> if the linea gasto has any linea gasto categorias associated with it.
	*
	* @param pk the primary key of the linea gasto to check for associations with linea gasto categorias
	* @return <code>true</code> if the linea gasto has any linea gasto categorias associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoCategorias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGastoCategorias(pk);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCategoria(long pk,
		long lineaGastoCategoriaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoCategoria(pk, lineaGastoCategoriaPK);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategoria the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCategoria(long pk,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoCategoria(pk, lineaGastoCategoria);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCategorias(long pk,
		long[] lineaGastoCategoriaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoCategorias(pk, lineaGastoCategoriaPKs);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategorias the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCategorias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoCategorias(pk, lineaGastoCategorias);
	}

	/**
	* Clears all associations between the linea gasto and its linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto to clear the associated linea gasto categorias from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoCategorias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearLineaGastoCategorias(pk);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoCategoria(long pk,
		long lineaGastoCategoriaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoCategoria(pk, lineaGastoCategoriaPK);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategoria the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoCategoria(long pk,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoCategoria(pk, lineaGastoCategoria);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoCategorias(long pk,
		long[] lineaGastoCategoriaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoCategorias(pk, lineaGastoCategoriaPKs);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategorias the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoCategorias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoCategorias(pk, lineaGastoCategorias);
	}

	/**
	* Sets the linea gasto categorias associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoCategorias(long pk,
		long[] lineaGastoCategoriaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoCategorias(pk, lineaGastoCategoriaPKs);
	}

	/**
	* Sets the linea gasto categorias associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCategorias the linea gasto categorias to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoCategorias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoCategorias(pk, lineaGastoCategorias);
	}

	/**
	* Returns all the linea gasto clientes associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the linea gasto clientes associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoClientes(pk);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoClientes(pk, start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getLineaGastoClientes(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of linea gasto clientes associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the number of linea gasto clientes associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoClientesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoClientesSize(pk);
	}

	/**
	* Returns <code>true</code> if the linea gasto cliente is associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientePK the primary key of the linea gasto cliente
	* @return <code>true</code> if the linea gasto cliente is associated with the linea gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoCliente(long pk,
		long lineaGastoClientePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsLineaGastoCliente(pk, lineaGastoClientePK);
	}

	/**
	* Returns <code>true</code> if the linea gasto has any linea gasto clientes associated with it.
	*
	* @param pk the primary key of the linea gasto to check for associations with linea gasto clientes
	* @return <code>true</code> if the linea gasto has any linea gasto clientes associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoClientes(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGastoClientes(pk);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientePK the primary key of the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCliente(long pk, long lineaGastoClientePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoCliente(pk, lineaGastoClientePK);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCliente the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCliente(long pk,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoCliente(pk, lineaGastoCliente);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientePKs the primary keys of the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoClientes(long pk,
		long[] lineaGastoClientePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoClientes(pk, lineaGastoClientePKs);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientes the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoClientes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoClientes(pk, lineaGastoClientes);
	}

	/**
	* Clears all associations between the linea gasto and its linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto to clear the associated linea gasto clientes from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoClientes(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearLineaGastoClientes(pk);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientePK the primary key of the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoCliente(long pk, long lineaGastoClientePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoCliente(pk, lineaGastoClientePK);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoCliente the linea gasto cliente
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoCliente(long pk,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoCliente(pk, lineaGastoCliente);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientePKs the primary keys of the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoClientes(long pk,
		long[] lineaGastoClientePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoClientes(pk, lineaGastoClientePKs);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientes the linea gasto clientes
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoClientes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoClientes(pk, lineaGastoClientes);
	}

	/**
	* Sets the linea gasto clientes associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientePKs the primary keys of the linea gasto clientes to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoClientes(long pk,
		long[] lineaGastoClientePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoClientes(pk, lineaGastoClientePKs);
	}

	/**
	* Sets the linea gasto clientes associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoClientes the linea gasto clientes to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoClientes(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoClientes(pk, lineaGastoClientes);
	}

	/**
	* Returns all the linea gasto proyectos associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the linea gasto proyectos associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoProyectos(pk);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoProyectos(pk, start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getLineaGastoProyectos(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of linea gasto proyectos associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @return the number of linea gasto proyectos associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoProyectosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoProyectosSize(pk);
	}

	/**
	* Returns <code>true</code> if the linea gasto proyecto is associated with the linea gasto.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	* @return <code>true</code> if the linea gasto proyecto is associated with the linea gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoProyecto(long pk,
		long lineaGastoProyectoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsLineaGastoProyecto(pk, lineaGastoProyectoPK);
	}

	/**
	* Returns <code>true</code> if the linea gasto has any linea gasto proyectos associated with it.
	*
	* @param pk the primary key of the linea gasto to check for associations with linea gasto proyectos
	* @return <code>true</code> if the linea gasto has any linea gasto proyectos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoProyectos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGastoProyectos(pk);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoProyecto(long pk, long lineaGastoProyectoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoProyecto(pk, lineaGastoProyectoPK);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyecto the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoProyecto(long pk,
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoProyecto(pk, lineaGastoProyecto);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoProyectos(long pk,
		long[] lineaGastoProyectoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoProyectos(pk, lineaGastoProyectoPKs);
	}

	/**
	* Adds an association between the linea gasto and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectos the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoProyectos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoProyectos(pk, lineaGastoProyectos);
	}

	/**
	* Clears all associations between the linea gasto and its linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto to clear the associated linea gasto proyectos from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoProyectos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearLineaGastoProyectos(pk);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoProyecto(long pk,
		long lineaGastoProyectoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoProyecto(pk, lineaGastoProyectoPK);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyecto the linea gasto proyecto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoProyecto(long pk,
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoProyecto(pk, lineaGastoProyecto);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoProyectos(long pk,
		long[] lineaGastoProyectoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoProyectos(pk, lineaGastoProyectoPKs);
	}

	/**
	* Removes the association between the linea gasto and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectos the linea gasto proyectos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoProyectos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoProyectos(pk, lineaGastoProyectos);
	}

	/**
	* Sets the linea gasto proyectos associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoProyectos(long pk,
		long[] lineaGastoProyectoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoProyectos(pk, lineaGastoProyectoPKs);
	}

	/**
	* Sets the linea gasto proyectos associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto
	* @param lineaGastoProyectos the linea gasto proyectos to be associated with the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoProyectos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoProyectos(pk, lineaGastoProyectos);
	}

	public static LineaGastoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LineaGastoPersistence)PortletBeanLocatorUtil.locate(es.davinciti.liferay.service.ClpSerializer.getServletContextName(),
					LineaGastoPersistence.class.getName());

			ReferenceRegistry.registerReference(LineaGastoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LineaGastoPersistence persistence) {
	}

	private static LineaGastoPersistence _persistence;
}