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
 * Provides the local service utility for LineaGastoCategoria. This utility wraps
 * {@link es.davinciti.liferay.service.impl.LineaGastoCategoriaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Cmes
 * @see LineaGastoCategoriaLocalService
 * @see es.davinciti.liferay.service.base.LineaGastoCategoriaLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.impl.LineaGastoCategoriaLocalServiceImpl
 * @generated
 */
public class LineaGastoCategoriaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.davinciti.liferay.service.impl.LineaGastoCategoriaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the linea gasto categoria to the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoCategoria the linea gasto categoria
	* @return the linea gasto categoria that was added
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCategoria addLineaGastoCategoria(
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addLineaGastoCategoria(lineaGastoCategoria);
	}

	/**
	* Creates a new linea gasto categoria with the primary key. Does not add the linea gasto categoria to the database.
	*
	* @param categoriaId the primary key for the new linea gasto categoria
	* @return the new linea gasto categoria
	*/
	public static es.davinciti.liferay.model.LineaGastoCategoria createLineaGastoCategoria(
		long categoriaId) {
		return getService().createLineaGastoCategoria(categoriaId);
	}

	/**
	* Deletes the linea gasto categoria with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoriaId the primary key of the linea gasto categoria
	* @return the linea gasto categoria that was removed
	* @throws PortalException if a linea gasto categoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCategoria deleteLineaGastoCategoria(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLineaGastoCategoria(categoriaId);
	}

	/**
	* Deletes the linea gasto categoria from the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoCategoria the linea gasto categoria
	* @return the linea gasto categoria that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCategoria deleteLineaGastoCategoria(
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLineaGastoCategoria(lineaGastoCategoria);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoCategoriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoCategoriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static es.davinciti.liferay.model.LineaGastoCategoria fetchLineaGastoCategoria(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchLineaGastoCategoria(categoriaId);
	}

	/**
	* Returns the linea gasto categoria with the primary key.
	*
	* @param categoriaId the primary key of the linea gasto categoria
	* @return the linea gasto categoria
	* @throws PortalException if a linea gasto categoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCategoria getLineaGastoCategoria(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoCategoria(categoriaId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the linea gasto categorias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoCategoriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linea gasto categorias
	* @param end the upper bound of the range of linea gasto categorias (not inclusive)
	* @return the range of linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoCategorias(start, end);
	}

	/**
	* Returns the number of linea gasto categorias.
	*
	* @return the number of linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoCategoriasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoCategoriasCount();
	}

	/**
	* Updates the linea gasto categoria in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoCategoria the linea gasto categoria
	* @return the linea gasto categoria that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.LineaGastoCategoria updateLineaGastoCategoria(
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLineaGastoCategoria(lineaGastoCategoria);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoFamiliaLineaGastoCategoria(long familiaId,
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoFamiliaLineaGastoCategoria(familiaId, categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoFamiliaLineaGastoCategoria(long familiaId,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoFamiliaLineaGastoCategoria(familiaId,
			lineaGastoCategoria);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoFamiliaLineaGastoCategorias(
		long familiaId, long[] categoriaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoFamiliaLineaGastoCategorias(familiaId, categoriaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoFamiliaLineaGastoCategorias(
		long familiaId,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> LineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoFamiliaLineaGastoCategorias(familiaId,
			LineaGastoCategorias);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoFamiliaLineaGastoCategorias(
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearLineaGastoFamiliaLineaGastoCategorias(familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoFamiliaLineaGastoCategoria(
		long familiaId, long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoFamiliaLineaGastoCategoria(familiaId, categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoFamiliaLineaGastoCategoria(
		long familiaId,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoFamiliaLineaGastoCategoria(familiaId,
			lineaGastoCategoria);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoFamiliaLineaGastoCategorias(
		long familiaId, long[] categoriaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoFamiliaLineaGastoCategorias(familiaId, categoriaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoFamiliaLineaGastoCategorias(
		long familiaId,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> LineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoFamiliaLineaGastoCategorias(familiaId,
			LineaGastoCategorias);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoFamiliaLineaGastoCategorias(
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoFamiliaLineaGastoCategorias(familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoFamiliaLineaGastoCategorias(
		long familiaId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoFamiliaLineaGastoCategorias(familiaId, start,
			end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoFamiliaLineaGastoCategorias(
		long familiaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoFamiliaLineaGastoCategorias(familiaId, start,
			end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoFamiliaLineaGastoCategoriasCount(
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoFamiliaLineaGastoCategoriasCount(familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoFamiliaLineaGastoCategoria(
		long familiaId, long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasLineaGastoFamiliaLineaGastoCategoria(familiaId,
			categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoFamiliaLineaGastoCategorias(
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasLineaGastoFamiliaLineaGastoCategorias(familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoFamiliaLineaGastoCategorias(
		long familiaId, long[] categoriaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.setLineaGastoFamiliaLineaGastoCategorias(familiaId, categoriaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoLineaGastoCategoria(long lineagastoId,
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addLineaGastoLineaGastoCategoria(lineagastoId, categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoLineaGastoCategoria(long lineagastoId,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoLineaGastoCategoria(lineagastoId, lineaGastoCategoria);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoLineaGastoCategorias(long lineagastoId,
		long[] categoriaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoLineaGastoCategorias(lineagastoId, categoriaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addLineaGastoLineaGastoCategorias(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> LineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addLineaGastoLineaGastoCategorias(lineagastoId,
			LineaGastoCategorias);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearLineaGastoLineaGastoCategorias(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearLineaGastoLineaGastoCategorias(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoLineaGastoCategoria(long lineagastoId,
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoLineaGastoCategoria(lineagastoId, categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoLineaGastoCategoria(long lineagastoId,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoLineaGastoCategoria(lineagastoId,
			lineaGastoCategoria);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoLineaGastoCategorias(long lineagastoId,
		long[] categoriaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoLineaGastoCategorias(lineagastoId, categoriaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLineaGastoLineaGastoCategorias(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> LineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteLineaGastoLineaGastoCategorias(lineagastoId,
			LineaGastoCategorias);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoLineaGastoCategorias(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoLineaGastoCategorias(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoLineaGastoCategorias(
		long lineagastoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoLineaGastoCategorias(lineagastoId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoLineaGastoCategorias(
		long lineagastoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLineaGastoLineaGastoCategorias(lineagastoId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getLineaGastoLineaGastoCategoriasCount(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLineaGastoLineaGastoCategoriasCount(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoLineaGastoCategoria(long lineagastoId,
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasLineaGastoLineaGastoCategoria(lineagastoId, categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasLineaGastoLineaGastoCategorias(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasLineaGastoLineaGastoCategorias(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setLineaGastoLineaGastoCategorias(long lineagastoId,
		long[] categoriaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.setLineaGastoLineaGastoCategorias(lineagastoId, categoriaIds);
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

	public static LineaGastoCategoriaLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					LineaGastoCategoriaLocalService.class.getName());

			if (invokableLocalService instanceof LineaGastoCategoriaLocalService) {
				_service = (LineaGastoCategoriaLocalService)invokableLocalService;
			}
			else {
				_service = new LineaGastoCategoriaLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(LineaGastoCategoriaLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(LineaGastoCategoriaLocalService service) {
	}

	private static LineaGastoCategoriaLocalService _service;
}