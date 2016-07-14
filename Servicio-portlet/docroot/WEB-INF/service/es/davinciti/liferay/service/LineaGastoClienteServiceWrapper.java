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
 * Provides a wrapper for {@link LineaGastoClienteService}.
 *
 * @author Cmes
 * @see LineaGastoClienteService
 * @generated
 */
public class LineaGastoClienteServiceWrapper implements LineaGastoClienteService,
	ServiceWrapper<LineaGastoClienteService> {
	public LineaGastoClienteServiceWrapper(
		LineaGastoClienteService lineaGastoClienteService) {
		_lineaGastoClienteService = lineaGastoClienteService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _lineaGastoClienteService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_lineaGastoClienteService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lineaGastoClienteService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Devuelve los Clientes de la Company
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoCliente> getClientes(
		long companyId) {
		return _lineaGastoClienteService.getClientes(companyId);
	}

	/**
	* Devuelve el Cliente de la Linea de Gasto
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoCliente getClienteLineaGasto(
		long lineagastoId) {
		return _lineaGastoClienteService.getClienteLineaGasto(lineagastoId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LineaGastoClienteService getWrappedLineaGastoClienteService() {
		return _lineaGastoClienteService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLineaGastoClienteService(
		LineaGastoClienteService lineaGastoClienteService) {
		_lineaGastoClienteService = lineaGastoClienteService;
	}

	@Override
	public LineaGastoClienteService getWrappedService() {
		return _lineaGastoClienteService;
	}

	@Override
	public void setWrappedService(
		LineaGastoClienteService lineaGastoClienteService) {
		_lineaGastoClienteService = lineaGastoClienteService;
	}

	private LineaGastoClienteService _lineaGastoClienteService;
}