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
import es.davinciti.liferay.service.base.LineaGastoFamiliaLocalServiceBaseImpl;
import es.davinciti.liferay.service.persistence.LineaGastoFamiliaUtil;

/**
 * The implementation of the linea gasto familia local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.LineaGastoFamiliaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.LineaGastoFamiliaLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.LineaGastoFamiliaLocalServiceUtil
 */
public class LineaGastoFamiliaLocalServiceImpl
	extends LineaGastoFamiliaLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.LineaGastoFamiliaLocalServiceUtil} to access the linea gasto familia local service.
	 */
	
	public List<LineaGastoFamilia> findByCompanyId(long companyId) {
		List<LineaGastoFamilia> familias = new ArrayList<LineaGastoFamilia>();
		
		try {
			familias = LineaGastoFamiliaUtil.findByCompanyId(companyId);
		} catch(Exception e) { }
		
		return familias;
		
		
	}
}