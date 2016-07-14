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

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.model.GroupConstants;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil;

import es.davinciti.liferay.model.LineaGasto;
import es.davinciti.liferay.model.NotaGasto;
import es.davinciti.liferay.service.CurrencyLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoCategoriaLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoClienteLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoFamiliaLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoPayModeLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoProyectoLocalServiceUtil;
import es.davinciti.liferay.service.NotaGastoLocalServiceUtil;
import es.davinciti.liferay.service.base.LineaGastoServiceBaseImpl;

/**
 * The implementation of the linea gasto remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.LineaGastoService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.LineaGastoServiceBaseImpl
 * @see es.davinciti.liferay.service.LineaGastoServiceUtil
 */
public class LineaGastoServiceImpl extends LineaGastoServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.LineaGastoServiceUtil} to access the linea gasto remote service.
	 */
	
	public JSONArray getLineasNotaGasto(long notagastoId) {
		JSONArray lineasJson = JSONFactoryUtil.createJSONArray();
		List<LineaGasto> lineasNota = new ArrayList<LineaGasto>();		
		try {
			lineasNota = LineaGastoLocalServiceUtil.getNotaGastoLineaGastos(notagastoId);
			for (LineaGasto lineaNota : lineasNota) {
				JSONObject lineaJson = JSONFactoryUtil.createJSONObject();
				lineaJson.put("lineagastoId", lineaNota.getLineagastoId());
				lineaJson.put("familiaId", LineaGastoFamiliaLocalServiceUtil.getLineaGastoLineaGastoFamilias(lineaNota.getLineagastoId()).get(0).getFamiliaId());
				lineaJson.put("categoriaId", LineaGastoCategoriaLocalServiceUtil.getLineaGastoLineaGastoCategorias(lineaNota.getLineagastoId()).get(0).getCategoriaId());
				lineaJson.put("clienteId", LineaGastoClienteLocalServiceUtil.getLineaGastoLineaGastoClientes(lineaNota.getLineagastoId()).get(0).getClienteId());
				lineaJson.put("proyectoId", LineaGastoProyectoLocalServiceUtil.getLineaGastoLineaGastoProyectos(lineaNota.getLineagastoId()).get(0).getProyectoId());
				lineaJson.put("paymodeId", LineaGastoPayModeLocalServiceUtil.getLineaGastoLineaGastoPayModes(lineaNota.getLineagastoId()).get(0).getPaymodeId());
				lineaJson.put("date", lineaNota.getDate());
				lineaJson.put("amount", lineaNota.getAmount());
				lineaJson.put("currencyId", CurrencyLocalServiceUtil.getLineaGastoCurrencies(lineaNota.getLineagastoId()).get(0).getCurrencyId());
				lineaJson.put("documentId", lineaNota.getDocumentId());
				lineaJson.put("comments", lineaNota.getComments());
				lineaJson.put("status", lineaNota.getStatus());
				lineaJson.put("price", lineaNota.getPrice());
				lineaJson.put("quantity", lineaNota.getQuantity());
				lineasJson.put(lineaJson);
			}
		} catch(Exception e) { }		
		
		return lineasJson;
	}	
	
	public JSONObject addLineaGasto(long notagastoId, JSONObject data, String localeT) {
		JSONObject responseJson = JSONFactoryUtil.createJSONObject();
		Locale locale;
		try {
			locale = LocaleUtil.fromLanguageId(localeT);
		} catch(Exception e) {
			locale = LocaleUtil.getDefault();
		}
		if (notagastoId > 0 && data.length() > 0) {
			try {
				long lineagastoId = CounterLocalServiceUtil.increment(LineaGasto.class.getName());
				LineaGasto linea = LineaGastoLocalServiceUtil.createLineaGasto(lineagastoId);
				linea.setDate(data.getString("date"));
				linea.setDate(data.getString("amount"));
				linea.setDate(data.getString("documentId"));
				linea.setDate(data.getString("comments"));
				linea.setDate(data.getString("status"));
				linea.setDate(data.getString("price"));				
				linea.setDate(data.getString("quantity"));
				linea = LineaGastoLocalServiceUtil.addLineaGasto(linea);
				lineagastoId = linea.getLineagastoId();
				// Recalculamos el Amount de la Nota de Gastos
				NotaGasto nota = NotaGastoLocalServiceUtil.getNotaGasto(notagastoId);
				Double amountIni = nota.getAmount().contentEquals("") ? 0.0 : Double.parseDouble(nota.getAmount()); 
				nota.setAmount(String.valueOf(amountIni+Double.parseDouble(data.getString("amount"))));
				nota = NotaGastoLocalServiceUtil.updateNotaGasto(nota);
				notagastoId = nota.getNotagastoId();
				// Vinculamos los Padres - Hijos				
				// Nota Gasto
				NotaGastoLocalServiceUtil.addLineaGastoNotaGasto(lineagastoId, notagastoId);
				// Familia
				long familiaId = 0;
				try { 
					Long.parseLong(data.getString("familiaId"));
				} catch(Exception e) { }
				if (familiaId > 0) LineaGastoLocalServiceUtil.addLineaGastoFamiliaLineaGasto(familiaId, lineagastoId);
				// Categoria
				long categoriaId = 0;
				try { 
					Long.parseLong(data.getString("categoriaId"));
				} catch(Exception e) { }
				if (categoriaId > 0) LineaGastoLocalServiceUtil.addLineaGastoCategoriaLineaGasto(categoriaId, lineagastoId);
				// Cliente
				long clienteId = 0;
				try { 
					Long.parseLong(data.getString("clienteId"));
				} catch(Exception e) { }
				if (clienteId > 0) LineaGastoLocalServiceUtil.addLineaGastoClienteLineaGasto(clienteId, lineagastoId);
				// Proyecto
				long proyectoId = 0;
				try { 
					Long.parseLong(data.getString("proyectoId"));
				} catch(Exception e) { }
				if (proyectoId > 0) LineaGastoLocalServiceUtil.addLineaGastoProyectoLineaGasto(proyectoId, lineagastoId);
				// Paymode
				long paymodeId = 0;
				try { 
					Long.parseLong(data.getString("paymodeId"));
				} catch(Exception e) { }
				if (paymodeId > 0) LineaGastoLocalServiceUtil.addLineaGastoPayModeLineaGasto(paymodeId, lineagastoId);	
				// Currency
				long currencyId = 0;
				try { 
					Long.parseLong(data.getString("currencyId"));
				} catch(Exception e) { }
				if (currencyId > 0) LineaGastoLocalServiceUtil.addCurrencyLineaGasto(currencyId, lineagastoId);
				
				responseJson.put("message", LanguageUtil.get(locale, "lineaGasto-add-success"));
				responseJson.put("code", 0);				
			} catch(Exception e) {
				responseJson.put("message", LanguageUtil.get(locale, "lineaGasto-add-error"));
				responseJson.put("code", 1);
			}		
		} else {
			responseJson.put("message", LanguageUtil.get(locale, "lineaGasto-add-error"));
			responseJson.put("code", 1);
		}
		
		return responseJson;
	}
	
	public JSONObject editLineaGasto(long notagastoId, long lineagastoId, JSONObject data, String localeT) {
		JSONObject responseJson = JSONFactoryUtil.createJSONObject();
		Locale locale;
		try {
			locale = LocaleUtil.fromLanguageId(localeT);
		} catch(Exception e) {
			locale = LocaleUtil.getDefault();
		}
		if (lineagastoId > 0 && data.length() > 0) {
			try {
				LineaGasto linea = LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId);
				Double amountIni = linea.getAmount().contentEquals("") ? 0.0 : Double.parseDouble(linea.getAmount());
				linea.setDate(data.getString("date"));
				linea.setDate(data.getString("amount"));
				linea.setDate(data.getString("documentId"));
				linea.setDate(data.getString("comments"));
				linea.setDate(data.getString("status"));
				linea.setDate(data.getString("price"));				
				linea.setDate(data.getString("quantity"));
				LineaGastoLocalServiceUtil.updateLineaGasto(linea);
				// Recalculamos el Amount de la Nota de Gastos
				NotaGasto nota = NotaGastoLocalServiceUtil.getNotaGasto(notagastoId);
				nota.setAmount(String.valueOf((Double.parseDouble(nota.getAmount())-amountIni)+Double.parseDouble(data.getString("amount"))));
				nota = NotaGastoLocalServiceUtil.updateNotaGasto(nota);
				notagastoId = nota.getNotagastoId();
				// Limpiamos las tablas hijas relacionadas
				NotaGastoLocalServiceUtil.clearLineaGastoNotaGastos(lineagastoId);
				LineaGastoFamiliaLocalServiceUtil.clearLineaGastoLineaGastoFamilias(lineagastoId);
				LineaGastoCategoriaLocalServiceUtil.clearLineaGastoLineaGastoCategorias(lineagastoId);
				LineaGastoClienteLocalServiceUtil.clearLineaGastoLineaGastoClientes(lineagastoId);
				LineaGastoProyectoLocalServiceUtil.clearLineaGastoLineaGastoProyectos(lineagastoId);
				LineaGastoPayModeLocalServiceUtil.clearLineaGastoLineaGastoPayModes(lineagastoId);
				// Vinculamos los Padres - Hijos
				// Nota Gasto
				NotaGastoLocalServiceUtil.addLineaGastoNotaGasto(lineagastoId, notagastoId);
				// Familia
				long familiaId = 0;
				try { 
					Long.parseLong(data.getString("familiaId"));
				} catch(Exception e) { }
				if (familiaId > 0) LineaGastoLocalServiceUtil.addLineaGastoFamiliaLineaGasto(familiaId, lineagastoId);
				// Categoria
				long categoriaId = 0;
				try { 
					Long.parseLong(data.getString("categoriaId"));
				} catch(Exception e) { }
				if (categoriaId > 0) LineaGastoLocalServiceUtil.addLineaGastoCategoriaLineaGasto(categoriaId, lineagastoId);
				// Cliente
				long clienteId = 0;
				try { 
					Long.parseLong(data.getString("clienteId"));
				} catch(Exception e) { }
				if (clienteId > 0) LineaGastoLocalServiceUtil.addLineaGastoClienteLineaGasto(clienteId, lineagastoId);
				// Proyecto
				long proyectoId = 0;
				try { 
					Long.parseLong(data.getString("proyectoId"));
				} catch(Exception e) { }
				if (proyectoId > 0) LineaGastoLocalServiceUtil.addLineaGastoProyectoLineaGasto(proyectoId, lineagastoId);
				// Paymode
				long paymodeId = 0;
				try { 
					Long.parseLong(data.getString("paymodeId"));
				} catch(Exception e) { }
				if (paymodeId > 0) LineaGastoLocalServiceUtil.addLineaGastoPayModeLineaGasto(paymodeId, lineagastoId);	
				// Currency
				long currencyId = 0;
				try { 
					Long.parseLong(data.getString("currencyId"));
				} catch(Exception e) { }
				if (currencyId > 0) LineaGastoLocalServiceUtil.addCurrencyLineaGasto(currencyId, lineagastoId);
				
				responseJson.put("message", LanguageUtil.get(locale, "lineaGasto-edit-success"));
				responseJson.put("code", 0);
			} catch(Exception e) { 
				responseJson.put("message", LanguageUtil.get(locale, "lineaGasto-edit-error"));
				responseJson.put("code", 1);
			}
		}
		else {
			responseJson.put("message", LanguageUtil.get(locale, "lineaGasto-edit-error"));
			responseJson.put("code", 1);
		}
		return responseJson;
	}
	
	public JSONObject deleteLineaGasto(long lineagastoId, String localeT) {
		JSONObject responseJson = JSONFactoryUtil.createJSONObject();
	
		return responseJson;
	}
	
	public long setImageLineaGasto(long companyId, long userId, long documentId, byte[] image) { 
		long fileEntryId = 0;
		// Si el documentId > 0, borrarlo porque es edición 
		if (documentId > 0) {
			try {
				DLFileEntryLocalServiceUtil.deleteDLFileEntry(documentId);
			} catch(Exception e) { }
		}
		if (image.length > 0 && userId > 0) {
			File file = null;
			BufferedOutputStream bs = null;
			try {			
				long realUserId = userId;
				long scopeGroupId = GroupLocalServiceUtil.getGroup(companyId, GroupConstants.GUEST).getGroupId();				
				ServiceContext serviceContext = new ServiceContext();
				serviceContext.setScopeGroupId(scopeGroupId);			
				String folderName = "Expenses Notes";
				String description = "Folder for files";
				String filename = "Expense_Note_"+new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
				file = new File(filename);
				FileOutputStream fs = new FileOutputStream(file);
				bs = new BufferedOutputStream(fs);
				bs.write(image);
				bs.close();
				DLFolder folder = DLFolderLocalServiceUtil.addFolder(realUserId, scopeGroupId, scopeGroupId, false, 0, folderName, description, false, serviceContext);
				FileEntry fileEntry = DLAppLocalServiceUtil.addFileEntry(realUserId, scopeGroupId, folder.getFolderId(), file.getName(), MimeTypesUtil.getContentType(file), filename, "", "changeLog", file, serviceContext);
				fileEntryId = fileEntry.getFileEntryId();
				
			} catch(Exception e) { }
		}
		
		return fileEntryId;		
	}	
	
}