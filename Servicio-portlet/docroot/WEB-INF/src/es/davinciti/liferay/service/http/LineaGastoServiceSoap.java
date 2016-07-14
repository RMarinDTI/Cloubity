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

import es.davinciti.liferay.service.LineaGastoServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link es.davinciti.liferay.service.LineaGastoServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link es.davinciti.liferay.model.LineaGastoSoap}.
 * If the method in the service utility returns a
 * {@link es.davinciti.liferay.model.LineaGasto}, that is translated to a
 * {@link es.davinciti.liferay.model.LineaGastoSoap}. Methods that SOAP cannot
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
 * @see LineaGastoServiceHttp
 * @see es.davinciti.liferay.model.LineaGastoSoap
 * @see es.davinciti.liferay.service.LineaGastoServiceUtil
 * @generated
 */
public class LineaGastoServiceSoap {
	public static java.lang.String getLineasNotaGasto(long notagastoId)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONArray returnValue = LineaGastoServiceUtil.getLineasNotaGasto(notagastoId);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String addLineaGasto(long notagastoId,
		com.liferay.portal.kernel.json.JSONObject data, java.lang.String localeT)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONObject returnValue = LineaGastoServiceUtil.addLineaGasto(notagastoId,
					data, localeT);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String editLineaGasto(long notagastoId,
		long lineagastoId, com.liferay.portal.kernel.json.JSONObject data,
		java.lang.String localeT) throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONObject returnValue = LineaGastoServiceUtil.editLineaGasto(notagastoId,
					lineagastoId, data, localeT);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String deleteLineaGasto(long lineagastoId,
		java.lang.String localeT) throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONObject returnValue = LineaGastoServiceUtil.deleteLineaGasto(lineagastoId,
					localeT);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static long setImageLineaGasto(long companyId, long userId,
		long documentId, byte[] image) throws RemoteException {
		try {
			long returnValue = LineaGastoServiceUtil.setImageLineaGasto(companyId,
					userId, documentId, image);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(LineaGastoServiceSoap.class);
}