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
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import es.davinciti.liferay.NoSuchConnectionConfigsException;
import es.davinciti.liferay.model.ConnectionConfigs;
import es.davinciti.liferay.model.impl.ConnectionConfigsImpl;
import es.davinciti.liferay.model.impl.ConnectionConfigsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the connection configs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see ConnectionConfigsPersistence
 * @see ConnectionConfigsUtil
 * @generated
 */
public class ConnectionConfigsPersistenceImpl extends BasePersistenceImpl<ConnectionConfigs>
	implements ConnectionConfigsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ConnectionConfigsUtil} to access the connection configs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ConnectionConfigsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ConnectionConfigsModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionConfigsModelImpl.FINDER_CACHE_ENABLED,
			ConnectionConfigsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ConnectionConfigsModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionConfigsModelImpl.FINDER_CACHE_ENABLED,
			ConnectionConfigsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ConnectionConfigsModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionConfigsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(ConnectionConfigsModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionConfigsModelImpl.FINDER_CACHE_ENABLED,
			ConnectionConfigsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(ConnectionConfigsModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionConfigsModelImpl.FINDER_CACHE_ENABLED,
			ConnectionConfigsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			ConnectionConfigsModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(ConnectionConfigsModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionConfigsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the connection configses where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching connection configses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConnectionConfigs> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

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
	@Override
	public List<ConnectionConfigs> findByCompanyId(long companyId, int start,
		int end) throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

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
	@Override
	public List<ConnectionConfigs> findByCompanyId(long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<ConnectionConfigs> list = (List<ConnectionConfigs>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ConnectionConfigs connectionConfigs : list) {
				if ((companyId != connectionConfigs.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CONNECTIONCONFIGS_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ConnectionConfigsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<ConnectionConfigs>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ConnectionConfigs>(list);
				}
				else {
					list = (List<ConnectionConfigs>)QueryUtil.list(q,
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
	 * Returns the first connection configs in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection configs
	 * @throws es.davinciti.liferay.NoSuchConnectionConfigsException if a matching connection configs could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionConfigs findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchConnectionConfigsException, SystemException {
		ConnectionConfigs connectionConfigs = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (connectionConfigs != null) {
			return connectionConfigs;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConnectionConfigsException(msg.toString());
	}

	/**
	 * Returns the first connection configs in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection configs, or <code>null</code> if a matching connection configs could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionConfigs fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ConnectionConfigs> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last connection configs in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection configs
	 * @throws es.davinciti.liferay.NoSuchConnectionConfigsException if a matching connection configs could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionConfigs findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchConnectionConfigsException, SystemException {
		ConnectionConfigs connectionConfigs = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (connectionConfigs != null) {
			return connectionConfigs;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConnectionConfigsException(msg.toString());
	}

	/**
	 * Returns the last connection configs in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection configs, or <code>null</code> if a matching connection configs could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionConfigs fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<ConnectionConfigs> list = findByCompanyId(companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public ConnectionConfigs[] findByCompanyId_PrevAndNext(long configId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchConnectionConfigsException, SystemException {
		ConnectionConfigs connectionConfigs = findByPrimaryKey(configId);

		Session session = null;

		try {
			session = openSession();

			ConnectionConfigs[] array = new ConnectionConfigsImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, connectionConfigs,
					companyId, orderByComparator, true);

			array[1] = connectionConfigs;

			array[2] = getByCompanyId_PrevAndNext(session, connectionConfigs,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConnectionConfigs getByCompanyId_PrevAndNext(Session session,
		ConnectionConfigs connectionConfigs, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONNECTIONCONFIGS_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ConnectionConfigsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(connectionConfigs);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ConnectionConfigs> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connection configses where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (ConnectionConfigs connectionConfigs : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(connectionConfigs);
		}
	}

	/**
	 * Returns the number of connection configses where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching connection configses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCompanyId(long companyId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONNECTIONCONFIGS_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "connectionConfigs.companyId = ?";

	public ConnectionConfigsPersistenceImpl() {
		setModelClass(ConnectionConfigs.class);
	}

	/**
	 * Caches the connection configs in the entity cache if it is enabled.
	 *
	 * @param connectionConfigs the connection configs
	 */
	@Override
	public void cacheResult(ConnectionConfigs connectionConfigs) {
		EntityCacheUtil.putResult(ConnectionConfigsModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionConfigsImpl.class, connectionConfigs.getPrimaryKey(),
			connectionConfigs);

		connectionConfigs.resetOriginalValues();
	}

	/**
	 * Caches the connection configses in the entity cache if it is enabled.
	 *
	 * @param connectionConfigses the connection configses
	 */
	@Override
	public void cacheResult(List<ConnectionConfigs> connectionConfigses) {
		for (ConnectionConfigs connectionConfigs : connectionConfigses) {
			if (EntityCacheUtil.getResult(
						ConnectionConfigsModelImpl.ENTITY_CACHE_ENABLED,
						ConnectionConfigsImpl.class,
						connectionConfigs.getPrimaryKey()) == null) {
				cacheResult(connectionConfigs);
			}
			else {
				connectionConfigs.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all connection configses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ConnectionConfigsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ConnectionConfigsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the connection configs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ConnectionConfigs connectionConfigs) {
		EntityCacheUtil.removeResult(ConnectionConfigsModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionConfigsImpl.class, connectionConfigs.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ConnectionConfigs> connectionConfigses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ConnectionConfigs connectionConfigs : connectionConfigses) {
			EntityCacheUtil.removeResult(ConnectionConfigsModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionConfigsImpl.class, connectionConfigs.getPrimaryKey());
		}
	}

	/**
	 * Creates a new connection configs with the primary key. Does not add the connection configs to the database.
	 *
	 * @param configId the primary key for the new connection configs
	 * @return the new connection configs
	 */
	@Override
	public ConnectionConfigs create(long configId) {
		ConnectionConfigs connectionConfigs = new ConnectionConfigsImpl();

		connectionConfigs.setNew(true);
		connectionConfigs.setPrimaryKey(configId);

		return connectionConfigs;
	}

	/**
	 * Removes the connection configs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param configId the primary key of the connection configs
	 * @return the connection configs that was removed
	 * @throws es.davinciti.liferay.NoSuchConnectionConfigsException if a connection configs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionConfigs remove(long configId)
		throws NoSuchConnectionConfigsException, SystemException {
		return remove((Serializable)configId);
	}

	/**
	 * Removes the connection configs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the connection configs
	 * @return the connection configs that was removed
	 * @throws es.davinciti.liferay.NoSuchConnectionConfigsException if a connection configs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionConfigs remove(Serializable primaryKey)
		throws NoSuchConnectionConfigsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ConnectionConfigs connectionConfigs = (ConnectionConfigs)session.get(ConnectionConfigsImpl.class,
					primaryKey);

			if (connectionConfigs == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchConnectionConfigsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(connectionConfigs);
		}
		catch (NoSuchConnectionConfigsException nsee) {
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
	protected ConnectionConfigs removeImpl(ConnectionConfigs connectionConfigs)
		throws SystemException {
		connectionConfigs = toUnwrappedModel(connectionConfigs);

		connectionConfigsToConnectionTypesTableMapper.deleteLeftPrimaryKeyTableMappings(connectionConfigs.getPrimaryKey());

		connectionConfigsToConnectionActionTypesTableMapper.deleteLeftPrimaryKeyTableMappings(connectionConfigs.getPrimaryKey());

		connectionConfigsToConnectionDataTableMapper.deleteLeftPrimaryKeyTableMappings(connectionConfigs.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(connectionConfigs)) {
				connectionConfigs = (ConnectionConfigs)session.get(ConnectionConfigsImpl.class,
						connectionConfigs.getPrimaryKeyObj());
			}

			if (connectionConfigs != null) {
				session.delete(connectionConfigs);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (connectionConfigs != null) {
			clearCache(connectionConfigs);
		}

		return connectionConfigs;
	}

	@Override
	public ConnectionConfigs updateImpl(
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws SystemException {
		connectionConfigs = toUnwrappedModel(connectionConfigs);

		boolean isNew = connectionConfigs.isNew();

		ConnectionConfigsModelImpl connectionConfigsModelImpl = (ConnectionConfigsModelImpl)connectionConfigs;

		Session session = null;

		try {
			session = openSession();

			if (connectionConfigs.isNew()) {
				session.save(connectionConfigs);

				connectionConfigs.setNew(false);
			}
			else {
				session.merge(connectionConfigs);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ConnectionConfigsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((connectionConfigsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						connectionConfigsModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { connectionConfigsModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}
		}

		EntityCacheUtil.putResult(ConnectionConfigsModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionConfigsImpl.class, connectionConfigs.getPrimaryKey(),
			connectionConfigs);

		return connectionConfigs;
	}

	protected ConnectionConfigs toUnwrappedModel(
		ConnectionConfigs connectionConfigs) {
		if (connectionConfigs instanceof ConnectionConfigsImpl) {
			return connectionConfigs;
		}

		ConnectionConfigsImpl connectionConfigsImpl = new ConnectionConfigsImpl();

		connectionConfigsImpl.setNew(connectionConfigs.isNew());
		connectionConfigsImpl.setPrimaryKey(connectionConfigs.getPrimaryKey());

		connectionConfigsImpl.setConfigId(connectionConfigs.getConfigId());
		connectionConfigsImpl.setCompanyId(connectionConfigs.getCompanyId());
		connectionConfigsImpl.setInstallationId(connectionConfigs.getInstallationId());
		connectionConfigsImpl.setCompanyCode(connectionConfigs.getCompanyCode());
		connectionConfigsImpl.setProductCode(connectionConfigs.getProductCode());
		connectionConfigsImpl.setDisableDate(connectionConfigs.getDisableDate());

		return connectionConfigsImpl;
	}

	/**
	 * Returns the connection configs with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the connection configs
	 * @return the connection configs
	 * @throws es.davinciti.liferay.NoSuchConnectionConfigsException if a connection configs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionConfigs findByPrimaryKey(Serializable primaryKey)
		throws NoSuchConnectionConfigsException, SystemException {
		ConnectionConfigs connectionConfigs = fetchByPrimaryKey(primaryKey);

		if (connectionConfigs == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchConnectionConfigsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return connectionConfigs;
	}

	/**
	 * Returns the connection configs with the primary key or throws a {@link es.davinciti.liferay.NoSuchConnectionConfigsException} if it could not be found.
	 *
	 * @param configId the primary key of the connection configs
	 * @return the connection configs
	 * @throws es.davinciti.liferay.NoSuchConnectionConfigsException if a connection configs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionConfigs findByPrimaryKey(long configId)
		throws NoSuchConnectionConfigsException, SystemException {
		return findByPrimaryKey((Serializable)configId);
	}

	/**
	 * Returns the connection configs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the connection configs
	 * @return the connection configs, or <code>null</code> if a connection configs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionConfigs fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ConnectionConfigs connectionConfigs = (ConnectionConfigs)EntityCacheUtil.getResult(ConnectionConfigsModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionConfigsImpl.class, primaryKey);

		if (connectionConfigs == _nullConnectionConfigs) {
			return null;
		}

		if (connectionConfigs == null) {
			Session session = null;

			try {
				session = openSession();

				connectionConfigs = (ConnectionConfigs)session.get(ConnectionConfigsImpl.class,
						primaryKey);

				if (connectionConfigs != null) {
					cacheResult(connectionConfigs);
				}
				else {
					EntityCacheUtil.putResult(ConnectionConfigsModelImpl.ENTITY_CACHE_ENABLED,
						ConnectionConfigsImpl.class, primaryKey,
						_nullConnectionConfigs);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ConnectionConfigsModelImpl.ENTITY_CACHE_ENABLED,
					ConnectionConfigsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return connectionConfigs;
	}

	/**
	 * Returns the connection configs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param configId the primary key of the connection configs
	 * @return the connection configs, or <code>null</code> if a connection configs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConnectionConfigs fetchByPrimaryKey(long configId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)configId);
	}

	/**
	 * Returns all the connection configses.
	 *
	 * @return the connection configses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConnectionConfigs> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ConnectionConfigs> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<ConnectionConfigs> findAll(int start, int end,
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

		List<ConnectionConfigs> list = (List<ConnectionConfigs>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONNECTIONCONFIGS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONNECTIONCONFIGS;

				if (pagination) {
					sql = sql.concat(ConnectionConfigsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ConnectionConfigs>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ConnectionConfigs>(list);
				}
				else {
					list = (List<ConnectionConfigs>)QueryUtil.list(q,
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
	 * Removes all the connection configses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ConnectionConfigs connectionConfigs : findAll()) {
			remove(connectionConfigs);
		}
	}

	/**
	 * Returns the number of connection configses.
	 *
	 * @return the number of connection configses
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

				Query q = session.createQuery(_SQL_COUNT_CONNECTIONCONFIGS);

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
	 * Returns all the connection typeses associated with the connection configs.
	 *
	 * @param pk the primary key of the connection configs
	 * @return the connection typeses associated with the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.ConnectionTypes> getConnectionTypeses(
		long pk) throws SystemException {
		return getConnectionTypeses(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

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
	@Override
	public List<es.davinciti.liferay.model.ConnectionTypes> getConnectionTypeses(
		long pk, int start, int end) throws SystemException {
		return getConnectionTypeses(pk, start, end, null);
	}

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
	@Override
	public List<es.davinciti.liferay.model.ConnectionTypes> getConnectionTypeses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return connectionConfigsToConnectionTypesTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of connection typeses associated with the connection configs.
	 *
	 * @param pk the primary key of the connection configs
	 * @return the number of connection typeses associated with the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getConnectionTypesesSize(long pk) throws SystemException {
		long[] pks = connectionConfigsToConnectionTypesTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the connection types is associated with the connection configs.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionTypesPK the primary key of the connection types
	 * @return <code>true</code> if the connection types is associated with the connection configs; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsConnectionTypes(long pk, long connectionTypesPK)
		throws SystemException {
		return connectionConfigsToConnectionTypesTableMapper.containsTableMapping(pk,
			connectionTypesPK);
	}

	/**
	 * Returns <code>true</code> if the connection configs has any connection typeses associated with it.
	 *
	 * @param pk the primary key of the connection configs to check for associations with connection typeses
	 * @return <code>true</code> if the connection configs has any connection typeses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsConnectionTypeses(long pk) throws SystemException {
		if (getConnectionTypesesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the connection configs and the connection types. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionTypesPK the primary key of the connection types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionTypes(long pk, long connectionTypesPK)
		throws SystemException {
		connectionConfigsToConnectionTypesTableMapper.addTableMapping(pk,
			connectionTypesPK);
	}

	/**
	 * Adds an association between the connection configs and the connection types. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionTypes the connection types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionTypes(long pk,
		es.davinciti.liferay.model.ConnectionTypes connectionTypes)
		throws SystemException {
		connectionConfigsToConnectionTypesTableMapper.addTableMapping(pk,
			connectionTypes.getPrimaryKey());
	}

	/**
	 * Adds an association between the connection configs and the connection typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionTypesPKs the primary keys of the connection typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionTypeses(long pk, long[] connectionTypesPKs)
		throws SystemException {
		for (long connectionTypesPK : connectionTypesPKs) {
			connectionConfigsToConnectionTypesTableMapper.addTableMapping(pk,
				connectionTypesPK);
		}
	}

	/**
	 * Adds an association between the connection configs and the connection typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionTypeses the connection typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionTypeses(long pk,
		List<es.davinciti.liferay.model.ConnectionTypes> connectionTypeses)
		throws SystemException {
		for (es.davinciti.liferay.model.ConnectionTypes connectionTypes : connectionTypeses) {
			connectionConfigsToConnectionTypesTableMapper.addTableMapping(pk,
				connectionTypes.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the connection configs and its connection typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs to clear the associated connection typeses from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearConnectionTypeses(long pk) throws SystemException {
		connectionConfigsToConnectionTypesTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the connection configs and the connection types. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionTypesPK the primary key of the connection types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionTypes(long pk, long connectionTypesPK)
		throws SystemException {
		connectionConfigsToConnectionTypesTableMapper.deleteTableMapping(pk,
			connectionTypesPK);
	}

	/**
	 * Removes the association between the connection configs and the connection types. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionTypes the connection types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionTypes(long pk,
		es.davinciti.liferay.model.ConnectionTypes connectionTypes)
		throws SystemException {
		connectionConfigsToConnectionTypesTableMapper.deleteTableMapping(pk,
			connectionTypes.getPrimaryKey());
	}

	/**
	 * Removes the association between the connection configs and the connection typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionTypesPKs the primary keys of the connection typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionTypeses(long pk, long[] connectionTypesPKs)
		throws SystemException {
		for (long connectionTypesPK : connectionTypesPKs) {
			connectionConfigsToConnectionTypesTableMapper.deleteTableMapping(pk,
				connectionTypesPK);
		}
	}

	/**
	 * Removes the association between the connection configs and the connection typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionTypeses the connection typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionTypeses(long pk,
		List<es.davinciti.liferay.model.ConnectionTypes> connectionTypeses)
		throws SystemException {
		for (es.davinciti.liferay.model.ConnectionTypes connectionTypes : connectionTypeses) {
			connectionConfigsToConnectionTypesTableMapper.deleteTableMapping(pk,
				connectionTypes.getPrimaryKey());
		}
	}

	/**
	 * Sets the connection typeses associated with the connection configs, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionTypesPKs the primary keys of the connection typeses to be associated with the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setConnectionTypeses(long pk, long[] connectionTypesPKs)
		throws SystemException {
		Set<Long> newConnectionTypesPKsSet = SetUtil.fromArray(connectionTypesPKs);
		Set<Long> oldConnectionTypesPKsSet = SetUtil.fromArray(connectionConfigsToConnectionTypesTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeConnectionTypesPKsSet = new HashSet<Long>(oldConnectionTypesPKsSet);

		removeConnectionTypesPKsSet.removeAll(newConnectionTypesPKsSet);

		for (long removeConnectionTypesPK : removeConnectionTypesPKsSet) {
			connectionConfigsToConnectionTypesTableMapper.deleteTableMapping(pk,
				removeConnectionTypesPK);
		}

		newConnectionTypesPKsSet.removeAll(oldConnectionTypesPKsSet);

		for (long newConnectionTypesPK : newConnectionTypesPKsSet) {
			connectionConfigsToConnectionTypesTableMapper.addTableMapping(pk,
				newConnectionTypesPK);
		}
	}

	/**
	 * Sets the connection typeses associated with the connection configs, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionTypeses the connection typeses to be associated with the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setConnectionTypeses(long pk,
		List<es.davinciti.liferay.model.ConnectionTypes> connectionTypeses)
		throws SystemException {
		try {
			long[] connectionTypesPKs = new long[connectionTypeses.size()];

			for (int i = 0; i < connectionTypeses.size(); i++) {
				es.davinciti.liferay.model.ConnectionTypes connectionTypes = connectionTypeses.get(i);

				connectionTypesPKs[i] = connectionTypes.getPrimaryKey();
			}

			setConnectionTypeses(pk, connectionTypesPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(ConnectionConfigsModelImpl.MAPPING_TABLE_CMES_CONFIGS_TYPES_NAME);
		}
	}

	/**
	 * Returns all the connection action typeses associated with the connection configs.
	 *
	 * @param pk the primary key of the connection configs
	 * @return the connection action typeses associated with the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.ConnectionActionTypes> getConnectionActionTypeses(
		long pk) throws SystemException {
		return getConnectionActionTypeses(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

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
	@Override
	public List<es.davinciti.liferay.model.ConnectionActionTypes> getConnectionActionTypeses(
		long pk, int start, int end) throws SystemException {
		return getConnectionActionTypeses(pk, start, end, null);
	}

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
	@Override
	public List<es.davinciti.liferay.model.ConnectionActionTypes> getConnectionActionTypeses(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return connectionConfigsToConnectionActionTypesTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of connection action typeses associated with the connection configs.
	 *
	 * @param pk the primary key of the connection configs
	 * @return the number of connection action typeses associated with the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getConnectionActionTypesesSize(long pk)
		throws SystemException {
		long[] pks = connectionConfigsToConnectionActionTypesTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the connection action types is associated with the connection configs.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionActionTypesPK the primary key of the connection action types
	 * @return <code>true</code> if the connection action types is associated with the connection configs; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsConnectionActionTypes(long pk,
		long connectionActionTypesPK) throws SystemException {
		return connectionConfigsToConnectionActionTypesTableMapper.containsTableMapping(pk,
			connectionActionTypesPK);
	}

	/**
	 * Returns <code>true</code> if the connection configs has any connection action typeses associated with it.
	 *
	 * @param pk the primary key of the connection configs to check for associations with connection action typeses
	 * @return <code>true</code> if the connection configs has any connection action typeses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsConnectionActionTypeses(long pk)
		throws SystemException {
		if (getConnectionActionTypesesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the connection configs and the connection action types. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionActionTypesPK the primary key of the connection action types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionActionTypes(long pk, long connectionActionTypesPK)
		throws SystemException {
		connectionConfigsToConnectionActionTypesTableMapper.addTableMapping(pk,
			connectionActionTypesPK);
	}

	/**
	 * Adds an association between the connection configs and the connection action types. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionActionTypes the connection action types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionActionTypes(long pk,
		es.davinciti.liferay.model.ConnectionActionTypes connectionActionTypes)
		throws SystemException {
		connectionConfigsToConnectionActionTypesTableMapper.addTableMapping(pk,
			connectionActionTypes.getPrimaryKey());
	}

	/**
	 * Adds an association between the connection configs and the connection action typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionActionTypesPKs the primary keys of the connection action typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionActionTypeses(long pk,
		long[] connectionActionTypesPKs) throws SystemException {
		for (long connectionActionTypesPK : connectionActionTypesPKs) {
			connectionConfigsToConnectionActionTypesTableMapper.addTableMapping(pk,
				connectionActionTypesPK);
		}
	}

	/**
	 * Adds an association between the connection configs and the connection action typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionActionTypeses the connection action typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionActionTypeses(long pk,
		List<es.davinciti.liferay.model.ConnectionActionTypes> connectionActionTypeses)
		throws SystemException {
		for (es.davinciti.liferay.model.ConnectionActionTypes connectionActionTypes : connectionActionTypeses) {
			connectionConfigsToConnectionActionTypesTableMapper.addTableMapping(pk,
				connectionActionTypes.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the connection configs and its connection action typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs to clear the associated connection action typeses from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearConnectionActionTypeses(long pk) throws SystemException {
		connectionConfigsToConnectionActionTypesTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the connection configs and the connection action types. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionActionTypesPK the primary key of the connection action types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionActionTypes(long pk,
		long connectionActionTypesPK) throws SystemException {
		connectionConfigsToConnectionActionTypesTableMapper.deleteTableMapping(pk,
			connectionActionTypesPK);
	}

	/**
	 * Removes the association between the connection configs and the connection action types. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionActionTypes the connection action types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionActionTypes(long pk,
		es.davinciti.liferay.model.ConnectionActionTypes connectionActionTypes)
		throws SystemException {
		connectionConfigsToConnectionActionTypesTableMapper.deleteTableMapping(pk,
			connectionActionTypes.getPrimaryKey());
	}

	/**
	 * Removes the association between the connection configs and the connection action typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionActionTypesPKs the primary keys of the connection action typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionActionTypeses(long pk,
		long[] connectionActionTypesPKs) throws SystemException {
		for (long connectionActionTypesPK : connectionActionTypesPKs) {
			connectionConfigsToConnectionActionTypesTableMapper.deleteTableMapping(pk,
				connectionActionTypesPK);
		}
	}

	/**
	 * Removes the association between the connection configs and the connection action typeses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionActionTypeses the connection action typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionActionTypeses(long pk,
		List<es.davinciti.liferay.model.ConnectionActionTypes> connectionActionTypeses)
		throws SystemException {
		for (es.davinciti.liferay.model.ConnectionActionTypes connectionActionTypes : connectionActionTypeses) {
			connectionConfigsToConnectionActionTypesTableMapper.deleteTableMapping(pk,
				connectionActionTypes.getPrimaryKey());
		}
	}

	/**
	 * Sets the connection action typeses associated with the connection configs, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionActionTypesPKs the primary keys of the connection action typeses to be associated with the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setConnectionActionTypeses(long pk,
		long[] connectionActionTypesPKs) throws SystemException {
		Set<Long> newConnectionActionTypesPKsSet = SetUtil.fromArray(connectionActionTypesPKs);
		Set<Long> oldConnectionActionTypesPKsSet = SetUtil.fromArray(connectionConfigsToConnectionActionTypesTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeConnectionActionTypesPKsSet = new HashSet<Long>(oldConnectionActionTypesPKsSet);

		removeConnectionActionTypesPKsSet.removeAll(newConnectionActionTypesPKsSet);

		for (long removeConnectionActionTypesPK : removeConnectionActionTypesPKsSet) {
			connectionConfigsToConnectionActionTypesTableMapper.deleteTableMapping(pk,
				removeConnectionActionTypesPK);
		}

		newConnectionActionTypesPKsSet.removeAll(oldConnectionActionTypesPKsSet);

		for (long newConnectionActionTypesPK : newConnectionActionTypesPKsSet) {
			connectionConfigsToConnectionActionTypesTableMapper.addTableMapping(pk,
				newConnectionActionTypesPK);
		}
	}

	/**
	 * Sets the connection action typeses associated with the connection configs, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionActionTypeses the connection action typeses to be associated with the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setConnectionActionTypeses(long pk,
		List<es.davinciti.liferay.model.ConnectionActionTypes> connectionActionTypeses)
		throws SystemException {
		try {
			long[] connectionActionTypesPKs = new long[connectionActionTypeses.size()];

			for (int i = 0; i < connectionActionTypeses.size(); i++) {
				es.davinciti.liferay.model.ConnectionActionTypes connectionActionTypes =
					connectionActionTypeses.get(i);

				connectionActionTypesPKs[i] = connectionActionTypes.getPrimaryKey();
			}

			setConnectionActionTypeses(pk, connectionActionTypesPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(ConnectionConfigsModelImpl.MAPPING_TABLE_CMES_CONFIGS_ACTIONS_NAME);
		}
	}

	/**
	 * Returns all the connection datas associated with the connection configs.
	 *
	 * @param pk the primary key of the connection configs
	 * @return the connection datas associated with the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.ConnectionData> getConnectionDatas(
		long pk) throws SystemException {
		return getConnectionDatas(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

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
	@Override
	public List<es.davinciti.liferay.model.ConnectionData> getConnectionDatas(
		long pk, int start, int end) throws SystemException {
		return getConnectionDatas(pk, start, end, null);
	}

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
	@Override
	public List<es.davinciti.liferay.model.ConnectionData> getConnectionDatas(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return connectionConfigsToConnectionDataTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of connection datas associated with the connection configs.
	 *
	 * @param pk the primary key of the connection configs
	 * @return the number of connection datas associated with the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getConnectionDatasSize(long pk) throws SystemException {
		long[] pks = connectionConfigsToConnectionDataTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the connection data is associated with the connection configs.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionDataPK the primary key of the connection data
	 * @return <code>true</code> if the connection data is associated with the connection configs; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsConnectionData(long pk, long connectionDataPK)
		throws SystemException {
		return connectionConfigsToConnectionDataTableMapper.containsTableMapping(pk,
			connectionDataPK);
	}

	/**
	 * Returns <code>true</code> if the connection configs has any connection datas associated with it.
	 *
	 * @param pk the primary key of the connection configs to check for associations with connection datas
	 * @return <code>true</code> if the connection configs has any connection datas associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsConnectionDatas(long pk) throws SystemException {
		if (getConnectionDatasSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the connection configs and the connection data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionDataPK the primary key of the connection data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionData(long pk, long connectionDataPK)
		throws SystemException {
		connectionConfigsToConnectionDataTableMapper.addTableMapping(pk,
			connectionDataPK);
	}

	/**
	 * Adds an association between the connection configs and the connection data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionData the connection data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionData(long pk,
		es.davinciti.liferay.model.ConnectionData connectionData)
		throws SystemException {
		connectionConfigsToConnectionDataTableMapper.addTableMapping(pk,
			connectionData.getPrimaryKey());
	}

	/**
	 * Adds an association between the connection configs and the connection datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionDataPKs the primary keys of the connection datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionDatas(long pk, long[] connectionDataPKs)
		throws SystemException {
		for (long connectionDataPK : connectionDataPKs) {
			connectionConfigsToConnectionDataTableMapper.addTableMapping(pk,
				connectionDataPK);
		}
	}

	/**
	 * Adds an association between the connection configs and the connection datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionDatas the connection datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addConnectionDatas(long pk,
		List<es.davinciti.liferay.model.ConnectionData> connectionDatas)
		throws SystemException {
		for (es.davinciti.liferay.model.ConnectionData connectionData : connectionDatas) {
			connectionConfigsToConnectionDataTableMapper.addTableMapping(pk,
				connectionData.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the connection configs and its connection datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs to clear the associated connection datas from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearConnectionDatas(long pk) throws SystemException {
		connectionConfigsToConnectionDataTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the connection configs and the connection data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionDataPK the primary key of the connection data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionData(long pk, long connectionDataPK)
		throws SystemException {
		connectionConfigsToConnectionDataTableMapper.deleteTableMapping(pk,
			connectionDataPK);
	}

	/**
	 * Removes the association between the connection configs and the connection data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionData the connection data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionData(long pk,
		es.davinciti.liferay.model.ConnectionData connectionData)
		throws SystemException {
		connectionConfigsToConnectionDataTableMapper.deleteTableMapping(pk,
			connectionData.getPrimaryKey());
	}

	/**
	 * Removes the association between the connection configs and the connection datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionDataPKs the primary keys of the connection datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionDatas(long pk, long[] connectionDataPKs)
		throws SystemException {
		for (long connectionDataPK : connectionDataPKs) {
			connectionConfigsToConnectionDataTableMapper.deleteTableMapping(pk,
				connectionDataPK);
		}
	}

	/**
	 * Removes the association between the connection configs and the connection datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionDatas the connection datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeConnectionDatas(long pk,
		List<es.davinciti.liferay.model.ConnectionData> connectionDatas)
		throws SystemException {
		for (es.davinciti.liferay.model.ConnectionData connectionData : connectionDatas) {
			connectionConfigsToConnectionDataTableMapper.deleteTableMapping(pk,
				connectionData.getPrimaryKey());
		}
	}

	/**
	 * Sets the connection datas associated with the connection configs, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionDataPKs the primary keys of the connection datas to be associated with the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setConnectionDatas(long pk, long[] connectionDataPKs)
		throws SystemException {
		Set<Long> newConnectionDataPKsSet = SetUtil.fromArray(connectionDataPKs);
		Set<Long> oldConnectionDataPKsSet = SetUtil.fromArray(connectionConfigsToConnectionDataTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeConnectionDataPKsSet = new HashSet<Long>(oldConnectionDataPKsSet);

		removeConnectionDataPKsSet.removeAll(newConnectionDataPKsSet);

		for (long removeConnectionDataPK : removeConnectionDataPKsSet) {
			connectionConfigsToConnectionDataTableMapper.deleteTableMapping(pk,
				removeConnectionDataPK);
		}

		newConnectionDataPKsSet.removeAll(oldConnectionDataPKsSet);

		for (long newConnectionDataPK : newConnectionDataPKsSet) {
			connectionConfigsToConnectionDataTableMapper.addTableMapping(pk,
				newConnectionDataPK);
		}
	}

	/**
	 * Sets the connection datas associated with the connection configs, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the connection configs
	 * @param connectionDatas the connection datas to be associated with the connection configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setConnectionDatas(long pk,
		List<es.davinciti.liferay.model.ConnectionData> connectionDatas)
		throws SystemException {
		try {
			long[] connectionDataPKs = new long[connectionDatas.size()];

			for (int i = 0; i < connectionDatas.size(); i++) {
				es.davinciti.liferay.model.ConnectionData connectionData = connectionDatas.get(i);

				connectionDataPKs[i] = connectionData.getPrimaryKey();
			}

			setConnectionDatas(pk, connectionDataPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(ConnectionConfigsModelImpl.MAPPING_TABLE_CMES_CONFIGS_DATAS_NAME);
		}
	}

	/**
	 * Initializes the connection configs persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.ConnectionConfigs")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ConnectionConfigs>> listenersList = new ArrayList<ModelListener<ConnectionConfigs>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ConnectionConfigs>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		connectionConfigsToConnectionTypesTableMapper = TableMapperFactory.getTableMapper("CMES_Configs_Types",
				"configId", "connectionTypeId", this, connectionTypesPersistence);

		connectionConfigsToConnectionActionTypesTableMapper = TableMapperFactory.getTableMapper("CMES_Configs_Actions",
				"configId", "connectionActionTypeId", this,
				connectionActionTypesPersistence);

		connectionConfigsToConnectionDataTableMapper = TableMapperFactory.getTableMapper("CMES_Configs_Datas",
				"configId", "connectionDataId", this, connectionDataPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ConnectionConfigsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("CMES_Configs_Types");
		TableMapperFactory.removeTableMapper("CMES_Configs_Actions");
		TableMapperFactory.removeTableMapper("CMES_Configs_Datas");
	}

	@BeanReference(type = ConnectionTypesPersistence.class)
	protected ConnectionTypesPersistence connectionTypesPersistence;
	protected TableMapper<ConnectionConfigs, es.davinciti.liferay.model.ConnectionTypes> connectionConfigsToConnectionTypesTableMapper;
	@BeanReference(type = ConnectionActionTypesPersistence.class)
	protected ConnectionActionTypesPersistence connectionActionTypesPersistence;
	protected TableMapper<ConnectionConfigs, es.davinciti.liferay.model.ConnectionActionTypes> connectionConfigsToConnectionActionTypesTableMapper;
	@BeanReference(type = ConnectionDataPersistence.class)
	protected ConnectionDataPersistence connectionDataPersistence;
	protected TableMapper<ConnectionConfigs, es.davinciti.liferay.model.ConnectionData> connectionConfigsToConnectionDataTableMapper;
	private static final String _SQL_SELECT_CONNECTIONCONFIGS = "SELECT connectionConfigs FROM ConnectionConfigs connectionConfigs";
	private static final String _SQL_SELECT_CONNECTIONCONFIGS_WHERE = "SELECT connectionConfigs FROM ConnectionConfigs connectionConfigs WHERE ";
	private static final String _SQL_COUNT_CONNECTIONCONFIGS = "SELECT COUNT(connectionConfigs) FROM ConnectionConfigs connectionConfigs";
	private static final String _SQL_COUNT_CONNECTIONCONFIGS_WHERE = "SELECT COUNT(connectionConfigs) FROM ConnectionConfigs connectionConfigs WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "connectionConfigs.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ConnectionConfigs exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ConnectionConfigs exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ConnectionConfigsPersistenceImpl.class);
	private static ConnectionConfigs _nullConnectionConfigs = new ConnectionConfigsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ConnectionConfigs> toCacheModel() {
				return _nullConnectionConfigsCacheModel;
			}
		};

	private static CacheModel<ConnectionConfigs> _nullConnectionConfigsCacheModel =
		new CacheModel<ConnectionConfigs>() {
			@Override
			public ConnectionConfigs toEntityModel() {
				return _nullConnectionConfigs;
			}
		};
}