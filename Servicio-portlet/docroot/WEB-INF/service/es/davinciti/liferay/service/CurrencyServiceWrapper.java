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
 * Provides a wrapper for {@link CurrencyService}.
 *
 * @author Cmes
 * @see CurrencyService
 * @generated
 */
public class CurrencyServiceWrapper implements CurrencyService,
	ServiceWrapper<CurrencyService> {
	public CurrencyServiceWrapper(CurrencyService currencyService) {
		_currencyService = currencyService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _currencyService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_currencyService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _currencyService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Devuelve la Currency de la Linea de Gasto
	*/
	@Override
	public es.davinciti.liferay.model.Currency getCurrencyLineaGasto(
		long lineagastoId) {
		return _currencyService.getCurrencyLineaGasto(lineagastoId);
	}

	/**
	* Devuelve la Currency
	*/
	@Override
	public es.davinciti.liferay.model.Currency getCurrency(long currencyId) {
		return _currencyService.getCurrency(currencyId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CurrencyService getWrappedCurrencyService() {
		return _currencyService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCurrencyService(CurrencyService currencyService) {
		_currencyService = currencyService;
	}

	@Override
	public CurrencyService getWrappedService() {
		return _currencyService;
	}

	@Override
	public void setWrappedService(CurrencyService currencyService) {
		_currencyService = currencyService;
	}

	private CurrencyService _currencyService;
}