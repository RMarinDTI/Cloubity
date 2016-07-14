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

import es.davinciti.liferay.NoSuchDiasVacacionesException;
import es.davinciti.liferay.model.DiasVacaciones;
import es.davinciti.liferay.model.impl.DiasVacacionesImpl;
import es.davinciti.liferay.model.impl.DiasVacacionesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dias vacaciones service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see DiasVacacionesPersistence
 * @see DiasVacacionesUtil
 * @generated
 */
public class DiasVacacionesPersistenceImpl extends BasePersistenceImpl<DiasVacaciones>
	implements DiasVacacionesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DiasVacacionesUtil} to access the dias vacaciones persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DiasVacacionesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
			DiasVacacionesModelImpl.FINDER_CACHE_ENABLED,
			DiasVacacionesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
			DiasVacacionesModelImpl.FINDER_CACHE_ENABLED,
			DiasVacacionesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
			DiasVacacionesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
			DiasVacacionesModelImpl.FINDER_CACHE_ENABLED,
			DiasVacacionesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
			DiasVacacionesModelImpl.FINDER_CACHE_ENABLED,
			DiasVacacionesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			DiasVacacionesModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
			DiasVacacionesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the dias vacacioneses where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching dias vacacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DiasVacaciones> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dias vacacioneses where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dias vacacioneses
	 * @param end the upper bound of the range of dias vacacioneses (not inclusive)
	 * @return the range of matching dias vacacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DiasVacaciones> findByCompanyId(long companyId, int start,
		int end) throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dias vacacioneses where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dias vacacioneses
	 * @param end the upper bound of the range of dias vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dias vacacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DiasVacaciones> findByCompanyId(long companyId, int start,
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

		List<DiasVacaciones> list = (List<DiasVacaciones>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DiasVacaciones diasVacaciones : list) {
				if ((companyId != diasVacaciones.getCompanyId())) {
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

			query.append(_SQL_SELECT_DIASVACACIONES_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DiasVacacionesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<DiasVacaciones>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DiasVacaciones>(list);
				}
				else {
					list = (List<DiasVacaciones>)QueryUtil.list(q,
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
	 * Returns the first dias vacaciones in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dias vacaciones
	 * @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a matching dias vacaciones could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDiasVacacionesException, SystemException {
		DiasVacaciones diasVacaciones = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (diasVacaciones != null) {
			return diasVacaciones;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDiasVacacionesException(msg.toString());
	}

	/**
	 * Returns the first dias vacaciones in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dias vacaciones, or <code>null</code> if a matching dias vacaciones could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DiasVacaciones> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dias vacaciones in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dias vacaciones
	 * @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a matching dias vacaciones could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchDiasVacacionesException, SystemException {
		DiasVacaciones diasVacaciones = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (diasVacaciones != null) {
			return diasVacaciones;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDiasVacacionesException(msg.toString());
	}

	/**
	 * Returns the last dias vacaciones in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dias vacaciones, or <code>null</code> if a matching dias vacaciones could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<DiasVacaciones> list = findByCompanyId(companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dias vacacioneses before and after the current dias vacaciones in the ordered set where companyId = &#63;.
	 *
	 * @param diasVacacionesId the primary key of the current dias vacaciones
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dias vacaciones
	 * @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a dias vacaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones[] findByCompanyId_PrevAndNext(long diasVacacionesId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchDiasVacacionesException, SystemException {
		DiasVacaciones diasVacaciones = findByPrimaryKey(diasVacacionesId);

		Session session = null;

		try {
			session = openSession();

			DiasVacaciones[] array = new DiasVacacionesImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, diasVacaciones,
					companyId, orderByComparator, true);

			array[1] = diasVacaciones;

			array[2] = getByCompanyId_PrevAndNext(session, diasVacaciones,
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

	protected DiasVacaciones getByCompanyId_PrevAndNext(Session session,
		DiasVacaciones diasVacaciones, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DIASVACACIONES_WHERE);

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
			query.append(DiasVacacionesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(diasVacaciones);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DiasVacaciones> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dias vacacioneses where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (DiasVacaciones diasVacaciones : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(diasVacaciones);
		}
	}

	/**
	 * Returns the number of dias vacacioneses where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching dias vacacioneses
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

			query.append(_SQL_COUNT_DIASVACACIONES_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "diasVacaciones.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
			DiasVacacionesModelImpl.FINDER_CACHE_ENABLED,
			DiasVacacionesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
			DiasVacacionesModelImpl.FINDER_CACHE_ENABLED,
			DiasVacacionesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			DiasVacacionesModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
			DiasVacacionesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the dias vacacioneses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching dias vacacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DiasVacaciones> findByUserId(long userId)
		throws SystemException {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dias vacacioneses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of dias vacacioneses
	 * @param end the upper bound of the range of dias vacacioneses (not inclusive)
	 * @return the range of matching dias vacacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DiasVacaciones> findByUserId(long userId, int start, int end)
		throws SystemException {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dias vacacioneses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of dias vacacioneses
	 * @param end the upper bound of the range of dias vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dias vacacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DiasVacaciones> findByUserId(long userId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<DiasVacaciones> list = (List<DiasVacaciones>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DiasVacaciones diasVacaciones : list) {
				if ((userId != diasVacaciones.getUserId())) {
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

			query.append(_SQL_SELECT_DIASVACACIONES_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DiasVacacionesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<DiasVacaciones>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DiasVacaciones>(list);
				}
				else {
					list = (List<DiasVacaciones>)QueryUtil.list(q,
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
	 * Returns the first dias vacaciones in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dias vacaciones
	 * @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a matching dias vacaciones could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones findByUserId_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchDiasVacacionesException, SystemException {
		DiasVacaciones diasVacaciones = fetchByUserId_First(userId,
				orderByComparator);

		if (diasVacaciones != null) {
			return diasVacaciones;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDiasVacacionesException(msg.toString());
	}

	/**
	 * Returns the first dias vacaciones in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dias vacaciones, or <code>null</code> if a matching dias vacaciones could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones fetchByUserId_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DiasVacaciones> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dias vacaciones in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dias vacaciones
	 * @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a matching dias vacaciones could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones findByUserId_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchDiasVacacionesException, SystemException {
		DiasVacaciones diasVacaciones = fetchByUserId_Last(userId,
				orderByComparator);

		if (diasVacaciones != null) {
			return diasVacaciones;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDiasVacacionesException(msg.toString());
	}

	/**
	 * Returns the last dias vacaciones in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dias vacaciones, or <code>null</code> if a matching dias vacaciones could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones fetchByUserId_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<DiasVacaciones> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dias vacacioneses before and after the current dias vacaciones in the ordered set where userId = &#63;.
	 *
	 * @param diasVacacionesId the primary key of the current dias vacaciones
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dias vacaciones
	 * @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a dias vacaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones[] findByUserId_PrevAndNext(long diasVacacionesId,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchDiasVacacionesException, SystemException {
		DiasVacaciones diasVacaciones = findByPrimaryKey(diasVacacionesId);

		Session session = null;

		try {
			session = openSession();

			DiasVacaciones[] array = new DiasVacacionesImpl[3];

			array[0] = getByUserId_PrevAndNext(session, diasVacaciones, userId,
					orderByComparator, true);

			array[1] = diasVacaciones;

			array[2] = getByUserId_PrevAndNext(session, diasVacaciones, userId,
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

	protected DiasVacaciones getByUserId_PrevAndNext(Session session,
		DiasVacaciones diasVacaciones, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DIASVACACIONES_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

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
			query.append(DiasVacacionesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(diasVacaciones);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DiasVacaciones> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dias vacacioneses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUserId(long userId) throws SystemException {
		for (DiasVacaciones diasVacaciones : findByUserId(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(diasVacaciones);
		}
	}

	/**
	 * Returns the number of dias vacacioneses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching dias vacacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUserId(long userId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DIASVACACIONES_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "diasVacaciones.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYIDUSERIDYEAR =
		new FinderPath(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
			DiasVacacionesModelImpl.FINDER_CACHE_ENABLED,
			DiasVacacionesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCompanyIdUserIdYear",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDUSERIDYEAR =
		new FinderPath(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
			DiasVacacionesModelImpl.FINDER_CACHE_ENABLED,
			DiasVacacionesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCompanyIdUserIdYear",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			},
			DiasVacacionesModelImpl.COMPANYID_COLUMN_BITMASK |
			DiasVacacionesModelImpl.USERID_COLUMN_BITMASK |
			DiasVacacionesModelImpl.YEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYIDUSERIDYEAR = new FinderPath(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
			DiasVacacionesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCompanyIdUserIdYear",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the dias vacacioneses where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @return the matching dias vacacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DiasVacaciones> findByCompanyIdUserIdYear(long companyId,
		long userId, int year) throws SystemException {
		return findByCompanyIdUserIdYear(companyId, userId, year,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dias vacacioneses where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @param start the lower bound of the range of dias vacacioneses
	 * @param end the upper bound of the range of dias vacacioneses (not inclusive)
	 * @return the range of matching dias vacacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DiasVacaciones> findByCompanyIdUserIdYear(long companyId,
		long userId, int year, int start, int end) throws SystemException {
		return findByCompanyIdUserIdYear(companyId, userId, year, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the dias vacacioneses where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @param start the lower bound of the range of dias vacacioneses
	 * @param end the upper bound of the range of dias vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dias vacacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DiasVacaciones> findByCompanyIdUserIdYear(long companyId,
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

		List<DiasVacaciones> list = (List<DiasVacaciones>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DiasVacaciones diasVacaciones : list) {
				if ((companyId != diasVacaciones.getCompanyId()) ||
						(userId != diasVacaciones.getUserId()) ||
						(year != diasVacaciones.getYear())) {
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

			query.append(_SQL_SELECT_DIASVACACIONES_WHERE);

			query.append(_FINDER_COLUMN_COMPANYIDUSERIDYEAR_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYIDUSERIDYEAR_USERID_2);

			query.append(_FINDER_COLUMN_COMPANYIDUSERIDYEAR_YEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DiasVacacionesModelImpl.ORDER_BY_JPQL);
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
					list = (List<DiasVacaciones>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DiasVacaciones>(list);
				}
				else {
					list = (List<DiasVacaciones>)QueryUtil.list(q,
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
	 * Returns the first dias vacaciones in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dias vacaciones
	 * @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a matching dias vacaciones could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones findByCompanyIdUserIdYear_First(long companyId,
		long userId, int year, OrderByComparator orderByComparator)
		throws NoSuchDiasVacacionesException, SystemException {
		DiasVacaciones diasVacaciones = fetchByCompanyIdUserIdYear_First(companyId,
				userId, year, orderByComparator);

		if (diasVacaciones != null) {
			return diasVacaciones;
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

		throw new NoSuchDiasVacacionesException(msg.toString());
	}

	/**
	 * Returns the first dias vacaciones in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dias vacaciones, or <code>null</code> if a matching dias vacaciones could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones fetchByCompanyIdUserIdYear_First(long companyId,
		long userId, int year, OrderByComparator orderByComparator)
		throws SystemException {
		List<DiasVacaciones> list = findByCompanyIdUserIdYear(companyId,
				userId, year, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dias vacaciones in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dias vacaciones
	 * @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a matching dias vacaciones could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones findByCompanyIdUserIdYear_Last(long companyId,
		long userId, int year, OrderByComparator orderByComparator)
		throws NoSuchDiasVacacionesException, SystemException {
		DiasVacaciones diasVacaciones = fetchByCompanyIdUserIdYear_Last(companyId,
				userId, year, orderByComparator);

		if (diasVacaciones != null) {
			return diasVacaciones;
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

		throw new NoSuchDiasVacacionesException(msg.toString());
	}

	/**
	 * Returns the last dias vacaciones in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dias vacaciones, or <code>null</code> if a matching dias vacaciones could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones fetchByCompanyIdUserIdYear_Last(long companyId,
		long userId, int year, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCompanyIdUserIdYear(companyId, userId, year);

		if (count == 0) {
			return null;
		}

		List<DiasVacaciones> list = findByCompanyIdUserIdYear(companyId,
				userId, year, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dias vacacioneses before and after the current dias vacaciones in the ordered set where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * @param diasVacacionesId the primary key of the current dias vacaciones
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dias vacaciones
	 * @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a dias vacaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones[] findByCompanyIdUserIdYear_PrevAndNext(
		long diasVacacionesId, long companyId, long userId, int year,
		OrderByComparator orderByComparator)
		throws NoSuchDiasVacacionesException, SystemException {
		DiasVacaciones diasVacaciones = findByPrimaryKey(diasVacacionesId);

		Session session = null;

		try {
			session = openSession();

			DiasVacaciones[] array = new DiasVacacionesImpl[3];

			array[0] = getByCompanyIdUserIdYear_PrevAndNext(session,
					diasVacaciones, companyId, userId, year, orderByComparator,
					true);

			array[1] = diasVacaciones;

			array[2] = getByCompanyIdUserIdYear_PrevAndNext(session,
					diasVacaciones, companyId, userId, year, orderByComparator,
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

	protected DiasVacaciones getByCompanyIdUserIdYear_PrevAndNext(
		Session session, DiasVacaciones diasVacaciones, long companyId,
		long userId, int year, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DIASVACACIONES_WHERE);

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
			query.append(DiasVacacionesModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(diasVacaciones);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DiasVacaciones> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dias vacacioneses where companyId = &#63; and userId = &#63; and year = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyIdUserIdYear(long companyId, long userId,
		int year) throws SystemException {
		for (DiasVacaciones diasVacaciones : findByCompanyIdUserIdYear(
				companyId, userId, year, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(diasVacaciones);
		}
	}

	/**
	 * Returns the number of dias vacacioneses where companyId = &#63; and userId = &#63; and year = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param year the year
	 * @return the number of matching dias vacacioneses
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

			query.append(_SQL_COUNT_DIASVACACIONES_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYIDUSERIDYEAR_COMPANYID_2 = "diasVacaciones.companyId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYIDUSERIDYEAR_USERID_2 = "diasVacaciones.userId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYIDUSERIDYEAR_YEAR_2 = "diasVacaciones.year = ?";

	public DiasVacacionesPersistenceImpl() {
		setModelClass(DiasVacaciones.class);
	}

	/**
	 * Caches the dias vacaciones in the entity cache if it is enabled.
	 *
	 * @param diasVacaciones the dias vacaciones
	 */
	@Override
	public void cacheResult(DiasVacaciones diasVacaciones) {
		EntityCacheUtil.putResult(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
			DiasVacacionesImpl.class, diasVacaciones.getPrimaryKey(),
			diasVacaciones);

		diasVacaciones.resetOriginalValues();
	}

	/**
	 * Caches the dias vacacioneses in the entity cache if it is enabled.
	 *
	 * @param diasVacacioneses the dias vacacioneses
	 */
	@Override
	public void cacheResult(List<DiasVacaciones> diasVacacioneses) {
		for (DiasVacaciones diasVacaciones : diasVacacioneses) {
			if (EntityCacheUtil.getResult(
						DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
						DiasVacacionesImpl.class, diasVacaciones.getPrimaryKey()) == null) {
				cacheResult(diasVacaciones);
			}
			else {
				diasVacaciones.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dias vacacioneses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DiasVacacionesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DiasVacacionesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dias vacaciones.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DiasVacaciones diasVacaciones) {
		EntityCacheUtil.removeResult(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
			DiasVacacionesImpl.class, diasVacaciones.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DiasVacaciones> diasVacacioneses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DiasVacaciones diasVacaciones : diasVacacioneses) {
			EntityCacheUtil.removeResult(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
				DiasVacacionesImpl.class, diasVacaciones.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dias vacaciones with the primary key. Does not add the dias vacaciones to the database.
	 *
	 * @param diasVacacionesId the primary key for the new dias vacaciones
	 * @return the new dias vacaciones
	 */
	@Override
	public DiasVacaciones create(long diasVacacionesId) {
		DiasVacaciones diasVacaciones = new DiasVacacionesImpl();

		diasVacaciones.setNew(true);
		diasVacaciones.setPrimaryKey(diasVacacionesId);

		return diasVacaciones;
	}

	/**
	 * Removes the dias vacaciones with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param diasVacacionesId the primary key of the dias vacaciones
	 * @return the dias vacaciones that was removed
	 * @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a dias vacaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones remove(long diasVacacionesId)
		throws NoSuchDiasVacacionesException, SystemException {
		return remove((Serializable)diasVacacionesId);
	}

	/**
	 * Removes the dias vacaciones with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dias vacaciones
	 * @return the dias vacaciones that was removed
	 * @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a dias vacaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones remove(Serializable primaryKey)
		throws NoSuchDiasVacacionesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DiasVacaciones diasVacaciones = (DiasVacaciones)session.get(DiasVacacionesImpl.class,
					primaryKey);

			if (diasVacaciones == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDiasVacacionesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(diasVacaciones);
		}
		catch (NoSuchDiasVacacionesException nsee) {
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
	protected DiasVacaciones removeImpl(DiasVacaciones diasVacaciones)
		throws SystemException {
		diasVacaciones = toUnwrappedModel(diasVacaciones);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(diasVacaciones)) {
				diasVacaciones = (DiasVacaciones)session.get(DiasVacacionesImpl.class,
						diasVacaciones.getPrimaryKeyObj());
			}

			if (diasVacaciones != null) {
				session.delete(diasVacaciones);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (diasVacaciones != null) {
			clearCache(diasVacaciones);
		}

		return diasVacaciones;
	}

	@Override
	public DiasVacaciones updateImpl(
		es.davinciti.liferay.model.DiasVacaciones diasVacaciones)
		throws SystemException {
		diasVacaciones = toUnwrappedModel(diasVacaciones);

		boolean isNew = diasVacaciones.isNew();

		DiasVacacionesModelImpl diasVacacionesModelImpl = (DiasVacacionesModelImpl)diasVacaciones;

		Session session = null;

		try {
			session = openSession();

			if (diasVacaciones.isNew()) {
				session.save(diasVacaciones);

				diasVacaciones.setNew(false);
			}
			else {
				session.merge(diasVacaciones);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DiasVacacionesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((diasVacacionesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						diasVacacionesModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { diasVacacionesModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((diasVacacionesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						diasVacacionesModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { diasVacacionesModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}

			if ((diasVacacionesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDUSERIDYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						diasVacacionesModelImpl.getOriginalCompanyId(),
						diasVacacionesModelImpl.getOriginalUserId(),
						diasVacacionesModelImpl.getOriginalYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYIDUSERIDYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDUSERIDYEAR,
					args);

				args = new Object[] {
						diasVacacionesModelImpl.getCompanyId(),
						diasVacacionesModelImpl.getUserId(),
						diasVacacionesModelImpl.getYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYIDUSERIDYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDUSERIDYEAR,
					args);
			}
		}

		EntityCacheUtil.putResult(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
			DiasVacacionesImpl.class, diasVacaciones.getPrimaryKey(),
			diasVacaciones);

		return diasVacaciones;
	}

	protected DiasVacaciones toUnwrappedModel(DiasVacaciones diasVacaciones) {
		if (diasVacaciones instanceof DiasVacacionesImpl) {
			return diasVacaciones;
		}

		DiasVacacionesImpl diasVacacionesImpl = new DiasVacacionesImpl();

		diasVacacionesImpl.setNew(diasVacaciones.isNew());
		diasVacacionesImpl.setPrimaryKey(diasVacaciones.getPrimaryKey());

		diasVacacionesImpl.setDiasVacacionesId(diasVacaciones.getDiasVacacionesId());
		diasVacacionesImpl.setCompanyId(diasVacaciones.getCompanyId());
		diasVacacionesImpl.setUserId(diasVacaciones.getUserId());
		diasVacacionesImpl.setYear(diasVacaciones.getYear());
		diasVacacionesImpl.setDisponibles(diasVacaciones.getDisponibles());
		diasVacacionesImpl.setSolicitados(diasVacaciones.getSolicitados());
		diasVacacionesImpl.setAprobados(diasVacaciones.getAprobados());
		diasVacacionesImpl.setPendientes(diasVacaciones.getPendientes());
		diasVacacionesImpl.setAsignado(diasVacaciones.getAsignado());

		return diasVacacionesImpl;
	}

	/**
	 * Returns the dias vacaciones with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dias vacaciones
	 * @return the dias vacaciones
	 * @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a dias vacaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDiasVacacionesException, SystemException {
		DiasVacaciones diasVacaciones = fetchByPrimaryKey(primaryKey);

		if (diasVacaciones == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDiasVacacionesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return diasVacaciones;
	}

	/**
	 * Returns the dias vacaciones with the primary key or throws a {@link es.davinciti.liferay.NoSuchDiasVacacionesException} if it could not be found.
	 *
	 * @param diasVacacionesId the primary key of the dias vacaciones
	 * @return the dias vacaciones
	 * @throws es.davinciti.liferay.NoSuchDiasVacacionesException if a dias vacaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones findByPrimaryKey(long diasVacacionesId)
		throws NoSuchDiasVacacionesException, SystemException {
		return findByPrimaryKey((Serializable)diasVacacionesId);
	}

	/**
	 * Returns the dias vacaciones with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dias vacaciones
	 * @return the dias vacaciones, or <code>null</code> if a dias vacaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DiasVacaciones diasVacaciones = (DiasVacaciones)EntityCacheUtil.getResult(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
				DiasVacacionesImpl.class, primaryKey);

		if (diasVacaciones == _nullDiasVacaciones) {
			return null;
		}

		if (diasVacaciones == null) {
			Session session = null;

			try {
				session = openSession();

				diasVacaciones = (DiasVacaciones)session.get(DiasVacacionesImpl.class,
						primaryKey);

				if (diasVacaciones != null) {
					cacheResult(diasVacaciones);
				}
				else {
					EntityCacheUtil.putResult(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
						DiasVacacionesImpl.class, primaryKey,
						_nullDiasVacaciones);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DiasVacacionesModelImpl.ENTITY_CACHE_ENABLED,
					DiasVacacionesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return diasVacaciones;
	}

	/**
	 * Returns the dias vacaciones with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param diasVacacionesId the primary key of the dias vacaciones
	 * @return the dias vacaciones, or <code>null</code> if a dias vacaciones with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DiasVacaciones fetchByPrimaryKey(long diasVacacionesId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)diasVacacionesId);
	}

	/**
	 * Returns all the dias vacacioneses.
	 *
	 * @return the dias vacacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DiasVacaciones> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dias vacacioneses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dias vacacioneses
	 * @param end the upper bound of the range of dias vacacioneses (not inclusive)
	 * @return the range of dias vacacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DiasVacaciones> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dias vacacioneses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.DiasVacacionesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dias vacacioneses
	 * @param end the upper bound of the range of dias vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dias vacacioneses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DiasVacaciones> findAll(int start, int end,
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

		List<DiasVacaciones> list = (List<DiasVacaciones>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DIASVACACIONES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DIASVACACIONES;

				if (pagination) {
					sql = sql.concat(DiasVacacionesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DiasVacaciones>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DiasVacaciones>(list);
				}
				else {
					list = (List<DiasVacaciones>)QueryUtil.list(q,
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
	 * Removes all the dias vacacioneses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DiasVacaciones diasVacaciones : findAll()) {
			remove(diasVacaciones);
		}
	}

	/**
	 * Returns the number of dias vacacioneses.
	 *
	 * @return the number of dias vacacioneses
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

				Query q = session.createQuery(_SQL_COUNT_DIASVACACIONES);

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
	 * Initializes the dias vacaciones persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.DiasVacaciones")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DiasVacaciones>> listenersList = new ArrayList<ModelListener<DiasVacaciones>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DiasVacaciones>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DiasVacacionesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DIASVACACIONES = "SELECT diasVacaciones FROM DiasVacaciones diasVacaciones";
	private static final String _SQL_SELECT_DIASVACACIONES_WHERE = "SELECT diasVacaciones FROM DiasVacaciones diasVacaciones WHERE ";
	private static final String _SQL_COUNT_DIASVACACIONES = "SELECT COUNT(diasVacaciones) FROM DiasVacaciones diasVacaciones";
	private static final String _SQL_COUNT_DIASVACACIONES_WHERE = "SELECT COUNT(diasVacaciones) FROM DiasVacaciones diasVacaciones WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "diasVacaciones.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DiasVacaciones exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DiasVacaciones exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DiasVacacionesPersistenceImpl.class);
	private static DiasVacaciones _nullDiasVacaciones = new DiasVacacionesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DiasVacaciones> toCacheModel() {
				return _nullDiasVacacionesCacheModel;
			}
		};

	private static CacheModel<DiasVacaciones> _nullDiasVacacionesCacheModel = new CacheModel<DiasVacaciones>() {
			@Override
			public DiasVacaciones toEntityModel() {
				return _nullDiasVacaciones;
			}
		};
}