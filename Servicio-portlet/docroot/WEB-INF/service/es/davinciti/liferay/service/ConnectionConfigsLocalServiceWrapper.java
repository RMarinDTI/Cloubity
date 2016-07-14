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
 * Provides a wrapper for {@link ConnectionConfigsLocalService}.
 *
 * @author Cmes
 * @see ConnectionConfigsLocalService
 * @generated
 */
public class ConnectionConfigsLocalServiceWrapper
	implements ConnectionConfigsLocalService,
		ServiceWrapper<ConnectionConfigsLocalService> {
	public ConnectionConfigsLocalServiceWrapper(
		ConnectionConfigsLocalService connectionConfigsLocalService) {
		_connectionConfigsLocalService = connectionConfigsLocalService;
	}

	/**
	* Adds the connection configs to the database. Also notifies the appropriate model listeners.
	*
	* @param connectionConfigs the connection configs
	* @return the connection configs that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionConfigs addConnectionConfigs(
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.addConnectionConfigs(connectionConfigs);
	}

	/**
	* Creates a new connection configs with the primary key. Does not add the connection configs to the database.
	*
	* @param configId the primary key for the new connection configs
	* @return the new connection configs
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionConfigs createConnectionConfigs(
		long configId) {
		return _connectionConfigsLocalService.createConnectionConfigs(configId);
	}

	/**
	* Deletes the connection configs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param configId the primary key of the connection configs
	* @return the connection configs that was removed
	* @throws PortalException if a connection configs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionConfigs deleteConnectionConfigs(
		long configId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.deleteConnectionConfigs(configId);
	}

	/**
	* Deletes the connection configs from the database. Also notifies the appropriate model listeners.
	*
	* @param connectionConfigs the connection configs
	* @return the connection configs that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionConfigs deleteConnectionConfigs(
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.deleteConnectionConfigs(connectionConfigs);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _connectionConfigsLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionConfigsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionConfigsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.davinciti.liferay.model.ConnectionConfigs fetchConnectionConfigs(
		long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.fetchConnectionConfigs(configId);
	}

	/**
	* Returns the connection configs with the primary key.
	*
	* @param configId the primary key of the connection configs
	* @return the connection configs
	* @throws PortalException if a connection configs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionConfigs getConnectionConfigs(
		long configId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.getConnectionConfigs(configId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the connection configses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionConfigsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of connection configses
	* @param end the upper bound of the range of connection configses (not inclusive)
	* @return the range of connection configses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.getConnectionConfigses(start, end);
	}

	/**
	* Returns the number of connection configses.
	*
	* @return the number of connection configses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getConnectionConfigsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.getConnectionConfigsesCount();
	}

	/**
	* Updates the connection configs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param connectionConfigs the connection configs
	* @return the connection configs that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionConfigs updateConnectionConfigs(
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.updateConnectionConfigs(connectionConfigs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionTypesConnectionConfigs(long connectionTypeId,
		long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.addConnectionTypesConnectionConfigs(connectionTypeId,
			configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionTypesConnectionConfigs(long connectionTypeId,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.addConnectionTypesConnectionConfigs(connectionTypeId,
			connectionConfigs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionTypesConnectionConfigses(long connectionTypeId,
		long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.addConnectionTypesConnectionConfigses(connectionTypeId,
			configIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionTypesConnectionConfigses(long connectionTypeId,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> ConnectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.addConnectionTypesConnectionConfigses(connectionTypeId,
			ConnectionConfigses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearConnectionTypesConnectionConfigses(long connectionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.clearConnectionTypesConnectionConfigses(connectionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionTypesConnectionConfigs(long connectionTypeId,
		long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.deleteConnectionTypesConnectionConfigs(connectionTypeId,
			configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionTypesConnectionConfigs(long connectionTypeId,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.deleteConnectionTypesConnectionConfigs(connectionTypeId,
			connectionConfigs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionTypesConnectionConfigses(
		long connectionTypeId, long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.deleteConnectionTypesConnectionConfigses(connectionTypeId,
			configIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionTypesConnectionConfigses(
		long connectionTypeId,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> ConnectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.deleteConnectionTypesConnectionConfigses(connectionTypeId,
			ConnectionConfigses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionTypesConnectionConfigses(
		long connectionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.getConnectionTypesConnectionConfigses(connectionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionTypesConnectionConfigses(
		long connectionTypeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.getConnectionTypesConnectionConfigses(connectionTypeId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionTypesConnectionConfigses(
		long connectionTypeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.getConnectionTypesConnectionConfigses(connectionTypeId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getConnectionTypesConnectionConfigsesCount(long connectionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.getConnectionTypesConnectionConfigsesCount(connectionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasConnectionTypesConnectionConfigs(long connectionTypeId,
		long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.hasConnectionTypesConnectionConfigs(connectionTypeId,
			configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasConnectionTypesConnectionConfigses(long connectionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.hasConnectionTypesConnectionConfigses(connectionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setConnectionTypesConnectionConfigses(long connectionTypeId,
		long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.setConnectionTypesConnectionConfigses(connectionTypeId,
			configIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionActionTypesConnectionConfigs(
		long connectionActionTypeId, long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.addConnectionActionTypesConnectionConfigs(connectionActionTypeId,
			configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionActionTypesConnectionConfigs(
		long connectionActionTypeId,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.addConnectionActionTypesConnectionConfigs(connectionActionTypeId,
			connectionConfigs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId, long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.addConnectionActionTypesConnectionConfigses(connectionActionTypeId,
			configIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> ConnectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.addConnectionActionTypesConnectionConfigses(connectionActionTypeId,
			ConnectionConfigses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.clearConnectionActionTypesConnectionConfigses(connectionActionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionActionTypesConnectionConfigs(
		long connectionActionTypeId, long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.deleteConnectionActionTypesConnectionConfigs(connectionActionTypeId,
			configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionActionTypesConnectionConfigs(
		long connectionActionTypeId,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.deleteConnectionActionTypesConnectionConfigs(connectionActionTypeId,
			connectionConfigs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId, long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.deleteConnectionActionTypesConnectionConfigses(connectionActionTypeId,
			configIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> ConnectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.deleteConnectionActionTypesConnectionConfigses(connectionActionTypeId,
			ConnectionConfigses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.getConnectionActionTypesConnectionConfigses(connectionActionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.getConnectionActionTypesConnectionConfigses(connectionActionTypeId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.getConnectionActionTypesConnectionConfigses(connectionActionTypeId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getConnectionActionTypesConnectionConfigsesCount(
		long connectionActionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.getConnectionActionTypesConnectionConfigsesCount(connectionActionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasConnectionActionTypesConnectionConfigs(
		long connectionActionTypeId, long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.hasConnectionActionTypesConnectionConfigs(connectionActionTypeId,
			configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.hasConnectionActionTypesConnectionConfigses(connectionActionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId, long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.setConnectionActionTypesConnectionConfigses(connectionActionTypeId,
			configIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionDataConnectionConfigs(long connectionDataId,
		long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.addConnectionDataConnectionConfigs(connectionDataId,
			configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionDataConnectionConfigs(long connectionDataId,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.addConnectionDataConnectionConfigs(connectionDataId,
			connectionConfigs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionDataConnectionConfigses(long connectionDataId,
		long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.addConnectionDataConnectionConfigses(connectionDataId,
			configIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionDataConnectionConfigses(long connectionDataId,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> ConnectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.addConnectionDataConnectionConfigses(connectionDataId,
			ConnectionConfigses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearConnectionDataConnectionConfigses(long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.clearConnectionDataConnectionConfigses(connectionDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionDataConnectionConfigs(long connectionDataId,
		long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.deleteConnectionDataConnectionConfigs(connectionDataId,
			configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionDataConnectionConfigs(long connectionDataId,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.deleteConnectionDataConnectionConfigs(connectionDataId,
			connectionConfigs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionDataConnectionConfigses(long connectionDataId,
		long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.deleteConnectionDataConnectionConfigses(connectionDataId,
			configIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionDataConnectionConfigses(long connectionDataId,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> ConnectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.deleteConnectionDataConnectionConfigses(connectionDataId,
			ConnectionConfigses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionDataConnectionConfigses(
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.getConnectionDataConnectionConfigses(connectionDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionDataConnectionConfigses(
		long connectionDataId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.getConnectionDataConnectionConfigses(connectionDataId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionDataConnectionConfigses(
		long connectionDataId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.getConnectionDataConnectionConfigses(connectionDataId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getConnectionDataConnectionConfigsesCount(long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.getConnectionDataConnectionConfigsesCount(connectionDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasConnectionDataConnectionConfigs(long connectionDataId,
		long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.hasConnectionDataConnectionConfigs(connectionDataId,
			configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasConnectionDataConnectionConfigses(long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionConfigsLocalService.hasConnectionDataConnectionConfigses(connectionDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setConnectionDataConnectionConfigses(long connectionDataId,
		long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionConfigsLocalService.setConnectionDataConnectionConfigses(connectionDataId,
			configIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _connectionConfigsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_connectionConfigsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _connectionConfigsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionTypes> getConnectionTypes(
		long connectionConfigsId) {
		return _connectionConfigsLocalService.getConnectionTypes(connectionConfigsId);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionActionTypes> getConnectionActionTypes(
		long connectionConfigsId) {
		return _connectionConfigsLocalService.getConnectionActionTypes(connectionConfigsId);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionData> getConnectionData(
		long connectionConfigsId) {
		return _connectionConfigsLocalService.getConnectionData(connectionConfigsId);
	}

	@Override
	public void deleteConnectionTypes(long connectionConfigsId) {
		_connectionConfigsLocalService.deleteConnectionTypes(connectionConfigsId);
	}

	@Override
	public void deleteConnectionActionTypes(long connectionConfigsId) {
		_connectionConfigsLocalService.deleteConnectionActionTypes(connectionConfigsId);
	}

	@Override
	public void deleteConnectionData(long connectionConfigsId) {
		_connectionConfigsLocalService.deleteConnectionData(connectionConfigsId);
	}

	@Override
	public java.lang.String testConnectionErp(long configId)
		throws java.lang.Exception {
		return _connectionConfigsLocalService.testConnectionErp(configId);
	}

	@Override
	public java.lang.String getInfo(java.lang.String methodName, long configId,
		java.util.List<java.lang.String> headers) {
		return _connectionConfigsLocalService.getInfo(methodName, configId,
			headers);
	}

	@Override
	public java.lang.String getWebAccessToken(long configId,
		java.lang.String code) {
		return _connectionConfigsLocalService.getWebAccessToken(configId, code);
	}

	@Override
	public java.lang.String getApplicationCode(java.lang.String secretKey,
		java.lang.String applicationCode, java.lang.String server) {
		return _connectionConfigsLocalService.getApplicationCode(secretKey,
			applicationCode, server);
	}

	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> findByCompanyId(
		long companyId) {
		return _connectionConfigsLocalService.findByCompanyId(companyId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ConnectionConfigsLocalService getWrappedConnectionConfigsLocalService() {
		return _connectionConfigsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedConnectionConfigsLocalService(
		ConnectionConfigsLocalService connectionConfigsLocalService) {
		_connectionConfigsLocalService = connectionConfigsLocalService;
	}

	@Override
	public ConnectionConfigsLocalService getWrappedService() {
		return _connectionConfigsLocalService;
	}

	@Override
	public void setWrappedService(
		ConnectionConfigsLocalService connectionConfigsLocalService) {
		_connectionConfigsLocalService = connectionConfigsLocalService;
	}

	private ConnectionConfigsLocalService _connectionConfigsLocalService;
}