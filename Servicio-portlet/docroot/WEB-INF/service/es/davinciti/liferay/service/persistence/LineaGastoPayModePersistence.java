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

import es.davinciti.liferay.model.LineaGastoPayMode;

/**
 * The persistence interface for the linea gasto pay mode service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoPayModePersistenceImpl
 * @see LineaGastoPayModeUtil
 * @generated
 */
public interface LineaGastoPayModePersistence extends BasePersistence<LineaGastoPayMode> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LineaGastoPayModeUtil} to access the linea gasto pay mode persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the linea gasto pay modes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching linea gasto pay modes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the linea gasto pay modes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoPayModeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of linea gasto pay modes
	* @param end the upper bound of the range of linea gasto pay modes (not inclusive)
	* @return the range of matching linea gasto pay modes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gasto pay modes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoPayModeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of linea gasto pay modes
	* @param end the upper bound of the range of linea gasto pay modes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching linea gasto pay modes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first linea gasto pay mode in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linea gasto pay mode
	* @throws es.davinciti.liferay.NoSuchLineaGastoPayModeException if a matching linea gasto pay mode could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoPayMode findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoPayModeException;

	/**
	* Returns the first linea gasto pay mode in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching linea gasto pay mode, or <code>null</code> if a matching linea gasto pay mode could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoPayMode fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last linea gasto pay mode in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linea gasto pay mode
	* @throws es.davinciti.liferay.NoSuchLineaGastoPayModeException if a matching linea gasto pay mode could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoPayMode findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoPayModeException;

	/**
	* Returns the last linea gasto pay mode in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching linea gasto pay mode, or <code>null</code> if a matching linea gasto pay mode could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoPayMode fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the linea gasto pay modes before and after the current linea gasto pay mode in the ordered set where companyId = &#63;.
	*
	* @param paymodeId the primary key of the current linea gasto pay mode
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next linea gasto pay mode
	* @throws es.davinciti.liferay.NoSuchLineaGastoPayModeException if a linea gasto pay mode with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoPayMode[] findByCompanyId_PrevAndNext(
		long paymodeId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoPayModeException;

	/**
	* Removes all the linea gasto pay modes where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto pay modes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching linea gasto pay modes
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the linea gasto pay mode in the entity cache if it is enabled.
	*
	* @param lineaGastoPayMode the linea gasto pay mode
	*/
	public void cacheResult(
		es.davinciti.liferay.model.LineaGastoPayMode lineaGastoPayMode);

	/**
	* Caches the linea gasto pay modes in the entity cache if it is enabled.
	*
	* @param lineaGastoPayModes the linea gasto pay modes
	*/
	public void cacheResult(
		java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> lineaGastoPayModes);

	/**
	* Creates a new linea gasto pay mode with the primary key. Does not add the linea gasto pay mode to the database.
	*
	* @param paymodeId the primary key for the new linea gasto pay mode
	* @return the new linea gasto pay mode
	*/
	public es.davinciti.liferay.model.LineaGastoPayMode create(long paymodeId);

	/**
	* Removes the linea gasto pay mode with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paymodeId the primary key of the linea gasto pay mode
	* @return the linea gasto pay mode that was removed
	* @throws es.davinciti.liferay.NoSuchLineaGastoPayModeException if a linea gasto pay mode with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoPayMode remove(long paymodeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoPayModeException;

	public es.davinciti.liferay.model.LineaGastoPayMode updateImpl(
		es.davinciti.liferay.model.LineaGastoPayMode lineaGastoPayMode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the linea gasto pay mode with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoPayModeException} if it could not be found.
	*
	* @param paymodeId the primary key of the linea gasto pay mode
	* @return the linea gasto pay mode
	* @throws es.davinciti.liferay.NoSuchLineaGastoPayModeException if a linea gasto pay mode with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoPayMode findByPrimaryKey(
		long paymodeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchLineaGastoPayModeException;

	/**
	* Returns the linea gasto pay mode with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param paymodeId the primary key of the linea gasto pay mode
	* @return the linea gasto pay mode, or <code>null</code> if a linea gasto pay mode with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.LineaGastoPayMode fetchByPrimaryKey(
		long paymodeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gasto pay modes.
	*
	* @return the linea gasto pay modes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the linea gasto pay modes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoPayModeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linea gasto pay modes
	* @param end the upper bound of the range of linea gasto pay modes (not inclusive)
	* @return the range of linea gasto pay modes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gasto pay modes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoPayModeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linea gasto pay modes
	* @param end the upper bound of the range of linea gasto pay modes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gasto pay modes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the linea gasto pay modes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gasto pay modes.
	*
	* @return the number of linea gasto pay modes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gastos associated with the linea gasto pay mode.
	*
	* @param pk the primary key of the linea gasto pay mode
	* @return the linea gastos associated with the linea gasto pay mode
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the linea gastos associated with the linea gasto pay mode.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoPayModeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto pay mode
	* @param start the lower bound of the range of linea gasto pay modes
	* @param end the upper bound of the range of linea gasto pay modes (not inclusive)
	* @return the range of linea gastos associated with the linea gasto pay mode
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the linea gastos associated with the linea gasto pay mode.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoPayModeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the linea gasto pay mode
	* @param start the lower bound of the range of linea gasto pay modes
	* @param end the upper bound of the range of linea gasto pay modes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linea gastos associated with the linea gasto pay mode
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gastos associated with the linea gasto pay mode.
	*
	* @param pk the primary key of the linea gasto pay mode
	* @return the number of linea gastos associated with the linea gasto pay mode
	* @throws SystemException if a system exception occurred
	*/
	public int getLineaGastosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto is associated with the linea gasto pay mode.
	*
	* @param pk the primary key of the linea gasto pay mode
	* @param lineaGastoPK the primary key of the linea gasto
	* @return <code>true</code> if the linea gasto is associated with the linea gasto pay mode; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto pay mode has any linea gastos associated with it.
	*
	* @param pk the primary key of the linea gasto pay mode to check for associations with linea gastos
	* @return <code>true</code> if the linea gasto pay mode has any linea gastos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto pay mode and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto pay mode
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto pay mode and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto pay mode
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto pay mode and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto pay mode
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the linea gasto pay mode and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto pay mode
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the linea gasto pay mode and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto pay mode to clear the associated linea gastos from
	* @throws SystemException if a system exception occurred
	*/
	public void clearLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto pay mode and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto pay mode
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto pay mode and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto pay mode
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto pay mode and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto pay mode
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the linea gasto pay mode and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto pay mode
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gastos associated with the linea gasto pay mode, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto pay mode
	* @param lineaGastoPKs the primary keys of the linea gastos to be associated with the linea gasto pay mode
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gastos associated with the linea gasto pay mode, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the linea gasto pay mode
	* @param lineaGastos the linea gastos to be associated with the linea gasto pay mode
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;
}