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

package es.davinciti.liferay.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for LineaGasto. This utility wraps
 * {@link es.davinciti.liferay.service.impl.LineaGastoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Cmes
 * @see LineaGastoLocalService
 * @see es.davinciti.liferay.service.base.LineaGastoLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.impl.LineaGastoLocalServiceImpl
 * @generated
 */
public class LineaGastoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.davinciti.liferay.service.impl.LineaGastoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the linea gasto to the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGasto the linea gasto
	* @return the linea gasto that was added
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGasto addLineaGasto(
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addLineaGasto(lineaGasto);
	}

	/**
	* Creates a new linea gasto with the primary key. Does not add the linea gasto to the database.
	*
	* @param lineagastoId the primary key for the new linea gasto
	* @return the new linea gasto
	*/
	public static es.davinciti.liferay.model.LineaGasto createLineaGasto(
		long lineagastoId) {
		return getService().createLineaGasto(lineagastoId);
	}

	/**
	* Deletes the linea gasto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lineagastoId the primary key of the linea gasto
	* @return the linea gasto that was removed
	* @throws PortalException if a linea gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGasto deleteLineaGasto(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLineaGasto(lineagastoId);
	}

	/**
	* Deletes the linea gasto from the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGasto the linea gasto
	* @return the linea gasto that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGasto deleteLineaGasto(
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLineaGasto(lineaGasto);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static es.davinciti.liferay.model.LineaGasto fetchLineaGasto(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchLineaGasto(lineagastoId);
	}

	/**
	* Returns the linea gasto with the primary key.
	*
	* @param lineagastoId the primary key of the linea gasto
	* @return the linea gasto
	* @throws PortalException if a linea gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGasto getLineaGasto(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGasto(lineagastoId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastos(start, end);
	}

	/**
	* Returns the number of linea gastos.
	*
	* @return the number of linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastosCount();
	}

	/**
	* Updates the linea gasto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lineaGasto the linea gasto
	* @return the linea gasto that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGasto updateLineaGasto(
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLineaGasto(lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastoLineaGasto(long notagastoId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addNotaGastoLineaGasto(notagastoId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastoLineaGasto(long notagastoId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addNotaGastoLineaGasto(notagastoId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastoLineaGastos(long notagastoId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addNotaGastoLineaGastos(notagastoId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastoLineaGastos(long notagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addNotaGastoLineaGastos(notagastoId, LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearNotaGastoLineaGastos(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearNotaGastoLineaGastos(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteNotaGastoLineaGasto(long notagastoId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteNotaGastoLineaGasto(notagastoId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteNotaGastoLineaGasto(long notagastoId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteNotaGastoLineaGasto(notagastoId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteNotaGastoLineaGastos(long notagastoId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteNotaGastoLineaGastos(notagastoId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteNotaGastoLineaGastos(long notagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteNotaGastoLineaGastos(notagastoId, LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getNotaGastoLineaGastos(
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getNotaGastoLineaGastos(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getNotaGastoLineaGastos(
		long notagastoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getNotaGastoLineaGastos(notagastoId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getNotaGastoLineaGastos(
		long notagastoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getNotaGastoLineaGastos(notagastoId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getNotaGastoLineaGastosCount(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getNotaGastoLineaGastosCount(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasNotaGastoLineaGasto(long notagastoId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasNotaGastoLineaGasto(notagastoId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasNotaGastoLineaGastos(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasNotaGastoLineaGastos(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setNotaGastoLineaGastos(long notagastoId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setNotaGastoLineaGastos(notagastoId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoPayModeLineaGasto(long paymodeId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoPayModeLineaGasto(paymodeId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoPayModeLineaGasto(long paymodeId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoPayModeLineaGasto(paymodeId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoPayModeLineaGastos(long paymodeId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoPayModeLineaGastos(paymodeId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoPayModeLineaGastos(long paymodeId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoPayModeLineaGastos(paymodeId, LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoPayModeLineaGastos(long paymodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearLineaGastoPayModeLineaGastos(paymodeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoPayModeLineaGasto(long paymodeId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoPayModeLineaGasto(paymodeId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoPayModeLineaGasto(long paymodeId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoPayModeLineaGasto(paymodeId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoPayModeLineaGastos(long paymodeId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoPayModeLineaGastos(paymodeId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoPayModeLineaGastos(long paymodeId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoPayModeLineaGastos(paymodeId, LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoPayModeLineaGastos(
		long paymodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoPayModeLineaGastos(paymodeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoPayModeLineaGastos(
		long paymodeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoPayModeLineaGastos(paymodeId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoPayModeLineaGastos(
		long paymodeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoPayModeLineaGastos(paymodeId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoPayModeLineaGastosCount(long paymodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoPayModeLineaGastosCount(paymodeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoPayModeLineaGasto(long paymodeId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasLineaGastoPayModeLineaGasto(paymodeId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoPayModeLineaGastos(long paymodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasLineaGastoPayModeLineaGastos(paymodeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoPayModeLineaGastos(long paymodeId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setLineaGastoPayModeLineaGastos(paymodeId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addCurrencyLineaGasto(long currencyId, long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addCurrencyLineaGasto(currencyId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addCurrencyLineaGasto(long currencyId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addCurrencyLineaGasto(currencyId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addCurrencyLineaGastos(long currencyId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addCurrencyLineaGastos(currencyId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addCurrencyLineaGastos(long currencyId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addCurrencyLineaGastos(currencyId, LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearCurrencyLineaGastos(long currencyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearCurrencyLineaGastos(currencyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteCurrencyLineaGasto(long currencyId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCurrencyLineaGasto(currencyId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteCurrencyLineaGasto(long currencyId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCurrencyLineaGasto(currencyId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteCurrencyLineaGastos(long currencyId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCurrencyLineaGastos(currencyId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteCurrencyLineaGastos(long currencyId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCurrencyLineaGastos(currencyId, LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getCurrencyLineaGastos(
		long currencyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCurrencyLineaGastos(currencyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getCurrencyLineaGastos(
		long currencyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCurrencyLineaGastos(currencyId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getCurrencyLineaGastos(
		long currencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getCurrencyLineaGastos(currencyId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getCurrencyLineaGastosCount(long currencyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCurrencyLineaGastosCount(currencyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasCurrencyLineaGasto(long currencyId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasCurrencyLineaGasto(currencyId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasCurrencyLineaGastos(long currencyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasCurrencyLineaGastos(currencyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setCurrencyLineaGastos(long currencyId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setCurrencyLineaGastos(currencyId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoFamiliaLineaGasto(long familiaId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoFamiliaLineaGasto(familiaId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoFamiliaLineaGasto(long familiaId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoFamiliaLineaGasto(familiaId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoFamiliaLineaGastos(long familiaId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoFamiliaLineaGastos(familiaId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoFamiliaLineaGastos(long familiaId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoFamiliaLineaGastos(familiaId, LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoFamiliaLineaGastos(long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearLineaGastoFamiliaLineaGastos(familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoFamiliaLineaGasto(long familiaId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoFamiliaLineaGasto(familiaId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoFamiliaLineaGasto(long familiaId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoFamiliaLineaGasto(familiaId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoFamiliaLineaGastos(long familiaId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoFamiliaLineaGastos(familiaId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoFamiliaLineaGastos(long familiaId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoFamiliaLineaGastos(familiaId, LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoFamiliaLineaGastos(
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoFamiliaLineaGastos(familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoFamiliaLineaGastos(
		long familiaId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoFamiliaLineaGastos(familiaId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoFamiliaLineaGastos(
		long familiaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoFamiliaLineaGastos(familiaId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoFamiliaLineaGastosCount(long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoFamiliaLineaGastosCount(familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoFamiliaLineaGasto(long familiaId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasLineaGastoFamiliaLineaGasto(familiaId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoFamiliaLineaGastos(long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasLineaGastoFamiliaLineaGastos(familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoFamiliaLineaGastos(long familiaId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setLineaGastoFamiliaLineaGastos(familiaId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCategoriaLineaGasto(long categoriaId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoCategoriaLineaGasto(categoriaId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCategoriaLineaGasto(long categoriaId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoCategoriaLineaGasto(categoriaId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCategoriaLineaGastos(long categoriaId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoCategoriaLineaGastos(categoriaId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCategoriaLineaGastos(long categoriaId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoCategoriaLineaGastos(categoriaId, LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoCategoriaLineaGastos(long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearLineaGastoCategoriaLineaGastos(categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoCategoriaLineaGasto(long categoriaId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoCategoriaLineaGasto(categoriaId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoCategoriaLineaGasto(long categoriaId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoCategoriaLineaGasto(categoriaId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoCategoriaLineaGastos(long categoriaId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoCategoriaLineaGastos(categoriaId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoCategoriaLineaGastos(long categoriaId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoCategoriaLineaGastos(categoriaId, LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoCategoriaLineaGastos(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoCategoriaLineaGastos(categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoCategoriaLineaGastos(
		long categoriaId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoCategoriaLineaGastos(categoriaId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoCategoriaLineaGastos(
		long categoriaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoCategoriaLineaGastos(categoriaId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoCategoriaLineaGastosCount(long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoCategoriaLineaGastosCount(categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoCategoriaLineaGasto(long categoriaId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasLineaGastoCategoriaLineaGasto(categoriaId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoCategoriaLineaGastos(long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasLineaGastoCategoriaLineaGastos(categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoCategoriaLineaGastos(long categoriaId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.setLineaGastoCategoriaLineaGastos(categoriaId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoClienteLineaGasto(long clienteId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoClienteLineaGasto(clienteId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoClienteLineaGasto(long clienteId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoClienteLineaGasto(clienteId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoClienteLineaGastos(long clienteId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoClienteLineaGastos(clienteId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoClienteLineaGastos(long clienteId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoClienteLineaGastos(clienteId, LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoClienteLineaGastos(long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearLineaGastoClienteLineaGastos(clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoClienteLineaGasto(long clienteId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoClienteLineaGasto(clienteId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoClienteLineaGasto(long clienteId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoClienteLineaGasto(clienteId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoClienteLineaGastos(long clienteId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoClienteLineaGastos(clienteId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoClienteLineaGastos(long clienteId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoClienteLineaGastos(clienteId, LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoClienteLineaGastos(
		long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoClienteLineaGastos(clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoClienteLineaGastos(
		long clienteId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoClienteLineaGastos(clienteId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoClienteLineaGastos(
		long clienteId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoClienteLineaGastos(clienteId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoClienteLineaGastosCount(long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoClienteLineaGastosCount(clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoClienteLineaGasto(long clienteId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasLineaGastoClienteLineaGasto(clienteId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoClienteLineaGastos(long clienteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasLineaGastoClienteLineaGastos(clienteId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoClienteLineaGastos(long clienteId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setLineaGastoClienteLineaGastos(clienteId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoProyectoLineaGasto(long proyectoId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoProyectoLineaGasto(proyectoId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoProyectoLineaGasto(long proyectoId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoProyectoLineaGasto(proyectoId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoProyectoLineaGastos(long proyectoId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoProyectoLineaGastos(proyectoId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoProyectoLineaGastos(long proyectoId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoProyectoLineaGastos(proyectoId, LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoProyectoLineaGastos(long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearLineaGastoProyectoLineaGastos(proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoProyectoLineaGasto(long proyectoId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoProyectoLineaGasto(proyectoId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoProyectoLineaGasto(long proyectoId,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoProyectoLineaGasto(proyectoId, lineaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoProyectoLineaGastos(long proyectoId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoProyectoLineaGastos(proyectoId, lineagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoProyectoLineaGastos(long proyectoId,
		java.util.List<es.davinciti.liferay.model.LineaGasto> LineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoProyectoLineaGastos(proyectoId, LineaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoProyectoLineaGastos(
		long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoProyectoLineaGastos(proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoProyectoLineaGastos(
		long proyectoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoProyectoLineaGastos(proyectoId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastoProyectoLineaGastos(
		long proyectoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoProyectoLineaGastos(proyectoId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoProyectoLineaGastosCount(long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoProyectoLineaGastosCount(proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoProyectoLineaGasto(long proyectoId,
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasLineaGastoProyectoLineaGasto(proyectoId, lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoProyectoLineaGastos(long proyectoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasLineaGastoProyectoLineaGastos(proyectoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoProyectoLineaGastos(long proyectoId,
		long[] lineagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setLineaGastoProyectoLineaGastos(proyectoId, lineagastoIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<es.davinciti.liferay.model.LineaGasto> findByDate(
		java.lang.String date) {
		return getService().findByDate(date);
	}

	public static java.util.List<es.davinciti.liferay.model.LineaGasto> findByNotaGastoCategoryDate(
		long notagastoId, long lineagastoId) {
		return getService()
				   .findByNotaGastoCategoryDate(notagastoId, lineagastoId);
	}

	public static void clearService() {
		_service = null;
	}

	public static LineaGastoLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					LineaGastoLocalService.class.getName());

			if (invokableLocalService instanceof LineaGastoLocalService) {
				_service = (LineaGastoLocalService)invokableLocalService;
			}
			else {
				_service = new LineaGastoLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(LineaGastoLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(LineaGastoLocalService service) {
	}

	private static LineaGastoLocalService _service;
}