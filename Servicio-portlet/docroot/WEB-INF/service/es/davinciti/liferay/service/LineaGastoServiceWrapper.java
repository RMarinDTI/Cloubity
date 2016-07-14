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
 * Provides a wrapper for {@link LineaGastoService}.
 *
 * @author Cmes
 * @see LineaGastoService
 * @generated
 */
public class LineaGastoServiceWrapper implements LineaGastoService,
	ServiceWrapper<LineaGastoService> {
	public LineaGastoServiceWrapper(LineaGastoService lineaGastoService) {
		_lineaGastoService = lineaGastoService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _lineaGastoService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_lineaGastoService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lineaGastoService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getLineasNotaGasto(
		long notagastoId) {
		return _lineaGastoService.getLineasNotaGasto(notagastoId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject addLineaGasto(
		long notagastoId, com.liferay.portal.kernel.json.JSONObject data,
		java.lang.String localeT) {
		return _lineaGastoService.addLineaGasto(notagastoId, data, localeT);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject editLineaGasto(
		long notagastoId, long lineagastoId,
		com.liferay.portal.kernel.json.JSONObject data, java.lang.String localeT) {
		return _lineaGastoService.editLineaGasto(notagastoId, lineagastoId,
			data, localeT);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject deleteLineaGasto(
		long lineagastoId, java.lang.String localeT) {
		return _lineaGastoService.deleteLineaGasto(lineagastoId, localeT);
	}

	@Override
	public long setImageLineaGasto(long companyId, long userId,
		long documentId, byte[] image) {
		return _lineaGastoService.setImageLineaGasto(companyId, userId,
			documentId, image);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LineaGastoService getWrappedLineaGastoService() {
		return _lineaGastoService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLineaGastoService(LineaGastoService lineaGastoService) {
		_lineaGastoService = lineaGastoService;
	}

	@Override
	public LineaGastoService getWrappedService() {
		return _lineaGastoService;
	}

	@Override
	public void setWrappedService(LineaGastoService lineaGastoService) {
		_lineaGastoService = lineaGastoService;
	}

	private LineaGastoService _lineaGastoService;
}