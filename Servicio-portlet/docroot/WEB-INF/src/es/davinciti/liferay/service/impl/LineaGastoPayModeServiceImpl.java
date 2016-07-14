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
import es.davinciti.liferay.service.LineaGastoPayModeLocalServiceUtil;
import es.davinciti.liferay.service.base.LineaGastoPayModeServiceBaseImpl;

/**
 * The implementation of the linea gasto pay mode remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.LineaGastoPayModeService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.LineaGastoPayModeServiceBaseImpl
 * @see es.davinciti.liferay.service.LineaGastoPayModeServiceUtil
 */
public class LineaGastoPayModeServiceImpl
	extends LineaGastoPayModeServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.LineaGastoPayModeServiceUtil} to access the linea gasto pay mode remote service.
	 */
	
	/** Devuelve los PayModes de la Company */
	public List<LineaGastoPayMode> getPaymodes(long companyId) { 
		List<LineaGastoPayMode> paymodes = new ArrayList<LineaGastoPayMode>();
		
		if (companyId > 0) {
			try { 
				paymodes = LineaGastoPayModeLocalServiceUtil.findByCompanyId(companyId);
			} catch(Exception e) { }
		}
		
		return paymodes;
	}
	
	/** Devuelve el PayMode de la Linea de Gasto */
	public LineaGastoPayMode getPaymodeLineaGasto(long lineagastoId) { 
		LineaGastoPayMode paymode = null;
		
		if (lineagastoId > 0) {
			try { 
				long paymodeId = LineaGastoPayModeLocalServiceUtil.getLineaGastoLineaGastoPayModes(lineagastoId).get(0).getPaymodeId();
				paymode = LineaGastoPayModeLocalServiceUtil.getLineaGastoPayMode(paymodeId);
			} catch(Exception e) { }
		}
		
		return paymode;
	}
}