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
 * Provides the local service utility for LineaGastoFamilia. This utility wraps
 * {@link es.davinciti.liferay.service.impl.LineaGastoFamiliaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Cmes
 * @see LineaGastoFamiliaLocalService
 * @see es.davinciti.liferay.service.base.LineaGastoFamiliaLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.impl.LineaGastoFamiliaLocalServiceImpl
 * @generated
 */
public class LineaGastoFamiliaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.davinciti.liferay.service.impl.LineaGastoFamiliaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the linea gasto familia to the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoFamilia the linea gasto familia
	* @return the linea gasto familia that was added
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoFamilia addLineaGastoFamilia(
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addLineaGastoFamilia(lineaGastoFamilia);
	}

	/**
	* Creates a new linea gasto familia with the primary key. Does not add the linea gasto familia to the database.
	*
	* @param familiaId the primary key for the new linea gasto familia
	* @return the new linea gasto familia
	*/
	public static es.davinciti.liferay.model.LineaGastoFamilia createLineaGastoFamilia(
		long familiaId) {
		return getService().createLineaGastoFamilia(familiaId);
	}

	/**
	* Deletes the linea gasto familia with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param familiaId the primary key of the linea gasto familia
	* @return the linea gasto familia that was removed
	* @throws PortalException if a linea gasto familia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoFamilia deleteLineaGastoFamilia(
		long familiaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLineaGastoFamilia(familiaId);
	}

	/**
	* Deletes the linea gasto familia from the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoFamilia the linea gasto familia
	* @return the linea gasto familia that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoFamilia deleteLineaGastoFamilia(
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLineaGastoFamilia(lineaGastoFamilia);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static es.davinciti.liferay.model.LineaGastoFamilia fetchLineaGastoFamilia(
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchLineaGastoFamilia(familiaId);
	}

	/**
	* Returns the linea gasto familia with the primary key.
	*
	* @param familiaId the primary key of the linea gasto familia
	* @return the linea gasto familia
	* @throws PortalException if a linea gasto familia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoFamilia getLineaGastoFamilia(
		long familiaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoFamilia(familiaId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoFamilias(start, end);
	}

	/**
	* Returns the number of linea gasto familias.
	*
	* @return the number of linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoFamiliasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoFamiliasCount();
	}

	/**
	* Updates the linea gasto familia in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoFamilia the linea gasto familia
	* @return the linea gasto familia that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoFamilia updateLineaGastoFamilia(
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLineaGastoFamilia(lineaGastoFamilia);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoLineaGastoFamilia(long lineagastoId,
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoLineaGastoFamilia(lineagastoId, familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoLineaGastoFamilia(long lineagastoId,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoLineaGastoFamilia(lineagastoId, lineaGastoFamilia);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoLineaGastoFamilias(long lineagastoId,
		long[] familiaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoLineaGastoFamilias(lineagastoId, familiaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoLineaGastoFamilias(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> LineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoLineaGastoFamilias(lineagastoId, LineaGastoFamilias);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoLineaGastoFamilias(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearLineaGastoLineaGastoFamilias(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoLineaGastoFamilia(long lineagastoId,
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoLineaGastoFamilia(lineagastoId, familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoLineaGastoFamilia(long lineagastoId,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoLineaGastoFamilia(lineagastoId, lineaGastoFamilia);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoLineaGastoFamilias(long lineagastoId,
		long[] familiaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLineaGastoLineaGastoFamilias(lineagastoId, familiaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoLineaGastoFamilias(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> LineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoLineaGastoFamilias(lineagastoId, LineaGastoFamilias);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoLineaGastoFamilias(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoLineaGastoFamilias(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoLineaGastoFamilias(
		long lineagastoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoLineaGastoFamilias(lineagastoId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoLineaGastoFamilias(
		long lineagastoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoLineaGastoFamilias(lineagastoId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoLineaGastoFamiliasCount(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoLineaGastoFamiliasCount(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoLineaGastoFamilia(long lineagastoId,
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasLineaGastoLineaGastoFamilia(lineagastoId, familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoLineaGastoFamilias(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasLineaGastoLineaGastoFamilias(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoLineaGastoFamilias(long lineagastoId,
		long[] familiaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setLineaGastoLineaGastoFamilias(lineagastoId, familiaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCategoriaLineaGastoFamilia(
		long categoriaId, long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoCategoriaLineaGastoFamilia(categoriaId, familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCategoriaLineaGastoFamilia(
		long categoriaId,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoCategoriaLineaGastoFamilia(categoriaId,
			lineaGastoFamilia);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCategoriaLineaGastoFamilias(
		long categoriaId, long[] familiaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoCategoriaLineaGastoFamilias(categoriaId, familiaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoCategoriaLineaGastoFamilias(
		long categoriaId,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> LineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoCategoriaLineaGastoFamilias(categoriaId,
			LineaGastoFamilias);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoCategoriaLineaGastoFamilias(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearLineaGastoCategoriaLineaGastoFamilias(categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoCategoriaLineaGastoFamilia(
		long categoriaId, long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoCategoriaLineaGastoFamilia(categoriaId, familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoCategoriaLineaGastoFamilia(
		long categoriaId,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoCategoriaLineaGastoFamilia(categoriaId,
			lineaGastoFamilia);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoCategoriaLineaGastoFamilias(
		long categoriaId, long[] familiaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoCategoriaLineaGastoFamilias(categoriaId, familiaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoCategoriaLineaGastoFamilias(
		long categoriaId,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> LineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoCategoriaLineaGastoFamilias(categoriaId,
			LineaGastoFamilias);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoCategoriaLineaGastoFamilias(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoCategoriaLineaGastoFamilias(categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoCategoriaLineaGastoFamilias(
		long categoriaId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoCategoriaLineaGastoFamilias(categoriaId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoCategoriaLineaGastoFamilias(
		long categoriaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoCategoriaLineaGastoFamilias(categoriaId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoCategoriaLineaGastoFamiliasCount(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoCategoriaLineaGastoFamiliasCount(categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoCategoriaLineaGastoFamilia(
		long categoriaId, long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasLineaGastoCategoriaLineaGastoFamilia(categoriaId,
			familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoCategoriaLineaGastoFamilias(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasLineaGastoCategoriaLineaGastoFamilias(categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoCategoriaLineaGastoFamilias(
		long categoriaId, long[] familiaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.setLineaGastoCategoriaLineaGastoFamilias(categoriaId, familiaIds);
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

	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> findByCompanyId(
		long companyId) {
		return getService().findByCompanyId(companyId);
	}

	public static void clearService() {
		_service = null;
	}

	public static LineaGastoFamiliaLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					LineaGastoFamiliaLocalService.class.getName());

			if (invokableLocalService instanceof LineaGastoFamiliaLocalService) {
				_service = (LineaGastoFamiliaLocalService)invokableLocalService;
			}
			else {
				_service = new LineaGastoFamiliaLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(LineaGastoFamiliaLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(LineaGastoFamiliaLocalService service) {
	}

	private static LineaGastoFamiliaLocalService _service;
}