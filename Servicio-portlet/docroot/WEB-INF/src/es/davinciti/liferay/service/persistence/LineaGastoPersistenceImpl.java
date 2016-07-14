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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import es.davinciti.liferay.NoSuchLineaGastoException;
import es.davinciti.liferay.model.LineaGasto;
import es.davinciti.liferay.model.impl.LineaGastoImpl;
import es.davinciti.liferay.model.impl.LineaGastoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the linea gasto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoPersistence
 * @see LineaGastoUtil
 * @generated
 */
public class LineaGastoPersistenceImpl extends BasePersistenceImpl<LineaGasto>
	implements LineaGastoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LineaGastoUtil} to access the linea gasto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LineaGastoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LineaGastoModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoModelImpl.FINDER_CACHE_ENABLED, LineaGastoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LineaGastoModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoModelImpl.FINDER_CACHE_ENABLED, LineaGastoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LineaGastoModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATE = new FinderPath(LineaGastoModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoModelImpl.FINDER_CACHE_ENABLED, LineaGastoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDate",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATE = new FinderPath(LineaGastoModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoModelImpl.FINDER_CACHE_ENABLED, LineaGastoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDate",
			new String[] { String.class.getName() },
			LineaGastoModelImpl.DATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATE = new FinderPath(LineaGastoModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDate",
			new String[] { String.class.getName() });

	/**
	 * Returns all the linea gastos where date = &#63;.
	 *
	 * @param date the date
	 * @return the matching linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGasto> findByDate(String date) throws SystemException {
		return findByDate(date, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the linea gastos where date = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param date the date
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @return the range of matching linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGasto> findByDate(String date, int start, int end)
		throws SystemException {
		return findByDate(date, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gastos where date = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param date the date
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGasto> findByDate(String date, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATE;
			finderArgs = new Object[] { date };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATE;
			finderArgs = new Object[] { date, start, end, orderByComparator };
		}

		List<LineaGasto> list = (List<LineaGasto>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LineaGasto lineaGasto : list) {
				if (!Validator.equals(date, lineaGasto.getDate())) {
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

			query.append(_SQL_SELECT_LINEAGASTO_WHERE);

			boolean bindDate = false;

			if (date == null) {
				query.append(_FINDER_COLUMN_DATE_DATE_1);
			}
			else if (date.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DATE_DATE_3);
			}
			else {
				bindDate = true;

				query.append(_FINDER_COLUMN_DATE_DATE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LineaGastoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDate) {
					qPos.add(date);
				}

				if (!pagination) {
					list = (List<LineaGasto>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LineaGasto>(list);
				}
				else {
					list = (List<LineaGasto>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first linea gasto in the ordered set where date = &#63;.
	 *
	 * @param date the date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching linea gasto
	 * @throws es.davinciti.liferay.NoSuchLineaGastoException if a matching linea gasto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGasto findByDate_First(String date,
		OrderByComparator orderByComparator)
		throws NoSuchLineaGastoException, SystemException {
		LineaGasto lineaGasto = fetchByDate_First(date, orderByComparator);

		if (lineaGasto != null) {
			return lineaGasto;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("date=");
		msg.append(date);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLineaGastoException(msg.toString());
	}

	/**
	 * Returns the first linea gasto in the ordered set where date = &#63;.
	 *
	 * @param date the date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching linea gasto, or <code>null</code> if a matching linea gasto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGasto fetchByDate_First(String date,
		OrderByComparator orderByComparator) throws SystemException {
		List<LineaGasto> list = findByDate(date, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last linea gasto in the ordered set where date = &#63;.
	 *
	 * @param date the date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching linea gasto
	 * @throws es.davinciti.liferay.NoSuchLineaGastoException if a matching linea gasto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGasto findByDate_Last(String date,
		OrderByComparator orderByComparator)
		throws NoSuchLineaGastoException, SystemException {
		LineaGasto lineaGasto = fetchByDate_Last(date, orderByComparator);

		if (lineaGasto != null) {
			return lineaGasto;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("date=");
		msg.append(date);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLineaGastoException(msg.toString());
	}

	/**
	 * Returns the last linea gasto in the ordered set where date = &#63;.
	 *
	 * @param date the date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching linea gasto, or <code>null</code> if a matching linea gasto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGasto fetchByDate_Last(String date,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDate(date);

		if (count == 0) {
			return null;
		}

		List<LineaGasto> list = findByDate(date, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the linea gastos before and after the current linea gasto in the ordered set where date = &#63;.
	 *
	 * @param lineagastoId the primary key of the current linea gasto
	 * @param date the date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next linea gasto
	 * @throws es.davinciti.liferay.NoSuchLineaGastoException if a linea gasto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGasto[] findByDate_PrevAndNext(long lineagastoId, String date,
		OrderByComparator orderByComparator)
		throws NoSuchLineaGastoException, SystemException {
		LineaGasto lineaGasto = findByPrimaryKey(lineagastoId);

		Session session = null;

		try {
			session = openSession();

			LineaGasto[] array = new LineaGastoImpl[3];

			array[0] = getByDate_PrevAndNext(session, lineaGasto, date,
					orderByComparator, true);

			array[1] = lineaGasto;

			array[2] = getByDate_PrevAndNext(session, lineaGasto, date,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LineaGasto getByDate_PrevAndNext(Session session,
		LineaGasto lineaGasto, String date,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LINEAGASTO_WHERE);

		boolean bindDate = false;

		if (date == null) {
			query.append(_FINDER_COLUMN_DATE_DATE_1);
		}
		else if (date.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DATE_DATE_3);
		}
		else {
			bindDate = true;

			query.append(_FINDER_COLUMN_DATE_DATE_2);
		}

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
			query.append(LineaGastoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDate) {
			qPos.add(date);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lineaGasto);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LineaGasto> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the linea gastos where date = &#63; from the database.
	 *
	 * @param date the date
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDate(String date) throws SystemException {
		for (LineaGasto lineaGasto : findByDate(date, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(lineaGasto);
		}
	}

	/**
	 * Returns the number of linea gastos where date = &#63;.
	 *
	 * @param date the date
	 * @return the number of matching linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDate(String date) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DATE;

		Object[] finderArgs = new Object[] { date };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LINEAGASTO_WHERE);

			boolean bindDate = false;

			if (date == null) {
				query.append(_FINDER_COLUMN_DATE_DATE_1);
			}
			else if (date.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DATE_DATE_3);
			}
			else {
				bindDate = true;

				query.append(_FINDER_COLUMN_DATE_DATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDate) {
					qPos.add(date);
				}

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

	private static final String _FINDER_COLUMN_DATE_DATE_1 = "lineaGasto.date IS NULL";
	private static final String _FINDER_COLUMN_DATE_DATE_2 = "lineaGasto.date = ?";
	private static final String _FINDER_COLUMN_DATE_DATE_3 = "(lineaGasto.date IS NULL OR lineaGasto.date = '')";

	public LineaGastoPersistenceImpl() {
		setModelClass(LineaGasto.class);
	}

	/**
	 * Caches the linea gasto in the entity cache if it is enabled.
	 *
	 * @param lineaGasto the linea gasto
	 */
	@Override
	public void cacheResult(LineaGasto lineaGasto) {
		EntityCacheUtil.putResult(LineaGastoModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoImpl.class, lineaGasto.getPrimaryKey(), lineaGasto);

		lineaGasto.resetOriginalValues();
	}

	/**
	 * Caches the linea gastos in the entity cache if it is enabled.
	 *
	 * @param lineaGastos the linea gastos
	 */
	@Override
	public void cacheResult(List<LineaGasto> lineaGastos) {
		for (LineaGasto lineaGasto : lineaGastos) {
			if (EntityCacheUtil.getResult(
						LineaGastoModelImpl.ENTITY_CACHE_ENABLED,
						LineaGastoImpl.class, lineaGasto.getPrimaryKey()) == null) {
				cacheResult(lineaGasto);
			}
			else {
				lineaGasto.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all linea gastos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LineaGastoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LineaGastoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the linea gasto.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LineaGasto lineaGasto) {
		EntityCacheUtil.removeResult(LineaGastoModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoImpl.class, lineaGasto.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LineaGasto> lineaGastos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LineaGasto lineaGasto : lineaGastos) {
			EntityCacheUtil.removeResult(LineaGastoModelImpl.ENTITY_CACHE_ENABLED,
				LineaGastoImpl.class, lineaGasto.getPrimaryKey());
		}
	}

	/**
	 * Creates a new linea gasto with the primary key. Does not add the linea gasto to the database.
	 *
	 * @param lineagastoId the primary key for the new linea gasto
	 * @return the new linea gasto
	 */
	@Override
	public LineaGasto create(long lineagastoId) {
		LineaGasto lineaGasto = new LineaGastoImpl();

		lineaGasto.setNew(true);
		lineaGasto.setPrimaryKey(lineagastoId);

		return lineaGasto;
	}

	/**
	 * Removes the linea gasto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lineagastoId the primary key of the linea gasto
	 * @return the linea gasto that was removed
	 * @throws es.davinciti.liferay.NoSuchLineaGastoException if a linea gasto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGasto remove(long lineagastoId)
		throws NoSuchLineaGastoException, SystemException {
		return remove((Serializable)lineagastoId);
	}

	/**
	 * Removes the linea gasto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the linea gasto
	 * @return the linea gasto that was removed
	 * @throws es.davinciti.liferay.NoSuchLineaGastoException if a linea gasto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGasto remove(Serializable primaryKey)
		throws NoSuchLineaGastoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LineaGasto lineaGasto = (LineaGasto)session.get(LineaGastoImpl.class,
					primaryKey);

			if (lineaGasto == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLineaGastoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lineaGasto);
		}
		catch (NoSuchLineaGastoException nsee) {
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
	protected LineaGasto removeImpl(LineaGasto lineaGasto)
		throws SystemException {
		lineaGasto = toUnwrappedModel(lineaGasto);

		lineaGastoToNotaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(lineaGasto.getPrimaryKey());

		lineaGastoToLineaGastoPayModeTableMapper.deleteLeftPrimaryKeyTableMappings(lineaGasto.getPrimaryKey());

		lineaGastoToCurrencyTableMapper.deleteLeftPrimaryKeyTableMappings(lineaGasto.getPrimaryKey());

		lineaGastoToLineaGastoFamiliaTableMapper.deleteLeftPrimaryKeyTableMappings(lineaGasto.getPrimaryKey());

		lineaGastoToLineaGastoCategoriaTableMapper.deleteLeftPrimaryKeyTableMappings(lineaGasto.getPrimaryKey());

		lineaGastoToLineaGastoClienteTableMapper.deleteLeftPrimaryKeyTableMappings(lineaGasto.getPrimaryKey());

		lineaGastoToLineaGastoProyectoTableMapper.deleteLeftPrimaryKeyTableMappings(lineaGasto.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lineaGasto)) {
				lineaGasto = (LineaGasto)session.get(LineaGastoImpl.class,
						lineaGasto.getPrimaryKeyObj());
			}

			if (lineaGasto != null) {
				session.delete(lineaGasto);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lineaGasto != null) {
			clearCache(lineaGasto);
		}

		return lineaGasto;
	}

	@Override
	public LineaGasto updateImpl(
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws SystemException {
		lineaGasto = toUnwrappedModel(lineaGasto);

		boolean isNew = lineaGasto.isNew();

		LineaGastoModelImpl lineaGastoModelImpl = (LineaGastoModelImpl)lineaGasto;

		Session session = null;

		try {
			session = openSession();

			if (lineaGasto.isNew()) {
				session.save(lineaGasto);

				lineaGasto.setNew(false);
			}
			else {
				session.merge(lineaGasto);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LineaGastoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((lineaGastoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lineaGastoModelImpl.getOriginalDate()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATE,
					args);

				args = new Object[] { lineaGastoModelImpl.getDate() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATE,
					args);
			}
		}

		EntityCacheUtil.putResult(LineaGastoModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoImpl.class, lineaGasto.getPrimaryKey(), lineaGasto);

		return lineaGasto;
	}

	protected LineaGasto toUnwrappedModel(LineaGasto lineaGasto) {
		if (lineaGasto instanceof LineaGastoImpl) {
			return lineaGasto;
		}

		LineaGastoImpl lineaGastoImpl = new LineaGastoImpl();

		lineaGastoImpl.setNew(lineaGasto.isNew());
		lineaGastoImpl.setPrimaryKey(lineaGasto.getPrimaryKey());

		lineaGastoImpl.setLineagastoId(lineaGasto.getLineagastoId());
		lineaGastoImpl.setDate(lineaGasto.getDate());
		lineaGastoImpl.setAmount(lineaGasto.getAmount());
		lineaGastoImpl.setDocumentId(lineaGasto.getDocumentId());
		lineaGastoImpl.setComments(lineaGasto.getComments());
		lineaGastoImpl.setStatus(lineaGasto.getStatus());
		lineaGastoImpl.setPrice(lineaGasto.getPrice());
		lineaGastoImpl.setQuantity(lineaGasto.getQuantity());

		return lineaGastoImpl;
	}

	/**
	 * Returns the linea gasto with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the linea gasto
	 * @return the linea gasto
	 * @throws es.davinciti.liferay.NoSuchLineaGastoException if a linea gasto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGasto findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLineaGastoException, SystemException {
		LineaGasto lineaGasto = fetchByPrimaryKey(primaryKey);

		if (lineaGasto == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLineaGastoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lineaGasto;
	}

	/**
	 * Returns the linea gasto with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoException} if it could not be found.
	 *
	 * @param lineagastoId the primary key of the linea gasto
	 * @return the linea gasto
	 * @throws es.davinciti.liferay.NoSuchLineaGastoException if a linea gasto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGasto findByPrimaryKey(long lineagastoId)
		throws NoSuchLineaGastoException, SystemException {
		return findByPrimaryKey((Serializable)lineagastoId);
	}

	/**
	 * Returns the linea gasto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the linea gasto
	 * @return the linea gasto, or <code>null</code> if a linea gasto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGasto fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LineaGasto lineaGasto = (LineaGasto)EntityCacheUtil.getResult(LineaGastoModelImpl.ENTITY_CACHE_ENABLED,
				LineaGastoImpl.class, primaryKey);

		if (lineaGasto == _nullLineaGasto) {
			return null;
		}

		if (lineaGasto == null) {
			Session session = null;

			try {
				session = openSession();

				lineaGasto = (LineaGasto)session.get(LineaGastoImpl.class,
						primaryKey);

				if (lineaGasto != null) {
					cacheResult(lineaGasto);
				}
				else {
					EntityCacheUtil.putResult(LineaGastoModelImpl.ENTITY_CACHE_ENABLED,
						LineaGastoImpl.class, primaryKey, _nullLineaGasto);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LineaGastoModelImpl.ENTITY_CACHE_ENABLED,
					LineaGastoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lineaGasto;
	}

	/**
	 * Returns the linea gasto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param lineagastoId the primary key of the linea gasto
	 * @return the linea gasto, or <code>null</code> if a linea gasto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGasto fetchByPrimaryKey(long lineagastoId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)lineagastoId);
	}

	/**
	 * Returns all the linea gastos.
	 *
	 * @return the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGasto> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the linea gastos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @return the range of linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGasto> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gastos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGasto> findAll(int start, int end,
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

		List<LineaGasto> list = (List<LineaGasto>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LINEAGASTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LINEAGASTO;

				if (pagination) {
					sql = sql.concat(LineaGastoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LineaGasto>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LineaGasto>(list);
				}
				else {
					list = (List<LineaGasto>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the linea gastos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LineaGasto lineaGasto : findAll()) {
			remove(lineaGasto);
		}
	}

	/**
	 * Returns the number of linea gastos.
	 *
	 * @return the number of linea gastos
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

				Query q = session.createQuery(_SQL_COUNT_LINEAGASTO);

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
	 * Returns all the nota gastos associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @return the nota gastos associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(long pk)
		throws SystemException {
		return getNotaGastos(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the nota gastos associated with the linea gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @return the range of nota gastos associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(long pk,
		int start, int end) throws SystemException {
		return getNotaGastos(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nota gastos associated with the linea gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nota gastos associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return lineaGastoToNotaGastoTableMapper.getRightBaseModels(pk, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of nota gastos associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @return the number of nota gastos associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getNotaGastosSize(long pk) throws SystemException {
		long[] pks = lineaGastoToNotaGastoTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the nota gasto is associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param notaGastoPK the primary key of the nota gasto
	 * @return <code>true</code> if the nota gasto is associated with the linea gasto; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsNotaGasto(long pk, long notaGastoPK)
		throws SystemException {
		return lineaGastoToNotaGastoTableMapper.containsTableMapping(pk,
			notaGastoPK);
	}

	/**
	 * Returns <code>true</code> if the linea gasto has any nota gastos associated with it.
	 *
	 * @param pk the primary key of the linea gasto to check for associations with nota gastos
	 * @return <code>true</code> if the linea gasto has any nota gastos associated with it; <code>false</code> otherwise
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
	 * Adds an association between the linea gasto and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param notaGastoPK the primary key of the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addNotaGasto(long pk, long notaGastoPK)
		throws SystemException {
		lineaGastoToNotaGastoTableMapper.addTableMapping(pk, notaGastoPK);
	}

	/**
	 * Adds an association between the linea gasto and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param notaGasto the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addNotaGasto(long pk,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws SystemException {
		lineaGastoToNotaGastoTableMapper.addTableMapping(pk,
			notaGasto.getPrimaryKey());
	}

	/**
	 * Adds an association between the linea gasto and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param notaGastoPKs the primary keys of the nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addNotaGastos(long pk, long[] notaGastoPKs)
		throws SystemException {
		for (long notaGastoPK : notaGastoPKs) {
			lineaGastoToNotaGastoTableMapper.addTableMapping(pk, notaGastoPK);
		}
	}

	/**
	 * Adds an association between the linea gasto and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param notaGastos the nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addNotaGastos(long pk,
		List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.NotaGasto notaGasto : notaGastos) {
			lineaGastoToNotaGastoTableMapper.addTableMapping(pk,
				notaGasto.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the linea gasto and its nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto to clear the associated nota gastos from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearNotaGastos(long pk) throws SystemException {
		lineaGastoToNotaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the linea gasto and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param notaGastoPK the primary key of the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeNotaGasto(long pk, long notaGastoPK)
		throws SystemException {
		lineaGastoToNotaGastoTableMapper.deleteTableMapping(pk, notaGastoPK);
	}

	/**
	 * Removes the association between the linea gasto and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param notaGasto the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeNotaGasto(long pk,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws SystemException {
		lineaGastoToNotaGastoTableMapper.deleteTableMapping(pk,
			notaGasto.getPrimaryKey());
	}

	/**
	 * Removes the association between the linea gasto and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param notaGastoPKs the primary keys of the nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeNotaGastos(long pk, long[] notaGastoPKs)
		throws SystemException {
		for (long notaGastoPK : notaGastoPKs) {
			lineaGastoToNotaGastoTableMapper.deleteTableMapping(pk, notaGastoPK);
		}
	}

	/**
	 * Removes the association between the linea gasto and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param notaGastos the nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeNotaGastos(long pk,
		List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.NotaGasto notaGasto : notaGastos) {
			lineaGastoToNotaGastoTableMapper.deleteTableMapping(pk,
				notaGasto.getPrimaryKey());
		}
	}

	/**
	 * Sets the nota gastos associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param notaGastoPKs the primary keys of the nota gastos to be associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setNotaGastos(long pk, long[] notaGastoPKs)
		throws SystemException {
		Set<Long> newNotaGastoPKsSet = SetUtil.fromArray(notaGastoPKs);
		Set<Long> oldNotaGastoPKsSet = SetUtil.fromArray(lineaGastoToNotaGastoTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeNotaGastoPKsSet = new HashSet<Long>(oldNotaGastoPKsSet);

		removeNotaGastoPKsSet.removeAll(newNotaGastoPKsSet);

		for (long removeNotaGastoPK : removeNotaGastoPKsSet) {
			lineaGastoToNotaGastoTableMapper.deleteTableMapping(pk,
				removeNotaGastoPK);
		}

		newNotaGastoPKsSet.removeAll(oldNotaGastoPKsSet);

		for (long newNotaGastoPK : newNotaGastoPKsSet) {
			lineaGastoToNotaGastoTableMapper.addTableMapping(pk, newNotaGastoPK);
		}
	}

	/**
	 * Sets the nota gastos associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param notaGastos the nota gastos to be associated with the linea gasto
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
			FinderCacheUtil.clearCache(LineaGastoModelImpl.MAPPING_TABLE_CMES_NOTAS_LINEAS_NAME);
		}
	}

	/**
	 * Returns all the linea gasto pay modes associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @return the linea gasto pay modes associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoPayMode> getLineaGastoPayModes(
		long pk) throws SystemException {
		return getLineaGastoPayModes(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the linea gasto pay modes associated with the linea gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @return the range of linea gasto pay modes associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoPayMode> getLineaGastoPayModes(
		long pk, int start, int end) throws SystemException {
		return getLineaGastoPayModes(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto pay modes associated with the linea gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gasto pay modes associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoPayMode> getLineaGastoPayModes(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return lineaGastoToLineaGastoPayModeTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of linea gasto pay modes associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @return the number of linea gasto pay modes associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getLineaGastoPayModesSize(long pk) throws SystemException {
		long[] pks = lineaGastoToLineaGastoPayModeTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the linea gasto pay mode is associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoPayModePK the primary key of the linea gasto pay mode
	 * @return <code>true</code> if the linea gasto pay mode is associated with the linea gasto; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGastoPayMode(long pk, long lineaGastoPayModePK)
		throws SystemException {
		return lineaGastoToLineaGastoPayModeTableMapper.containsTableMapping(pk,
			lineaGastoPayModePK);
	}

	/**
	 * Returns <code>true</code> if the linea gasto has any linea gasto pay modes associated with it.
	 *
	 * @param pk the primary key of the linea gasto to check for associations with linea gasto pay modes
	 * @return <code>true</code> if the linea gasto has any linea gasto pay modes associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGastoPayModes(long pk)
		throws SystemException {
		if (getLineaGastoPayModesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto pay mode. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoPayModePK the primary key of the linea gasto pay mode
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoPayMode(long pk, long lineaGastoPayModePK)
		throws SystemException {
		lineaGastoToLineaGastoPayModeTableMapper.addTableMapping(pk,
			lineaGastoPayModePK);
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto pay mode. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoPayMode the linea gasto pay mode
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoPayMode(long pk,
		es.davinciti.liferay.model.LineaGastoPayMode lineaGastoPayMode)
		throws SystemException {
		lineaGastoToLineaGastoPayModeTableMapper.addTableMapping(pk,
			lineaGastoPayMode.getPrimaryKey());
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto pay modes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoPayModePKs the primary keys of the linea gasto pay modes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoPayModes(long pk, long[] lineaGastoPayModePKs)
		throws SystemException {
		for (long lineaGastoPayModePK : lineaGastoPayModePKs) {
			lineaGastoToLineaGastoPayModeTableMapper.addTableMapping(pk,
				lineaGastoPayModePK);
		}
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto pay modes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoPayModes the linea gasto pay modes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoPayModes(long pk,
		List<es.davinciti.liferay.model.LineaGastoPayMode> lineaGastoPayModes)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoPayMode lineaGastoPayMode : lineaGastoPayModes) {
			lineaGastoToLineaGastoPayModeTableMapper.addTableMapping(pk,
				lineaGastoPayMode.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the linea gasto and its linea gasto pay modes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto to clear the associated linea gasto pay modes from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearLineaGastoPayModes(long pk) throws SystemException {
		lineaGastoToLineaGastoPayModeTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto pay mode. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoPayModePK the primary key of the linea gasto pay mode
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoPayMode(long pk, long lineaGastoPayModePK)
		throws SystemException {
		lineaGastoToLineaGastoPayModeTableMapper.deleteTableMapping(pk,
			lineaGastoPayModePK);
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto pay mode. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoPayMode the linea gasto pay mode
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoPayMode(long pk,
		es.davinciti.liferay.model.LineaGastoPayMode lineaGastoPayMode)
		throws SystemException {
		lineaGastoToLineaGastoPayModeTableMapper.deleteTableMapping(pk,
			lineaGastoPayMode.getPrimaryKey());
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto pay modes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoPayModePKs the primary keys of the linea gasto pay modes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoPayModes(long pk, long[] lineaGastoPayModePKs)
		throws SystemException {
		for (long lineaGastoPayModePK : lineaGastoPayModePKs) {
			lineaGastoToLineaGastoPayModeTableMapper.deleteTableMapping(pk,
				lineaGastoPayModePK);
		}
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto pay modes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoPayModes the linea gasto pay modes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoPayModes(long pk,
		List<es.davinciti.liferay.model.LineaGastoPayMode> lineaGastoPayModes)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoPayMode lineaGastoPayMode : lineaGastoPayModes) {
			lineaGastoToLineaGastoPayModeTableMapper.deleteTableMapping(pk,
				lineaGastoPayMode.getPrimaryKey());
		}
	}

	/**
	 * Sets the linea gasto pay modes associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoPayModePKs the primary keys of the linea gasto pay modes to be associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastoPayModes(long pk, long[] lineaGastoPayModePKs)
		throws SystemException {
		Set<Long> newLineaGastoPayModePKsSet = SetUtil.fromArray(lineaGastoPayModePKs);
		Set<Long> oldLineaGastoPayModePKsSet = SetUtil.fromArray(lineaGastoToLineaGastoPayModeTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeLineaGastoPayModePKsSet = new HashSet<Long>(oldLineaGastoPayModePKsSet);

		removeLineaGastoPayModePKsSet.removeAll(newLineaGastoPayModePKsSet);

		for (long removeLineaGastoPayModePK : removeLineaGastoPayModePKsSet) {
			lineaGastoToLineaGastoPayModeTableMapper.deleteTableMapping(pk,
				removeLineaGastoPayModePK);
		}

		newLineaGastoPayModePKsSet.removeAll(oldLineaGastoPayModePKsSet);

		for (long newLineaGastoPayModePK : newLineaGastoPayModePKsSet) {
			lineaGastoToLineaGastoPayModeTableMapper.addTableMapping(pk,
				newLineaGastoPayModePK);
		}
	}

	/**
	 * Sets the linea gasto pay modes associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoPayModes the linea gasto pay modes to be associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastoPayModes(long pk,
		List<es.davinciti.liferay.model.LineaGastoPayMode> lineaGastoPayModes)
		throws SystemException {
		try {
			long[] lineaGastoPayModePKs = new long[lineaGastoPayModes.size()];

			for (int i = 0; i < lineaGastoPayModes.size(); i++) {
				es.davinciti.liferay.model.LineaGastoPayMode lineaGastoPayMode = lineaGastoPayModes.get(i);

				lineaGastoPayModePKs[i] = lineaGastoPayMode.getPrimaryKey();
			}

			setLineaGastoPayModes(pk, lineaGastoPayModePKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(LineaGastoModelImpl.MAPPING_TABLE_CMES_LINEAS_PAYMODES_NAME);
		}
	}

	/**
	 * Returns all the currencies associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @return the currencies associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.Currency> getCurrencies(long pk)
		throws SystemException {
		return getCurrencies(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the currencies associated with the linea gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @return the range of currencies associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.Currency> getCurrencies(long pk,
		int start, int end) throws SystemException {
		return getCurrencies(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the currencies associated with the linea gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of currencies associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.Currency> getCurrencies(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return lineaGastoToCurrencyTableMapper.getRightBaseModels(pk, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of currencies associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @return the number of currencies associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getCurrenciesSize(long pk) throws SystemException {
		long[] pks = lineaGastoToCurrencyTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the currency is associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param currencyPK the primary key of the currency
	 * @return <code>true</code> if the currency is associated with the linea gasto; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsCurrency(long pk, long currencyPK)
		throws SystemException {
		return lineaGastoToCurrencyTableMapper.containsTableMapping(pk,
			currencyPK);
	}

	/**
	 * Returns <code>true</code> if the linea gasto has any currencies associated with it.
	 *
	 * @param pk the primary key of the linea gasto to check for associations with currencies
	 * @return <code>true</code> if the linea gasto has any currencies associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsCurrencies(long pk) throws SystemException {
		if (getCurrenciesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the linea gasto and the currency. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param currencyPK the primary key of the currency
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCurrency(long pk, long currencyPK) throws SystemException {
		lineaGastoToCurrencyTableMapper.addTableMapping(pk, currencyPK);
	}

	/**
	 * Adds an association between the linea gasto and the currency. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param currency the currency
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCurrency(long pk,
		es.davinciti.liferay.model.Currency currency) throws SystemException {
		lineaGastoToCurrencyTableMapper.addTableMapping(pk,
			currency.getPrimaryKey());
	}

	/**
	 * Adds an association between the linea gasto and the currencies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param currencyPKs the primary keys of the currencies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCurrencies(long pk, long[] currencyPKs)
		throws SystemException {
		for (long currencyPK : currencyPKs) {
			lineaGastoToCurrencyTableMapper.addTableMapping(pk, currencyPK);
		}
	}

	/**
	 * Adds an association between the linea gasto and the currencies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param currencies the currencies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCurrencies(long pk,
		List<es.davinciti.liferay.model.Currency> currencies)
		throws SystemException {
		for (es.davinciti.liferay.model.Currency currency : currencies) {
			lineaGastoToCurrencyTableMapper.addTableMapping(pk,
				currency.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the linea gasto and its currencies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto to clear the associated currencies from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearCurrencies(long pk) throws SystemException {
		lineaGastoToCurrencyTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the linea gasto and the currency. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param currencyPK the primary key of the currency
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeCurrency(long pk, long currencyPK)
		throws SystemException {
		lineaGastoToCurrencyTableMapper.deleteTableMapping(pk, currencyPK);
	}

	/**
	 * Removes the association between the linea gasto and the currency. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param currency the currency
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeCurrency(long pk,
		es.davinciti.liferay.model.Currency currency) throws SystemException {
		lineaGastoToCurrencyTableMapper.deleteTableMapping(pk,
			currency.getPrimaryKey());
	}

	/**
	 * Removes the association between the linea gasto and the currencies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param currencyPKs the primary keys of the currencies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeCurrencies(long pk, long[] currencyPKs)
		throws SystemException {
		for (long currencyPK : currencyPKs) {
			lineaGastoToCurrencyTableMapper.deleteTableMapping(pk, currencyPK);
		}
	}

	/**
	 * Removes the association between the linea gasto and the currencies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param currencies the currencies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeCurrencies(long pk,
		List<es.davinciti.liferay.model.Currency> currencies)
		throws SystemException {
		for (es.davinciti.liferay.model.Currency currency : currencies) {
			lineaGastoToCurrencyTableMapper.deleteTableMapping(pk,
				currency.getPrimaryKey());
		}
	}

	/**
	 * Sets the currencies associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param currencyPKs the primary keys of the currencies to be associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setCurrencies(long pk, long[] currencyPKs)
		throws SystemException {
		Set<Long> newCurrencyPKsSet = SetUtil.fromArray(currencyPKs);
		Set<Long> oldCurrencyPKsSet = SetUtil.fromArray(lineaGastoToCurrencyTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeCurrencyPKsSet = new HashSet<Long>(oldCurrencyPKsSet);

		removeCurrencyPKsSet.removeAll(newCurrencyPKsSet);

		for (long removeCurrencyPK : removeCurrencyPKsSet) {
			lineaGastoToCurrencyTableMapper.deleteTableMapping(pk,
				removeCurrencyPK);
		}

		newCurrencyPKsSet.removeAll(oldCurrencyPKsSet);

		for (long newCurrencyPK : newCurrencyPKsSet) {
			lineaGastoToCurrencyTableMapper.addTableMapping(pk, newCurrencyPK);
		}
	}

	/**
	 * Sets the currencies associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param currencies the currencies to be associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setCurrencies(long pk,
		List<es.davinciti.liferay.model.Currency> currencies)
		throws SystemException {
		try {
			long[] currencyPKs = new long[currencies.size()];

			for (int i = 0; i < currencies.size(); i++) {
				es.davinciti.liferay.model.Currency currency = currencies.get(i);

				currencyPKs[i] = currency.getPrimaryKey();
			}

			setCurrencies(pk, currencyPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(LineaGastoModelImpl.MAPPING_TABLE_CMES_LINEAS_CURRENCIES_NAME);
		}
	}

	/**
	 * Returns all the linea gasto familias associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @return the linea gasto familias associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk) throws SystemException {
		return getLineaGastoFamilias(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the linea gasto familias associated with the linea gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @return the range of linea gasto familias associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk, int start, int end) throws SystemException {
		return getLineaGastoFamilias(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto familias associated with the linea gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gasto familias associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoFamilia> getLineaGastoFamilias(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return lineaGastoToLineaGastoFamiliaTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of linea gasto familias associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @return the number of linea gasto familias associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getLineaGastoFamiliasSize(long pk) throws SystemException {
		long[] pks = lineaGastoToLineaGastoFamiliaTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the linea gasto familia is associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	 * @return <code>true</code> if the linea gasto familia is associated with the linea gasto; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGastoFamilia(long pk, long lineaGastoFamiliaPK)
		throws SystemException {
		return lineaGastoToLineaGastoFamiliaTableMapper.containsTableMapping(pk,
			lineaGastoFamiliaPK);
	}

	/**
	 * Returns <code>true</code> if the linea gasto has any linea gasto familias associated with it.
	 *
	 * @param pk the primary key of the linea gasto to check for associations with linea gasto familias
	 * @return <code>true</code> if the linea gasto has any linea gasto familias associated with it; <code>false</code> otherwise
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
	 * Adds an association between the linea gasto and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoFamilia(long pk, long lineaGastoFamiliaPK)
		throws SystemException {
		lineaGastoToLineaGastoFamiliaTableMapper.addTableMapping(pk,
			lineaGastoFamiliaPK);
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoFamilia the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoFamilia(long pk,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws SystemException {
		lineaGastoToLineaGastoFamiliaTableMapper.addTableMapping(pk,
			lineaGastoFamilia.getPrimaryKey());
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoFamilias(long pk, long[] lineaGastoFamiliaPKs)
		throws SystemException {
		for (long lineaGastoFamiliaPK : lineaGastoFamiliaPKs) {
			lineaGastoToLineaGastoFamiliaTableMapper.addTableMapping(pk,
				lineaGastoFamiliaPK);
		}
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoFamilias the linea gasto familias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoFamilias(long pk,
		List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia : lineaGastoFamilias) {
			lineaGastoToLineaGastoFamiliaTableMapper.addTableMapping(pk,
				lineaGastoFamilia.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the linea gasto and its linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto to clear the associated linea gasto familias from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearLineaGastoFamilias(long pk) throws SystemException {
		lineaGastoToLineaGastoFamiliaTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoFamiliaPK the primary key of the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoFamilia(long pk, long lineaGastoFamiliaPK)
		throws SystemException {
		lineaGastoToLineaGastoFamiliaTableMapper.deleteTableMapping(pk,
			lineaGastoFamiliaPK);
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto familia. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoFamilia the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoFamilia(long pk,
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws SystemException {
		lineaGastoToLineaGastoFamiliaTableMapper.deleteTableMapping(pk,
			lineaGastoFamilia.getPrimaryKey());
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoFamilias(long pk, long[] lineaGastoFamiliaPKs)
		throws SystemException {
		for (long lineaGastoFamiliaPK : lineaGastoFamiliaPKs) {
			lineaGastoToLineaGastoFamiliaTableMapper.deleteTableMapping(pk,
				lineaGastoFamiliaPK);
		}
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto familias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoFamilias the linea gasto familias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoFamilias(long pk,
		List<es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoFamilias)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia : lineaGastoFamilias) {
			lineaGastoToLineaGastoFamiliaTableMapper.deleteTableMapping(pk,
				lineaGastoFamilia.getPrimaryKey());
		}
	}

	/**
	 * Sets the linea gasto familias associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoFamiliaPKs the primary keys of the linea gasto familias to be associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastoFamilias(long pk, long[] lineaGastoFamiliaPKs)
		throws SystemException {
		Set<Long> newLineaGastoFamiliaPKsSet = SetUtil.fromArray(lineaGastoFamiliaPKs);
		Set<Long> oldLineaGastoFamiliaPKsSet = SetUtil.fromArray(lineaGastoToLineaGastoFamiliaTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeLineaGastoFamiliaPKsSet = new HashSet<Long>(oldLineaGastoFamiliaPKsSet);

		removeLineaGastoFamiliaPKsSet.removeAll(newLineaGastoFamiliaPKsSet);

		for (long removeLineaGastoFamiliaPK : removeLineaGastoFamiliaPKsSet) {
			lineaGastoToLineaGastoFamiliaTableMapper.deleteTableMapping(pk,
				removeLineaGastoFamiliaPK);
		}

		newLineaGastoFamiliaPKsSet.removeAll(oldLineaGastoFamiliaPKsSet);

		for (long newLineaGastoFamiliaPK : newLineaGastoFamiliaPKsSet) {
			lineaGastoToLineaGastoFamiliaTableMapper.addTableMapping(pk,
				newLineaGastoFamiliaPK);
		}
	}

	/**
	 * Sets the linea gasto familias associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoFamilias the linea gasto familias to be associated with the linea gasto
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
			FinderCacheUtil.clearCache(LineaGastoModelImpl.MAPPING_TABLE_CMES_LINEAS_FAMILIAS_NAME);
		}
	}

	/**
	 * Returns all the linea gasto categorias associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @return the linea gasto categorias associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk) throws SystemException {
		return getLineaGastoCategorias(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the linea gasto categorias associated with the linea gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @return the range of linea gasto categorias associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk, int start, int end) throws SystemException {
		return getLineaGastoCategorias(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto categorias associated with the linea gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gasto categorias associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return lineaGastoToLineaGastoCategoriaTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of linea gasto categorias associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @return the number of linea gasto categorias associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getLineaGastoCategoriasSize(long pk) throws SystemException {
		long[] pks = lineaGastoToLineaGastoCategoriaTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the linea gasto categoria is associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	 * @return <code>true</code> if the linea gasto categoria is associated with the linea gasto; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGastoCategoria(long pk,
		long lineaGastoCategoriaPK) throws SystemException {
		return lineaGastoToLineaGastoCategoriaTableMapper.containsTableMapping(pk,
			lineaGastoCategoriaPK);
	}

	/**
	 * Returns <code>true</code> if the linea gasto has any linea gasto categorias associated with it.
	 *
	 * @param pk the primary key of the linea gasto to check for associations with linea gasto categorias
	 * @return <code>true</code> if the linea gasto has any linea gasto categorias associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGastoCategorias(long pk)
		throws SystemException {
		if (getLineaGastoCategoriasSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoCategoria(long pk, long lineaGastoCategoriaPK)
		throws SystemException {
		lineaGastoToLineaGastoCategoriaTableMapper.addTableMapping(pk,
			lineaGastoCategoriaPK);
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoCategoria the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoCategoria(long pk,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws SystemException {
		lineaGastoToLineaGastoCategoriaTableMapper.addTableMapping(pk,
			lineaGastoCategoria.getPrimaryKey());
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoCategorias(long pk, long[] lineaGastoCategoriaPKs)
		throws SystemException {
		for (long lineaGastoCategoriaPK : lineaGastoCategoriaPKs) {
			lineaGastoToLineaGastoCategoriaTableMapper.addTableMapping(pk,
				lineaGastoCategoriaPK);
		}
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoCategorias the linea gasto categorias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoCategorias(long pk,
		List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria : lineaGastoCategorias) {
			lineaGastoToLineaGastoCategoriaTableMapper.addTableMapping(pk,
				lineaGastoCategoria.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the linea gasto and its linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto to clear the associated linea gasto categorias from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearLineaGastoCategorias(long pk) throws SystemException {
		lineaGastoToLineaGastoCategoriaTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoCategoria(long pk, long lineaGastoCategoriaPK)
		throws SystemException {
		lineaGastoToLineaGastoCategoriaTableMapper.deleteTableMapping(pk,
			lineaGastoCategoriaPK);
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoCategoria the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoCategoria(long pk,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws SystemException {
		lineaGastoToLineaGastoCategoriaTableMapper.deleteTableMapping(pk,
			lineaGastoCategoria.getPrimaryKey());
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoCategorias(long pk,
		long[] lineaGastoCategoriaPKs) throws SystemException {
		for (long lineaGastoCategoriaPK : lineaGastoCategoriaPKs) {
			lineaGastoToLineaGastoCategoriaTableMapper.deleteTableMapping(pk,
				lineaGastoCategoriaPK);
		}
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoCategorias the linea gasto categorias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoCategorias(long pk,
		List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria : lineaGastoCategorias) {
			lineaGastoToLineaGastoCategoriaTableMapper.deleteTableMapping(pk,
				lineaGastoCategoria.getPrimaryKey());
		}
	}

	/**
	 * Sets the linea gasto categorias associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias to be associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastoCategorias(long pk, long[] lineaGastoCategoriaPKs)
		throws SystemException {
		Set<Long> newLineaGastoCategoriaPKsSet = SetUtil.fromArray(lineaGastoCategoriaPKs);
		Set<Long> oldLineaGastoCategoriaPKsSet = SetUtil.fromArray(lineaGastoToLineaGastoCategoriaTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeLineaGastoCategoriaPKsSet = new HashSet<Long>(oldLineaGastoCategoriaPKsSet);

		removeLineaGastoCategoriaPKsSet.removeAll(newLineaGastoCategoriaPKsSet);

		for (long removeLineaGastoCategoriaPK : removeLineaGastoCategoriaPKsSet) {
			lineaGastoToLineaGastoCategoriaTableMapper.deleteTableMapping(pk,
				removeLineaGastoCategoriaPK);
		}

		newLineaGastoCategoriaPKsSet.removeAll(oldLineaGastoCategoriaPKsSet);

		for (long newLineaGastoCategoriaPK : newLineaGastoCategoriaPKsSet) {
			lineaGastoToLineaGastoCategoriaTableMapper.addTableMapping(pk,
				newLineaGastoCategoriaPK);
		}
	}

	/**
	 * Sets the linea gasto categorias associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoCategorias the linea gasto categorias to be associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastoCategorias(long pk,
		List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws SystemException {
		try {
			long[] lineaGastoCategoriaPKs = new long[lineaGastoCategorias.size()];

			for (int i = 0; i < lineaGastoCategorias.size(); i++) {
				es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria =
					lineaGastoCategorias.get(i);

				lineaGastoCategoriaPKs[i] = lineaGastoCategoria.getPrimaryKey();
			}

			setLineaGastoCategorias(pk, lineaGastoCategoriaPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(LineaGastoModelImpl.MAPPING_TABLE_CMES_LINEAS_CATEGORIAS_NAME);
		}
	}

	/**
	 * Returns all the linea gasto clientes associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @return the linea gasto clientes associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk) throws SystemException {
		return getLineaGastoClientes(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the linea gasto clientes associated with the linea gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @return the range of linea gasto clientes associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk, int start, int end) throws SystemException {
		return getLineaGastoClientes(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto clientes associated with the linea gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gasto clientes associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoCliente> getLineaGastoClientes(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return lineaGastoToLineaGastoClienteTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of linea gasto clientes associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @return the number of linea gasto clientes associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getLineaGastoClientesSize(long pk) throws SystemException {
		long[] pks = lineaGastoToLineaGastoClienteTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the linea gasto cliente is associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoClientePK the primary key of the linea gasto cliente
	 * @return <code>true</code> if the linea gasto cliente is associated with the linea gasto; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGastoCliente(long pk, long lineaGastoClientePK)
		throws SystemException {
		return lineaGastoToLineaGastoClienteTableMapper.containsTableMapping(pk,
			lineaGastoClientePK);
	}

	/**
	 * Returns <code>true</code> if the linea gasto has any linea gasto clientes associated with it.
	 *
	 * @param pk the primary key of the linea gasto to check for associations with linea gasto clientes
	 * @return <code>true</code> if the linea gasto has any linea gasto clientes associated with it; <code>false</code> otherwise
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
	 * Adds an association between the linea gasto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoClientePK the primary key of the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoCliente(long pk, long lineaGastoClientePK)
		throws SystemException {
		lineaGastoToLineaGastoClienteTableMapper.addTableMapping(pk,
			lineaGastoClientePK);
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoCliente the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoCliente(long pk,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws SystemException {
		lineaGastoToLineaGastoClienteTableMapper.addTableMapping(pk,
			lineaGastoCliente.getPrimaryKey());
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoClientePKs the primary keys of the linea gasto clientes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoClientes(long pk, long[] lineaGastoClientePKs)
		throws SystemException {
		for (long lineaGastoClientePK : lineaGastoClientePKs) {
			lineaGastoToLineaGastoClienteTableMapper.addTableMapping(pk,
				lineaGastoClientePK);
		}
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoClientes the linea gasto clientes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoClientes(long pk,
		List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente : lineaGastoClientes) {
			lineaGastoToLineaGastoClienteTableMapper.addTableMapping(pk,
				lineaGastoCliente.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the linea gasto and its linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto to clear the associated linea gasto clientes from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearLineaGastoClientes(long pk) throws SystemException {
		lineaGastoToLineaGastoClienteTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoClientePK the primary key of the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoCliente(long pk, long lineaGastoClientePK)
		throws SystemException {
		lineaGastoToLineaGastoClienteTableMapper.deleteTableMapping(pk,
			lineaGastoClientePK);
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto cliente. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoCliente the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoCliente(long pk,
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws SystemException {
		lineaGastoToLineaGastoClienteTableMapper.deleteTableMapping(pk,
			lineaGastoCliente.getPrimaryKey());
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoClientePKs the primary keys of the linea gasto clientes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoClientes(long pk, long[] lineaGastoClientePKs)
		throws SystemException {
		for (long lineaGastoClientePK : lineaGastoClientePKs) {
			lineaGastoToLineaGastoClienteTableMapper.deleteTableMapping(pk,
				lineaGastoClientePK);
		}
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto clientes. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoClientes the linea gasto clientes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoClientes(long pk,
		List<es.davinciti.liferay.model.LineaGastoCliente> lineaGastoClientes)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente : lineaGastoClientes) {
			lineaGastoToLineaGastoClienteTableMapper.deleteTableMapping(pk,
				lineaGastoCliente.getPrimaryKey());
		}
	}

	/**
	 * Sets the linea gasto clientes associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoClientePKs the primary keys of the linea gasto clientes to be associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastoClientes(long pk, long[] lineaGastoClientePKs)
		throws SystemException {
		Set<Long> newLineaGastoClientePKsSet = SetUtil.fromArray(lineaGastoClientePKs);
		Set<Long> oldLineaGastoClientePKsSet = SetUtil.fromArray(lineaGastoToLineaGastoClienteTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeLineaGastoClientePKsSet = new HashSet<Long>(oldLineaGastoClientePKsSet);

		removeLineaGastoClientePKsSet.removeAll(newLineaGastoClientePKsSet);

		for (long removeLineaGastoClientePK : removeLineaGastoClientePKsSet) {
			lineaGastoToLineaGastoClienteTableMapper.deleteTableMapping(pk,
				removeLineaGastoClientePK);
		}

		newLineaGastoClientePKsSet.removeAll(oldLineaGastoClientePKsSet);

		for (long newLineaGastoClientePK : newLineaGastoClientePKsSet) {
			lineaGastoToLineaGastoClienteTableMapper.addTableMapping(pk,
				newLineaGastoClientePK);
		}
	}

	/**
	 * Sets the linea gasto clientes associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoClientes the linea gasto clientes to be associated with the linea gasto
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
			FinderCacheUtil.clearCache(LineaGastoModelImpl.MAPPING_TABLE_CMES_LINEAS_CLIENTES_NAME);
		}
	}

	/**
	 * Returns all the linea gasto proyectos associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @return the linea gasto proyectos associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk) throws SystemException {
		return getLineaGastoProyectos(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the linea gasto proyectos associated with the linea gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @return the range of linea gasto proyectos associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk, int start, int end) throws SystemException {
		return getLineaGastoProyectos(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto proyectos associated with the linea gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto
	 * @param start the lower bound of the range of linea gastos
	 * @param end the upper bound of the range of linea gastos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gasto proyectos associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return lineaGastoToLineaGastoProyectoTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of linea gasto proyectos associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @return the number of linea gasto proyectos associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getLineaGastoProyectosSize(long pk) throws SystemException {
		long[] pks = lineaGastoToLineaGastoProyectoTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the linea gasto proyecto is associated with the linea gasto.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	 * @return <code>true</code> if the linea gasto proyecto is associated with the linea gasto; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGastoProyecto(long pk, long lineaGastoProyectoPK)
		throws SystemException {
		return lineaGastoToLineaGastoProyectoTableMapper.containsTableMapping(pk,
			lineaGastoProyectoPK);
	}

	/**
	 * Returns <code>true</code> if the linea gasto has any linea gasto proyectos associated with it.
	 *
	 * @param pk the primary key of the linea gasto to check for associations with linea gasto proyectos
	 * @return <code>true</code> if the linea gasto has any linea gasto proyectos associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGastoProyectos(long pk)
		throws SystemException {
		if (getLineaGastoProyectosSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoProyecto(long pk, long lineaGastoProyectoPK)
		throws SystemException {
		lineaGastoToLineaGastoProyectoTableMapper.addTableMapping(pk,
			lineaGastoProyectoPK);
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoProyecto the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoProyecto(long pk,
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws SystemException {
		lineaGastoToLineaGastoProyectoTableMapper.addTableMapping(pk,
			lineaGastoProyecto.getPrimaryKey());
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoProyectos(long pk, long[] lineaGastoProyectoPKs)
		throws SystemException {
		for (long lineaGastoProyectoPK : lineaGastoProyectoPKs) {
			lineaGastoToLineaGastoProyectoTableMapper.addTableMapping(pk,
				lineaGastoProyectoPK);
		}
	}

	/**
	 * Adds an association between the linea gasto and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoProyectos the linea gasto proyectos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoProyectos(long pk,
		List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto : lineaGastoProyectos) {
			lineaGastoToLineaGastoProyectoTableMapper.addTableMapping(pk,
				lineaGastoProyecto.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the linea gasto and its linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto to clear the associated linea gasto proyectos from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearLineaGastoProyectos(long pk) throws SystemException {
		lineaGastoToLineaGastoProyectoTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoProyecto(long pk, long lineaGastoProyectoPK)
		throws SystemException {
		lineaGastoToLineaGastoProyectoTableMapper.deleteTableMapping(pk,
			lineaGastoProyectoPK);
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoProyecto the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoProyecto(long pk,
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws SystemException {
		lineaGastoToLineaGastoProyectoTableMapper.deleteTableMapping(pk,
			lineaGastoProyecto.getPrimaryKey());
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoProyectos(long pk, long[] lineaGastoProyectoPKs)
		throws SystemException {
		for (long lineaGastoProyectoPK : lineaGastoProyectoPKs) {
			lineaGastoToLineaGastoProyectoTableMapper.deleteTableMapping(pk,
				lineaGastoProyectoPK);
		}
	}

	/**
	 * Removes the association between the linea gasto and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoProyectos the linea gasto proyectos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoProyectos(long pk,
		List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto : lineaGastoProyectos) {
			lineaGastoToLineaGastoProyectoTableMapper.deleteTableMapping(pk,
				lineaGastoProyecto.getPrimaryKey());
		}
	}

	/**
	 * Sets the linea gasto proyectos associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos to be associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastoProyectos(long pk, long[] lineaGastoProyectoPKs)
		throws SystemException {
		Set<Long> newLineaGastoProyectoPKsSet = SetUtil.fromArray(lineaGastoProyectoPKs);
		Set<Long> oldLineaGastoProyectoPKsSet = SetUtil.fromArray(lineaGastoToLineaGastoProyectoTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeLineaGastoProyectoPKsSet = new HashSet<Long>(oldLineaGastoProyectoPKsSet);

		removeLineaGastoProyectoPKsSet.removeAll(newLineaGastoProyectoPKsSet);

		for (long removeLineaGastoProyectoPK : removeLineaGastoProyectoPKsSet) {
			lineaGastoToLineaGastoProyectoTableMapper.deleteTableMapping(pk,
				removeLineaGastoProyectoPK);
		}

		newLineaGastoProyectoPKsSet.removeAll(oldLineaGastoProyectoPKsSet);

		for (long newLineaGastoProyectoPK : newLineaGastoProyectoPKsSet) {
			lineaGastoToLineaGastoProyectoTableMapper.addTableMapping(pk,
				newLineaGastoProyectoPK);
		}
	}

	/**
	 * Sets the linea gasto proyectos associated with the linea gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto
	 * @param lineaGastoProyectos the linea gasto proyectos to be associated with the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastoProyectos(long pk,
		List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws SystemException {
		try {
			long[] lineaGastoProyectoPKs = new long[lineaGastoProyectos.size()];

			for (int i = 0; i < lineaGastoProyectos.size(); i++) {
				es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto =
					lineaGastoProyectos.get(i);

				lineaGastoProyectoPKs[i] = lineaGastoProyecto.getPrimaryKey();
			}

			setLineaGastoProyectos(pk, lineaGastoProyectoPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(LineaGastoModelImpl.MAPPING_TABLE_CMES_LINEAS_PROYECTOS_NAME);
		}
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the linea gasto persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.LineaGasto")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LineaGasto>> listenersList = new ArrayList<ModelListener<LineaGasto>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LineaGasto>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		lineaGastoToNotaGastoTableMapper = TableMapperFactory.getTableMapper("CMES_Notas_Lineas",
				"lineagastoId", "notagastoId", this, notaGastoPersistence);

		lineaGastoToLineaGastoPayModeTableMapper = TableMapperFactory.getTableMapper("CMES_Lineas_PayModes",
				"lineagastoId", "paymodeId", this, lineaGastoPayModePersistence);

		lineaGastoToCurrencyTableMapper = TableMapperFactory.getTableMapper("CMES_Lineas_Currencies",
				"lineagastoId", "currencyId", this, currencyPersistence);

		lineaGastoToLineaGastoFamiliaTableMapper = TableMapperFactory.getTableMapper("CMES_Lineas_Familias",
				"lineagastoId", "familiaId", this, lineaGastoFamiliaPersistence);

		lineaGastoToLineaGastoCategoriaTableMapper = TableMapperFactory.getTableMapper("CMES_Lineas_Categorias",
				"lineagastoId", "categoriaId", this,
				lineaGastoCategoriaPersistence);

		lineaGastoToLineaGastoClienteTableMapper = TableMapperFactory.getTableMapper("CMES_Lineas_Clientes",
				"lineagastoId", "clienteId", this, lineaGastoClientePersistence);

		lineaGastoToLineaGastoProyectoTableMapper = TableMapperFactory.getTableMapper("CMES_Lineas_Proyectos",
				"lineagastoId", "proyectoId", this,
				lineaGastoProyectoPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(LineaGastoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("CMES_Notas_Lineas");
		TableMapperFactory.removeTableMapper("CMES_Lineas_PayModes");
		TableMapperFactory.removeTableMapper("CMES_Lineas_Currencies");
		TableMapperFactory.removeTableMapper("CMES_Lineas_Familias");
		TableMapperFactory.removeTableMapper("CMES_Lineas_Categorias");
		TableMapperFactory.removeTableMapper("CMES_Lineas_Clientes");
		TableMapperFactory.removeTableMapper("CMES_Lineas_Proyectos");
	}

	@BeanReference(type = NotaGastoPersistence.class)
	protected NotaGastoPersistence notaGastoPersistence;
	protected TableMapper<LineaGasto, es.davinciti.liferay.model.NotaGasto> lineaGastoToNotaGastoTableMapper;
	@BeanReference(type = LineaGastoPayModePersistence.class)
	protected LineaGastoPayModePersistence lineaGastoPayModePersistence;
	protected TableMapper<LineaGasto, es.davinciti.liferay.model.LineaGastoPayMode> lineaGastoToLineaGastoPayModeTableMapper;
	@BeanReference(type = CurrencyPersistence.class)
	protected CurrencyPersistence currencyPersistence;
	protected TableMapper<LineaGasto, es.davinciti.liferay.model.Currency> lineaGastoToCurrencyTableMapper;
	@BeanReference(type = LineaGastoFamiliaPersistence.class)
	protected LineaGastoFamiliaPersistence lineaGastoFamiliaPersistence;
	protected TableMapper<LineaGasto, es.davinciti.liferay.model.LineaGastoFamilia> lineaGastoToLineaGastoFamiliaTableMapper;
	@BeanReference(type = LineaGastoCategoriaPersistence.class)
	protected LineaGastoCategoriaPersistence lineaGastoCategoriaPersistence;
	protected TableMapper<LineaGasto, es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoToLineaGastoCategoriaTableMapper;
	@BeanReference(type = LineaGastoClientePersistence.class)
	protected LineaGastoClientePersistence lineaGastoClientePersistence;
	protected TableMapper<LineaGasto, es.davinciti.liferay.model.LineaGastoCliente> lineaGastoToLineaGastoClienteTableMapper;
	@BeanReference(type = LineaGastoProyectoPersistence.class)
	protected LineaGastoProyectoPersistence lineaGastoProyectoPersistence;
	protected TableMapper<LineaGasto, es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoToLineaGastoProyectoTableMapper;
	private static final String _SQL_SELECT_LINEAGASTO = "SELECT lineaGasto FROM LineaGasto lineaGasto";
	private static final String _SQL_SELECT_LINEAGASTO_WHERE = "SELECT lineaGasto FROM LineaGasto lineaGasto WHERE ";
	private static final String _SQL_COUNT_LINEAGASTO = "SELECT COUNT(lineaGasto) FROM LineaGasto lineaGasto";
	private static final String _SQL_COUNT_LINEAGASTO_WHERE = "SELECT COUNT(lineaGasto) FROM LineaGasto lineaGasto WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lineaGasto.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LineaGasto exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LineaGasto exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LineaGastoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"date"
			});
	private static LineaGasto _nullLineaGasto = new LineaGastoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LineaGasto> toCacheModel() {
				return _nullLineaGastoCacheModel;
			}
		};

	private static CacheModel<LineaGasto> _nullLineaGastoCacheModel = new CacheModel<LineaGasto>() {
			@Override
			public LineaGasto toEntityModel() {
				return _nullLineaGasto;
			}
		};
}