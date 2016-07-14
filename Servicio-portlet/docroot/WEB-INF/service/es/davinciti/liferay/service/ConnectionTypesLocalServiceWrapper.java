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
 * Provides a wrapper for {@link ConnectionTypesLocalService}.
 *
 * @author Cmes
 * @see ConnectionTypesLocalService
 * @generated
 */
public class ConnectionTypesLocalServiceWrapper
	implements ConnectionTypesLocalService,
		ServiceWrapper<ConnectionTypesLocalService> {
	public ConnectionTypesLocalServiceWrapper(
		ConnectionTypesLocalService connectionTypesLocalService) {
		_connectionTypesLocalService = connectionTypesLocalService;
	}

	/**
	* Adds the connection types to the database. Also notifies the appropriate model listeners.
	*
	* @param connectionTypes the connection types
	* @return the connection types that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionTypes addConnectionTypes(
		es.davinciti.liferay.model.ConnectionTypes connectionTypes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionTypesLocalService.addConnectionTypes(connectionTypes);
	}

	/**
	* Creates a new connection types with the primary key. Does not add the connection types to the database.
	*
	* @param connectionTypeId the primary key for the new connection types
	* @return the new connection types
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionTypes createConnectionTypes(
		long connectionTypeId) {
		return _connectionTypesLocalService.createConnectionTypes(connectionTypeId);
	}

	/**
	* Deletes the connection types with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param connectionTypeId the primary key of the connection types
	* @return the connection types that was removed
	* @throws PortalException if a connection types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionTypes deleteConnectionTypes(
		long connectionTypeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectionTypesLocalService.deleteConnectionTypes(connectionTypeId);
	}

	/**
	* Deletes the connection types from the database. Also notifies the appropriate model listeners.
	*
	* @param connectionTypes the connection types
	* @return the connection types that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionTypes deleteConnectionTypes(
		es.davinciti.liferay.model.ConnectionTypes connectionTypes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionTypesLocalService.deleteConnectionTypes(connectionTypes);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _connectionTypesLocalService.dynamicQuery();
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
		return _connectionTypesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _connectionTypesLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _connectionTypesLocalService.dynamicQuery(dynamicQuery, start,
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
		return _connectionTypesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _connectionTypesLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.davinciti.liferay.model.ConnectionTypes fetchConnectionTypes(
		long connectionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionTypesLocalService.fetchConnectionTypes(connectionTypeId);
	}

	/**
	* Returns the connection types with the primary key.
	*
	* @param connectionTypeId the primary key of the connection types
	* @return the connection types
	* @throws PortalException if a connection types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionTypes getConnectionTypes(
		long connectionTypeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectionTypesLocalService.getConnectionTypes(connectionTypeId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _connectionTypesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the connection typeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of connection typeses
	* @param end the upper bound of the range of connection typeses (not inclusive)
	* @return the range of connection typeses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionTypes> getConnectionTypeses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionTypesLocalService.getConnectionTypeses(start, end);
	}

	/**
	* Returns the number of connection typeses.
	*
	* @return the number of connection typeses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getConnectionTypesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionTypesLocalService.getConnectionTypesesCount();
	}

	/**
	* Updates the connection types in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param connectionTypes the connection types
	* @return the connection types that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.davinciti.liferay.model.ConnectionTypes updateConnectionTypes(
		es.davinciti.liferay.model.ConnectionTypes connectionTypes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionTypesLocalService.updateConnectionTypes(connectionTypes);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionConfigsConnectionTypes(long configId,
		long connectionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionTypesLocalService.addConnectionConfigsConnectionTypes(configId,
			connectionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionConfigsConnectionTypes(long configId,
		es.davinciti.liferay.model.ConnectionTypes connectionTypes)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionTypesLocalService.addConnectionConfigsConnectionTypes(configId,
			connectionTypes);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionConfigsConnectionTypeses(long configId,
		long[] connectionTypeIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionTypesLocalService.addConnectionConfigsConnectionTypeses(configId,
			connectionTypeIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addConnectionConfigsConnectionTypeses(long configId,
		java.util.List<es.davinciti.liferay.model.ConnectionTypes> ConnectionTypeses)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionTypesLocalService.addConnectionConfigsConnectionTypeses(configId,
			ConnectionTypeses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearConnectionConfigsConnectionTypeses(long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionTypesLocalService.clearConnectionConfigsConnectionTypeses(configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionConfigsConnectionTypes(long configId,
		long connectionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionTypesLocalService.deleteConnectionConfigsConnectionTypes(configId,
			connectionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionConfigsConnectionTypes(long configId,
		es.davinciti.liferay.model.ConnectionTypes connectionTypes)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionTypesLocalService.deleteConnectionConfigsConnectionTypes(configId,
			connectionTypes);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionConfigsConnectionTypeses(long configId,
		long[] connectionTypeIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionTypesLocalService.deleteConnectionConfigsConnectionTypeses(configId,
			connectionTypeIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteConnectionConfigsConnectionTypeses(long configId,
		java.util.List<es.davinciti.liferay.model.ConnectionTypes> ConnectionTypeses)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionTypesLocalService.deleteConnectionConfigsConnectionTypeses(configId,
			ConnectionTypeses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionTypes> getConnectionConfigsConnectionTypeses(
		long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionTypesLocalService.getConnectionConfigsConnectionTypeses(configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionTypes> getConnectionConfigsConnectionTypeses(
		long configId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionTypesLocalService.getConnectionConfigsConnectionTypeses(configId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.davinciti.liferay.model.ConnectionTypes> getConnectionConfigsConnectionTypeses(
		long configId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionTypesLocalService.getConnectionConfigsConnectionTypeses(configId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getConnectionConfigsConnectionTypesesCount(long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionTypesLocalService.getConnectionConfigsConnectionTypesesCount(configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasConnectionConfigsConnectionTypes(long configId,
		long connectionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionTypesLocalService.hasConnectionConfigsConnectionTypes(configId,
			connectionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasConnectionConfigsConnectionTypeses(long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _connectionTypesLocalService.hasConnectionConfigsConnectionTypeses(configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setConnectionConfigsConnectionTypeses(long configId,
		long[] connectionTypeIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_connectionTypesLocalService.setConnectionConfigsConnectionTypeses(configId,
			connectionTypeIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _connectionTypesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_connectionTypesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _connectionTypesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ConnectionTypesLocalService getWrappedConnectionTypesLocalService() {
		return _connectionTypesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedConnectionTypesLocalService(
		ConnectionTypesLocalService connectionTypesLocalService) {
		_connectionTypesLocalService = connectionTypesLocalService;
	}

	@Override
	public ConnectionTypesLocalService getWrappedService() {
		return _connectionTypesLocalService;
	}

	@Override
	public void setWrappedService(
		ConnectionTypesLocalService connectionTypesLocalService) {
		_connectionTypesLocalService = connectionTypesLocalService;
	}

	private ConnectionTypesLocalService _connectionTypesLocalService;
}