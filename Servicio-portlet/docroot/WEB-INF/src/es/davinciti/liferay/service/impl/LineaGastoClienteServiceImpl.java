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

import es.davinciti.liferay.model.LineaGastoCliente;
import es.davinciti.liferay.service.LineaGastoClienteLocalServiceUtil;
import es.davinciti.liferay.service.base.LineaGastoClienteServiceBaseImpl;

/**
 * The implementation of the linea gasto cliente remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.LineaGastoClienteService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.LineaGastoClienteServiceBaseImpl
 * @see es.davinciti.liferay.service.LineaGastoClienteServiceUtil
 */
public class LineaGastoClienteServiceImpl
	extends LineaGastoClienteServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.LineaGastoClienteServiceUtil} to access the linea gasto cliente remote service.
	 */
	
	/** Devuelve los Clientes de la Company */
	public List<LineaGastoCliente> getClientes(long companyId) { 
		List<LineaGastoCliente> clientes = new ArrayList<LineaGastoCliente>();
		
		if (companyId > 0) {
			try {
				clientes = LineaGastoClienteLocalServiceUtil.findByCompanyId(companyId);
			} catch(Exception e) {}
			
		}
		return clientes;
	}
		
	/** Devuelve el Cliente de la Linea de Gasto */
	public LineaGastoCliente getClienteLineaGasto(long lineagastoId) { 
		LineaGastoCliente cliente = null;		
		
		if (lineagastoId > 0) {
			try {
				long clienteId = LineaGastoClienteLocalServiceUtil.getLineaGastoLineaGastoClientes(lineagastoId).get(0).getClienteId(); 
				cliente = LineaGastoClienteLocalServiceUtil.getLineaGastoCliente(clienteId);
			} catch(Exception e) {}
			
		}
		
		return cliente;
	}
	
}