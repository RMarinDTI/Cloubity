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
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for NotaGasto. This utility wraps
 * {@link es.davinciti.liferay.service.impl.NotaGastoServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Cmes
 * @see NotaGastoService
 * @see es.davinciti.liferay.service.base.NotaGastoServiceBaseImpl
 * @see es.davinciti.liferay.service.impl.NotaGastoServiceImpl
 * @generated
 */
public class NotaGastoServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.davinciti.liferay.service.impl.NotaGastoServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

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

	public static java.lang.String getApplicationStatusName(long statusId,
		java.lang.String localeT) {
		return getService().getApplicationStatusName(statusId, localeT);
	}

	public static boolean isUsuarioAdministrador(long companyId, long userId) {
		return getService().isUsuarioAdministrador(companyId, userId);
	}

	public static boolean isUsuarioValidador(long companyId, long userId) {
		return getService().isUsuarioValidador(companyId, userId);
	}

	public static boolean isUsuarioBasico(long companyId, long userId) {
		return getService().isUsuarioBasico(companyId, userId);
	}

	/**
	* Devuelve un listado de las Organizations del Usuario
	*/
	public static com.liferay.portal.kernel.json.JSONArray getOrganizationSageCompanies(
		long companyId, long userId) {
		return getService().getOrganizationSageCompanies(companyId, userId);
	}

	public static com.liferay.portal.kernel.json.JSONArray getCompanyExpensesNote(
		long companyId) {
		return getService().getCompanyExpensesNote(companyId);
	}

	public static com.liferay.portal.kernel.json.JSONArray getUserExpensesNote(
		long companyId, long userId) {
		return getService().getUserExpensesNote(companyId, userId);
	}

	public static com.liferay.portal.kernel.json.JSONObject addNotaGasto(
		long companyId, long userId, java.lang.String dataIni,
		java.lang.String localeT) {
		return getService().addNotaGasto(companyId, userId, dataIni, localeT);
	}

	public static com.liferay.portal.kernel.json.JSONObject editNotaGasto(
		long notagastoId, com.liferay.portal.kernel.json.JSONObject data,
		java.lang.String localeT) {
		return getService().editNotaGasto(notagastoId, data, localeT);
	}

	public static com.liferay.portal.kernel.json.JSONObject deleteNotaGasto(
		long notagastoId, java.lang.String localeT) {
		return getService().deleteNotaGasto(notagastoId, localeT);
	}

	public static com.liferay.portal.kernel.json.JSONObject sendValidateNotaGasto(
		long notagastoId, java.lang.String localeT) {
		return getService().sendValidateNotaGasto(notagastoId, localeT);
	}

	public static com.liferay.portal.kernel.json.JSONObject denyNotaGasto(
		long notagastoId, java.lang.String localeT) {
		return getService().denyNotaGasto(notagastoId, localeT);
	}

	public static com.liferay.portal.kernel.json.JSONObject validateNotaGasto(
		long companyId, long userId, long notagastoId, java.lang.String localeT) {
		return getService()
				   .validateNotaGasto(companyId, userId, notagastoId, localeT);
	}

	public static void clearService() {
		_service = null;
	}

	public static NotaGastoService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					NotaGastoService.class.getName());

			if (invokableService instanceof NotaGastoService) {
				_service = (NotaGastoService)invokableService;
			}
			else {
				_service = new NotaGastoServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(NotaGastoServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(NotaGastoService service) {
	}

	private static NotaGastoService _service;
}