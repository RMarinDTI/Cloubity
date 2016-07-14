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

package es.davinciti.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ConnectionConfigsService}.
 *
 * @author Cmes
 * @see ConnectionConfigsService
 * @generated
 */
public class ConnectionConfigsServiceWrapper implements ConnectionConfigsService,
	ServiceWrapper<ConnectionConfigsService> {
	public ConnectionConfigsServiceWrapper(
		ConnectionConfigsService connectionConfigsService) {
		_connectionConfigsService = connectionConfigsService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _connectionConfigsService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_connectionConfigsService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _connectionConfigsService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionTypes> getConnectionTypes(
		long connectionConfigsId) {
		return _connectionConfigsService.getConnectionTypes(connectionConfigsId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ConnectionConfigsService getWrappedConnectionConfigsService() {
		return _connectionConfigsService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedConnectionConfigsService(
		ConnectionConfigsService connectionConfigsService) {
		_connectionConfigsService = connectionConfigsService;
	}

	@Override
	public ConnectionConfigsService getWrappedService() {
		return _connectionConfigsService;
	}

	@Override
	public void setWrappedService(
		ConnectionConfigsService connectionConfigsService) {
		_connectionConfigsService = connectionConfigsService;
	}

	private ConnectionConfigsService _connectionConfigsService;
}