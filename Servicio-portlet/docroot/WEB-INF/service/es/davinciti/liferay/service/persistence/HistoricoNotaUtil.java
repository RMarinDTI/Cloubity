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

import es.davinciti.liferay.model.HistoricoNota;

import java.util.List;

/**
 * The persistence utility for the historico nota service. This utility wraps {@link HistoricoNotaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see HistoricoNotaPersistence
 * @see HistoricoNotaPersistenceImpl
 * @generated
 */
public class HistoricoNotaUtil {
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
	public static void clearCache(HistoricoNota historicoNota) {
		getPersistence().clearCache(historicoNota);
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
	public static List<HistoricoNota> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HistoricoNota> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HistoricoNota> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static HistoricoNota update(HistoricoNota historicoNota)
		throws SystemException {
		return getPersistence().update(historicoNota);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static HistoricoNota update(HistoricoNota historicoNota,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(historicoNota, serviceContext);
	}

	/**
	* Caches the historico nota in the entity cache if it is enabled.
	*
	* @param historicoNota the historico nota
	*/
	public static void cacheResult(
		es.davinciti.liferay.model.HistoricoNota historicoNota) {
		getPersistence().cacheResult(historicoNota);
	}

	/**
	* Caches the historico notas in the entity cache if it is enabled.
	*
	* @param historicoNotas the historico notas
	*/
	public static void cacheResult(
		java.util.List<es.davinciti.liferay.model.HistoricoNota> historicoNotas) {
		getPersistence().cacheResult(historicoNotas);
	}

	/**
	* Creates a new historico nota with the primary key. Does not add the historico nota to the database.
	*
	* @param historiconotaId the primary key for the new historico nota
	* @return the new historico nota
	*/
	public static es.davinciti.liferay.model.HistoricoNota create(
		long historiconotaId) {
		return getPersistence().create(historiconotaId);
	}

	/**
	* Removes the historico nota with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param historiconotaId the primary key of the historico nota
	* @return the historico nota that was removed
	* @throws es.davinciti.liferay.NoSuchHistoricoNotaException if a historico nota with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.HistoricoNota remove(
		long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchHistoricoNotaException {
		return getPersistence().remove(historiconotaId);
	}

	public static es.davinciti.liferay.model.HistoricoNota updateImpl(
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(historicoNota);
	}

	/**
	* Returns the historico nota with the primary key or throws a {@link es.davinciti.liferay.NoSuchHistoricoNotaException} if it could not be found.
	*
	* @param historiconotaId the primary key of the historico nota
	* @return the historico nota
	* @throws es.davinciti.liferay.NoSuchHistoricoNotaException if a historico nota with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.HistoricoNota findByPrimaryKey(
		long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchHistoricoNotaException {
		return getPersistence().findByPrimaryKey(historiconotaId);
	}

	/**
	* Returns the historico nota with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param historiconotaId the primary key of the historico nota
	* @return the historico nota, or <code>null</code> if a historico nota with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.HistoricoNota fetchByPrimaryKey(
		long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(historiconotaId);
	}

	/**
	* Returns all the historico notas.
	*
	* @return the historico notas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.HistoricoNota> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the historico notas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.HistoricoNotaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of historico notas
	* @param end the upper bound of the range of historico notas (not inclusive)
	* @return the range of historico notas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.HistoricoNota> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the historico notas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.HistoricoNotaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of historico notas
	* @param end the upper bound of the range of historico notas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of historico notas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.HistoricoNota> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the historico notas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of historico notas.
	*
	* @return the number of historico notas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the nota gastos associated with the historico nota.
	*
	* @param pk the primary key of the historico nota
	* @return the nota gastos associated with the historico nota
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getNotaGastos(pk);
	}

	/**
	* Returns a range of all the nota gastos associated with the historico nota.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.HistoricoNotaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the historico nota
	* @param start the lower bound of the range of historico notas
	* @param end the upper bound of the range of historico notas (not inclusive)
	* @return the range of nota gastos associated with the historico nota
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getNotaGastos(pk, start, end);
	}

	/**
	* Returns an ordered range of all the nota gastos associated with the historico nota.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.HistoricoNotaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the historico nota
	* @param start the lower bound of the range of historico notas
	* @param end the upper bound of the range of historico notas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nota gastos associated with the historico nota
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getNotaGastos(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of nota gastos associated with the historico nota.
	*
	* @param pk the primary key of the historico nota
	* @return the number of nota gastos associated with the historico nota
	* @throws SystemException if a system exception occurred
	*/
	public static int getNotaGastosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getNotaGastosSize(pk);
	}

	/**
	* Returns <code>true</code> if the nota gasto is associated with the historico nota.
	*
	* @param pk the primary key of the historico nota
	* @param notaGastoPK the primary key of the nota gasto
	* @return <code>true</code> if the nota gasto is associated with the historico nota; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsNotaGasto(long pk, long notaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsNotaGasto(pk, notaGastoPK);
	}

	/**
	* Returns <code>true</code> if the historico nota has any nota gastos associated with it.
	*
	* @param pk the primary key of the historico nota to check for associations with nota gastos
	* @return <code>true</code> if the historico nota has any nota gastos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsNotaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsNotaGastos(pk);
	}

	/**
	* Adds an association between the historico nota and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the historico nota
	* @param notaGastoPK the primary key of the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGasto(long pk, long notaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addNotaGasto(pk, notaGastoPK);
	}

	/**
	* Adds an association between the historico nota and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the historico nota
	* @param notaGasto the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGasto(long pk,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addNotaGasto(pk, notaGasto);
	}

	/**
	* Adds an association between the historico nota and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the historico nota
	* @param notaGastoPKs the primary keys of the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastos(long pk, long[] notaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addNotaGastos(pk, notaGastoPKs);
	}

	/**
	* Adds an association between the historico nota and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the historico nota
	* @param notaGastos the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addNotaGastos(pk, notaGastos);
	}

	/**
	* Clears all associations between the historico nota and its nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the historico nota to clear the associated nota gastos from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearNotaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearNotaGastos(pk);
	}

	/**
	* Removes the association between the historico nota and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the historico nota
	* @param notaGastoPK the primary key of the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeNotaGasto(long pk, long notaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeNotaGasto(pk, notaGastoPK);
	}

	/**
	* Removes the association between the historico nota and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the historico nota
	* @param notaGasto the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeNotaGasto(long pk,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeNotaGasto(pk, notaGasto);
	}

	/**
	* Removes the association between the historico nota and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the historico nota
	* @param notaGastoPKs the primary keys of the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeNotaGastos(long pk, long[] notaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeNotaGastos(pk, notaGastoPKs);
	}

	/**
	* Removes the association between the historico nota and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the historico nota
	* @param notaGastos the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeNotaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeNotaGastos(pk, notaGastos);
	}

	/**
	* Sets the nota gastos associated with the historico nota, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the historico nota
	* @param notaGastoPKs the primary keys of the nota gastos to be associated with the historico nota
	* @throws SystemException if a system exception occurred
	*/
	public static void setNotaGastos(long pk, long[] notaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setNotaGastos(pk, notaGastoPKs);
	}

	/**
	* Sets the nota gastos associated with the historico nota, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the historico nota
	* @param notaGastos the nota gastos to be associated with the historico nota
	* @throws SystemException if a system exception occurred
	*/
	public static void setNotaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setNotaGastos(pk, notaGastos);
	}

	public static HistoricoNotaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (HistoricoNotaPersistence)PortletBeanLocatorUtil.locate(es.davinciti.liferay.service.ClpSerializer.getServletContextName(),
					HistoricoNotaPersistence.class.getName());

			ReferenceRegistry.registerReference(HistoricoNotaUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(HistoricoNotaPersistence persistence) {
	}

	private static HistoricoNotaPersistence _persistence;
}