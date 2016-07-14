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
 * Provides the local service utility for ConnectionConfigs. This utility wraps
 * {@link es.davinciti.liferay.service.impl.ConnectionConfigsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Cmes
 * @see ConnectionConfigsLocalService
 * @see es.davinciti.liferay.service.base.ConnectionConfigsLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.impl.ConnectionConfigsLocalServiceImpl
 * @generated
 */
public class ConnectionConfigsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.davinciti.liferay.service.impl.ConnectionConfigsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the connection configs to the database. Also notifies the appropriate model listeners.
	*
	* @param connectionConfigs the connection configs
	* @return the connection configs that was added
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ConnectionConfigs addConnectionConfigs(
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addConnectionConfigs(connectionConfigs);
	}

	/**
	* Creates a new connection configs with the primary key. Does not add the connection configs to the database.
	*
	* @param configId the primary key for the new connection configs
	* @return the new connection configs
	*/
	public static es.davinciti.liferay.model.ConnectionConfigs createConnectionConfigs(
		long configId) {
		return getService().createConnectionConfigs(configId);
	}

	/**
	* Deletes the connection configs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param configId the primary key of the connection configs
	* @return the connection configs that was removed
	* @throws PortalException if a connection configs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ConnectionConfigs deleteConnectionConfigs(
		long configId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteConnectionConfigs(configId);
	}

	/**
	* Deletes the connection configs from the database. Also notifies the appropriate model listeners.
	*
	* @param connectionConfigs the connection configs
	* @return the connection configs that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ConnectionConfigs deleteConnectionConfigs(
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteConnectionConfigs(connectionConfigs);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionConfigsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static es.davinciti.liferay.model.ConnectionConfigs fetchConnectionConfigs(
		long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchConnectionConfigs(configId);
	}

	/**
	* Returns the connection configs with the primary key.
	*
	* @param configId the primary key of the connection configs
	* @return the connection configs
	* @throws PortalException if a connection configs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ConnectionConfigs getConnectionConfigs(
		long configId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getConnectionConfigs(configId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getConnectionConfigses(start, end);
	}

	/**
	* Returns the number of connection configses.
	*
	* @return the number of connection configses
	* @throws SystemException if a system exception occurred
	*/
	public static int getConnectionConfigsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getConnectionConfigsesCount();
	}

	/**
	* Updates the connection configs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param connectionConfigs the connection configs
	* @return the connection configs that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ConnectionConfigs updateConnectionConfigs(
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateConnectionConfigs(connectionConfigs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionTypesConnectionConfigs(
		long connectionTypeId, long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addConnectionTypesConnectionConfigs(connectionTypeId, configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionTypesConnectionConfigs(
		long connectionTypeId,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addConnectionTypesConnectionConfigs(connectionTypeId,
			connectionConfigs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionTypesConnectionConfigses(
		long connectionTypeId, long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addConnectionTypesConnectionConfigses(connectionTypeId, configIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionTypesConnectionConfigses(
		long connectionTypeId,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> ConnectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addConnectionTypesConnectionConfigses(connectionTypeId,
			ConnectionConfigses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearConnectionTypesConnectionConfigses(
		long connectionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearConnectionTypesConnectionConfigses(connectionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteConnectionTypesConnectionConfigs(
		long connectionTypeId, long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteConnectionTypesConnectionConfigs(connectionTypeId, configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteConnectionTypesConnectionConfigs(
		long connectionTypeId,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteConnectionTypesConnectionConfigs(connectionTypeId,
			connectionConfigs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteConnectionTypesConnectionConfigses(
		long connectionTypeId, long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteConnectionTypesConnectionConfigses(connectionTypeId,
			configIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteConnectionTypesConnectionConfigses(
		long connectionTypeId,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> ConnectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteConnectionTypesConnectionConfigses(connectionTypeId,
			ConnectionConfigses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionTypesConnectionConfigses(
		long connectionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getConnectionTypesConnectionConfigses(connectionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionTypesConnectionConfigses(
		long connectionTypeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getConnectionTypesConnectionConfigses(connectionTypeId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionTypesConnectionConfigses(
		long connectionTypeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getConnectionTypesConnectionConfigses(connectionTypeId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getConnectionTypesConnectionConfigsesCount(
		long connectionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getConnectionTypesConnectionConfigsesCount(connectionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasConnectionTypesConnectionConfigs(
		long connectionTypeId, long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasConnectionTypesConnectionConfigs(connectionTypeId,
			configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasConnectionTypesConnectionConfigses(
		long connectionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasConnectionTypesConnectionConfigses(connectionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setConnectionTypesConnectionConfigses(
		long connectionTypeId, long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.setConnectionTypesConnectionConfigses(connectionTypeId, configIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionActionTypesConnectionConfigs(
		long connectionActionTypeId, long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addConnectionActionTypesConnectionConfigs(connectionActionTypeId,
			configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionActionTypesConnectionConfigs(
		long connectionActionTypeId,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addConnectionActionTypesConnectionConfigs(connectionActionTypeId,
			connectionConfigs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId, long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addConnectionActionTypesConnectionConfigses(connectionActionTypeId,
			configIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> ConnectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addConnectionActionTypesConnectionConfigses(connectionActionTypeId,
			ConnectionConfigses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.clearConnectionActionTypesConnectionConfigses(connectionActionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteConnectionActionTypesConnectionConfigs(
		long connectionActionTypeId, long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteConnectionActionTypesConnectionConfigs(connectionActionTypeId,
			configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteConnectionActionTypesConnectionConfigs(
		long connectionActionTypeId,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteConnectionActionTypesConnectionConfigs(connectionActionTypeId,
			connectionConfigs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId, long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteConnectionActionTypesConnectionConfigses(connectionActionTypeId,
			configIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> ConnectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteConnectionActionTypesConnectionConfigses(connectionActionTypeId,
			ConnectionConfigses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getConnectionActionTypesConnectionConfigses(connectionActionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getConnectionActionTypesConnectionConfigses(connectionActionTypeId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getConnectionActionTypesConnectionConfigses(connectionActionTypeId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getConnectionActionTypesConnectionConfigsesCount(
		long connectionActionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getConnectionActionTypesConnectionConfigsesCount(connectionActionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasConnectionActionTypesConnectionConfigs(
		long connectionActionTypeId, long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasConnectionActionTypesConnectionConfigs(connectionActionTypeId,
			configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasConnectionActionTypesConnectionConfigses(connectionActionTypeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setConnectionActionTypesConnectionConfigses(
		long connectionActionTypeId, long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.setConnectionActionTypesConnectionConfigses(connectionActionTypeId,
			configIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionDataConnectionConfigs(
		long connectionDataId, long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addConnectionDataConnectionConfigs(connectionDataId, configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionDataConnectionConfigs(
		long connectionDataId,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addConnectionDataConnectionConfigs(connectionDataId,
			connectionConfigs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionDataConnectionConfigses(
		long connectionDataId, long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addConnectionDataConnectionConfigses(connectionDataId, configIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionDataConnectionConfigses(
		long connectionDataId,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> ConnectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addConnectionDataConnectionConfigses(connectionDataId,
			ConnectionConfigses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearConnectionDataConnectionConfigses(
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearConnectionDataConnectionConfigses(connectionDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteConnectionDataConnectionConfigs(
		long connectionDataId, long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteConnectionDataConnectionConfigs(connectionDataId, configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteConnectionDataConnectionConfigs(
		long connectionDataId,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteConnectionDataConnectionConfigs(connectionDataId,
			connectionConfigs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteConnectionDataConnectionConfigses(
		long connectionDataId, long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteConnectionDataConnectionConfigses(connectionDataId, configIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteConnectionDataConnectionConfigses(
		long connectionDataId,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> ConnectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteConnectionDataConnectionConfigses(connectionDataId,
			ConnectionConfigses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionDataConnectionConfigses(
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getConnectionDataConnectionConfigses(connectionDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionDataConnectionConfigses(
		long connectionDataId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getConnectionDataConnectionConfigses(connectionDataId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionDataConnectionConfigses(
		long connectionDataId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getConnectionDataConnectionConfigses(connectionDataId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getConnectionDataConnectionConfigsesCount(
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getConnectionDataConnectionConfigsesCount(connectionDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasConnectionDataConnectionConfigs(
		long connectionDataId, long configId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasConnectionDataConnectionConfigs(connectionDataId,
			configId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasConnectionDataConnectionConfigses(
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasConnectionDataConnectionConfigses(connectionDataId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setConnectionDataConnectionConfigses(
		long connectionDataId, long[] configIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.setConnectionDataConnectionConfigses(connectionDataId, configIds);
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

	public static java.util.List<es.davinciti.liferay.model.ConnectionTypes> getConnectionTypes(
		long connectionConfigsId) {
		return getService().getConnectionTypes(connectionConfigsId);
	}

	public static java.util.List<es.davinciti.liferay.model.ConnectionActionTypes> getConnectionActionTypes(
		long connectionConfigsId) {
		return getService().getConnectionActionTypes(connectionConfigsId);
	}

	public static java.util.List<es.davinciti.liferay.model.ConnectionData> getConnectionData(
		long connectionConfigsId) {
		return getService().getConnectionData(connectionConfigsId);
	}

	public static void deleteConnectionTypes(long connectionConfigsId) {
		getService().deleteConnectionTypes(connectionConfigsId);
	}

	public static void deleteConnectionActionTypes(long connectionConfigsId) {
		getService().deleteConnectionActionTypes(connectionConfigsId);
	}

	public static void deleteConnectionData(long connectionConfigsId) {
		getService().deleteConnectionData(connectionConfigsId);
	}

	public static java.lang.String testConnectionErp(long configId)
		throws java.lang.Exception {
		return getService().testConnectionErp(configId);
	}

	public static java.lang.String getInfo(java.lang.String methodName,
		long configId, java.util.List<java.lang.String> headers) {
		return getService().getInfo(methodName, configId, headers);
	}

	public static java.lang.String getWebAccessToken(long configId,
		java.lang.String code) {
		return getService().getWebAccessToken(configId, code);
	}

	public static java.lang.String getApplicationCode(
		java.lang.String secretKey, java.lang.String applicationCode,
		java.lang.String server) {
		return getService()
				   .getApplicationCode(secretKey, applicationCode, server);
	}

	public static java.util.List<es.davinciti.liferay.model.ConnectionConfigs> findByCompanyId(
		long companyId) {
		return getService().findByCompanyId(companyId);
	}

	public static void clearService() {
		_service = null;
	}

	public static ConnectionConfigsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ConnectionConfigsLocalService.class.getName());

			if (invokableLocalService instanceof ConnectionConfigsLocalService) {
				_service = (ConnectionConfigsLocalService)invokableLocalService;
			}
			else {
				_service = new ConnectionConfigsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ConnectionConfigsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ConnectionConfigsLocalService service) {
	}

	private static ConnectionConfigsLocalService _service;
}