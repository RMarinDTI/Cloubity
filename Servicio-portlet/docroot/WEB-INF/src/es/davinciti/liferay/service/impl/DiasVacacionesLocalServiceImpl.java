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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

import es.davinciti.liferay.model.DiasVacaciones;
import es.davinciti.liferay.service.base.DiasVacacionesLocalServiceBaseImpl;
import es.davinciti.liferay.service.persistence.DiasVacacionesUtil;

/**
 * The implementation of the dias vacaciones local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.DiasVacacionesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.DiasVacacionesLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.DiasVacacionesLocalServiceUtil
 */
public class DiasVacacionesLocalServiceImpl
	extends DiasVacacionesLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.DiasVacacionesLocalServiceUtil} to access the dias vacaciones local service.
	 */
	
	public List<DiasVacaciones> findByCompanyIdUserIdYear(long companyId, long userId, int year) {
		List<DiasVacaciones> diasVacList = new ArrayList<DiasVacaciones>();
		
		try {
			diasVacList = DiasVacacionesUtil.findByCompanyIdUserIdYear(companyId, userId, year);
		} catch(Exception e) { }
		
		return diasVacList;
	}
	
	public int getDiasDisponibles(long companyId, long userId, int year) {
		int dias = -1;
		
		try {
			dias = DiasVacacionesUtil.findByCompanyIdUserIdYear(companyId, userId, year).get(0).getDisponibles();
		} catch(Exception e) { }
		
		return dias;
	}
	
	public List<User> getSearchUser(String name) throws SystemException {
		DynamicQuery dynamicQuery = buildUserDynamicQuery(name);
		return UserLocalServiceUtil.dynamicQuery(dynamicQuery);
	}
	
	public int getSearchUserCount(String name) {
		int usersSearchCount = 0;
		
		try {
			 DynamicQuery dynamicQuery = buildUserDynamicQuery(name);
			 return (int)UserLocalServiceUtil.dynamicQueryCount(dynamicQuery);
		} catch(Exception e) { }
		
		return usersSearchCount;
	}	
	
	protected DynamicQuery buildUserDynamicQuery(String name) {
		Junction junction = RestrictionsFactoryUtil.conjunction();
		if(Validator.isNotNull(name)) {
			Property property = PropertyFactoryUtil.forName("fullName");
			String value = (new StringBuilder("%")).append(name).append("%").toString();	
			junction.add(property.like(value));
		}
		 
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(User.class, getClassLoader());
		 
		return dynamicQuery.add(junction);		 
	}
	
}