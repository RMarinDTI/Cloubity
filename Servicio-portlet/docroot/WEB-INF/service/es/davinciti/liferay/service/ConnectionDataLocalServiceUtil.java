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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for ConnectionData. This utility wraps
 * {@link es.davinciti.liferay.service.impl.ConnectionDataLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Cmes
 * @see ConnectionDataLocalService
 * @see es.davinciti.liferay.service.base.ConnectionDataLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.impl.ConnectionDataLocalServiceImpl
 * @generated
 */
public class ConnectionDataLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.davinciti.liferay.service.impl.ConnectionDataLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the connection data to the database. Also notifies the appropriate model listeners.
	*
	* @param connectionData the connection data
	* @return the connection data that was added
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ConnectionData addConnectionData(
		es.davinciti.liferay.model.ConnectionData connectionData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addConnectionData(connectionData);
	}

	/**
	* Creates a new connection data with the primary key. Does not add the connection data to the database.
	*
	* @param connectionDataId the primary key for the new connection data
	* @return the new connection data
	*/
	public static es.davinciti.liferay.model.ConnectionData createConnectionData(
		long connectionDataId) {
		return getService().createConnectionData(connectionDataId);
	}

	/**
	* Deletes the connection data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param connectionDataId the primary key of the connection data
	* @return the connection data that was removed
	* @throws PortalException if a connection data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ConnectionData deleteConnectionData(
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteConnectionData(connectionDataId);
	}

	/**
	* Deletes the connection data from the database. Also notifies the appropriate model listeners.
	*
	* @param connectionData the connection data
	* @return the connection data that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ConnectionData deleteConnectionData(
		es.davinciti.liferay.model.ConnectionData connectionData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteConnectionData(connectionData);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static es.davinciti.liferay.model.ConnectionData fetchConnectionData(
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchConnectionData(connectionDataId);
	}

	/**
	* Returns the connection data with the primary key.
	*
	* @param connectionDataId the primary key of the connection data
	* @return the connection data
	* @throws PortalException if a connection data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ConnectionData getConnectionData(
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getConnectionData(connectionDataId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<es.davinciti.liferay.model.ConnectionData> getConnectionDatas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getConnectionDatas(start, end);
	}

	/**
	* Returns the number of connection datas.
	*
	* @return the number of connection datas
	* @throws SystemException if a system exception occurred
	*/
	public static int getConnectionDatasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getConnectionDatasCount();
	}

	/**
	* Updates the connection data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param connectionData the connection data
	* @return the connection data that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ConnectionData updateConnectionData(
		es.davinciti.liferay.model.ConnectionData connectionData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateConnectionData(connectionData);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionConfigsConnectionData(long configId,
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addConnectionConfigsConnectionData(configId, connectionDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionConfigsConnectionData(long configId,
		es.davinciti.liferay.model.ConnectionData connectionData)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addConnectionConfigsConnectionData(configId, connectionData);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionConfigsConnectionDatas(long configId,
		long[] connectionDataIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addConnectionConfigsConnectionDatas(configId, connectionDataIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionConfigsConnectionDatas(long configId,
		java.util.List<es.davinciti.liferay.model.ConnectionData> ConnectionDatas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addConnectionConfigsConnectionDatas(configId, ConnectionDatas);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearConnectionConfigsConnectionDatas(long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearConnectionConfigsConnectionDatas(configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteConnectionConfigsConnectionData(long configId,
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteConnectionConfigsConnectionData(configId, connectionDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteConnectionConfigsConnectionData(long configId,
		es.davinciti.liferay.model.ConnectionData connectionData)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteConnectionConfigsConnectionData(configId, connectionData);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteConnectionConfigsConnectionDatas(long configId,
		long[] connectionDataIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteConnectionConfigsConnectionDatas(configId, connectionDataIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteConnectionConfigsConnectionDatas(long configId,
		java.util.List<es.davinciti.liferay.model.ConnectionData> ConnectionDatas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteConnectionConfigsConnectionDatas(configId, ConnectionDatas);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionData> getConnectionConfigsConnectionDatas(
		long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getConnectionConfigsConnectionDatas(configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionData> getConnectionConfigsConnectionDatas(
		long configId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getConnectionConfigsConnectionDatas(configId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionData> getConnectionConfigsConnectionDatas(
		long configId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getConnectionConfigsConnectionDatas(configId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getConnectionConfigsConnectionDatasCount(long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getConnectionConfigsConnectionDatasCount(configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasConnectionConfigsConnectionData(long configId,
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasConnectionConfigsConnectionData(configId,
			connectionDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasConnectionConfigsConnectionDatas(long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasConnectionConfigsConnectionDatas(configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setConnectionConfigsConnectionDatas(long configId,
		long[] connectionDataIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.setConnectionConfigsConnectionDatas(configId, connectionDataIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static ConnectionDataLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ConnectionDataLocalService.class.getName());

			if (invokableLocalService instanceof ConnectionDataLocalService) {
				_service = (ConnectionDataLocalService)invokableLocalService;
			}
			else {
				_service = new ConnectionDataLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ConnectionDataLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ConnectionDataLocalService service) {
	}

	private static ConnectionDataLocalService _service;
}