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
 * Provides a wrapper for {@link LineaGastoFamiliaLocalService}.
 *
 * @author Cmes
 * @see LineaGastoFamiliaLocalService
 * @generated
 */
public class LineaGastoFamiliaLocalServiceWrapper
	implements LineaGastoFamiliaLocalService,
		ServiceWrapper<LineaGastoFamiliaLocalService> {
	public LineaGastoFamiliaLocalServiceWrapper(
		LineaGastoFamiliaLocalService lineaGastoFamiliaLocalService) {
		_lineaGastoFamiliaLocalService = lineaGastoFamiliaLocalService;
	}

	/**
	* Adds the linea gasto familia to the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoFamilia the linea gasto familia
	* @return the linea gasto familia that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoFamilia addLineaGastoFamilia(
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.addLineaGastoFamilia(lineaGastoFamilia);
	}

	/**
	* Creates a new linea gasto familia with the primary key. Does not add the linea gasto familia to the database.
	*
	* @param familiaId the primary key for the new linea gasto familia
	* @return the new linea gasto familia
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoFamilia createLineaGastoFamilia(
		long familiaId) {
		return _lineaGastoFamiliaLocalService.createLineaGastoFamilia(familiaId);
	}

	/**
	* Deletes the linea gasto familia with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param familiaId the primary key of the linea gasto familia
	* @return the linea gasto familia that was removed
	* @throws PortalException if a linea gasto familia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoFamilia deleteLineaGastoFamilia(
		long familiaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.deleteLineaGastoFamilia(familiaId);
	}

	/**
	* Deletes the linea gasto familia from the database. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoFamilia the linea gasto familia
	* @return the linea gasto familia that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoFamilia deleteLineaGastoFamilia(
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.deleteLineaGastoFamilia(lineaGastoFamilia);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _lineaGastoFamiliaLocalService.dynamicQuery();
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
		return _lineaGastoFamiliaLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _lineaGastoFamiliaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _lineaGastoFamiliaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.davinciti.liferay.model.LineaGastoFamilia fetchLineaGastoFamilia(
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.fetchLineaGastoFamilia(familiaId);
	}

	/**
	* Returns the linea gasto familia with the primary key.
	*
	* @param familiaId the primary key of the linea gasto familia
	* @return the linea gasto familia
	* @throws PortalException if a linea gasto familia with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoFamilia getLineaGastoFamilia(
		long familiaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.getLineaGastoFamilia(familiaId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.getLineaGastoFamilias(start, end);
	}

	/**
	* Returns the number of linea gasto familias.
	*
	* @return the number of linea gasto familias
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoFamiliasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.getLineaGastoFamiliasCount();
	}

	/**
	* Updates the linea gasto familia in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lineaGastoFamilia the linea gasto familia
	* @return the linea gasto familia that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoFamilia updateLineaGastoFamilia(
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.updateLineaGastoFamilia(lineaGastoFamilia);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoLineaGastoFamilia(long lineagastoId, long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.addLineaGastoLineaGastoFamilia(lineagastoId,
			familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoLineaGastoFamilia(long lineagastoId,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.addLineaGastoLineaGastoFamilia(lineagastoId,
			lineaGastoFamilia);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoLineaGastoFamilias(long lineagastoId,
		long[] familiaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.addLineaGastoLineaGastoFamilias(lineagastoId,
			familiaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoLineaGastoFamilias(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> LineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.addLineaGastoLineaGastoFamilias(lineagastoId,
			LineaGastoFamilias);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearLineaGastoLineaGastoFamilias(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.clearLineaGastoLineaGastoFamilias(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoLineaGastoFamilia(long lineagastoId,
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.deleteLineaGastoLineaGastoFamilia(lineagastoId,
			familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoLineaGastoFamilia(long lineagastoId,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.deleteLineaGastoLineaGastoFamilia(lineagastoId,
			lineaGastoFamilia);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoLineaGastoFamilias(long lineagastoId,
		long[] familiaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.deleteLineaGastoLineaGastoFamilias(lineagastoId,
			familiaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoLineaGastoFamilias(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> LineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.deleteLineaGastoLineaGastoFamilias(lineagastoId,
			LineaGastoFamilias);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoLineaGastoFamilias(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.getLineaGastoLineaGastoFamilias(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoLineaGastoFamilias(
		long lineagastoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.getLineaGastoLineaGastoFamilias(lineagastoId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoLineaGastoFamilias(
		long lineagastoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.getLineaGastoLineaGastoFamilias(lineagastoId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoLineaGastoFamiliasCount(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.getLineaGastoLineaGastoFamiliasCount(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoLineaGastoFamilia(long lineagastoId,
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.hasLineaGastoLineaGastoFamilia(lineagastoId,
			familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoLineaGastoFamilias(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.hasLineaGastoLineaGastoFamilias(lineagastoId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setLineaGastoLineaGastoFamilias(long lineagastoId,
		long[] familiaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.setLineaGastoLineaGastoFamilias(lineagastoId,
			familiaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoCategoriaLineaGastoFamilia(long categoriaId,
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.addLineaGastoCategoriaLineaGastoFamilia(categoriaId,
			familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoCategoriaLineaGastoFamilia(long categoriaId,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.addLineaGastoCategoriaLineaGastoFamilia(categoriaId,
			lineaGastoFamilia);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoCategoriaLineaGastoFamilias(long categoriaId,
		long[] familiaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.addLineaGastoCategoriaLineaGastoFamilias(categoriaId,
			familiaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addLineaGastoCategoriaLineaGastoFamilias(long categoriaId,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> LineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.addLineaGastoCategoriaLineaGastoFamilias(categoriaId,
			LineaGastoFamilias);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearLineaGastoCategoriaLineaGastoFamilias(long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.clearLineaGastoCategoriaLineaGastoFamilias(categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoCategoriaLineaGastoFamilia(long categoriaId,
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.deleteLineaGastoCategoriaLineaGastoFamilia(categoriaId,
			familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoCategoriaLineaGastoFamilia(long categoriaId,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.deleteLineaGastoCategoriaLineaGastoFamilia(categoriaId,
			lineaGastoFamilia);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoCategoriaLineaGastoFamilias(long categoriaId,
		long[] familiaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.deleteLineaGastoCategoriaLineaGastoFamilias(categoriaId,
			familiaIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteLineaGastoCategoriaLineaGastoFamilias(long categoriaId,
		java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> LineaGastoFamilias)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.deleteLineaGastoCategoriaLineaGastoFamilias(categoriaId,
			LineaGastoFamilias);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoCategoriaLineaGastoFamilias(
		long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.getLineaGastoCategoriaLineaGastoFamilias(categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoCategoriaLineaGastoFamilias(
		long categoriaId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.getLineaGastoCategoriaLineaGastoFamilias(categoriaId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoCategoriaLineaGastoFamilias(
		long categoriaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.getLineaGastoCategoriaLineaGastoFamilias(categoriaId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLineaGastoCategoriaLineaGastoFamiliasCount(long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.getLineaGastoCategoriaLineaGastoFamiliasCount(categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoCategoriaLineaGastoFamilia(long categoriaId,
		long familiaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.hasLineaGastoCategoriaLineaGastoFamilia(categoriaId,
			familiaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasLineaGastoCategoriaLineaGastoFamilias(long categoriaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lineaGastoFamiliaLocalService.hasLineaGastoCategoriaLineaGastoFamilias(categoriaId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setLineaGastoCategoriaLineaGastoFamilias(long categoriaId,
		long[] familiaIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_lineaGastoFamiliaLocalService.setLineaGastoCategoriaLineaGastoFamilias(categoriaId,
			familiaIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _lineaGastoFamiliaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_lineaGastoFamiliaLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lineaGastoFamiliaLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> findByCompanyId(
		long companyId) {
		return _lineaGastoFamiliaLocalService.findByCompanyId(companyId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LineaGastoFamiliaLocalService getWrappedLineaGastoFamiliaLocalService() {
		return _lineaGastoFamiliaLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLineaGastoFamiliaLocalService(
		LineaGastoFamiliaLocalService lineaGastoFamiliaLocalService) {
		_lineaGastoFamiliaLocalService = lineaGastoFamiliaLocalService;
	}

	@Override
	public LineaGastoFamiliaLocalService getWrappedService() {
		return _lineaGastoFamiliaLocalService;
	}

	@Override
	public void setWrappedService(
		LineaGastoFamiliaLocalService lineaGastoFamiliaLocalService) {
		_lineaGastoFamiliaLocalService = lineaGastoFamiliaLocalService;
	}

	private LineaGastoFamiliaLocalService _lineaGastoFamiliaLocalService;
}