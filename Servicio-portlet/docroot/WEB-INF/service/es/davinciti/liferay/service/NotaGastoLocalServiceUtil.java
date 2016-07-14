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
 * Provides the local service utility for NotaGasto. This utility wraps
 * {@link es.davinciti.liferay.service.impl.NotaGastoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Cmes
 * @see NotaGastoLocalService
 * @see es.davinciti.liferay.service.base.NotaGastoLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.impl.NotaGastoLocalServiceImpl
 * @generated
 */
public class NotaGastoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.davinciti.liferay.service.impl.NotaGastoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the nota gasto to the database. Also notifies the appropriate model listeners.
	*
	* @param notaGasto the nota gasto
	* @return the nota gasto that was added
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto addNotaGasto(
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addNotaGasto(notaGasto);
	}

	/**
	* Creates a new nota gasto with the primary key. Does not add the nota gasto to the database.
	*
	* @param notagastoId the primary key for the new nota gasto
	* @return the new nota gasto
	*/
	public static es.davinciti.liferay.model.NotaGasto createNotaGasto(
		long notagastoId) {
		return getService().createNotaGasto(notagastoId);
	}

	/**
	* Deletes the nota gasto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param notagastoId the primary key of the nota gasto
	* @return the nota gasto that was removed
	* @throws PortalException if a nota gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto deleteNotaGasto(
		long notagastoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteNotaGasto(notagastoId);
	}

	/**
	* Deletes the nota gasto from the database. Also notifies the appropriate model listeners.
	*
	* @param notaGasto the nota gasto
	* @return the nota gasto that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto deleteNotaGasto(
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteNotaGasto(notaGasto);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static es.davinciti.liferay.model.NotaGasto fetchNotaGasto(
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchNotaGasto(notagastoId);
	}

	/**
	* Returns the nota gasto with the primary key.
	*
	* @param notagastoId the primary key of the nota gasto
	* @return the nota gasto
	* @throws PortalException if a nota gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto getNotaGasto(
		long notagastoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getNotaGasto(notagastoId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getNotaGastos(start, end);
	}

	/**
	* Returns the number of nota gastos.
	*
	* @return the number of nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public static int getNotaGastosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getNotaGastosCount();
	}

	/**
	* Updates the nota gasto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param notaGasto the nota gasto
	* @return the nota gasto that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.NotaGasto updateNotaGasto(
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateNotaGasto(notaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addHistoricoNotaNotaGasto(long historiconotaId,
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addHistoricoNotaNotaGasto(historiconotaId, notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addHistoricoNotaNotaGasto(long historiconotaId,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addHistoricoNotaNotaGasto(historiconotaId, notaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addHistoricoNotaNotaGastos(long historiconotaId,
		long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addHistoricoNotaNotaGastos(historiconotaId, notagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addHistoricoNotaNotaGastos(long historiconotaId,
		java.util.List<es.davinciti.liferay.model.NotaGasto> NotaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addHistoricoNotaNotaGastos(historiconotaId, NotaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearHistoricoNotaNotaGastos(long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearHistoricoNotaNotaGastos(historiconotaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteHistoricoNotaNotaGasto(long historiconotaId,
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteHistoricoNotaNotaGasto(historiconotaId, notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteHistoricoNotaNotaGasto(long historiconotaId,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteHistoricoNotaNotaGasto(historiconotaId, notaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteHistoricoNotaNotaGastos(long historiconotaId,
		long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteHistoricoNotaNotaGastos(historiconotaId, notagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteHistoricoNotaNotaGastos(long historiconotaId,
		java.util.List<es.davinciti.liferay.model.NotaGasto> NotaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteHistoricoNotaNotaGastos(historiconotaId, NotaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getHistoricoNotaNotaGastos(
		long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getHistoricoNotaNotaGastos(historiconotaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getHistoricoNotaNotaGastos(
		long historiconotaId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getHistoricoNotaNotaGastos(historiconotaId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getHistoricoNotaNotaGastos(
		long historiconotaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getHistoricoNotaNotaGastos(historiconotaId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getHistoricoNotaNotaGastosCount(long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getHistoricoNotaNotaGastosCount(historiconotaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasHistoricoNotaNotaGasto(long historiconotaId,
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasHistoricoNotaNotaGasto(historiconotaId, notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasHistoricoNotaNotaGastos(long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasHistoricoNotaNotaGastos(historiconotaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setHistoricoNotaNotaGastos(long historiconotaId,
		long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setHistoricoNotaNotaGastos(historiconotaId, notagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoNotaGasto(long lineagastoId,
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoNotaGasto(lineagastoId, notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoNotaGasto(long lineagastoId,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoNotaGasto(lineagastoId, notaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoNotaGastos(long lineagastoId,
		long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoNotaGastos(lineagastoId, notagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoNotaGastos(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.NotaGasto> NotaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoNotaGastos(lineagastoId, NotaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoNotaGastos(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearLineaGastoNotaGastos(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoNotaGasto(long lineagastoId,
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoNotaGasto(lineagastoId, notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoNotaGasto(long lineagastoId,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoNotaGasto(lineagastoId, notaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoNotaGastos(long lineagastoId,
		long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoNotaGastos(lineagastoId, notagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoNotaGastos(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.NotaGasto> NotaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoNotaGastos(lineagastoId, NotaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getLineaGastoNotaGastos(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoNotaGastos(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getLineaGastoNotaGastos(
		long lineagastoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoNotaGastos(lineagastoId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getLineaGastoNotaGastos(
		long lineagastoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoNotaGastos(lineagastoId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoNotaGastosCount(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoNotaGastosCount(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoNotaGasto(long lineagastoId,
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasLineaGastoNotaGasto(lineagastoId, notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoNotaGastos(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasLineaGastoNotaGastos(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoNotaGastos(long lineagastoId,
		long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setLineaGastoNotaGastos(lineagastoId, notagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addOrganizationSageCompanyNotaGasto(
		long orgsagecompanyId, long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addOrganizationSageCompanyNotaGasto(orgsagecompanyId, notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addOrganizationSageCompanyNotaGasto(
		long orgsagecompanyId, es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addOrganizationSageCompanyNotaGasto(orgsagecompanyId, notaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addOrganizationSageCompanyNotaGastos(
		long orgsagecompanyId, long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addOrganizationSageCompanyNotaGastos(orgsagecompanyId, notagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addOrganizationSageCompanyNotaGastos(
		long orgsagecompanyId,
		java.util.List<es.davinciti.liferay.model.NotaGasto> NotaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addOrganizationSageCompanyNotaGastos(orgsagecompanyId, NotaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearOrganizationSageCompanyNotaGastos(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearOrganizationSageCompanyNotaGastos(orgsagecompanyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteOrganizationSageCompanyNotaGasto(
		long orgsagecompanyId, long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteOrganizationSageCompanyNotaGasto(orgsagecompanyId,
			notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteOrganizationSageCompanyNotaGasto(
		long orgsagecompanyId, es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteOrganizationSageCompanyNotaGasto(orgsagecompanyId, notaGasto);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteOrganizationSageCompanyNotaGastos(
		long orgsagecompanyId, long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteOrganizationSageCompanyNotaGastos(orgsagecompanyId,
			notagastoIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteOrganizationSageCompanyNotaGastos(
		long orgsagecompanyId,
		java.util.List<es.davinciti.liferay.model.NotaGasto> NotaGastos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteOrganizationSageCompanyNotaGastos(orgsagecompanyId,
			NotaGastos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getOrganizationSageCompanyNotaGastos(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getOrganizationSageCompanyNotaGastos(orgsagecompanyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getOrganizationSageCompanyNotaGastos(
		long orgsagecompanyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getOrganizationSageCompanyNotaGastos(orgsagecompanyId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.NotaGasto> getOrganizationSageCompanyNotaGastos(
		long orgsagecompanyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getOrganizationSageCompanyNotaGastos(orgsagecompanyId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getOrganizationSageCompanyNotaGastosCount(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getOrganizationSageCompanyNotaGastosCount(orgsagecompanyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasOrganizationSageCompanyNotaGasto(
		long orgsagecompanyId, long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasOrganizationSageCompanyNotaGasto(orgsagecompanyId,
			notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasOrganizationSageCompanyNotaGastos(
		long orgsagecompanyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasOrganizationSageCompanyNotaGastos(orgsagecompanyId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setOrganizationSageCompanyNotaGastos(
		long orgsagecompanyId, long[] notagastoIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.setOrganizationSageCompanyNotaGastos(orgsagecompanyId, notagastoIds);
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

	public static java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> getOrganizationsSageCompanies(
		long notaGastoId) {
		return getService().getOrganizationsSageCompanies(notaGastoId);
	}

	public static java.lang.String getSageCompany(long notagastoId) {
		return getService().getSageCompany(notagastoId);
	}

	public static java.util.List<es.davinciti.liferay.model.NotaGasto> findByCompanyIdUserId(
		long companyId, long userId) {
		return getService().findByCompanyIdUserId(companyId, userId);
	}

	public static java.util.List<es.davinciti.liferay.model.NotaGasto> findByCompanyId(
		long companyId) {
		return getService().findByCompanyId(companyId);
	}

	public static void deleteNotaGastoLineas(long notagastoId) {
		getService().deleteNotaGastoLineas(notagastoId);
	}

	public static java.lang.String validateNotaGasto(long notagastoId,
		long configId, long userId, java.util.Locale locale) {
		return getService()
				   .validateNotaGasto(notagastoId, configId, userId, locale);
	}

	public static java.lang.String getSageEmployeeId(long userId) {
		return getService().getSageEmployeeId(userId);
	}

	public static void clearService() {
		_service = null;
	}

	public static NotaGastoLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					NotaGastoLocalService.class.getName());

			if (invokableLocalService instanceof NotaGastoLocalService) {
				_service = (NotaGastoLocalService)invokableLocalService;
			}
			else {
				_service = new NotaGastoLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(NotaGastoLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(NotaGastoLocalService service) {
	}

	private static NotaGastoLocalService _service;
}