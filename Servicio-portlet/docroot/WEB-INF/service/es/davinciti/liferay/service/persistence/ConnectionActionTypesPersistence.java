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

package es.davinciti.liferay.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.davinciti.liferay.model.ConnectionActionTypes;

/**
 * The persistence interface for the connection action types service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see ConnectionActionTypesPersistenceImpl
 * @see ConnectionActionTypesUtil
 * @generated
 */
public interface ConnectionActionTypesPersistence extends BasePersistence<ConnectionActionTypes> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConnectionActionTypesUtil} to access the connection action types persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the connection action types in the entity cache if it is enabled.
	*
	* @param connectionActionTypes the connection action types
	*/
	public void cacheResult(
		es.davinciti.liferay.model.ConnectionActionTypes connectionActionTypes);

	/**
	* Caches the connection action typeses in the entity cache if it is enabled.
	*
	* @param connectionActionTypeses the connection action typeses
	*/
	public void cacheResult(
		java.util.List<es.davinciti.liferay.model.ConnectionActionTypes> connectionActionTypeses);

	/**
	* Creates a new connection action types with the primary key. Does not add the connection action types to the database.
	*
	* @param connectionActionTypeId the primary key for the new connection action types
	* @return the new connection action types
	*/
	public es.davinciti.liferay.model.ConnectionActionTypes create(
		long connectionActionTypeId);

	/**
	* Removes the connection action types with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param connectionActionTypeId the primary key of the connection action types
	* @return the connection action types that was removed
	* @throws es.davinciti.liferay.NoSuchConnectionActionTypesException if a connection action types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.ConnectionActionTypes remove(
		long connectionActionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchConnectionActionTypesException;

	public es.davinciti.liferay.model.ConnectionActionTypes updateImpl(
		es.davinciti.liferay.model.ConnectionActionTypes connectionActionTypes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the connection action types with the primary key or throws a {@link es.davinciti.liferay.NoSuchConnectionActionTypesException} if it could not be found.
	*
	* @param connectionActionTypeId the primary key of the connection action types
	* @return the connection action types
	* @throws es.davinciti.liferay.NoSuchConnectionActionTypesException if a connection action types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.ConnectionActionTypes findByPrimaryKey(
		long connectionActionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchConnectionActionTypesException;

	/**
	* Returns the connection action types with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param connectionActionTypeId the primary key of the connection action types
	* @return the connection action types, or <code>null</code> if a connection action types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.ConnectionActionTypes fetchByPrimaryKey(
		long connectionActionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the connection action typeses.
	*
	* @return the connection action typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionActionTypes> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the connection action typeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionActionTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of connection action typeses
	* @param end the upper bound of the range of connection action typeses (not inclusive)
	* @return the range of connection action typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionActionTypes> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the connection action typeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionActionTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of connection action typeses
	* @param end the upper bound of the range of connection action typeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of connection action typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionActionTypes> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the connection action typeses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of connection action typeses.
	*
	* @return the number of connection action typeses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the connection configses associated with the connection action types.
	*
	* @param pk the primary key of the connection action types
	* @return the connection configses associated with the connection action types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the connection configses associated with the connection action types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionActionTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the connection action types
	* @param start the lower bound of the range of connection action typeses
	* @param end the upper bound of the range of connection action typeses (not inclusive)
	* @return the range of connection configses associated with the connection action types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the connection configses associated with the connection action types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionActionTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the connection action types
	* @param start the lower bound of the range of connection action typeses
	* @param end the upper bound of the range of connection action typeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of connection configses associated with the connection action types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of connection configses associated with the connection action types.
	*
	* @param pk the primary key of the connection action types
	* @return the number of connection configses associated with the connection action types
	* @throws SystemException if a system exception occurred
	*/
	public int getConnectionConfigsesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the connection configs is associated with the connection action types.
	*
	* @param pk the primary key of the connection action types
	* @param connectionConfigsPK the primary key of the connection configs
	* @return <code>true</code> if the connection configs is associated with the connection action types; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsConnectionConfigs(long pk, long connectionConfigsPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the connection action types has any connection configses associated with it.
	*
	* @param pk the primary key of the connection action types to check for associations with connection configses
	* @return <code>true</code> if the connection action types has any connection configses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsConnectionConfigses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection action types and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection action types
	* @param connectionConfigsPK the primary key of the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionConfigs(long pk, long connectionConfigsPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection action types and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection action types
	* @param connectionConfigs the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionConfigs(long pk,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection action types and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection action types
	* @param connectionConfigsPKs the primary keys of the connection configses
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionConfigses(long pk, long[] connectionConfigsPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection action types and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection action types
	* @param connectionConfigses the connection configses
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionConfigses(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the connection action types and its connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection action types to clear the associated connection configses from
	* @throws SystemException if a system exception occurred
	*/
	public void clearConnectionConfigses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection action types and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection action types
	* @param connectionConfigsPK the primary key of the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionConfigs(long pk, long connectionConfigsPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection action types and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection action types
	* @param connectionConfigs the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionConfigs(long pk,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection action types and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection action types
	* @param connectionConfigsPKs the primary keys of the connection configses
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionConfigses(long pk, long[] connectionConfigsPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection action types and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection action types
	* @param connectionConfigses the connection configses
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionConfigses(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the connection configses associated with the connection action types, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection action types
	* @param connectionConfigsPKs the primary keys of the connection configses to be associated with the connection action types
	* @throws SystemException if a system exception occurred
	*/
	public void setConnectionConfigses(long pk, long[] connectionConfigsPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the connection configses associated with the connection action types, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection action types
	* @param connectionConfigses the connection configses to be associated with the connection action types
	* @throws SystemException if a system exception occurred
	*/
	public void setConnectionConfigses(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException;
}