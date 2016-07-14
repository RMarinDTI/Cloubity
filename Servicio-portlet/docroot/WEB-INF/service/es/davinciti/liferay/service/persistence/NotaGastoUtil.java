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

import es.davinciti.liferay.model.NotaGasto;

import java.util.List;

/**
 * The persistence utility for the nota gasto service. This utility wraps {@link NotaGastoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see NotaGastoPersistence
 * @see NotaGastoPersistenceImpl
 * @generated
 */
public class NotaGastoUtil {
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
	public static void clearCache(NotaGasto notaGasto) {
		getPersistence().clearCache(notaGasto);
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
	public static List<NotaGasto> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NotaGasto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NotaGasto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static NotaGasto update(NotaGasto notaGasto)
		throws SystemException {
		return getPersistence().update(notaGasto);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static NotaGasto update(NotaGasto notaGasto,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(notaGasto, serviceContext);
	}

	/**
	* Returns all the nota gastos where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the nota gastos where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of nota gastos
	* @param end the upper bound of the range of nota gastos (not inclusive)
	* @return the range of matching nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the nota gastos where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of nota gastos
	* @param end the upper bound of the range of nota gastos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first nota gasto in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nota gasto
	* @throws es.davinciti.liferay.NoSuchNotaGastoException if a matching nota gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchNotaGastoException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first nota gasto in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nota gasto, or <code>null</code> if a matching nota gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last nota gasto in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nota gasto
	* @throws es.davinciti.liferay.NoSuchNotaGastoException if a matching nota gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchNotaGastoException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last nota gasto in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nota gasto, or <code>null</code> if a matching nota gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the nota gastos before and after the current nota gasto in the ordered set where companyId = &#63;.
	*
	* @param notagastoId the primary key of the current nota gasto
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nota gasto
	* @throws es.davinciti.liferay.NoSuchNotaGastoException if a nota gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto[] findByCompanyId_PrevAndNext(
		long notagastoId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchNotaGastoException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(notagastoId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the nota gastos where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of nota gastos where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns all the nota gastos where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @return the matching nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> findByCompanyIdUserId(
		long companyId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyIdUserId(companyId, userId);
	}

	/**
	* Returns a range of all the nota gastos where companyId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param start the lower bound of the range of nota gastos
	* @param end the upper bound of the range of nota gastos (not inclusive)
	* @return the range of matching nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> findByCompanyIdUserId(
		long companyId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyIdUserId(companyId, userId, start, end);
	}

	/**
	* Returns an ordered range of all the nota gastos where companyId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param start the lower bound of the range of nota gastos
	* @param end the upper bound of the range of nota gastos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> findByCompanyIdUserId(
		long companyId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyIdUserId(companyId, userId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first nota gasto in the ordered set where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nota gasto
	* @throws es.davinciti.liferay.NoSuchNotaGastoException if a matching nota gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto findByCompanyIdUserId_First(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchNotaGastoException {
		return getPersistence()
				   .findByCompanyIdUserId_First(companyId, userId,
			orderByComparator);
	}

	/**
	* Returns the first nota gasto in the ordered set where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nota gasto, or <code>null</code> if a matching nota gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto fetchByCompanyIdUserId_First(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyIdUserId_First(companyId, userId,
			orderByComparator);
	}

	/**
	* Returns the last nota gasto in the ordered set where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nota gasto
	* @throws es.davinciti.liferay.NoSuchNotaGastoException if a matching nota gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto findByCompanyIdUserId_Last(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchNotaGastoException {
		return getPersistence()
				   .findByCompanyIdUserId_Last(companyId, userId,
			orderByComparator);
	}

	/**
	* Returns the last nota gasto in the ordered set where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nota gasto, or <code>null</code> if a matching nota gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto fetchByCompanyIdUserId_Last(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyIdUserId_Last(companyId, userId,
			orderByComparator);
	}

	/**
	* Returns the nota gastos before and after the current nota gasto in the ordered set where companyId = &#63; and userId = &#63;.
	*
	* @param notagastoId the primary key of the current nota gasto
	* @param companyId the company ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nota gasto
	* @throws es.davinciti.liferay.NoSuchNotaGastoException if a nota gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto[] findByCompanyIdUserId_PrevAndNext(
		long notagastoId, long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchNotaGastoException {
		return getPersistence()
				   .findByCompanyIdUserId_PrevAndNext(notagastoId, companyId,
			userId, orderByComparator);
	}

	/**
	* Removes all the nota gastos where companyId = &#63; and userId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyIdUserId(long companyId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyIdUserId(companyId, userId);
	}

	/**
	* Returns the number of nota gastos where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @return the number of matching nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyIdUserId(long companyId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyIdUserId(companyId, userId);
	}

	/**
	* Caches the nota gasto in the entity cache if it is enabled.
	*
	* @param notaGasto the nota gasto
	*/
	public static void cacheResult(
		es.davinciti.liferay.model.NotaGasto notaGasto) {
		getPersistence().cacheResult(notaGasto);
	}

	/**
	* Caches the nota gastos in the entity cache if it is enabled.
	*
	* @param notaGastos the nota gastos
	*/
	public static void cacheResult(
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos) {
		getPersistence().cacheResult(notaGastos);
	}

	/**
	* Creates a new nota gasto with the primary key. Does not add the nota gasto to the database.
	*
	* @param notagastoId the primary key for the new nota gasto
	* @return the new nota gasto
	*/
	public static es.davinciti.liferay.model.NotaGasto create(long notagastoId) {
		return getPersistence().create(notagastoId);
	}

	/**
	* Removes the nota gasto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param notagastoId the primary key of the nota gasto
	* @return the nota gasto that was removed
	* @throws es.davinciti.liferay.NoSuchNotaGastoException if a nota gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto remove(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchNotaGastoException {
		return getPersistence().remove(notagastoId);
	}

	public static es.davinciti.liferay.model.NotaGasto updateImpl(
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(notaGasto);
	}

	/**
	* Returns the nota gasto with the primary key or throws a {@link es.davinciti.liferay.NoSuchNotaGastoException} if it could not be found.
	*
	* @param notagastoId the primary key of the nota gasto
	* @return the nota gasto
	* @throws es.davinciti.liferay.NoSuchNotaGastoException if a nota gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto findByPrimaryKey(
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchNotaGastoException {
		return getPersistence().findByPrimaryKey(notagastoId);
	}

	/**
	* Returns the nota gasto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param notagastoId the primary key of the nota gasto
	* @return the nota gasto, or <code>null</code> if a nota gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto fetchByPrimaryKey(
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(notagastoId);
	}

	/**
	* Returns all the nota gastos.
	*
	* @return the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the nota gastos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nota gastos
	* @param end the upper bound of the range of nota gastos (not inclusive)
	* @return the range of nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the nota gastos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nota gastos
	* @param end the upper bound of the range of nota gastos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the nota gastos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of nota gastos.
	*
	* @return the number of nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the historico notas associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @return the historico notas associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.HistoricoNota> getHistoricoNotas(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getHistoricoNotas(pk);
	}

	/**
	* Returns a range of all the historico notas associated with the nota gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the nota gasto
	* @param start the lower bound of the range of nota gastos
	* @param end the upper bound of the range of nota gastos (not inclusive)
	* @return the range of historico notas associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.HistoricoNota> getHistoricoNotas(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getHistoricoNotas(pk, start, end);
	}

	/**
	* Returns an ordered range of all the historico notas associated with the nota gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the nota gasto
	* @param start the lower bound of the range of nota gastos
	* @param end the upper bound of the range of nota gastos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of historico notas associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.HistoricoNota> getHistoricoNotas(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getHistoricoNotas(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of historico notas associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @return the number of historico notas associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static int getHistoricoNotasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getHistoricoNotasSize(pk);
	}

	/**
	* Returns <code>true</code> if the historico nota is associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotaPK the primary key of the historico nota
	* @return <code>true</code> if the historico nota is associated with the nota gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsHistoricoNota(long pk, long historicoNotaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsHistoricoNota(pk, historicoNotaPK);
	}

	/**
	* Returns <code>true</code> if the nota gasto has any historico notas associated with it.
	*
	* @param pk the primary key of the nota gasto to check for associations with historico notas
	* @return <code>true</code> if the nota gasto has any historico notas associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsHistoricoNotas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsHistoricoNotas(pk);
	}

	/**
	* Adds an association between the nota gasto and the historico nota. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotaPK the primary key of the historico nota
	* @throws SystemException if a system exception occurred
	*/
	public static void addHistoricoNota(long pk, long historicoNotaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addHistoricoNota(pk, historicoNotaPK);
	}

	/**
	* Adds an association between the nota gasto and the historico nota. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNota the historico nota
	* @throws SystemException if a system exception occurred
	*/
	public static void addHistoricoNota(long pk,
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addHistoricoNota(pk, historicoNota);
	}

	/**
	* Adds an association between the nota gasto and the historico notas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotaPKs the primary keys of the historico notas
	* @throws SystemException if a system exception occurred
	*/
	public static void addHistoricoNotas(long pk, long[] historicoNotaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addHistoricoNotas(pk, historicoNotaPKs);
	}

	/**
	* Adds an association between the nota gasto and the historico notas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotas the historico notas
	* @throws SystemException if a system exception occurred
	*/
	public static void addHistoricoNotas(long pk,
		java.util.List<es.davinciti.liferay.model.HistoricoNota> historicoNotas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addHistoricoNotas(pk, historicoNotas);
	}

	/**
	* Clears all associations between the nota gasto and its historico notas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto to clear the associated historico notas from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearHistoricoNotas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearHistoricoNotas(pk);
	}

	/**
	* Removes the association between the nota gasto and the historico nota. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotaPK the primary key of the historico nota
	* @throws SystemException if a system exception occurred
	*/
	public static void removeHistoricoNota(long pk, long historicoNotaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeHistoricoNota(pk, historicoNotaPK);
	}

	/**
	* Removes the association between the nota gasto and the historico nota. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNota the historico nota
	* @throws SystemException if a system exception occurred
	*/
	public static void removeHistoricoNota(long pk,
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeHistoricoNota(pk, historicoNota);
	}

	/**
	* Removes the association between the nota gasto and the historico notas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotaPKs the primary keys of the historico notas
	* @throws SystemException if a system exception occurred
	*/
	public static void removeHistoricoNotas(long pk, long[] historicoNotaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeHistoricoNotas(pk, historicoNotaPKs);
	}

	/**
	* Removes the association between the nota gasto and the historico notas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotas the historico notas
	* @throws SystemException if a system exception occurred
	*/
	public static void removeHistoricoNotas(long pk,
		java.util.List<es.davinciti.liferay.model.HistoricoNota> historicoNotas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeHistoricoNotas(pk, historicoNotas);
	}

	/**
	* Sets the historico notas associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotaPKs the primary keys of the historico notas to be associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setHistoricoNotas(long pk, long[] historicoNotaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setHistoricoNotas(pk, historicoNotaPKs);
	}

	/**
	* Sets the historico notas associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotas the historico notas to be associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setHistoricoNotas(long pk,
		java.util.List<es.davinciti.liferay.model.HistoricoNota> historicoNotas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setHistoricoNotas(pk, historicoNotas);
	}

	/**
	* Returns all the linea gastos associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @return the linea gastos associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastos(pk);
	}

	/**
	* Returns a range of all the linea gastos associated with the nota gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the nota gasto
	* @param start the lower bound of the range of nota gastos
	* @param end the upper bound of the range of nota gastos (not inclusive)
	* @return the range of linea gastos associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastos(pk, start, end);
	}

	/**
	* Returns an ordered range of all the linea gastos associated with the nota gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the nota gasto
	* @param start the lower bound of the range of nota gastos
	* @param end the upper bound of the range of nota gastos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gastos associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastos(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of linea gastos associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @return the number of linea gastos associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastosSize(pk);
	}

	/**
	* Returns <code>true</code> if the linea gasto is associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastoPK the primary key of the linea gasto
	* @return <code>true</code> if the linea gasto is associated with the nota gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGasto(pk, lineaGastoPK);
	}

	/**
	* Returns <code>true</code> if the nota gasto has any linea gastos associated with it.
	*
	* @param pk the primary key of the nota gasto to check for associations with linea gastos
	* @return <code>true</code> if the nota gasto has any linea gastos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGastos(pk);
	}

	/**
	* Adds an association between the nota gasto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGasto(pk, lineaGastoPK);
	}

	/**
	* Adds an association between the nota gasto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGasto(pk, lineaGasto);
	}

	/**
	* Adds an association between the nota gasto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastos(pk, lineaGastoPKs);
	}

	/**
	* Adds an association between the nota gasto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastos(pk, lineaGastos);
	}

	/**
	* Clears all associations between the nota gasto and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto to clear the associated linea gastos from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearLineaGastos(pk);
	}

	/**
	* Removes the association between the nota gasto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGasto(pk, lineaGastoPK);
	}

	/**
	* Removes the association between the nota gasto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGasto(pk, lineaGasto);
	}

	/**
	* Removes the association between the nota gasto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastos(pk, lineaGastoPKs);
	}

	/**
	* Removes the association between the nota gasto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastos(pk, lineaGastos);
	}

	/**
	* Sets the linea gastos associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastoPKs the primary keys of the linea gastos to be associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastos(pk, lineaGastoPKs);
	}

	/**
	* Sets the linea gastos associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastos the linea gastos to be associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastos(pk, lineaGastos);
	}

	/**
	* Returns all the organization sage companies associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @return the organization sage companies associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> getOrganizationSageCompanies(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getOrganizationSageCompanies(pk);
	}

	/**
	* Returns a range of all the organization sage companies associated with the nota gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the nota gasto
	* @param start the lower bound of the range of nota gastos
	* @param end the upper bound of the range of nota gastos (not inclusive)
	* @return the range of organization sage companies associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> getOrganizationSageCompanies(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getOrganizationSageCompanies(pk, start, end);
	}

	/**
	* Returns an ordered range of all the organization sage companies associated with the nota gasto.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the nota gasto
	* @param start the lower bound of the range of nota gastos
	* @param end the upper bound of the range of nota gastos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of organization sage companies associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> getOrganizationSageCompanies(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getOrganizationSageCompanies(pk, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of organization sage companies associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @return the number of organization sage companies associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static int getOrganizationSageCompaniesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getOrganizationSageCompaniesSize(pk);
	}

	/**
	* Returns <code>true</code> if the organization sage company is associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanyPK the primary key of the organization sage company
	* @return <code>true</code> if the organization sage company is associated with the nota gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsOrganizationSageCompany(long pk,
		long organizationSageCompanyPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsOrganizationSageCompany(pk,
			organizationSageCompanyPK);
	}

	/**
	* Returns <code>true</code> if the nota gasto has any organization sage companies associated with it.
	*
	* @param pk the primary key of the nota gasto to check for associations with organization sage companies
	* @return <code>true</code> if the nota gasto has any organization sage companies associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsOrganizationSageCompanies(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsOrganizationSageCompanies(pk);
	}

	/**
	* Adds an association between the nota gasto and the organization sage company. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanyPK the primary key of the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public static void addOrganizationSageCompany(long pk,
		long organizationSageCompanyPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.addOrganizationSageCompany(pk, organizationSageCompanyPK);
	}

	/**
	* Adds an association between the nota gasto and the organization sage company. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompany the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public static void addOrganizationSageCompany(long pk,
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addOrganizationSageCompany(pk, organizationSageCompany);
	}

	/**
	* Adds an association between the nota gasto and the organization sage companies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanyPKs the primary keys of the organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public static void addOrganizationSageCompanies(long pk,
		long[] organizationSageCompanyPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.addOrganizationSageCompanies(pk, organizationSageCompanyPKs);
	}

	/**
	* Adds an association between the nota gasto and the organization sage companies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanies the organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public static void addOrganizationSageCompanies(long pk,
		java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> organizationSageCompanies)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.addOrganizationSageCompanies(pk, organizationSageCompanies);
	}

	/**
	* Clears all associations between the nota gasto and its organization sage companies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto to clear the associated organization sage companies from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearOrganizationSageCompanies(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearOrganizationSageCompanies(pk);
	}

	/**
	* Removes the association between the nota gasto and the organization sage company. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanyPK the primary key of the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public static void removeOrganizationSageCompany(long pk,
		long organizationSageCompanyPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeOrganizationSageCompany(pk, organizationSageCompanyPK);
	}

	/**
	* Removes the association between the nota gasto and the organization sage company. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompany the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public static void removeOrganizationSageCompany(long pk,
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeOrganizationSageCompany(pk, organizationSageCompany);
	}

	/**
	* Removes the association between the nota gasto and the organization sage companies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanyPKs the primary keys of the organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public static void removeOrganizationSageCompanies(long pk,
		long[] organizationSageCompanyPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeOrganizationSageCompanies(pk, organizationSageCompanyPKs);
	}

	/**
	* Removes the association between the nota gasto and the organization sage companies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanies the organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public static void removeOrganizationSageCompanies(long pk,
		java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> organizationSageCompanies)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeOrganizationSageCompanies(pk, organizationSageCompanies);
	}

	/**
	* Sets the organization sage companies associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanyPKs the primary keys of the organization sage companies to be associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setOrganizationSageCompanies(long pk,
		long[] organizationSageCompanyPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.setOrganizationSageCompanies(pk, organizationSageCompanyPKs);
	}

	/**
	* Sets the organization sage companies associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanies the organization sage companies to be associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void setOrganizationSageCompanies(long pk,
		java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> organizationSageCompanies)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.setOrganizationSageCompanies(pk, organizationSageCompanies);
	}

	public static NotaGastoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (NotaGastoPersistence)PortletBeanLocatorUtil.locate(es.davinciti.liferay.service.ClpSerializer.getServletContextName(),
					NotaGastoPersistence.class.getName());

			ReferenceRegistry.registerReference(NotaGastoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(NotaGastoPersistence persistence) {
	}

	private static NotaGastoPersistence _persistence;
}