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
 * Provides the remote service utility for Currency. This utility wraps
 * {@link es.davinciti.liferay.service.impl.CurrencyServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Cmes
 * @see CurrencyService
 * @see es.davinciti.liferay.service.base.CurrencyServiceBaseImpl
 * @see es.davinciti.liferay.service.impl.CurrencyServiceImpl
 * @generated
 */
public class CurrencyServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.davinciti.liferay.service.impl.CurrencyServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	/**
	* Devuelve la Currency de la Linea de Gasto
	*/
	public static es.davinciti.liferay.model.Currency getCurrencyLineaGasto(
		long lineagastoId) {
		return getService().getCurrencyLineaGasto(lineagastoId);
	}

	/**
	* Devuelve la Currency
	*/
	public static es.davinciti.liferay.model.Currency getCurrency(
		long currencyId) {
		return getService().getCurrency(currencyId);
	}

	public static void clearService() {
		_service = null;
	}

	public static CurrencyService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CurrencyService.class.getName());

			if (invokableService instanceof CurrencyService) {
				_service = (CurrencyService)invokableService;
			}
			else {
				_service = new CurrencyServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(CurrencyServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CurrencyService service) {
	}

	private static CurrencyService _service;
}