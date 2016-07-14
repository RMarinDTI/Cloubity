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

import es.davinciti.liferay.model.Currency;
import es.davinciti.liferay.service.CurrencyLocalServiceUtil;
import es.davinciti.liferay.service.base.CurrencyServiceBaseImpl;

/**
 * The implementation of the currency remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.CurrencyService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.CurrencyServiceBaseImpl
 * @see es.davinciti.liferay.service.CurrencyServiceUtil
 */
public class CurrencyServiceImpl extends CurrencyServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.CurrencyServiceUtil} to access the currency remote service.
	 */
		
	/** Devuelve la Currency de la Linea de Gasto */
	public Currency getCurrencyLineaGasto(long lineagastoId) { 
		Currency currency = null;
		
		if (lineagastoId > 0) {
			try {
				long currencyId = CurrencyLocalServiceUtil.getLineaGastoCurrencies(lineagastoId).get(0).getCurrencyId();
				currency = CurrencyLocalServiceUtil.getCurrency(currencyId);
			} catch(Exception e) { }
		}
		
		return currency;
	}
	
	/** Devuelve la Currency */
	public Currency getCurrency(long currencyId) { 
		Currency currency = null;
		
		if (currencyId > 0) {
			try { 
				currency = CurrencyLocalServiceUtil.getCurrency(currencyId);
			} catch(Exception e) { }
		}
		
		return currency;
	}
	
}