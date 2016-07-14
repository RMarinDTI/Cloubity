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

import es.davinciti.liferay.service.LineaGastoFamiliaServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link es.davinciti.liferay.service.LineaGastoFamiliaServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link es.davinciti.liferay.model.LineaGastoFamiliaSoap}.
 * If the method in the service utility returns a
 * {@link es.davinciti.liferay.model.LineaGastoFamilia}, that is translated to a
 * {@link es.davinciti.liferay.model.LineaGastoFamiliaSoap}. Methods that SOAP cannot
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
 * @see LineaGastoFamiliaServiceHttp
 * @see es.davinciti.liferay.model.LineaGastoFamiliaSoap
 * @see es.davinciti.liferay.service.LineaGastoFamiliaServiceUtil
 * @generated
 */
public class LineaGastoFamiliaServiceSoap {
	/**
	* Devuelve las Familias de la Company
	*/
	public static es.davinciti.liferay.model.LineaGastoFamiliaSoap[] getFamilias(
		long companyId) throws RemoteException {
		try {
			java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> returnValue =
				LineaGastoFamiliaServiceUtil.getFamilias(companyId);

			return es.davinciti.liferay.model.LineaGastoFamiliaSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	/**
	* Devuelve la Familia de la Linea de Gasto
	*/
	public static es.davinciti.liferay.model.LineaGastoFamiliaSoap getFamiliaLineaGasto(
		long lineagastoId) throws RemoteException {
		try {
			es.davinciti.liferay.model.LineaGastoFamilia returnValue = LineaGastoFamiliaServiceUtil.getFamiliaLineaGasto(lineagastoId);

			return es.davinciti.liferay.model.LineaGastoFamiliaSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(LineaGastoFamiliaServiceSoap.class);
}