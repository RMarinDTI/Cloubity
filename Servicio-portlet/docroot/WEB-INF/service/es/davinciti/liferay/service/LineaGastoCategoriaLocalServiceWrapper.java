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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LineaGastoCategoriaLocalService}.
 *
 * @author Cmes
 * @see LineaGastoCategoriaLocalService
 * @generated
 */
public class LineaGastoCategoriaLocalServiceWrapper
	implements LineaGastoCategoriaLocalService,
		ServiceWrapper<LineaGastoCategoriaLocalService> {
	public LineaGastoCategoriaLocalServiceWrapper(
		LineaGastoCategoriaLocalService lineaGastoCategoriaLocalService) {
		_lineaGastoCategoriaLocalService = lineaGastoCategoriaLocalService;
	}

	/**
	* Adds the linea gasto categoria to the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoCategoria the linea gasto categoria
	* @return the linea gasto categoria that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoCategoria addLineaGastoCategoria(
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.addLineaGastoCategoria(lineaGastoCategoria);
	}

	/**
	* Creates a new linea gasto categoria with the primary key. Does not add the linea gasto categoria to the database.
	*
	* @param categoriaId the primary key for the new linea gasto categoria
	* @return the new linea gasto categoria
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoCategoria createLineaGastoCategoria(
		long categoriaId) {
		return _lineaGastoCategoriaLocalService.createLineaGastoCategoria(categoriaId);
	}

	/**
	* Deletes the linea gasto categoria with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoriaId the primary key of the linea gasto categoria
	* @return the linea gasto categoria that was removed
	* @throws PortalException if a linea gasto categoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoCategoria deleteLineaGastoCategoria(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.deleteLineaGastoCategoria(categoriaId);
	}

	/**
	* Deletes the linea gasto categoria from the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoCategoria the linea gasto categoria
	* @return the linea gasto categoria that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoCategoria deleteLineaGastoCategoria(
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.deleteLineaGastoCategoria(lineaGastoCategoria);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _lineaGastoCategoriaLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.davinciti.liferay.model.LineaGastoCategoria fetchLineaGastoCategoria(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.fetchLineaGastoCategoria(categoriaId);
	}

	/**
	* Returns the linea gasto categoria with the primary key.
	*
	* @param categoriaId the primary key of the linea gasto categoria
	* @return the linea gasto categoria
	* @throws PortalException if a linea gasto categoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoCategoria getLineaGastoCategoria(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.getLineaGastoCategoria(categoriaId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.getLineaGastoCategorias(start,
			end);
	}

	/**
	* Returns the number of linea gasto categorias.
	*
	* @return the number of linea gasto categorias
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoCategoriasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.getLineaGastoCategoriasCount();
	}

	/**
	* Updates the linea gasto categoria in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoCategoria the linea gasto categoria
	* @return the linea gasto categoria that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoCategoria updateLineaGastoCategoria(
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.updateLineaGastoCategoria(lineaGastoCategoria);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoFamiliaLineaGastoCategoria(long familiaId,
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.addLineaGastoFamiliaLineaGastoCategoria(familiaId,
			categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoFamiliaLineaGastoCategoria(long familiaId,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.addLineaGastoFamiliaLineaGastoCategoria(familiaId,
			lineaGastoCategoria);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoFamiliaLineaGastoCategorias(long familiaId,
		long[] categoriaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.addLineaGastoFamiliaLineaGastoCategorias(familiaId,
			categoriaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoFamiliaLineaGastoCategorias(long familiaId,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> LineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.addLineaGastoFamiliaLineaGastoCategorias(familiaId,
			LineaGastoCategorias);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearLineaGastoFamiliaLineaGastoCategorias(long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.clearLineaGastoFamiliaLineaGastoCategorias(familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoFamiliaLineaGastoCategoria(long familiaId,
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.deleteLineaGastoFamiliaLineaGastoCategoria(familiaId,
			categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoFamiliaLineaGastoCategoria(long familiaId,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.deleteLineaGastoFamiliaLineaGastoCategoria(familiaId,
			lineaGastoCategoria);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoFamiliaLineaGastoCategorias(long familiaId,
		long[] categoriaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.deleteLineaGastoFamiliaLineaGastoCategorias(familiaId,
			categoriaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoFamiliaLineaGastoCategorias(long familiaId,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> LineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.deleteLineaGastoFamiliaLineaGastoCategorias(familiaId,
			LineaGastoCategorias);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoFamiliaLineaGastoCategorias(
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.getLineaGastoFamiliaLineaGastoCategorias(familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoFamiliaLineaGastoCategorias(
		long familiaId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.getLineaGastoFamiliaLineaGastoCategorias(familiaId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoFamiliaLineaGastoCategorias(
		long familiaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.getLineaGastoFamiliaLineaGastoCategorias(familiaId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoFamiliaLineaGastoCategoriasCount(long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.getLineaGastoFamiliaLineaGastoCategoriasCount(familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoFamiliaLineaGastoCategoria(long familiaId,
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.hasLineaGastoFamiliaLineaGastoCategoria(familiaId,
			categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoFamiliaLineaGastoCategorias(long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.hasLineaGastoFamiliaLineaGastoCategorias(familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setLineaGastoFamiliaLineaGastoCategorias(long familiaId,
		long[] categoriaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.setLineaGastoFamiliaLineaGastoCategorias(familiaId,
			categoriaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoLineaGastoCategoria(long lineagastoId,
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.addLineaGastoLineaGastoCategoria(lineagastoId,
			categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoLineaGastoCategoria(long lineagastoId,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.addLineaGastoLineaGastoCategoria(lineagastoId,
			lineaGastoCategoria);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoLineaGastoCategorias(long lineagastoId,
		long[] categoriaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.addLineaGastoLineaGastoCategorias(lineagastoId,
			categoriaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoLineaGastoCategorias(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> LineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.addLineaGastoLineaGastoCategorias(lineagastoId,
			LineaGastoCategorias);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearLineaGastoLineaGastoCategorias(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.clearLineaGastoLineaGastoCategorias(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoLineaGastoCategoria(long lineagastoId,
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.deleteLineaGastoLineaGastoCategoria(lineagastoId,
			categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoLineaGastoCategoria(long lineagastoId,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.deleteLineaGastoLineaGastoCategoria(lineagastoId,
			lineaGastoCategoria);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoLineaGastoCategorias(long lineagastoId,
		long[] categoriaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.deleteLineaGastoLineaGastoCategorias(lineagastoId,
			categoriaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoLineaGastoCategorias(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> LineaGastoCategorias)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.deleteLineaGastoLineaGastoCategorias(lineagastoId,
			LineaGastoCategorias);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoLineaGastoCategorias(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.getLineaGastoLineaGastoCategorias(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoLineaGastoCategorias(
		long lineagastoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.getLineaGastoLineaGastoCategorias(lineagastoId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoLineaGastoCategorias(
		long lineagastoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.getLineaGastoLineaGastoCategorias(lineagastoId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoLineaGastoCategoriasCount(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.getLineaGastoLineaGastoCategoriasCount(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoLineaGastoCategoria(long lineagastoId,
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.hasLineaGastoLineaGastoCategoria(lineagastoId,
			categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoLineaGastoCategorias(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoCategoriaLocalService.hasLineaGastoLineaGastoCategorias(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setLineaGastoLineaGastoCategorias(long lineagastoId,
		long[] categoriaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoCategoriaLocalService.setLineaGastoLineaGastoCategorias(lineagastoId,
			categoriaIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _lineaGastoCategoriaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_lineaGastoCategoriaLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lineaGastoCategoriaLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LineaGastoCategoriaLocalService getWrappedLineaGastoCategoriaLocalService() {
		return _lineaGastoCategoriaLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLineaGastoCategoriaLocalService(
		LineaGastoCategoriaLocalService lineaGastoCategoriaLocalService) {
		_lineaGastoCategoriaLocalService = lineaGastoCategoriaLocalService;
	}

	@Override
	public LineaGastoCategoriaLocalService getWrappedService() {
		return _lineaGastoCategoriaLocalService;
	}

	@Override
	public void setWrappedService(
		LineaGastoCategoriaLocalService lineaGastoCategoriaLocalService) {
		_lineaGastoCategoriaLocalService = lineaGastoCategoriaLocalService;
	}

	private LineaGastoCategoriaLocalService _lineaGastoCategoriaLocalService;
}