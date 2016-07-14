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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.*;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.model.Organization;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.service.UserGroupRoleLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;

import es.davinciti.liferay.model.LineaGasto;
import es.davinciti.liferay.model.NotaGasto;
import es.davinciti.liferay.service.ApplicationStatusLocalServiceUtil;
import es.davinciti.liferay.service.ConnectionConfigsLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoLocalServiceUtil;
import es.davinciti.liferay.service.NotaGastoLocalServiceUtil;
import es.davinciti.liferay.service.OrganizationSageCompanyLocalServiceUtil;
import es.davinciti.liferay.service.base.NotaGastoServiceBaseImpl;
import es.davinciti.util.Constants;

/**
 * The implementation of the nota gasto remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.NotaGastoService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.NotaGastoServiceBaseImpl
 * @see es.davinciti.liferay.service.NotaGastoServiceUtil
 */
public class NotaGastoServiceImpl extends NotaGastoServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.NotaGastoServiceUtil} to access the nota gasto remote service.
	 */
	
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	// GETTERS
	
	public String getApplicationStatusName(long statusId, String localeT) {
		String status = "";
		Locale locale;
		try {
			locale = LocaleUtil.fromLanguageId(localeT);
		} catch(Exception e) {
			locale = LocaleUtil.getDefault();
		}
		try {
			String statusT = String.valueOf(statusId);
			status = ApplicationStatusLocalServiceUtil.findByApplicationNameStatusId(Constants.BBDD_APPLICATIONSTATUS_NAME_EXPENSESNOTES, statusT).get(0).getName();
			status = LanguageUtil.get(locale, status);
		} catch(Exception e) { }
		
		return status;		
	}
	
	// ROLES
	
	public boolean isUsuarioAdministrador(long companyId, long userId) {
		boolean isAdmin = false;
		
		try {
			long groupId = GroupLocalServiceUtil.getGroup(companyId, Constants.USUARIO_GUEST).getGroupId();
			isAdmin = UserGroupRoleLocalServiceUtil.hasUserGroupRole(userId, groupId, Constants.USUARIO_ADMINISTRADOR_ROLE);
			
		} catch(Exception e) { }
		
		return isAdmin;
	}
	
	
	public boolean isUsuarioValidador(long companyId, long userId) {
		boolean isVal = false;
		
		try {
			long groupId = GroupLocalServiceUtil.getGroup(companyId, Constants.USUARIO_GUEST).getGroupId();
			isVal = UserGroupRoleLocalServiceUtil.hasUserGroupRole(userId, groupId, Constants.USUARIO_VALIDADOR_ROLE);
			
		} catch(Exception e) { }
		
		return isVal;
	}
	
	public boolean isUsuarioBasico(long companyId, long userId) {
		boolean isBasic = false;
		
		try {
			long groupId = GroupLocalServiceUtil.getGroup(companyId, Constants.USUARIO_GUEST).getGroupId();
			isBasic = UserGroupRoleLocalServiceUtil.hasUserGroupRole(userId, groupId, Constants.USUARIO_BASICO_ROLE);
			
		} catch(Exception e) { }
		
		return isBasic;
	}
	
	/** Devuelve un listado de las Organizations del Usuario */
	public JSONArray getOrganizationSageCompanies(long companyId, long userId) { 
		JSONArray orgsJson = JSONFactoryUtil.createJSONArray();
		try {
			List<Organization> userOrganizations = OrganizationLocalServiceUtil.getUserOrganizations(userId);
			for (Organization userOrganization : userOrganizations) {
				JSONObject orgJson = JSONFactoryUtil.createJSONObject();
				orgJson.put("organizationId", userOrganization.getOrganizationId());
				orgJson.put("name", userOrganization.getName());
				orgsJson.put(orgJson);
				List<Organization> userSubOrganizations = OrganizationLocalServiceUtil.getSuborganizations(companyId, userOrganization.getOrganizationId());
				for (Organization userSubOrganization : userSubOrganizations) {
					JSONObject subOrgJson = JSONFactoryUtil.createJSONObject();
					subOrgJson.put("organizationId", userSubOrganization.getOrganizationId());
					subOrgJson.put("name", userSubOrganization.getName());
					orgsJson.put(subOrgJson);
				}
			}			
		} catch(Exception e) { }
		
		return orgsJson;
	}
	
	// EXPENSES NOTES
	
	public JSONArray getCompanyExpensesNote(long companyId) {
		JSONArray notasJson = JSONFactoryUtil.createJSONArray();
		List<NotaGasto> notas = new ArrayList<NotaGasto>();
		try {
			 notas = NotaGastoLocalServiceUtil.findByCompanyId(companyId);
			 for (NotaGasto nota : notas) {
				 long organizationId = OrganizationSageCompanyLocalServiceUtil.getNotaGastoOrganizationSageCompanies(nota.getNotagastoId()).get(0).getOrganizationId();
				 JSONObject notaJson = JSONFactoryUtil.createJSONObject();
				 notaJson.put("notagastoId", nota.getNotagastoId());
				 notaJson.put("companyId", nota.getCompanyId());
				 notaJson.put("userId", nota.getUserId());
				 notaJson.put("organizationId", organizationId);
				 notaJson.put("description", nota.getDescription());
				 notaJson.put("startDate", nota.getStartDate());
				 notaJson.put("endDate", nota.getEndDate());
				 notaJson.put("comments", nota.getComments());
				 notaJson.put("status", nota.getStatus());
				 notaJson.put("amount", nota.getAmount());
				 notaJson.put("createDate", nota.getCreateDate());
				 notaJson.put("updateDate", nota.getUpdateDate());
				 notasJson.put(notaJson);
			 }
		} catch(Exception e) { }
		
		return notasJson;
	}
	
	public JSONArray getUserExpensesNote(long companyId, long userId) {
		JSONArray notasJson = JSONFactoryUtil.createJSONArray();
		List<NotaGasto> notas = new ArrayList<NotaGasto>();
		
		try {
			 notas = NotaGastoLocalServiceUtil.findByCompanyIdUserId(companyId, userId);
			 for (NotaGasto nota : notas) {
				 long organizationId = OrganizationSageCompanyLocalServiceUtil.getNotaGastoOrganizationSageCompanies(nota.getNotagastoId()).get(0).getOrganizationId();
				 JSONObject notaJson = JSONFactoryUtil.createJSONObject();
				 notaJson.put("notagastoId", nota.getNotagastoId());
				 notaJson.put("companyId", nota.getCompanyId());
				 notaJson.put("userId", nota.getUserId());
				 notaJson.put("organizationId", organizationId);
				 notaJson.put("description", nota.getDescription());
				 notaJson.put("startDate", nota.getStartDate());
				 notaJson.put("endDate", nota.getEndDate());
				 notaJson.put("comments", nota.getComments());
				 notaJson.put("status", nota.getStatus());
				 notaJson.put("amount", nota.getAmount());
				 notaJson.put("createDate", nota.getCreateDate());
				 notaJson.put("updateDate", nota.getUpdateDate());
				 notasJson.put(notaJson);
			 }
		} catch(Exception e) { }
		
		return notasJson;
	} 
	
	public JSONObject addNotaGasto(long companyId, long userId, String dataIni, String localeT) {
		JSONObject data = JSONFactoryUtil.createJSONObject();
		JSONObject responseJson = JSONFactoryUtil.createJSONObject();
		Locale locale;
		try {
			locale = LocaleUtil.fromLanguageId(localeT);
		} catch(Exception e) {
			locale = LocaleUtil.getDefault();
		}
		try {
			data = JSONFactoryUtil.createJSONObject(dataIni);
		} catch(Exception e) {
			responseJson.put("message", LanguageUtil.get(locale, "notaGasto-add-error"));
			responseJson.put("code", 1);			
		}
		long organizationId = Long.parseLong(data.getString("organizationId"));
		long notagastoId = 0;
		long orgSageCompanyId = 0;
		if (data.length() > 0) {
			try {
				notagastoId = CounterLocalServiceUtil.increment(NotaGasto.class.getName()); 
				NotaGasto nota = NotaGastoLocalServiceUtil.createNotaGasto(notagastoId);
				nota.setCompanyId(companyId);
				nota.setUserId(userId);
				nota.setCreateDate(data.getString("createDate"));
				nota.setDescription(data.getString("description"));
				nota.setStartDate(data.getString("startDate"));
				nota.setEndDate(data.getString("endDate"));			
				nota.setComments(data.getString("comments"));
				nota.setStatus("1");
				nota = NotaGastoLocalServiceUtil.addNotaGasto(nota);
				notagastoId = nota.getNotagastoId();
				if (notagastoId > 0) {			
					// Si existen Lineas las damos de Alta también
					JSONArray lineasJson = JSONFactoryUtil.createJSONArray(data.getString("lineas"));
					for (int i=0; i<lineasJson.length(); i++) {
						JSONObject lineaJson = lineasJson.getJSONObject(i);
						long lineagastoId = CounterLocalServiceUtil.increment(LineaGasto.class.getName());
						LineaGasto linea = LineaGastoLocalServiceUtil.createLineaGasto(lineagastoId);
						linea.setDate(lineaJson.getString("date"));
						linea.setDate(lineaJson.getString("amount"));
						linea.setDate(lineaJson.getString("documentId"));
						linea.setDate(lineaJson.getString("comments"));
						linea.setDate(lineaJson.getString("status"));
						linea.setDate(lineaJson.getString("price"));				
						linea.setDate(lineaJson.getString("quantity"));
						linea = LineaGastoLocalServiceUtil.addLineaGasto(linea);
						lineagastoId = linea.getLineagastoId();
						// Recalculamos el Amount de la Nota de Gastos
						nota = NotaGastoLocalServiceUtil.getNotaGasto(notagastoId);
						Double amountIni = nota.getAmount().contentEquals("") ? 0.0 : Double.parseDouble(nota.getAmount()); 
						nota.setAmount(String.valueOf(amountIni+Double.parseDouble(lineaJson.getString("amount"))));
						nota = NotaGastoLocalServiceUtil.updateNotaGasto(nota);
						notagastoId = nota.getNotagastoId();
						// Vinculamos los Padres - Hijos				
						// Nota Gasto
						NotaGastoLocalServiceUtil.addLineaGastoNotaGasto(lineagastoId, notagastoId);
						// Familia
						long familiaId = 0;
						try { 
							Long.parseLong(lineaJson.getString("familiaId"));
						} catch(Exception e) { }
						if (familiaId > 0) LineaGastoLocalServiceUtil.addLineaGastoFamiliaLineaGasto(familiaId, lineagastoId);
						// Categoria
						long categoriaId = 0;
						try { 
							Long.parseLong(lineaJson.getString("categoriaId"));
						} catch(Exception e) { }
						if (categoriaId > 0) LineaGastoLocalServiceUtil.addLineaGastoCategoriaLineaGasto(categoriaId, lineagastoId);
						// Cliente
						long clienteId = 0;
						try { 
							Long.parseLong(lineaJson.getString("clienteId"));
						} catch(Exception e) { }
						if (clienteId > 0) LineaGastoLocalServiceUtil.addLineaGastoClienteLineaGasto(clienteId, lineagastoId);
						// Proyecto
						long proyectoId = 0;
						try { 
							Long.parseLong(lineaJson.getString("proyectoId"));
						} catch(Exception e) { }
						if (proyectoId > 0) LineaGastoLocalServiceUtil.addLineaGastoProyectoLineaGasto(proyectoId, lineagastoId);
						// Paymode
						long paymodeId = 0;
						try { 
							Long.parseLong(lineaJson.getString("paymodeId"));
						} catch(Exception e) { }
						if (paymodeId > 0) LineaGastoLocalServiceUtil.addLineaGastoPayModeLineaGasto(paymodeId, lineagastoId);	
						// Currency
						long currencyId = 0;
						try { 
							Long.parseLong(lineaJson.getString("currencyId"));
						} catch(Exception e) { }
						if (currencyId > 0) LineaGastoLocalServiceUtil.addCurrencyLineaGasto(currencyId, lineagastoId);
					}
				}
				if (notagastoId > 0 && organizationId > 0) {
					orgSageCompanyId = OrganizationSageCompanyLocalServiceUtil.findByOrganizationId(organizationId).get(0).getOrgsagecompanyId();				
				}
				if (notagastoId > 0 && orgSageCompanyId > 0) {
					OrganizationSageCompanyLocalServiceUtil.addNotaGastoOrganizationSageCompany(notagastoId, orgSageCompanyId);
					responseJson.put("message", LanguageUtil.get(locale, "notaGasto-add-success"));
					responseJson.put("code", 0);			
				}			
			} catch(Exception e) {
				responseJson.put("message", LanguageUtil.get(locale, "notaGasto-add-error"));
				responseJson.put("code", 1);			
			}
		}
		
		return responseJson;
	}
	
	public JSONObject editNotaGasto(long notagastoId, JSONObject data, String localeT) {
		JSONObject responseJson = JSONFactoryUtil.createJSONObject();
		Locale locale;
		long orgSageCompanyId = 0;
		long organizationId = 0;
		try {
			locale = LocaleUtil.fromLanguageId(localeT);
		} catch(Exception e) {
			locale = LocaleUtil.getDefault();
		}
		if (notagastoId > 0) {
			try {			
				organizationId = Long.parseLong(data.getString("organizationId"));
				NotaGasto nota = NotaGastoLocalServiceUtil.getNotaGasto(notagastoId);
				nota.setCreateDate(data.getString("createDate"));
				nota.setDescription(data.getString("description"));
				nota.setStartDate(data.getString("startDate"));
				nota.setEndDate(data.getString("endDate"));				
				nota.setComments(data.getString("comments"));				
				nota.setUpdateDate(data.getString("updateDate"));
				NotaGastoLocalServiceUtil.updateNotaGasto(nota);
			} catch(Exception e) {
				responseJson.put("message", LanguageUtil.get(locale, "notaGasto-edit-error"));
				responseJson.put("code", 1);
			}
		} else {
			responseJson.put("message", LanguageUtil.get(locale, "notaGasto-edit-error"));
			responseJson.put("code", 1);
		}
		if (organizationId > 0) { 
			// Limpiamos y asignamos Organizaciones				
			try {
				orgSageCompanyId = OrganizationSageCompanyLocalServiceUtil.findByOrganizationId(organizationId).get(0).getOrgsagecompanyId();				
			} catch(Exception e) { 
				responseJson.put("message", LanguageUtil.get(locale, "notaGasto-edit-error"));
				responseJson.put("code", 1);
			}				
		}
		else {
			responseJson.put("message", LanguageUtil.get(locale, "notaGasto-edit-error"));
			responseJson.put("code", 1);
		}
		if (notagastoId > 0 && orgSageCompanyId > 0) {
			try {
				// Limpiamos primero
				OrganizationSageCompanyLocalServiceUtil.clearNotaGastoOrganizationSageCompanies(notagastoId);
				OrganizationSageCompanyLocalServiceUtil.addNotaGastoOrganizationSageCompany(notagastoId, orgSageCompanyId);
				responseJson.put("message", LanguageUtil.get(locale, "notaGasto-edit-success"));
				responseJson.put("code", 0);				
			} catch(Exception e) { 
				responseJson.put("message", LanguageUtil.get(locale, "notaGasto-edit-error"));
				responseJson.put("code", 1);
			}
		} else {
			responseJson.put("message", LanguageUtil.get(locale, "notaGasto-edit-error"));
			responseJson.put("code", 1);
		}	
		
		return responseJson;		
	}
	
	public JSONObject deleteNotaGasto(long notagastoId, String localeT) {
		JSONObject responseJson = JSONFactoryUtil.createJSONObject();
		Locale locale;
		try {
			locale = LocaleUtil.fromLanguageId(localeT);
		} catch(Exception e) {
			locale = LocaleUtil.getDefault();
		}
		if (notagastoId > 0) {
			try {
				// Borramos todos los Documentos asociados a las Lineas de la Nota
				List<LineaGasto> lineas = LineaGastoLocalServiceUtil.getNotaGastoLineaGastos(notagastoId);
				for (LineaGasto linea : lineas) {
					long documentId = Long.parseLong(linea.getDocumentId());
					DLFileEntryLocalServiceUtil.deleteDLFileEntry(documentId);
				}
				// Limpiamos las tablas hijas relacionadas
				LineaGastoLocalServiceUtil.clearNotaGastoLineaGastos(notagastoId);				
				NotaGastoLocalServiceUtil.deleteNotaGasto(notagastoId);
				
				responseJson.put("message", LanguageUtil.get(locale, "notaGasto-delete-success"));
				responseJson.put("code", 0);				
			} catch(Exception e) {
				responseJson.put("message", LanguageUtil.get(locale, "notaGasto-delete-error"));
				responseJson.put("code", 1);
			}
		} else {
			responseJson.put("message", LanguageUtil.get(locale, "notaGasto-delete-error"));
			responseJson.put("code", 1);
		}
		
		return responseJson;		
	}
	
	public JSONObject sendValidateNotaGasto(long notagastoId, String localeT) {
		JSONObject responseJson = JSONFactoryUtil.createJSONObject();
		Locale locale;
		try {
			locale = LocaleUtil.fromLanguageId(localeT);
		} catch(Exception e) {
			locale = LocaleUtil.getDefault();
		}
		if (notagastoId > 0) {
			try {
				NotaGasto nota = NotaGastoLocalServiceUtil.getNotaGasto(notagastoId);
				nota.setStatus("2");
				nota.setUpdateDate(dateFormat.format(new Date()));
				NotaGastoLocalServiceUtil.updateNotaGasto(nota);
				
				responseJson.put("message", LanguageUtil.get(locale, "notaGasto-sendValidate-success"));
				responseJson.put("code", 0);				
			} catch(Exception e) { 
				responseJson.put("message", LanguageUtil.get(locale, "notaGasto-sendValidate-error"));
				responseJson.put("code", 1);
			}
		} else {
			responseJson.put("message", LanguageUtil.get(locale, "notaGasto-sendValidate-error"));
			responseJson.put("code", 1);
		}
		
		return responseJson;
	}
	
	
	public JSONObject denyNotaGasto(long notagastoId, String localeT) {
		JSONObject responseJson = JSONFactoryUtil.createJSONObject();
		Locale locale;
		try {
			locale = LocaleUtil.fromLanguageId(localeT);
		} catch(Exception e) {
			locale = LocaleUtil.getDefault();
		}
		if (notagastoId > 0) {
			try {
				NotaGasto nota = NotaGastoLocalServiceUtil.getNotaGasto(notagastoId);
				nota.setStatus("3");
				nota.setUpdateDate(dateFormat.format(new Date()));
				NotaGastoLocalServiceUtil.updateNotaGasto(nota);
				
				responseJson.put("message", LanguageUtil.get(locale, "notaGasto-deny-success"));
				responseJson.put("code", 0);				
			} catch(Exception e) { 
				responseJson.put("message", LanguageUtil.get(locale, "notaGasto-deny-error"));
				responseJson.put("code", 1);
			}
		} else {
			responseJson.put("message", LanguageUtil.get(locale, "notaGasto-deny-error"));
			responseJson.put("code", 1);
		}
		
		return responseJson;
	}
	
	public JSONObject validateNotaGasto(long companyId, long userId, long notagastoId, String localeT) {
		JSONObject responseJson = JSONFactoryUtil.createJSONObject();
		Locale locale;
		try {
			locale = LocaleUtil.fromLanguageId(localeT);
		} catch(Exception e) {
			locale = LocaleUtil.getDefault();
		}
		String result = "";
		if (notagastoId > 0) {
			try {			
				long configId = ConnectionConfigsLocalServiceUtil.findByCompanyId(companyId).get(0).getConfigId();
				result = NotaGastoLocalServiceUtil.validateNotaGasto(notagastoId, configId, userId, locale);
				
				responseJson.put("message", LanguageUtil.get(locale, "notaGasto-validate-success"));
				responseJson.put("code", 0);				
			} catch(Exception e) { 
				responseJson.put("message", LanguageUtil.get(locale, "notaGasto-validate-error"));
				responseJson.put("code", 1);
			}
		} else {
			responseJson.put("message", LanguageUtil.get(locale, "notaGasto-validate-error"));
			responseJson.put("code", 1);
		}
		
		return responseJson;
	}
	
}