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

import es.davinciti.liferay.NoSuchLineaGastoCategoriaException;
import es.davinciti.liferay.model.LineaGastoCategoria;
import es.davinciti.liferay.model.impl.LineaGastoCategoriaImpl;
import es.davinciti.liferay.model.impl.LineaGastoCategoriaModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the linea gasto categoria service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoCategoriaPersistence
 * @see LineaGastoCategoriaUtil
 * @generated
 */
public class LineaGastoCategoriaPersistenceImpl extends BasePersistenceImpl<LineaGastoCategoria>
	implements LineaGastoCategoriaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LineaGastoCategoriaUtil} to access the linea gasto categoria persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LineaGastoCategoriaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LineaGastoCategoriaModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoCategoriaModelImpl.FINDER_CACHE_ENABLED,
			LineaGastoCategoriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LineaGastoCategoriaModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoCategoriaModelImpl.FINDER_CACHE_ENABLED,
			LineaGastoCategoriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LineaGastoCategoriaModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoCategoriaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LineaGastoCategoriaPersistenceImpl() {
		setModelClass(LineaGastoCategoria.class);
	}

	/**
	 * Caches the linea gasto categoria in the entity cache if it is enabled.
	 *
	 * @param lineaGastoCategoria the linea gasto categoria
	 */
	@Override
	public void cacheResult(LineaGastoCategoria lineaGastoCategoria) {
		EntityCacheUtil.putResult(LineaGastoCategoriaModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoCategoriaImpl.class, lineaGastoCategoria.getPrimaryKey(),
			lineaGastoCategoria);

		lineaGastoCategoria.resetOriginalValues();
	}

	/**
	 * Caches the linea gasto categorias in the entity cache if it is enabled.
	 *
	 * @param lineaGastoCategorias the linea gasto categorias
	 */
	@Override
	public void cacheResult(List<LineaGastoCategoria> lineaGastoCategorias) {
		for (LineaGastoCategoria lineaGastoCategoria : lineaGastoCategorias) {
			if (EntityCacheUtil.getResult(
						LineaGastoCategoriaModelImpl.ENTITY_CACHE_ENABLED,
						LineaGastoCategoriaImpl.class,
						lineaGastoCategoria.getPrimaryKey()) == null) {
				cacheResult(lineaGastoCategoria);
			}
			else {
				lineaGastoCategoria.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all linea gasto categorias.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LineaGastoCategoriaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LineaGastoCategoriaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the linea gasto categoria.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LineaGastoCategoria lineaGastoCategoria) {
		EntityCacheUtil.removeResult(LineaGastoCategoriaModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoCategoriaImpl.class, lineaGastoCategoria.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LineaGastoCategoria> lineaGastoCategorias) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LineaGastoCategoria lineaGastoCategoria : lineaGastoCategorias) {
			EntityCacheUtil.removeResult(LineaGastoCategoriaModelImpl.ENTITY_CACHE_ENABLED,
				LineaGastoCategoriaImpl.class,
				lineaGastoCategoria.getPrimaryKey());
		}
	}

	/**
	 * Creates a new linea gasto categoria with the primary key. Does not add the linea gasto categoria to the database.
	 *
	 * @param categoriaId the primary key for the new linea gasto categoria
	 * @return the new linea gasto categoria
	 */
	@Override
	public LineaGastoCategoria create(long categoriaId) {
		LineaGastoCategoria lineaGastoCategoria = new LineaGastoCategoriaImpl();

		lineaGastoCategoria.setNew(true);
		lineaGastoCategoria.setPrimaryKey(categoriaId);

		return lineaGastoCategoria;
	}

	/**
	 * Removes the linea gasto categoria with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param categoriaId the primary key of the linea gasto categoria
	 * @return the linea gasto categoria that was removed
	 * @throws es.davinciti.liferay.NoSuchLineaGastoCategoriaException if a linea gasto categoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCategoria remove(long categoriaId)
		throws NoSuchLineaGastoCategoriaException, SystemException {
		return remove((Serializable)categoriaId);
	}

	/**
	 * Removes the linea gasto categoria with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the linea gasto categoria
	 * @return the linea gasto categoria that was removed
	 * @throws es.davinciti.liferay.NoSuchLineaGastoCategoriaException if a linea gasto categoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCategoria remove(Serializable primaryKey)
		throws NoSuchLineaGastoCategoriaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LineaGastoCategoria lineaGastoCategoria = (LineaGastoCategoria)session.get(LineaGastoCategoriaImpl.class,
					primaryKey);

			if (lineaGastoCategoria == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLineaGastoCategoriaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lineaGastoCategoria);
		}
		catch (NoSuchLineaGastoCategoriaException nsee) {
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
	protected LineaGastoCategoria removeImpl(
		LineaGastoCategoria lineaGastoCategoria) throws SystemException {
		lineaGastoCategoria = toUnwrappedModel(lineaGastoCategoria);

		lineaGastoCategoriaToLineaGastoFamiliaTableMapper.deleteLeftPrimaryKeyTableMappings(lineaGastoCategoria.getPrimaryKey());

		lineaGastoCategoriaToLineaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(lineaGastoCategoria.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lineaGastoCategoria)) {
				lineaGastoCategoria = (LineaGastoCategoria)session.get(LineaGastoCategoriaImpl.class,
						lineaGastoCategoria.getPrimaryKeyObj());
			}

			if (lineaGastoCategoria != null) {
				session.delete(lineaGastoCategoria);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lineaGastoCategoria != null) {
			clearCache(lineaGastoCategoria);
		}

		return lineaGastoCategoria;
	}

	@Override
	public LineaGastoCategoria updateImpl(
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws SystemException {
		lineaGastoCategoria = toUnwrappedModel(lineaGastoCategoria);

		boolean isNew = lineaGastoCategoria.isNew();

		Session session = null;

		try {
			session = openSession();

			if (lineaGastoCategoria.isNew()) {
				session.save(lineaGastoCategoria);

				lineaGastoCategoria.setNew(false);
			}
			else {
				session.merge(lineaGastoCategoria);
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

		EntityCacheUtil.putResult(LineaGastoCategoriaModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoCategoriaImpl.class, lineaGastoCategoria.getPrimaryKey(),
			lineaGastoCategoria);

		return lineaGastoCategoria;
	}

	protected LineaGastoCategoria toUnwrappedModel(
		LineaGastoCategoria lineaGastoCategoria) {
		if (lineaGastoCategoria instanceof LineaGastoCategoriaImpl) {
			return lineaGastoCategoria;
		}

		LineaGastoCategoriaImpl lineaGastoCategoriaImpl = new LineaGastoCategoriaImpl();

		lineaGastoCategoriaImpl.setNew(lineaGastoCategoria.isNew());
		lineaGastoCategoriaImpl.setPrimaryKey(lineaGastoCategoria.getPrimaryKey());

		lineaGastoCategoriaImpl.setCategoriaId(lineaGastoCategoria.getCategoriaId());
		lineaGastoCategoriaImpl.setName(lineaGastoCategoria.getName());
		lineaGastoCategoriaImpl.setDescription(lineaGastoCategoria.getDescription());
		lineaGastoCategoriaImpl.setCategoryCode(lineaGastoCategoria.getCategoryCode());
		lineaGastoCategoriaImpl.setAccountCode(lineaGastoCategoria.getAccountCode());
		lineaGastoCategoriaImpl.setChangePrice(lineaGastoCategoria.getChangePrice());
		lineaGastoCategoriaImpl.setNeedQuantity(lineaGastoCategoria.getNeedQuantity());
		lineaGastoCategoriaImpl.setPrice(lineaGastoCategoria.getPrice());

		return lineaGastoCategoriaImpl;
	}

	/**
	 * Returns the linea gasto categoria with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the linea gasto categoria
	 * @return the linea gasto categoria
	 * @throws es.davinciti.liferay.NoSuchLineaGastoCategoriaException if a linea gasto categoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCategoria findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLineaGastoCategoriaException, SystemException {
		LineaGastoCategoria lineaGastoCategoria = fetchByPrimaryKey(primaryKey);

		if (lineaGastoCategoria == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLineaGastoCategoriaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lineaGastoCategoria;
	}

	/**
	 * Returns the linea gasto categoria with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoCategoriaException} if it could not be found.
	 *
	 * @param categoriaId the primary key of the linea gasto categoria
	 * @return the linea gasto categoria
	 * @throws es.davinciti.liferay.NoSuchLineaGastoCategoriaException if a linea gasto categoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCategoria findByPrimaryKey(long categoriaId)
		throws NoSuchLineaGastoCategoriaException, SystemException {
		return findByPrimaryKey((Serializable)categoriaId);
	}

	/**
	 * Returns the linea gasto categoria with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the linea gasto categoria
	 * @return the linea gasto categoria, or <code>null</code> if a linea gasto categoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCategoria fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LineaGastoCategoria lineaGastoCategoria = (LineaGastoCategoria)EntityCacheUtil.getResult(LineaGastoCategoriaModelImpl.ENTITY_CACHE_ENABLED,
				LineaGastoCategoriaImpl.class, primaryKey);

		if (lineaGastoCategoria == _nullLineaGastoCategoria) {
			return null;
		}

		if (lineaGastoCategoria == null) {
			Session session = null;

			try {
				session = openSession();

				lineaGastoCategoria = (LineaGastoCategoria)session.get(LineaGastoCategoriaImpl.class,
						primaryKey);

				if (lineaGastoCategoria != null) {
					cacheResult(lineaGastoCategoria);
				}
				else {
					EntityCacheUtil.putResult(LineaGastoCategoriaModelImpl.ENTITY_CACHE_ENABLED,
						LineaGastoCategoriaImpl.class, primaryKey,
						_nullLineaGastoCategoria);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LineaGastoCategoriaModelImpl.ENTITY_CACHE_ENABLED,
					LineaGastoCategoriaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lineaGastoCategoria;
	}

	/**
	 * Returns the linea gasto categoria with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param categoriaId the primary key of the linea gasto categoria
	 * @return the linea gasto categoria, or <code>null</code> if a linea gasto categoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCategoria fetchByPrimaryKey(long categoriaId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)categoriaId);
	}

	/**
	 * Returns all the linea gasto categorias.
	 *
	 * @return the linea gasto categorias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoCategoria> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the linea gasto categorias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoCategoriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linea gasto categorias
	 * @param end the upper bound of the range of linea gasto categorias (not inclusive)
	 * @return the range of linea gasto categorias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoCategoria> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto categorias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoCategoriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linea gasto categorias
	 * @param end the upper bound of the range of linea gasto categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gasto categorias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoCategoria> findAll(int start, int end,
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

		List<LineaGastoCategoria> list = (List<LineaGastoCategoria>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LINEAGASTOCATEGORIA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LINEAGASTOCATEGORIA;

				if (pagination) {
					sql = sql.concat(LineaGastoCategoriaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LineaGastoCategoria>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LineaGastoCategoria>(list);
				}
				else {
					list = (List<LineaGastoCategoria>)QueryUtil.list(q,
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
	 * Removes all the linea gasto categorias from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LineaGastoCategoria lineaGastoCategoria : findAll()) {
			remove(lineaGastoCategoria);
		}
	}

	/**
	 * Returns the number of linea gasto categorias.
	 *
	 * @return the number of linea gasto categorias
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

				Query q = session.createQuery(_SQL_COUNT_LINEAGASTOCATEGORIA);

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
	 * Returns all the linea gasto familias associated with the linea gasto categoria.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @return the linea gasto familias associated with the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk) throws SystemException {
		return getLineaGastoFamilias(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the linea gasto familias associated with the linea gasto categoria.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoCategoriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param start the lower bound of the range of linea gasto categorias
	 * @param end the upper bound of the range of linea gasto categorias (not inclusive)
	 * @return the range of linea gasto familias associated with the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk, int start, int end) throws SystemException {
		return getLineaGastoFamilias(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto familias associated with the linea gasto categoria.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoCategoriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param start the lower bound of the range of linea gasto categorias
	 * @param end the upper bound of the range of linea gasto categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gasto familias associated with the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return lineaGastoCategoriaToLineaGastoFamiliaTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of linea gasto familias associated with the linea gasto categoria.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @return the number of linea gasto familias associated with the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getLineaGastoFamiliasSize(long pk) throws SystemException {
		long[] pks = lineaGastoCategoriaToLineaGastoFamiliaTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the linea gasto familia is associated with the linea gasto categoria.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	 * @return <code>true</code> if the linea gasto familia is associated with the linea gasto categoria; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGastoFamilia(long pk, long lineaGastoFamiliaPK)
		throws SystemException {
		return lineaGastoCategoriaToLineaGastoFamiliaTableMapper.containsTableMapping(pk,
			lineaGastoFamiliaPK);
	}

	/**
	 * Returns <code>true</code> if the linea gasto categoria has any linea gasto familias associated with it.
	 *
	 * @param pk the primary key of the linea gasto categoria to check for associations with linea gasto familias
	 * @return <code>true</code> if the linea gasto categoria has any linea gasto familias associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGastoFamilias(long pk)
		throws SystemException {
		if (getLineaGastoFamiliasSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the linea gasto categoria and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoFamilia(long pk, long lineaGastoFamiliaPK)
		throws SystemException {
		lineaGastoCategoriaToLineaGastoFamiliaTableMapper.addTableMapping(pk,
			lineaGastoFamiliaPK);
	}

	/**
	 * Adds an association between the linea gasto categoria and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoFamilia the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoFamilia(long pk,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws SystemException {
		lineaGastoCategoriaToLineaGastoFamiliaTableMapper.addTableMapping(pk,
			lineaGastoFamilia.getPrimaryKey());
	}

	/**
	 * Adds an association between the linea gasto categoria and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoFamilias(long pk, long[] lineaGastoFamiliaPKs)
		throws SystemException {
		for (long lineaGastoFamiliaPK : lineaGastoFamiliaPKs) {
			lineaGastoCategoriaToLineaGastoFamiliaTableMapper.addTableMapping(pk,
				lineaGastoFamiliaPK);
		}
	}

	/**
	 * Adds an association between the linea gasto categoria and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoFamilias the linea gasto familias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoFamilias(long pk,
		List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia : lineaGastoFamilias) {
			lineaGastoCategoriaToLineaGastoFamiliaTableMapper.addTableMapping(pk,
				lineaGastoFamilia.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the linea gasto categoria and its linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria to clear the associated linea gasto familias from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearLineaGastoFamilias(long pk) throws SystemException {
		lineaGastoCategoriaToLineaGastoFamiliaTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the linea gasto categoria and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoFamilia(long pk, long lineaGastoFamiliaPK)
		throws SystemException {
		lineaGastoCategoriaToLineaGastoFamiliaTableMapper.deleteTableMapping(pk,
			lineaGastoFamiliaPK);
	}

	/**
	 * Removes the association between the linea gasto categoria and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoFamilia the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoFamilia(long pk,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws SystemException {
		lineaGastoCategoriaToLineaGastoFamiliaTableMapper.deleteTableMapping(pk,
			lineaGastoFamilia.getPrimaryKey());
	}

	/**
	 * Removes the association between the linea gasto categoria and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoFamilias(long pk, long[] lineaGastoFamiliaPKs)
		throws SystemException {
		for (long lineaGastoFamiliaPK : lineaGastoFamiliaPKs) {
			lineaGastoCategoriaToLineaGastoFamiliaTableMapper.deleteTableMapping(pk,
				lineaGastoFamiliaPK);
		}
	}

	/**
	 * Removes the association between the linea gasto categoria and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoFamilias the linea gasto familias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoFamilias(long pk,
		List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia : lineaGastoFamilias) {
			lineaGastoCategoriaToLineaGastoFamiliaTableMapper.deleteTableMapping(pk,
				lineaGastoFamilia.getPrimaryKey());
		}
	}

	/**
	 * Sets the linea gasto familias associated with the linea gasto categoria, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias to be associated with the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastoFamilias(long pk, long[] lineaGastoFamiliaPKs)
		throws SystemException {
		Set<Long> newLineaGastoFamiliaPKsSet = SetUtil.fromArray(lineaGastoFamiliaPKs);
		Set<Long> oldLineaGastoFamiliaPKsSet = SetUtil.fromArray(lineaGastoCategoriaToLineaGastoFamiliaTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeLineaGastoFamiliaPKsSet = new HashSet<Long>(oldLineaGastoFamiliaPKsSet);

		removeLineaGastoFamiliaPKsSet.removeAll(newLineaGastoFamiliaPKsSet);

		for (long removeLineaGastoFamiliaPK : removeLineaGastoFamiliaPKsSet) {
			lineaGastoCategoriaToLineaGastoFamiliaTableMapper.deleteTableMapping(pk,
				removeLineaGastoFamiliaPK);
		}

		newLineaGastoFamiliaPKsSet.removeAll(oldLineaGastoFamiliaPKsSet);

		for (long newLineaGastoFamiliaPK : newLineaGastoFamiliaPKsSet) {
			lineaGastoCategoriaToLineaGastoFamiliaTableMapper.addTableMapping(pk,
				newLineaGastoFamiliaPK);
		}
	}

	/**
	 * Sets the linea gasto familias associated with the linea gasto categoria, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoFamilias the linea gasto familias to be associated with the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastoFamilias(long pk,
		List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws SystemException {
		try {
			long[] lineaGastoFamiliaPKs = new long[lineaGastoFamilias.size()];

			for (int i = 0; i < lineaGastoFamilias.size(); i++) {
				es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia = lineaGastoFamilias.get(i);

				lineaGastoFamiliaPKs[i] = lineaGastoFamilia.getPrimaryKey();
			}

			setLineaGastoFamilias(pk, lineaGastoFamiliaPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(LineaGastoCategoriaModelImpl.MAPPING_TABLE_CMES_FAMILIAS_CATEGORIAS_NAME);
		}
	}

	/**
	 * Returns all the linea gastos associated with the linea gasto categoria.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @return the linea gastos associated with the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk)
		throws SystemException {
		return getLineaGastos(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the linea gastos associated with the linea gasto categoria.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoCategoriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param start the lower bound of the range of linea gasto categorias
	 * @param end the upper bound of the range of linea gasto categorias (not inclusive)
	 * @return the range of linea gastos associated with the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk,
		int start, int end) throws SystemException {
		return getLineaGastos(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gastos associated with the linea gasto categoria.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoCategoriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param start the lower bound of the range of linea gasto categorias
	 * @param end the upper bound of the range of linea gasto categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gastos associated with the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return lineaGastoCategoriaToLineaGastoTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of linea gastos associated with the linea gasto categoria.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @return the number of linea gastos associated with the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getLineaGastosSize(long pk) throws SystemException {
		long[] pks = lineaGastoCategoriaToLineaGastoTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the linea gasto is associated with the linea gasto categoria.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @return <code>true</code> if the linea gasto is associated with the linea gasto categoria; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		return lineaGastoCategoriaToLineaGastoTableMapper.containsTableMapping(pk,
			lineaGastoPK);
	}

	/**
	 * Returns <code>true</code> if the linea gasto categoria has any linea gastos associated with it.
	 *
	 * @param pk the primary key of the linea gasto categoria to check for associations with linea gastos
	 * @return <code>true</code> if the linea gasto categoria has any linea gastos associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGastos(long pk) throws SystemException {
		if (getLineaGastosSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the linea gasto categoria and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		lineaGastoCategoriaToLineaGastoTableMapper.addTableMapping(pk,
			lineaGastoPK);
	}

	/**
	 * Adds an association between the linea gasto categoria and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGasto the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws SystemException {
		lineaGastoCategoriaToLineaGastoTableMapper.addTableMapping(pk,
			lineaGasto.getPrimaryKey());
	}

	/**
	 * Adds an association between the linea gasto categoria and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoPKs the primary keys of the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		for (long lineaGastoPK : lineaGastoPKs) {
			lineaGastoCategoriaToLineaGastoTableMapper.addTableMapping(pk,
				lineaGastoPK);
		}
	}

	/**
	 * Adds an association between the linea gasto categoria and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastos the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastos(long pk,
		List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGasto lineaGasto : lineaGastos) {
			lineaGastoCategoriaToLineaGastoTableMapper.addTableMapping(pk,
				lineaGasto.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the linea gasto categoria and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria to clear the associated linea gastos from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearLineaGastos(long pk) throws SystemException {
		lineaGastoCategoriaToLineaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the linea gasto categoria and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		lineaGastoCategoriaToLineaGastoTableMapper.deleteTableMapping(pk,
			lineaGastoPK);
	}

	/**
	 * Removes the association between the linea gasto categoria and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGasto the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws SystemException {
		lineaGastoCategoriaToLineaGastoTableMapper.deleteTableMapping(pk,
			lineaGasto.getPrimaryKey());
	}

	/**
	 * Removes the association between the linea gasto categoria and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoPKs the primary keys of the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		for (long lineaGastoPK : lineaGastoPKs) {
			lineaGastoCategoriaToLineaGastoTableMapper.deleteTableMapping(pk,
				lineaGastoPK);
		}
	}

	/**
	 * Removes the association between the linea gasto categoria and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastos the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastos(long pk,
		List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGasto lineaGasto : lineaGastos) {
			lineaGastoCategoriaToLineaGastoTableMapper.deleteTableMapping(pk,
				lineaGasto.getPrimaryKey());
		}
	}

	/**
	 * Sets the linea gastos associated with the linea gasto categoria, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastoPKs the primary keys of the linea gastos to be associated with the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		Set<Long> newLineaGastoPKsSet = SetUtil.fromArray(lineaGastoPKs);
		Set<Long> oldLineaGastoPKsSet = SetUtil.fromArray(lineaGastoCategoriaToLineaGastoTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeLineaGastoPKsSet = new HashSet<Long>(oldLineaGastoPKsSet);

		removeLineaGastoPKsSet.removeAll(newLineaGastoPKsSet);

		for (long removeLineaGastoPK : removeLineaGastoPKsSet) {
			lineaGastoCategoriaToLineaGastoTableMapper.deleteTableMapping(pk,
				removeLineaGastoPK);
		}

		newLineaGastoPKsSet.removeAll(oldLineaGastoPKsSet);

		for (long newLineaGastoPK : newLineaGastoPKsSet) {
			lineaGastoCategoriaToLineaGastoTableMapper.addTableMapping(pk,
				newLineaGastoPK);
		}
	}

	/**
	 * Sets the linea gastos associated with the linea gasto categoria, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto categoria
	 * @param lineaGastos the linea gastos to be associated with the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastos(long pk,
		List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws SystemException {
		try {
			long[] lineaGastoPKs = new long[lineaGastos.size()];

			for (int i = 0; i < lineaGastos.size(); i++) {
				es.davinciti.liferay.model.LineaGasto lineaGasto = lineaGastos.get(i);

				lineaGastoPKs[i] = lineaGasto.getPrimaryKey();
			}

			setLineaGastos(pk, lineaGastoPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(LineaGastoCategoriaModelImpl.MAPPING_TABLE_CMES_LINEAS_CATEGORIAS_NAME);
		}
	}

	/**
	 * Initializes the linea gasto categoria persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.LineaGastoCategoria")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LineaGastoCategoria>> listenersList = new ArrayList<ModelListener<LineaGastoCategoria>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LineaGastoCategoria>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		lineaGastoCategoriaToLineaGastoFamiliaTableMapper = TableMapperFactory.getTableMapper("CMES_Familias_Categorias",
				"categoriaId", "familiaId", this, lineaGastoFamiliaPersistence);

		lineaGastoCategoriaToLineaGastoTableMapper = TableMapperFactory.getTableMapper("CMES_Lineas_Categorias",
				"categoriaId", "lineagastoId", this, lineaGastoPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(LineaGastoCategoriaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("CMES_Familias_Categorias");
		TableMapperFactory.removeTableMapper("CMES_Lineas_Categorias");
	}

	@BeanReference(type = LineaGastoFamiliaPersistence.class)
	protected LineaGastoFamiliaPersistence lineaGastoFamiliaPersistence;
	protected TableMapper<LineaGastoCategoria, es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoCategoriaToLineaGastoFamiliaTableMapper;
	@BeanReference(type = LineaGastoPersistence.class)
	protected LineaGastoPersistence lineaGastoPersistence;
	protected TableMapper<LineaGastoCategoria, es.davinciti.liferay.model.LineaGasto> lineaGastoCategoriaToLineaGastoTableMapper;
	private static final String _SQL_SELECT_LINEAGASTOCATEGORIA = "SELECT lineaGastoCategoria FROM LineaGastoCategoria lineaGastoCategoria";
	private static final String _SQL_COUNT_LINEAGASTOCATEGORIA = "SELECT COUNT(lineaGastoCategoria) FROM LineaGastoCategoria lineaGastoCategoria";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lineaGastoCategoria.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LineaGastoCategoria exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LineaGastoCategoriaPersistenceImpl.class);
	private static LineaGastoCategoria _nullLineaGastoCategoria = new LineaGastoCategoriaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LineaGastoCategoria> toCacheModel() {
				return _nullLineaGastoCategoriaCacheModel;
			}
		};

	private static CacheModel<LineaGastoCategoria> _nullLineaGastoCategoriaCacheModel =
		new CacheModel<LineaGastoCategoria>() {
			@Override
			public LineaGastoCategoria toEntityModel() {
				return _nullLineaGastoCategoria;
			}
		};
}