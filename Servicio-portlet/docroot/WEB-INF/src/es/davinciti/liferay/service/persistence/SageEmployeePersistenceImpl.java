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

import es.davinciti.liferay.NoSuchSageEmployeeException;
import es.davinciti.liferay.model.SageEmployee;
import es.davinciti.liferay.model.impl.SageEmployeeImpl;
import es.davinciti.liferay.model.impl.SageEmployeeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the sage employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see SageEmployeePersistence
 * @see SageEmployeeUtil
 * @generated
 */
public class SageEmployeePersistenceImpl extends BasePersistenceImpl<SageEmployee>
	implements SageEmployeePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SageEmployeeUtil} to access the sage employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SageEmployeeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SageEmployeeModelImpl.FINDER_CACHE_ENABLED, SageEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SageEmployeeModelImpl.FINDER_CACHE_ENABLED, SageEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SageEmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPLOYEEID =
		new FinderPath(SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SageEmployeeModelImpl.FINDER_CACHE_ENABLED, SageEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEmployeeId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID =
		new FinderPath(SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SageEmployeeModelImpl.FINDER_CACHE_ENABLED, SageEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEmployeeId",
			new String[] { String.class.getName() },
			SageEmployeeModelImpl.EMPLOYEEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMPLOYEEID = new FinderPath(SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SageEmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEmployeeId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the sage employees where employeeID = &#63;.
	 *
	 * @param employeeID the employee i d
	 * @return the matching sage employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SageEmployee> findByEmployeeId(String employeeID)
		throws SystemException {
		return findByEmployeeId(employeeID, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sage employees where employeeID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SageEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param employeeID the employee i d
	 * @param start the lower bound of the range of sage employees
	 * @param end the upper bound of the range of sage employees (not inclusive)
	 * @return the range of matching sage employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SageEmployee> findByEmployeeId(String employeeID, int start,
		int end) throws SystemException {
		return findByEmployeeId(employeeID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sage employees where employeeID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SageEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param employeeID the employee i d
	 * @param start the lower bound of the range of sage employees
	 * @param end the upper bound of the range of sage employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sage employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SageEmployee> findByEmployeeId(String employeeID, int start,
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

		List<SageEmployee> list = (List<SageEmployee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SageEmployee sageEmployee : list) {
				if (!Validator.equals(employeeID, sageEmployee.getEmployeeID())) {
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

			query.append(_SQL_SELECT_SAGEEMPLOYEE_WHERE);

			boolean bindEmployeeID = false;

			if (employeeID == null) {
				query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_1);
			}
			else if (employeeID.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_3);
			}
			else {
				bindEmployeeID = true;

				query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SageEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmployeeID) {
					qPos.add(employeeID);
				}

				if (!pagination) {
					list = (List<SageEmployee>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SageEmployee>(list);
				}
				else {
					list = (List<SageEmployee>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first sage employee in the ordered set where employeeID = &#63;.
	 *
	 * @param employeeID the employee i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sage employee
	 * @throws es.davinciti.liferay.NoSuchSageEmployeeException if a matching sage employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SageEmployee findByEmployeeId_First(String employeeID,
		OrderByComparator orderByComparator)
		throws NoSuchSageEmployeeException, SystemException {
		SageEmployee sageEmployee = fetchByEmployeeId_First(employeeID,
				orderByComparator);

		if (sageEmployee != null) {
			return sageEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("employeeID=");
		msg.append(employeeID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSageEmployeeException(msg.toString());
	}

	/**
	 * Returns the first sage employee in the ordered set where employeeID = &#63;.
	 *
	 * @param employeeID the employee i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sage employee, or <code>null</code> if a matching sage employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SageEmployee fetchByEmployeeId_First(String employeeID,
		OrderByComparator orderByComparator) throws SystemException {
		List<SageEmployee> list = findByEmployeeId(employeeID, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sage employee in the ordered set where employeeID = &#63;.
	 *
	 * @param employeeID the employee i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sage employee
	 * @throws es.davinciti.liferay.NoSuchSageEmployeeException if a matching sage employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SageEmployee findByEmployeeId_Last(String employeeID,
		OrderByComparator orderByComparator)
		throws NoSuchSageEmployeeException, SystemException {
		SageEmployee sageEmployee = fetchByEmployeeId_Last(employeeID,
				orderByComparator);

		if (sageEmployee != null) {
			return sageEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("employeeID=");
		msg.append(employeeID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSageEmployeeException(msg.toString());
	}

	/**
	 * Returns the last sage employee in the ordered set where employeeID = &#63;.
	 *
	 * @param employeeID the employee i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sage employee, or <code>null</code> if a matching sage employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SageEmployee fetchByEmployeeId_Last(String employeeID,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByEmployeeId(employeeID);

		if (count == 0) {
			return null;
		}

		List<SageEmployee> list = findByEmployeeId(employeeID, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sage employees before and after the current sage employee in the ordered set where employeeID = &#63;.
	 *
	 * @param sageEmployeeId the primary key of the current sage employee
	 * @param employeeID the employee i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sage employee
	 * @throws es.davinciti.liferay.NoSuchSageEmployeeException if a sage employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SageEmployee[] findByEmployeeId_PrevAndNext(long sageEmployeeId,
		String employeeID, OrderByComparator orderByComparator)
		throws NoSuchSageEmployeeException, SystemException {
		SageEmployee sageEmployee = findByPrimaryKey(sageEmployeeId);

		Session session = null;

		try {
			session = openSession();

			SageEmployee[] array = new SageEmployeeImpl[3];

			array[0] = getByEmployeeId_PrevAndNext(session, sageEmployee,
					employeeID, orderByComparator, true);

			array[1] = sageEmployee;

			array[2] = getByEmployeeId_PrevAndNext(session, sageEmployee,
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

	protected SageEmployee getByEmployeeId_PrevAndNext(Session session,
		SageEmployee sageEmployee, String employeeID,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SAGEEMPLOYEE_WHERE);

		boolean bindEmployeeID = false;

		if (employeeID == null) {
			query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_1);
		}
		else if (employeeID.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_3);
		}
		else {
			bindEmployeeID = true;

			query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_2);
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
			query.append(SageEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindEmployeeID) {
			qPos.add(employeeID);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(sageEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SageEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sage employees where employeeID = &#63; from the database.
	 *
	 * @param employeeID the employee i d
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByEmployeeId(String employeeID) throws SystemException {
		for (SageEmployee sageEmployee : findByEmployeeId(employeeID,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(sageEmployee);
		}
	}

	/**
	 * Returns the number of sage employees where employeeID = &#63;.
	 *
	 * @param employeeID the employee i d
	 * @return the number of matching sage employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByEmployeeId(String employeeID) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMPLOYEEID;

		Object[] finderArgs = new Object[] { employeeID };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SAGEEMPLOYEE_WHERE);

			boolean bindEmployeeID = false;

			if (employeeID == null) {
				query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_1);
			}
			else if (employeeID.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_3);
			}
			else {
				bindEmployeeID = true;

				query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmployeeID) {
					qPos.add(employeeID);
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

	private static final String _FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_1 = "sageEmployee.employeeID IS NULL";
	private static final String _FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_2 = "sageEmployee.employeeID = ?";
	private static final String _FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_3 = "(sageEmployee.employeeID IS NULL OR sageEmployee.employeeID = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SageEmployeeModelImpl.FINDER_CACHE_ENABLED, SageEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SageEmployeeModelImpl.FINDER_CACHE_ENABLED, SageEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			SageEmployeeModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SageEmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the sage employees where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching sage employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SageEmployee> findByUserId(long userId)
		throws SystemException {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sage employees where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SageEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of sage employees
	 * @param end the upper bound of the range of sage employees (not inclusive)
	 * @return the range of matching sage employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SageEmployee> findByUserId(long userId, int start, int end)
		throws SystemException {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sage employees where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SageEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of sage employees
	 * @param end the upper bound of the range of sage employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sage employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SageEmployee> findByUserId(long userId, int start, int end,
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

		List<SageEmployee> list = (List<SageEmployee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SageEmployee sageEmployee : list) {
				if ((userId != sageEmployee.getUserId())) {
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

			query.append(_SQL_SELECT_SAGEEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SageEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<SageEmployee>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SageEmployee>(list);
				}
				else {
					list = (List<SageEmployee>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first sage employee in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sage employee
	 * @throws es.davinciti.liferay.NoSuchSageEmployeeException if a matching sage employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SageEmployee findByUserId_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchSageEmployeeException, SystemException {
		SageEmployee sageEmployee = fetchByUserId_First(userId,
				orderByComparator);

		if (sageEmployee != null) {
			return sageEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSageEmployeeException(msg.toString());
	}

	/**
	 * Returns the first sage employee in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sage employee, or <code>null</code> if a matching sage employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SageEmployee fetchByUserId_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<SageEmployee> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sage employee in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sage employee
	 * @throws es.davinciti.liferay.NoSuchSageEmployeeException if a matching sage employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SageEmployee findByUserId_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchSageEmployeeException, SystemException {
		SageEmployee sageEmployee = fetchByUserId_Last(userId, orderByComparator);

		if (sageEmployee != null) {
			return sageEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSageEmployeeException(msg.toString());
	}

	/**
	 * Returns the last sage employee in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sage employee, or <code>null</code> if a matching sage employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SageEmployee fetchByUserId_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<SageEmployee> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sage employees before and after the current sage employee in the ordered set where userId = &#63;.
	 *
	 * @param sageEmployeeId the primary key of the current sage employee
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sage employee
	 * @throws es.davinciti.liferay.NoSuchSageEmployeeException if a sage employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SageEmployee[] findByUserId_PrevAndNext(long sageEmployeeId,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchSageEmployeeException, SystemException {
		SageEmployee sageEmployee = findByPrimaryKey(sageEmployeeId);

		Session session = null;

		try {
			session = openSession();

			SageEmployee[] array = new SageEmployeeImpl[3];

			array[0] = getByUserId_PrevAndNext(session, sageEmployee, userId,
					orderByComparator, true);

			array[1] = sageEmployee;

			array[2] = getByUserId_PrevAndNext(session, sageEmployee, userId,
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

	protected SageEmployee getByUserId_PrevAndNext(Session session,
		SageEmployee sageEmployee, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SAGEEMPLOYEE_WHERE);

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
			query.append(SageEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(sageEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SageEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sage employees where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUserId(long userId) throws SystemException {
		for (SageEmployee sageEmployee : findByUserId(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(sageEmployee);
		}
	}

	/**
	 * Returns the number of sage employees where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching sage employees
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

			query.append(_SQL_COUNT_SAGEEMPLOYEE_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "sageEmployee.userId = ?";

	public SageEmployeePersistenceImpl() {
		setModelClass(SageEmployee.class);
	}

	/**
	 * Caches the sage employee in the entity cache if it is enabled.
	 *
	 * @param sageEmployee the sage employee
	 */
	@Override
	public void cacheResult(SageEmployee sageEmployee) {
		EntityCacheUtil.putResult(SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SageEmployeeImpl.class, sageEmployee.getPrimaryKey(), sageEmployee);

		sageEmployee.resetOriginalValues();
	}

	/**
	 * Caches the sage employees in the entity cache if it is enabled.
	 *
	 * @param sageEmployees the sage employees
	 */
	@Override
	public void cacheResult(List<SageEmployee> sageEmployees) {
		for (SageEmployee sageEmployee : sageEmployees) {
			if (EntityCacheUtil.getResult(
						SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
						SageEmployeeImpl.class, sageEmployee.getPrimaryKey()) == null) {
				cacheResult(sageEmployee);
			}
			else {
				sageEmployee.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all sage employees.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SageEmployeeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SageEmployeeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sage employee.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SageEmployee sageEmployee) {
		EntityCacheUtil.removeResult(SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SageEmployeeImpl.class, sageEmployee.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SageEmployee> sageEmployees) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SageEmployee sageEmployee : sageEmployees) {
			EntityCacheUtil.removeResult(SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
				SageEmployeeImpl.class, sageEmployee.getPrimaryKey());
		}
	}

	/**
	 * Creates a new sage employee with the primary key. Does not add the sage employee to the database.
	 *
	 * @param sageEmployeeId the primary key for the new sage employee
	 * @return the new sage employee
	 */
	@Override
	public SageEmployee create(long sageEmployeeId) {
		SageEmployee sageEmployee = new SageEmployeeImpl();

		sageEmployee.setNew(true);
		sageEmployee.setPrimaryKey(sageEmployeeId);

		return sageEmployee;
	}

	/**
	 * Removes the sage employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sageEmployeeId the primary key of the sage employee
	 * @return the sage employee that was removed
	 * @throws es.davinciti.liferay.NoSuchSageEmployeeException if a sage employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SageEmployee remove(long sageEmployeeId)
		throws NoSuchSageEmployeeException, SystemException {
		return remove((Serializable)sageEmployeeId);
	}

	/**
	 * Removes the sage employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sage employee
	 * @return the sage employee that was removed
	 * @throws es.davinciti.liferay.NoSuchSageEmployeeException if a sage employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SageEmployee remove(Serializable primaryKey)
		throws NoSuchSageEmployeeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SageEmployee sageEmployee = (SageEmployee)session.get(SageEmployeeImpl.class,
					primaryKey);

			if (sageEmployee == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSageEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(sageEmployee);
		}
		catch (NoSuchSageEmployeeException nsee) {
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
	protected SageEmployee removeImpl(SageEmployee sageEmployee)
		throws SystemException {
		sageEmployee = toUnwrappedModel(sageEmployee);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sageEmployee)) {
				sageEmployee = (SageEmployee)session.get(SageEmployeeImpl.class,
						sageEmployee.getPrimaryKeyObj());
			}

			if (sageEmployee != null) {
				session.delete(sageEmployee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (sageEmployee != null) {
			clearCache(sageEmployee);
		}

		return sageEmployee;
	}

	@Override
	public SageEmployee updateImpl(
		es.davinciti.liferay.model.SageEmployee sageEmployee)
		throws SystemException {
		sageEmployee = toUnwrappedModel(sageEmployee);

		boolean isNew = sageEmployee.isNew();

		SageEmployeeModelImpl sageEmployeeModelImpl = (SageEmployeeModelImpl)sageEmployee;

		Session session = null;

		try {
			session = openSession();

			if (sageEmployee.isNew()) {
				session.save(sageEmployee);

				sageEmployee.setNew(false);
			}
			else {
				session.merge(sageEmployee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SageEmployeeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((sageEmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						sageEmployeeModelImpl.getOriginalEmployeeID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID,
					args);

				args = new Object[] { sageEmployeeModelImpl.getEmployeeID() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID,
					args);
			}

			if ((sageEmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						sageEmployeeModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { sageEmployeeModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		EntityCacheUtil.putResult(SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			SageEmployeeImpl.class, sageEmployee.getPrimaryKey(), sageEmployee);

		return sageEmployee;
	}

	protected SageEmployee toUnwrappedModel(SageEmployee sageEmployee) {
		if (sageEmployee instanceof SageEmployeeImpl) {
			return sageEmployee;
		}

		SageEmployeeImpl sageEmployeeImpl = new SageEmployeeImpl();

		sageEmployeeImpl.setNew(sageEmployee.isNew());
		sageEmployeeImpl.setPrimaryKey(sageEmployee.getPrimaryKey());

		sageEmployeeImpl.setSageEmployeeId(sageEmployee.getSageEmployeeId());
		sageEmployeeImpl.setUserId(sageEmployee.getUserId());
		sageEmployeeImpl.setEmployeeID(sageEmployee.getEmployeeID());
		sageEmployeeImpl.setApplicationId(sageEmployee.getApplicationId());
		sageEmployeeImpl.setCompanyId(sageEmployee.getCompanyId());
		sageEmployeeImpl.setPersonId(sageEmployee.getPersonId());
		sageEmployeeImpl.setStartDate(sageEmployee.getStartDate());
		sageEmployeeImpl.setEndDate(sageEmployee.getEndDate());
		sageEmployeeImpl.setSeniority(sageEmployee.getSeniority());

		return sageEmployeeImpl;
	}

	/**
	 * Returns the sage employee with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the sage employee
	 * @return the sage employee
	 * @throws es.davinciti.liferay.NoSuchSageEmployeeException if a sage employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SageEmployee findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSageEmployeeException, SystemException {
		SageEmployee sageEmployee = fetchByPrimaryKey(primaryKey);

		if (sageEmployee == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSageEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return sageEmployee;
	}

	/**
	 * Returns the sage employee with the primary key or throws a {@link es.davinciti.liferay.NoSuchSageEmployeeException} if it could not be found.
	 *
	 * @param sageEmployeeId the primary key of the sage employee
	 * @return the sage employee
	 * @throws es.davinciti.liferay.NoSuchSageEmployeeException if a sage employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SageEmployee findByPrimaryKey(long sageEmployeeId)
		throws NoSuchSageEmployeeException, SystemException {
		return findByPrimaryKey((Serializable)sageEmployeeId);
	}

	/**
	 * Returns the sage employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sage employee
	 * @return the sage employee, or <code>null</code> if a sage employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SageEmployee fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		SageEmployee sageEmployee = (SageEmployee)EntityCacheUtil.getResult(SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
				SageEmployeeImpl.class, primaryKey);

		if (sageEmployee == _nullSageEmployee) {
			return null;
		}

		if (sageEmployee == null) {
			Session session = null;

			try {
				session = openSession();

				sageEmployee = (SageEmployee)session.get(SageEmployeeImpl.class,
						primaryKey);

				if (sageEmployee != null) {
					cacheResult(sageEmployee);
				}
				else {
					EntityCacheUtil.putResult(SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
						SageEmployeeImpl.class, primaryKey, _nullSageEmployee);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SageEmployeeModelImpl.ENTITY_CACHE_ENABLED,
					SageEmployeeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return sageEmployee;
	}

	/**
	 * Returns the sage employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sageEmployeeId the primary key of the sage employee
	 * @return the sage employee, or <code>null</code> if a sage employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SageEmployee fetchByPrimaryKey(long sageEmployeeId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)sageEmployeeId);
	}

	/**
	 * Returns all the sage employees.
	 *
	 * @return the sage employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SageEmployee> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sage employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SageEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sage employees
	 * @param end the upper bound of the range of sage employees (not inclusive)
	 * @return the range of sage employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SageEmployee> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sage employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.SageEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sage employees
	 * @param end the upper bound of the range of sage employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sage employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SageEmployee> findAll(int start, int end,
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

		List<SageEmployee> list = (List<SageEmployee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SAGEEMPLOYEE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SAGEEMPLOYEE;

				if (pagination) {
					sql = sql.concat(SageEmployeeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SageEmployee>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SageEmployee>(list);
				}
				else {
					list = (List<SageEmployee>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the sage employees from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SageEmployee sageEmployee : findAll()) {
			remove(sageEmployee);
		}
	}

	/**
	 * Returns the number of sage employees.
	 *
	 * @return the number of sage employees
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

				Query q = session.createQuery(_SQL_COUNT_SAGEEMPLOYEE);

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
	 * Initializes the sage employee persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.SageEmployee")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SageEmployee>> listenersList = new ArrayList<ModelListener<SageEmployee>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SageEmployee>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SageEmployeeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SAGEEMPLOYEE = "SELECT sageEmployee FROM SageEmployee sageEmployee";
	private static final String _SQL_SELECT_SAGEEMPLOYEE_WHERE = "SELECT sageEmployee FROM SageEmployee sageEmployee WHERE ";
	private static final String _SQL_COUNT_SAGEEMPLOYEE = "SELECT COUNT(sageEmployee) FROM SageEmployee sageEmployee";
	private static final String _SQL_COUNT_SAGEEMPLOYEE_WHERE = "SELECT COUNT(sageEmployee) FROM SageEmployee sageEmployee WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "sageEmployee.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SageEmployee exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SageEmployee exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SageEmployeePersistenceImpl.class);
	private static SageEmployee _nullSageEmployee = new SageEmployeeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SageEmployee> toCacheModel() {
				return _nullSageEmployeeCacheModel;
			}
		};

	private static CacheModel<SageEmployee> _nullSageEmployeeCacheModel = new CacheModel<SageEmployee>() {
			@Override
			public SageEmployee toEntityModel() {
				return _nullSageEmployee;
			}
		};
}