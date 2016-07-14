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
 * Provides a wrapper for {@link LineaGastoPayModeService}.
 *
 * @author Cmes
 * @see LineaGastoPayModeService
 * @generated
 */
public class LineaGastoPayModeServiceWrapper implements LineaGastoPayModeService,
	ServiceWrapper<LineaGastoPayModeService> {
	public LineaGastoPayModeServiceWrapper(
		LineaGastoPayModeService lineaGastoPayModeService) {
		_lineaGastoPayModeService = lineaGastoPayModeService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _lineaGastoPayModeService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_lineaGastoPayModeService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lineaGastoPayModeService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Devuelve los PayModes de la Company
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.LineaGastoPayMode> getPaymodes(
		long companyId) {
		return _lineaGastoPayModeService.getPaymodes(companyId);
	}

	/**
	* Devuelve el PayMode de la Linea de Gasto
	*/
	@Override
	public es.davinciti.liferay.model.LineaGastoPayMode getPaymodeLineaGasto(
		long lineagastoId) {
		return _lineaGastoPayModeService.getPaymodeLineaGasto(lineagastoId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LineaGastoPayModeService getWrappedLineaGastoPayModeService() {
		return _lineaGastoPayModeService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLineaGastoPayModeService(
		LineaGastoPayModeService lineaGastoPayModeService) {
		_lineaGastoPayModeService = lineaGastoPayModeService;
	}

	@Override
	public LineaGastoPayModeService getWrappedService() {
		return _lineaGastoPayModeService;
	}

	@Override
	public void setWrappedService(
		LineaGastoPayModeService lineaGastoPayModeService) {
		_lineaGastoPayModeService = lineaGastoPayModeService;
	}

	private LineaGastoPayModeService _lineaGastoPayModeService;
}