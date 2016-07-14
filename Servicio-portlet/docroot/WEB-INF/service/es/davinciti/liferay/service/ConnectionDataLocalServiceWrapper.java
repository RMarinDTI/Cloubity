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
 * Provides a wrapper for {@link ConnectionDataLocalService}.
 *
 * @author Cmes
 * @see ConnectionDataLocalService
 * @generated
 */
public class ConnectionDataLocalServiceWrapper
	implements ConnectionDataLocalService,
		ServiceWrapper<ConnectionDataLocalService> {
	public ConnectionDataLocalServiceWrapper(
		ConnectionDataLocalService connectionDataLocalService) {
		_connectionDataLocalService = connectionDataLocalService;
	}

	/**
	* Adds the connection data to the database. Also notifies the appropriate model listeners.
	*
	* @param connectionData the connection data
	* @return the connection data that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionData addConnectionData(
		es.davinciti.liferay.model.ConnectionData connectionData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionDataLocalService.addConnectionData(connectionData);
	}

	/**
	* Creates a new connection data with the primary key. Does not add the connection data to the database.
	*
	* @param connectionDataId the primary key for the new connection data
	* @return the new connection data
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionData createConnectionData(
		long connectionDataId) {
		return _connectionDataLocalService.createConnectionData(connectionDataId);
	}

	/**
	* Deletes the connection data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param connectionDataId the primary key of the connection data
	* @return the connection data that was removed
	* @throws PortalException if a connection data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionData deleteConnectionData(
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectionDataLocalService.deleteConnectionData(connectionDataId);
	}

	/**
	* Deletes the connection data from the database. Also notifies the appropriate model listeners.
	*
	* @param connectionData the connection data
	* @return the connection data that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionData deleteConnectionData(
		es.davinciti.liferay.model.ConnectionData connectionData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionDataLocalService.deleteConnectionData(connectionData);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _connectionDataLocalService.dynamicQuery();
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
		return _connectionDataLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _connectionDataLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _connectionDataLocalService.dynamicQuery(dynamicQuery, start,
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
		return _connectionDataLocalService.dynamicQueryCount(dynamicQuery);
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
		return _connectionDataLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.davinciti.liferay.model.ConnectionData fetchConnectionData(
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionDataLocalService.fetchConnectionData(connectionDataId);
	}

	/**
	* Returns the connection data with the primary key.
	*
	* @param connectionDataId the primary key of the connection data
	* @return the connection data
	* @throws PortalException if a connection data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionData getConnectionData(
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectionDataLocalService.getConnectionData(connectionDataId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectionDataLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the connection datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of connection datas
	* @param end the upper bound of the range of connection datas (not inclusive)
	* @return the range of connection datas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionData> getConnectionDatas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionDataLocalService.getConnectionDatas(start, end);
	}

	/**
	* Returns the number of connection datas.
	*
	* @return the number of connection datas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getConnectionDatasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionDataLocalService.getConnectionDatasCount();
	}

	/**
	* Updates the connection data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param connectionData the connection data
	* @return the connection data that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionData updateConnectionData(
		es.davinciti.liferay.model.ConnectionData connectionData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionDataLocalService.updateConnectionData(connectionData);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionConfigsConnectionData(long configId,
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionDataLocalService.addConnectionConfigsConnectionData(configId,
			connectionDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionConfigsConnectionData(long configId,
		es.davinciti.liferay.model.ConnectionData connectionData)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionDataLocalService.addConnectionConfigsConnectionData(configId,
			connectionData);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionConfigsConnectionDatas(long configId,
		long[] connectionDataIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionDataLocalService.addConnectionConfigsConnectionDatas(configId,
			connectionDataIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionConfigsConnectionDatas(long configId,
		java.util.List<es.davinciti.liferay.model.ConnectionData> ConnectionDatas)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionDataLocalService.addConnectionConfigsConnectionDatas(configId,
			ConnectionDatas);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearConnectionConfigsConnectionDatas(long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionDataLocalService.clearConnectionConfigsConnectionDatas(configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionConfigsConnectionData(long configId,
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionDataLocalService.deleteConnectionConfigsConnectionData(configId,
			connectionDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionConfigsConnectionData(long configId,
		es.davinciti.liferay.model.ConnectionData connectionData)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionDataLocalService.deleteConnectionConfigsConnectionData(configId,
			connectionData);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionConfigsConnectionDatas(long configId,
		long[] connectionDataIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionDataLocalService.deleteConnectionConfigsConnectionDatas(configId,
			connectionDataIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionConfigsConnectionDatas(long configId,
		java.util.List<es.davinciti.liferay.model.ConnectionData> ConnectionDatas)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionDataLocalService.deleteConnectionConfigsConnectionDatas(configId,
			ConnectionDatas);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionData> getConnectionConfigsConnectionDatas(
		long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionDataLocalService.getConnectionConfigsConnectionDatas(configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionData> getConnectionConfigsConnectionDatas(
		long configId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionDataLocalService.getConnectionConfigsConnectionDatas(configId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionData> getConnectionConfigsConnectionDatas(
		long configId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionDataLocalService.getConnectionConfigsConnectionDatas(configId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getConnectionConfigsConnectionDatasCount(long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionDataLocalService.getConnectionConfigsConnectionDatasCount(configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasConnectionConfigsConnectionData(long configId,
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionDataLocalService.hasConnectionConfigsConnectionData(configId,
			connectionDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasConnectionConfigsConnectionDatas(long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionDataLocalService.hasConnectionConfigsConnectionDatas(configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setConnectionConfigsConnectionDatas(long configId,
		long[] connectionDataIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionDataLocalService.setConnectionConfigsConnectionDatas(configId,
			connectionDataIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _connectionDataLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_connectionDataLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _connectionDataLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ConnectionDataLocalService getWrappedConnectionDataLocalService() {
		return _connectionDataLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedConnectionDataLocalService(
		ConnectionDataLocalService connectionDataLocalService) {
		_connectionDataLocalService = connectionDataLocalService;
	}

	@Override
	public ConnectionDataLocalService getWrappedService() {
		return _connectionDataLocalService;
	}

	@Override
	public void setWrappedService(
		ConnectionDataLocalService connectionDataLocalService) {
		_connectionDataLocalService = connectionDataLocalService;
	}

	private ConnectionDataLocalService _connectionDataLocalService;
}