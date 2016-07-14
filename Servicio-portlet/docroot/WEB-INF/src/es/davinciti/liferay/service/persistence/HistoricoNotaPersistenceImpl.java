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

import es.davinciti.liferay.NoSuchHistoricoNotaException;
import es.davinciti.liferay.model.HistoricoNota;
import es.davinciti.liferay.model.impl.HistoricoNotaImpl;
import es.davinciti.liferay.model.impl.HistoricoNotaModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the historico nota service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see HistoricoNotaPersistence
 * @see HistoricoNotaUtil
 * @generated
 */
public class HistoricoNotaPersistenceImpl extends BasePersistenceImpl<HistoricoNota>
	implements HistoricoNotaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link HistoricoNotaUtil} to access the historico nota persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = HistoricoNotaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HistoricoNotaModelImpl.ENTITY_CACHE_ENABLED,
			HistoricoNotaModelImpl.FINDER_CACHE_ENABLED,
			HistoricoNotaImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HistoricoNotaModelImpl.ENTITY_CACHE_ENABLED,
			HistoricoNotaModelImpl.FINDER_CACHE_ENABLED,
			HistoricoNotaImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HistoricoNotaModelImpl.ENTITY_CACHE_ENABLED,
			HistoricoNotaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public HistoricoNotaPersistenceImpl() {
		setModelClass(HistoricoNota.class);
	}

	/**
	 * Caches the historico nota in the entity cache if it is enabled.
	 *
	 * @param historicoNota the historico nota
	 */
	@Override
	public void cacheResult(HistoricoNota historicoNota) {
		EntityCacheUtil.putResult(HistoricoNotaModelImpl.ENTITY_CACHE_ENABLED,
			HistoricoNotaImpl.class, historicoNota.getPrimaryKey(),
			historicoNota);

		historicoNota.resetOriginalValues();
	}

	/**
	 * Caches the historico notas in the entity cache if it is enabled.
	 *
	 * @param historicoNotas the historico notas
	 */
	@Override
	public void cacheResult(List<HistoricoNota> historicoNotas) {
		for (HistoricoNota historicoNota : historicoNotas) {
			if (EntityCacheUtil.getResult(
						HistoricoNotaModelImpl.ENTITY_CACHE_ENABLED,
						HistoricoNotaImpl.class, historicoNota.getPrimaryKey()) == null) {
				cacheResult(historicoNota);
			}
			else {
				historicoNota.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all historico notas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(HistoricoNotaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(HistoricoNotaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the historico nota.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HistoricoNota historicoNota) {
		EntityCacheUtil.removeResult(HistoricoNotaModelImpl.ENTITY_CACHE_ENABLED,
			HistoricoNotaImpl.class, historicoNota.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<HistoricoNota> historicoNotas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (HistoricoNota historicoNota : historicoNotas) {
			EntityCacheUtil.removeResult(HistoricoNotaModelImpl.ENTITY_CACHE_ENABLED,
				HistoricoNotaImpl.class, historicoNota.getPrimaryKey());
		}
	}

	/**
	 * Creates a new historico nota with the primary key. Does not add the historico nota to the database.
	 *
	 * @param historiconotaId the primary key for the new historico nota
	 * @return the new historico nota
	 */
	@Override
	public HistoricoNota create(long historiconotaId) {
		HistoricoNota historicoNota = new HistoricoNotaImpl();

		historicoNota.setNew(true);
		historicoNota.setPrimaryKey(historiconotaId);

		return historicoNota;
	}

	/**
	 * Removes the historico nota with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param historiconotaId the primary key of the historico nota
	 * @return the historico nota that was removed
	 * @throws es.davinciti.liferay.NoSuchHistoricoNotaException if a historico nota with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoricoNota remove(long historiconotaId)
		throws NoSuchHistoricoNotaException, SystemException {
		return remove((Serializable)historiconotaId);
	}

	/**
	 * Removes the historico nota with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the historico nota
	 * @return the historico nota that was removed
	 * @throws es.davinciti.liferay.NoSuchHistoricoNotaException if a historico nota with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoricoNota remove(Serializable primaryKey)
		throws NoSuchHistoricoNotaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			HistoricoNota historicoNota = (HistoricoNota)session.get(HistoricoNotaImpl.class,
					primaryKey);

			if (historicoNota == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHistoricoNotaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(historicoNota);
		}
		catch (NoSuchHistoricoNotaException nsee) {
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
	protected HistoricoNota removeImpl(HistoricoNota historicoNota)
		throws SystemException {
		historicoNota = toUnwrappedModel(historicoNota);

		historicoNotaToNotaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(historicoNota.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(historicoNota)) {
				historicoNota = (HistoricoNota)session.get(HistoricoNotaImpl.class,
						historicoNota.getPrimaryKeyObj());
			}

			if (historicoNota != null) {
				session.delete(historicoNota);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (historicoNota != null) {
			clearCache(historicoNota);
		}

		return historicoNota;
	}

	@Override
	public HistoricoNota updateImpl(
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws SystemException {
		historicoNota = toUnwrappedModel(historicoNota);

		boolean isNew = historicoNota.isNew();

		Session session = null;

		try {
			session = openSession();

			if (historicoNota.isNew()) {
				session.save(historicoNota);

				historicoNota.setNew(false);
			}
			else {
				session.merge(historicoNota);
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

		EntityCacheUtil.putResult(HistoricoNotaModelImpl.ENTITY_CACHE_ENABLED,
			HistoricoNotaImpl.class, historicoNota.getPrimaryKey(),
			historicoNota);

		return historicoNota;
	}

	protected HistoricoNota toUnwrappedModel(HistoricoNota historicoNota) {
		if (historicoNota instanceof HistoricoNotaImpl) {
			return historicoNota;
		}

		HistoricoNotaImpl historicoNotaImpl = new HistoricoNotaImpl();

		historicoNotaImpl.setNew(historicoNota.isNew());
		historicoNotaImpl.setPrimaryKey(historicoNota.getPrimaryKey());

		historicoNotaImpl.setHistoriconotaId(historicoNota.getHistoriconotaId());
		historicoNotaImpl.setCompanyId(historicoNota.getCompanyId());
		historicoNotaImpl.setUserId(historicoNota.getUserId());
		historicoNotaImpl.setComments(historicoNota.getComments());
		historicoNotaImpl.setUpdateAt(historicoNota.getUpdateAt());
		historicoNotaImpl.setPrevStatus(historicoNota.getPrevStatus());
		historicoNotaImpl.setNewStatus(historicoNota.getNewStatus());

		return historicoNotaImpl;
	}

	/**
	 * Returns the historico nota with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the historico nota
	 * @return the historico nota
	 * @throws es.davinciti.liferay.NoSuchHistoricoNotaException if a historico nota with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoricoNota findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHistoricoNotaException, SystemException {
		HistoricoNota historicoNota = fetchByPrimaryKey(primaryKey);

		if (historicoNota == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHistoricoNotaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return historicoNota;
	}

	/**
	 * Returns the historico nota with the primary key or throws a {@link es.davinciti.liferay.NoSuchHistoricoNotaException} if it could not be found.
	 *
	 * @param historiconotaId the primary key of the historico nota
	 * @return the historico nota
	 * @throws es.davinciti.liferay.NoSuchHistoricoNotaException if a historico nota with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoricoNota findByPrimaryKey(long historiconotaId)
		throws NoSuchHistoricoNotaException, SystemException {
		return findByPrimaryKey((Serializable)historiconotaId);
	}

	/**
	 * Returns the historico nota with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the historico nota
	 * @return the historico nota, or <code>null</code> if a historico nota with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoricoNota fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		HistoricoNota historicoNota = (HistoricoNota)EntityCacheUtil.getResult(HistoricoNotaModelImpl.ENTITY_CACHE_ENABLED,
				HistoricoNotaImpl.class, primaryKey);

		if (historicoNota == _nullHistoricoNota) {
			return null;
		}

		if (historicoNota == null) {
			Session session = null;

			try {
				session = openSession();

				historicoNota = (HistoricoNota)session.get(HistoricoNotaImpl.class,
						primaryKey);

				if (historicoNota != null) {
					cacheResult(historicoNota);
				}
				else {
					EntityCacheUtil.putResult(HistoricoNotaModelImpl.ENTITY_CACHE_ENABLED,
						HistoricoNotaImpl.class, primaryKey, _nullHistoricoNota);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(HistoricoNotaModelImpl.ENTITY_CACHE_ENABLED,
					HistoricoNotaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return historicoNota;
	}

	/**
	 * Returns the historico nota with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param historiconotaId the primary key of the historico nota
	 * @return the historico nota, or <code>null</code> if a historico nota with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoricoNota fetchByPrimaryKey(long historiconotaId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)historiconotaId);
	}

	/**
	 * Returns all the historico notas.
	 *
	 * @return the historico notas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoricoNota> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the historico notas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.HistoricoNotaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of historico notas
	 * @param end the upper bound of the range of historico notas (not inclusive)
	 * @return the range of historico notas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoricoNota> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the historico notas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.HistoricoNotaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of historico notas
	 * @param end the upper bound of the range of historico notas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of historico notas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoricoNota> findAll(int start, int end,
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

		List<HistoricoNota> list = (List<HistoricoNota>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_HISTORICONOTA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HISTORICONOTA;

				if (pagination) {
					sql = sql.concat(HistoricoNotaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<HistoricoNota>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<HistoricoNota>(list);
				}
				else {
					list = (List<HistoricoNota>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the historico notas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (HistoricoNota historicoNota : findAll()) {
			remove(historicoNota);
		}
	}

	/**
	 * Returns the number of historico notas.
	 *
	 * @return the number of historico notas
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

				Query q = session.createQuery(_SQL_COUNT_HISTORICONOTA);

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
	 * Returns all the nota gastos associated with the historico nota.
	 *
	 * @param pk the primary key of the historico nota
	 * @return the nota gastos associated with the historico nota
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(long pk)
		throws SystemException {
		return getNotaGastos(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the nota gastos associated with the historico nota.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.HistoricoNotaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the historico nota
	 * @param start the lower bound of the range of historico notas
	 * @param end the upper bound of the range of historico notas (not inclusive)
	 * @return the range of nota gastos associated with the historico nota
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(long pk,
		int start, int end) throws SystemException {
		return getNotaGastos(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nota gastos associated with the historico nota.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.HistoricoNotaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the historico nota
	 * @param start the lower bound of the range of historico notas
	 * @param end the upper bound of the range of historico notas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nota gastos associated with the historico nota
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return historicoNotaToNotaGastoTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of nota gastos associated with the historico nota.
	 *
	 * @param pk the primary key of the historico nota
	 * @return the number of nota gastos associated with the historico nota
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getNotaGastosSize(long pk) throws SystemException {
		long[] pks = historicoNotaToNotaGastoTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the nota gasto is associated with the historico nota.
	 *
	 * @param pk the primary key of the historico nota
	 * @param notaGastoPK the primary key of the nota gasto
	 * @return <code>true</code> if the nota gasto is associated with the historico nota; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsNotaGasto(long pk, long notaGastoPK)
		throws SystemException {
		return historicoNotaToNotaGastoTableMapper.containsTableMapping(pk,
			notaGastoPK);
	}

	/**
	 * Returns <code>true</code> if the historico nota has any nota gastos associated with it.
	 *
	 * @param pk the primary key of the historico nota to check for associations with nota gastos
	 * @return <code>true</code> if the historico nota has any nota gastos associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsNotaGastos(long pk) throws SystemException {
		if (getNotaGastosSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the historico nota and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the historico nota
	 * @param notaGastoPK the primary key of the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addNotaGasto(long pk, long notaGastoPK)
		throws SystemException {
		historicoNotaToNotaGastoTableMapper.addTableMapping(pk, notaGastoPK);
	}

	/**
	 * Adds an association between the historico nota and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the historico nota
	 * @param notaGasto the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addNotaGasto(long pk,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws SystemException {
		historicoNotaToNotaGastoTableMapper.addTableMapping(pk,
			notaGasto.getPrimaryKey());
	}

	/**
	 * Adds an association between the historico nota and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the historico nota
	 * @param notaGastoPKs the primary keys of the nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addNotaGastos(long pk, long[] notaGastoPKs)
		throws SystemException {
		for (long notaGastoPK : notaGastoPKs) {
			historicoNotaToNotaGastoTableMapper.addTableMapping(pk, notaGastoPK);
		}
	}

	/**
	 * Adds an association between the historico nota and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the historico nota
	 * @param notaGastos the nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addNotaGastos(long pk,
		List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.NotaGasto notaGasto : notaGastos) {
			historicoNotaToNotaGastoTableMapper.addTableMapping(pk,
				notaGasto.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the historico nota and its nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the historico nota to clear the associated nota gastos from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearNotaGastos(long pk) throws SystemException {
		historicoNotaToNotaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the historico nota and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the historico nota
	 * @param notaGastoPK the primary key of the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeNotaGasto(long pk, long notaGastoPK)
		throws SystemException {
		historicoNotaToNotaGastoTableMapper.deleteTableMapping(pk, notaGastoPK);
	}

	/**
	 * Removes the association between the historico nota and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the historico nota
	 * @param notaGasto the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeNotaGasto(long pk,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws SystemException {
		historicoNotaToNotaGastoTableMapper.deleteTableMapping(pk,
			notaGasto.getPrimaryKey());
	}

	/**
	 * Removes the association between the historico nota and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the historico nota
	 * @param notaGastoPKs the primary keys of the nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeNotaGastos(long pk, long[] notaGastoPKs)
		throws SystemException {
		for (long notaGastoPK : notaGastoPKs) {
			historicoNotaToNotaGastoTableMapper.deleteTableMapping(pk,
				notaGastoPK);
		}
	}

	/**
	 * Removes the association between the historico nota and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the historico nota
	 * @param notaGastos the nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeNotaGastos(long pk,
		List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.NotaGasto notaGasto : notaGastos) {
			historicoNotaToNotaGastoTableMapper.deleteTableMapping(pk,
				notaGasto.getPrimaryKey());
		}
	}

	/**
	 * Sets the nota gastos associated with the historico nota, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the historico nota
	 * @param notaGastoPKs the primary keys of the nota gastos to be associated with the historico nota
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setNotaGastos(long pk, long[] notaGastoPKs)
		throws SystemException {
		Set<Long> newNotaGastoPKsSet = SetUtil.fromArray(notaGastoPKs);
		Set<Long> oldNotaGastoPKsSet = SetUtil.fromArray(historicoNotaToNotaGastoTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeNotaGastoPKsSet = new HashSet<Long>(oldNotaGastoPKsSet);

		removeNotaGastoPKsSet.removeAll(newNotaGastoPKsSet);

		for (long removeNotaGastoPK : removeNotaGastoPKsSet) {
			historicoNotaToNotaGastoTableMapper.deleteTableMapping(pk,
				removeNotaGastoPK);
		}

		newNotaGastoPKsSet.removeAll(oldNotaGastoPKsSet);

		for (long newNotaGastoPK : newNotaGastoPKsSet) {
			historicoNotaToNotaGastoTableMapper.addTableMapping(pk,
				newNotaGastoPK);
		}
	}

	/**
	 * Sets the nota gastos associated with the historico nota, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the historico nota
	 * @param notaGastos the nota gastos to be associated with the historico nota
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setNotaGastos(long pk,
		List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws SystemException {
		try {
			long[] notaGastoPKs = new long[notaGastos.size()];

			for (int i = 0; i < notaGastos.size(); i++) {
				es.davinciti.liferay.model.NotaGasto notaGasto = notaGastos.get(i);

				notaGastoPKs[i] = notaGasto.getPrimaryKey();
			}

			setNotaGastos(pk, notaGastoPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(HistoricoNotaModelImpl.MAPPING_TABLE_CMES_NOTAS_HISTORICONOTAS_NAME);
		}
	}

	/**
	 * Initializes the historico nota persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.HistoricoNota")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<HistoricoNota>> listenersList = new ArrayList<ModelListener<HistoricoNota>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<HistoricoNota>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		historicoNotaToNotaGastoTableMapper = TableMapperFactory.getTableMapper("CMES_Notas_HistoricoNotas",
				"historiconotaId", "notagastoId", this, notaGastoPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(HistoricoNotaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("CMES_Notas_HistoricoNotas");
	}

	@BeanReference(type = NotaGastoPersistence.class)
	protected NotaGastoPersistence notaGastoPersistence;
	protected TableMapper<HistoricoNota, es.davinciti.liferay.model.NotaGasto> historicoNotaToNotaGastoTableMapper;
	private static final String _SQL_SELECT_HISTORICONOTA = "SELECT historicoNota FROM HistoricoNota historicoNota";
	private static final String _SQL_COUNT_HISTORICONOTA = "SELECT COUNT(historicoNota) FROM HistoricoNota historicoNota";
	private static final String _ORDER_BY_ENTITY_ALIAS = "historicoNota.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HistoricoNota exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(HistoricoNotaPersistenceImpl.class);
	private static HistoricoNota _nullHistoricoNota = new HistoricoNotaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<HistoricoNota> toCacheModel() {
				return _nullHistoricoNotaCacheModel;
			}
		};

	private static CacheModel<HistoricoNota> _nullHistoricoNotaCacheModel = new CacheModel<HistoricoNota>() {
			@Override
			public HistoricoNota toEntityModel() {
				return _nullHistoricoNota;
			}
		};
}