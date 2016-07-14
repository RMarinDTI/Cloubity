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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import es.davinciti.liferay.NoSuchTipoDiaCalendarException;
import es.davinciti.liferay.model.TipoDiaCalendar;
import es.davinciti.liferay.model.impl.TipoDiaCalendarImpl;
import es.davinciti.liferay.model.impl.TipoDiaCalendarModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the tipo dia calendar service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see TipoDiaCalendarPersistence
 * @see TipoDiaCalendarUtil
 * @generated
 */
public class TipoDiaCalendarPersistenceImpl extends BasePersistenceImpl<TipoDiaCalendar>
	implements TipoDiaCalendarPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TipoDiaCalendarUtil} to access the tipo dia calendar persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TipoDiaCalendarImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TipoDiaCalendarModelImpl.ENTITY_CACHE_ENABLED,
			TipoDiaCalendarModelImpl.FINDER_CACHE_ENABLED,
			TipoDiaCalendarImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TipoDiaCalendarModelImpl.ENTITY_CACHE_ENABLED,
			TipoDiaCalendarModelImpl.FINDER_CACHE_ENABLED,
			TipoDiaCalendarImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TipoDiaCalendarModelImpl.ENTITY_CACHE_ENABLED,
			TipoDiaCalendarModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DESCRIPCION =
		new FinderPath(TipoDiaCalendarModelImpl.ENTITY_CACHE_ENABLED,
			TipoDiaCalendarModelImpl.FINDER_CACHE_ENABLED,
			TipoDiaCalendarImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDescripcion",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESCRIPCION =
		new FinderPath(TipoDiaCalendarModelImpl.ENTITY_CACHE_ENABLED,
			TipoDiaCalendarModelImpl.FINDER_CACHE_ENABLED,
			TipoDiaCalendarImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDescripcion",
			new String[] { String.class.getName() },
			TipoDiaCalendarModelImpl.DESCRIPCION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DESCRIPCION = new FinderPath(TipoDiaCalendarModelImpl.ENTITY_CACHE_ENABLED,
			TipoDiaCalendarModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDescripcion",
			new String[] { String.class.getName() });

	/**
	 * Returns all the tipo dia calendars where descripcion = &#63;.
	 *
	 * @param descripcion the descripcion
	 * @return the matching tipo dia calendars
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TipoDiaCalendar> findByDescripcion(String descripcion)
		throws SystemException {
		return findByDescripcion(descripcion, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tipo dia calendars where descripcion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.TipoDiaCalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param descripcion the descripcion
	 * @param start the lower bound of the range of tipo dia calendars
	 * @param end the upper bound of the range of tipo dia calendars (not inclusive)
	 * @return the range of matching tipo dia calendars
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TipoDiaCalendar> findByDescripcion(String descripcion,
		int start, int end) throws SystemException {
		return findByDescripcion(descripcion, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tipo dia calendars where descripcion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.TipoDiaCalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param descripcion the descripcion
	 * @param start the lower bound of the range of tipo dia calendars
	 * @param end the upper bound of the range of tipo dia calendars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tipo dia calendars
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TipoDiaCalendar> findByDescripcion(String descripcion,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESCRIPCION;
			finderArgs = new Object[] { descripcion };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DESCRIPCION;
			finderArgs = new Object[] { descripcion, start, end, orderByComparator };
		}

		List<TipoDiaCalendar> list = (List<TipoDiaCalendar>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TipoDiaCalendar tipoDiaCalendar : list) {
				if (!Validator.equals(descripcion,
							tipoDiaCalendar.getDescripcion())) {
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

			query.append(_SQL_SELECT_TIPODIACALENDAR_WHERE);

			boolean bindDescripcion = false;

			if (descripcion == null) {
				query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_1);
			}
			else if (descripcion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_3);
			}
			else {
				bindDescripcion = true;

				query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TipoDiaCalendarModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDescripcion) {
					qPos.add(descripcion);
				}

				if (!pagination) {
					list = (List<TipoDiaCalendar>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TipoDiaCalendar>(list);
				}
				else {
					list = (List<TipoDiaCalendar>)QueryUtil.list(q,
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
	 * Returns the first tipo dia calendar in the ordered set where descripcion = &#63;.
	 *
	 * @param descripcion the descripcion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tipo dia calendar
	 * @throws es.davinciti.liferay.NoSuchTipoDiaCalendarException if a matching tipo dia calendar could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TipoDiaCalendar findByDescripcion_First(String descripcion,
		OrderByComparator orderByComparator)
		throws NoSuchTipoDiaCalendarException, SystemException {
		TipoDiaCalendar tipoDiaCalendar = fetchByDescripcion_First(descripcion,
				orderByComparator);

		if (tipoDiaCalendar != null) {
			return tipoDiaCalendar;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("descripcion=");
		msg.append(descripcion);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTipoDiaCalendarException(msg.toString());
	}

	/**
	 * Returns the first tipo dia calendar in the ordered set where descripcion = &#63;.
	 *
	 * @param descripcion the descripcion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tipo dia calendar, or <code>null</code> if a matching tipo dia calendar could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TipoDiaCalendar fetchByDescripcion_First(String descripcion,
		OrderByComparator orderByComparator) throws SystemException {
		List<TipoDiaCalendar> list = findByDescripcion(descripcion, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tipo dia calendar in the ordered set where descripcion = &#63;.
	 *
	 * @param descripcion the descripcion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tipo dia calendar
	 * @throws es.davinciti.liferay.NoSuchTipoDiaCalendarException if a matching tipo dia calendar could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TipoDiaCalendar findByDescripcion_Last(String descripcion,
		OrderByComparator orderByComparator)
		throws NoSuchTipoDiaCalendarException, SystemException {
		TipoDiaCalendar tipoDiaCalendar = fetchByDescripcion_Last(descripcion,
				orderByComparator);

		if (tipoDiaCalendar != null) {
			return tipoDiaCalendar;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("descripcion=");
		msg.append(descripcion);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTipoDiaCalendarException(msg.toString());
	}

	/**
	 * Returns the last tipo dia calendar in the ordered set where descripcion = &#63;.
	 *
	 * @param descripcion the descripcion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tipo dia calendar, or <code>null</code> if a matching tipo dia calendar could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TipoDiaCalendar fetchByDescripcion_Last(String descripcion,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDescripcion(descripcion);

		if (count == 0) {
			return null;
		}

		List<TipoDiaCalendar> list = findByDescripcion(descripcion, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tipo dia calendars before and after the current tipo dia calendar in the ordered set where descripcion = &#63;.
	 *
	 * @param tipoDiaCalendarId the primary key of the current tipo dia calendar
	 * @param descripcion the descripcion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tipo dia calendar
	 * @throws es.davinciti.liferay.NoSuchTipoDiaCalendarException if a tipo dia calendar with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TipoDiaCalendar[] findByDescripcion_PrevAndNext(
		long tipoDiaCalendarId, String descripcion,
		OrderByComparator orderByComparator)
		throws NoSuchTipoDiaCalendarException, SystemException {
		TipoDiaCalendar tipoDiaCalendar = findByPrimaryKey(tipoDiaCalendarId);

		Session session = null;

		try {
			session = openSession();

			TipoDiaCalendar[] array = new TipoDiaCalendarImpl[3];

			array[0] = getByDescripcion_PrevAndNext(session, tipoDiaCalendar,
					descripcion, orderByComparator, true);

			array[1] = tipoDiaCalendar;

			array[2] = getByDescripcion_PrevAndNext(session, tipoDiaCalendar,
					descripcion, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TipoDiaCalendar getByDescripcion_PrevAndNext(Session session,
		TipoDiaCalendar tipoDiaCalendar, String descripcion,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TIPODIACALENDAR_WHERE);

		boolean bindDescripcion = false;

		if (descripcion == null) {
			query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_1);
		}
		else if (descripcion.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_3);
		}
		else {
			bindDescripcion = true;

			query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_2);
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
			query.append(TipoDiaCalendarModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDescripcion) {
			qPos.add(descripcion);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tipoDiaCalendar);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TipoDiaCalendar> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tipo dia calendars where descripcion = &#63; from the database.
	 *
	 * @param descripcion the descripcion
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDescripcion(String descripcion)
		throws SystemException {
		for (TipoDiaCalendar tipoDiaCalendar : findByDescripcion(descripcion,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tipoDiaCalendar);
		}
	}

	/**
	 * Returns the number of tipo dia calendars where descripcion = &#63;.
	 *
	 * @param descripcion the descripcion
	 * @return the number of matching tipo dia calendars
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDescripcion(String descripcion) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DESCRIPCION;

		Object[] finderArgs = new Object[] { descripcion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TIPODIACALENDAR_WHERE);

			boolean bindDescripcion = false;

			if (descripcion == null) {
				query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_1);
			}
			else if (descripcion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_3);
			}
			else {
				bindDescripcion = true;

				query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDescripcion) {
					qPos.add(descripcion);
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

	private static final String _FINDER_COLUMN_DESCRIPCION_DESCRIPCION_1 = "tipoDiaCalendar.descripcion IS NULL";
	private static final String _FINDER_COLUMN_DESCRIPCION_DESCRIPCION_2 = "tipoDiaCalendar.descripcion = ?";
	private static final String _FINDER_COLUMN_DESCRIPCION_DESCRIPCION_3 = "(tipoDiaCalendar.descripcion IS NULL OR tipoDiaCalendar.descripcion = '')";

	public TipoDiaCalendarPersistenceImpl() {
		setModelClass(TipoDiaCalendar.class);
	}

	/**
	 * Caches the tipo dia calendar in the entity cache if it is enabled.
	 *
	 * @param tipoDiaCalendar the tipo dia calendar
	 */
	@Override
	public void cacheResult(TipoDiaCalendar tipoDiaCalendar) {
		EntityCacheUtil.putResult(TipoDiaCalendarModelImpl.ENTITY_CACHE_ENABLED,
			TipoDiaCalendarImpl.class, tipoDiaCalendar.getPrimaryKey(),
			tipoDiaCalendar);

		tipoDiaCalendar.resetOriginalValues();
	}

	/**
	 * Caches the tipo dia calendars in the entity cache if it is enabled.
	 *
	 * @param tipoDiaCalendars the tipo dia calendars
	 */
	@Override
	public void cacheResult(List<TipoDiaCalendar> tipoDiaCalendars) {
		for (TipoDiaCalendar tipoDiaCalendar : tipoDiaCalendars) {
			if (EntityCacheUtil.getResult(
						TipoDiaCalendarModelImpl.ENTITY_CACHE_ENABLED,
						TipoDiaCalendarImpl.class,
						tipoDiaCalendar.getPrimaryKey()) == null) {
				cacheResult(tipoDiaCalendar);
			}
			else {
				tipoDiaCalendar.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tipo dia calendars.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TipoDiaCalendarImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TipoDiaCalendarImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tipo dia calendar.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TipoDiaCalendar tipoDiaCalendar) {
		EntityCacheUtil.removeResult(TipoDiaCalendarModelImpl.ENTITY_CACHE_ENABLED,
			TipoDiaCalendarImpl.class, tipoDiaCalendar.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TipoDiaCalendar> tipoDiaCalendars) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TipoDiaCalendar tipoDiaCalendar : tipoDiaCalendars) {
			EntityCacheUtil.removeResult(TipoDiaCalendarModelImpl.ENTITY_CACHE_ENABLED,
				TipoDiaCalendarImpl.class, tipoDiaCalendar.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tipo dia calendar with the primary key. Does not add the tipo dia calendar to the database.
	 *
	 * @param tipoDiaCalendarId the primary key for the new tipo dia calendar
	 * @return the new tipo dia calendar
	 */
	@Override
	public TipoDiaCalendar create(long tipoDiaCalendarId) {
		TipoDiaCalendar tipoDiaCalendar = new TipoDiaCalendarImpl();

		tipoDiaCalendar.setNew(true);
		tipoDiaCalendar.setPrimaryKey(tipoDiaCalendarId);

		return tipoDiaCalendar;
	}

	/**
	 * Removes the tipo dia calendar with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tipoDiaCalendarId the primary key of the tipo dia calendar
	 * @return the tipo dia calendar that was removed
	 * @throws es.davinciti.liferay.NoSuchTipoDiaCalendarException if a tipo dia calendar with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TipoDiaCalendar remove(long tipoDiaCalendarId)
		throws NoSuchTipoDiaCalendarException, SystemException {
		return remove((Serializable)tipoDiaCalendarId);
	}

	/**
	 * Removes the tipo dia calendar with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tipo dia calendar
	 * @return the tipo dia calendar that was removed
	 * @throws es.davinciti.liferay.NoSuchTipoDiaCalendarException if a tipo dia calendar with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TipoDiaCalendar remove(Serializable primaryKey)
		throws NoSuchTipoDiaCalendarException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TipoDiaCalendar tipoDiaCalendar = (TipoDiaCalendar)session.get(TipoDiaCalendarImpl.class,
					primaryKey);

			if (tipoDiaCalendar == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTipoDiaCalendarException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tipoDiaCalendar);
		}
		catch (NoSuchTipoDiaCalendarException nsee) {
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
	protected TipoDiaCalendar removeImpl(TipoDiaCalendar tipoDiaCalendar)
		throws SystemException {
		tipoDiaCalendar = toUnwrappedModel(tipoDiaCalendar);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tipoDiaCalendar)) {
				tipoDiaCalendar = (TipoDiaCalendar)session.get(TipoDiaCalendarImpl.class,
						tipoDiaCalendar.getPrimaryKeyObj());
			}

			if (tipoDiaCalendar != null) {
				session.delete(tipoDiaCalendar);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tipoDiaCalendar != null) {
			clearCache(tipoDiaCalendar);
		}

		return tipoDiaCalendar;
	}

	@Override
	public TipoDiaCalendar updateImpl(
		es.davinciti.liferay.model.TipoDiaCalendar tipoDiaCalendar)
		throws SystemException {
		tipoDiaCalendar = toUnwrappedModel(tipoDiaCalendar);

		boolean isNew = tipoDiaCalendar.isNew();

		TipoDiaCalendarModelImpl tipoDiaCalendarModelImpl = (TipoDiaCalendarModelImpl)tipoDiaCalendar;

		Session session = null;

		try {
			session = openSession();

			if (tipoDiaCalendar.isNew()) {
				session.save(tipoDiaCalendar);

				tipoDiaCalendar.setNew(false);
			}
			else {
				session.merge(tipoDiaCalendar);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TipoDiaCalendarModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tipoDiaCalendarModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESCRIPCION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tipoDiaCalendarModelImpl.getOriginalDescripcion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DESCRIPCION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESCRIPCION,
					args);

				args = new Object[] { tipoDiaCalendarModelImpl.getDescripcion() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DESCRIPCION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESCRIPCION,
					args);
			}
		}

		EntityCacheUtil.putResult(TipoDiaCalendarModelImpl.ENTITY_CACHE_ENABLED,
			TipoDiaCalendarImpl.class, tipoDiaCalendar.getPrimaryKey(),
			tipoDiaCalendar);

		return tipoDiaCalendar;
	}

	protected TipoDiaCalendar toUnwrappedModel(TipoDiaCalendar tipoDiaCalendar) {
		if (tipoDiaCalendar instanceof TipoDiaCalendarImpl) {
			return tipoDiaCalendar;
		}

		TipoDiaCalendarImpl tipoDiaCalendarImpl = new TipoDiaCalendarImpl();

		tipoDiaCalendarImpl.setNew(tipoDiaCalendar.isNew());
		tipoDiaCalendarImpl.setPrimaryKey(tipoDiaCalendar.getPrimaryKey());

		tipoDiaCalendarImpl.setTipoDiaCalendarId(tipoDiaCalendar.getTipoDiaCalendarId());
		tipoDiaCalendarImpl.setDescripcion(tipoDiaCalendar.getDescripcion());
		tipoDiaCalendarImpl.setFondoColor(tipoDiaCalendar.getFondoColor());
		tipoDiaCalendarImpl.setLetraColor(tipoDiaCalendar.getLetraColor());
		tipoDiaCalendarImpl.setStrong(tipoDiaCalendar.getStrong());

		return tipoDiaCalendarImpl;
	}

	/**
	 * Returns the tipo dia calendar with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipo dia calendar
	 * @return the tipo dia calendar
	 * @throws es.davinciti.liferay.NoSuchTipoDiaCalendarException if a tipo dia calendar with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TipoDiaCalendar findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTipoDiaCalendarException, SystemException {
		TipoDiaCalendar tipoDiaCalendar = fetchByPrimaryKey(primaryKey);

		if (tipoDiaCalendar == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTipoDiaCalendarException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tipoDiaCalendar;
	}

	/**
	 * Returns the tipo dia calendar with the primary key or throws a {@link es.davinciti.liferay.NoSuchTipoDiaCalendarException} if it could not be found.
	 *
	 * @param tipoDiaCalendarId the primary key of the tipo dia calendar
	 * @return the tipo dia calendar
	 * @throws es.davinciti.liferay.NoSuchTipoDiaCalendarException if a tipo dia calendar with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TipoDiaCalendar findByPrimaryKey(long tipoDiaCalendarId)
		throws NoSuchTipoDiaCalendarException, SystemException {
		return findByPrimaryKey((Serializable)tipoDiaCalendarId);
	}

	/**
	 * Returns the tipo dia calendar with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipo dia calendar
	 * @return the tipo dia calendar, or <code>null</code> if a tipo dia calendar with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TipoDiaCalendar fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TipoDiaCalendar tipoDiaCalendar = (TipoDiaCalendar)EntityCacheUtil.getResult(TipoDiaCalendarModelImpl.ENTITY_CACHE_ENABLED,
				TipoDiaCalendarImpl.class, primaryKey);

		if (tipoDiaCalendar == _nullTipoDiaCalendar) {
			return null;
		}

		if (tipoDiaCalendar == null) {
			Session session = null;

			try {
				session = openSession();

				tipoDiaCalendar = (TipoDiaCalendar)session.get(TipoDiaCalendarImpl.class,
						primaryKey);

				if (tipoDiaCalendar != null) {
					cacheResult(tipoDiaCalendar);
				}
				else {
					EntityCacheUtil.putResult(TipoDiaCalendarModelImpl.ENTITY_CACHE_ENABLED,
						TipoDiaCalendarImpl.class, primaryKey,
						_nullTipoDiaCalendar);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TipoDiaCalendarModelImpl.ENTITY_CACHE_ENABLED,
					TipoDiaCalendarImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tipoDiaCalendar;
	}

	/**
	 * Returns the tipo dia calendar with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tipoDiaCalendarId the primary key of the tipo dia calendar
	 * @return the tipo dia calendar, or <code>null</code> if a tipo dia calendar with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TipoDiaCalendar fetchByPrimaryKey(long tipoDiaCalendarId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)tipoDiaCalendarId);
	}

	/**
	 * Returns all the tipo dia calendars.
	 *
	 * @return the tipo dia calendars
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TipoDiaCalendar> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tipo dia calendars.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.TipoDiaCalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipo dia calendars
	 * @param end the upper bound of the range of tipo dia calendars (not inclusive)
	 * @return the range of tipo dia calendars
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TipoDiaCalendar> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tipo dia calendars.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.TipoDiaCalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipo dia calendars
	 * @param end the upper bound of the range of tipo dia calendars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tipo dia calendars
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TipoDiaCalendar> findAll(int start, int end,
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

		List<TipoDiaCalendar> list = (List<TipoDiaCalendar>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TIPODIACALENDAR);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TIPODIACALENDAR;

				if (pagination) {
					sql = sql.concat(TipoDiaCalendarModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TipoDiaCalendar>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TipoDiaCalendar>(list);
				}
				else {
					list = (List<TipoDiaCalendar>)QueryUtil.list(q,
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
	 * Removes all the tipo dia calendars from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TipoDiaCalendar tipoDiaCalendar : findAll()) {
			remove(tipoDiaCalendar);
		}
	}

	/**
	 * Returns the number of tipo dia calendars.
	 *
	 * @return the number of tipo dia calendars
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

				Query q = session.createQuery(_SQL_COUNT_TIPODIACALENDAR);

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
	 * Initializes the tipo dia calendar persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.TipoDiaCalendar")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TipoDiaCalendar>> listenersList = new ArrayList<ModelListener<TipoDiaCalendar>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TipoDiaCalendar>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(TipoDiaCalendarImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TIPODIACALENDAR = "SELECT tipoDiaCalendar FROM TipoDiaCalendar tipoDiaCalendar";
	private static final String _SQL_SELECT_TIPODIACALENDAR_WHERE = "SELECT tipoDiaCalendar FROM TipoDiaCalendar tipoDiaCalendar WHERE ";
	private static final String _SQL_COUNT_TIPODIACALENDAR = "SELECT COUNT(tipoDiaCalendar) FROM TipoDiaCalendar tipoDiaCalendar";
	private static final String _SQL_COUNT_TIPODIACALENDAR_WHERE = "SELECT COUNT(tipoDiaCalendar) FROM TipoDiaCalendar tipoDiaCalendar WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tipoDiaCalendar.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TipoDiaCalendar exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TipoDiaCalendar exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TipoDiaCalendarPersistenceImpl.class);
	private static TipoDiaCalendar _nullTipoDiaCalendar = new TipoDiaCalendarImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TipoDiaCalendar> toCacheModel() {
				return _nullTipoDiaCalendarCacheModel;
			}
		};

	private static CacheModel<TipoDiaCalendar> _nullTipoDiaCalendarCacheModel = new CacheModel<TipoDiaCalendar>() {
			@Override
			public TipoDiaCalendar toEntityModel() {
				return _nullTipoDiaCalendar;
			}
		};
}