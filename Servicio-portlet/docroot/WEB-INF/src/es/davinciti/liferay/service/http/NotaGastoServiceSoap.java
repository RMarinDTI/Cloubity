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

package es.davinciti.liferay.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import es.davinciti.liferay.service.NotaGastoServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link es.davinciti.liferay.service.NotaGastoServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link es.davinciti.liferay.model.NotaGastoSoap}.
 * If the method in the service utility returns a
 * {@link es.davinciti.liferay.model.NotaGasto}, that is translated to a
 * {@link es.davinciti.liferay.model.NotaGastoSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Cmes
 * @see NotaGastoServiceHttp
 * @see es.davinciti.liferay.model.NotaGastoSoap
 * @see es.davinciti.liferay.service.NotaGastoServiceUtil
 * @generated
 */
public class NotaGastoServiceSoap {
	public static java.lang.String getApplicationStatusName(long statusId,
		java.lang.String localeT) throws RemoteException {
		try {
			java.lang.String returnValue = NotaGastoServiceUtil.getApplicationStatusName(statusId,
					localeT);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean isUsuarioAdministrador(long companyId, long userId)
		throws RemoteException {
		try {
			boolean returnValue = NotaGastoServiceUtil.isUsuarioAdministrador(companyId,
					userId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean isUsuarioValidador(long companyId, long userId)
		throws RemoteException {
		try {
			boolean returnValue = NotaGastoServiceUtil.isUsuarioValidador(companyId,
					userId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean isUsuarioBasico(long companyId, long userId)
		throws RemoteException {
		try {
			boolean returnValue = NotaGastoServiceUtil.isUsuarioBasico(companyId,
					userId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	/**
	* Devuelve un listado de las Organizations del Usuario
	*/
	public static java.lang.String getOrganizationSageCompanies(
		long companyId, long userId) throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONArray returnValue = NotaGastoServiceUtil.getOrganizationSageCompanies(companyId,
					userId);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getCompanyExpensesNote(long companyId)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONArray returnValue = NotaGastoServiceUtil.getCompanyExpensesNote(companyId);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getUserExpensesNote(long companyId,
		long userId) throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONArray returnValue = NotaGastoServiceUtil.getUserExpensesNote(companyId,
					userId);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String addNotaGasto(long companyId, long userId,
		java.lang.String dataIni, java.lang.String localeT)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONObject returnValue = NotaGastoServiceUtil.addNotaGasto(companyId,
					userId, dataIni, localeT);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String editNotaGasto(long notagastoId,
		com.liferay.portal.kernel.json.JSONObject data, java.lang.String localeT)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONObject returnValue = NotaGastoServiceUtil.editNotaGasto(notagastoId,
					data, localeT);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String deleteNotaGasto(long notagastoId,
		java.lang.String localeT) throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONObject returnValue = NotaGastoServiceUtil.deleteNotaGasto(notagastoId,
					localeT);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String sendValidateNotaGasto(long notagastoId,
		java.lang.String localeT) throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONObject returnValue = NotaGastoServiceUtil.sendValidateNotaGasto(notagastoId,
					localeT);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String denyNotaGasto(long notagastoId,
		java.lang.String localeT) throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONObject returnValue = NotaGastoServiceUtil.denyNotaGasto(notagastoId,
					localeT);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String validateNotaGasto(long companyId,
		long userId, long notagastoId, java.lang.String localeT)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONObject returnValue = NotaGastoServiceUtil.validateNotaGasto(companyId,
					userId, notagastoId, localeT);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(NotaGastoServiceSoap.class);
}