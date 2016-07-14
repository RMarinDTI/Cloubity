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

import es.davinciti.liferay.model.LineaGastoFamilia;
import es.davinciti.liferay.service.LineaGastoFamiliaLocalServiceUtil;
import es.davinciti.liferay.service.base.LineaGastoFamiliaServiceBaseImpl;

/**
 * The implementation of the linea gasto familia remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.LineaGastoFamiliaService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.LineaGastoFamiliaServiceBaseImpl
 * @see es.davinciti.liferay.service.LineaGastoFamiliaServiceUtil
 */
public class LineaGastoFamiliaServiceImpl
	extends LineaGastoFamiliaServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.LineaGastoFamiliaServiceUtil} to access the linea gasto familia remote service.
	 */
	
	/** Devuelve las Familias de la Company **/
	public List<LineaGastoFamilia> getFamilias(long companyId) { 
		List<LineaGastoFamilia> familias = new ArrayList<LineaGastoFamilia>();		
		if (companyId  > 0) {
			try {
				familias = LineaGastoFamiliaLocalServiceUtil.findByCompanyId(companyId);
			} catch(Exception e) { }
		}
		
		return familias;
	}
		
	/** Devuelve la Familia de la Linea de Gasto **/
	public LineaGastoFamilia getFamiliaLineaGasto(long lineagastoId) { 
		LineaGastoFamilia familia = null;
		if (lineagastoId > 0) {
			try {
				long familiaId = LineaGastoFamiliaLocalServiceUtil.getLineaGastoLineaGastoFamilias(lineagastoId).get(0).getFamiliaId();
				familia = LineaGastoFamiliaLocalServiceUtil.getLineaGastoFamilia(familiaId);
			} catch(Exception e) { }
		}
		
		return familia;
	}
	
	
}