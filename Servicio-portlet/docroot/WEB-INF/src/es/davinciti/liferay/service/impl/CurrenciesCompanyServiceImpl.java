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

package es.davinciti.liferay.service.impl;

import java.util.ArrayList;
import java.util.List;

import es.davinciti.liferay.model.CurrenciesCompany;
import es.davinciti.liferay.service.base.CurrenciesCompanyServiceBaseImpl;

/**
 * The implementation of the currencies company remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.CurrenciesCompanyService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.CurrenciesCompanyServiceBaseImpl
 * @see es.davinciti.liferay.service.CurrenciesCompanyServiceUtil
 */
public class CurrenciesCompanyServiceImpl
	extends CurrenciesCompanyServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.CurrenciesCompanyServiceUtil} to access the currencies company remote service.
	 */
	
	/** Devuelve las Currencies asociadas a la Company */
	public List<CurrenciesCompany> getCurrenciesCompany(long companyId) { 
		List<CurrenciesCompany> currenciesCompany = new ArrayList<CurrenciesCompany>();
		
		return currenciesCompany;
	}
}