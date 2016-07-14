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
 * Provides a wrapper for {@link CurrenciesCompanyService}.
 *
 * @author Cmes
 * @see CurrenciesCompanyService
 * @generated
 */
public class CurrenciesCompanyServiceWrapper implements CurrenciesCompanyService,
	ServiceWrapper<CurrenciesCompanyService> {
	public CurrenciesCompanyServiceWrapper(
		CurrenciesCompanyService currenciesCompanyService) {
		_currenciesCompanyService = currenciesCompanyService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _currenciesCompanyService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_currenciesCompanyService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _currenciesCompanyService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Devuelve las Currencies asociadas a la Company
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.CurrenciesCompany> getCurrenciesCompany(
		long companyId) {
		return _currenciesCompanyService.getCurrenciesCompany(companyId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CurrenciesCompanyService getWrappedCurrenciesCompanyService() {
		return _currenciesCompanyService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCurrenciesCompanyService(
		CurrenciesCompanyService currenciesCompanyService) {
		_currenciesCompanyService = currenciesCompanyService;
	}

	@Override
	public CurrenciesCompanyService getWrappedService() {
		return _currenciesCompanyService;
	}

	@Override
	public void setWrappedService(
		CurrenciesCompanyService currenciesCompanyService) {
		_currenciesCompanyService = currenciesCompanyService;
	}

	private CurrenciesCompanyService _currenciesCompanyService;
}