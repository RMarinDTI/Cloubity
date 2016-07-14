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
 * Provides the local service utility for HistoricoNota. This utility wraps
 * {@link es.davinciti.liferay.service.impl.HistoricoNotaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Cmes
 * @see HistoricoNotaLocalService
 * @see es.davinciti.liferay.service.base.HistoricoNotaLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.impl.HistoricoNotaLocalServiceImpl
 * @generated
 */
public class HistoricoNotaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.davinciti.liferay.service.impl.HistoricoNotaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the historico nota to the database. Also notifies the appropriate model listeners.
	*
	* @param historicoNota the historico nota
	* @return the historico nota that was added
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.HistoricoNota addHistoricoNota(
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addHistoricoNota(historicoNota);
	}

	/**
	* Creates a new historico nota with the primary key. Does not add the historico nota to the database.
	*
	* @param historiconotaId the primary key for the new historico nota
	* @return the new historico nota
	*/
	public static es.davinciti.liferay.model.HistoricoNota createHistoricoNota(
		long historiconotaId) {
		return getService().createHistoricoNota(historiconotaId);
	}

	/**
	* Deletes the historico nota with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param historiconotaId the primary key of the historico nota
	* @return the historico nota that was removed
	* @throws PortalException if a historico nota with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.HistoricoNota deleteHistoricoNota(
		long historiconotaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteHistoricoNota(historiconotaId);
	}

	/**
	* Deletes the historico nota from the database. Also notifies the appropriate model listeners.
	*
	* @param historicoNota the historico nota
	* @return the historico nota that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.HistoricoNota deleteHistoricoNota(
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteHistoricoNota(historicoNota);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.HistoricoNotaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.HistoricoNotaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static es.davinciti.liferay.model.HistoricoNota fetchHistoricoNota(
		long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchHistoricoNota(historiconotaId);
	}

	/**
	* Returns the historico nota with the primary key.
	*
	* @param historiconotaId the primary key of the historico nota
	* @return the historico nota
	* @throws PortalException if a historico nota with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.HistoricoNota getHistoricoNota(
		long historiconotaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getHistoricoNota(historiconotaId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<es.davinciti.liferay.model.HistoricoNota> getHistoricoNotas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getHistoricoNotas(start, end);
	}

	/**
	* Returns the number of historico notas.
	*
	* @return the number of historico notas
	* @throws SystemException if a system exception occurred
	*/
	public static int getHistoricoNotasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getHistoricoNotasCount();
	}

	/**
	* Updates the historico nota in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param historicoNota the historico nota
	* @return the historico nota that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.HistoricoNota updateHistoricoNota(
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateHistoricoNota(historicoNota);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastoHistoricoNota(long notagastoId,
		long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addNotaGastoHistoricoNota(notagastoId, historiconotaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastoHistoricoNota(long notagastoId,
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addNotaGastoHistoricoNota(notagastoId, historicoNota);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastoHistoricoNotas(long notagastoId,
		long[] historiconotaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addNotaGastoHistoricoNotas(notagastoId, historiconotaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addNotaGastoHistoricoNotas(long notagastoId,
		java.util.List<es.davinciti.liferay.model.HistoricoNota> HistoricoNotas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addNotaGastoHistoricoNotas(notagastoId, HistoricoNotas);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearNotaGastoHistoricoNotas(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearNotaGastoHistoricoNotas(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteNotaGastoHistoricoNota(long notagastoId,
		long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteNotaGastoHistoricoNota(notagastoId, historiconotaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteNotaGastoHistoricoNota(long notagastoId,
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteNotaGastoHistoricoNota(notagastoId, historicoNota);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteNotaGastoHistoricoNotas(long notagastoId,
		long[] historiconotaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteNotaGastoHistoricoNotas(notagastoId, historiconotaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteNotaGastoHistoricoNotas(long notagastoId,
		java.util.List<es.davinciti.liferay.model.HistoricoNota> HistoricoNotas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteNotaGastoHistoricoNotas(notagastoId, HistoricoNotas);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.HistoricoNota> getNotaGastoHistoricoNotas(
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getNotaGastoHistoricoNotas(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.HistoricoNota> getNotaGastoHistoricoNotas(
		long notagastoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getNotaGastoHistoricoNotas(notagastoId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.HistoricoNota> getNotaGastoHistoricoNotas(
		long notagastoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getNotaGastoHistoricoNotas(notagastoId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getNotaGastoHistoricoNotasCount(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getNotaGastoHistoricoNotasCount(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasNotaGastoHistoricoNota(long notagastoId,
		long historiconotaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasNotaGastoHistoricoNota(notagastoId, historiconotaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasNotaGastoHistoricoNotas(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasNotaGastoHistoricoNotas(notagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setNotaGastoHistoricoNotas(long notagastoId,
		long[] historiconotaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setNotaGastoHistoricoNotas(notagastoId, historiconotaIds);
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

	public static void clearService() {
		_service = null;
	}

	public static HistoricoNotaLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					HistoricoNotaLocalService.class.getName());

			if (invokableLocalService instanceof HistoricoNotaLocalService) {
				_service = (HistoricoNotaLocalService)invokableLocalService;
			}
			else {
				_service = new HistoricoNotaLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(HistoricoNotaLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(HistoricoNotaLocalService service) {
	}

	private static HistoricoNotaLocalService _service;
}