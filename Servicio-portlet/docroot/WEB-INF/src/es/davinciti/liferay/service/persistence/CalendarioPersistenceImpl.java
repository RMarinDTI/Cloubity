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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import es.davinciti.liferay.NoSuchCalendarioException;
import es.davinciti.liferay.model.Calendario;
import es.davinciti.liferay.model.impl.CalendarioImpl;
import es.davinciti.liferay.model.impl.CalendarioModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the calendario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see CalendarioPersistence
 * @see CalendarioUtil
 * @generated
 */
public class CalendarioPersistenceImpl extends BasePersistenceImpl<Calendario>
	implements CalendarioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CalendarioUtil} to access the calendario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CalendarioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CalendarioModelImpl.ENTITY_CACHE_ENABLED,
			CalendarioModelImpl.FINDER_CACHE_ENABLED, CalendarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CalendarioModelImpl.ENTITY_CACHE_ENABLED,
			CalendarioModelImpl.FINDER_CACHE_ENABLED, CalendarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CalendarioModelImpl.ENTITY_CACHE_ENABLED,
			CalendarioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYIDUSERIDYEAR =
		new FinderPath(CalendarioModelImpl.ENTITY_CACHE_ENABLED,
			CalendarioModelImpl.FINDER_CACHE_ENABLED, CalendarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCompanyIdUserIdYear",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDUSERIDYEAR =
		new FinderPath(CalendarioModelImpl.ENTITY_CACHE_ENABLED,
			CalendarioModelImpl.FINDER_CACHE_ENABLED, CalendarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCompanyIdUserIdYear",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			},
			CalendarioModelImpl.COMPANYID_COLUMN_BITMASK |
			CalendarioModelImpl.USERID_COLUMN_BITMASK |
			CalendarioModelImpl.YEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYIDUSERIDYEAR = new FinderPath(CalendarioModelImpl.ENTITY_CACHE_ENABLED,
			CalendarioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCompanyIdUserIdYear",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the calendarios where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @return the matching calendarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Calendario> findByCompanyIdUserIdYear(long companyId,
		long userId, int year) throws SystemException {
		return findByCompanyIdUserIdYear(companyId, userId, year,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the calendarios where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CalendarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @param start the lower bound of the range of calendarios
	 * @param end the upper bound of the range of calendarios (not inclusive)
	 * @return the range of matching calendarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Calendario> findByCompanyIdUserIdYear(long companyId,
		long userId, int year, int start, int end) throws SystemException {
		return findByCompanyIdUserIdYear(companyId, userId, year, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the calendarios where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CalendarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @param start the lower bound of the range of calendarios
	 * @param end the upper bound of the range of calendarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching calendarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Calendario> findByCompanyIdUserIdYear(long companyId,
		long userId, int year, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDUSERIDYEAR;
			finderArgs = new Object[] { companyId, userId, year };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYIDUSERIDYEAR;
			finderArgs = new Object[] {
					companyId, userId, year,
					
					start, end, orderByComparator
				};
		}

		List<Calendario> list = (List<Calendario>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Calendario calendario : list) {
				if ((companyId != calendario.getCompanyId()) ||
						(userId != calendario.getUserId()) ||
						(year != calendario.getYear())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_CALENDARIO_WHERE);

			query.append(_FINDER_COLUMN_COMPANYIDUSERIDYEAR_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYIDUSERIDYEAR_USERID_2);

			query.append(_FINDER_COLUMN_COMPANYIDUSERIDYEAR_YEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CalendarioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(userId);

				qPos.add(year);

				if (!pagination) {
					list = (List<Calendario>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Calendario>(list);
				}
				else {
					list = (List<Calendario>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first calendario in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching calendario
	 * @throws es.davinciti.liferay.NoSuchCalendarioException if a matching calendario could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Calendario findByCompanyIdUserIdYear_First(long companyId,
		long userId, int year, OrderByComparator orderByComparator)
		throws NoSuchCalendarioException, SystemException {
		Calendario calendario = fetchByCompanyIdUserIdYear_First(companyId,
				userId, year, orderByComparator);

		if (calendario != null) {
			return calendario;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(", year=");
		msg.append(year);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCalendarioException(msg.toString());
	}

	/**
	 * Returns the first calendario in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching calendario, or <code>null</code> if a matching calendario could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Calendario fetchByCompanyIdUserIdYear_First(long companyId,
		long userId, int year, OrderByComparator orderByComparator)
		throws SystemException {
		List<Calendario> list = findByCompanyIdUserIdYear(companyId, userId,
				year, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last calendario in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching calendario
	 * @throws es.davinciti.liferay.NoSuchCalendarioException if a matching calendario could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Calendario findByCompanyIdUserIdYear_Last(long companyId,
		long userId, int year, OrderByComparator orderByComparator)
		throws NoSuchCalendarioException, SystemException {
		Calendario calendario = fetchByCompanyIdUserIdYear_Last(companyId,
				userId, year, orderByComparator);

		if (calendario != null) {
			return calendario;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(", year=");
		msg.append(year);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCalendarioException(msg.toString());
	}

	/**
	 * Returns the last calendario in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching calendario, or <code>null</code> if a matching calendario could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Calendario fetchByCompanyIdUserIdYear_Last(long companyId,
		long userId, int year, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCompanyIdUserIdYear(companyId, userId, year);

		if (count == 0) {
			return null;
		}

		List<Calendario> list = findByCompanyIdUserIdYear(companyId, userId,
				year, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the calendarios before and after the current calendario in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * @param calendarioId the primary key of the current calendario
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next calendario
	 * @throws es.davinciti.liferay.NoSuchCalendarioException if a calendario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Calendario[] findByCompanyIdUserIdYear_PrevAndNext(
		long calendarioId, long companyId, long userId, int year,
		OrderByComparator orderByComparator)
		throws NoSuchCalendarioException, SystemException {
		Calendario calendario = findByPrimaryKey(calendarioId);

		Session session = null;

		try {
			session = openSession();

			Calendario[] array = new CalendarioImpl[3];

			array[0] = getByCompanyIdUserIdYear_PrevAndNext(session,
					calendario, companyId, userId, year, orderByComparator, true);

			array[1] = calendario;

			array[2] = getByCompanyIdUserIdYear_PrevAndNext(session,
					calendario, companyId, userId, year, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Calendario getByCompanyIdUserIdYear_PrevAndNext(Session session,
		Calendario calendario, long companyId, long userId, int year,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CALENDARIO_WHERE);

		query.append(_FINDER_COLUMN_COMPANYIDUSERIDYEAR_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYIDUSERIDYEAR_USERID_2);

		query.append(_FINDER_COLUMN_COMPANYIDUSERIDYEAR_YEAR_2);

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
			query.append(CalendarioModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(userId);

		qPos.add(year);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(calendario);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Calendario> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the calendarios where companyId = &#63; and userId = &#63; and year = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyIdUserIdYear(long companyId, long userId,
		int year) throws SystemException {
		for (Calendario calendario : findByCompanyIdUserIdYear(companyId,
				userId, year, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(calendario);
		}
	}

	/**
	 * Returns the number of calendarios where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @return the number of matching calendarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCompanyIdUserIdYear(long companyId, long userId, int year)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYIDUSERIDYEAR;

		Object[] finderArgs = new Object[] { companyId, userId, year };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_CALENDARIO_WHERE);

			query.append(_FINDER_COLUMN_COMPANYIDUSERIDYEAR_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYIDUSERIDYEAR_USERID_2);

			query.append(_FINDER_COLUMN_COMPANYIDUSERIDYEAR_YEAR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(userId);

				qPos.add(year);

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

	private static final String _FINDER_COLUMN_COMPANYIDUSERIDYEAR_COMPANYID_2 = "calendario.companyId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYIDUSERIDYEAR_USERID_2 = "calendario.userId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYIDUSERIDYEAR_YEAR_2 = "calendario.year = ?";

	public CalendarioPersistenceImpl() {
		setModelClass(Calendario.class);
	}

	/**
	 * Caches the calendario in the entity cache if it is enabled.
	 *
	 * @param calendario the calendario
	 */
	@Override
	public void cacheResult(Calendario calendario) {
		EntityCacheUtil.putResult(CalendarioModelImpl.ENTITY_CACHE_ENABLED,
			CalendarioImpl.class, calendario.getPrimaryKey(), calendario);

		calendario.resetOriginalValues();
	}

	/**
	 * Caches the calendarios in the entity cache if it is enabled.
	 *
	 * @param calendarios the calendarios
	 */
	@Override
	public void cacheResult(List<Calendario> calendarios) {
		for (Calendario calendario : calendarios) {
			if (EntityCacheUtil.getResult(
						CalendarioModelImpl.ENTITY_CACHE_ENABLED,
						CalendarioImpl.class, calendario.getPrimaryKey()) == null) {
				cacheResult(calendario);
			}
			else {
				calendario.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all calendarios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CalendarioImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CalendarioImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the calendario.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Calendario calendario) {
		EntityCacheUtil.removeResult(CalendarioModelImpl.ENTITY_CACHE_ENABLED,
			CalendarioImpl.class, calendario.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Calendario> calendarios) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Calendario calendario : calendarios) {
			EntityCacheUtil.removeResult(CalendarioModelImpl.ENTITY_CACHE_ENABLED,
				CalendarioImpl.class, calendario.getPrimaryKey());
		}
	}

	/**
	 * Creates a new calendario with the primary key. Does not add the calendario to the database.
	 *
	 * @param calendarioId the primary key for the new calendario
	 * @return the new calendario
	 */
	@Override
	public Calendario create(long calendarioId) {
		Calendario calendario = new CalendarioImpl();

		calendario.setNew(true);
		calendario.setPrimaryKey(calendarioId);

		return calendario;
	}

	/**
	 * Removes the calendario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param calendarioId the primary key of the calendario
	 * @return the calendario that was removed
	 * @throws es.davinciti.liferay.NoSuchCalendarioException if a calendario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Calendario remove(long calendarioId)
		throws NoSuchCalendarioException, SystemException {
		return remove((Serializable)calendarioId);
	}

	/**
	 * Removes the calendario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the calendario
	 * @return the calendario that was removed
	 * @throws es.davinciti.liferay.NoSuchCalendarioException if a calendario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Calendario remove(Serializable primaryKey)
		throws NoSuchCalendarioException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Calendario calendario = (Calendario)session.get(CalendarioImpl.class,
					primaryKey);

			if (calendario == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCalendarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(calendario);
		}
		catch (NoSuchCalendarioException nsee) {
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
	protected Calendario removeImpl(Calendario calendario)
		throws SystemException {
		calendario = toUnwrappedModel(calendario);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(calendario)) {
				calendario = (Calendario)session.get(CalendarioImpl.class,
						calendario.getPrimaryKeyObj());
			}

			if (calendario != null) {
				session.delete(calendario);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (calendario != null) {
			clearCache(calendario);
		}

		return calendario;
	}

	@Override
	public Calendario updateImpl(
		es.davinciti.liferay.model.Calendario calendario)
		throws SystemException {
		calendario = toUnwrappedModel(calendario);

		boolean isNew = calendario.isNew();

		CalendarioModelImpl calendarioModelImpl = (CalendarioModelImpl)calendario;

		Session session = null;

		try {
			session = openSession();

			if (calendario.isNew()) {
				session.save(calendario);

				calendario.setNew(false);
			}
			else {
				session.merge(calendario);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CalendarioModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((calendarioModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDUSERIDYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						calendarioModelImpl.getOriginalCompanyId(),
						calendarioModelImpl.getOriginalUserId(),
						calendarioModelImpl.getOriginalYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYIDUSERIDYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDUSERIDYEAR,
					args);

				args = new Object[] {
						calendarioModelImpl.getCompanyId(),
						calendarioModelImpl.getUserId(),
						calendarioModelImpl.getYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYIDUSERIDYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDUSERIDYEAR,
					args);
			}
		}

		EntityCacheUtil.putResult(CalendarioModelImpl.ENTITY_CACHE_ENABLED,
			CalendarioImpl.class, calendario.getPrimaryKey(), calendario);

		return calendario;
	}

	protected Calendario toUnwrappedModel(Calendario calendario) {
		if (calendario instanceof CalendarioImpl) {
			return calendario;
		}

		CalendarioImpl calendarioImpl = new CalendarioImpl();

		calendarioImpl.setNew(calendario.isNew());
		calendarioImpl.setPrimaryKey(calendario.getPrimaryKey());

		calendarioImpl.setCalendarioId(calendario.getCalendarioId());
		calendarioImpl.setCompanyId(calendario.getCompanyId());
		calendarioImpl.setUserId(calendario.getUserId());
		calendarioImpl.setYear(calendario.getYear());
		calendarioImpl.setCalendarJson(calendario.getCalendarJson());
		calendarioImpl.setStatus(calendario.getStatus());

		return calendarioImpl;
	}

	/**
	 * Returns the calendario with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the calendario
	 * @return the calendario
	 * @throws es.davinciti.liferay.NoSuchCalendarioException if a calendario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Calendario findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCalendarioException, SystemException {
		Calendario calendario = fetchByPrimaryKey(primaryKey);

		if (calendario == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCalendarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return calendario;
	}

	/**
	 * Returns the calendario with the primary key or throws a {@link es.davinciti.liferay.NoSuchCalendarioException} if it could not be found.
	 *
	 * @param calendarioId the primary key of the calendario
	 * @return the calendario
	 * @throws es.davinciti.liferay.NoSuchCalendarioException if a calendario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Calendario findByPrimaryKey(long calendarioId)
		throws NoSuchCalendarioException, SystemException {
		return findByPrimaryKey((Serializable)calendarioId);
	}

	/**
	 * Returns the calendario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the calendario
	 * @return the calendario, or <code>null</code> if a calendario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Calendario fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Calendario calendario = (Calendario)EntityCacheUtil.getResult(CalendarioModelImpl.ENTITY_CACHE_ENABLED,
				CalendarioImpl.class, primaryKey);

		if (calendario == _nullCalendario) {
			return null;
		}

		if (calendario == null) {
			Session session = null;

			try {
				session = openSession();

				calendario = (Calendario)session.get(CalendarioImpl.class,
						primaryKey);

				if (calendario != null) {
					cacheResult(calendario);
				}
				else {
					EntityCacheUtil.putResult(CalendarioModelImpl.ENTITY_CACHE_ENABLED,
						CalendarioImpl.class, primaryKey, _nullCalendario);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CalendarioModelImpl.ENTITY_CACHE_ENABLED,
					CalendarioImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return calendario;
	}

	/**
	 * Returns the calendario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param calendarioId the primary key of the calendario
	 * @return the calendario, or <code>null</code> if a calendario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Calendario fetchByPrimaryKey(long calendarioId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)calendarioId);
	}

	/**
	 * Returns all the calendarios.
	 *
	 * @return the calendarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Calendario> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the calendarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CalendarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of calendarios
	 * @param end the upper bound of the range of calendarios (not inclusive)
	 * @return the range of calendarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Calendario> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the calendarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CalendarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of calendarios
	 * @param end the upper bound of the range of calendarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of calendarios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Calendario> findAll(int start, int end,
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

		List<Calendario> list = (List<Calendario>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CALENDARIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CALENDARIO;

				if (pagination) {
					sql = sql.concat(CalendarioModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Calendario>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Calendario>(list);
				}
				else {
					list = (List<Calendario>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the calendarios from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Calendario calendario : findAll()) {
			remove(calendario);
		}
	}

	/**
	 * Returns the number of calendarios.
	 *
	 * @return the number of calendarios
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

				Query q = session.createQuery(_SQL_COUNT_CALENDARIO);

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
	 * Initializes the calendario persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.Calendario")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Calendario>> listenersList = new ArrayList<ModelListener<Calendario>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Calendario>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CalendarioImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CALENDARIO = "SELECT calendario FROM Calendario calendario";
	private static final String _SQL_SELECT_CALENDARIO_WHERE = "SELECT calendario FROM Calendario calendario WHERE ";
	private static final String _SQL_COUNT_CALENDARIO = "SELECT COUNT(calendario) FROM Calendario calendario";
	private static final String _SQL_COUNT_CALENDARIO_WHERE = "SELECT COUNT(calendario) FROM Calendario calendario WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "calendario.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Calendario exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Calendario exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CalendarioPersistenceImpl.class);
	private static Calendario _nullCalendario = new CalendarioImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Calendario> toCacheModel() {
				return _nullCalendarioCacheModel;
			}
		};

	private static CacheModel<Calendario> _nullCalendarioCacheModel = new CacheModel<Calendario>() {
			@Override
			public Calendario toEntityModel() {
				return _nullCalendario;
			}
		};
}