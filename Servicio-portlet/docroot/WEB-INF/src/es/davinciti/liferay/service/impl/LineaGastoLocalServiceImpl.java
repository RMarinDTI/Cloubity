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

import es.davinciti.liferay.model.LineaGasto;
import es.davinciti.liferay.service.LineaGastoCategoriaLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoLocalServiceUtil;
import es.davinciti.liferay.service.base.LineaGastoLocalServiceBaseImpl;
import es.davinciti.liferay.service.persistence.LineaGastoUtil;

/**
 * The implementation of the linea gasto local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.LineaGastoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.LineaGastoLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.LineaGastoLocalServiceUtil
 */
public class LineaGastoLocalServiceImpl extends LineaGastoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.LineaGastoLocalServiceUtil} to access the linea gasto local service.
	 */
	
	public List<LineaGasto> findByDate(String date) { 
		List<LineaGasto> lineas = new ArrayList<LineaGasto>();
		
		if (!date.contentEquals("")) {
			try {
				lineas = LineaGastoUtil.findByDate(date);
			} catch(Exception e) { }
		}
		
		return lineas;
	}
	
	
	public List<LineaGasto> findByNotaGastoCategoryDate(long notagastoId, long lineagastoId) {
		//System.out.println("findByNotaGastoCategoryDate - notagastoId : "+notagastoId+" - lineagastoId : "+lineagastoId+" running ...");
		List<LineaGasto> lineas = new ArrayList<LineaGasto>();
		
		if (notagastoId > 0 && lineagastoId > 0) {
			try {
				List<Long> lineasIds = new ArrayList<Long>();
				List<LineaGasto> lineasNota = LineaGastoLocalServiceUtil.getNotaGastoLineaGastos(notagastoId);
				LineaGasto linia = LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId);								
				long categoriaId = LineaGastoCategoriaLocalServiceUtil.getLineaGastoLineaGastoCategorias(lineagastoId).get(0).getCategoriaId();				
				List<LineaGasto> lineasCategoria = LineaGastoLocalServiceUtil.getLineaGastoCategoriaLineaGastos(categoriaId);
				List<LineaGasto> lineasDate = LineaGastoLocalServiceUtil.findByDate(linia.getDate());				
				for (LineaGasto linea : lineasNota) {
					// Saltamos la que estamos tratando					
					if (linea.getLineagastoId() == lineagastoId) continue;					
					// Saltamos las que hemos hecho matching					
					if (lineasIds.contains(linea.getLineagastoId())) continue;
					// Si existen más Lineas de la Misma Categoría y Fecha
					if (lineasCategoria.size() > 0 && lineasDate.size() > 0) {
						for (LineaGasto lineaCategoria : lineasCategoria) {
							// Miramos los 'matchings' de las listas (Categoria y Date)							
							if (lineasDate.contains(lineaCategoria)) {
								// Miramos el 'matching' con la lista de Lineas de la Nota								
								if (lineasNota.contains(lineaCategoria)) {
									// Finalmente guardamos los Ids ligados a la Linea que cumplen los criterios (misma Categoría y Fecha)
									if (!lineasIds.contains(lineaCategoria.getLineagastoId()) && lineaCategoria.getLineagastoId()!=lineagastoId) lineasIds.add(lineaCategoria.getLineagastoId());
								}
							}
						}
					}					
				}
				// Informamos de los 'matchings'				
				if (lineasIds.size() > 0) {
					for (long lineaId : lineasIds) {						
						LineaGasto lineaG = LineaGastoLocalServiceUtil.getLineaGasto(lineaId);
						lineas.add(lineaG);
					}
				}
			
			} catch(Exception e) { }
		}
		
		return lineas;
	}
}