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
 * Provides a wrapper for {@link LineaGastoFamiliaService}.
 *
 * @author Cmes
 * @see LineaGastoFamiliaService
 * @generated
 */
public class LineaGastoFamiliaServiceWrapper implements LineaGastoFamiliaService,
	ServiceWrapper<LineaGastoFamiliaService> {
	public LineaGastoFamiliaServiceWrapper(
		LineaGastoFamiliaService lineaGastoFamiliaService) {
		_lineaGastoFamiliaService = lineaGastoFamiliaService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _lineaGastoFamiliaService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_lineaGastoFamiliaService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lineaGastoFamiliaService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Devuelve las Familias de la Company
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getFamilias(
		long companyId) {
		return _lineaGastoFamiliaService.getFamilias(companyId);
	}

	/**
	* Devuelve la Familia de la Linea de Gasto
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoFamilia getFamiliaLineaGasto(
		long lineagastoId) {
		return _lineaGastoFamiliaService.getFamiliaLineaGasto(lineagastoId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LineaGastoFamiliaService getWrappedLineaGastoFamiliaService() {
		return _lineaGastoFamiliaService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLineaGastoFamiliaService(
		LineaGastoFamiliaService lineaGastoFamiliaService) {
		_lineaGastoFamiliaService = lineaGastoFamiliaService;
	}

	@Override
	public LineaGastoFamiliaService getWrappedService() {
		return _lineaGastoFamiliaService;
	}

	@Override
	public void setWrappedService(
		LineaGastoFamiliaService lineaGastoFamiliaService) {
		_lineaGastoFamiliaService = lineaGastoFamiliaService;
	}

	private LineaGastoFamiliaService _lineaGastoFamiliaService;
}