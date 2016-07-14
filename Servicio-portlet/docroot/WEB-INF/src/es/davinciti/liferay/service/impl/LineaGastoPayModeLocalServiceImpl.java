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

import es.davinciti.liferay.model.LineaGastoPayMode;
import es.davinciti.liferay.service.base.LineaGastoPayModeLocalServiceBaseImpl;
import es.davinciti.liferay.service.persistence.LineaGastoPayModeUtil;

/**
 * The implementation of the linea gasto pay mode local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.LineaGastoPayModeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.LineaGastoPayModeLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.LineaGastoPayModeLocalServiceUtil
 */
public class LineaGastoPayModeLocalServiceImpl
	extends LineaGastoPayModeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.LineaGastoPayModeLocalServiceUtil} to access the linea gasto pay mode local service.
	 */
	
	public List<LineaGastoPayMode> findByCompanyId(long companyId) {
		List<LineaGastoPayMode> paymodes = new ArrayList<LineaGastoPayMode>();
		
		if (companyId > 0) {
			try {
				paymodes = LineaGastoPayModeUtil.findByCompanyId(companyId);
			} catch(Exception e) { }
		}
		
		return paymodes;
	}
}