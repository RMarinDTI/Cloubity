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
 * Provides a wrapper for {@link NotaGastoService}.
 *
 * @author Cmes
 * @see NotaGastoService
 * @generated
 */
public class NotaGastoServiceWrapper implements NotaGastoService,
	ServiceWrapper<NotaGastoService> {
	public NotaGastoServiceWrapper(NotaGastoService notaGastoService) {
		_notaGastoService = notaGastoService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _notaGastoService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_notaGastoService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _notaGastoService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.lang.String getApplicationStatusName(long statusId,
		java.lang.String localeT) {
		return _notaGastoService.getApplicationStatusName(statusId, localeT);
	}

	@Override
	public boolean isUsuarioAdministrador(long companyId, long userId) {
		return _notaGastoService.isUsuarioAdministrador(companyId, userId);
	}

	@Override
	public boolean isUsuarioValidador(long companyId, long userId) {
		return _notaGastoService.isUsuarioValidador(companyId, userId);
	}

	@Override
	public boolean isUsuarioBasico(long companyId, long userId) {
		return _notaGastoService.isUsuarioBasico(companyId, userId);
	}

	/**
	* Devuelve un listado de las Organizations del Usuario
	*/
	@Override
	public com.liferay.portal.kernel.json.JSONArray getOrganizationSageCompanies(
		long companyId, long userId) {
		return _notaGastoService.getOrganizationSageCompanies(companyId, userId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getCompanyExpensesNote(
		long companyId) {
		return _notaGastoService.getCompanyExpensesNote(companyId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getUserExpensesNote(
		long companyId, long userId) {
		return _notaGastoService.getUserExpensesNote(companyId, userId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject addNotaGasto(
		long companyId, long userId, java.lang.String dataIni,
		java.lang.String localeT) {
		return _notaGastoService.addNotaGasto(companyId, userId, dataIni,
			localeT);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject editNotaGasto(
		long notagastoId, com.liferay.portal.kernel.json.JSONObject data,
		java.lang.String localeT) {
		return _notaGastoService.editNotaGasto(notagastoId, data, localeT);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject deleteNotaGasto(
		long notagastoId, java.lang.String localeT) {
		return _notaGastoService.deleteNotaGasto(notagastoId, localeT);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject sendValidateNotaGasto(
		long notagastoId, java.lang.String localeT) {
		return _notaGastoService.sendValidateNotaGasto(notagastoId, localeT);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject denyNotaGasto(
		long notagastoId, java.lang.String localeT) {
		return _notaGastoService.denyNotaGasto(notagastoId, localeT);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject validateNotaGasto(
		long companyId, long userId, long notagastoId, java.lang.String localeT) {
		return _notaGastoService.validateNotaGasto(companyId, userId,
			notagastoId, localeT);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public NotaGastoService getWrappedNotaGastoService() {
		return _notaGastoService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedNotaGastoService(NotaGastoService notaGastoService) {
		_notaGastoService = notaGastoService;
	}

	@Override
	public NotaGastoService getWrappedService() {
		return _notaGastoService;
	}

	@Override
	public void setWrappedService(NotaGastoService notaGastoService) {
		_notaGastoService = notaGastoService;
	}

	private NotaGastoService _notaGastoService;
}