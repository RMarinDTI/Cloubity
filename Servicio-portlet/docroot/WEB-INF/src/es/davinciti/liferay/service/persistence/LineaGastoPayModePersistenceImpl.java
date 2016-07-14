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

import es.davinciti.liferay.NoSuchLineaGastoPayModeException;
import es.davinciti.liferay.model.LineaGastoPayMode;
import es.davinciti.liferay.model.impl.LineaGastoPayModeImpl;
import es.davinciti.liferay.model.impl.LineaGastoPayModeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the linea gasto pay mode service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoPayModePersistence
 * @see LineaGastoPayModeUtil
 * @generated
 */
public class LineaGastoPayModePersistenceImpl extends BasePersistenceImpl<LineaGastoPayMode>
	implements LineaGastoPayModePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LineaGastoPayModeUtil} to access the linea gasto pay mode persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LineaGastoPayModeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LineaGastoPayModeModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoPayModeModelImpl.FINDER_CACHE_ENABLED,
			LineaGastoPayModeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LineaGastoPayModeModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoPayModeModelImpl.FINDER_CACHE_ENABLED,
			LineaGastoPayModeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LineaGastoPayModeModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoPayModeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(LineaGastoPayModeModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoPayModeModelImpl.FINDER_CACHE_ENABLED,
			LineaGastoPayModeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(LineaGastoPayModeModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoPayModeModelImpl.FINDER_CACHE_ENABLED,
			LineaGastoPayModeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			LineaGastoPayModeModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(LineaGastoPayModeModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoPayModeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the linea gasto pay modes where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching linea gasto pay modes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoPayMode> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the linea gasto pay modes where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoPayModeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of linea gasto pay modes
	 * @param end the upper bound of the range of linea gasto pay modes (not inclusive)
	 * @return the range of matching linea gasto pay modes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoPayMode> findByCompanyId(long companyId, int start,
		int end) throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto pay modes where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoPayModeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of linea gasto pay modes
	 * @param end the upper bound of the range of linea gasto pay modes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching linea gasto pay modes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoPayMode> findByCompanyId(long companyId, int start,
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

		List<LineaGastoPayMode> list = (List<LineaGastoPayMode>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LineaGastoPayMode lineaGastoPayMode : list) {
				if ((companyId != lineaGastoPayMode.getCompanyId())) {
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

			query.append(_SQL_SELECT_LINEAGASTOPAYMODE_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LineaGastoPayModeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<LineaGastoPayMode>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LineaGastoPayMode>(list);
				}
				else {
					list = (List<LineaGastoPayMode>)QueryUtil.list(q,
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
	 * Returns the first linea gasto pay mode in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching linea gasto pay mode
	 * @throws es.davinciti.liferay.NoSuchLineaGastoPayModeException if a matching linea gasto pay mode could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoPayMode findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchLineaGastoPayModeException, SystemException {
		LineaGastoPayMode lineaGastoPayMode = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (lineaGastoPayMode != null) {
			return lineaGastoPayMode;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLineaGastoPayModeException(msg.toString());
	}

	/**
	 * Returns the first linea gasto pay mode in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching linea gasto pay mode, or <code>null</code> if a matching linea gasto pay mode could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoPayMode fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<LineaGastoPayMode> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last linea gasto pay mode in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching linea gasto pay mode
	 * @throws es.davinciti.liferay.NoSuchLineaGastoPayModeException if a matching linea gasto pay mode could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoPayMode findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchLineaGastoPayModeException, SystemException {
		LineaGastoPayMode lineaGastoPayMode = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (lineaGastoPayMode != null) {
			return lineaGastoPayMode;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLineaGastoPayModeException(msg.toString());
	}

	/**
	 * Returns the last linea gasto pay mode in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching linea gasto pay mode, or <code>null</code> if a matching linea gasto pay mode could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoPayMode fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<LineaGastoPayMode> list = findByCompanyId(companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the linea gasto pay modes before and after the current linea gasto pay mode in the ordered set where companyId = &#63;.
	 *
	 * @param paymodeId the primary key of the current linea gasto pay mode
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next linea gasto pay mode
	 * @throws es.davinciti.liferay.NoSuchLineaGastoPayModeException if a linea gasto pay mode with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoPayMode[] findByCompanyId_PrevAndNext(long paymodeId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchLineaGastoPayModeException, SystemException {
		LineaGastoPayMode lineaGastoPayMode = findByPrimaryKey(paymodeId);

		Session session = null;

		try {
			session = openSession();

			LineaGastoPayMode[] array = new LineaGastoPayModeImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, lineaGastoPayMode,
					companyId, orderByComparator, true);

			array[1] = lineaGastoPayMode;

			array[2] = getByCompanyId_PrevAndNext(session, lineaGastoPayMode,
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

	protected LineaGastoPayMode getByCompanyId_PrevAndNext(Session session,
		LineaGastoPayMode lineaGastoPayMode, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LINEAGASTOPAYMODE_WHERE);

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
			query.append(LineaGastoPayModeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lineaGastoPayMode);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LineaGastoPayMode> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the linea gasto pay modes where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (LineaGastoPayMode lineaGastoPayMode : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(lineaGastoPayMode);
		}
	}

	/**
	 * Returns the number of linea gasto pay modes where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching linea gasto pay modes
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

			query.append(_SQL_COUNT_LINEAGASTOPAYMODE_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "lineaGastoPayMode.companyId = ?";

	public LineaGastoPayModePersistenceImpl() {
		setModelClass(LineaGastoPayMode.class);
	}

	/**
	 * Caches the linea gasto pay mode in the entity cache if it is enabled.
	 *
	 * @param lineaGastoPayMode the linea gasto pay mode
	 */
	@Override
	public void cacheResult(LineaGastoPayMode lineaGastoPayMode) {
		EntityCacheUtil.putResult(LineaGastoPayModeModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoPayModeImpl.class, lineaGastoPayMode.getPrimaryKey(),
			lineaGastoPayMode);

		lineaGastoPayMode.resetOriginalValues();
	}

	/**
	 * Caches the linea gasto pay modes in the entity cache if it is enabled.
	 *
	 * @param lineaGastoPayModes the linea gasto pay modes
	 */
	@Override
	public void cacheResult(List<LineaGastoPayMode> lineaGastoPayModes) {
		for (LineaGastoPayMode lineaGastoPayMode : lineaGastoPayModes) {
			if (EntityCacheUtil.getResult(
						LineaGastoPayModeModelImpl.ENTITY_CACHE_ENABLED,
						LineaGastoPayModeImpl.class,
						lineaGastoPayMode.getPrimaryKey()) == null) {
				cacheResult(lineaGastoPayMode);
			}
			else {
				lineaGastoPayMode.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all linea gasto pay modes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LineaGastoPayModeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LineaGastoPayModeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the linea gasto pay mode.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LineaGastoPayMode lineaGastoPayMode) {
		EntityCacheUtil.removeResult(LineaGastoPayModeModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoPayModeImpl.class, lineaGastoPayMode.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LineaGastoPayMode> lineaGastoPayModes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LineaGastoPayMode lineaGastoPayMode : lineaGastoPayModes) {
			EntityCacheUtil.removeResult(LineaGastoPayModeModelImpl.ENTITY_CACHE_ENABLED,
				LineaGastoPayModeImpl.class, lineaGastoPayMode.getPrimaryKey());
		}
	}

	/**
	 * Creates a new linea gasto pay mode with the primary key. Does not add the linea gasto pay mode to the database.
	 *
	 * @param paymodeId the primary key for the new linea gasto pay mode
	 * @return the new linea gasto pay mode
	 */
	@Override
	public LineaGastoPayMode create(long paymodeId) {
		LineaGastoPayMode lineaGastoPayMode = new LineaGastoPayModeImpl();

		lineaGastoPayMode.setNew(true);
		lineaGastoPayMode.setPrimaryKey(paymodeId);

		return lineaGastoPayMode;
	}

	/**
	 * Removes the linea gasto pay mode with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param paymodeId the primary key of the linea gasto pay mode
	 * @return the linea gasto pay mode that was removed
	 * @throws es.davinciti.liferay.NoSuchLineaGastoPayModeException if a linea gasto pay mode with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoPayMode remove(long paymodeId)
		throws NoSuchLineaGastoPayModeException, SystemException {
		return remove((Serializable)paymodeId);
	}

	/**
	 * Removes the linea gasto pay mode with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the linea gasto pay mode
	 * @return the linea gasto pay mode that was removed
	 * @throws es.davinciti.liferay.NoSuchLineaGastoPayModeException if a linea gasto pay mode with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoPayMode remove(Serializable primaryKey)
		throws NoSuchLineaGastoPayModeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LineaGastoPayMode lineaGastoPayMode = (LineaGastoPayMode)session.get(LineaGastoPayModeImpl.class,
					primaryKey);

			if (lineaGastoPayMode == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLineaGastoPayModeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lineaGastoPayMode);
		}
		catch (NoSuchLineaGastoPayModeException nsee) {
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
	protected LineaGastoPayMode removeImpl(LineaGastoPayMode lineaGastoPayMode)
		throws SystemException {
		lineaGastoPayMode = toUnwrappedModel(lineaGastoPayMode);

		lineaGastoPayModeToLineaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(lineaGastoPayMode.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lineaGastoPayMode)) {
				lineaGastoPayMode = (LineaGastoPayMode)session.get(LineaGastoPayModeImpl.class,
						lineaGastoPayMode.getPrimaryKeyObj());
			}

			if (lineaGastoPayMode != null) {
				session.delete(lineaGastoPayMode);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lineaGastoPayMode != null) {
			clearCache(lineaGastoPayMode);
		}

		return lineaGastoPayMode;
	}

	@Override
	public LineaGastoPayMode updateImpl(
		es.davinciti.liferay.model.LineaGastoPayMode lineaGastoPayMode)
		throws SystemException {
		lineaGastoPayMode = toUnwrappedModel(lineaGastoPayMode);

		boolean isNew = lineaGastoPayMode.isNew();

		LineaGastoPayModeModelImpl lineaGastoPayModeModelImpl = (LineaGastoPayModeModelImpl)lineaGastoPayMode;

		Session session = null;

		try {
			session = openSession();

			if (lineaGastoPayMode.isNew()) {
				session.save(lineaGastoPayMode);

				lineaGastoPayMode.setNew(false);
			}
			else {
				session.merge(lineaGastoPayMode);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LineaGastoPayModeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((lineaGastoPayModeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lineaGastoPayModeModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { lineaGastoPayModeModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}
		}

		EntityCacheUtil.putResult(LineaGastoPayModeModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoPayModeImpl.class, lineaGastoPayMode.getPrimaryKey(),
			lineaGastoPayMode);

		return lineaGastoPayMode;
	}

	protected LineaGastoPayMode toUnwrappedModel(
		LineaGastoPayMode lineaGastoPayMode) {
		if (lineaGastoPayMode instanceof LineaGastoPayModeImpl) {
			return lineaGastoPayMode;
		}

		LineaGastoPayModeImpl lineaGastoPayModeImpl = new LineaGastoPayModeImpl();

		lineaGastoPayModeImpl.setNew(lineaGastoPayMode.isNew());
		lineaGastoPayModeImpl.setPrimaryKey(lineaGastoPayMode.getPrimaryKey());

		lineaGastoPayModeImpl.setPaymodeId(lineaGastoPayMode.getPaymodeId());
		lineaGastoPayModeImpl.setCompanyId(lineaGastoPayMode.getCompanyId());
		lineaGastoPayModeImpl.setName(lineaGastoPayMode.getName());
		lineaGastoPayModeImpl.setDescription(lineaGastoPayMode.getDescription());

		return lineaGastoPayModeImpl;
	}

	/**
	 * Returns the linea gasto pay mode with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the linea gasto pay mode
	 * @return the linea gasto pay mode
	 * @throws es.davinciti.liferay.NoSuchLineaGastoPayModeException if a linea gasto pay mode with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoPayMode findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLineaGastoPayModeException, SystemException {
		LineaGastoPayMode lineaGastoPayMode = fetchByPrimaryKey(primaryKey);

		if (lineaGastoPayMode == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLineaGastoPayModeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lineaGastoPayMode;
	}

	/**
	 * Returns the linea gasto pay mode with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoPayModeException} if it could not be found.
	 *
	 * @param paymodeId the primary key of the linea gasto pay mode
	 * @return the linea gasto pay mode
	 * @throws es.davinciti.liferay.NoSuchLineaGastoPayModeException if a linea gasto pay mode with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoPayMode findByPrimaryKey(long paymodeId)
		throws NoSuchLineaGastoPayModeException, SystemException {
		return findByPrimaryKey((Serializable)paymodeId);
	}

	/**
	 * Returns the linea gasto pay mode with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the linea gasto pay mode
	 * @return the linea gasto pay mode, or <code>null</code> if a linea gasto pay mode with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoPayMode fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LineaGastoPayMode lineaGastoPayMode = (LineaGastoPayMode)EntityCacheUtil.getResult(LineaGastoPayModeModelImpl.ENTITY_CACHE_ENABLED,
				LineaGastoPayModeImpl.class, primaryKey);

		if (lineaGastoPayMode == _nullLineaGastoPayMode) {
			return null;
		}

		if (lineaGastoPayMode == null) {
			Session session = null;

			try {
				session = openSession();

				lineaGastoPayMode = (LineaGastoPayMode)session.get(LineaGastoPayModeImpl.class,
						primaryKey);

				if (lineaGastoPayMode != null) {
					cacheResult(lineaGastoPayMode);
				}
				else {
					EntityCacheUtil.putResult(LineaGastoPayModeModelImpl.ENTITY_CACHE_ENABLED,
						LineaGastoPayModeImpl.class, primaryKey,
						_nullLineaGastoPayMode);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LineaGastoPayModeModelImpl.ENTITY_CACHE_ENABLED,
					LineaGastoPayModeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lineaGastoPayMode;
	}

	/**
	 * Returns the linea gasto pay mode with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param paymodeId the primary key of the linea gasto pay mode
	 * @return the linea gasto pay mode, or <code>null</code> if a linea gasto pay mode with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoPayMode fetchByPrimaryKey(long paymodeId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)paymodeId);
	}

	/**
	 * Returns all the linea gasto pay modes.
	 *
	 * @return the linea gasto pay modes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoPayMode> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the linea gasto pay modes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoPayModeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linea gasto pay modes
	 * @param end the upper bound of the range of linea gasto pay modes (not inclusive)
	 * @return the range of linea gasto pay modes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoPayMode> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto pay modes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoPayModeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linea gasto pay modes
	 * @param end the upper bound of the range of linea gasto pay modes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gasto pay modes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoPayMode> findAll(int start, int end,
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

		List<LineaGastoPayMode> list = (List<LineaGastoPayMode>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LINEAGASTOPAYMODE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LINEAGASTOPAYMODE;

				if (pagination) {
					sql = sql.concat(LineaGastoPayModeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LineaGastoPayMode>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LineaGastoPayMode>(list);
				}
				else {
					list = (List<LineaGastoPayMode>)QueryUtil.list(q,
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
	 * Removes all the linea gasto pay modes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LineaGastoPayMode lineaGastoPayMode : findAll()) {
			remove(lineaGastoPayMode);
		}
	}

	/**
	 * Returns the number of linea gasto pay modes.
	 *
	 * @return the number of linea gasto pay modes
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

				Query q = session.createQuery(_SQL_COUNT_LINEAGASTOPAYMODE);

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
	 * Returns all the linea gastos associated with the linea gasto pay mode.
	 *
	 * @param pk the primary key of the linea gasto pay mode
	 * @return the linea gastos associated with the linea gasto pay mode
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk)
		throws SystemException {
		return getLineaGastos(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the linea gastos associated with the linea gasto pay mode.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoPayModeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto pay mode
	 * @param start the lower bound of the range of linea gasto pay modes
	 * @param end the upper bound of the range of linea gasto pay modes (not inclusive)
	 * @return the range of linea gastos associated with the linea gasto pay mode
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk,
		int start, int end) throws SystemException {
		return getLineaGastos(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gastos associated with the linea gasto pay mode.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoPayModeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto pay mode
	 * @param start the lower bound of the range of linea gasto pay modes
	 * @param end the upper bound of the range of linea gasto pay modes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gastos associated with the linea gasto pay mode
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return lineaGastoPayModeToLineaGastoTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of linea gastos associated with the linea gasto pay mode.
	 *
	 * @param pk the primary key of the linea gasto pay mode
	 * @return the number of linea gastos associated with the linea gasto pay mode
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getLineaGastosSize(long pk) throws SystemException {
		long[] pks = lineaGastoPayModeToLineaGastoTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the linea gasto is associated with the linea gasto pay mode.
	 *
	 * @param pk the primary key of the linea gasto pay mode
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @return <code>true</code> if the linea gasto is associated with the linea gasto pay mode; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		return lineaGastoPayModeToLineaGastoTableMapper.containsTableMapping(pk,
			lineaGastoPK);
	}

	/**
	 * Returns <code>true</code> if the linea gasto pay mode has any linea gastos associated with it.
	 *
	 * @param pk the primary key of the linea gasto pay mode to check for associations with linea gastos
	 * @return <code>true</code> if the linea gasto pay mode has any linea gastos associated with it; <code>false</code> otherwise
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
	 * Adds an association between the linea gasto pay mode and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto pay mode
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		lineaGastoPayModeToLineaGastoTableMapper.addTableMapping(pk,
			lineaGastoPK);
	}

	/**
	 * Adds an association between the linea gasto pay mode and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto pay mode
	 * @param lineaGasto the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws SystemException {
		lineaGastoPayModeToLineaGastoTableMapper.addTableMapping(pk,
			lineaGasto.getPrimaryKey());
	}

	/**
	 * Adds an association between the linea gasto pay mode and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto pay mode
	 * @param lineaGastoPKs the primary keys of the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		for (long lineaGastoPK : lineaGastoPKs) {
			lineaGastoPayModeToLineaGastoTableMapper.addTableMapping(pk,
				lineaGastoPK);
		}
	}

	/**
	 * Adds an association between the linea gasto pay mode and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto pay mode
	 * @param lineaGastos the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastos(long pk,
		List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGasto lineaGasto : lineaGastos) {
			lineaGastoPayModeToLineaGastoTableMapper.addTableMapping(pk,
				lineaGasto.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the linea gasto pay mode and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto pay mode to clear the associated linea gastos from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearLineaGastos(long pk) throws SystemException {
		lineaGastoPayModeToLineaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the linea gasto pay mode and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto pay mode
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		lineaGastoPayModeToLineaGastoTableMapper.deleteTableMapping(pk,
			lineaGastoPK);
	}

	/**
	 * Removes the association between the linea gasto pay mode and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto pay mode
	 * @param lineaGasto the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws SystemException {
		lineaGastoPayModeToLineaGastoTableMapper.deleteTableMapping(pk,
			lineaGasto.getPrimaryKey());
	}

	/**
	 * Removes the association between the linea gasto pay mode and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto pay mode
	 * @param lineaGastoPKs the primary keys of the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		for (long lineaGastoPK : lineaGastoPKs) {
			lineaGastoPayModeToLineaGastoTableMapper.deleteTableMapping(pk,
				lineaGastoPK);
		}
	}

	/**
	 * Removes the association between the linea gasto pay mode and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto pay mode
	 * @param lineaGastos the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastos(long pk,
		List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGasto lineaGasto : lineaGastos) {
			lineaGastoPayModeToLineaGastoTableMapper.deleteTableMapping(pk,
				lineaGasto.getPrimaryKey());
		}
	}

	/**
	 * Sets the linea gastos associated with the linea gasto pay mode, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto pay mode
	 * @param lineaGastoPKs the primary keys of the linea gastos to be associated with the linea gasto pay mode
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		Set<Long> newLineaGastoPKsSet = SetUtil.fromArray(lineaGastoPKs);
		Set<Long> oldLineaGastoPKsSet = SetUtil.fromArray(lineaGastoPayModeToLineaGastoTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeLineaGastoPKsSet = new HashSet<Long>(oldLineaGastoPKsSet);

		removeLineaGastoPKsSet.removeAll(newLineaGastoPKsSet);

		for (long removeLineaGastoPK : removeLineaGastoPKsSet) {
			lineaGastoPayModeToLineaGastoTableMapper.deleteTableMapping(pk,
				removeLineaGastoPK);
		}

		newLineaGastoPKsSet.removeAll(oldLineaGastoPKsSet);

		for (long newLineaGastoPK : newLineaGastoPKsSet) {
			lineaGastoPayModeToLineaGastoTableMapper.addTableMapping(pk,
				newLineaGastoPK);
		}
	}

	/**
	 * Sets the linea gastos associated with the linea gasto pay mode, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto pay mode
	 * @param lineaGastos the linea gastos to be associated with the linea gasto pay mode
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
			FinderCacheUtil.clearCache(LineaGastoPayModeModelImpl.MAPPING_TABLE_CMES_LINEAS_PAYMODES_NAME);
		}
	}

	/**
	 * Initializes the linea gasto pay mode persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.LineaGastoPayMode")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LineaGastoPayMode>> listenersList = new ArrayList<ModelListener<LineaGastoPayMode>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LineaGastoPayMode>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		lineaGastoPayModeToLineaGastoTableMapper = TableMapperFactory.getTableMapper("CMES_Lineas_PayModes",
				"paymodeId", "lineagastoId", this, lineaGastoPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(LineaGastoPayModeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("CMES_Lineas_PayModes");
	}

	@BeanReference(type = LineaGastoPersistence.class)
	protected LineaGastoPersistence lineaGastoPersistence;
	protected TableMapper<LineaGastoPayMode, es.davinciti.liferay.model.LineaGasto> lineaGastoPayModeToLineaGastoTableMapper;
	private static final String _SQL_SELECT_LINEAGASTOPAYMODE = "SELECT lineaGastoPayMode FROM LineaGastoPayMode lineaGastoPayMode";
	private static final String _SQL_SELECT_LINEAGASTOPAYMODE_WHERE = "SELECT lineaGastoPayMode FROM LineaGastoPayMode lineaGastoPayMode WHERE ";
	private static final String _SQL_COUNT_LINEAGASTOPAYMODE = "SELECT COUNT(lineaGastoPayMode) FROM LineaGastoPayMode lineaGastoPayMode";
	private static final String _SQL_COUNT_LINEAGASTOPAYMODE_WHERE = "SELECT COUNT(lineaGastoPayMode) FROM LineaGastoPayMode lineaGastoPayMode WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lineaGastoPayMode.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LineaGastoPayMode exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LineaGastoPayMode exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LineaGastoPayModePersistenceImpl.class);
	private static LineaGastoPayMode _nullLineaGastoPayMode = new LineaGastoPayModeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LineaGastoPayMode> toCacheModel() {
				return _nullLineaGastoPayModeCacheModel;
			}
		};

	private static CacheModel<LineaGastoPayMode> _nullLineaGastoPayModeCacheModel =
		new CacheModel<LineaGastoPayMode>() {
			@Override
			public LineaGastoPayMode toEntityModel() {
				return _nullLineaGastoPayMode;
			}
		};
}