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

import es.davinciti.liferay.NoSuchLineaGastoFamiliaException;
import es.davinciti.liferay.model.LineaGastoFamilia;
import es.davinciti.liferay.model.impl.LineaGastoFamiliaImpl;
import es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the linea gasto familia service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoFamiliaPersistence
 * @see LineaGastoFamiliaUtil
 * @generated
 */
public class LineaGastoFamiliaPersistenceImpl extends BasePersistenceImpl<LineaGastoFamilia>
	implements LineaGastoFamiliaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LineaGastoFamiliaUtil} to access the linea gasto familia persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LineaGastoFamiliaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LineaGastoFamiliaModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoFamiliaModelImpl.FINDER_CACHE_ENABLED,
			LineaGastoFamiliaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LineaGastoFamiliaModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoFamiliaModelImpl.FINDER_CACHE_ENABLED,
			LineaGastoFamiliaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LineaGastoFamiliaModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoFamiliaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(LineaGastoFamiliaModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoFamiliaModelImpl.FINDER_CACHE_ENABLED,
			LineaGastoFamiliaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(LineaGastoFamiliaModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoFamiliaModelImpl.FINDER_CACHE_ENABLED,
			LineaGastoFamiliaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			LineaGastoFamiliaModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(LineaGastoFamiliaModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoFamiliaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the linea gasto familias where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching linea gasto familias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoFamilia> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the linea gasto familias where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of linea gasto familias
	 * @param end the upper bound of the range of linea gasto familias (not inclusive)
	 * @return the range of matching linea gasto familias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoFamilia> findByCompanyId(long companyId, int start,
		int end) throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto familias where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of linea gasto familias
	 * @param end the upper bound of the range of linea gasto familias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching linea gasto familias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoFamilia> findByCompanyId(long companyId, int start,
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

		List<LineaGastoFamilia> list = (List<LineaGastoFamilia>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LineaGastoFamilia lineaGastoFamilia : list) {
				if ((companyId != lineaGastoFamilia.getCompanyId())) {
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

			query.append(_SQL_SELECT_LINEAGASTOFAMILIA_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LineaGastoFamiliaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<LineaGastoFamilia>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LineaGastoFamilia>(list);
				}
				else {
					list = (List<LineaGastoFamilia>)QueryUtil.list(q,
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
	 * Returns the first linea gasto familia in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching linea gasto familia
	 * @throws es.davinciti.liferay.NoSuchLineaGastoFamiliaException if a matching linea gasto familia could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoFamilia findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchLineaGastoFamiliaException, SystemException {
		LineaGastoFamilia lineaGastoFamilia = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (lineaGastoFamilia != null) {
			return lineaGastoFamilia;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLineaGastoFamiliaException(msg.toString());
	}

	/**
	 * Returns the first linea gasto familia in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching linea gasto familia, or <code>null</code> if a matching linea gasto familia could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoFamilia fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<LineaGastoFamilia> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last linea gasto familia in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching linea gasto familia
	 * @throws es.davinciti.liferay.NoSuchLineaGastoFamiliaException if a matching linea gasto familia could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoFamilia findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchLineaGastoFamiliaException, SystemException {
		LineaGastoFamilia lineaGastoFamilia = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (lineaGastoFamilia != null) {
			return lineaGastoFamilia;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLineaGastoFamiliaException(msg.toString());
	}

	/**
	 * Returns the last linea gasto familia in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching linea gasto familia, or <code>null</code> if a matching linea gasto familia could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoFamilia fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<LineaGastoFamilia> list = findByCompanyId(companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the linea gasto familias before and after the current linea gasto familia in the ordered set where companyId = &#63;.
	 *
	 * @param familiaId the primary key of the current linea gasto familia
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next linea gasto familia
	 * @throws es.davinciti.liferay.NoSuchLineaGastoFamiliaException if a linea gasto familia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoFamilia[] findByCompanyId_PrevAndNext(long familiaId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchLineaGastoFamiliaException, SystemException {
		LineaGastoFamilia lineaGastoFamilia = findByPrimaryKey(familiaId);

		Session session = null;

		try {
			session = openSession();

			LineaGastoFamilia[] array = new LineaGastoFamiliaImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, lineaGastoFamilia,
					companyId, orderByComparator, true);

			array[1] = lineaGastoFamilia;

			array[2] = getByCompanyId_PrevAndNext(session, lineaGastoFamilia,
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

	protected LineaGastoFamilia getByCompanyId_PrevAndNext(Session session,
		LineaGastoFamilia lineaGastoFamilia, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LINEAGASTOFAMILIA_WHERE);

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
			query.append(LineaGastoFamiliaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lineaGastoFamilia);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LineaGastoFamilia> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the linea gasto familias where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (LineaGastoFamilia lineaGastoFamilia : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(lineaGastoFamilia);
		}
	}

	/**
	 * Returns the number of linea gasto familias where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching linea gasto familias
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

			query.append(_SQL_COUNT_LINEAGASTOFAMILIA_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "lineaGastoFamilia.companyId = ?";

	public LineaGastoFamiliaPersistenceImpl() {
		setModelClass(LineaGastoFamilia.class);
	}

	/**
	 * Caches the linea gasto familia in the entity cache if it is enabled.
	 *
	 * @param lineaGastoFamilia the linea gasto familia
	 */
	@Override
	public void cacheResult(LineaGastoFamilia lineaGastoFamilia) {
		EntityCacheUtil.putResult(LineaGastoFamiliaModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoFamiliaImpl.class, lineaGastoFamilia.getPrimaryKey(),
			lineaGastoFamilia);

		lineaGastoFamilia.resetOriginalValues();
	}

	/**
	 * Caches the linea gasto familias in the entity cache if it is enabled.
	 *
	 * @param lineaGastoFamilias the linea gasto familias
	 */
	@Override
	public void cacheResult(List<LineaGastoFamilia> lineaGastoFamilias) {
		for (LineaGastoFamilia lineaGastoFamilia : lineaGastoFamilias) {
			if (EntityCacheUtil.getResult(
						LineaGastoFamiliaModelImpl.ENTITY_CACHE_ENABLED,
						LineaGastoFamiliaImpl.class,
						lineaGastoFamilia.getPrimaryKey()) == null) {
				cacheResult(lineaGastoFamilia);
			}
			else {
				lineaGastoFamilia.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all linea gasto familias.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LineaGastoFamiliaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LineaGastoFamiliaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the linea gasto familia.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LineaGastoFamilia lineaGastoFamilia) {
		EntityCacheUtil.removeResult(LineaGastoFamiliaModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoFamiliaImpl.class, lineaGastoFamilia.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LineaGastoFamilia> lineaGastoFamilias) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LineaGastoFamilia lineaGastoFamilia : lineaGastoFamilias) {
			EntityCacheUtil.removeResult(LineaGastoFamiliaModelImpl.ENTITY_CACHE_ENABLED,
				LineaGastoFamiliaImpl.class, lineaGastoFamilia.getPrimaryKey());
		}
	}

	/**
	 * Creates a new linea gasto familia with the primary key. Does not add the linea gasto familia to the database.
	 *
	 * @param familiaId the primary key for the new linea gasto familia
	 * @return the new linea gasto familia
	 */
	@Override
	public LineaGastoFamilia create(long familiaId) {
		LineaGastoFamilia lineaGastoFamilia = new LineaGastoFamiliaImpl();

		lineaGastoFamilia.setNew(true);
		lineaGastoFamilia.setPrimaryKey(familiaId);

		return lineaGastoFamilia;
	}

	/**
	 * Removes the linea gasto familia with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param familiaId the primary key of the linea gasto familia
	 * @return the linea gasto familia that was removed
	 * @throws es.davinciti.liferay.NoSuchLineaGastoFamiliaException if a linea gasto familia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoFamilia remove(long familiaId)
		throws NoSuchLineaGastoFamiliaException, SystemException {
		return remove((Serializable)familiaId);
	}

	/**
	 * Removes the linea gasto familia with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the linea gasto familia
	 * @return the linea gasto familia that was removed
	 * @throws es.davinciti.liferay.NoSuchLineaGastoFamiliaException if a linea gasto familia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoFamilia remove(Serializable primaryKey)
		throws NoSuchLineaGastoFamiliaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LineaGastoFamilia lineaGastoFamilia = (LineaGastoFamilia)session.get(LineaGastoFamiliaImpl.class,
					primaryKey);

			if (lineaGastoFamilia == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLineaGastoFamiliaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lineaGastoFamilia);
		}
		catch (NoSuchLineaGastoFamiliaException nsee) {
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
	protected LineaGastoFamilia removeImpl(LineaGastoFamilia lineaGastoFamilia)
		throws SystemException {
		lineaGastoFamilia = toUnwrappedModel(lineaGastoFamilia);

		lineaGastoFamiliaToLineaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(lineaGastoFamilia.getPrimaryKey());

		lineaGastoFamiliaToLineaGastoCategoriaTableMapper.deleteLeftPrimaryKeyTableMappings(lineaGastoFamilia.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lineaGastoFamilia)) {
				lineaGastoFamilia = (LineaGastoFamilia)session.get(LineaGastoFamiliaImpl.class,
						lineaGastoFamilia.getPrimaryKeyObj());
			}

			if (lineaGastoFamilia != null) {
				session.delete(lineaGastoFamilia);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lineaGastoFamilia != null) {
			clearCache(lineaGastoFamilia);
		}

		return lineaGastoFamilia;
	}

	@Override
	public LineaGastoFamilia updateImpl(
		es.davinciti.liferay.model.LineaGastoFamilia lineaGastoFamilia)
		throws SystemException {
		lineaGastoFamilia = toUnwrappedModel(lineaGastoFamilia);

		boolean isNew = lineaGastoFamilia.isNew();

		LineaGastoFamiliaModelImpl lineaGastoFamiliaModelImpl = (LineaGastoFamiliaModelImpl)lineaGastoFamilia;

		Session session = null;

		try {
			session = openSession();

			if (lineaGastoFamilia.isNew()) {
				session.save(lineaGastoFamilia);

				lineaGastoFamilia.setNew(false);
			}
			else {
				session.merge(lineaGastoFamilia);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LineaGastoFamiliaModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((lineaGastoFamiliaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lineaGastoFamiliaModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { lineaGastoFamiliaModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}
		}

		EntityCacheUtil.putResult(LineaGastoFamiliaModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoFamiliaImpl.class, lineaGastoFamilia.getPrimaryKey(),
			lineaGastoFamilia);

		return lineaGastoFamilia;
	}

	protected LineaGastoFamilia toUnwrappedModel(
		LineaGastoFamilia lineaGastoFamilia) {
		if (lineaGastoFamilia instanceof LineaGastoFamiliaImpl) {
			return lineaGastoFamilia;
		}

		LineaGastoFamiliaImpl lineaGastoFamiliaImpl = new LineaGastoFamiliaImpl();

		lineaGastoFamiliaImpl.setNew(lineaGastoFamilia.isNew());
		lineaGastoFamiliaImpl.setPrimaryKey(lineaGastoFamilia.getPrimaryKey());

		lineaGastoFamiliaImpl.setFamiliaId(lineaGastoFamilia.getFamiliaId());
		lineaGastoFamiliaImpl.setCompanyId(lineaGastoFamilia.getCompanyId());
		lineaGastoFamiliaImpl.setName(lineaGastoFamilia.getName());
		lineaGastoFamiliaImpl.setDescription(lineaGastoFamilia.getDescription());

		return lineaGastoFamiliaImpl;
	}

	/**
	 * Returns the linea gasto familia with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the linea gasto familia
	 * @return the linea gasto familia
	 * @throws es.davinciti.liferay.NoSuchLineaGastoFamiliaException if a linea gasto familia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoFamilia findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLineaGastoFamiliaException, SystemException {
		LineaGastoFamilia lineaGastoFamilia = fetchByPrimaryKey(primaryKey);

		if (lineaGastoFamilia == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLineaGastoFamiliaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lineaGastoFamilia;
	}

	/**
	 * Returns the linea gasto familia with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoFamiliaException} if it could not be found.
	 *
	 * @param familiaId the primary key of the linea gasto familia
	 * @return the linea gasto familia
	 * @throws es.davinciti.liferay.NoSuchLineaGastoFamiliaException if a linea gasto familia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoFamilia findByPrimaryKey(long familiaId)
		throws NoSuchLineaGastoFamiliaException, SystemException {
		return findByPrimaryKey((Serializable)familiaId);
	}

	/**
	 * Returns the linea gasto familia with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the linea gasto familia
	 * @return the linea gasto familia, or <code>null</code> if a linea gasto familia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoFamilia fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LineaGastoFamilia lineaGastoFamilia = (LineaGastoFamilia)EntityCacheUtil.getResult(LineaGastoFamiliaModelImpl.ENTITY_CACHE_ENABLED,
				LineaGastoFamiliaImpl.class, primaryKey);

		if (lineaGastoFamilia == _nullLineaGastoFamilia) {
			return null;
		}

		if (lineaGastoFamilia == null) {
			Session session = null;

			try {
				session = openSession();

				lineaGastoFamilia = (LineaGastoFamilia)session.get(LineaGastoFamiliaImpl.class,
						primaryKey);

				if (lineaGastoFamilia != null) {
					cacheResult(lineaGastoFamilia);
				}
				else {
					EntityCacheUtil.putResult(LineaGastoFamiliaModelImpl.ENTITY_CACHE_ENABLED,
						LineaGastoFamiliaImpl.class, primaryKey,
						_nullLineaGastoFamilia);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LineaGastoFamiliaModelImpl.ENTITY_CACHE_ENABLED,
					LineaGastoFamiliaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lineaGastoFamilia;
	}

	/**
	 * Returns the linea gasto familia with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param familiaId the primary key of the linea gasto familia
	 * @return the linea gasto familia, or <code>null</code> if a linea gasto familia with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoFamilia fetchByPrimaryKey(long familiaId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)familiaId);
	}

	/**
	 * Returns all the linea gasto familias.
	 *
	 * @return the linea gasto familias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoFamilia> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the linea gasto familias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linea gasto familias
	 * @param end the upper bound of the range of linea gasto familias (not inclusive)
	 * @return the range of linea gasto familias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoFamilia> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto familias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linea gasto familias
	 * @param end the upper bound of the range of linea gasto familias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gasto familias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoFamilia> findAll(int start, int end,
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

		List<LineaGastoFamilia> list = (List<LineaGastoFamilia>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LINEAGASTOFAMILIA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LINEAGASTOFAMILIA;

				if (pagination) {
					sql = sql.concat(LineaGastoFamiliaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LineaGastoFamilia>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LineaGastoFamilia>(list);
				}
				else {
					list = (List<LineaGastoFamilia>)QueryUtil.list(q,
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
	 * Removes all the linea gasto familias from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LineaGastoFamilia lineaGastoFamilia : findAll()) {
			remove(lineaGastoFamilia);
		}
	}

	/**
	 * Returns the number of linea gasto familias.
	 *
	 * @return the number of linea gasto familias
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

				Query q = session.createQuery(_SQL_COUNT_LINEAGASTOFAMILIA);

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
	 * Returns all the linea gastos associated with the linea gasto familia.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @return the linea gastos associated with the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk)
		throws SystemException {
		return getLineaGastos(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the linea gastos associated with the linea gasto familia.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param start the lower bound of the range of linea gasto familias
	 * @param end the upper bound of the range of linea gasto familias (not inclusive)
	 * @return the range of linea gastos associated with the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk,
		int start, int end) throws SystemException {
		return getLineaGastos(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gastos associated with the linea gasto familia.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param start the lower bound of the range of linea gasto familias
	 * @param end the upper bound of the range of linea gasto familias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gastos associated with the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return lineaGastoFamiliaToLineaGastoTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of linea gastos associated with the linea gasto familia.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @return the number of linea gastos associated with the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getLineaGastosSize(long pk) throws SystemException {
		long[] pks = lineaGastoFamiliaToLineaGastoTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the linea gasto is associated with the linea gasto familia.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @return <code>true</code> if the linea gasto is associated with the linea gasto familia; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		return lineaGastoFamiliaToLineaGastoTableMapper.containsTableMapping(pk,
			lineaGastoPK);
	}

	/**
	 * Returns <code>true</code> if the linea gasto familia has any linea gastos associated with it.
	 *
	 * @param pk the primary key of the linea gasto familia to check for associations with linea gastos
	 * @return <code>true</code> if the linea gasto familia has any linea gastos associated with it; <code>false</code> otherwise
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
	 * Adds an association between the linea gasto familia and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		lineaGastoFamiliaToLineaGastoTableMapper.addTableMapping(pk,
			lineaGastoPK);
	}

	/**
	 * Adds an association between the linea gasto familia and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGasto the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws SystemException {
		lineaGastoFamiliaToLineaGastoTableMapper.addTableMapping(pk,
			lineaGasto.getPrimaryKey());
	}

	/**
	 * Adds an association between the linea gasto familia and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoPKs the primary keys of the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		for (long lineaGastoPK : lineaGastoPKs) {
			lineaGastoFamiliaToLineaGastoTableMapper.addTableMapping(pk,
				lineaGastoPK);
		}
	}

	/**
	 * Adds an association between the linea gasto familia and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastos the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastos(long pk,
		List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGasto lineaGasto : lineaGastos) {
			lineaGastoFamiliaToLineaGastoTableMapper.addTableMapping(pk,
				lineaGasto.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the linea gasto familia and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia to clear the associated linea gastos from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearLineaGastos(long pk) throws SystemException {
		lineaGastoFamiliaToLineaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the linea gasto familia and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		lineaGastoFamiliaToLineaGastoTableMapper.deleteTableMapping(pk,
			lineaGastoPK);
	}

	/**
	 * Removes the association between the linea gasto familia and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGasto the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws SystemException {
		lineaGastoFamiliaToLineaGastoTableMapper.deleteTableMapping(pk,
			lineaGasto.getPrimaryKey());
	}

	/**
	 * Removes the association between the linea gasto familia and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoPKs the primary keys of the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		for (long lineaGastoPK : lineaGastoPKs) {
			lineaGastoFamiliaToLineaGastoTableMapper.deleteTableMapping(pk,
				lineaGastoPK);
		}
	}

	/**
	 * Removes the association between the linea gasto familia and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastos the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastos(long pk,
		List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGasto lineaGasto : lineaGastos) {
			lineaGastoFamiliaToLineaGastoTableMapper.deleteTableMapping(pk,
				lineaGasto.getPrimaryKey());
		}
	}

	/**
	 * Sets the linea gastos associated with the linea gasto familia, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoPKs the primary keys of the linea gastos to be associated with the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		Set<Long> newLineaGastoPKsSet = SetUtil.fromArray(lineaGastoPKs);
		Set<Long> oldLineaGastoPKsSet = SetUtil.fromArray(lineaGastoFamiliaToLineaGastoTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeLineaGastoPKsSet = new HashSet<Long>(oldLineaGastoPKsSet);

		removeLineaGastoPKsSet.removeAll(newLineaGastoPKsSet);

		for (long removeLineaGastoPK : removeLineaGastoPKsSet) {
			lineaGastoFamiliaToLineaGastoTableMapper.deleteTableMapping(pk,
				removeLineaGastoPK);
		}

		newLineaGastoPKsSet.removeAll(oldLineaGastoPKsSet);

		for (long newLineaGastoPK : newLineaGastoPKsSet) {
			lineaGastoFamiliaToLineaGastoTableMapper.addTableMapping(pk,
				newLineaGastoPK);
		}
	}

	/**
	 * Sets the linea gastos associated with the linea gasto familia, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastos the linea gastos to be associated with the linea gasto familia
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
			FinderCacheUtil.clearCache(LineaGastoFamiliaModelImpl.MAPPING_TABLE_CMES_LINEAS_FAMILIAS_NAME);
		}
	}

	/**
	 * Returns all the linea gasto categorias associated with the linea gasto familia.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @return the linea gasto categorias associated with the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk) throws SystemException {
		return getLineaGastoCategorias(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the linea gasto categorias associated with the linea gasto familia.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param start the lower bound of the range of linea gasto familias
	 * @param end the upper bound of the range of linea gasto familias (not inclusive)
	 * @return the range of linea gasto categorias associated with the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk, int start, int end) throws SystemException {
		return getLineaGastoCategorias(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto categorias associated with the linea gasto familia.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoFamiliaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param start the lower bound of the range of linea gasto familias
	 * @param end the upper bound of the range of linea gasto familias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gasto categorias associated with the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoCategoria> getLineaGastoCategorias(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return lineaGastoFamiliaToLineaGastoCategoriaTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of linea gasto categorias associated with the linea gasto familia.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @return the number of linea gasto categorias associated with the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getLineaGastoCategoriasSize(long pk) throws SystemException {
		long[] pks = lineaGastoFamiliaToLineaGastoCategoriaTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the linea gasto categoria is associated with the linea gasto familia.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	 * @return <code>true</code> if the linea gasto categoria is associated with the linea gasto familia; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGastoCategoria(long pk,
		long lineaGastoCategoriaPK) throws SystemException {
		return lineaGastoFamiliaToLineaGastoCategoriaTableMapper.containsTableMapping(pk,
			lineaGastoCategoriaPK);
	}

	/**
	 * Returns <code>true</code> if the linea gasto familia has any linea gasto categorias associated with it.
	 *
	 * @param pk the primary key of the linea gasto familia to check for associations with linea gasto categorias
	 * @return <code>true</code> if the linea gasto familia has any linea gasto categorias associated with it; <code>false</code> otherwise
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
	 * Adds an association between the linea gasto familia and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoCategoria(long pk, long lineaGastoCategoriaPK)
		throws SystemException {
		lineaGastoFamiliaToLineaGastoCategoriaTableMapper.addTableMapping(pk,
			lineaGastoCategoriaPK);
	}

	/**
	 * Adds an association between the linea gasto familia and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoCategoria the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoCategoria(long pk,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws SystemException {
		lineaGastoFamiliaToLineaGastoCategoriaTableMapper.addTableMapping(pk,
			lineaGastoCategoria.getPrimaryKey());
	}

	/**
	 * Adds an association between the linea gasto familia and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoCategorias(long pk, long[] lineaGastoCategoriaPKs)
		throws SystemException {
		for (long lineaGastoCategoriaPK : lineaGastoCategoriaPKs) {
			lineaGastoFamiliaToLineaGastoCategoriaTableMapper.addTableMapping(pk,
				lineaGastoCategoriaPK);
		}
	}

	/**
	 * Adds an association between the linea gasto familia and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoCategorias the linea gasto categorias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoCategorias(long pk,
		List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria : lineaGastoCategorias) {
			lineaGastoFamiliaToLineaGastoCategoriaTableMapper.addTableMapping(pk,
				lineaGastoCategoria.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the linea gasto familia and its linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia to clear the associated linea gasto categorias from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearLineaGastoCategorias(long pk) throws SystemException {
		lineaGastoFamiliaToLineaGastoCategoriaTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the linea gasto familia and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoCategoriaPK the primary key of the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoCategoria(long pk, long lineaGastoCategoriaPK)
		throws SystemException {
		lineaGastoFamiliaToLineaGastoCategoriaTableMapper.deleteTableMapping(pk,
			lineaGastoCategoriaPK);
	}

	/**
	 * Removes the association between the linea gasto familia and the linea gasto categoria. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoCategoria the linea gasto categoria
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoCategoria(long pk,
		es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria)
		throws SystemException {
		lineaGastoFamiliaToLineaGastoCategoriaTableMapper.deleteTableMapping(pk,
			lineaGastoCategoria.getPrimaryKey());
	}

	/**
	 * Removes the association between the linea gasto familia and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoCategorias(long pk,
		long[] lineaGastoCategoriaPKs) throws SystemException {
		for (long lineaGastoCategoriaPK : lineaGastoCategoriaPKs) {
			lineaGastoFamiliaToLineaGastoCategoriaTableMapper.deleteTableMapping(pk,
				lineaGastoCategoriaPK);
		}
	}

	/**
	 * Removes the association between the linea gasto familia and the linea gasto categorias. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoCategorias the linea gasto categorias
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoCategorias(long pk,
		List<es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoCategorias)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoCategoria lineaGastoCategoria : lineaGastoCategorias) {
			lineaGastoFamiliaToLineaGastoCategoriaTableMapper.deleteTableMapping(pk,
				lineaGastoCategoria.getPrimaryKey());
		}
	}

	/**
	 * Sets the linea gasto categorias associated with the linea gasto familia, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoCategoriaPKs the primary keys of the linea gasto categorias to be associated with the linea gasto familia
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastoCategorias(long pk, long[] lineaGastoCategoriaPKs)
		throws SystemException {
		Set<Long> newLineaGastoCategoriaPKsSet = SetUtil.fromArray(lineaGastoCategoriaPKs);
		Set<Long> oldLineaGastoCategoriaPKsSet = SetUtil.fromArray(lineaGastoFamiliaToLineaGastoCategoriaTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeLineaGastoCategoriaPKsSet = new HashSet<Long>(oldLineaGastoCategoriaPKsSet);

		removeLineaGastoCategoriaPKsSet.removeAll(newLineaGastoCategoriaPKsSet);

		for (long removeLineaGastoCategoriaPK : removeLineaGastoCategoriaPKsSet) {
			lineaGastoFamiliaToLineaGastoCategoriaTableMapper.deleteTableMapping(pk,
				removeLineaGastoCategoriaPK);
		}

		newLineaGastoCategoriaPKsSet.removeAll(oldLineaGastoCategoriaPKsSet);

		for (long newLineaGastoCategoriaPK : newLineaGastoCategoriaPKsSet) {
			lineaGastoFamiliaToLineaGastoCategoriaTableMapper.addTableMapping(pk,
				newLineaGastoCategoriaPK);
		}
	}

	/**
	 * Sets the linea gasto categorias associated with the linea gasto familia, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto familia
	 * @param lineaGastoCategorias the linea gasto categorias to be associated with the linea gasto familia
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
			FinderCacheUtil.clearCache(LineaGastoFamiliaModelImpl.MAPPING_TABLE_CMES_FAMILIAS_CATEGORIAS_NAME);
		}
	}

	/**
	 * Initializes the linea gasto familia persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.LineaGastoFamilia")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LineaGastoFamilia>> listenersList = new ArrayList<ModelListener<LineaGastoFamilia>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LineaGastoFamilia>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		lineaGastoFamiliaToLineaGastoTableMapper = TableMapperFactory.getTableMapper("CMES_Lineas_Familias",
				"familiaId", "lineagastoId", this, lineaGastoPersistence);

		lineaGastoFamiliaToLineaGastoCategoriaTableMapper = TableMapperFactory.getTableMapper("CMES_Familias_Categorias",
				"familiaId", "categoriaId", this, lineaGastoCategoriaPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(LineaGastoFamiliaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("CMES_Lineas_Familias");
		TableMapperFactory.removeTableMapper("CMES_Familias_Categorias");
	}

	@BeanReference(type = LineaGastoPersistence.class)
	protected LineaGastoPersistence lineaGastoPersistence;
	protected TableMapper<LineaGastoFamilia, es.davinciti.liferay.model.LineaGasto> lineaGastoFamiliaToLineaGastoTableMapper;
	@BeanReference(type = LineaGastoCategoriaPersistence.class)
	protected LineaGastoCategoriaPersistence lineaGastoCategoriaPersistence;
	protected TableMapper<LineaGastoFamilia, es.davinciti.liferay.model.LineaGastoCategoria> lineaGastoFamiliaToLineaGastoCategoriaTableMapper;
	private static final String _SQL_SELECT_LINEAGASTOFAMILIA = "SELECT lineaGastoFamilia FROM LineaGastoFamilia lineaGastoFamilia";
	private static final String _SQL_SELECT_LINEAGASTOFAMILIA_WHERE = "SELECT lineaGastoFamilia FROM LineaGastoFamilia lineaGastoFamilia WHERE ";
	private static final String _SQL_COUNT_LINEAGASTOFAMILIA = "SELECT COUNT(lineaGastoFamilia) FROM LineaGastoFamilia lineaGastoFamilia";
	private static final String _SQL_COUNT_LINEAGASTOFAMILIA_WHERE = "SELECT COUNT(lineaGastoFamilia) FROM LineaGastoFamilia lineaGastoFamilia WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lineaGastoFamilia.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LineaGastoFamilia exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LineaGastoFamilia exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LineaGastoFamiliaPersistenceImpl.class);
	private static LineaGastoFamilia _nullLineaGastoFamilia = new LineaGastoFamiliaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LineaGastoFamilia> toCacheModel() {
				return _nullLineaGastoFamiliaCacheModel;
			}
		};

	private static CacheModel<LineaGastoFamilia> _nullLineaGastoFamiliaCacheModel =
		new CacheModel<LineaGastoFamilia>() {
			@Override
			public LineaGastoFamilia toEntityModel() {
				return _nullLineaGastoFamilia;
			}
		};
}