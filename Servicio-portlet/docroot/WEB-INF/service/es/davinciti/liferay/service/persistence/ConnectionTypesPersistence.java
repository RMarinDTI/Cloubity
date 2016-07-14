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

import es.davinciti.liferay.model.ConnectionTypes;

/**
 * The persistence interface for the connection types service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see ConnectionTypesPersistenceImpl
 * @see ConnectionTypesUtil
 * @generated
 */
public interface ConnectionTypesPersistence extends BasePersistence<ConnectionTypes> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConnectionTypesUtil} to access the connection types persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the connection types in the entity cache if it is enabled.
	*
	* @param connectionTypes the connection types
	*/
	public void cacheResult(
		es.davinciti.liferay.model.ConnectionTypes connectionTypes);

	/**
	* Caches the connection typeses in the entity cache if it is enabled.
	*
	* @param connectionTypeses the connection typeses
	*/
	public void cacheResult(
		java.util.List<es.davinciti.liferay.model.ConnectionTypes> connectionTypeses);

	/**
	* Creates a new connection types with the primary key. Does not add the connection types to the database.
	*
	* @param connectionTypeId the primary key for the new connection types
	* @return the new connection types
	*/
	public es.davinciti.liferay.model.ConnectionTypes create(
		long connectionTypeId);

	/**
	* Removes the connection types with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param connectionTypeId the primary key of the connection types
	* @return the connection types that was removed
	* @throws es.davinciti.liferay.NoSuchConnectionTypesException if a connection types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.ConnectionTypes remove(
		long connectionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchConnectionTypesException;

	public es.davinciti.liferay.model.ConnectionTypes updateImpl(
		es.davinciti.liferay.model.ConnectionTypes connectionTypes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the connection types with the primary key or throws a {@link es.davinciti.liferay.NoSuchConnectionTypesException} if it could not be found.
	*
	* @param connectionTypeId the primary key of the connection types
	* @return the connection types
	* @throws es.davinciti.liferay.NoSuchConnectionTypesException if a connection types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.ConnectionTypes findByPrimaryKey(
		long connectionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchConnectionTypesException;

	/**
	* Returns the connection types with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param connectionTypeId the primary key of the connection types
	* @return the connection types, or <code>null</code> if a connection types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.ConnectionTypes fetchByPrimaryKey(
		long connectionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the connection typeses.
	*
	* @return the connection typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionTypes> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.ConnectionTypes> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the connection typeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of connection typeses
	* @param end the upper bound of the range of connection typeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of connection typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionTypes> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the connection typeses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of connection typeses.
	*
	* @return the number of connection typeses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the connection configses associated with the connection types.
	*
	* @param pk the primary key of the connection types
	* @return the connection configses associated with the connection types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the connection configses associated with the connection types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the connection types
	* @param start the lower bound of the range of connection typeses
	* @param end the upper bound of the range of connection typeses (not inclusive)
	* @return the range of connection configses associated with the connection types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the connection configses associated with the connection types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the connection types
	* @param start the lower bound of the range of connection typeses
	* @param end the upper bound of the range of connection typeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of connection configses associated with the connection types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of connection configses associated with the connection types.
	*
	* @param pk the primary key of the connection types
	* @return the number of connection configses associated with the connection types
	* @throws SystemException if a system exception occurred
	*/
	public int getConnectionConfigsesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the connection configs is associated with the connection types.
	*
	* @param pk the primary key of the connection types
	* @param connectionConfigsPK the primary key of the connection configs
	* @return <code>true</code> if the connection configs is associated with the connection types; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsConnectionConfigs(long pk, long connectionConfigsPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the connection types has any connection configses associated with it.
	*
	* @param pk the primary key of the connection types to check for associations with connection configses
	* @return <code>true</code> if the connection types has any connection configses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsConnectionConfigses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection types and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection types
	* @param connectionConfigsPK the primary key of the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionConfigs(long pk, long connectionConfigsPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection types and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection types
	* @param connectionConfigs the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionConfigs(long pk,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection types and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection types
	* @param connectionConfigsPKs the primary keys of the connection configses
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionConfigses(long pk, long[] connectionConfigsPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection types and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection types
	* @param connectionConfigses the connection configses
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionConfigses(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the connection types and its connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection types to clear the associated connection configses from
	* @throws SystemException if a system exception occurred
	*/
	public void clearConnectionConfigses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection types and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection types
	* @param connectionConfigsPK the primary key of the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionConfigs(long pk, long connectionConfigsPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection types and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection types
	* @param connectionConfigs the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionConfigs(long pk,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection types and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection types
	* @param connectionConfigsPKs the primary keys of the connection configses
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionConfigses(long pk, long[] connectionConfigsPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection types and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection types
	* @param connectionConfigses the connection configses
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionConfigses(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the connection configses associated with the connection types, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection types
	* @param connectionConfigsPKs the primary keys of the connection configses to be associated with the connection types
	* @throws SystemException if a system exception occurred
	*/
	public void setConnectionConfigses(long pk, long[] connectionConfigsPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the connection configses associated with the connection types, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection types
	* @param connectionConfigses the connection configses to be associated with the connection types
	* @throws SystemException if a system exception occurred
	*/
	public void setConnectionConfigses(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException;
}