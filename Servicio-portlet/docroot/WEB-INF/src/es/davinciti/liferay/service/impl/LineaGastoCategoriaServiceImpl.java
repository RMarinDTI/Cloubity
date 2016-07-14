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

import es.davinciti.liferay.model.LineaGastoCategoria;
import es.davinciti.liferay.service.LineaGastoCategoriaLocalServiceUtil;
import es.davinciti.liferay.service.base.LineaGastoCategoriaServiceBaseImpl;

/**
 * The implementation of the linea gasto categoria remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.LineaGastoCategoriaService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.LineaGastoCategoriaServiceBaseImpl
 * @see es.davinciti.liferay.service.LineaGastoCategoriaServiceUtil
 */
public class LineaGastoCategoriaServiceImpl
	extends LineaGastoCategoriaServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.LineaGastoCategoriaServiceUtil} to access the linea gasto categoria remote service.
	 */
	
	/** Devuelve las Categorias de la Familia **/
	public List<LineaGastoCategoria> getCategoriasFamilia(long familiaId) { 
		List<LineaGastoCategoria> categorias = new ArrayList<LineaGastoCategoria>();
		
		if (familiaId > 0) {
			try {
				categorias = LineaGastoCategoriaLocalServiceUtil.getLineaGastoFamiliaLineaGastoCategorias(familiaId);
			} catch(Exception e) { }
		}
		
		return categorias;
	}
	
	/** Devuelve la Categoria de la Linea de Gasto **/
	public LineaGastoCategoria getCategoriaLineaGasto(long lineagastoId) { 
		LineaGastoCategoria categoria = null;
		
		if (lineagastoId > 0) {
			try {
				long categoriaId = LineaGastoCategoriaLocalServiceUtil.getLineaGastoLineaGastoCategorias(lineagastoId).get(0).getCategoriaId();
				categoria = LineaGastoCategoriaLocalServiceUtil.getLineaGastoCategoria(categoriaId);
			} catch(Exception e) { }
			
		}
		return categoria;
	}
	
}