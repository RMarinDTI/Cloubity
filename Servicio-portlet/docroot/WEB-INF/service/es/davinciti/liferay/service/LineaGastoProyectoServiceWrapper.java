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
 * Provides a wrapper for {@link LineaGastoProyectoService}.
 *
 * @author Cmes
 * @see LineaGastoProyectoService
 * @generated
 */
public class LineaGastoProyectoServiceWrapper
	implements LineaGastoProyectoService,
		ServiceWrapper<LineaGastoProyectoService> {
	public LineaGastoProyectoServiceWrapper(
		LineaGastoProyectoService lineaGastoProyectoService) {
		_lineaGastoProyectoService = lineaGastoProyectoService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _lineaGastoProyectoService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_lineaGastoProyectoService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lineaGastoProyectoService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Devuelve los Proyectos del Cliente
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoProyecto> getProyectosCliente(
		long clienteId) {
		return _lineaGastoProyectoService.getProyectosCliente(clienteId);
	}

	/**
	* Devuelve el Proyecto de la Linea de Gasto
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoProyecto getProyectoLineaGasto(
		long lineagastoId) {
		return _lineaGastoProyectoService.getProyectoLineaGasto(lineagastoId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LineaGastoProyectoService getWrappedLineaGastoProyectoService() {
		return _lineaGastoProyectoService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLineaGastoProyectoService(
		LineaGastoProyectoService lineaGastoProyectoService) {
		_lineaGastoProyectoService = lineaGastoProyectoService;
	}

	@Override
	public LineaGastoProyectoService getWrappedService() {
		return _lineaGastoProyectoService;
	}

	@Override
	public void setWrappedService(
		LineaGastoProyectoService lineaGastoProyectoService) {
		_lineaGastoProyectoService = lineaGastoProyectoService;
	}

	private LineaGastoProyectoService _lineaGastoProyectoService;
}