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

import es.davinciti.liferay.NoSuchConnectionDataException;
import es.davinciti.liferay.model.ConnectionData;
import es.davinciti.liferay.model.impl.ConnectionDataImpl;
import es.davinciti.liferay.model.impl.ConnectionDataModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the connection data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see ConnectionDataPersistence
 * @see ConnectionDataUtil
 * @generated
 */
public class ConnectionDataPersistenceImpl extends BasePersistenceImpl<ConnectionData>
	implements ConnectionDataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ConnectionDataUtil} to access the connection data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ConnectionDataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ConnectionDataModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDataModelImpl.FINDER_CACHE_ENABLED,
			ConnectionDataImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ConnectionDataModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDataModelImpl.FINDER_CACHE_ENABLED,
			ConnectionDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ConnectionDataModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ConnectionDataPersistenceImpl() {
		setModelClass(ConnectionData.class);
	}

	/**
	 * Caches the connection data in the entity cache if it is enabled.
	 *
	 * @param connectionData the connection data
	 */
	@Override
	public void cacheResult(ConnectionData connectionData) {
		EntityCacheUtil.putResult(ConnectionDataModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDataImpl.class, connectionData.getPrimaryKey(),
			connectionData);

		connectionData.resetOriginalValues();
	}

	/**
	 * Caches the connection datas in the entity cache if it is enabled.
	 *
	 * @param connectionDatas the connection datas
	 */
	@Override
	public void cacheResult(List<ConnectionData> connectionDatas) {
		for (ConnectionData connectionData : connectionDatas) {
			if (EntityCacheUtil.getResult(
						ConnectionDataModelImpl.ENTITY_CACHE_ENABLED,
						ConnectionDataImpl.class, connectionData.getPrimaryKey()) == null) {
				cacheResult(connectionData);
			}
			else {
				connectionData.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all connection datas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ConnectionDataImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ConnectionDataImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the connection data.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ConnectionData connectionData) {
		EntityCacheUtil.removeResult(ConnectionDataModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDataImpl.class, connectionData.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ConnectionData> connectionDatas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ConnectionData connectionData : connectionDatas) {
			EntityCacheUtil.removeResult(ConnectionDataModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionDataImpl.class, connectionData.getPrimaryKey());
		}
	}

	/**
	 * Creates a new connection data with the primary key. Does not add the connection data to the database.
	 *
	 * @param connectionDataId the primary key for the new connection data
	 * @return the new connection data
	 */
	@Override
	public ConnectionData create(long connectionDataId) {
		ConnectionData connectionData = new ConnectionDataImpl();

		connectionData.setNew(true);
		connectionData.setPrimaryKey(connectionDataId);

		return connectionData;
	}

	/**
	 * Removes the connection data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param connectionDataId the primary key of the connection data
	 * @return the connection data that was removed
	 * @throws es.davinciti.liferay.NoSuchConnectionDataException if a connection data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionData remove(long connectionDataId)
		throws NoSuchConnectionDataException, SystemException {
		return remove((Serializable)connectionDataId);
	}

	/**
	 * Removes the connection data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the connection data
	 * @return the connection data that was removed
	 * @throws es.davinciti.liferay.NoSuchConnectionDataException if a connection data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionData remove(Serializable primaryKey)
		throws NoSuchConnectionDataException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ConnectionData connectionData = (ConnectionData)session.get(ConnectionDataImpl.class,
					primaryKey);

			if (connectionData == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchConnectionDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(connectionData);
		}
		catch (NoSuchConnectionDataException nsee) {
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
	protected ConnectionData removeImpl(ConnectionData connectionData)
		throws SystemException {
		connectionData = toUnwrappedModel(connectionData);

		connectionDataToConnectionConfigsTableMapper.deleteLeftPrimaryKeyTableMappings(connectionData.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(connectionData)) {
				connectionData = (ConnectionData)session.get(ConnectionDataImpl.class,
						connectionData.getPrimaryKeyObj());
			}

			if (connectionData != null) {
				session.delete(connectionData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (connectionData != null) {
			clearCache(connectionData);
		}

		return connectionData;
	}

	@Override
	public ConnectionData updateImpl(
		es.davinciti.liferay.model.ConnectionData connectionData)
		throws SystemException {
		connectionData = toUnwrappedModel(connectionData);

		boolean isNew = connectionData.isNew();

		Session session = null;

		try {
			session = openSession();

			if (connectionData.isNew()) {
				session.save(connectionData);

				connectionData.setNew(false);
			}
			else {
				session.merge(connectionData);
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

		EntityCacheUtil.putResult(ConnectionDataModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDataImpl.class, connectionData.getPrimaryKey(),
			connectionData);

		return connectionData;
	}

	protected ConnectionData toUnwrappedModel(ConnectionData connectionData) {
		if (connectionData instanceof ConnectionDataImpl) {
			return connectionData;
		}

		ConnectionDataImpl connectionDataImpl = new ConnectionDataImpl();

		connectionDataImpl.setNew(connectionData.isNew());
		connectionDataImpl.setPrimaryKey(connectionData.getPrimaryKey());

		connectionDataImpl.setConnectionDataId(connectionData.getConnectionDataId());
		connectionDataImpl.setCompanyDB(connectionData.getCompanyDB());
		connectionDataImpl.setUsername(connectionData.getUsername());
		connectionDataImpl.setPassword(connectionData.getPassword());
		connectionDataImpl.setUrl(connectionData.getUrl());
		connectionDataImpl.setServer(connectionData.getServer());
		connectionDataImpl.setPort(connectionData.getPort());
		connectionDataImpl.setAccessToken(connectionData.getAccessToken());
		connectionDataImpl.setRefreshToken(connectionData.getRefreshToken());
		connectionDataImpl.setDisableDate(connectionData.getDisableDate());
		connectionDataImpl.setSecretKey(connectionData.getSecretKey());
		connectionDataImpl.setApplicationToken(connectionData.getApplicationToken());
		connectionDataImpl.setClientId(connectionData.getClientId());
		connectionDataImpl.setTokenType(connectionData.getTokenType());
		connectionDataImpl.setExpiresIn(connectionData.getExpiresIn());
		connectionDataImpl.setScope(connectionData.getScope());
		connectionDataImpl.setClavePrimaria(connectionData.getClavePrimaria());
		connectionDataImpl.setClaveSecundaria(connectionData.getClaveSecundaria());
		connectionDataImpl.setSessionId(connectionData.getSessionId());
		connectionDataImpl.setEncodedClientCredentials(connectionData.getEncodedClientCredentials());
		connectionDataImpl.setState(connectionData.getState());
		connectionDataImpl.setWebSecretKey(connectionData.getWebSecretKey());
		connectionDataImpl.setApplicationCode(connectionData.getApplicationCode());

		return connectionDataImpl;
	}

	/**
	 * Returns the connection data with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the connection data
	 * @return the connection data
	 * @throws es.davinciti.liferay.NoSuchConnectionDataException if a connection data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionData findByPrimaryKey(Serializable primaryKey)
		throws NoSuchConnectionDataException, SystemException {
		ConnectionData connectionData = fetchByPrimaryKey(primaryKey);

		if (connectionData == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchConnectionDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return connectionData;
	}

	/**
	 * Returns the connection data with the primary key or throws a {@link es.davinciti.liferay.NoSuchConnectionDataException} if it could not be found.
	 *
	 * @param connectionDataId the primary key of the connection data
	 * @return the connection data
	 * @throws es.davinciti.liferay.NoSuchConnectionDataException if a connection data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionData findByPrimaryKey(long connectionDataId)
		throws NoSuchConnectionDataException, SystemException {
		return findByPrimaryKey((Serializable)connectionDataId);
	}

	/**
	 * Returns the connection data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the connection data
	 * @return the connection data, or <code>null</code> if a connection data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionData fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ConnectionData connectionData = (ConnectionData)EntityCacheUtil.getResult(ConnectionDataModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionDataImpl.class, primaryKey);

		if (connectionData == _nullConnectionData) {
			return null;
		}

		if (connectionData == null) {
			Session session = null;

			try {
				session = openSession();

				connectionData = (ConnectionData)session.get(ConnectionDataImpl.class,
						primaryKey);

				if (connectionData != null) {
					cacheResult(connectionData);
				}
				else {
					EntityCacheUtil.putResult(ConnectionDataModelImpl.ENTITY_CACHE_ENABLED,
						ConnectionDataImpl.class, primaryKey,
						_nullConnectionData);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ConnectionDataModelImpl.ENTITY_CACHE_ENABLED,
					ConnectionDataImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return connectionData;
	}

	/**
	 * Returns the connection data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param connectionDataId the primary key of the connection data
	 * @return the connection data, or <code>null</code> if a connection data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionData fetchByPrimaryKey(long connectionDataId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)connectionDataId);
	}

	/**
	 * Returns all the connection datas.
	 *
	 * @return the connection datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConnectionData> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<ConnectionData> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the connection datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of connection datas
	 * @param end the upper bound of the range of connection datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of connection datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConnectionData> findAll(int start, int end,
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

		List<ConnectionData> list = (List<ConnectionData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONNECTIONDATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONNECTIONDATA;

				if (pagination) {
					sql = sql.concat(ConnectionDataModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ConnectionData>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ConnectionData>(list);
				}
				else {
					list = (List<ConnectionData>)QueryUtil.list(q,
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
	 * Removes all the connection datas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ConnectionData connectionData : findAll()) {
			remove(connectionData);
		}
	}

	/**
	 * Returns the number of connection datas.
	 *
	 * @return the number of connection datas
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

				Query q = session.createQuery(_SQL_COUNT_CONNECTIONDATA);

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
	 * Returns all the connection configses associated with the connection data.
	 *
	 * @param pk the primary key of the connection data
	 * @return the connection configses associated with the connection data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk) throws SystemException {
		return getConnectionConfigses(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the connection configses associated with the connection data.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the connection data
	 * @param start the lower bound of the range of connection datas
	 * @param end the upper bound of the range of connection datas (not inclusive)
	 * @return the range of connection configses associated with the connection data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk, int start, int end) throws SystemException {
		return getConnectionConfigses(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the connection configses associated with the connection data.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the connection data
	 * @param start the lower bound of the range of connection datas
	 * @param end the upper bound of the range of connection datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of connection configses associated with the connection data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return connectionDataToConnectionConfigsTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of connection configses associated with the connection data.
	 *
	 * @param pk the primary key of the connection data
	 * @return the number of connection configses associated with the connection data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getConnectionConfigsesSize(long pk) throws SystemException {
		long[] pks = connectionDataToConnectionConfigsTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the connection configs is associated with the connection data.
	 *
	 * @param pk the primary key of the connection data
	 * @param connectionConfigsPK the primary key of the connection configs
	 * @return <code>true</code> if the connection configs is associated with the connection data; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsConnectionConfigs(long pk, long connectionConfigsPK)
		throws SystemException {
		return connectionDataToConnectionConfigsTableMapper.containsTableMapping(pk,
			connectionConfigsPK);
	}

	/**
	 * Returns <code>true</code> if the connection data has any connection configses associated with it.
	 *
	 * @param pk the primary key of the connection data to check for associations with connection configses
	 * @return <code>true</code> if the connection data has any connection configses associated with it; <code>false</code> otherwise
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
	 * Adds an association between the connection data and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection data
	 * @param connectionConfigsPK the primary key of the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionConfigs(long pk, long connectionConfigsPK)
		throws SystemException {
		connectionDataToConnectionConfigsTableMapper.addTableMapping(pk,
			connectionConfigsPK);
	}

	/**
	 * Adds an association between the connection data and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection data
	 * @param connectionConfigs the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionConfigs(long pk,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws SystemException {
		connectionDataToConnectionConfigsTableMapper.addTableMapping(pk,
			connectionConfigs.getPrimaryKey());
	}

	/**
	 * Adds an association between the connection data and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection data
	 * @param connectionConfigsPKs the primary keys of the connection configses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionConfigses(long pk, long[] connectionConfigsPKs)
		throws SystemException {
		for (long connectionConfigsPK : connectionConfigsPKs) {
			connectionDataToConnectionConfigsTableMapper.addTableMapping(pk,
				connectionConfigsPK);
		}
	}

	/**
	 * Adds an association between the connection data and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection data
	 * @param connectionConfigses the connection configses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionConfigses(long pk,
		List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses)
		throws SystemException {
		for (es.davinciti.liferay.model.ConnectionConfigs connectionConfigs : connectionConfigses) {
			connectionDataToConnectionConfigsTableMapper.addTableMapping(pk,
				connectionConfigs.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the connection data and its connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection data to clear the associated connection configses from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearConnectionConfigses(long pk) throws SystemException {
		connectionDataToConnectionConfigsTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the connection data and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection data
	 * @param connectionConfigsPK the primary key of the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionConfigs(long pk, long connectionConfigsPK)
		throws SystemException {
		connectionDataToConnectionConfigsTableMapper.deleteTableMapping(pk,
			connectionConfigsPK);
	}

	/**
	 * Removes the association between the connection data and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection data
	 * @param connectionConfigs the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionConfigs(long pk,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws SystemException {
		connectionDataToConnectionConfigsTableMapper.deleteTableMapping(pk,
			connectionConfigs.getPrimaryKey());
	}

	/**
	 * Removes the association between the connection data and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection data
	 * @param connectionConfigsPKs the primary keys of the connection configses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionConfigses(long pk, long[] connectionConfigsPKs)
		throws SystemException {
		for (long connectionConfigsPK : connectionConfigsPKs) {
			connectionDataToConnectionConfigsTableMapper.deleteTableMapping(pk,
				connectionConfigsPK);
		}
	}

	/**
	 * Removes the association between the connection data and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection data
	 * @param connectionConfigses the connection configses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionConfigses(long pk,
		List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses)
		throws SystemException {
		for (es.davinciti.liferay.model.ConnectionConfigs connectionConfigs : connectionConfigses) {
			connectionDataToConnectionConfigsTableMapper.deleteTableMapping(pk,
				connectionConfigs.getPrimaryKey());
		}
	}

	/**
	 * Sets the connection configses associated with the connection data, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection data
	 * @param connectionConfigsPKs the primary keys of the connection configses to be associated with the connection data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setConnectionConfigses(long pk, long[] connectionConfigsPKs)
		throws SystemException {
		Set<Long> newConnectionConfigsPKsSet = SetUtil.fromArray(connectionConfigsPKs);
		Set<Long> oldConnectionConfigsPKsSet = SetUtil.fromArray(connectionDataToConnectionConfigsTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeConnectionConfigsPKsSet = new HashSet<Long>(oldConnectionConfigsPKsSet);

		removeConnectionConfigsPKsSet.removeAll(newConnectionConfigsPKsSet);

		for (long removeConnectionConfigsPK : removeConnectionConfigsPKsSet) {
			connectionDataToConnectionConfigsTableMapper.deleteTableMapping(pk,
				removeConnectionConfigsPK);
		}

		newConnectionConfigsPKsSet.removeAll(oldConnectionConfigsPKsSet);

		for (long newConnectionConfigsPK : newConnectionConfigsPKsSet) {
			connectionDataToConnectionConfigsTableMapper.addTableMapping(pk,
				newConnectionConfigsPK);
		}
	}

	/**
	 * Sets the connection configses associated with the connection data, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection data
	 * @param connectionConfigses the connection configses to be associated with the connection data
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
			FinderCacheUtil.clearCache(ConnectionDataModelImpl.MAPPING_TABLE_CMES_CONFIGS_DATAS_NAME);
		}
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the connection data persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.ConnectionData")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ConnectionData>> listenersList = new ArrayList<ModelListener<ConnectionData>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ConnectionData>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		connectionDataToConnectionConfigsTableMapper = TableMapperFactory.getTableMapper("CMES_Configs_Datas",
				"connectionDataId", "configId", this,
				connectionConfigsPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ConnectionDataImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("CMES_Configs_Datas");
	}

	@BeanReference(type = ConnectionConfigsPersistence.class)
	protected ConnectionConfigsPersistence connectionConfigsPersistence;
	protected TableMapper<ConnectionData, es.davinciti.liferay.model.ConnectionConfigs> connectionDataToConnectionConfigsTableMapper;
	private static final String _SQL_SELECT_CONNECTIONDATA = "SELECT connectionData FROM ConnectionData connectionData";
	private static final String _SQL_COUNT_CONNECTIONDATA = "SELECT COUNT(connectionData) FROM ConnectionData connectionData";
	private static final String _ORDER_BY_ENTITY_ALIAS = "connectionData.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ConnectionData exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ConnectionDataPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"password", "state"
			});
	private static ConnectionData _nullConnectionData = new ConnectionDataImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ConnectionData> toCacheModel() {
				return _nullConnectionDataCacheModel;
			}
		};

	private static CacheModel<ConnectionData> _nullConnectionDataCacheModel = new CacheModel<ConnectionData>() {
			@Override
			public ConnectionData toEntityModel() {
				return _nullConnectionData;
			}
		};
}