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

import es.davinciti.liferay.model.TipoDiaCalendar;
import es.davinciti.liferay.service.base.TipoDiaCalendarLocalServiceBaseImpl;
import es.davinciti.liferay.service.persistence.TipoDiaCalendarUtil;

/**
 * The implementation of the tipo dia calendar local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.TipoDiaCalendarLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.TipoDiaCalendarLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.TipoDiaCalendarLocalServiceUtil
 */
public class TipoDiaCalendarLocalServiceImpl
	extends TipoDiaCalendarLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.TipoDiaCalendarLocalServiceUtil} to access the tipo dia calendar local service.
	 */
	
	public List<TipoDiaCalendar> findByDescripcion(String descripcion) {
		List<TipoDiaCalendar> tipoDiaCalendarList = new ArrayList<TipoDiaCalendar>();
		
		try {
			tipoDiaCalendarList = TipoDiaCalendarUtil.findByDescripcion(descripcion);
		} catch(Exception e) {  }
		
		return tipoDiaCalendarList;		
	}
	
}