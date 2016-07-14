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

import es.davinciti.liferay.NoSuchLineaGastoProyectoException;
import es.davinciti.liferay.model.LineaGastoProyecto;
import es.davinciti.liferay.model.impl.LineaGastoProyectoImpl;
import es.davinciti.liferay.model.impl.LineaGastoProyectoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the linea gasto proyecto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoProyectoPersistence
 * @see LineaGastoProyectoUtil
 * @generated
 */
public class LineaGastoProyectoPersistenceImpl extends BasePersistenceImpl<LineaGastoProyecto>
	implements LineaGastoProyectoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LineaGastoProyectoUtil} to access the linea gasto proyecto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LineaGastoProyectoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LineaGastoProyectoModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoProyectoModelImpl.FINDER_CACHE_ENABLED,
			LineaGastoProyectoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LineaGastoProyectoModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoProyectoModelImpl.FINDER_CACHE_ENABLED,
			LineaGastoProyectoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LineaGastoProyectoModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoProyectoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LineaGastoProyectoPersistenceImpl() {
		setModelClass(LineaGastoProyecto.class);
	}

	/**
	 * Caches the linea gasto proyecto in the entity cache if it is enabled.
	 *
	 * @param lineaGastoProyecto the linea gasto proyecto
	 */
	@Override
	public void cacheResult(LineaGastoProyecto lineaGastoProyecto) {
		EntityCacheUtil.putResult(LineaGastoProyectoModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoProyectoImpl.class, lineaGastoProyecto.getPrimaryKey(),
			lineaGastoProyecto);

		lineaGastoProyecto.resetOriginalValues();
	}

	/**
	 * Caches the linea gasto proyectos in the entity cache if it is enabled.
	 *
	 * @param lineaGastoProyectos the linea gasto proyectos
	 */
	@Override
	public void cacheResult(List<LineaGastoProyecto> lineaGastoProyectos) {
		for (LineaGastoProyecto lineaGastoProyecto : lineaGastoProyectos) {
			if (EntityCacheUtil.getResult(
						LineaGastoProyectoModelImpl.ENTITY_CACHE_ENABLED,
						LineaGastoProyectoImpl.class,
						lineaGastoProyecto.getPrimaryKey()) == null) {
				cacheResult(lineaGastoProyecto);
			}
			else {
				lineaGastoProyecto.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all linea gasto proyectos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LineaGastoProyectoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LineaGastoProyectoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the linea gasto proyecto.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LineaGastoProyecto lineaGastoProyecto) {
		EntityCacheUtil.removeResult(LineaGastoProyectoModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoProyectoImpl.class, lineaGastoProyecto.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LineaGastoProyecto> lineaGastoProyectos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LineaGastoProyecto lineaGastoProyecto : lineaGastoProyectos) {
			EntityCacheUtil.removeResult(LineaGastoProyectoModelImpl.ENTITY_CACHE_ENABLED,
				LineaGastoProyectoImpl.class, lineaGastoProyecto.getPrimaryKey());
		}
	}

	/**
	 * Creates a new linea gasto proyecto with the primary key. Does not add the linea gasto proyecto to the database.
	 *
	 * @param proyectoId the primary key for the new linea gasto proyecto
	 * @return the new linea gasto proyecto
	 */
	@Override
	public LineaGastoProyecto create(long proyectoId) {
		LineaGastoProyecto lineaGastoProyecto = new LineaGastoProyectoImpl();

		lineaGastoProyecto.setNew(true);
		lineaGastoProyecto.setPrimaryKey(proyectoId);

		return lineaGastoProyecto;
	}

	/**
	 * Removes the linea gasto proyecto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param proyectoId the primary key of the linea gasto proyecto
	 * @return the linea gasto proyecto that was removed
	 * @throws es.davinciti.liferay.NoSuchLineaGastoProyectoException if a linea gasto proyecto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoProyecto remove(long proyectoId)
		throws NoSuchLineaGastoProyectoException, SystemException {
		return remove((Serializable)proyectoId);
	}

	/**
	 * Removes the linea gasto proyecto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the linea gasto proyecto
	 * @return the linea gasto proyecto that was removed
	 * @throws es.davinciti.liferay.NoSuchLineaGastoProyectoException if a linea gasto proyecto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoProyecto remove(Serializable primaryKey)
		throws NoSuchLineaGastoProyectoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LineaGastoProyecto lineaGastoProyecto = (LineaGastoProyecto)session.get(LineaGastoProyectoImpl.class,
					primaryKey);

			if (lineaGastoProyecto == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLineaGastoProyectoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lineaGastoProyecto);
		}
		catch (NoSuchLineaGastoProyectoException nsee) {
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
	protected LineaGastoProyecto removeImpl(
		LineaGastoProyecto lineaGastoProyecto) throws SystemException {
		lineaGastoProyecto = toUnwrappedModel(lineaGastoProyecto);

		lineaGastoProyectoToLineaGastoClienteTableMapper.deleteLeftPrimaryKeyTableMappings(lineaGastoProyecto.getPrimaryKey());

		lineaGastoProyectoToLineaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(lineaGastoProyecto.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lineaGastoProyecto)) {
				lineaGastoProyecto = (LineaGastoProyecto)session.get(LineaGastoProyectoImpl.class,
						lineaGastoProyecto.getPrimaryKeyObj());
			}

			if (lineaGastoProyecto != null) {
				session.delete(lineaGastoProyecto);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lineaGastoProyecto != null) {
			clearCache(lineaGastoProyecto);
		}

		return lineaGastoProyecto;
	}

	@Override
	public LineaGastoProyecto updateImpl(
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws SystemException {
		lineaGastoProyecto = toUnwrappedModel(lineaGastoProyecto);

		boolean isNew = lineaGastoProyecto.isNew();

		Session session = null;

		try {
			session = openSession();

			if (lineaGastoProyecto.isNew()) {
				session.save(lineaGastoProyecto);

				lineaGastoProyecto.setNew(false);
			}
			else {
				session.merge(lineaGastoProyecto);
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

		EntityCacheUtil.putResult(LineaGastoProyectoModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoProyectoImpl.class, lineaGastoProyecto.getPrimaryKey(),
			lineaGastoProyecto);

		return lineaGastoProyecto;
	}

	protected LineaGastoProyecto toUnwrappedModel(
		LineaGastoProyecto lineaGastoProyecto) {
		if (lineaGastoProyecto instanceof LineaGastoProyectoImpl) {
			return lineaGastoProyecto;
		}

		LineaGastoProyectoImpl lineaGastoProyectoImpl = new LineaGastoProyectoImpl();

		lineaGastoProyectoImpl.setNew(lineaGastoProyecto.isNew());
		lineaGastoProyectoImpl.setPrimaryKey(lineaGastoProyecto.getPrimaryKey());

		lineaGastoProyectoImpl.setProyectoId(lineaGastoProyecto.getProyectoId());
		lineaGastoProyectoImpl.setName(lineaGastoProyecto.getName());
		lineaGastoProyectoImpl.setDescription(lineaGastoProyecto.getDescription());
		lineaGastoProyectoImpl.setCodeName(lineaGastoProyecto.getCodeName());
		lineaGastoProyectoImpl.setSageCompanyId(lineaGastoProyecto.getSageCompanyId());

		return lineaGastoProyectoImpl;
	}

	/**
	 * Returns the linea gasto proyecto with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the linea gasto proyecto
	 * @return the linea gasto proyecto
	 * @throws es.davinciti.liferay.NoSuchLineaGastoProyectoException if a linea gasto proyecto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoProyecto findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLineaGastoProyectoException, SystemException {
		LineaGastoProyecto lineaGastoProyecto = fetchByPrimaryKey(primaryKey);

		if (lineaGastoProyecto == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLineaGastoProyectoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lineaGastoProyecto;
	}

	/**
	 * Returns the linea gasto proyecto with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoProyectoException} if it could not be found.
	 *
	 * @param proyectoId the primary key of the linea gasto proyecto
	 * @return the linea gasto proyecto
	 * @throws es.davinciti.liferay.NoSuchLineaGastoProyectoException if a linea gasto proyecto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoProyecto findByPrimaryKey(long proyectoId)
		throws NoSuchLineaGastoProyectoException, SystemException {
		return findByPrimaryKey((Serializable)proyectoId);
	}

	/**
	 * Returns the linea gasto proyecto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the linea gasto proyecto
	 * @return the linea gasto proyecto, or <code>null</code> if a linea gasto proyecto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoProyecto fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LineaGastoProyecto lineaGastoProyecto = (LineaGastoProyecto)EntityCacheUtil.getResult(LineaGastoProyectoModelImpl.ENTITY_CACHE_ENABLED,
				LineaGastoProyectoImpl.class, primaryKey);

		if (lineaGastoProyecto == _nullLineaGastoProyecto) {
			return null;
		}

		if (lineaGastoProyecto == null) {
			Session session = null;

			try {
				session = openSession();

				lineaGastoProyecto = (LineaGastoProyecto)session.get(LineaGastoProyectoImpl.class,
						primaryKey);

				if (lineaGastoProyecto != null) {
					cacheResult(lineaGastoProyecto);
				}
				else {
					EntityCacheUtil.putResult(LineaGastoProyectoModelImpl.ENTITY_CACHE_ENABLED,
						LineaGastoProyectoImpl.class, primaryKey,
						_nullLineaGastoProyecto);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LineaGastoProyectoModelImpl.ENTITY_CACHE_ENABLED,
					LineaGastoProyectoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lineaGastoProyecto;
	}

	/**
	 * Returns the linea gasto proyecto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param proyectoId the primary key of the linea gasto proyecto
	 * @return the linea gasto proyecto, or <code>null</code> if a linea gasto proyecto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoProyecto fetchByPrimaryKey(long proyectoId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)proyectoId);
	}

	/**
	 * Returns all the linea gasto proyectos.
	 *
	 * @return the linea gasto proyectos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoProyecto> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the linea gasto proyectos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoProyectoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linea gasto proyectos
	 * @param end the upper bound of the range of linea gasto proyectos (not inclusive)
	 * @return the range of linea gasto proyectos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoProyecto> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto proyectos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoProyectoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linea gasto proyectos
	 * @param end the upper bound of the range of linea gasto proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gasto proyectos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoProyecto> findAll(int start, int end,
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

		List<LineaGastoProyecto> list = (List<LineaGastoProyecto>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LINEAGASTOPROYECTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LINEAGASTOPROYECTO;

				if (pagination) {
					sql = sql.concat(LineaGastoProyectoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LineaGastoProyecto>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LineaGastoProyecto>(list);
				}
				else {
					list = (List<LineaGastoProyecto>)QueryUtil.list(q,
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
	 * Removes all the linea gasto proyectos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LineaGastoProyecto lineaGastoProyecto : findAll()) {
			remove(lineaGastoProyecto);
		}
	}

	/**
	 * Returns the number of linea gasto proyectos.
	 *
	 * @return the number of linea gasto proyectos
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

				Query q = session.createQuery(_SQL_COUNT_LINEAGASTOPROYECTO);

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
	 * Returns all the linea gasto clientes associated with the linea gasto proyecto.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @return the linea gasto clientes associated with the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk) throws SystemException {
		return getLineaGastoClientes(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the linea gasto clientes associated with the linea gasto proyecto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoProyectoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param start the lower bound of the range of linea gasto proyectos
	 * @param end the upper bound of the range of linea gasto proyectos (not inclusive)
	 * @return the range of linea gasto clientes associated with the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk, int start, int end) throws SystemException {
		return getLineaGastoClientes(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto clientes associated with the linea gasto proyecto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoProyectoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param start the lower bound of the range of linea gasto proyectos
	 * @param end the upper bound of the range of linea gasto proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gasto clientes associated with the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return lineaGastoProyectoToLineaGastoClienteTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of linea gasto clientes associated with the linea gasto proyecto.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @return the number of linea gasto clientes associated with the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getLineaGastoClientesSize(long pk) throws SystemException {
		long[] pks = lineaGastoProyectoToLineaGastoClienteTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the linea gasto cliente is associated with the linea gasto proyecto.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoClientePK the primary key of the linea gasto cliente
	 * @return <code>true</code> if the linea gasto cliente is associated with the linea gasto proyecto; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGastoCliente(long pk, long lineaGastoClientePK)
		throws SystemException {
		return lineaGastoProyectoToLineaGastoClienteTableMapper.containsTableMapping(pk,
			lineaGastoClientePK);
	}

	/**
	 * Returns <code>true</code> if the linea gasto proyecto has any linea gasto clientes associated with it.
	 *
	 * @param pk the primary key of the linea gasto proyecto to check for associations with linea gasto clientes
	 * @return <code>true</code> if the linea gasto proyecto has any linea gasto clientes associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGastoClientes(long pk)
		throws SystemException {
		if (getLineaGastoClientesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the linea gasto proyecto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoClientePK the primary key of the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoCliente(long pk, long lineaGastoClientePK)
		throws SystemException {
		lineaGastoProyectoToLineaGastoClienteTableMapper.addTableMapping(pk,
			lineaGastoClientePK);
	}

	/**
	 * Adds an association between the linea gasto proyecto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoCliente the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoCliente(long pk,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws SystemException {
		lineaGastoProyectoToLineaGastoClienteTableMapper.addTableMapping(pk,
			lineaGastoCliente.getPrimaryKey());
	}

	/**
	 * Adds an association between the linea gasto proyecto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoClientePKs the primary keys of the linea gasto clientes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoClientes(long pk, long[] lineaGastoClientePKs)
		throws SystemException {
		for (long lineaGastoClientePK : lineaGastoClientePKs) {
			lineaGastoProyectoToLineaGastoClienteTableMapper.addTableMapping(pk,
				lineaGastoClientePK);
		}
	}

	/**
	 * Adds an association between the linea gasto proyecto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoClientes the linea gasto clientes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoClientes(long pk,
		List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente : lineaGastoClientes) {
			lineaGastoProyectoToLineaGastoClienteTableMapper.addTableMapping(pk,
				lineaGastoCliente.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the linea gasto proyecto and its linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto to clear the associated linea gasto clientes from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearLineaGastoClientes(long pk) throws SystemException {
		lineaGastoProyectoToLineaGastoClienteTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the linea gasto proyecto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoClientePK the primary key of the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoCliente(long pk, long lineaGastoClientePK)
		throws SystemException {
		lineaGastoProyectoToLineaGastoClienteTableMapper.deleteTableMapping(pk,
			lineaGastoClientePK);
	}

	/**
	 * Removes the association between the linea gasto proyecto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoCliente the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoCliente(long pk,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws SystemException {
		lineaGastoProyectoToLineaGastoClienteTableMapper.deleteTableMapping(pk,
			lineaGastoCliente.getPrimaryKey());
	}

	/**
	 * Removes the association between the linea gasto proyecto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoClientePKs the primary keys of the linea gasto clientes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoClientes(long pk, long[] lineaGastoClientePKs)
		throws SystemException {
		for (long lineaGastoClientePK : lineaGastoClientePKs) {
			lineaGastoProyectoToLineaGastoClienteTableMapper.deleteTableMapping(pk,
				lineaGastoClientePK);
		}
	}

	/**
	 * Removes the association between the linea gasto proyecto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoClientes the linea gasto clientes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoClientes(long pk,
		List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente : lineaGastoClientes) {
			lineaGastoProyectoToLineaGastoClienteTableMapper.deleteTableMapping(pk,
				lineaGastoCliente.getPrimaryKey());
		}
	}

	/**
	 * Sets the linea gasto clientes associated with the linea gasto proyecto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoClientePKs the primary keys of the linea gasto clientes to be associated with the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastoClientes(long pk, long[] lineaGastoClientePKs)
		throws SystemException {
		Set<Long> newLineaGastoClientePKsSet = SetUtil.fromArray(lineaGastoClientePKs);
		Set<Long> oldLineaGastoClientePKsSet = SetUtil.fromArray(lineaGastoProyectoToLineaGastoClienteTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeLineaGastoClientePKsSet = new HashSet<Long>(oldLineaGastoClientePKsSet);

		removeLineaGastoClientePKsSet.removeAll(newLineaGastoClientePKsSet);

		for (long removeLineaGastoClientePK : removeLineaGastoClientePKsSet) {
			lineaGastoProyectoToLineaGastoClienteTableMapper.deleteTableMapping(pk,
				removeLineaGastoClientePK);
		}

		newLineaGastoClientePKsSet.removeAll(oldLineaGastoClientePKsSet);

		for (long newLineaGastoClientePK : newLineaGastoClientePKsSet) {
			lineaGastoProyectoToLineaGastoClienteTableMapper.addTableMapping(pk,
				newLineaGastoClientePK);
		}
	}

	/**
	 * Sets the linea gasto clientes associated with the linea gasto proyecto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoClientes the linea gasto clientes to be associated with the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastoClientes(long pk,
		List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws SystemException {
		try {
			long[] lineaGastoClientePKs = new long[lineaGastoClientes.size()];

			for (int i = 0; i < lineaGastoClientes.size(); i++) {
				es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente = lineaGastoClientes.get(i);

				lineaGastoClientePKs[i] = lineaGastoCliente.getPrimaryKey();
			}

			setLineaGastoClientes(pk, lineaGastoClientePKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(LineaGastoProyectoModelImpl.MAPPING_TABLE_CMES_CLIENTES_PROYECTOS_NAME);
		}
	}

	/**
	 * Returns all the linea gastos associated with the linea gasto proyecto.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @return the linea gastos associated with the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk)
		throws SystemException {
		return getLineaGastos(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the linea gastos associated with the linea gasto proyecto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoProyectoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param start the lower bound of the range of linea gasto proyectos
	 * @param end the upper bound of the range of linea gasto proyectos (not inclusive)
	 * @return the range of linea gastos associated with the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk,
		int start, int end) throws SystemException {
		return getLineaGastos(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gastos associated with the linea gasto proyecto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoProyectoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param start the lower bound of the range of linea gasto proyectos
	 * @param end the upper bound of the range of linea gasto proyectos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gastos associated with the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return lineaGastoProyectoToLineaGastoTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of linea gastos associated with the linea gasto proyecto.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @return the number of linea gastos associated with the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getLineaGastosSize(long pk) throws SystemException {
		long[] pks = lineaGastoProyectoToLineaGastoTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the linea gasto is associated with the linea gasto proyecto.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @return <code>true</code> if the linea gasto is associated with the linea gasto proyecto; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		return lineaGastoProyectoToLineaGastoTableMapper.containsTableMapping(pk,
			lineaGastoPK);
	}

	/**
	 * Returns <code>true</code> if the linea gasto proyecto has any linea gastos associated with it.
	 *
	 * @param pk the primary key of the linea gasto proyecto to check for associations with linea gastos
	 * @return <code>true</code> if the linea gasto proyecto has any linea gastos associated with it; <code>false</code> otherwise
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
	 * Adds an association between the linea gasto proyecto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		lineaGastoProyectoToLineaGastoTableMapper.addTableMapping(pk,
			lineaGastoPK);
	}

	/**
	 * Adds an association between the linea gasto proyecto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGasto the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws SystemException {
		lineaGastoProyectoToLineaGastoTableMapper.addTableMapping(pk,
			lineaGasto.getPrimaryKey());
	}

	/**
	 * Adds an association between the linea gasto proyecto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoPKs the primary keys of the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		for (long lineaGastoPK : lineaGastoPKs) {
			lineaGastoProyectoToLineaGastoTableMapper.addTableMapping(pk,
				lineaGastoPK);
		}
	}

	/**
	 * Adds an association between the linea gasto proyecto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastos the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastos(long pk,
		List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGasto lineaGasto : lineaGastos) {
			lineaGastoProyectoToLineaGastoTableMapper.addTableMapping(pk,
				lineaGasto.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the linea gasto proyecto and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto to clear the associated linea gastos from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearLineaGastos(long pk) throws SystemException {
		lineaGastoProyectoToLineaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the linea gasto proyecto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		lineaGastoProyectoToLineaGastoTableMapper.deleteTableMapping(pk,
			lineaGastoPK);
	}

	/**
	 * Removes the association between the linea gasto proyecto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGasto the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws SystemException {
		lineaGastoProyectoToLineaGastoTableMapper.deleteTableMapping(pk,
			lineaGasto.getPrimaryKey());
	}

	/**
	 * Removes the association between the linea gasto proyecto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoPKs the primary keys of the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		for (long lineaGastoPK : lineaGastoPKs) {
			lineaGastoProyectoToLineaGastoTableMapper.deleteTableMapping(pk,
				lineaGastoPK);
		}
	}

	/**
	 * Removes the association between the linea gasto proyecto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastos the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastos(long pk,
		List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGasto lineaGasto : lineaGastos) {
			lineaGastoProyectoToLineaGastoTableMapper.deleteTableMapping(pk,
				lineaGasto.getPrimaryKey());
		}
	}

	/**
	 * Sets the linea gastos associated with the linea gasto proyecto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastoPKs the primary keys of the linea gastos to be associated with the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		Set<Long> newLineaGastoPKsSet = SetUtil.fromArray(lineaGastoPKs);
		Set<Long> oldLineaGastoPKsSet = SetUtil.fromArray(lineaGastoProyectoToLineaGastoTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeLineaGastoPKsSet = new HashSet<Long>(oldLineaGastoPKsSet);

		removeLineaGastoPKsSet.removeAll(newLineaGastoPKsSet);

		for (long removeLineaGastoPK : removeLineaGastoPKsSet) {
			lineaGastoProyectoToLineaGastoTableMapper.deleteTableMapping(pk,
				removeLineaGastoPK);
		}

		newLineaGastoPKsSet.removeAll(oldLineaGastoPKsSet);

		for (long newLineaGastoPK : newLineaGastoPKsSet) {
			lineaGastoProyectoToLineaGastoTableMapper.addTableMapping(pk,
				newLineaGastoPK);
		}
	}

	/**
	 * Sets the linea gastos associated with the linea gasto proyecto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto proyecto
	 * @param lineaGastos the linea gastos to be associated with the linea gasto proyecto
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
			FinderCacheUtil.clearCache(LineaGastoProyectoModelImpl.MAPPING_TABLE_CMES_LINEAS_PROYECTOS_NAME);
		}
	}

	/**
	 * Initializes the linea gasto proyecto persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.LineaGastoProyecto")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LineaGastoProyecto>> listenersList = new ArrayList<ModelListener<LineaGastoProyecto>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LineaGastoProyecto>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		lineaGastoProyectoToLineaGastoClienteTableMapper = TableMapperFactory.getTableMapper("CMES_Clientes_Proyectos",
				"proyectoId", "clienteId", this, lineaGastoClientePersistence);

		lineaGastoProyectoToLineaGastoTableMapper = TableMapperFactory.getTableMapper("CMES_Lineas_Proyectos",
				"proyectoId", "lineagastoId", this, lineaGastoPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(LineaGastoProyectoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("CMES_Clientes_Proyectos");
		TableMapperFactory.removeTableMapper("CMES_Lineas_Proyectos");
	}

	@BeanReference(type = LineaGastoClientePersistence.class)
	protected LineaGastoClientePersistence lineaGastoClientePersistence;
	protected TableMapper<LineaGastoProyecto, es.davinciti.liferay.model.LineaGastoCliente> lineaGastoProyectoToLineaGastoClienteTableMapper;
	@BeanReference(type = LineaGastoPersistence.class)
	protected LineaGastoPersistence lineaGastoPersistence;
	protected TableMapper<LineaGastoProyecto, es.davinciti.liferay.model.LineaGasto> lineaGastoProyectoToLineaGastoTableMapper;
	private static final String _SQL_SELECT_LINEAGASTOPROYECTO = "SELECT lineaGastoProyecto FROM LineaGastoProyecto lineaGastoProyecto";
	private static final String _SQL_COUNT_LINEAGASTOPROYECTO = "SELECT COUNT(lineaGastoProyecto) FROM LineaGastoProyecto lineaGastoProyecto";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lineaGastoProyecto.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LineaGastoProyecto exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LineaGastoProyectoPersistenceImpl.class);
	private static LineaGastoProyecto _nullLineaGastoProyecto = new LineaGastoProyectoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LineaGastoProyecto> toCacheModel() {
				return _nullLineaGastoProyectoCacheModel;
			}
		};

	private static CacheModel<LineaGastoProyecto> _nullLineaGastoProyectoCacheModel =
		new CacheModel<LineaGastoProyecto>() {
			@Override
			public LineaGastoProyecto toEntityModel() {
				return _nullLineaGastoProyecto;
			}
		};
}