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

import es.davinciti.liferay.NoSuchNotaGastoException;
import es.davinciti.liferay.model.NotaGasto;
import es.davinciti.liferay.model.impl.NotaGastoImpl;
import es.davinciti.liferay.model.impl.NotaGastoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the nota gasto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see NotaGastoPersistence
 * @see NotaGastoUtil
 * @generated
 */
public class NotaGastoPersistenceImpl extends BasePersistenceImpl<NotaGasto>
	implements NotaGastoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link NotaGastoUtil} to access the nota gasto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = NotaGastoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
			NotaGastoModelImpl.FINDER_CACHE_ENABLED, NotaGastoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
			NotaGastoModelImpl.FINDER_CACHE_ENABLED, NotaGastoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
			NotaGastoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
			NotaGastoModelImpl.FINDER_CACHE_ENABLED, NotaGastoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
			NotaGastoModelImpl.FINDER_CACHE_ENABLED, NotaGastoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			NotaGastoModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
			NotaGastoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the nota gastos where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NotaGasto> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the nota gastos where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of nota gastos
	 * @param end the upper bound of the range of nota gastos (not inclusive)
	 * @return the range of matching nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NotaGasto> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nota gastos where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of nota gastos
	 * @param end the upper bound of the range of nota gastos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NotaGasto> findByCompanyId(long companyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
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

		List<NotaGasto> list = (List<NotaGasto>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NotaGasto notaGasto : list) {
				if ((companyId != notaGasto.getCompanyId())) {
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

			query.append(_SQL_SELECT_NOTAGASTO_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NotaGastoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<NotaGasto>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NotaGasto>(list);
				}
				else {
					list = (List<NotaGasto>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first nota gasto in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nota gasto
	 * @throws es.davinciti.liferay.NoSuchNotaGastoException if a matching nota gasto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NotaGasto findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchNotaGastoException, SystemException {
		NotaGasto notaGasto = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (notaGasto != null) {
			return notaGasto;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNotaGastoException(msg.toString());
	}

	/**
	 * Returns the first nota gasto in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nota gasto, or <code>null</code> if a matching nota gasto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NotaGasto fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<NotaGasto> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nota gasto in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nota gasto
	 * @throws es.davinciti.liferay.NoSuchNotaGastoException if a matching nota gasto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NotaGasto findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchNotaGastoException, SystemException {
		NotaGasto notaGasto = fetchByCompanyId_Last(companyId, orderByComparator);

		if (notaGasto != null) {
			return notaGasto;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNotaGastoException(msg.toString());
	}

	/**
	 * Returns the last nota gasto in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nota gasto, or <code>null</code> if a matching nota gasto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NotaGasto fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<NotaGasto> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nota gastos before and after the current nota gasto in the ordered set where companyId = &#63;.
	 *
	 * @param notagastoId the primary key of the current nota gasto
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nota gasto
	 * @throws es.davinciti.liferay.NoSuchNotaGastoException if a nota gasto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NotaGasto[] findByCompanyId_PrevAndNext(long notagastoId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchNotaGastoException, SystemException {
		NotaGasto notaGasto = findByPrimaryKey(notagastoId);

		Session session = null;

		try {
			session = openSession();

			NotaGasto[] array = new NotaGastoImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, notaGasto,
					companyId, orderByComparator, true);

			array[1] = notaGasto;

			array[2] = getByCompanyId_PrevAndNext(session, notaGasto,
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

	protected NotaGasto getByCompanyId_PrevAndNext(Session session,
		NotaGasto notaGasto, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NOTAGASTO_WHERE);

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
			query.append(NotaGastoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(notaGasto);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NotaGasto> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nota gastos where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (NotaGasto notaGasto : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(notaGasto);
		}
	}

	/**
	 * Returns the number of nota gastos where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching nota gastos
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

			query.append(_SQL_COUNT_NOTAGASTO_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "notaGasto.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYIDUSERID =
		new FinderPath(NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
			NotaGastoModelImpl.FINDER_CACHE_ENABLED, NotaGastoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyIdUserId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDUSERID =
		new FinderPath(NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
			NotaGastoModelImpl.FINDER_CACHE_ENABLED, NotaGastoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyIdUserId",
			new String[] { Long.class.getName(), Long.class.getName() },
			NotaGastoModelImpl.COMPANYID_COLUMN_BITMASK |
			NotaGastoModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYIDUSERID = new FinderPath(NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
			NotaGastoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCompanyIdUserId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the nota gastos where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @return the matching nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NotaGasto> findByCompanyIdUserId(long companyId, long userId)
		throws SystemException {
		return findByCompanyIdUserId(companyId, userId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nota gastos where companyId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of nota gastos
	 * @param end the upper bound of the range of nota gastos (not inclusive)
	 * @return the range of matching nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NotaGasto> findByCompanyIdUserId(long companyId, long userId,
		int start, int end) throws SystemException {
		return findByCompanyIdUserId(companyId, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nota gastos where companyId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of nota gastos
	 * @param end the upper bound of the range of nota gastos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NotaGasto> findByCompanyIdUserId(long companyId, long userId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDUSERID;
			finderArgs = new Object[] { companyId, userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYIDUSERID;
			finderArgs = new Object[] {
					companyId, userId,
					
					start, end, orderByComparator
				};
		}

		List<NotaGasto> list = (List<NotaGasto>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NotaGasto notaGasto : list) {
				if ((companyId != notaGasto.getCompanyId()) ||
						(userId != notaGasto.getUserId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_NOTAGASTO_WHERE);

			query.append(_FINDER_COLUMN_COMPANYIDUSERID_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYIDUSERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NotaGastoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(userId);

				if (!pagination) {
					list = (List<NotaGasto>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NotaGasto>(list);
				}
				else {
					list = (List<NotaGasto>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first nota gasto in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nota gasto
	 * @throws es.davinciti.liferay.NoSuchNotaGastoException if a matching nota gasto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NotaGasto findByCompanyIdUserId_First(long companyId, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchNotaGastoException, SystemException {
		NotaGasto notaGasto = fetchByCompanyIdUserId_First(companyId, userId,
				orderByComparator);

		if (notaGasto != null) {
			return notaGasto;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNotaGastoException(msg.toString());
	}

	/**
	 * Returns the first nota gasto in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nota gasto, or <code>null</code> if a matching nota gasto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NotaGasto fetchByCompanyIdUserId_First(long companyId, long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<NotaGasto> list = findByCompanyIdUserId(companyId, userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nota gasto in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nota gasto
	 * @throws es.davinciti.liferay.NoSuchNotaGastoException if a matching nota gasto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NotaGasto findByCompanyIdUserId_Last(long companyId, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchNotaGastoException, SystemException {
		NotaGasto notaGasto = fetchByCompanyIdUserId_Last(companyId, userId,
				orderByComparator);

		if (notaGasto != null) {
			return notaGasto;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNotaGastoException(msg.toString());
	}

	/**
	 * Returns the last nota gasto in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nota gasto, or <code>null</code> if a matching nota gasto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NotaGasto fetchByCompanyIdUserId_Last(long companyId, long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyIdUserId(companyId, userId);

		if (count == 0) {
			return null;
		}

		List<NotaGasto> list = findByCompanyIdUserId(companyId, userId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nota gastos before and after the current nota gasto in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param notagastoId the primary key of the current nota gasto
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nota gasto
	 * @throws es.davinciti.liferay.NoSuchNotaGastoException if a nota gasto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NotaGasto[] findByCompanyIdUserId_PrevAndNext(long notagastoId,
		long companyId, long userId, OrderByComparator orderByComparator)
		throws NoSuchNotaGastoException, SystemException {
		NotaGasto notaGasto = findByPrimaryKey(notagastoId);

		Session session = null;

		try {
			session = openSession();

			NotaGasto[] array = new NotaGastoImpl[3];

			array[0] = getByCompanyIdUserId_PrevAndNext(session, notaGasto,
					companyId, userId, orderByComparator, true);

			array[1] = notaGasto;

			array[2] = getByCompanyIdUserId_PrevAndNext(session, notaGasto,
					companyId, userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected NotaGasto getByCompanyIdUserId_PrevAndNext(Session session,
		NotaGasto notaGasto, long companyId, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NOTAGASTO_WHERE);

		query.append(_FINDER_COLUMN_COMPANYIDUSERID_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYIDUSERID_USERID_2);

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
			query.append(NotaGastoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(notaGasto);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NotaGasto> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nota gastos where companyId = &#63; and userId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyIdUserId(long companyId, long userId)
		throws SystemException {
		for (NotaGasto notaGasto : findByCompanyIdUserId(companyId, userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(notaGasto);
		}
	}

	/**
	 * Returns the number of nota gastos where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @return the number of matching nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCompanyIdUserId(long companyId, long userId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYIDUSERID;

		Object[] finderArgs = new Object[] { companyId, userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_NOTAGASTO_WHERE);

			query.append(_FINDER_COLUMN_COMPANYIDUSERID_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYIDUSERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_COMPANYIDUSERID_COMPANYID_2 = "notaGasto.companyId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYIDUSERID_USERID_2 = "notaGasto.userId = ?";

	public NotaGastoPersistenceImpl() {
		setModelClass(NotaGasto.class);
	}

	/**
	 * Caches the nota gasto in the entity cache if it is enabled.
	 *
	 * @param notaGasto the nota gasto
	 */
	@Override
	public void cacheResult(NotaGasto notaGasto) {
		EntityCacheUtil.putResult(NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
			NotaGastoImpl.class, notaGasto.getPrimaryKey(), notaGasto);

		notaGasto.resetOriginalValues();
	}

	/**
	 * Caches the nota gastos in the entity cache if it is enabled.
	 *
	 * @param notaGastos the nota gastos
	 */
	@Override
	public void cacheResult(List<NotaGasto> notaGastos) {
		for (NotaGasto notaGasto : notaGastos) {
			if (EntityCacheUtil.getResult(
						NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
						NotaGastoImpl.class, notaGasto.getPrimaryKey()) == null) {
				cacheResult(notaGasto);
			}
			else {
				notaGasto.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all nota gastos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(NotaGastoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(NotaGastoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the nota gasto.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NotaGasto notaGasto) {
		EntityCacheUtil.removeResult(NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
			NotaGastoImpl.class, notaGasto.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<NotaGasto> notaGastos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NotaGasto notaGasto : notaGastos) {
			EntityCacheUtil.removeResult(NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
				NotaGastoImpl.class, notaGasto.getPrimaryKey());
		}
	}

	/**
	 * Creates a new nota gasto with the primary key. Does not add the nota gasto to the database.
	 *
	 * @param notagastoId the primary key for the new nota gasto
	 * @return the new nota gasto
	 */
	@Override
	public NotaGasto create(long notagastoId) {
		NotaGasto notaGasto = new NotaGastoImpl();

		notaGasto.setNew(true);
		notaGasto.setPrimaryKey(notagastoId);

		return notaGasto;
	}

	/**
	 * Removes the nota gasto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param notagastoId the primary key of the nota gasto
	 * @return the nota gasto that was removed
	 * @throws es.davinciti.liferay.NoSuchNotaGastoException if a nota gasto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NotaGasto remove(long notagastoId)
		throws NoSuchNotaGastoException, SystemException {
		return remove((Serializable)notagastoId);
	}

	/**
	 * Removes the nota gasto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the nota gasto
	 * @return the nota gasto that was removed
	 * @throws es.davinciti.liferay.NoSuchNotaGastoException if a nota gasto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NotaGasto remove(Serializable primaryKey)
		throws NoSuchNotaGastoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			NotaGasto notaGasto = (NotaGasto)session.get(NotaGastoImpl.class,
					primaryKey);

			if (notaGasto == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNotaGastoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(notaGasto);
		}
		catch (NoSuchNotaGastoException nsee) {
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
	protected NotaGasto removeImpl(NotaGasto notaGasto)
		throws SystemException {
		notaGasto = toUnwrappedModel(notaGasto);

		notaGastoToHistoricoNotaTableMapper.deleteLeftPrimaryKeyTableMappings(notaGasto.getPrimaryKey());

		notaGastoToLineaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(notaGasto.getPrimaryKey());

		notaGastoToOrganizationSageCompanyTableMapper.deleteLeftPrimaryKeyTableMappings(notaGasto.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(notaGasto)) {
				notaGasto = (NotaGasto)session.get(NotaGastoImpl.class,
						notaGasto.getPrimaryKeyObj());
			}

			if (notaGasto != null) {
				session.delete(notaGasto);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (notaGasto != null) {
			clearCache(notaGasto);
		}

		return notaGasto;
	}

	@Override
	public NotaGasto updateImpl(es.davinciti.liferay.model.NotaGasto notaGasto)
		throws SystemException {
		notaGasto = toUnwrappedModel(notaGasto);

		boolean isNew = notaGasto.isNew();

		NotaGastoModelImpl notaGastoModelImpl = (NotaGastoModelImpl)notaGasto;

		Session session = null;

		try {
			session = openSession();

			if (notaGasto.isNew()) {
				session.save(notaGasto);

				notaGasto.setNew(false);
			}
			else {
				session.merge(notaGasto);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !NotaGastoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((notaGastoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						notaGastoModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { notaGastoModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((notaGastoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						notaGastoModelImpl.getOriginalCompanyId(),
						notaGastoModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYIDUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDUSERID,
					args);

				args = new Object[] {
						notaGastoModelImpl.getCompanyId(),
						notaGastoModelImpl.getUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYIDUSERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDUSERID,
					args);
			}
		}

		EntityCacheUtil.putResult(NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
			NotaGastoImpl.class, notaGasto.getPrimaryKey(), notaGasto);

		return notaGasto;
	}

	protected NotaGasto toUnwrappedModel(NotaGasto notaGasto) {
		if (notaGasto instanceof NotaGastoImpl) {
			return notaGasto;
		}

		NotaGastoImpl notaGastoImpl = new NotaGastoImpl();

		notaGastoImpl.setNew(notaGasto.isNew());
		notaGastoImpl.setPrimaryKey(notaGasto.getPrimaryKey());

		notaGastoImpl.setNotagastoId(notaGasto.getNotagastoId());
		notaGastoImpl.setCompanyId(notaGasto.getCompanyId());
		notaGastoImpl.setUserId(notaGasto.getUserId());
		notaGastoImpl.setDescription(notaGasto.getDescription());
		notaGastoImpl.setStartDate(notaGasto.getStartDate());
		notaGastoImpl.setEndDate(notaGasto.getEndDate());
		notaGastoImpl.setComments(notaGasto.getComments());
		notaGastoImpl.setStatus(notaGasto.getStatus());
		notaGastoImpl.setAmount(notaGasto.getAmount());
		notaGastoImpl.setCreateDate(notaGasto.getCreateDate());
		notaGastoImpl.setUpdateDate(notaGasto.getUpdateDate());

		return notaGastoImpl;
	}

	/**
	 * Returns the nota gasto with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the nota gasto
	 * @return the nota gasto
	 * @throws es.davinciti.liferay.NoSuchNotaGastoException if a nota gasto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NotaGasto findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNotaGastoException, SystemException {
		NotaGasto notaGasto = fetchByPrimaryKey(primaryKey);

		if (notaGasto == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNotaGastoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return notaGasto;
	}

	/**
	 * Returns the nota gasto with the primary key or throws a {@link es.davinciti.liferay.NoSuchNotaGastoException} if it could not be found.
	 *
	 * @param notagastoId the primary key of the nota gasto
	 * @return the nota gasto
	 * @throws es.davinciti.liferay.NoSuchNotaGastoException if a nota gasto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NotaGasto findByPrimaryKey(long notagastoId)
		throws NoSuchNotaGastoException, SystemException {
		return findByPrimaryKey((Serializable)notagastoId);
	}

	/**
	 * Returns the nota gasto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nota gasto
	 * @return the nota gasto, or <code>null</code> if a nota gasto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NotaGasto fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		NotaGasto notaGasto = (NotaGasto)EntityCacheUtil.getResult(NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
				NotaGastoImpl.class, primaryKey);

		if (notaGasto == _nullNotaGasto) {
			return null;
		}

		if (notaGasto == null) {
			Session session = null;

			try {
				session = openSession();

				notaGasto = (NotaGasto)session.get(NotaGastoImpl.class,
						primaryKey);

				if (notaGasto != null) {
					cacheResult(notaGasto);
				}
				else {
					EntityCacheUtil.putResult(NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
						NotaGastoImpl.class, primaryKey, _nullNotaGasto);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(NotaGastoModelImpl.ENTITY_CACHE_ENABLED,
					NotaGastoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return notaGasto;
	}

	/**
	 * Returns the nota gasto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param notagastoId the primary key of the nota gasto
	 * @return the nota gasto, or <code>null</code> if a nota gasto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NotaGasto fetchByPrimaryKey(long notagastoId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)notagastoId);
	}

	/**
	 * Returns all the nota gastos.
	 *
	 * @return the nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NotaGasto> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nota gastos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nota gastos
	 * @param end the upper bound of the range of nota gastos (not inclusive)
	 * @return the range of nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NotaGasto> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the nota gastos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nota gastos
	 * @param end the upper bound of the range of nota gastos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NotaGasto> findAll(int start, int end,
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

		List<NotaGasto> list = (List<NotaGasto>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NOTAGASTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NOTAGASTO;

				if (pagination) {
					sql = sql.concat(NotaGastoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<NotaGasto>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NotaGasto>(list);
				}
				else {
					list = (List<NotaGasto>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the nota gastos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (NotaGasto notaGasto : findAll()) {
			remove(notaGasto);
		}
	}

	/**
	 * Returns the number of nota gastos.
	 *
	 * @return the number of nota gastos
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

				Query q = session.createQuery(_SQL_COUNT_NOTAGASTO);

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
	 * Returns all the historico notas associated with the nota gasto.
	 *
	 * @param pk the primary key of the nota gasto
	 * @return the historico notas associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.HistoricoNota> getHistoricoNotas(
		long pk) throws SystemException {
		return getHistoricoNotas(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the historico notas associated with the nota gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the nota gasto
	 * @param start the lower bound of the range of nota gastos
	 * @param end the upper bound of the range of nota gastos (not inclusive)
	 * @return the range of historico notas associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.HistoricoNota> getHistoricoNotas(
		long pk, int start, int end) throws SystemException {
		return getHistoricoNotas(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the historico notas associated with the nota gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the nota gasto
	 * @param start the lower bound of the range of nota gastos
	 * @param end the upper bound of the range of nota gastos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of historico notas associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.HistoricoNota> getHistoricoNotas(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return notaGastoToHistoricoNotaTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of historico notas associated with the nota gasto.
	 *
	 * @param pk the primary key of the nota gasto
	 * @return the number of historico notas associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getHistoricoNotasSize(long pk) throws SystemException {
		long[] pks = notaGastoToHistoricoNotaTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the historico nota is associated with the nota gasto.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param historicoNotaPK the primary key of the historico nota
	 * @return <code>true</code> if the historico nota is associated with the nota gasto; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsHistoricoNota(long pk, long historicoNotaPK)
		throws SystemException {
		return notaGastoToHistoricoNotaTableMapper.containsTableMapping(pk,
			historicoNotaPK);
	}

	/**
	 * Returns <code>true</code> if the nota gasto has any historico notas associated with it.
	 *
	 * @param pk the primary key of the nota gasto to check for associations with historico notas
	 * @return <code>true</code> if the nota gasto has any historico notas associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsHistoricoNotas(long pk) throws SystemException {
		if (getHistoricoNotasSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the nota gasto and the historico nota. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param historicoNotaPK the primary key of the historico nota
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addHistoricoNota(long pk, long historicoNotaPK)
		throws SystemException {
		notaGastoToHistoricoNotaTableMapper.addTableMapping(pk, historicoNotaPK);
	}

	/**
	 * Adds an association between the nota gasto and the historico nota. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param historicoNota the historico nota
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addHistoricoNota(long pk,
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws SystemException {
		notaGastoToHistoricoNotaTableMapper.addTableMapping(pk,
			historicoNota.getPrimaryKey());
	}

	/**
	 * Adds an association between the nota gasto and the historico notas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param historicoNotaPKs the primary keys of the historico notas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addHistoricoNotas(long pk, long[] historicoNotaPKs)
		throws SystemException {
		for (long historicoNotaPK : historicoNotaPKs) {
			notaGastoToHistoricoNotaTableMapper.addTableMapping(pk,
				historicoNotaPK);
		}
	}

	/**
	 * Adds an association between the nota gasto and the historico notas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param historicoNotas the historico notas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addHistoricoNotas(long pk,
		List<es.davinciti.liferay.model.HistoricoNota> historicoNotas)
		throws SystemException {
		for (es.davinciti.liferay.model.HistoricoNota historicoNota : historicoNotas) {
			notaGastoToHistoricoNotaTableMapper.addTableMapping(pk,
				historicoNota.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the nota gasto and its historico notas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto to clear the associated historico notas from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearHistoricoNotas(long pk) throws SystemException {
		notaGastoToHistoricoNotaTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the nota gasto and the historico nota. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param historicoNotaPK the primary key of the historico nota
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeHistoricoNota(long pk, long historicoNotaPK)
		throws SystemException {
		notaGastoToHistoricoNotaTableMapper.deleteTableMapping(pk,
			historicoNotaPK);
	}

	/**
	 * Removes the association between the nota gasto and the historico nota. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param historicoNota the historico nota
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeHistoricoNota(long pk,
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws SystemException {
		notaGastoToHistoricoNotaTableMapper.deleteTableMapping(pk,
			historicoNota.getPrimaryKey());
	}

	/**
	 * Removes the association between the nota gasto and the historico notas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param historicoNotaPKs the primary keys of the historico notas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeHistoricoNotas(long pk, long[] historicoNotaPKs)
		throws SystemException {
		for (long historicoNotaPK : historicoNotaPKs) {
			notaGastoToHistoricoNotaTableMapper.deleteTableMapping(pk,
				historicoNotaPK);
		}
	}

	/**
	 * Removes the association between the nota gasto and the historico notas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param historicoNotas the historico notas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeHistoricoNotas(long pk,
		List<es.davinciti.liferay.model.HistoricoNota> historicoNotas)
		throws SystemException {
		for (es.davinciti.liferay.model.HistoricoNota historicoNota : historicoNotas) {
			notaGastoToHistoricoNotaTableMapper.deleteTableMapping(pk,
				historicoNota.getPrimaryKey());
		}
	}

	/**
	 * Sets the historico notas associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param historicoNotaPKs the primary keys of the historico notas to be associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setHistoricoNotas(long pk, long[] historicoNotaPKs)
		throws SystemException {
		Set<Long> newHistoricoNotaPKsSet = SetUtil.fromArray(historicoNotaPKs);
		Set<Long> oldHistoricoNotaPKsSet = SetUtil.fromArray(notaGastoToHistoricoNotaTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeHistoricoNotaPKsSet = new HashSet<Long>(oldHistoricoNotaPKsSet);

		removeHistoricoNotaPKsSet.removeAll(newHistoricoNotaPKsSet);

		for (long removeHistoricoNotaPK : removeHistoricoNotaPKsSet) {
			notaGastoToHistoricoNotaTableMapper.deleteTableMapping(pk,
				removeHistoricoNotaPK);
		}

		newHistoricoNotaPKsSet.removeAll(oldHistoricoNotaPKsSet);

		for (long newHistoricoNotaPK : newHistoricoNotaPKsSet) {
			notaGastoToHistoricoNotaTableMapper.addTableMapping(pk,
				newHistoricoNotaPK);
		}
	}

	/**
	 * Sets the historico notas associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param historicoNotas the historico notas to be associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setHistoricoNotas(long pk,
		List<es.davinciti.liferay.model.HistoricoNota> historicoNotas)
		throws SystemException {
		try {
			long[] historicoNotaPKs = new long[historicoNotas.size()];

			for (int i = 0; i < historicoNotas.size(); i++) {
				es.davinciti.liferay.model.HistoricoNota historicoNota = historicoNotas.get(i);

				historicoNotaPKs[i] = historicoNota.getPrimaryKey();
			}

			setHistoricoNotas(pk, historicoNotaPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(NotaGastoModelImpl.MAPPING_TABLE_CMES_NOTAS_HISTORICONOTAS_NAME);
		}
	}

	/**
	 * Returns all the linea gastos associated with the nota gasto.
	 *
	 * @param pk the primary key of the nota gasto
	 * @return the linea gastos associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk)
		throws SystemException {
		return getLineaGastos(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the linea gastos associated with the nota gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the nota gasto
	 * @param start the lower bound of the range of nota gastos
	 * @param end the upper bound of the range of nota gastos (not inclusive)
	 * @return the range of linea gastos associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk,
		int start, int end) throws SystemException {
		return getLineaGastos(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gastos associated with the nota gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the nota gasto
	 * @param start the lower bound of the range of nota gastos
	 * @param end the upper bound of the range of nota gastos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gastos associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return notaGastoToLineaGastoTableMapper.getRightBaseModels(pk, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of linea gastos associated with the nota gasto.
	 *
	 * @param pk the primary key of the nota gasto
	 * @return the number of linea gastos associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getLineaGastosSize(long pk) throws SystemException {
		long[] pks = notaGastoToLineaGastoTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the linea gasto is associated with the nota gasto.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @return <code>true</code> if the linea gasto is associated with the nota gasto; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		return notaGastoToLineaGastoTableMapper.containsTableMapping(pk,
			lineaGastoPK);
	}

	/**
	 * Returns <code>true</code> if the nota gasto has any linea gastos associated with it.
	 *
	 * @param pk the primary key of the nota gasto to check for associations with linea gastos
	 * @return <code>true</code> if the nota gasto has any linea gastos associated with it; <code>false</code> otherwise
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
	 * Adds an association between the nota gasto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		notaGastoToLineaGastoTableMapper.addTableMapping(pk, lineaGastoPK);
	}

	/**
	 * Adds an association between the nota gasto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param lineaGasto the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws SystemException {
		notaGastoToLineaGastoTableMapper.addTableMapping(pk,
			lineaGasto.getPrimaryKey());
	}

	/**
	 * Adds an association between the nota gasto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param lineaGastoPKs the primary keys of the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		for (long lineaGastoPK : lineaGastoPKs) {
			notaGastoToLineaGastoTableMapper.addTableMapping(pk, lineaGastoPK);
		}
	}

	/**
	 * Adds an association between the nota gasto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param lineaGastos the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastos(long pk,
		List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGasto lineaGasto : lineaGastos) {
			notaGastoToLineaGastoTableMapper.addTableMapping(pk,
				lineaGasto.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the nota gasto and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto to clear the associated linea gastos from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearLineaGastos(long pk) throws SystemException {
		notaGastoToLineaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the nota gasto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		notaGastoToLineaGastoTableMapper.deleteTableMapping(pk, lineaGastoPK);
	}

	/**
	 * Removes the association between the nota gasto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param lineaGasto the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws SystemException {
		notaGastoToLineaGastoTableMapper.deleteTableMapping(pk,
			lineaGasto.getPrimaryKey());
	}

	/**
	 * Removes the association between the nota gasto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param lineaGastoPKs the primary keys of the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		for (long lineaGastoPK : lineaGastoPKs) {
			notaGastoToLineaGastoTableMapper.deleteTableMapping(pk, lineaGastoPK);
		}
	}

	/**
	 * Removes the association between the nota gasto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param lineaGastos the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastos(long pk,
		List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGasto lineaGasto : lineaGastos) {
			notaGastoToLineaGastoTableMapper.deleteTableMapping(pk,
				lineaGasto.getPrimaryKey());
		}
	}

	/**
	 * Sets the linea gastos associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param lineaGastoPKs the primary keys of the linea gastos to be associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		Set<Long> newLineaGastoPKsSet = SetUtil.fromArray(lineaGastoPKs);
		Set<Long> oldLineaGastoPKsSet = SetUtil.fromArray(notaGastoToLineaGastoTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeLineaGastoPKsSet = new HashSet<Long>(oldLineaGastoPKsSet);

		removeLineaGastoPKsSet.removeAll(newLineaGastoPKsSet);

		for (long removeLineaGastoPK : removeLineaGastoPKsSet) {
			notaGastoToLineaGastoTableMapper.deleteTableMapping(pk,
				removeLineaGastoPK);
		}

		newLineaGastoPKsSet.removeAll(oldLineaGastoPKsSet);

		for (long newLineaGastoPK : newLineaGastoPKsSet) {
			notaGastoToLineaGastoTableMapper.addTableMapping(pk, newLineaGastoPK);
		}
	}

	/**
	 * Sets the linea gastos associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param lineaGastos the linea gastos to be associated with the nota gasto
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
			FinderCacheUtil.clearCache(NotaGastoModelImpl.MAPPING_TABLE_CMES_NOTAS_LINEAS_NAME);
		}
	}

	/**
	 * Returns all the organization sage companies associated with the nota gasto.
	 *
	 * @param pk the primary key of the nota gasto
	 * @return the organization sage companies associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.OrganizationSageCompany> getOrganizationSageCompanies(
		long pk) throws SystemException {
		return getOrganizationSageCompanies(pk, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the organization sage companies associated with the nota gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the nota gasto
	 * @param start the lower bound of the range of nota gastos
	 * @param end the upper bound of the range of nota gastos (not inclusive)
	 * @return the range of organization sage companies associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.OrganizationSageCompany> getOrganizationSageCompanies(
		long pk, int start, int end) throws SystemException {
		return getOrganizationSageCompanies(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the organization sage companies associated with the nota gasto.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.NotaGastoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the nota gasto
	 * @param start the lower bound of the range of nota gastos
	 * @param end the upper bound of the range of nota gastos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of organization sage companies associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.OrganizationSageCompany> getOrganizationSageCompanies(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return notaGastoToOrganizationSageCompanyTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of organization sage companies associated with the nota gasto.
	 *
	 * @param pk the primary key of the nota gasto
	 * @return the number of organization sage companies associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getOrganizationSageCompaniesSize(long pk)
		throws SystemException {
		long[] pks = notaGastoToOrganizationSageCompanyTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the organization sage company is associated with the nota gasto.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param organizationSageCompanyPK the primary key of the organization sage company
	 * @return <code>true</code> if the organization sage company is associated with the nota gasto; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsOrganizationSageCompany(long pk,
		long organizationSageCompanyPK) throws SystemException {
		return notaGastoToOrganizationSageCompanyTableMapper.containsTableMapping(pk,
			organizationSageCompanyPK);
	}

	/**
	 * Returns <code>true</code> if the nota gasto has any organization sage companies associated with it.
	 *
	 * @param pk the primary key of the nota gasto to check for associations with organization sage companies
	 * @return <code>true</code> if the nota gasto has any organization sage companies associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsOrganizationSageCompanies(long pk)
		throws SystemException {
		if (getOrganizationSageCompaniesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the nota gasto and the organization sage company. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param organizationSageCompanyPK the primary key of the organization sage company
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addOrganizationSageCompany(long pk,
		long organizationSageCompanyPK) throws SystemException {
		notaGastoToOrganizationSageCompanyTableMapper.addTableMapping(pk,
			organizationSageCompanyPK);
	}

	/**
	 * Adds an association between the nota gasto and the organization sage company. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param organizationSageCompany the organization sage company
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addOrganizationSageCompany(long pk,
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws SystemException {
		notaGastoToOrganizationSageCompanyTableMapper.addTableMapping(pk,
			organizationSageCompany.getPrimaryKey());
	}

	/**
	 * Adds an association between the nota gasto and the organization sage companies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param organizationSageCompanyPKs the primary keys of the organization sage companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addOrganizationSageCompanies(long pk,
		long[] organizationSageCompanyPKs) throws SystemException {
		for (long organizationSageCompanyPK : organizationSageCompanyPKs) {
			notaGastoToOrganizationSageCompanyTableMapper.addTableMapping(pk,
				organizationSageCompanyPK);
		}
	}

	/**
	 * Adds an association between the nota gasto and the organization sage companies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param organizationSageCompanies the organization sage companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addOrganizationSageCompanies(long pk,
		List<es.davinciti.liferay.model.OrganizationSageCompany> organizationSageCompanies)
		throws SystemException {
		for (es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany : organizationSageCompanies) {
			notaGastoToOrganizationSageCompanyTableMapper.addTableMapping(pk,
				organizationSageCompany.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the nota gasto and its organization sage companies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto to clear the associated organization sage companies from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearOrganizationSageCompanies(long pk)
		throws SystemException {
		notaGastoToOrganizationSageCompanyTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the nota gasto and the organization sage company. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param organizationSageCompanyPK the primary key of the organization sage company
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeOrganizationSageCompany(long pk,
		long organizationSageCompanyPK) throws SystemException {
		notaGastoToOrganizationSageCompanyTableMapper.deleteTableMapping(pk,
			organizationSageCompanyPK);
	}

	/**
	 * Removes the association between the nota gasto and the organization sage company. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param organizationSageCompany the organization sage company
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeOrganizationSageCompany(long pk,
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws SystemException {
		notaGastoToOrganizationSageCompanyTableMapper.deleteTableMapping(pk,
			organizationSageCompany.getPrimaryKey());
	}

	/**
	 * Removes the association between the nota gasto and the organization sage companies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param organizationSageCompanyPKs the primary keys of the organization sage companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeOrganizationSageCompanies(long pk,
		long[] organizationSageCompanyPKs) throws SystemException {
		for (long organizationSageCompanyPK : organizationSageCompanyPKs) {
			notaGastoToOrganizationSageCompanyTableMapper.deleteTableMapping(pk,
				organizationSageCompanyPK);
		}
	}

	/**
	 * Removes the association between the nota gasto and the organization sage companies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param organizationSageCompanies the organization sage companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeOrganizationSageCompanies(long pk,
		List<es.davinciti.liferay.model.OrganizationSageCompany> organizationSageCompanies)
		throws SystemException {
		for (es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany : organizationSageCompanies) {
			notaGastoToOrganizationSageCompanyTableMapper.deleteTableMapping(pk,
				organizationSageCompany.getPrimaryKey());
		}
	}

	/**
	 * Sets the organization sage companies associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param organizationSageCompanyPKs the primary keys of the organization sage companies to be associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setOrganizationSageCompanies(long pk,
		long[] organizationSageCompanyPKs) throws SystemException {
		Set<Long> newOrganizationSageCompanyPKsSet = SetUtil.fromArray(organizationSageCompanyPKs);
		Set<Long> oldOrganizationSageCompanyPKsSet = SetUtil.fromArray(notaGastoToOrganizationSageCompanyTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeOrganizationSageCompanyPKsSet = new HashSet<Long>(oldOrganizationSageCompanyPKsSet);

		removeOrganizationSageCompanyPKsSet.removeAll(newOrganizationSageCompanyPKsSet);

		for (long removeOrganizationSageCompanyPK : removeOrganizationSageCompanyPKsSet) {
			notaGastoToOrganizationSageCompanyTableMapper.deleteTableMapping(pk,
				removeOrganizationSageCompanyPK);
		}

		newOrganizationSageCompanyPKsSet.removeAll(oldOrganizationSageCompanyPKsSet);

		for (long newOrganizationSageCompanyPK : newOrganizationSageCompanyPKsSet) {
			notaGastoToOrganizationSageCompanyTableMapper.addTableMapping(pk,
				newOrganizationSageCompanyPK);
		}
	}

	/**
	 * Sets the organization sage companies associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the nota gasto
	 * @param organizationSageCompanies the organization sage companies to be associated with the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setOrganizationSageCompanies(long pk,
		List<es.davinciti.liferay.model.OrganizationSageCompany> organizationSageCompanies)
		throws SystemException {
		try {
			long[] organizationSageCompanyPKs = new long[organizationSageCompanies.size()];

			for (int i = 0; i < organizationSageCompanies.size(); i++) {
				es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany =
					organizationSageCompanies.get(i);

				organizationSageCompanyPKs[i] = organizationSageCompany.getPrimaryKey();
			}

			setOrganizationSageCompanies(pk, organizationSageCompanyPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(NotaGastoModelImpl.MAPPING_TABLE_CMES_NOTAS_ORGANIZATIONSAGECOMPANIES_NAME);
		}
	}

	/**
	 * Initializes the nota gasto persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.NotaGasto")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<NotaGasto>> listenersList = new ArrayList<ModelListener<NotaGasto>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<NotaGasto>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		notaGastoToHistoricoNotaTableMapper = TableMapperFactory.getTableMapper("CMES_Notas_HistoricoNotas",
				"notagastoId", "historiconotaId", this, historicoNotaPersistence);

		notaGastoToLineaGastoTableMapper = TableMapperFactory.getTableMapper("CMES_Notas_Lineas",
				"notagastoId", "lineagastoId", this, lineaGastoPersistence);

		notaGastoToOrganizationSageCompanyTableMapper = TableMapperFactory.getTableMapper("CMES_Notas_OrganizationSageCompanies",
				"notagastoId", "orgsagecompanyId", this,
				organizationSageCompanyPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(NotaGastoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("CMES_Notas_HistoricoNotas");
		TableMapperFactory.removeTableMapper("CMES_Notas_Lineas");
		TableMapperFactory.removeTableMapper(
			"CMES_Notas_OrganizationSageCompanies");
	}

	@BeanReference(type = HistoricoNotaPersistence.class)
	protected HistoricoNotaPersistence historicoNotaPersistence;
	protected TableMapper<NotaGasto, es.davinciti.liferay.model.HistoricoNota> notaGastoToHistoricoNotaTableMapper;
	@BeanReference(type = LineaGastoPersistence.class)
	protected LineaGastoPersistence lineaGastoPersistence;
	protected TableMapper<NotaGasto, es.davinciti.liferay.model.LineaGasto> notaGastoToLineaGastoTableMapper;
	@BeanReference(type = OrganizationSageCompanyPersistence.class)
	protected OrganizationSageCompanyPersistence organizationSageCompanyPersistence;
	protected TableMapper<NotaGasto, es.davinciti.liferay.model.OrganizationSageCompany> notaGastoToOrganizationSageCompanyTableMapper;
	private static final String _SQL_SELECT_NOTAGASTO = "SELECT notaGasto FROM NotaGasto notaGasto";
	private static final String _SQL_SELECT_NOTAGASTO_WHERE = "SELECT notaGasto FROM NotaGasto notaGasto WHERE ";
	private static final String _SQL_COUNT_NOTAGASTO = "SELECT COUNT(notaGasto) FROM NotaGasto notaGasto";
	private static final String _SQL_COUNT_NOTAGASTO_WHERE = "SELECT COUNT(notaGasto) FROM NotaGasto notaGasto WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "notaGasto.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NotaGasto exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No NotaGasto exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(NotaGastoPersistenceImpl.class);
	private static NotaGasto _nullNotaGasto = new NotaGastoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<NotaGasto> toCacheModel() {
				return _nullNotaGastoCacheModel;
			}
		};

	private static CacheModel<NotaGasto> _nullNotaGastoCacheModel = new CacheModel<NotaGasto>() {
			@Override
			public NotaGasto toEntityModel() {
				return _nullNotaGasto;
			}
		};
}