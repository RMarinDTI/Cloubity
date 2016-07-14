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

import es.davinciti.liferay.model.LineaGastoProyecto;
import es.davinciti.liferay.service.LineaGastoProyectoLocalServiceUtil;
import es.davinciti.liferay.service.base.LineaGastoProyectoServiceBaseImpl;

/**
 * The implementation of the linea gasto proyecto remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.LineaGastoProyectoService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.LineaGastoProyectoServiceBaseImpl
 * @see es.davinciti.liferay.service.LineaGastoProyectoServiceUtil
 */
public class LineaGastoProyectoServiceImpl
	extends LineaGastoProyectoServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.LineaGastoProyectoServiceUtil} to access the linea gasto proyecto remote service.
	 */
	
	/** Devuelve los Proyectos del Cliente */
	public List<LineaGastoProyecto> getProyectosCliente(long clienteId) { 
		List<LineaGastoProyecto> proyectos = new ArrayList<LineaGastoProyecto>();
		
		if (clienteId > 0) {
			try {
				proyectos = LineaGastoProyectoLocalServiceUtil.getLineaGastoClienteLineaGastoProyectos(clienteId);
			} catch(Exception e) { }
		}
		
		return proyectos;
	}
		
	/** Devuelve el Proyecto de la Linea de Gasto */
	public LineaGastoProyecto getProyectoLineaGasto(long lineagastoId) { 
		LineaGastoProyecto proyecto = null;		
		
		if (lineagastoId > 0) {
			try {
				long proyectoId = LineaGastoProyectoLocalServiceUtil.getLineaGastoLineaGastoProyectos(lineagastoId).get(0).getProyectoId();
				proyecto = LineaGastoProyectoLocalServiceUtil.getLineaGastoProyecto(proyectoId);
			} catch(Exception e) { }
		}
		
		return proyecto;
	}
}