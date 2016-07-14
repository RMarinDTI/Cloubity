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

import es.davinciti.liferay.model.ConnectionTypes;
import es.davinciti.liferay.service.base.ConnectionConfigsServiceBaseImpl;
import es.davinciti.liferay.service.persistence.ConnectionConfigsUtil;

/**
 * The implementation of the connection configs remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.davinciti.liferay.service.ConnectionConfigsService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Cmes
 * @see es.davinciti.liferay.service.base.ConnectionConfigsServiceBaseImpl
 * @see es.davinciti.liferay.service.ConnectionConfigsServiceUtil
 */
public class ConnectionConfigsServiceImpl
	extends ConnectionConfigsServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link es.davinciti.liferay.service.ConnectionConfigsServiceUtil} to access the connection configs remote service.
	 */
	
	public List<ConnectionTypes> getConnectionTypes(long connectionConfigsId) {
		
		List<ConnectionTypes> connectionTypesList = new ArrayList<ConnectionTypes>();
		
		try {
			connectionTypesList = ConnectionConfigsUtil.getConnectionTypeses(connectionConfigsId);
			
		} catch(Exception e) {
			
		}
			
		return connectionTypesList;
	}

}