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

import es.davinciti.liferay.model.LineaGastoFamilia;

import java.util.List;

/**
 * The persistence utility for the linea gasto familia service. This utility wraps {@link LineaGastoFamiliaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoFamiliaPersistence
 * @see LineaGastoFamiliaPersistenceImpl
 * @generated
 */
public class LineaGastoFamiliaUtil {
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
	public static void clearCache(LineaGastoFamilia lineaGastoFamilia) {
		getPersistence().clearCache(lineaGastoFamilia);
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
	public static List<LineaGastoFamilia> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LineaGastoFamilia> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LineaGastoFamilia> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LineaGastoFamilia update(LineaGastoFamilia lineaGastoFamilia)
		throws SystemException {
		return getPersistence().update(lineaGastoFamilia);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LineaGastoFamilia update(
		LineaGastoFamilia lineaGastoFamilia, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(lineaGastoFamilia, serviceContext);
	}

	/**
	* Returns all the linea gasto familias where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first linea gasto familia in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linea gasto familia
	* @throws es.davinciti.liferay.NoSuchLineaGastoFamiliaException if a matching linea gasto familia could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoFamilia findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoFamiliaException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first linea gasto familia in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linea gasto familia, or <code>null</code> if a matching linea gasto familia could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoFamilia fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last linea gasto familia in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linea gasto familia
	* @throws es.davinciti.liferay.NoSuchLineaGastoFamiliaException if a matching linea gasto familia could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoFamilia findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoFamiliaException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last linea gasto familia in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linea gasto familia, or <code>null</code> if a matching linea gasto familia could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoFamilia fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

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
	public static es.davinciti.liferay.model.LineaGastoFamilia[] findByCompanyId_PrevAndNext(
		long familiaId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoFamiliaException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(familiaId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the linea gasto familias where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of linea gasto familias where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Caches the linea gasto familia in the entity cache if it is enabled.
	*
	* @param lineaGastoFamilia the linea gasto familia
	*/
	public static void cacheResult(
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia) {
		getPersistence().cacheResult(lineaGastoFamilia);
	}

	/**
	* Caches the linea gasto familias in the entity cache if it is enabled.
	*
	* @param lineaGastoFamilias the linea gasto familias
	*/
	public static void cacheResult(
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias) {
		getPersistence().cacheResult(lineaGastoFamilias);
	}

	/**
	* Creates a new linea gasto familia with the primary key. Does not add the linea gasto familia to the database.
	*
	* @param familiaId the primary key for the new linea gasto familia
	* @return the new linea gasto familia
	*/
	public static es.davinciti.liferay.model.LineaGastoFamilia create(
		long familiaId) {
		return getPersistence().create(familiaId);
	}

	/**
	* Removes the linea gasto familia with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param familiaId the primary key of the linea gasto familia
	* @return the linea gasto familia that was removed
	* @throws es.davinciti.liferay.NoSuchLineaGastoFamiliaException if a linea gasto familia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoFamilia remove(
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoFamiliaException {
		return getPersistence().remove(familiaId);
	}

	public static es.davinciti.liferay.model.LineaGastoFamilia updateImpl(
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(lineaGastoFamilia);
	}

	/**
	* Returns the linea gasto familia with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoFamiliaException} if it could not be found.
	*
	* @param familiaId the primary key of the linea gasto familia
	* @return the linea gasto familia
	* @throws es.davinciti.liferay.NoSuchLineaGastoFamiliaException if a linea gasto familia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoFamilia findByPrimaryKey(
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoFamiliaException {
		return getPersistence().findByPrimaryKey(familiaId);
	}

	/**
	* Returns the linea gasto familia with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param familiaId the primary key of the linea gasto familia
	* @return the linea gasto familia, or <code>null</code> if a linea gasto familia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoFamilia fetchByPrimaryKey(
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(familiaId);
	}

	/**
	* Returns all the linea gasto familias.
	*
	* @return the linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the linea gasto familias from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of linea gasto familias.
	*
	* @return the number of linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the linea gastos associated with the linea gasto familia.
	*
	* @param pk the primary key of the linea gasto familia
	* @return the linea gastos associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastos(pk);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastos(pk, start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastos(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of linea gastos associated with the linea gasto familia.
	*
	* @param pk the primary key of the linea gasto familia
	* @return the number of linea gastos associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastosSize(pk);
	}

	/**
	* Returns <code>true</code> if the linea gasto is associated with the linea gasto familia.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoPK the primary key of the linea gasto
	* @return <code>true</code> if the linea gasto is associated with the linea gasto familia; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGasto(pk, lineaGastoPK);
	}

	/**
	* Returns <code>true</code> if the linea gasto familia has any linea gastos associated with it.
	*
	* @param pk the primary key of the linea gasto familia to check for associations with linea gastos
	* @return <code>true</code> if the linea gasto familia has any linea gastos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGastos(pk);
	}

	/**
	* Adds an association between the linea gasto familia and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGasto(pk, lineaGastoPK);
	}

	/**
	* Adds an association between the linea gasto familia and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGasto(pk, lineaGasto);
	}

	/**
	* Adds an association between the linea gasto familia and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastos(pk, lineaGastoPKs);
	}

	/**
	* Adds an association between the linea gasto familia and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastos(pk, lineaGastos);
	}

	/**
	* Clears all associations between the linea gasto familia and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia to clear the associated linea gastos from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearLineaGastos(pk);
	}

	/**
	* Removes the association between the linea gasto familia and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGasto(pk, lineaGastoPK);
	}

	/**
	* Removes the association between the linea gasto familia and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGasto(pk, lineaGasto);
	}

	/**
	* Removes the association between the linea gasto familia and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastos(pk, lineaGastoPKs);
	}

	/**
	* Removes the association between the linea gasto familia and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastos(pk, lineaGastos);
	}

	/**
	* Sets the linea gastos associated with the linea gasto familia, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoPKs the primary keys of the linea gastos to be associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastos(pk, lineaGastoPKs);
	}

	/**
	* Sets the linea gastos associated with the linea gasto familia, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastos the linea gastos to be associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastos(pk, lineaGastos);
	}

	/**
	* Returns all the linea gasto categorias associated with the linea gasto familia.
	*
	* @param pk the primary key of the linea gasto familia
	* @return the linea gasto categorias associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoCategorias(pk);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoCategorias(pk, start, end);
	}

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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getLineaGastoCategorias(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of linea gasto categorias associated with the linea gasto familia.
	*
	* @param pk the primary key of the linea gasto familia
	* @return the number of linea gasto categorias associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoCategoriasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLineaGastoCategoriasSize(pk);
	}

	/**
	* Returns <code>true</code> if the linea gasto categoria is associated with the linea gasto familia.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	* @return <code>true</code> if the linea gasto categoria is associated with the linea gasto familia; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoCategoria(long pk,
		long lineaGastoCategoriaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsLineaGastoCategoria(pk, lineaGastoCategoriaPK);
	}

	/**
	* Returns <code>true</code> if the linea gasto familia has any linea gasto categorias associated with it.
	*
	* @param pk the primary key of the linea gasto familia to check for associations with linea gasto categorias
	* @return <code>true</code> if the linea gasto familia has any linea gasto categorias associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLineaGastoCategorias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLineaGastoCategorias(pk);
	}

	/**
	* Adds an association between the linea gasto familia and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCategoria(long pk,
		long lineaGastoCategoriaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoCategoria(pk, lineaGastoCategoriaPK);
	}

	/**
	* Adds an association between the linea gasto familia and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategoria the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCategoria(long pk,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoCategoria(pk, lineaGastoCategoria);
	}

	/**
	* Adds an association between the linea gasto familia and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCategorias(long pk,
		long[] lineaGastoCategoriaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoCategorias(pk, lineaGastoCategoriaPKs);
	}

	/**
	* Adds an association between the linea gasto familia and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategorias the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCategorias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addLineaGastoCategorias(pk, lineaGastoCategorias);
	}

	/**
	* Clears all associations between the linea gasto familia and its linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia to clear the associated linea gasto categorias from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoCategorias(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearLineaGastoCategorias(pk);
	}

	/**
	* Removes the association between the linea gasto familia and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoCategoria(long pk,
		long lineaGastoCategoriaPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoCategoria(pk, lineaGastoCategoriaPK);
	}

	/**
	* Removes the association between the linea gasto familia and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategoria the linea gasto categoria
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoCategoria(long pk,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoCategoria(pk, lineaGastoCategoria);
	}

	/**
	* Removes the association between the linea gasto familia and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoCategorias(long pk,
		long[] lineaGastoCategoriaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoCategorias(pk, lineaGastoCategoriaPKs);
	}

	/**
	* Removes the association between the linea gasto familia and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategorias the linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public static void removeLineaGastoCategorias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeLineaGastoCategorias(pk, lineaGastoCategorias);
	}

	/**
	* Sets the linea gasto categorias associated with the linea gasto familia, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias to be associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoCategorias(long pk,
		long[] lineaGastoCategoriaPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoCategorias(pk, lineaGastoCategoriaPKs);
	}

	/**
	* Sets the linea gasto categorias associated with the linea gasto familia, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto familia
	* @param lineaGastoCategorias the linea gasto categorias to be associated with the linea gasto familia
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoCategorias(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setLineaGastoCategorias(pk, lineaGastoCategorias);
	}

	public static LineaGastoFamiliaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LineaGastoFamiliaPersistence)PortletBeanLocatorUtil.locate(es.davinciti.liferay.service.ClpSerializer.getServletContextName(),
					LineaGastoFamiliaPersistence.class.getName());

			ReferenceRegistry.registerReference(LineaGastoFamiliaUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LineaGastoFamiliaPersistence persistence) {
	}

	private static LineaGastoFamiliaPersistence _persistence;
}