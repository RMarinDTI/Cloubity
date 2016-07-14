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

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import es.davinciti.liferay.NoSuchConnectionTypesException;
import es.davinciti.liferay.model.ConnectionTypes;
import es.davinciti.liferay.model.impl.ConnectionTypesImpl;
import es.davinciti.liferay.model.impl.ConnectionTypesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the connection types service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see ConnectionTypesPersistence
 * @see ConnectionTypesUtil
 * @generated
 */
public class ConnectionTypesPersistenceImpl extends BasePersistenceImpl<ConnectionTypes>
	implements ConnectionTypesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ConnectionTypesUtil} to access the connection types persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ConnectionTypesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ConnectionTypesModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionTypesModelImpl.FINDER_CACHE_ENABLED,
			ConnectionTypesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ConnectionTypesModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionTypesModelImpl.FINDER_CACHE_ENABLED,
			ConnectionTypesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ConnectionTypesModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionTypesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ConnectionTypesPersistenceImpl() {
		setModelClass(ConnectionTypes.class);
	}

	/**
	 * Caches the connection types in the entity cache if it is enabled.
	 *
	 * @param connectionTypes the connection types
	 */
	@Override
	public void cacheResult(ConnectionTypes connectionTypes) {
		EntityCacheUtil.putResult(ConnectionTypesModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionTypesImpl.class, connectionTypes.getPrimaryKey(),
			connectionTypes);

		connectionTypes.resetOriginalValues();
	}

	/**
	 * Caches the connection typeses in the entity cache if it is enabled.
	 *
	 * @param connectionTypeses the connection typeses
	 */
	@Override
	public void cacheResult(List<ConnectionTypes> connectionTypeses) {
		for (ConnectionTypes connectionTypes : connectionTypeses) {
			if (EntityCacheUtil.getResult(
						ConnectionTypesModelImpl.ENTITY_CACHE_ENABLED,
						ConnectionTypesImpl.class,
						connectionTypes.getPrimaryKey()) == null) {
				cacheResult(connectionTypes);
			}
			else {
				connectionTypes.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all connection typeses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ConnectionTypesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ConnectionTypesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the connection types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ConnectionTypes connectionTypes) {
		EntityCacheUtil.removeResult(ConnectionTypesModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionTypesImpl.class, connectionTypes.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ConnectionTypes> connectionTypeses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ConnectionTypes connectionTypes : connectionTypeses) {
			EntityCacheUtil.removeResult(ConnectionTypesModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionTypesImpl.class, connectionTypes.getPrimaryKey());
		}
	}

	/**
	 * Creates a new connection types with the primary key. Does not add the connection types to the database.
	 *
	 * @param connectionTypeId the primary key for the new connection types
	 * @return the new connection types
	 */
	@Override
	public ConnectionTypes create(long connectionTypeId) {
		ConnectionTypes connectionTypes = new ConnectionTypesImpl();

		connectionTypes.setNew(true);
		connectionTypes.setPrimaryKey(connectionTypeId);

		return connectionTypes;
	}

	/**
	 * Removes the connection types with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param connectionTypeId the primary key of the connection types
	 * @return the connection types that was removed
	 * @throws es.davinciti.liferay.NoSuchConnectionTypesException if a connection types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionTypes remove(long connectionTypeId)
		throws NoSuchConnectionTypesException, SystemException {
		return remove((Serializable)connectionTypeId);
	}

	/**
	 * Removes the connection types with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the connection types
	 * @return the connection types that was removed
	 * @throws es.davinciti.liferay.NoSuchConnectionTypesException if a connection types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionTypes remove(Serializable primaryKey)
		throws NoSuchConnectionTypesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ConnectionTypes connectionTypes = (ConnectionTypes)session.get(ConnectionTypesImpl.class,
					primaryKey);

			if (connectionTypes == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchConnectionTypesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(connectionTypes);
		}
		catch (NoSuchConnectionTypesException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ConnectionTypes removeImpl(ConnectionTypes connectionTypes)
		throws SystemException {
		connectionTypes = toUnwrappedModel(connectionTypes);

		connectionTypesToConnectionConfigsTableMapper.deleteLeftPrimaryKeyTableMappings(connectionTypes.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(connectionTypes)) {
				connectionTypes = (ConnectionTypes)session.get(ConnectionTypesImpl.class,
						connectionTypes.getPrimaryKeyObj());
			}

			if (connectionTypes != null) {
				session.delete(connectionTypes);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (connectionTypes != null) {
			clearCache(connectionTypes);
		}

		return connectionTypes;
	}

	@Override
	public ConnectionTypes updateImpl(
		es.davinciti.liferay.model.ConnectionTypes connectionTypes)
		throws SystemException {
		connectionTypes = toUnwrappedModel(connectionTypes);

		boolean isNew = connectionTypes.isNew();

		Session session = null;

		try {
			session = openSession();

			if (connectionTypes.isNew()) {
				session.save(connectionTypes);

				connectionTypes.setNew(false);
			}
			else {
				session.merge(connectionTypes);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ConnectionTypesModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionTypesImpl.class, connectionTypes.getPrimaryKey(),
			connectionTypes);

		return connectionTypes;
	}

	protected ConnectionTypes toUnwrappedModel(ConnectionTypes connectionTypes) {
		if (connectionTypes instanceof ConnectionTypesImpl) {
			return connectionTypes;
		}

		ConnectionTypesImpl connectionTypesImpl = new ConnectionTypesImpl();

		connectionTypesImpl.setNew(connectionTypes.isNew());
		connectionTypesImpl.setPrimaryKey(connectionTypes.getPrimaryKey());

		connectionTypesImpl.setConnectionTypeId(connectionTypes.getConnectionTypeId());
		connectionTypesImpl.setName(connectionTypes.getName());
		connectionTypesImpl.setDisableDate(connectionTypes.getDisableDate());

		return connectionTypesImpl;
	}

	/**
	 * Returns the connection types with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the connection types
	 * @return the connection types
	 * @throws es.davinciti.liferay.NoSuchConnectionTypesException if a connection types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionTypes findByPrimaryKey(Serializable primaryKey)
		throws NoSuchConnectionTypesException, SystemException {
		ConnectionTypes connectionTypes = fetchByPrimaryKey(primaryKey);

		if (connectionTypes == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchConnectionTypesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return connectionTypes;
	}

	/**
	 * Returns the connection types with the primary key or throws a {@link es.davinciti.liferay.NoSuchConnectionTypesException} if it could not be found.
	 *
	 * @param connectionTypeId the primary key of the connection types
	 * @return the connection types
	 * @throws es.davinciti.liferay.NoSuchConnectionTypesException if a connection types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionTypes findByPrimaryKey(long connectionTypeId)
		throws NoSuchConnectionTypesException, SystemException {
		return findByPrimaryKey((Serializable)connectionTypeId);
	}

	/**
	 * Returns the connection types with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the connection types
	 * @return the connection types, or <code>null</code> if a connection types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionTypes fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ConnectionTypes connectionTypes = (ConnectionTypes)EntityCacheUtil.getResult(ConnectionTypesModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionTypesImpl.class, primaryKey);

		if (connectionTypes == _nullConnectionTypes) {
			return null;
		}

		if (connectionTypes == null) {
			Session session = null;

			try {
				session = openSession();

				connectionTypes = (ConnectionTypes)session.get(ConnectionTypesImpl.class,
						primaryKey);

				if (connectionTypes != null) {
					cacheResult(connectionTypes);
				}
				else {
					EntityCacheUtil.putResult(ConnectionTypesModelImpl.ENTITY_CACHE_ENABLED,
						ConnectionTypesImpl.class, primaryKey,
						_nullConnectionTypes);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ConnectionTypesModelImpl.ENTITY_CACHE_ENABLED,
					ConnectionTypesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return connectionTypes;
	}

	/**
	 * Returns the connection types with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param connectionTypeId the primary key of the connection types
	 * @return the connection types, or <code>null</code> if a connection types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionTypes fetchByPrimaryKey(long connectionTypeId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)connectionTypeId);
	}

	/**
	 * Returns all the connection typeses.
	 *
	 * @return the connection typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConnectionTypes> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<ConnectionTypes> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<ConnectionTypes> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<ConnectionTypes> list = (List<ConnectionTypes>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONNECTIONTYPES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONNECTIONTYPES;

				if (pagination) {
					sql = sql.concat(ConnectionTypesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ConnectionTypes>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ConnectionTypes>(list);
				}
				else {
					list = (List<ConnectionTypes>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the connection typeses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ConnectionTypes connectionTypes : findAll()) {
			remove(connectionTypes);
		}
	}

	/**
	 * Returns the number of connection typeses.
	 *
	 * @return the number of connection typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CONNECTIONTYPES);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns all the connection configses associated with the connection types.
	 *
	 * @param pk the primary key of the connection types
	 * @return the connection configses associated with the connection types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk) throws SystemException {
		return getConnectionConfigses(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

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
	@Override
	public List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk, int start, int end) throws SystemException {
		return getConnectionConfigses(pk, start, end, null);
	}

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
	@Override
	public List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return connectionTypesToConnectionConfigsTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of connection configses associated with the connection types.
	 *
	 * @param pk the primary key of the connection types
	 * @return the number of connection configses associated with the connection types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getConnectionConfigsesSize(long pk) throws SystemException {
		long[] pks = connectionTypesToConnectionConfigsTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the connection configs is associated with the connection types.
	 *
	 * @param pk the primary key of the connection types
	 * @param connectionConfigsPK the primary key of the connection configs
	 * @return <code>true</code> if the connection configs is associated with the connection types; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsConnectionConfigs(long pk, long connectionConfigsPK)
		throws SystemException {
		return connectionTypesToConnectionConfigsTableMapper.containsTableMapping(pk,
			connectionConfigsPK);
	}

	/**
	 * Returns <code>true</code> if the connection types has any connection configses associated with it.
	 *
	 * @param pk the primary key of the connection types to check for associations with connection configses
	 * @return <code>true</code> if the connection types has any connection configses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsConnectionConfigses(long pk)
		throws SystemException {
		if (getConnectionConfigsesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the connection types and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection types
	 * @param connectionConfigsPK the primary key of the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionConfigs(long pk, long connectionConfigsPK)
		throws SystemException {
		connectionTypesToConnectionConfigsTableMapper.addTableMapping(pk,
			connectionConfigsPK);
	}

	/**
	 * Adds an association between the connection types and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection types
	 * @param connectionConfigs the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionConfigs(long pk,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws SystemException {
		connectionTypesToConnectionConfigsTableMapper.addTableMapping(pk,
			connectionConfigs.getPrimaryKey());
	}

	/**
	 * Adds an association between the connection types and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection types
	 * @param connectionConfigsPKs the primary keys of the connection configses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionConfigses(long pk, long[] connectionConfigsPKs)
		throws SystemException {
		for (long connectionConfigsPK : connectionConfigsPKs) {
			connectionTypesToConnectionConfigsTableMapper.addTableMapping(pk,
				connectionConfigsPK);
		}
	}

	/**
	 * Adds an association between the connection types and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection types
	 * @param connectionConfigses the connection configses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionConfigses(long pk,
		List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses)
		throws SystemException {
		for (es.davinciti.liferay.model.ConnectionConfigs connectionConfigs : connectionConfigses) {
			connectionTypesToConnectionConfigsTableMapper.addTableMapping(pk,
				connectionConfigs.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the connection types and its connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection types to clear the associated connection configses from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearConnectionConfigses(long pk) throws SystemException {
		connectionTypesToConnectionConfigsTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the connection types and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection types
	 * @param connectionConfigsPK the primary key of the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionConfigs(long pk, long connectionConfigsPK)
		throws SystemException {
		connectionTypesToConnectionConfigsTableMapper.deleteTableMapping(pk,
			connectionConfigsPK);
	}

	/**
	 * Removes the association between the connection types and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection types
	 * @param connectionConfigs the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionConfigs(long pk,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws SystemException {
		connectionTypesToConnectionConfigsTableMapper.deleteTableMapping(pk,
			connectionConfigs.getPrimaryKey());
	}

	/**
	 * Removes the association between the connection types and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection types
	 * @param connectionConfigsPKs the primary keys of the connection configses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionConfigses(long pk, long[] connectionConfigsPKs)
		throws SystemException {
		for (long connectionConfigsPK : connectionConfigsPKs) {
			connectionTypesToConnectionConfigsTableMapper.deleteTableMapping(pk,
				connectionConfigsPK);
		}
	}

	/**
	 * Removes the association between the connection types and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection types
	 * @param connectionConfigses the connection configses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionConfigses(long pk,
		List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses)
		throws SystemException {
		for (es.davinciti.liferay.model.ConnectionConfigs connectionConfigs : connectionConfigses) {
			connectionTypesToConnectionConfigsTableMapper.deleteTableMapping(pk,
				connectionConfigs.getPrimaryKey());
		}
	}

	/**
	 * Sets the connection configses associated with the connection types, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection types
	 * @param connectionConfigsPKs the primary keys of the connection configses to be associated with the connection types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setConnectionConfigses(long pk, long[] connectionConfigsPKs)
		throws SystemException {
		Set<Long> newConnectionConfigsPKsSet = SetUtil.fromArray(connectionConfigsPKs);
		Set<Long> oldConnectionConfigsPKsSet = SetUtil.fromArray(connectionTypesToConnectionConfigsTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeConnectionConfigsPKsSet = new HashSet<Long>(oldConnectionConfigsPKsSet);

		removeConnectionConfigsPKsSet.removeAll(newConnectionConfigsPKsSet);

		for (long removeConnectionConfigsPK : removeConnectionConfigsPKsSet) {
			connectionTypesToConnectionConfigsTableMapper.deleteTableMapping(pk,
				removeConnectionConfigsPK);
		}

		newConnectionConfigsPKsSet.removeAll(oldConnectionConfigsPKsSet);

		for (long newConnectionConfigsPK : newConnectionConfigsPKsSet) {
			connectionTypesToConnectionConfigsTableMapper.addTableMapping(pk,
				newConnectionConfigsPK);
		}
	}

	/**
	 * Sets the connection configses associated with the connection types, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection types
	 * @param connectionConfigses the connection configses to be associated with the connection types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setConnectionConfigses(long pk,
		List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses)
		throws SystemException {
		try {
			long[] connectionConfigsPKs = new long[connectionConfigses.size()];

			for (int i = 0; i < connectionConfigses.size(); i++) {
				es.davinciti.liferay.model.ConnectionConfigs connectionConfigs = connectionConfigses.get(i);

				connectionConfigsPKs[i] = connectionConfigs.getPrimaryKey();
			}

			setConnectionConfigses(pk, connectionConfigsPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(ConnectionTypesModelImpl.MAPPING_TABLE_CMES_CONFIGS_TYPES_NAME);
		}
	}

	/**
	 * Initializes the connection types persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.ConnectionTypes")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ConnectionTypes>> listenersList = new ArrayList<ModelListener<ConnectionTypes>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ConnectionTypes>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		connectionTypesToConnectionConfigsTableMapper = TableMapperFactory.getTableMapper("CMES_Configs_Types",
				"connectionTypeId", "configId", this,
				connectionConfigsPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ConnectionTypesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("CMES_Configs_Types");
	}

	@BeanReference(type = ConnectionConfigsPersistence.class)
	protected ConnectionConfigsPersistence connectionConfigsPersistence;
	protected TableMapper<ConnectionTypes, es.davinciti.liferay.model.ConnectionConfigs> connectionTypesToConnectionConfigsTableMapper;
	private static final String _SQL_SELECT_CONNECTIONTYPES = "SELECT connectionTypes FROM ConnectionTypes connectionTypes";
	private static final String _SQL_COUNT_CONNECTIONTYPES = "SELECT COUNT(connectionTypes) FROM ConnectionTypes connectionTypes";
	private static final String _ORDER_BY_ENTITY_ALIAS = "connectionTypes.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ConnectionTypes exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ConnectionTypesPersistenceImpl.class);
	private static ConnectionTypes _nullConnectionTypes = new ConnectionTypesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ConnectionTypes> toCacheModel() {
				return _nullConnectionTypesCacheModel;
			}
		};

	private static CacheModel<ConnectionTypes> _nullConnectionTypesCacheModel = new CacheModel<ConnectionTypes>() {
			@Override
			public ConnectionTypes toEntityModel() {
				return _nullConnectionTypes;
			}
		};
}