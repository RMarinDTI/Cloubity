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

import es.davinciti.liferay.NoSuchConnectionActionTypesException;
import es.davinciti.liferay.model.ConnectionActionTypes;
import es.davinciti.liferay.model.impl.ConnectionActionTypesImpl;
import es.davinciti.liferay.model.impl.ConnectionActionTypesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the connection action types service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see ConnectionActionTypesPersistence
 * @see ConnectionActionTypesUtil
 * @generated
 */
public class ConnectionActionTypesPersistenceImpl extends BasePersistenceImpl<ConnectionActionTypes>
	implements ConnectionActionTypesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ConnectionActionTypesUtil} to access the connection action types persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ConnectionActionTypesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ConnectionActionTypesModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionActionTypesModelImpl.FINDER_CACHE_ENABLED,
			ConnectionActionTypesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ConnectionActionTypesModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionActionTypesModelImpl.FINDER_CACHE_ENABLED,
			ConnectionActionTypesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ConnectionActionTypesModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionActionTypesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ConnectionActionTypesPersistenceImpl() {
		setModelClass(ConnectionActionTypes.class);
	}

	/**
	 * Caches the connection action types in the entity cache if it is enabled.
	 *
	 * @param connectionActionTypes the connection action types
	 */
	@Override
	public void cacheResult(ConnectionActionTypes connectionActionTypes) {
		EntityCacheUtil.putResult(ConnectionActionTypesModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionActionTypesImpl.class,
			connectionActionTypes.getPrimaryKey(), connectionActionTypes);

		connectionActionTypes.resetOriginalValues();
	}

	/**
	 * Caches the connection action typeses in the entity cache if it is enabled.
	 *
	 * @param connectionActionTypeses the connection action typeses
	 */
	@Override
	public void cacheResult(List<ConnectionActionTypes> connectionActionTypeses) {
		for (ConnectionActionTypes connectionActionTypes : connectionActionTypeses) {
			if (EntityCacheUtil.getResult(
						ConnectionActionTypesModelImpl.ENTITY_CACHE_ENABLED,
						ConnectionActionTypesImpl.class,
						connectionActionTypes.getPrimaryKey()) == null) {
				cacheResult(connectionActionTypes);
			}
			else {
				connectionActionTypes.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all connection action typeses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ConnectionActionTypesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ConnectionActionTypesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the connection action types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ConnectionActionTypes connectionActionTypes) {
		EntityCacheUtil.removeResult(ConnectionActionTypesModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionActionTypesImpl.class,
			connectionActionTypes.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ConnectionActionTypes> connectionActionTypeses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ConnectionActionTypes connectionActionTypes : connectionActionTypeses) {
			EntityCacheUtil.removeResult(ConnectionActionTypesModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionActionTypesImpl.class,
				connectionActionTypes.getPrimaryKey());
		}
	}

	/**
	 * Creates a new connection action types with the primary key. Does not add the connection action types to the database.
	 *
	 * @param connectionActionTypeId the primary key for the new connection action types
	 * @return the new connection action types
	 */
	@Override
	public ConnectionActionTypes create(long connectionActionTypeId) {
		ConnectionActionTypes connectionActionTypes = new ConnectionActionTypesImpl();

		connectionActionTypes.setNew(true);
		connectionActionTypes.setPrimaryKey(connectionActionTypeId);

		return connectionActionTypes;
	}

	/**
	 * Removes the connection action types with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param connectionActionTypeId the primary key of the connection action types
	 * @return the connection action types that was removed
	 * @throws es.davinciti.liferay.NoSuchConnectionActionTypesException if a connection action types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionActionTypes remove(long connectionActionTypeId)
		throws NoSuchConnectionActionTypesException, SystemException {
		return remove((Serializable)connectionActionTypeId);
	}

	/**
	 * Removes the connection action types with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the connection action types
	 * @return the connection action types that was removed
	 * @throws es.davinciti.liferay.NoSuchConnectionActionTypesException if a connection action types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionActionTypes remove(Serializable primaryKey)
		throws NoSuchConnectionActionTypesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ConnectionActionTypes connectionActionTypes = (ConnectionActionTypes)session.get(ConnectionActionTypesImpl.class,
					primaryKey);

			if (connectionActionTypes == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchConnectionActionTypesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(connectionActionTypes);
		}
		catch (NoSuchConnectionActionTypesException nsee) {
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
	protected ConnectionActionTypes removeImpl(
		ConnectionActionTypes connectionActionTypes) throws SystemException {
		connectionActionTypes = toUnwrappedModel(connectionActionTypes);

		connectionActionTypesToConnectionConfigsTableMapper.deleteLeftPrimaryKeyTableMappings(connectionActionTypes.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(connectionActionTypes)) {
				connectionActionTypes = (ConnectionActionTypes)session.get(ConnectionActionTypesImpl.class,
						connectionActionTypes.getPrimaryKeyObj());
			}

			if (connectionActionTypes != null) {
				session.delete(connectionActionTypes);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (connectionActionTypes != null) {
			clearCache(connectionActionTypes);
		}

		return connectionActionTypes;
	}

	@Override
	public ConnectionActionTypes updateImpl(
		es.davinciti.liferay.model.ConnectionActionTypes connectionActionTypes)
		throws SystemException {
		connectionActionTypes = toUnwrappedModel(connectionActionTypes);

		boolean isNew = connectionActionTypes.isNew();

		Session session = null;

		try {
			session = openSession();

			if (connectionActionTypes.isNew()) {
				session.save(connectionActionTypes);

				connectionActionTypes.setNew(false);
			}
			else {
				session.merge(connectionActionTypes);
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

		EntityCacheUtil.putResult(ConnectionActionTypesModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionActionTypesImpl.class,
			connectionActionTypes.getPrimaryKey(), connectionActionTypes);

		return connectionActionTypes;
	}

	protected ConnectionActionTypes toUnwrappedModel(
		ConnectionActionTypes connectionActionTypes) {
		if (connectionActionTypes instanceof ConnectionActionTypesImpl) {
			return connectionActionTypes;
		}

		ConnectionActionTypesImpl connectionActionTypesImpl = new ConnectionActionTypesImpl();

		connectionActionTypesImpl.setNew(connectionActionTypes.isNew());
		connectionActionTypesImpl.setPrimaryKey(connectionActionTypes.getPrimaryKey());

		connectionActionTypesImpl.setConnectionActionTypeId(connectionActionTypes.getConnectionActionTypeId());
		connectionActionTypesImpl.setName(connectionActionTypes.getName());
		connectionActionTypesImpl.setDisableDate(connectionActionTypes.getDisableDate());

		return connectionActionTypesImpl;
	}

	/**
	 * Returns the connection action types with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the connection action types
	 * @return the connection action types
	 * @throws es.davinciti.liferay.NoSuchConnectionActionTypesException if a connection action types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionActionTypes findByPrimaryKey(Serializable primaryKey)
		throws NoSuchConnectionActionTypesException, SystemException {
		ConnectionActionTypes connectionActionTypes = fetchByPrimaryKey(primaryKey);

		if (connectionActionTypes == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchConnectionActionTypesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return connectionActionTypes;
	}

	/**
	 * Returns the connection action types with the primary key or throws a {@link es.davinciti.liferay.NoSuchConnectionActionTypesException} if it could not be found.
	 *
	 * @param connectionActionTypeId the primary key of the connection action types
	 * @return the connection action types
	 * @throws es.davinciti.liferay.NoSuchConnectionActionTypesException if a connection action types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionActionTypes findByPrimaryKey(long connectionActionTypeId)
		throws NoSuchConnectionActionTypesException, SystemException {
		return findByPrimaryKey((Serializable)connectionActionTypeId);
	}

	/**
	 * Returns the connection action types with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the connection action types
	 * @return the connection action types, or <code>null</code> if a connection action types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionActionTypes fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ConnectionActionTypes connectionActionTypes = (ConnectionActionTypes)EntityCacheUtil.getResult(ConnectionActionTypesModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionActionTypesImpl.class, primaryKey);

		if (connectionActionTypes == _nullConnectionActionTypes) {
			return null;
		}

		if (connectionActionTypes == null) {
			Session session = null;

			try {
				session = openSession();

				connectionActionTypes = (ConnectionActionTypes)session.get(ConnectionActionTypesImpl.class,
						primaryKey);

				if (connectionActionTypes != null) {
					cacheResult(connectionActionTypes);
				}
				else {
					EntityCacheUtil.putResult(ConnectionActionTypesModelImpl.ENTITY_CACHE_ENABLED,
						ConnectionActionTypesImpl.class, primaryKey,
						_nullConnectionActionTypes);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ConnectionActionTypesModelImpl.ENTITY_CACHE_ENABLED,
					ConnectionActionTypesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return connectionActionTypes;
	}

	/**
	 * Returns the connection action types with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param connectionActionTypeId the primary key of the connection action types
	 * @return the connection action types, or <code>null</code> if a connection action types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionActionTypes fetchByPrimaryKey(long connectionActionTypeId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)connectionActionTypeId);
	}

	/**
	 * Returns all the connection action typeses.
	 *
	 * @return the connection action typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConnectionActionTypes> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ConnectionActionTypes> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<ConnectionActionTypes> findAll(int start, int end,
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

		List<ConnectionActionTypes> list = (List<ConnectionActionTypes>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONNECTIONACTIONTYPES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONNECTIONACTIONTYPES;

				if (pagination) {
					sql = sql.concat(ConnectionActionTypesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ConnectionActionTypes>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ConnectionActionTypes>(list);
				}
				else {
					list = (List<ConnectionActionTypes>)QueryUtil.list(q,
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
	 * Removes all the connection action typeses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ConnectionActionTypes connectionActionTypes : findAll()) {
			remove(connectionActionTypes);
		}
	}

	/**
	 * Returns the number of connection action typeses.
	 *
	 * @return the number of connection action typeses
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

				Query q = session.createQuery(_SQL_COUNT_CONNECTIONACTIONTYPES);

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
	 * Returns all the connection configses associated with the connection action types.
	 *
	 * @param pk the primary key of the connection action types
	 * @return the connection configses associated with the connection action types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk) throws SystemException {
		return getConnectionConfigses(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

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
	@Override
	public List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk, int start, int end) throws SystemException {
		return getConnectionConfigses(pk, start, end, null);
	}

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
	@Override
	public List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return connectionActionTypesToConnectionConfigsTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of connection configses associated with the connection action types.
	 *
	 * @param pk the primary key of the connection action types
	 * @return the number of connection configses associated with the connection action types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getConnectionConfigsesSize(long pk) throws SystemException {
		long[] pks = connectionActionTypesToConnectionConfigsTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the connection configs is associated with the connection action types.
	 *
	 * @param pk the primary key of the connection action types
	 * @param connectionConfigsPK the primary key of the connection configs
	 * @return <code>true</code> if the connection configs is associated with the connection action types; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsConnectionConfigs(long pk, long connectionConfigsPK)
		throws SystemException {
		return connectionActionTypesToConnectionConfigsTableMapper.containsTableMapping(pk,
			connectionConfigsPK);
	}

	/**
	 * Returns <code>true</code> if the connection action types has any connection configses associated with it.
	 *
	 * @param pk the primary key of the connection action types to check for associations with connection configses
	 * @return <code>true</code> if the connection action types has any connection configses associated with it; <code>false</code> otherwise
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
	 * Adds an association between the connection action types and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection action types
	 * @param connectionConfigsPK the primary key of the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionConfigs(long pk, long connectionConfigsPK)
		throws SystemException {
		connectionActionTypesToConnectionConfigsTableMapper.addTableMapping(pk,
			connectionConfigsPK);
	}

	/**
	 * Adds an association between the connection action types and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection action types
	 * @param connectionConfigs the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionConfigs(long pk,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws SystemException {
		connectionActionTypesToConnectionConfigsTableMapper.addTableMapping(pk,
			connectionConfigs.getPrimaryKey());
	}

	/**
	 * Adds an association between the connection action types and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection action types
	 * @param connectionConfigsPKs the primary keys of the connection configses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionConfigses(long pk, long[] connectionConfigsPKs)
		throws SystemException {
		for (long connectionConfigsPK : connectionConfigsPKs) {
			connectionActionTypesToConnectionConfigsTableMapper.addTableMapping(pk,
				connectionConfigsPK);
		}
	}

	/**
	 * Adds an association between the connection action types and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection action types
	 * @param connectionConfigses the connection configses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionConfigses(long pk,
		List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses)
		throws SystemException {
		for (es.davinciti.liferay.model.ConnectionConfigs connectionConfigs : connectionConfigses) {
			connectionActionTypesToConnectionConfigsTableMapper.addTableMapping(pk,
				connectionConfigs.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the connection action types and its connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection action types to clear the associated connection configses from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearConnectionConfigses(long pk) throws SystemException {
		connectionActionTypesToConnectionConfigsTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the connection action types and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection action types
	 * @param connectionConfigsPK the primary key of the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionConfigs(long pk, long connectionConfigsPK)
		throws SystemException {
		connectionActionTypesToConnectionConfigsTableMapper.deleteTableMapping(pk,
			connectionConfigsPK);
	}

	/**
	 * Removes the association between the connection action types and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection action types
	 * @param connectionConfigs the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionConfigs(long pk,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws SystemException {
		connectionActionTypesToConnectionConfigsTableMapper.deleteTableMapping(pk,
			connectionConfigs.getPrimaryKey());
	}

	/**
	 * Removes the association between the connection action types and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection action types
	 * @param connectionConfigsPKs the primary keys of the connection configses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionConfigses(long pk, long[] connectionConfigsPKs)
		throws SystemException {
		for (long connectionConfigsPK : connectionConfigsPKs) {
			connectionActionTypesToConnectionConfigsTableMapper.deleteTableMapping(pk,
				connectionConfigsPK);
		}
	}

	/**
	 * Removes the association between the connection action types and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection action types
	 * @param connectionConfigses the connection configses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionConfigses(long pk,
		List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses)
		throws SystemException {
		for (es.davinciti.liferay.model.ConnectionConfigs connectionConfigs : connectionConfigses) {
			connectionActionTypesToConnectionConfigsTableMapper.deleteTableMapping(pk,
				connectionConfigs.getPrimaryKey());
		}
	}

	/**
	 * Sets the connection configses associated with the connection action types, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection action types
	 * @param connectionConfigsPKs the primary keys of the connection configses to be associated with the connection action types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setConnectionConfigses(long pk, long[] connectionConfigsPKs)
		throws SystemException {
		Set<Long> newConnectionConfigsPKsSet = SetUtil.fromArray(connectionConfigsPKs);
		Set<Long> oldConnectionConfigsPKsSet = SetUtil.fromArray(connectionActionTypesToConnectionConfigsTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeConnectionConfigsPKsSet = new HashSet<Long>(oldConnectionConfigsPKsSet);

		removeConnectionConfigsPKsSet.removeAll(newConnectionConfigsPKsSet);

		for (long removeConnectionConfigsPK : removeConnectionConfigsPKsSet) {
			connectionActionTypesToConnectionConfigsTableMapper.deleteTableMapping(pk,
				removeConnectionConfigsPK);
		}

		newConnectionConfigsPKsSet.removeAll(oldConnectionConfigsPKsSet);

		for (long newConnectionConfigsPK : newConnectionConfigsPKsSet) {
			connectionActionTypesToConnectionConfigsTableMapper.addTableMapping(pk,
				newConnectionConfigsPK);
		}
	}

	/**
	 * Sets the connection configses associated with the connection action types, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection action types
	 * @param connectionConfigses the connection configses to be associated with the connection action types
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
			FinderCacheUtil.clearCache(ConnectionActionTypesModelImpl.MAPPING_TABLE_CMES_CONFIGS_ACTIONS_NAME);
		}
	}

	/**
	 * Initializes the connection action types persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.ConnectionActionTypes")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ConnectionActionTypes>> listenersList = new ArrayList<ModelListener<ConnectionActionTypes>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ConnectionActionTypes>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		connectionActionTypesToConnectionConfigsTableMapper = TableMapperFactory.getTableMapper("CMES_Configs_Actions",
				"connectionActionTypeId", "configId", this,
				connectionConfigsPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ConnectionActionTypesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("CMES_Configs_Actions");
	}

	@BeanReference(type = ConnectionConfigsPersistence.class)
	protected ConnectionConfigsPersistence connectionConfigsPersistence;
	protected TableMapper<ConnectionActionTypes, es.davinciti.liferay.model.ConnectionConfigs> connectionActionTypesToConnectionConfigsTableMapper;
	private static final String _SQL_SELECT_CONNECTIONACTIONTYPES = "SELECT connectionActionTypes FROM ConnectionActionTypes connectionActionTypes";
	private static final String _SQL_COUNT_CONNECTIONACTIONTYPES = "SELECT COUNT(connectionActionTypes) FROM ConnectionActionTypes connectionActionTypes";
	private static final String _ORDER_BY_ENTITY_ALIAS = "connectionActionTypes.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ConnectionActionTypes exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ConnectionActionTypesPersistenceImpl.class);
	private static ConnectionActionTypes _nullConnectionActionTypes = new ConnectionActionTypesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ConnectionActionTypes> toCacheModel() {
				return _nullConnectionActionTypesCacheModel;
			}
		};

	private static CacheModel<ConnectionActionTypes> _nullConnectionActionTypesCacheModel =
		new CacheModel<ConnectionActionTypes>() {
			@Override
			public ConnectionActionTypes toEntityModel() {
				return _nullConnectionActionTypes;
			}
		};
}