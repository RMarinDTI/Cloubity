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

import es.davinciti.liferay.NoSuchOrganizationSageCompanyException;
import es.davinciti.liferay.model.OrganizationSageCompany;
import es.davinciti.liferay.model.impl.OrganizationSageCompanyImpl;
import es.davinciti.liferay.model.impl.OrganizationSageCompanyModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the organization sage company service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see OrganizationSageCompanyPersistence
 * @see OrganizationSageCompanyUtil
 * @generated
 */
public class OrganizationSageCompanyPersistenceImpl extends BasePersistenceImpl<OrganizationSageCompany>
	implements OrganizationSageCompanyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OrganizationSageCompanyUtil} to access the organization sage company persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OrganizationSageCompanyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OrganizationSageCompanyModelImpl.ENTITY_CACHE_ENABLED,
			OrganizationSageCompanyModelImpl.FINDER_CACHE_ENABLED,
			OrganizationSageCompanyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OrganizationSageCompanyModelImpl.ENTITY_CACHE_ENABLED,
			OrganizationSageCompanyModelImpl.FINDER_CACHE_ENABLED,
			OrganizationSageCompanyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OrganizationSageCompanyModelImpl.ENTITY_CACHE_ENABLED,
			OrganizationSageCompanyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(OrganizationSageCompanyModelImpl.ENTITY_CACHE_ENABLED,
			OrganizationSageCompanyModelImpl.FINDER_CACHE_ENABLED,
			OrganizationSageCompanyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrganizationId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(OrganizationSageCompanyModelImpl.ENTITY_CACHE_ENABLED,
			OrganizationSageCompanyModelImpl.FINDER_CACHE_ENABLED,
			OrganizationSageCompanyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOrganizationId",
			new String[] { Long.class.getName() },
			OrganizationSageCompanyModelImpl.ORGANIZATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONID = new FinderPath(OrganizationSageCompanyModelImpl.ENTITY_CACHE_ENABLED,
			OrganizationSageCompanyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOrganizationId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the organization sage companies where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching organization sage companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OrganizationSageCompany> findByOrganizationId(
		long organizationId) throws SystemException {
		return findByOrganizationId(organizationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the organization sage companies where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.OrganizationSageCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of organization sage companies
	 * @param end the upper bound of the range of organization sage companies (not inclusive)
	 * @return the range of matching organization sage companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OrganizationSageCompany> findByOrganizationId(
		long organizationId, int start, int end) throws SystemException {
		return findByOrganizationId(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the organization sage companies where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.OrganizationSageCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of organization sage companies
	 * @param end the upper bound of the range of organization sage companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching organization sage companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OrganizationSageCompany> findByOrganizationId(
		long organizationId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID;
			finderArgs = new Object[] { organizationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONID;
			finderArgs = new Object[] {
					organizationId,
					
					start, end, orderByComparator
				};
		}

		List<OrganizationSageCompany> list = (List<OrganizationSageCompany>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OrganizationSageCompany organizationSageCompany : list) {
				if ((organizationId != organizationSageCompany.getOrganizationId())) {
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

			query.append(_SQL_SELECT_ORGANIZATIONSAGECOMPANY_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OrganizationSageCompanyModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<OrganizationSageCompany>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OrganizationSageCompany>(list);
				}
				else {
					list = (List<OrganizationSageCompany>)QueryUtil.list(q,
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
	 * Returns the first organization sage company in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching organization sage company
	 * @throws es.davinciti.liferay.NoSuchOrganizationSageCompanyException if a matching organization sage company could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrganizationSageCompany findByOrganizationId_First(
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchOrganizationSageCompanyException, SystemException {
		OrganizationSageCompany organizationSageCompany = fetchByOrganizationId_First(organizationId,
				orderByComparator);

		if (organizationSageCompany != null) {
			return organizationSageCompany;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrganizationSageCompanyException(msg.toString());
	}

	/**
	 * Returns the first organization sage company in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching organization sage company, or <code>null</code> if a matching organization sage company could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrganizationSageCompany fetchByOrganizationId_First(
		long organizationId, OrderByComparator orderByComparator)
		throws SystemException {
		List<OrganizationSageCompany> list = findByOrganizationId(organizationId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last organization sage company in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching organization sage company
	 * @throws es.davinciti.liferay.NoSuchOrganizationSageCompanyException if a matching organization sage company could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrganizationSageCompany findByOrganizationId_Last(
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchOrganizationSageCompanyException, SystemException {
		OrganizationSageCompany organizationSageCompany = fetchByOrganizationId_Last(organizationId,
				orderByComparator);

		if (organizationSageCompany != null) {
			return organizationSageCompany;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrganizationSageCompanyException(msg.toString());
	}

	/**
	 * Returns the last organization sage company in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching organization sage company, or <code>null</code> if a matching organization sage company could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrganizationSageCompany fetchByOrganizationId_Last(
		long organizationId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByOrganizationId(organizationId);

		if (count == 0) {
			return null;
		}

		List<OrganizationSageCompany> list = findByOrganizationId(organizationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the organization sage companies before and after the current organization sage company in the ordered set where organizationId = &#63;.
	 *
	 * @param orgsagecompanyId the primary key of the current organization sage company
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next organization sage company
	 * @throws es.davinciti.liferay.NoSuchOrganizationSageCompanyException if a organization sage company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrganizationSageCompany[] findByOrganizationId_PrevAndNext(
		long orgsagecompanyId, long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchOrganizationSageCompanyException, SystemException {
		OrganizationSageCompany organizationSageCompany = findByPrimaryKey(orgsagecompanyId);

		Session session = null;

		try {
			session = openSession();

			OrganizationSageCompany[] array = new OrganizationSageCompanyImpl[3];

			array[0] = getByOrganizationId_PrevAndNext(session,
					organizationSageCompany, organizationId, orderByComparator,
					true);

			array[1] = organizationSageCompany;

			array[2] = getByOrganizationId_PrevAndNext(session,
					organizationSageCompany, organizationId, orderByComparator,
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

	protected OrganizationSageCompany getByOrganizationId_PrevAndNext(
		Session session, OrganizationSageCompany organizationSageCompany,
		long organizationId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ORGANIZATIONSAGECOMPANY_WHERE);

		query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

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
			query.append(OrganizationSageCompanyModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(organizationSageCompany);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OrganizationSageCompany> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the organization sage companies where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByOrganizationId(long organizationId)
		throws SystemException {
		for (OrganizationSageCompany organizationSageCompany : findByOrganizationId(
				organizationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(organizationSageCompany);
		}
	}

	/**
	 * Returns the number of organization sage companies where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching organization sage companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByOrganizationId(long organizationId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORGANIZATIONID;

		Object[] finderArgs = new Object[] { organizationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ORGANIZATIONSAGECOMPANY_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

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

	private static final String _FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2 = "organizationSageCompany.organizationId = ?";

	public OrganizationSageCompanyPersistenceImpl() {
		setModelClass(OrganizationSageCompany.class);
	}

	/**
	 * Caches the organization sage company in the entity cache if it is enabled.
	 *
	 * @param organizationSageCompany the organization sage company
	 */
	@Override
	public void cacheResult(OrganizationSageCompany organizationSageCompany) {
		EntityCacheUtil.putResult(OrganizationSageCompanyModelImpl.ENTITY_CACHE_ENABLED,
			OrganizationSageCompanyImpl.class,
			organizationSageCompany.getPrimaryKey(), organizationSageCompany);

		organizationSageCompany.resetOriginalValues();
	}

	/**
	 * Caches the organization sage companies in the entity cache if it is enabled.
	 *
	 * @param organizationSageCompanies the organization sage companies
	 */
	@Override
	public void cacheResult(
		List<OrganizationSageCompany> organizationSageCompanies) {
		for (OrganizationSageCompany organizationSageCompany : organizationSageCompanies) {
			if (EntityCacheUtil.getResult(
						OrganizationSageCompanyModelImpl.ENTITY_CACHE_ENABLED,
						OrganizationSageCompanyImpl.class,
						organizationSageCompany.getPrimaryKey()) == null) {
				cacheResult(organizationSageCompany);
			}
			else {
				organizationSageCompany.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all organization sage companies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OrganizationSageCompanyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OrganizationSageCompanyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the organization sage company.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OrganizationSageCompany organizationSageCompany) {
		EntityCacheUtil.removeResult(OrganizationSageCompanyModelImpl.ENTITY_CACHE_ENABLED,
			OrganizationSageCompanyImpl.class,
			organizationSageCompany.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<OrganizationSageCompany> organizationSageCompanies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OrganizationSageCompany organizationSageCompany : organizationSageCompanies) {
			EntityCacheUtil.removeResult(OrganizationSageCompanyModelImpl.ENTITY_CACHE_ENABLED,
				OrganizationSageCompanyImpl.class,
				organizationSageCompany.getPrimaryKey());
		}
	}

	/**
	 * Creates a new organization sage company with the primary key. Does not add the organization sage company to the database.
	 *
	 * @param orgsagecompanyId the primary key for the new organization sage company
	 * @return the new organization sage company
	 */
	@Override
	public OrganizationSageCompany create(long orgsagecompanyId) {
		OrganizationSageCompany organizationSageCompany = new OrganizationSageCompanyImpl();

		organizationSageCompany.setNew(true);
		organizationSageCompany.setPrimaryKey(orgsagecompanyId);

		return organizationSageCompany;
	}

	/**
	 * Removes the organization sage company with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param orgsagecompanyId the primary key of the organization sage company
	 * @return the organization sage company that was removed
	 * @throws es.davinciti.liferay.NoSuchOrganizationSageCompanyException if a organization sage company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrganizationSageCompany remove(long orgsagecompanyId)
		throws NoSuchOrganizationSageCompanyException, SystemException {
		return remove((Serializable)orgsagecompanyId);
	}

	/**
	 * Removes the organization sage company with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the organization sage company
	 * @return the organization sage company that was removed
	 * @throws es.davinciti.liferay.NoSuchOrganizationSageCompanyException if a organization sage company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrganizationSageCompany remove(Serializable primaryKey)
		throws NoSuchOrganizationSageCompanyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			OrganizationSageCompany organizationSageCompany = (OrganizationSageCompany)session.get(OrganizationSageCompanyImpl.class,
					primaryKey);

			if (organizationSageCompany == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOrganizationSageCompanyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(organizationSageCompany);
		}
		catch (NoSuchOrganizationSageCompanyException nsee) {
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
	protected OrganizationSageCompany removeImpl(
		OrganizationSageCompany organizationSageCompany)
		throws SystemException {
		organizationSageCompany = toUnwrappedModel(organizationSageCompany);

		organizationSageCompanyToNotaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(organizationSageCompany.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(organizationSageCompany)) {
				organizationSageCompany = (OrganizationSageCompany)session.get(OrganizationSageCompanyImpl.class,
						organizationSageCompany.getPrimaryKeyObj());
			}

			if (organizationSageCompany != null) {
				session.delete(organizationSageCompany);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (organizationSageCompany != null) {
			clearCache(organizationSageCompany);
		}

		return organizationSageCompany;
	}

	@Override
	public OrganizationSageCompany updateImpl(
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws SystemException {
		organizationSageCompany = toUnwrappedModel(organizationSageCompany);

		boolean isNew = organizationSageCompany.isNew();

		OrganizationSageCompanyModelImpl organizationSageCompanyModelImpl = (OrganizationSageCompanyModelImpl)organizationSageCompany;

		Session session = null;

		try {
			session = openSession();

			if (organizationSageCompany.isNew()) {
				session.save(organizationSageCompany);

				organizationSageCompany.setNew(false);
			}
			else {
				session.merge(organizationSageCompany);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !OrganizationSageCompanyModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((organizationSageCompanyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						organizationSageCompanyModelImpl.getOriginalOrganizationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);

				args = new Object[] {
						organizationSageCompanyModelImpl.getOrganizationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);
			}
		}

		EntityCacheUtil.putResult(OrganizationSageCompanyModelImpl.ENTITY_CACHE_ENABLED,
			OrganizationSageCompanyImpl.class,
			organizationSageCompany.getPrimaryKey(), organizationSageCompany);

		return organizationSageCompany;
	}

	protected OrganizationSageCompany toUnwrappedModel(
		OrganizationSageCompany organizationSageCompany) {
		if (organizationSageCompany instanceof OrganizationSageCompanyImpl) {
			return organizationSageCompany;
		}

		OrganizationSageCompanyImpl organizationSageCompanyImpl = new OrganizationSageCompanyImpl();

		organizationSageCompanyImpl.setNew(organizationSageCompany.isNew());
		organizationSageCompanyImpl.setPrimaryKey(organizationSageCompany.getPrimaryKey());

		organizationSageCompanyImpl.setOrgsagecompanyId(organizationSageCompany.getOrgsagecompanyId());
		organizationSageCompanyImpl.setOrganizationId(organizationSageCompany.getOrganizationId());
		organizationSageCompanyImpl.setSageCompanyId(organizationSageCompany.getSageCompanyId());

		return organizationSageCompanyImpl;
	}

	/**
	 * Returns the organization sage company with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the organization sage company
	 * @return the organization sage company
	 * @throws es.davinciti.liferay.NoSuchOrganizationSageCompanyException if a organization sage company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrganizationSageCompany findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOrganizationSageCompanyException, SystemException {
		OrganizationSageCompany organizationSageCompany = fetchByPrimaryKey(primaryKey);

		if (organizationSageCompany == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOrganizationSageCompanyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return organizationSageCompany;
	}

	/**
	 * Returns the organization sage company with the primary key or throws a {@link es.davinciti.liferay.NoSuchOrganizationSageCompanyException} if it could not be found.
	 *
	 * @param orgsagecompanyId the primary key of the organization sage company
	 * @return the organization sage company
	 * @throws es.davinciti.liferay.NoSuchOrganizationSageCompanyException if a organization sage company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrganizationSageCompany findByPrimaryKey(long orgsagecompanyId)
		throws NoSuchOrganizationSageCompanyException, SystemException {
		return findByPrimaryKey((Serializable)orgsagecompanyId);
	}

	/**
	 * Returns the organization sage company with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the organization sage company
	 * @return the organization sage company, or <code>null</code> if a organization sage company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrganizationSageCompany fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		OrganizationSageCompany organizationSageCompany = (OrganizationSageCompany)EntityCacheUtil.getResult(OrganizationSageCompanyModelImpl.ENTITY_CACHE_ENABLED,
				OrganizationSageCompanyImpl.class, primaryKey);

		if (organizationSageCompany == _nullOrganizationSageCompany) {
			return null;
		}

		if (organizationSageCompany == null) {
			Session session = null;

			try {
				session = openSession();

				organizationSageCompany = (OrganizationSageCompany)session.get(OrganizationSageCompanyImpl.class,
						primaryKey);

				if (organizationSageCompany != null) {
					cacheResult(organizationSageCompany);
				}
				else {
					EntityCacheUtil.putResult(OrganizationSageCompanyModelImpl.ENTITY_CACHE_ENABLED,
						OrganizationSageCompanyImpl.class, primaryKey,
						_nullOrganizationSageCompany);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(OrganizationSageCompanyModelImpl.ENTITY_CACHE_ENABLED,
					OrganizationSageCompanyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return organizationSageCompany;
	}

	/**
	 * Returns the organization sage company with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param orgsagecompanyId the primary key of the organization sage company
	 * @return the organization sage company, or <code>null</code> if a organization sage company with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrganizationSageCompany fetchByPrimaryKey(long orgsagecompanyId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)orgsagecompanyId);
	}

	/**
	 * Returns all the organization sage companies.
	 *
	 * @return the organization sage companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OrganizationSageCompany> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the organization sage companies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.OrganizationSageCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of organization sage companies
	 * @param end the upper bound of the range of organization sage companies (not inclusive)
	 * @return the range of organization sage companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OrganizationSageCompany> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the organization sage companies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.OrganizationSageCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of organization sage companies
	 * @param end the upper bound of the range of organization sage companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of organization sage companies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OrganizationSageCompany> findAll(int start, int end,
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

		List<OrganizationSageCompany> list = (List<OrganizationSageCompany>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ORGANIZATIONSAGECOMPANY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ORGANIZATIONSAGECOMPANY;

				if (pagination) {
					sql = sql.concat(OrganizationSageCompanyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OrganizationSageCompany>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OrganizationSageCompany>(list);
				}
				else {
					list = (List<OrganizationSageCompany>)QueryUtil.list(q,
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
	 * Removes all the organization sage companies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (OrganizationSageCompany organizationSageCompany : findAll()) {
			remove(organizationSageCompany);
		}
	}

	/**
	 * Returns the number of organization sage companies.
	 *
	 * @return the number of organization sage companies
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

				Query q = session.createQuery(_SQL_COUNT_ORGANIZATIONSAGECOMPANY);

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
	 * Returns all the nota gastos associated with the organization sage company.
	 *
	 * @param pk the primary key of the organization sage company
	 * @return the nota gastos associated with the organization sage company
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(long pk)
		throws SystemException {
		return getNotaGastos(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the nota gastos associated with the organization sage company.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.OrganizationSageCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the organization sage company
	 * @param start the lower bound of the range of organization sage companies
	 * @param end the upper bound of the range of organization sage companies (not inclusive)
	 * @return the range of nota gastos associated with the organization sage company
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(long pk,
		int start, int end) throws SystemException {
		return getNotaGastos(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nota gastos associated with the organization sage company.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.OrganizationSageCompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the organization sage company
	 * @param start the lower bound of the range of organization sage companies
	 * @param end the upper bound of the range of organization sage companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nota gastos associated with the organization sage company
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.NotaGasto> getNotaGastos(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return organizationSageCompanyToNotaGastoTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of nota gastos associated with the organization sage company.
	 *
	 * @param pk the primary key of the organization sage company
	 * @return the number of nota gastos associated with the organization sage company
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getNotaGastosSize(long pk) throws SystemException {
		long[] pks = organizationSageCompanyToNotaGastoTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the nota gasto is associated with the organization sage company.
	 *
	 * @param pk the primary key of the organization sage company
	 * @param notaGastoPK the primary key of the nota gasto
	 * @return <code>true</code> if the nota gasto is associated with the organization sage company; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsNotaGasto(long pk, long notaGastoPK)
		throws SystemException {
		return organizationSageCompanyToNotaGastoTableMapper.containsTableMapping(pk,
			notaGastoPK);
	}

	/**
	 * Returns <code>true</code> if the organization sage company has any nota gastos associated with it.
	 *
	 * @param pk the primary key of the organization sage company to check for associations with nota gastos
	 * @return <code>true</code> if the organization sage company has any nota gastos associated with it; <code>false</code> otherwise
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
	 * Adds an association between the organization sage company and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the organization sage company
	 * @param notaGastoPK the primary key of the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addNotaGasto(long pk, long notaGastoPK)
		throws SystemException {
		organizationSageCompanyToNotaGastoTableMapper.addTableMapping(pk,
			notaGastoPK);
	}

	/**
	 * Adds an association between the organization sage company and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the organization sage company
	 * @param notaGasto the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addNotaGasto(long pk,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws SystemException {
		organizationSageCompanyToNotaGastoTableMapper.addTableMapping(pk,
			notaGasto.getPrimaryKey());
	}

	/**
	 * Adds an association between the organization sage company and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the organization sage company
	 * @param notaGastoPKs the primary keys of the nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addNotaGastos(long pk, long[] notaGastoPKs)
		throws SystemException {
		for (long notaGastoPK : notaGastoPKs) {
			organizationSageCompanyToNotaGastoTableMapper.addTableMapping(pk,
				notaGastoPK);
		}
	}

	/**
	 * Adds an association between the organization sage company and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the organization sage company
	 * @param notaGastos the nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addNotaGastos(long pk,
		List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.NotaGasto notaGasto : notaGastos) {
			organizationSageCompanyToNotaGastoTableMapper.addTableMapping(pk,
				notaGasto.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the organization sage company and its nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the organization sage company to clear the associated nota gastos from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearNotaGastos(long pk) throws SystemException {
		organizationSageCompanyToNotaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the organization sage company and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the organization sage company
	 * @param notaGastoPK the primary key of the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeNotaGasto(long pk, long notaGastoPK)
		throws SystemException {
		organizationSageCompanyToNotaGastoTableMapper.deleteTableMapping(pk,
			notaGastoPK);
	}

	/**
	 * Removes the association between the organization sage company and the nota gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the organization sage company
	 * @param notaGasto the nota gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeNotaGasto(long pk,
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws SystemException {
		organizationSageCompanyToNotaGastoTableMapper.deleteTableMapping(pk,
			notaGasto.getPrimaryKey());
	}

	/**
	 * Removes the association between the organization sage company and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the organization sage company
	 * @param notaGastoPKs the primary keys of the nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeNotaGastos(long pk, long[] notaGastoPKs)
		throws SystemException {
		for (long notaGastoPK : notaGastoPKs) {
			organizationSageCompanyToNotaGastoTableMapper.deleteTableMapping(pk,
				notaGastoPK);
		}
	}

	/**
	 * Removes the association between the organization sage company and the nota gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the organization sage company
	 * @param notaGastos the nota gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeNotaGastos(long pk,
		List<es.davinciti.liferay.model.NotaGasto> notaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.NotaGasto notaGasto : notaGastos) {
			organizationSageCompanyToNotaGastoTableMapper.deleteTableMapping(pk,
				notaGasto.getPrimaryKey());
		}
	}

	/**
	 * Sets the nota gastos associated with the organization sage company, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the organization sage company
	 * @param notaGastoPKs the primary keys of the nota gastos to be associated with the organization sage company
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setNotaGastos(long pk, long[] notaGastoPKs)
		throws SystemException {
		Set<Long> newNotaGastoPKsSet = SetUtil.fromArray(notaGastoPKs);
		Set<Long> oldNotaGastoPKsSet = SetUtil.fromArray(organizationSageCompanyToNotaGastoTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeNotaGastoPKsSet = new HashSet<Long>(oldNotaGastoPKsSet);

		removeNotaGastoPKsSet.removeAll(newNotaGastoPKsSet);

		for (long removeNotaGastoPK : removeNotaGastoPKsSet) {
			organizationSageCompanyToNotaGastoTableMapper.deleteTableMapping(pk,
				removeNotaGastoPK);
		}

		newNotaGastoPKsSet.removeAll(oldNotaGastoPKsSet);

		for (long newNotaGastoPK : newNotaGastoPKsSet) {
			organizationSageCompanyToNotaGastoTableMapper.addTableMapping(pk,
				newNotaGastoPK);
		}
	}

	/**
	 * Sets the nota gastos associated with the organization sage company, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the organization sage company
	 * @param notaGastos the nota gastos to be associated with the organization sage company
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
			FinderCacheUtil.clearCache(OrganizationSageCompanyModelImpl.MAPPING_TABLE_CMES_NOTAS_ORGANIZATIONSAGECOMPANIES_NAME);
		}
	}

	/**
	 * Initializes the organization sage company persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.OrganizationSageCompany")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<OrganizationSageCompany>> listenersList = new ArrayList<ModelListener<OrganizationSageCompany>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<OrganizationSageCompany>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		organizationSageCompanyToNotaGastoTableMapper = TableMapperFactory.getTableMapper("CMES_Notas_OrganizationSageCompanies",
				"orgsagecompanyId", "notagastoId", this, notaGastoPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(OrganizationSageCompanyImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper(
			"CMES_Notas_OrganizationSageCompanies");
	}

	@BeanReference(type = NotaGastoPersistence.class)
	protected NotaGastoPersistence notaGastoPersistence;
	protected TableMapper<OrganizationSageCompany, es.davinciti.liferay.model.NotaGasto> organizationSageCompanyToNotaGastoTableMapper;
	private static final String _SQL_SELECT_ORGANIZATIONSAGECOMPANY = "SELECT organizationSageCompany FROM OrganizationSageCompany organizationSageCompany";
	private static final String _SQL_SELECT_ORGANIZATIONSAGECOMPANY_WHERE = "SELECT organizationSageCompany FROM OrganizationSageCompany organizationSageCompany WHERE ";
	private static final String _SQL_COUNT_ORGANIZATIONSAGECOMPANY = "SELECT COUNT(organizationSageCompany) FROM OrganizationSageCompany organizationSageCompany";
	private static final String _SQL_COUNT_ORGANIZATIONSAGECOMPANY_WHERE = "SELECT COUNT(organizationSageCompany) FROM OrganizationSageCompany organizationSageCompany WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "organizationSageCompany.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OrganizationSageCompany exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No OrganizationSageCompany exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OrganizationSageCompanyPersistenceImpl.class);
	private static OrganizationSageCompany _nullOrganizationSageCompany = new OrganizationSageCompanyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<OrganizationSageCompany> toCacheModel() {
				return _nullOrganizationSageCompanyCacheModel;
			}
		};

	private static CacheModel<OrganizationSageCompany> _nullOrganizationSageCompanyCacheModel =
		new CacheModel<OrganizationSageCompany>() {
			@Override
			public OrganizationSageCompany toEntityModel() {
				return _nullOrganizationSageCompany;
			}
		};
}