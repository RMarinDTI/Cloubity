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

import es.davinciti.liferay.NoSuchCurrenciesCompanyException;
import es.davinciti.liferay.model.CurrenciesCompany;
import es.davinciti.liferay.model.impl.CurrenciesCompanyImpl;
import es.davinciti.liferay.model.impl.CurrenciesCompanyModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the currencies company service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see CurrenciesCompanyPersistence
 * @see CurrenciesCompanyUtil
 * @generated
 */
public class CurrenciesCompanyPersistenceImpl extends BasePersistenceImpl<CurrenciesCompany>
	implements CurrenciesCompanyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CurrenciesCompanyUtil} to access the currencies company persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CurrenciesCompanyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CurrenciesCompanyModelImpl.ENTITY_CACHE_ENABLED,
			CurrenciesCompanyModelImpl.FINDER_CACHE_ENABLED,
			CurrenciesCompanyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CurrenciesCompanyModelImpl.ENTITY_CACHE_ENABLED,
			CurrenciesCompanyModelImpl.FINDER_CACHE_ENABLED,
			CurrenciesCompanyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CurrenciesCompanyModelImpl.ENTITY_CACHE_ENABLED,
			CurrenciesCompanyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(CurrenciesCompanyModelImpl.ENTITY_CACHE_ENABLED,
			CurrenciesCompanyModelImpl.FINDER_CACHE_ENABLED,
			CurrenciesCompanyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(CurrenciesCompanyModelImpl.ENTITY_CACHE_ENABLED,
			CurrenciesCompanyModelImpl.FINDER_CACHE_ENABLED,
			CurrenciesCompanyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			CurrenciesCompanyModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(CurrenciesCompanyModelImpl.ENTITY_CACHE_ENABLED,
			CurrenciesCompanyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the currencies companies where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching currencies companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CurrenciesCompany> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the currencies companies where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CurrenciesCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of currencies companies
	 * @param end the upper bound of the range of currencies companies (not inclusive)
	 * @return the range of matching currencies companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CurrenciesCompany> findByCompanyId(long companyId, int start,
		int end) throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the currencies companies where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CurrenciesCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of currencies companies
	 * @param end the upper bound of the range of currencies companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching currencies companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CurrenciesCompany> findByCompanyId(long companyId, int start,
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

		List<CurrenciesCompany> list = (List<CurrenciesCompany>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CurrenciesCompany currenciesCompany : list) {
				if ((companyId != currenciesCompany.getCompanyId())) {
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

			query.append(_SQL_SELECT_CURRENCIESCOMPANY_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CurrenciesCompanyModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<CurrenciesCompany>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CurrenciesCompany>(list);
				}
				else {
					list = (List<CurrenciesCompany>)QueryUtil.list(q,
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
	 * Returns the first currencies company in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching currencies company
	 * @throws es.davinciti.liferay.NoSuchCurrenciesCompanyException if a matching currencies company could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CurrenciesCompany findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchCurrenciesCompanyException, SystemException {
		CurrenciesCompany currenciesCompany = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (currenciesCompany != null) {
			return currenciesCompany;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCurrenciesCompanyException(msg.toString());
	}

	/**
	 * Returns the first currencies company in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching currencies company, or <code>null</code> if a matching currencies company could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CurrenciesCompany fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CurrenciesCompany> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last currencies company in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching currencies company
	 * @throws es.davinciti.liferay.NoSuchCurrenciesCompanyException if a matching currencies company could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CurrenciesCompany findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchCurrenciesCompanyException, SystemException {
		CurrenciesCompany currenciesCompany = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (currenciesCompany != null) {
			return currenciesCompany;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCurrenciesCompanyException(msg.toString());
	}

	/**
	 * Returns the last currencies company in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching currencies company, or <code>null</code> if a matching currencies company could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CurrenciesCompany fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<CurrenciesCompany> list = findByCompanyId(companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the currencies companies before and after the current currencies company in the ordered set where companyId = &#63;.
	 *
	 * @param currenciescompanyId the primary key of the current currencies company
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next currencies company
	 * @throws es.davinciti.liferay.NoSuchCurrenciesCompanyException if a currencies company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CurrenciesCompany[] findByCompanyId_PrevAndNext(
		long currenciescompanyId, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchCurrenciesCompanyException, SystemException {
		CurrenciesCompany currenciesCompany = findByPrimaryKey(currenciescompanyId);

		Session session = null;

		try {
			session = openSession();

			CurrenciesCompany[] array = new CurrenciesCompanyImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, currenciesCompany,
					companyId, orderByComparator, true);

			array[1] = currenciesCompany;

			array[2] = getByCompanyId_PrevAndNext(session, currenciesCompany,
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

	protected CurrenciesCompany getByCompanyId_PrevAndNext(Session session,
		CurrenciesCompany currenciesCompany, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CURRENCIESCOMPANY_WHERE);

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
			query.append(CurrenciesCompanyModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(currenciesCompany);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CurrenciesCompany> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the currencies companies where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (CurrenciesCompany currenciesCompany : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(currenciesCompany);
		}
	}

	/**
	 * Returns the number of currencies companies where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching currencies companies
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

			query.append(_SQL_COUNT_CURRENCIESCOMPANY_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "currenciesCompany.companyId = ?";

	public CurrenciesCompanyPersistenceImpl() {
		setModelClass(CurrenciesCompany.class);
	}

	/**
	 * Caches the currencies company in the entity cache if it is enabled.
	 *
	 * @param currenciesCompany the currencies company
	 */
	@Override
	public void cacheResult(CurrenciesCompany currenciesCompany) {
		EntityCacheUtil.putResult(CurrenciesCompanyModelImpl.ENTITY_CACHE_ENABLED,
			CurrenciesCompanyImpl.class, currenciesCompany.getPrimaryKey(),
			currenciesCompany);

		currenciesCompany.resetOriginalValues();
	}

	/**
	 * Caches the currencies companies in the entity cache if it is enabled.
	 *
	 * @param currenciesCompanies the currencies companies
	 */
	@Override
	public void cacheResult(List<CurrenciesCompany> currenciesCompanies) {
		for (CurrenciesCompany currenciesCompany : currenciesCompanies) {
			if (EntityCacheUtil.getResult(
						CurrenciesCompanyModelImpl.ENTITY_CACHE_ENABLED,
						CurrenciesCompanyImpl.class,
						currenciesCompany.getPrimaryKey()) == null) {
				cacheResult(currenciesCompany);
			}
			else {
				currenciesCompany.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all currencies companies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CurrenciesCompanyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CurrenciesCompanyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the currencies company.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CurrenciesCompany currenciesCompany) {
		EntityCacheUtil.removeResult(CurrenciesCompanyModelImpl.ENTITY_CACHE_ENABLED,
			CurrenciesCompanyImpl.class, currenciesCompany.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CurrenciesCompany> currenciesCompanies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CurrenciesCompany currenciesCompany : currenciesCompanies) {
			EntityCacheUtil.removeResult(CurrenciesCompanyModelImpl.ENTITY_CACHE_ENABLED,
				CurrenciesCompanyImpl.class, currenciesCompany.getPrimaryKey());
		}
	}

	/**
	 * Creates a new currencies company with the primary key. Does not add the currencies company to the database.
	 *
	 * @param currenciescompanyId the primary key for the new currencies company
	 * @return the new currencies company
	 */
	@Override
	public CurrenciesCompany create(long currenciescompanyId) {
		CurrenciesCompany currenciesCompany = new CurrenciesCompanyImpl();

		currenciesCompany.setNew(true);
		currenciesCompany.setPrimaryKey(currenciescompanyId);

		return currenciesCompany;
	}

	/**
	 * Removes the currencies company with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param currenciescompanyId the primary key of the currencies company
	 * @return the currencies company that was removed
	 * @throws es.davinciti.liferay.NoSuchCurrenciesCompanyException if a currencies company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CurrenciesCompany remove(long currenciescompanyId)
		throws NoSuchCurrenciesCompanyException, SystemException {
		return remove((Serializable)currenciescompanyId);
	}

	/**
	 * Removes the currencies company with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the currencies company
	 * @return the currencies company that was removed
	 * @throws es.davinciti.liferay.NoSuchCurrenciesCompanyException if a currencies company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CurrenciesCompany remove(Serializable primaryKey)
		throws NoSuchCurrenciesCompanyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CurrenciesCompany currenciesCompany = (CurrenciesCompany)session.get(CurrenciesCompanyImpl.class,
					primaryKey);

			if (currenciesCompany == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCurrenciesCompanyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(currenciesCompany);
		}
		catch (NoSuchCurrenciesCompanyException nsee) {
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
	protected CurrenciesCompany removeImpl(CurrenciesCompany currenciesCompany)
		throws SystemException {
		currenciesCompany = toUnwrappedModel(currenciesCompany);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(currenciesCompany)) {
				currenciesCompany = (CurrenciesCompany)session.get(CurrenciesCompanyImpl.class,
						currenciesCompany.getPrimaryKeyObj());
			}

			if (currenciesCompany != null) {
				session.delete(currenciesCompany);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (currenciesCompany != null) {
			clearCache(currenciesCompany);
		}

		return currenciesCompany;
	}

	@Override
	public CurrenciesCompany updateImpl(
		es.davinciti.liferay.model.CurrenciesCompany currenciesCompany)
		throws SystemException {
		currenciesCompany = toUnwrappedModel(currenciesCompany);

		boolean isNew = currenciesCompany.isNew();

		CurrenciesCompanyModelImpl currenciesCompanyModelImpl = (CurrenciesCompanyModelImpl)currenciesCompany;

		Session session = null;

		try {
			session = openSession();

			if (currenciesCompany.isNew()) {
				session.save(currenciesCompany);

				currenciesCompany.setNew(false);
			}
			else {
				session.merge(currenciesCompany);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CurrenciesCompanyModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((currenciesCompanyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						currenciesCompanyModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { currenciesCompanyModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}
		}

		EntityCacheUtil.putResult(CurrenciesCompanyModelImpl.ENTITY_CACHE_ENABLED,
			CurrenciesCompanyImpl.class, currenciesCompany.getPrimaryKey(),
			currenciesCompany);

		return currenciesCompany;
	}

	protected CurrenciesCompany toUnwrappedModel(
		CurrenciesCompany currenciesCompany) {
		if (currenciesCompany instanceof CurrenciesCompanyImpl) {
			return currenciesCompany;
		}

		CurrenciesCompanyImpl currenciesCompanyImpl = new CurrenciesCompanyImpl();

		currenciesCompanyImpl.setNew(currenciesCompany.isNew());
		currenciesCompanyImpl.setPrimaryKey(currenciesCompany.getPrimaryKey());

		currenciesCompanyImpl.setCurrenciescompanyId(currenciesCompany.getCurrenciescompanyId());
		currenciesCompanyImpl.setCompanyId(currenciesCompany.getCompanyId());
		currenciesCompanyImpl.setCurrenciesJson(currenciesCompany.getCurrenciesJson());

		return currenciesCompanyImpl;
	}

	/**
	 * Returns the currencies company with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the currencies company
	 * @return the currencies company
	 * @throws es.davinciti.liferay.NoSuchCurrenciesCompanyException if a currencies company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CurrenciesCompany findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCurrenciesCompanyException, SystemException {
		CurrenciesCompany currenciesCompany = fetchByPrimaryKey(primaryKey);

		if (currenciesCompany == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCurrenciesCompanyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return currenciesCompany;
	}

	/**
	 * Returns the currencies company with the primary key or throws a {@link es.davinciti.liferay.NoSuchCurrenciesCompanyException} if it could not be found.
	 *
	 * @param currenciescompanyId the primary key of the currencies company
	 * @return the currencies company
	 * @throws es.davinciti.liferay.NoSuchCurrenciesCompanyException if a currencies company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CurrenciesCompany findByPrimaryKey(long currenciescompanyId)
		throws NoSuchCurrenciesCompanyException, SystemException {
		return findByPrimaryKey((Serializable)currenciescompanyId);
	}

	/**
	 * Returns the currencies company with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the currencies company
	 * @return the currencies company, or <code>null</code> if a currencies company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CurrenciesCompany fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CurrenciesCompany currenciesCompany = (CurrenciesCompany)EntityCacheUtil.getResult(CurrenciesCompanyModelImpl.ENTITY_CACHE_ENABLED,
				CurrenciesCompanyImpl.class, primaryKey);

		if (currenciesCompany == _nullCurrenciesCompany) {
			return null;
		}

		if (currenciesCompany == null) {
			Session session = null;

			try {
				session = openSession();

				currenciesCompany = (CurrenciesCompany)session.get(CurrenciesCompanyImpl.class,
						primaryKey);

				if (currenciesCompany != null) {
					cacheResult(currenciesCompany);
				}
				else {
					EntityCacheUtil.putResult(CurrenciesCompanyModelImpl.ENTITY_CACHE_ENABLED,
						CurrenciesCompanyImpl.class, primaryKey,
						_nullCurrenciesCompany);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CurrenciesCompanyModelImpl.ENTITY_CACHE_ENABLED,
					CurrenciesCompanyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return currenciesCompany;
	}

	/**
	 * Returns the currencies company with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param currenciescompanyId the primary key of the currencies company
	 * @return the currencies company, or <code>null</code> if a currencies company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CurrenciesCompany fetchByPrimaryKey(long currenciescompanyId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)currenciescompanyId);
	}

	/**
	 * Returns all the currencies companies.
	 *
	 * @return the currencies companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CurrenciesCompany> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the currencies companies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CurrenciesCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of currencies companies
	 * @param end the upper bound of the range of currencies companies (not inclusive)
	 * @return the range of currencies companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CurrenciesCompany> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the currencies companies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CurrenciesCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of currencies companies
	 * @param end the upper bound of the range of currencies companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of currencies companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CurrenciesCompany> findAll(int start, int end,
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

		List<CurrenciesCompany> list = (List<CurrenciesCompany>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CURRENCIESCOMPANY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CURRENCIESCOMPANY;

				if (pagination) {
					sql = sql.concat(CurrenciesCompanyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CurrenciesCompany>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CurrenciesCompany>(list);
				}
				else {
					list = (List<CurrenciesCompany>)QueryUtil.list(q,
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
	 * Removes all the currencies companies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CurrenciesCompany currenciesCompany : findAll()) {
			remove(currenciesCompany);
		}
	}

	/**
	 * Returns the number of currencies companies.
	 *
	 * @return the number of currencies companies
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

				Query q = session.createQuery(_SQL_COUNT_CURRENCIESCOMPANY);

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
	 * Initializes the currencies company persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.CurrenciesCompany")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CurrenciesCompany>> listenersList = new ArrayList<ModelListener<CurrenciesCompany>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CurrenciesCompany>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CurrenciesCompanyImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CURRENCIESCOMPANY = "SELECT currenciesCompany FROM CurrenciesCompany currenciesCompany";
	private static final String _SQL_SELECT_CURRENCIESCOMPANY_WHERE = "SELECT currenciesCompany FROM CurrenciesCompany currenciesCompany WHERE ";
	private static final String _SQL_COUNT_CURRENCIESCOMPANY = "SELECT COUNT(currenciesCompany) FROM CurrenciesCompany currenciesCompany";
	private static final String _SQL_COUNT_CURRENCIESCOMPANY_WHERE = "SELECT COUNT(currenciesCompany) FROM CurrenciesCompany currenciesCompany WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "currenciesCompany.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CurrenciesCompany exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CurrenciesCompany exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CurrenciesCompanyPersistenceImpl.class);
	private static CurrenciesCompany _nullCurrenciesCompany = new CurrenciesCompanyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CurrenciesCompany> toCacheModel() {
				return _nullCurrenciesCompanyCacheModel;
			}
		};

	private static CacheModel<CurrenciesCompany> _nullCurrenciesCompanyCacheModel =
		new CacheModel<CurrenciesCompany>() {
			@Override
			public CurrenciesCompany toEntityModel() {
				return _nullCurrenciesCompany;
			}
		};
}