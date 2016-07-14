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

import es.davinciti.liferay.model.ConnectionConfigs;

/**
 * The persistence interface for the connection configs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see ConnectionConfigsPersistenceImpl
 * @see ConnectionConfigsUtil
 * @generated
 */
public interface ConnectionConfigsPersistence extends BasePersistence<ConnectionConfigs> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConnectionConfigsUtil} to access the connection configs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the connection configses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching connection configses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the connection configses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionConfigsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of connection configses
	* @param end the upper bound of the range of connection configses (not inclusive)
	* @return the range of matching connection configses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the connection configses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionConfigsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of connection configses
	* @param end the upper bound of the range of connection configses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching connection configses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first connection configs in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching connection configs
	* @throws es.davinciti.liferay.NoSuchConnectionConfigsException if a matching connection configs could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.ConnectionConfigs findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchConnectionConfigsException;

	/**
	* Returns the first connection configs in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching connection configs, or <code>null</code> if a matching connection configs could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.ConnectionConfigs fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last connection configs in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching connection configs
	* @throws es.davinciti.liferay.NoSuchConnectionConfigsException if a matching connection configs could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.ConnectionConfigs findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchConnectionConfigsException;

	/**
	* Returns the last connection configs in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching connection configs, or <code>null</code> if a matching connection configs could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.ConnectionConfigs fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the connection configses before and after the current connection configs in the ordered set where companyId = &#63;.
	*
	* @param configId the primary key of the current connection configs
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next connection configs
	* @throws es.davinciti.liferay.NoSuchConnectionConfigsException if a connection configs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.ConnectionConfigs[] findByCompanyId_PrevAndNext(
		long configId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchConnectionConfigsException;

	/**
	* Removes all the connection configses where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of connection configses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching connection configses
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the connection configs in the entity cache if it is enabled.
	*
	* @param connectionConfigs the connection configs
	*/
	public void cacheResult(
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs);

	/**
	* Caches the connection configses in the entity cache if it is enabled.
	*
	* @param connectionConfigses the connection configses
	*/
	public void cacheResult(
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses);

	/**
	* Creates a new connection configs with the primary key. Does not add the connection configs to the database.
	*
	* @param configId the primary key for the new connection configs
	* @return the new connection configs
	*/
	public es.davinciti.liferay.model.ConnectionConfigs create(long configId);

	/**
	* Removes the connection configs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param configId the primary key of the connection configs
	* @return the connection configs that was removed
	* @throws es.davinciti.liferay.NoSuchConnectionConfigsException if a connection configs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.ConnectionConfigs remove(long configId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchConnectionConfigsException;

	public es.davinciti.liferay.model.ConnectionConfigs updateImpl(
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the connection configs with the primary key or throws a {@link es.davinciti.liferay.NoSuchConnectionConfigsException} if it could not be found.
	*
	* @param configId the primary key of the connection configs
	* @return the connection configs
	* @throws es.davinciti.liferay.NoSuchConnectionConfigsException if a connection configs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.ConnectionConfigs findByPrimaryKey(
		long configId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchConnectionConfigsException;

	/**
	* Returns the connection configs with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param configId the primary key of the connection configs
	* @return the connection configs, or <code>null</code> if a connection configs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.ConnectionConfigs fetchByPrimaryKey(
		long configId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the connection configses.
	*
	* @return the connection configses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the connection configses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionConfigsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of connection configses
	* @param end the upper bound of the range of connection configses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of connection configses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionConfigs> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the connection configses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of connection configses.
	*
	* @return the number of connection configses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the connection typeses associated with the connection configs.
	*
	* @param pk the primary key of the connection configs
	* @return the connection typeses associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionTypes> getConnectionTypeses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the connection typeses associated with the connection configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionConfigsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the connection configs
	* @param start the lower bound of the range of connection configses
	* @param end the upper bound of the range of connection configses (not inclusive)
	* @return the range of connection typeses associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionTypes> getConnectionTypeses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the connection typeses associated with the connection configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionConfigsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the connection configs
	* @param start the lower bound of the range of connection configses
	* @param end the upper bound of the range of connection configses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of connection typeses associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionTypes> getConnectionTypeses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of connection typeses associated with the connection configs.
	*
	* @param pk the primary key of the connection configs
	* @return the number of connection typeses associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public int getConnectionTypesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the connection types is associated with the connection configs.
	*
	* @param pk the primary key of the connection configs
	* @param connectionTypesPK the primary key of the connection types
	* @return <code>true</code> if the connection types is associated with the connection configs; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsConnectionTypes(long pk, long connectionTypesPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the connection configs has any connection typeses associated with it.
	*
	* @param pk the primary key of the connection configs to check for associations with connection typeses
	* @return <code>true</code> if the connection configs has any connection typeses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsConnectionTypeses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection configs and the connection types. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionTypesPK the primary key of the connection types
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionTypes(long pk, long connectionTypesPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection configs and the connection types. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionTypes the connection types
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionTypes(long pk,
		es.davinciti.liferay.model.ConnectionTypes connectionTypes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection configs and the connection typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionTypesPKs the primary keys of the connection typeses
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionTypeses(long pk, long[] connectionTypesPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection configs and the connection typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionTypeses the connection typeses
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionTypeses(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionTypes> connectionTypeses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the connection configs and its connection typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs to clear the associated connection typeses from
	* @throws SystemException if a system exception occurred
	*/
	public void clearConnectionTypeses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection configs and the connection types. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionTypesPK the primary key of the connection types
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionTypes(long pk, long connectionTypesPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection configs and the connection types. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionTypes the connection types
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionTypes(long pk,
		es.davinciti.liferay.model.ConnectionTypes connectionTypes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection configs and the connection typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionTypesPKs the primary keys of the connection typeses
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionTypeses(long pk, long[] connectionTypesPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection configs and the connection typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionTypeses the connection typeses
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionTypeses(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionTypes> connectionTypeses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the connection typeses associated with the connection configs, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionTypesPKs the primary keys of the connection typeses to be associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public void setConnectionTypeses(long pk, long[] connectionTypesPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the connection typeses associated with the connection configs, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionTypeses the connection typeses to be associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public void setConnectionTypeses(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionTypes> connectionTypeses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the connection action typeses associated with the connection configs.
	*
	* @param pk the primary key of the connection configs
	* @return the connection action typeses associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionActionTypes> getConnectionActionTypeses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the connection action typeses associated with the connection configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionConfigsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the connection configs
	* @param start the lower bound of the range of connection configses
	* @param end the upper bound of the range of connection configses (not inclusive)
	* @return the range of connection action typeses associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionActionTypes> getConnectionActionTypeses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the connection action typeses associated with the connection configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionConfigsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the connection configs
	* @param start the lower bound of the range of connection configses
	* @param end the upper bound of the range of connection configses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of connection action typeses associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionActionTypes> getConnectionActionTypeses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of connection action typeses associated with the connection configs.
	*
	* @param pk the primary key of the connection configs
	* @return the number of connection action typeses associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public int getConnectionActionTypesesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the connection action types is associated with the connection configs.
	*
	* @param pk the primary key of the connection configs
	* @param connectionActionTypesPK the primary key of the connection action types
	* @return <code>true</code> if the connection action types is associated with the connection configs; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsConnectionActionTypes(long pk,
		long connectionActionTypesPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the connection configs has any connection action typeses associated with it.
	*
	* @param pk the primary key of the connection configs to check for associations with connection action typeses
	* @return <code>true</code> if the connection configs has any connection action typeses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsConnectionActionTypeses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection configs and the connection action types. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionActionTypesPK the primary key of the connection action types
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionActionTypes(long pk, long connectionActionTypesPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection configs and the connection action types. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionActionTypes the connection action types
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionActionTypes(long pk,
		es.davinciti.liferay.model.ConnectionActionTypes connectionActionTypes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection configs and the connection action typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionActionTypesPKs the primary keys of the connection action typeses
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionActionTypeses(long pk,
		long[] connectionActionTypesPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection configs and the connection action typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionActionTypeses the connection action typeses
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionActionTypeses(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionActionTypes> connectionActionTypeses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the connection configs and its connection action typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs to clear the associated connection action typeses from
	* @throws SystemException if a system exception occurred
	*/
	public void clearConnectionActionTypeses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection configs and the connection action types. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionActionTypesPK the primary key of the connection action types
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionActionTypes(long pk,
		long connectionActionTypesPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection configs and the connection action types. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionActionTypes the connection action types
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionActionTypes(long pk,
		es.davinciti.liferay.model.ConnectionActionTypes connectionActionTypes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection configs and the connection action typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionActionTypesPKs the primary keys of the connection action typeses
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionActionTypeses(long pk,
		long[] connectionActionTypesPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection configs and the connection action typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionActionTypeses the connection action typeses
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionActionTypeses(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionActionTypes> connectionActionTypeses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the connection action typeses associated with the connection configs, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionActionTypesPKs the primary keys of the connection action typeses to be associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public void setConnectionActionTypeses(long pk,
		long[] connectionActionTypesPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the connection action typeses associated with the connection configs, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionActionTypeses the connection action typeses to be associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public void setConnectionActionTypeses(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionActionTypes> connectionActionTypeses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the connection datas associated with the connection configs.
	*
	* @param pk the primary key of the connection configs
	* @return the connection datas associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionData> getConnectionDatas(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the connection datas associated with the connection configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionConfigsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the connection configs
	* @param start the lower bound of the range of connection configses
	* @param end the upper bound of the range of connection configses (not inclusive)
	* @return the range of connection datas associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionData> getConnectionDatas(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the connection datas associated with the connection configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionConfigsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the connection configs
	* @param start the lower bound of the range of connection configses
	* @param end the upper bound of the range of connection configses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of connection datas associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.ConnectionData> getConnectionDatas(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of connection datas associated with the connection configs.
	*
	* @param pk the primary key of the connection configs
	* @return the number of connection datas associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public int getConnectionDatasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the connection data is associated with the connection configs.
	*
	* @param pk the primary key of the connection configs
	* @param connectionDataPK the primary key of the connection data
	* @return <code>true</code> if the connection data is associated with the connection configs; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsConnectionData(long pk, long connectionDataPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the connection configs has any connection datas associated with it.
	*
	* @param pk the primary key of the connection configs to check for associations with connection datas
	* @return <code>true</code> if the connection configs has any connection datas associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsConnectionDatas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection configs and the connection data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionDataPK the primary key of the connection data
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionData(long pk, long connectionDataPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection configs and the connection data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionData the connection data
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionData(long pk,
		es.davinciti.liferay.model.ConnectionData connectionData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection configs and the connection datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionDataPKs the primary keys of the connection datas
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionDatas(long pk, long[] connectionDataPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the connection configs and the connection datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionDatas the connection datas
	* @throws SystemException if a system exception occurred
	*/
	public void addConnectionDatas(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionData> connectionDatas)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the connection configs and its connection datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs to clear the associated connection datas from
	* @throws SystemException if a system exception occurred
	*/
	public void clearConnectionDatas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection configs and the connection data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionDataPK the primary key of the connection data
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionData(long pk, long connectionDataPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection configs and the connection data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionData the connection data
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionData(long pk,
		es.davinciti.liferay.model.ConnectionData connectionData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection configs and the connection datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionDataPKs the primary keys of the connection datas
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionDatas(long pk, long[] connectionDataPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the connection configs and the connection datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionDatas the connection datas
	* @throws SystemException if a system exception occurred
	*/
	public void removeConnectionDatas(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionData> connectionDatas)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the connection datas associated with the connection configs, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionDataPKs the primary keys of the connection datas to be associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public void setConnectionDatas(long pk, long[] connectionDataPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the connection datas associated with the connection configs, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection configs
	* @param connectionDatas the connection datas to be associated with the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public void setConnectionDatas(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionData> connectionDatas)
		throws com.liferay.portal.kernel.exception.SystemException;
}