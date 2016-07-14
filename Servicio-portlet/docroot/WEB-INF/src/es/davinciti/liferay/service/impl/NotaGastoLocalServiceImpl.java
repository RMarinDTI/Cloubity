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
import java.util.Locale;

import com.liferay.portal.kernel.json.*;
import es.davinciti.liferay.model.LineaGasto;
import es.davinciti.liferay.model.NotaGasto;
import es.davinciti.liferay.model.OrganizationSageCompany;
import es.davinciti.liferay.service.OrganizationSageCompanyLocalServiceUtil;
import es.davinciti.liferay.service.SageEmployeeLocalServiceUtil;
import es.davinciti.liferay.service.base.NotaGastoLocalServiceBaseImpl;
import es.davinciti.liferay.service.persistence.NotaGastoUtil;
import es.davinciti.util.Constants;
import es.davinciti.webapiclient.client.AccountClient_SAGE;

/**
 * The implementation of the nota gasto local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.NotaGastoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.NotaGastoLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.NotaGastoLocalServiceUtil
 */
public class NotaGastoLocalServiceImpl extends NotaGastoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.NotaGastoLocalServiceUtil} to access the nota gasto local service.
	 */
	
	public List<OrganizationSageCompany> getOrganizationsSageCompanies(long notaGastoId) {
		
		List<OrganizationSageCompany> orgSageCompList = new ArrayList<OrganizationSageCompany>();
		
		try {
			orgSageCompList = NotaGastoUtil.getOrganizationSageCompanies(notaGastoId);
		} catch(Exception e) { }
		
		return orgSageCompList;
	}
	
	public String getSageCompany(long notagastoId) {
		String sageCompany = "";
		
		if (notagastoId > 0) {
			try {
				long orgsagecompanyId = OrganizationSageCompanyLocalServiceUtil.getNotaGastoOrganizationSageCompanies(notagastoId).get(0).getOrgsagecompanyId();
				sageCompany = OrganizationSageCompanyLocalServiceUtil.getOrganizationSageCompany(orgsagecompanyId).getSageCompanyId();
			} catch(Exception e) { }
			
		}
		return sageCompany;
		
	}
	
	public List<NotaGasto> findByCompanyIdUserId(long companyId, long userId) {
		List<NotaGasto> notasList = new ArrayList<NotaGasto>();
		try {
			notasList = NotaGastoUtil.findByCompanyIdUserId(companyId,userId);
		} catch(Exception e) { }
		
		return notasList;
	}
	
	public List<NotaGasto> findByCompanyId(long companyId) {
		List<NotaGasto> notasList = new ArrayList<NotaGasto>();
		try {
			notasList = NotaGastoUtil.findByCompanyId(companyId);
		} catch(Exception e) { }
		
		return notasList;
	}
	
	public void deleteNotaGastoLineas(long notagastoId) {
		try {
			List<LineaGasto> lineaGastos = NotaGastoUtil.getLineaGastos(notagastoId);
			NotaGastoUtil.removeLineaGastos(notagastoId, lineaGastos);
			NotaGastoUtil.clearLineaGastos(notagastoId);
		} catch(Exception e) { }		
	}
	
	public String validateNotaGasto(long notagastoId, long configId, long userId, Locale locale) {
		String result = "";
		if (configId  > 0 && notagastoId > 0) {
			try {
				AccountClient_SAGE account = new AccountClient_SAGE();
				JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
				JSONObject jsonObj = JSONFactoryUtil.createJSONObject();
				jsonObj.put("notagastoId", notagastoId);
				jsonObj.put("userId", userId);
				jsonArray.put(jsonObj);				
				List<String> headers = new ArrayList<String>();
				result = account.setInfo(Constants.METODO_ESPECIAL_VALIDAR_NOTAGASTO, configId, headers, jsonArray, locale);
			} catch(Exception e) { }
		}
		
		return result;
	}
	
	public String getSageEmployeeId(long userId) {
		String employeeId = "";
		if (userId > 0) {
			try {
				long sageEmployeeId = SageEmployeeLocalServiceUtil.findByUserId(userId).get(0).getSageEmployeeId();
				employeeId = SageEmployeeLocalServiceUtil.getSageEmployee(sageEmployeeId).getEmployeeID();
			} catch(Exception e) { }
		}
		
		return employeeId;
	}
}