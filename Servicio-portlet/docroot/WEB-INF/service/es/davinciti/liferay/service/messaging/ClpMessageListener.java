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

package es.davinciti.liferay.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import es.davinciti.liferay.service.ApplicationStatusLocalServiceUtil;
import es.davinciti.liferay.service.ApplicationStatusServiceUtil;
import es.davinciti.liferay.service.CalendarioLocalServiceUtil;
import es.davinciti.liferay.service.CalendarioServiceUtil;
import es.davinciti.liferay.service.ClpSerializer;
import es.davinciti.liferay.service.ConnectionActionTypesLocalServiceUtil;
import es.davinciti.liferay.service.ConnectionActionTypesServiceUtil;
import es.davinciti.liferay.service.ConnectionConfigsLocalServiceUtil;
import es.davinciti.liferay.service.ConnectionConfigsServiceUtil;
import es.davinciti.liferay.service.ConnectionDataLocalServiceUtil;
import es.davinciti.liferay.service.ConnectionDataServiceUtil;
import es.davinciti.liferay.service.ConnectionTypesLocalServiceUtil;
import es.davinciti.liferay.service.ConnectionTypesServiceUtil;
import es.davinciti.liferay.service.CurrenciesCompanyLocalServiceUtil;
import es.davinciti.liferay.service.CurrenciesCompanyServiceUtil;
import es.davinciti.liferay.service.CurrencyLocalServiceUtil;
import es.davinciti.liferay.service.CurrencyServiceUtil;
import es.davinciti.liferay.service.DiasVacacionesLocalServiceUtil;
import es.davinciti.liferay.service.DiasVacacionesServiceUtil;
import es.davinciti.liferay.service.HistoricoNotaLocalServiceUtil;
import es.davinciti.liferay.service.HistoricoNotaServiceUtil;
import es.davinciti.liferay.service.LineaGastoCategoriaLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoCategoriaServiceUtil;
import es.davinciti.liferay.service.LineaGastoClienteLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoClienteServiceUtil;
import es.davinciti.liferay.service.LineaGastoFamiliaLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoFamiliaServiceUtil;
import es.davinciti.liferay.service.LineaGastoLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoPayModeLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoPayModeServiceUtil;
import es.davinciti.liferay.service.LineaGastoProyectoLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoProyectoServiceUtil;
import es.davinciti.liferay.service.LineaGastoServiceUtil;
import es.davinciti.liferay.service.NotaGastoLocalServiceUtil;
import es.davinciti.liferay.service.NotaGastoServiceUtil;
import es.davinciti.liferay.service.OrganizationSageCompanyLocalServiceUtil;
import es.davinciti.liferay.service.OrganizationSageCompanyServiceUtil;
import es.davinciti.liferay.service.SageEmployeeLocalServiceUtil;
import es.davinciti.liferay.service.SageEmployeeServiceUtil;
import es.davinciti.liferay.service.SapEmployeeLocalServiceUtil;
import es.davinciti.liferay.service.SapEmployeeServiceUtil;
import es.davinciti.liferay.service.TipoDiaCalendarLocalServiceUtil;
import es.davinciti.liferay.service.TipoDiaCalendarServiceUtil;

/**
 * @author Cmes
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			ApplicationStatusLocalServiceUtil.clearService();

			ApplicationStatusServiceUtil.clearService();
			CalendarioLocalServiceUtil.clearService();

			CalendarioServiceUtil.clearService();
			ConnectionActionTypesLocalServiceUtil.clearService();

			ConnectionActionTypesServiceUtil.clearService();
			ConnectionConfigsLocalServiceUtil.clearService();

			ConnectionConfigsServiceUtil.clearService();
			ConnectionDataLocalServiceUtil.clearService();

			ConnectionDataServiceUtil.clearService();
			ConnectionTypesLocalServiceUtil.clearService();

			ConnectionTypesServiceUtil.clearService();
			CurrenciesCompanyLocalServiceUtil.clearService();

			CurrenciesCompanyServiceUtil.clearService();
			CurrencyLocalServiceUtil.clearService();

			CurrencyServiceUtil.clearService();
			DiasVacacionesLocalServiceUtil.clearService();

			DiasVacacionesServiceUtil.clearService();
			HistoricoNotaLocalServiceUtil.clearService();

			HistoricoNotaServiceUtil.clearService();
			LineaGastoLocalServiceUtil.clearService();

			LineaGastoServiceUtil.clearService();
			LineaGastoCategoriaLocalServiceUtil.clearService();

			LineaGastoCategoriaServiceUtil.clearService();
			LineaGastoClienteLocalServiceUtil.clearService();

			LineaGastoClienteServiceUtil.clearService();
			LineaGastoFamiliaLocalServiceUtil.clearService();

			LineaGastoFamiliaServiceUtil.clearService();
			LineaGastoPayModeLocalServiceUtil.clearService();

			LineaGastoPayModeServiceUtil.clearService();
			LineaGastoProyectoLocalServiceUtil.clearService();

			LineaGastoProyectoServiceUtil.clearService();
			NotaGastoLocalServiceUtil.clearService();

			NotaGastoServiceUtil.clearService();
			OrganizationSageCompanyLocalServiceUtil.clearService();

			OrganizationSageCompanyServiceUtil.clearService();
			SageEmployeeLocalServiceUtil.clearService();

			SageEmployeeServiceUtil.clearService();
			SapEmployeeLocalServiceUtil.clearService();

			SapEmployeeServiceUtil.clearService();
			TipoDiaCalendarLocalServiceUtil.clearService();

			TipoDiaCalendarServiceUtil.clearService();
		}
	}
}