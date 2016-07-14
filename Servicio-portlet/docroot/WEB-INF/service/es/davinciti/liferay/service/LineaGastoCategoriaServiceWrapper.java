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
 * Provides a wrapper for {@link LineaGastoCategoriaService}.
 *
 * @author Cmes
 * @see LineaGastoCategoriaService
 * @generated
 */
public class LineaGastoCategoriaServiceWrapper
	implements LineaGastoCategoriaService,
		ServiceWrapper<LineaGastoCategoriaService> {
	public LineaGastoCategoriaServiceWrapper(
		LineaGastoCategoriaService lineaGastoCategoriaService) {
		_lineaGastoCategoriaService = lineaGastoCategoriaService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _lineaGastoCategoriaService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_lineaGastoCategoriaService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lineaGastoCategoriaService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Devuelve las Categorias de la Familia
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCategoria> getCategoriasFamilia(
		long familiaId) {
		return _lineaGastoCategoriaService.getCategoriasFamilia(familiaId);
	}

	/**
	* Devuelve la Categoria de la Linea de Gasto
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoCategoria getCategoriaLineaGasto(
		long lineagastoId) {
		return _lineaGastoCategoriaService.getCategoriaLineaGasto(lineagastoId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LineaGastoCategoriaService getWrappedLineaGastoCategoriaService() {
		return _lineaGastoCategoriaService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLineaGastoCategoriaService(
		LineaGastoCategoriaService lineaGastoCategoriaService) {
		_lineaGastoCategoriaService = lineaGastoCategoriaService;
	}

	@Override
	public LineaGastoCategoriaService getWrappedService() {
		return _lineaGastoCategoriaService;
	}

	@Override
	public void setWrappedService(
		LineaGastoCategoriaService lineaGastoCategoriaService) {
		_lineaGastoCategoriaService = lineaGastoCategoriaService;
	}

	private LineaGastoCategoriaService _lineaGastoCategoriaService;
}