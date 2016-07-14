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

import es.davinciti.liferay.NoSuchSapEmployeeException;
import es.davinciti.liferay.model.SapEmployee;
import es.davinciti.liferay.model.impl.SapEmployeeImpl;
import es.davinciti.liferay.model.impl.SapEmployeeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the sap employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see SapEmployeePersistence
 * @see SapEmployeeUtil
 * @generated
 */
public class SapEmployeePersistenceImpl extends BasePersistenceImpl<SapEmployee>
	implements SapEmployeePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SapEmployeeUtil} to access the sap employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SapEmployeeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SapEmployeeModelImpl.FINDER_CACHE_ENABLED, SapEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SapEmployeeModelImpl.FINDER_CACHE_ENABLED, SapEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SapEmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPLOYEEID =
		new FinderPath(SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SapEmployeeModelImpl.FINDER_CACHE_ENABLED, SapEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEmployeeId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID =
		new FinderPath(SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SapEmployeeModelImpl.FINDER_CACHE_ENABLED, SapEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEmployeeId",
			new String[] { Long.class.getName() },
			SapEmployeeModelImpl.EMPLOYEEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMPLOYEEID = new FinderPath(SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SapEmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEmployeeId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the sap employees where employeeID = &#63;.
	 *
	 * @param employeeID the employee i d
	 * @return the matching sap employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SapEmployee> findByEmployeeId(long employeeID)
		throws SystemException {
		return findByEmployeeId(employeeID, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sap employees where employeeID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SapEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param employeeID the employee i d
	 * @param start the lower bound of the range of sap employees
	 * @param end the upper bound of the range of sap employees (not inclusive)
	 * @return the range of matching sap employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SapEmployee> findByEmployeeId(long employeeID, int start,
		int end) throws SystemException {
		return findByEmployeeId(employeeID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sap employees where employeeID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SapEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param employeeID the employee i d
	 * @param start the lower bound of the range of sap employees
	 * @param end the upper bound of the range of sap employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sap employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SapEmployee> findByEmployeeId(long employeeID, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID;
			finderArgs = new Object[] { employeeID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPLOYEEID;
			finderArgs = new Object[] { employeeID, start, end, orderByComparator };
		}

		List<SapEmployee> list = (List<SapEmployee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SapEmployee sapEmployee : list) {
				if ((employeeID != sapEmployee.getEmployeeID())) {
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

			query.append(_SQL_SELECT_SAPEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SapEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(employeeID);

				if (!pagination) {
					list = (List<SapEmployee>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SapEmployee>(list);
				}
				else {
					list = (List<SapEmployee>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first sap employee in the ordered set where employeeID = &#63;.
	 *
	 * @param employeeID the employee i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sap employee
	 * @throws es.davinciti.liferay.NoSuchSapEmployeeException if a matching sap employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SapEmployee findByEmployeeId_First(long employeeID,
		OrderByComparator orderByComparator)
		throws NoSuchSapEmployeeException, SystemException {
		SapEmployee sapEmployee = fetchByEmployeeId_First(employeeID,
				orderByComparator);

		if (sapEmployee != null) {
			return sapEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("employeeID=");
		msg.append(employeeID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSapEmployeeException(msg.toString());
	}

	/**
	 * Returns the first sap employee in the ordered set where employeeID = &#63;.
	 *
	 * @param employeeID the employee i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sap employee, or <code>null</code> if a matching sap employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SapEmployee fetchByEmployeeId_First(long employeeID,
		OrderByComparator orderByComparator) throws SystemException {
		List<SapEmployee> list = findByEmployeeId(employeeID, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sap employee in the ordered set where employeeID = &#63;.
	 *
	 * @param employeeID the employee i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sap employee
	 * @throws es.davinciti.liferay.NoSuchSapEmployeeException if a matching sap employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SapEmployee findByEmployeeId_Last(long employeeID,
		OrderByComparator orderByComparator)
		throws NoSuchSapEmployeeException, SystemException {
		SapEmployee sapEmployee = fetchByEmployeeId_Last(employeeID,
				orderByComparator);

		if (sapEmployee != null) {
			return sapEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("employeeID=");
		msg.append(employeeID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSapEmployeeException(msg.toString());
	}

	/**
	 * Returns the last sap employee in the ordered set where employeeID = &#63;.
	 *
	 * @param employeeID the employee i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sap employee, or <code>null</code> if a matching sap employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SapEmployee fetchByEmployeeId_Last(long employeeID,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByEmployeeId(employeeID);

		if (count == 0) {
			return null;
		}

		List<SapEmployee> list = findByEmployeeId(employeeID, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sap employees before and after the current sap employee in the ordered set where employeeID = &#63;.
	 *
	 * @param sapEmployeeId the primary key of the current sap employee
	 * @param employeeID the employee i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sap employee
	 * @throws es.davinciti.liferay.NoSuchSapEmployeeException if a sap employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SapEmployee[] findByEmployeeId_PrevAndNext(long sapEmployeeId,
		long employeeID, OrderByComparator orderByComparator)
		throws NoSuchSapEmployeeException, SystemException {
		SapEmployee sapEmployee = findByPrimaryKey(sapEmployeeId);

		Session session = null;

		try {
			session = openSession();

			SapEmployee[] array = new SapEmployeeImpl[3];

			array[0] = getByEmployeeId_PrevAndNext(session, sapEmployee,
					employeeID, orderByComparator, true);

			array[1] = sapEmployee;

			array[2] = getByEmployeeId_PrevAndNext(session, sapEmployee,
					employeeID, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SapEmployee getByEmployeeId_PrevAndNext(Session session,
		SapEmployee sapEmployee, long employeeID,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SAPEMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_2);

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
			query.append(SapEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(employeeID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(sapEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SapEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sap employees where employeeID = &#63; from the database.
	 *
	 * @param employeeID the employee i d
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByEmployeeId(long employeeID) throws SystemException {
		for (SapEmployee sapEmployee : findByEmployeeId(employeeID,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(sapEmployee);
		}
	}

	/**
	 * Returns the number of sap employees where employeeID = &#63;.
	 *
	 * @param employeeID the employee i d
	 * @return the number of matching sap employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByEmployeeId(long employeeID) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMPLOYEEID;

		Object[] finderArgs = new Object[] { employeeID };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SAPEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(employeeID);

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

	private static final String _FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_2 = "sapEmployee.employeeID = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SapEmployeeModelImpl.FINDER_CACHE_ENABLED, SapEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SapEmployeeModelImpl.FINDER_CACHE_ENABLED, SapEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			SapEmployeeModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SapEmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the sap employees where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching sap employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SapEmployee> findByUserId(long userId)
		throws SystemException {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sap employees where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SapEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of sap employees
	 * @param end the upper bound of the range of sap employees (not inclusive)
	 * @return the range of matching sap employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SapEmployee> findByUserId(long userId, int start, int end)
		throws SystemException {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sap employees where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SapEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of sap employees
	 * @param end the upper bound of the range of sap employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sap employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SapEmployee> findByUserId(long userId, int start, int end,
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

		List<SapEmployee> list = (List<SapEmployee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SapEmployee sapEmployee : list) {
				if ((userId != sapEmployee.getUserId())) {
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

			query.append(_SQL_SELECT_SAPEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SapEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<SapEmployee>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SapEmployee>(list);
				}
				else {
					list = (List<SapEmployee>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first sap employee in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sap employee
	 * @throws es.davinciti.liferay.NoSuchSapEmployeeException if a matching sap employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SapEmployee findByUserId_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchSapEmployeeException, SystemException {
		SapEmployee sapEmployee = fetchByUserId_First(userId, orderByComparator);

		if (sapEmployee != null) {
			return sapEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSapEmployeeException(msg.toString());
	}

	/**
	 * Returns the first sap employee in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sap employee, or <code>null</code> if a matching sap employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SapEmployee fetchByUserId_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<SapEmployee> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sap employee in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sap employee
	 * @throws es.davinciti.liferay.NoSuchSapEmployeeException if a matching sap employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SapEmployee findByUserId_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchSapEmployeeException, SystemException {
		SapEmployee sapEmployee = fetchByUserId_Last(userId, orderByComparator);

		if (sapEmployee != null) {
			return sapEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSapEmployeeException(msg.toString());
	}

	/**
	 * Returns the last sap employee in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sap employee, or <code>null</code> if a matching sap employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SapEmployee fetchByUserId_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<SapEmployee> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sap employees before and after the current sap employee in the ordered set where userId = &#63;.
	 *
	 * @param sapEmployeeId the primary key of the current sap employee
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sap employee
	 * @throws es.davinciti.liferay.NoSuchSapEmployeeException if a sap employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SapEmployee[] findByUserId_PrevAndNext(long sapEmployeeId,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchSapEmployeeException, SystemException {
		SapEmployee sapEmployee = findByPrimaryKey(sapEmployeeId);

		Session session = null;

		try {
			session = openSession();

			SapEmployee[] array = new SapEmployeeImpl[3];

			array[0] = getByUserId_PrevAndNext(session, sapEmployee, userId,
					orderByComparator, true);

			array[1] = sapEmployee;

			array[2] = getByUserId_PrevAndNext(session, sapEmployee, userId,
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

	protected SapEmployee getByUserId_PrevAndNext(Session session,
		SapEmployee sapEmployee, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SAPEMPLOYEE_WHERE);

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
			query.append(SapEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(sapEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SapEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sap employees where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUserId(long userId) throws SystemException {
		for (SapEmployee sapEmployee : findByUserId(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(sapEmployee);
		}
	}

	/**
	 * Returns the number of sap employees where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching sap employees
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

			query.append(_SQL_COUNT_SAPEMPLOYEE_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "sapEmployee.userId = ?";

	public SapEmployeePersistenceImpl() {
		setModelClass(SapEmployee.class);
	}

	/**
	 * Caches the sap employee in the entity cache if it is enabled.
	 *
	 * @param sapEmployee the sap employee
	 */
	@Override
	public void cacheResult(SapEmployee sapEmployee) {
		EntityCacheUtil.putResult(SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SapEmployeeImpl.class, sapEmployee.getPrimaryKey(), sapEmployee);

		sapEmployee.resetOriginalValues();
	}

	/**
	 * Caches the sap employees in the entity cache if it is enabled.
	 *
	 * @param sapEmployees the sap employees
	 */
	@Override
	public void cacheResult(List<SapEmployee> sapEmployees) {
		for (SapEmployee sapEmployee : sapEmployees) {
			if (EntityCacheUtil.getResult(
						SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
						SapEmployeeImpl.class, sapEmployee.getPrimaryKey()) == null) {
				cacheResult(sapEmployee);
			}
			else {
				sapEmployee.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all sap employees.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SapEmployeeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SapEmployeeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sap employee.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SapEmployee sapEmployee) {
		EntityCacheUtil.removeResult(SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SapEmployeeImpl.class, sapEmployee.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SapEmployee> sapEmployees) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SapEmployee sapEmployee : sapEmployees) {
			EntityCacheUtil.removeResult(SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
				SapEmployeeImpl.class, sapEmployee.getPrimaryKey());
		}
	}

	/**
	 * Creates a new sap employee with the primary key. Does not add the sap employee to the database.
	 *
	 * @param sapEmployeeId the primary key for the new sap employee
	 * @return the new sap employee
	 */
	@Override
	public SapEmployee create(long sapEmployeeId) {
		SapEmployee sapEmployee = new SapEmployeeImpl();

		sapEmployee.setNew(true);
		sapEmployee.setPrimaryKey(sapEmployeeId);

		return sapEmployee;
	}

	/**
	 * Removes the sap employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sapEmployeeId the primary key of the sap employee
	 * @return the sap employee that was removed
	 * @throws es.davinciti.liferay.NoSuchSapEmployeeException if a sap employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SapEmployee remove(long sapEmployeeId)
		throws NoSuchSapEmployeeException, SystemException {
		return remove((Serializable)sapEmployeeId);
	}

	/**
	 * Removes the sap employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sap employee
	 * @return the sap employee that was removed
	 * @throws es.davinciti.liferay.NoSuchSapEmployeeException if a sap employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SapEmployee remove(Serializable primaryKey)
		throws NoSuchSapEmployeeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SapEmployee sapEmployee = (SapEmployee)session.get(SapEmployeeImpl.class,
					primaryKey);

			if (sapEmployee == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSapEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(sapEmployee);
		}
		catch (NoSuchSapEmployeeException nsee) {
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
	protected SapEmployee removeImpl(SapEmployee sapEmployee)
		throws SystemException {
		sapEmployee = toUnwrappedModel(sapEmployee);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sapEmployee)) {
				sapEmployee = (SapEmployee)session.get(SapEmployeeImpl.class,
						sapEmployee.getPrimaryKeyObj());
			}

			if (sapEmployee != null) {
				session.delete(sapEmployee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (sapEmployee != null) {
			clearCache(sapEmployee);
		}

		return sapEmployee;
	}

	@Override
	public SapEmployee updateImpl(
		es.davinciti.liferay.model.SapEmployee sapEmployee)
		throws SystemException {
		sapEmployee = toUnwrappedModel(sapEmployee);

		boolean isNew = sapEmployee.isNew();

		SapEmployeeModelImpl sapEmployeeModelImpl = (SapEmployeeModelImpl)sapEmployee;

		Session session = null;

		try {
			session = openSession();

			if (sapEmployee.isNew()) {
				session.save(sapEmployee);

				sapEmployee.setNew(false);
			}
			else {
				session.merge(sapEmployee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SapEmployeeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((sapEmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						sapEmployeeModelImpl.getOriginalEmployeeID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID,
					args);

				args = new Object[] { sapEmployeeModelImpl.getEmployeeID() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID,
					args);
			}

			if ((sapEmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						sapEmployeeModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { sapEmployeeModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		EntityCacheUtil.putResult(SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SapEmployeeImpl.class, sapEmployee.getPrimaryKey(), sapEmployee);

		return sapEmployee;
	}

	protected SapEmployee toUnwrappedModel(SapEmployee sapEmployee) {
		if (sapEmployee instanceof SapEmployeeImpl) {
			return sapEmployee;
		}

		SapEmployeeImpl sapEmployeeImpl = new SapEmployeeImpl();

		sapEmployeeImpl.setNew(sapEmployee.isNew());
		sapEmployeeImpl.setPrimaryKey(sapEmployee.getPrimaryKey());

		sapEmployeeImpl.setSapEmployeeId(sapEmployee.getSapEmployeeId());
		sapEmployeeImpl.setEmployeeID(sapEmployee.getEmployeeID());
		sapEmployeeImpl.setUserId(sapEmployee.getUserId());
		sapEmployeeImpl.setMiddleName(sapEmployee.getMiddleName());
		sapEmployeeImpl.setGender(sapEmployee.getGender());
		sapEmployeeImpl.setJobTitle(sapEmployee.getJobTitle());
		sapEmployeeImpl.setEmployeeType(sapEmployee.getEmployeeType());

		return sapEmployeeImpl;
	}

	/**
	 * Returns the sap employee with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the sap employee
	 * @return the sap employee
	 * @throws es.davinciti.liferay.NoSuchSapEmployeeException if a sap employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SapEmployee findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSapEmployeeException, SystemException {
		SapEmployee sapEmployee = fetchByPrimaryKey(primaryKey);

		if (sapEmployee == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSapEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return sapEmployee;
	}

	/**
	 * Returns the sap employee with the primary key or throws a {@link es.davinciti.liferay.NoSuchSapEmployeeException} if it could not be found.
	 *
	 * @param sapEmployeeId the primary key of the sap employee
	 * @return the sap employee
	 * @throws es.davinciti.liferay.NoSuchSapEmployeeException if a sap employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SapEmployee findByPrimaryKey(long sapEmployeeId)
		throws NoSuchSapEmployeeException, SystemException {
		return findByPrimaryKey((Serializable)sapEmployeeId);
	}

	/**
	 * Returns the sap employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sap employee
	 * @return the sap employee, or <code>null</code> if a sap employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SapEmployee fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		SapEmployee sapEmployee = (SapEmployee)EntityCacheUtil.getResult(SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
				SapEmployeeImpl.class, primaryKey);

		if (sapEmployee == _nullSapEmployee) {
			return null;
		}

		if (sapEmployee == null) {
			Session session = null;

			try {
				session = openSession();

				sapEmployee = (SapEmployee)session.get(SapEmployeeImpl.class,
						primaryKey);

				if (sapEmployee != null) {
					cacheResult(sapEmployee);
				}
				else {
					EntityCacheUtil.putResult(SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
						SapEmployeeImpl.class, primaryKey, _nullSapEmployee);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SapEmployeeModelImpl.ENTITY_CACHE_ENABLED,
					SapEmployeeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return sapEmployee;
	}

	/**
	 * Returns the sap employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sapEmployeeId the primary key of the sap employee
	 * @return the sap employee, or <code>null</code> if a sap employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SapEmployee fetchByPrimaryKey(long sapEmployeeId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)sapEmployeeId);
	}

	/**
	 * Returns all the sap employees.
	 *
	 * @return the sap employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SapEmployee> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sap employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SapEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sap employees
	 * @param end the upper bound of the range of sap employees (not inclusive)
	 * @return the range of sap employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SapEmployee> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sap employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SapEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sap employees
	 * @param end the upper bound of the range of sap employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sap employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SapEmployee> findAll(int start, int end,
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

		List<SapEmployee> list = (List<SapEmployee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SAPEMPLOYEE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SAPEMPLOYEE;

				if (pagination) {
					sql = sql.concat(SapEmployeeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SapEmployee>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SapEmployee>(list);
				}
				else {
					list = (List<SapEmployee>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the sap employees from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SapEmployee sapEmployee : findAll()) {
			remove(sapEmployee);
		}
	}

	/**
	 * Returns the number of sap employees.
	 *
	 * @return the number of sap employees
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

				Query q = session.createQuery(_SQL_COUNT_SAPEMPLOYEE);

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
	 * Initializes the sap employee persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.SapEmployee")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SapEmployee>> listenersList = new ArrayList<ModelListener<SapEmployee>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SapEmployee>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SapEmployeeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SAPEMPLOYEE = "SELECT sapEmployee FROM SapEmployee sapEmployee";
	private static final String _SQL_SELECT_SAPEMPLOYEE_WHERE = "SELECT sapEmployee FROM SapEmployee sapEmployee WHERE ";
	private static final String _SQL_COUNT_SAPEMPLOYEE = "SELECT COUNT(sapEmployee) FROM SapEmployee sapEmployee";
	private static final String _SQL_COUNT_SAPEMPLOYEE_WHERE = "SELECT COUNT(sapEmployee) FROM SapEmployee sapEmployee WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "sapEmployee.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SapEmployee exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SapEmployee exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SapEmployeePersistenceImpl.class);
	private static SapEmployee _nullSapEmployee = new SapEmployeeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SapEmployee> toCacheModel() {
				return _nullSapEmployeeCacheModel;
			}
		};

	private static CacheModel<SapEmployee> _nullSapEmployeeCacheModel = new CacheModel<SapEmployee>() {
			@Override
			public SapEmployee toEntityModel() {
				return _nullSapEmployee;
			}
		};
}