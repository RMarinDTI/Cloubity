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

import es.davinciti.liferay.NoSuchApplicationStatusException;
import es.davinciti.liferay.model.ApplicationStatus;
import es.davinciti.liferay.model.impl.ApplicationStatusImpl;
import es.davinciti.liferay.model.impl.ApplicationStatusModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the application status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see ApplicationStatusPersistence
 * @see ApplicationStatusUtil
 * @generated
 */
public class ApplicationStatusPersistenceImpl extends BasePersistenceImpl<ApplicationStatus>
	implements ApplicationStatusPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ApplicationStatusUtil} to access the application status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ApplicationStatusImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ApplicationStatusModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationStatusModelImpl.FINDER_CACHE_ENABLED,
			ApplicationStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ApplicationStatusModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationStatusModelImpl.FINDER_CACHE_ENABLED,
			ApplicationStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ApplicationStatusModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICATIONNAMESTATUSID =
		new FinderPath(ApplicationStatusModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationStatusModelImpl.FINDER_CACHE_ENABLED,
			ApplicationStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByApplicationNameStatusId",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICATIONNAMESTATUSID =
		new FinderPath(ApplicationStatusModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationStatusModelImpl.FINDER_CACHE_ENABLED,
			ApplicationStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByApplicationNameStatusId",
			new String[] { String.class.getName(), String.class.getName() },
			ApplicationStatusModelImpl.APPLICATIONNAME_COLUMN_BITMASK |
			ApplicationStatusModelImpl.STATUSID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICATIONNAMESTATUSID = new FinderPath(ApplicationStatusModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByApplicationNameStatusId",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the application statuses where applicationName = &#63; and statusId = &#63;.
	 *
	 * @param applicationName the application name
	 * @param statusId the status ID
	 * @return the matching application statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApplicationStatus> findByApplicationNameStatusId(
		String applicationName, String statusId) throws SystemException {
		return findByApplicationNameStatusId(applicationName, statusId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the application statuses where applicationName = &#63; and statusId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ApplicationStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicationName the application name
	 * @param statusId the status ID
	 * @param start the lower bound of the range of application statuses
	 * @param end the upper bound of the range of application statuses (not inclusive)
	 * @return the range of matching application statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApplicationStatus> findByApplicationNameStatusId(
		String applicationName, String statusId, int start, int end)
		throws SystemException {
		return findByApplicationNameStatusId(applicationName, statusId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the application statuses where applicationName = &#63; and statusId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ApplicationStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicationName the application name
	 * @param statusId the status ID
	 * @param start the lower bound of the range of application statuses
	 * @param end the upper bound of the range of application statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching application statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApplicationStatus> findByApplicationNameStatusId(
		String applicationName, String statusId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICATIONNAMESTATUSID;
			finderArgs = new Object[] { applicationName, statusId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICATIONNAMESTATUSID;
			finderArgs = new Object[] {
					applicationName, statusId,
					
					start, end, orderByComparator
				};
		}

		List<ApplicationStatus> list = (List<ApplicationStatus>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ApplicationStatus applicationStatus : list) {
				if (!Validator.equals(applicationName,
							applicationStatus.getApplicationName()) ||
						!Validator.equals(statusId,
							applicationStatus.getStatusId())) {
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

			query.append(_SQL_SELECT_APPLICATIONSTATUS_WHERE);

			boolean bindApplicationName = false;

			if (applicationName == null) {
				query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_APPLICATIONNAME_1);
			}
			else if (applicationName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_APPLICATIONNAME_3);
			}
			else {
				bindApplicationName = true;

				query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_APPLICATIONNAME_2);
			}

			boolean bindStatusId = false;

			if (statusId == null) {
				query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_STATUSID_1);
			}
			else if (statusId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_STATUSID_3);
			}
			else {
				bindStatusId = true;

				query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_STATUSID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ApplicationStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApplicationName) {
					qPos.add(applicationName);
				}

				if (bindStatusId) {
					qPos.add(statusId);
				}

				if (!pagination) {
					list = (List<ApplicationStatus>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ApplicationStatus>(list);
				}
				else {
					list = (List<ApplicationStatus>)QueryUtil.list(q,
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
	 * Returns the first application status in the ordered set where applicationName = &#63; and statusId = &#63;.
	 *
	 * @param applicationName the application name
	 * @param statusId the status ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching application status
	 * @throws es.davinciti.liferay.NoSuchApplicationStatusException if a matching application status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplicationStatus findByApplicationNameStatusId_First(
		String applicationName, String statusId,
		OrderByComparator orderByComparator)
		throws NoSuchApplicationStatusException, SystemException {
		ApplicationStatus applicationStatus = fetchByApplicationNameStatusId_First(applicationName,
				statusId, orderByComparator);

		if (applicationStatus != null) {
			return applicationStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicationName=");
		msg.append(applicationName);

		msg.append(", statusId=");
		msg.append(statusId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApplicationStatusException(msg.toString());
	}

	/**
	 * Returns the first application status in the ordered set where applicationName = &#63; and statusId = &#63;.
	 *
	 * @param applicationName the application name
	 * @param statusId the status ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching application status, or <code>null</code> if a matching application status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplicationStatus fetchByApplicationNameStatusId_First(
		String applicationName, String statusId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ApplicationStatus> list = findByApplicationNameStatusId(applicationName,
				statusId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last application status in the ordered set where applicationName = &#63; and statusId = &#63;.
	 *
	 * @param applicationName the application name
	 * @param statusId the status ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching application status
	 * @throws es.davinciti.liferay.NoSuchApplicationStatusException if a matching application status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplicationStatus findByApplicationNameStatusId_Last(
		String applicationName, String statusId,
		OrderByComparator orderByComparator)
		throws NoSuchApplicationStatusException, SystemException {
		ApplicationStatus applicationStatus = fetchByApplicationNameStatusId_Last(applicationName,
				statusId, orderByComparator);

		if (applicationStatus != null) {
			return applicationStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicationName=");
		msg.append(applicationName);

		msg.append(", statusId=");
		msg.append(statusId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApplicationStatusException(msg.toString());
	}

	/**
	 * Returns the last application status in the ordered set where applicationName = &#63; and statusId = &#63;.
	 *
	 * @param applicationName the application name
	 * @param statusId the status ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching application status, or <code>null</code> if a matching application status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplicationStatus fetchByApplicationNameStatusId_Last(
		String applicationName, String statusId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByApplicationNameStatusId(applicationName, statusId);

		if (count == 0) {
			return null;
		}

		List<ApplicationStatus> list = findByApplicationNameStatusId(applicationName,
				statusId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the application statuses before and after the current application status in the ordered set where applicationName = &#63; and statusId = &#63;.
	 *
	 * @param applicationStatusId the primary key of the current application status
	 * @param applicationName the application name
	 * @param statusId the status ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next application status
	 * @throws es.davinciti.liferay.NoSuchApplicationStatusException if a application status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplicationStatus[] findByApplicationNameStatusId_PrevAndNext(
		long applicationStatusId, String applicationName, String statusId,
		OrderByComparator orderByComparator)
		throws NoSuchApplicationStatusException, SystemException {
		ApplicationStatus applicationStatus = findByPrimaryKey(applicationStatusId);

		Session session = null;

		try {
			session = openSession();

			ApplicationStatus[] array = new ApplicationStatusImpl[3];

			array[0] = getByApplicationNameStatusId_PrevAndNext(session,
					applicationStatus, applicationName, statusId,
					orderByComparator, true);

			array[1] = applicationStatus;

			array[2] = getByApplicationNameStatusId_PrevAndNext(session,
					applicationStatus, applicationName, statusId,
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

	protected ApplicationStatus getByApplicationNameStatusId_PrevAndNext(
		Session session, ApplicationStatus applicationStatus,
		String applicationName, String statusId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPLICATIONSTATUS_WHERE);

		boolean bindApplicationName = false;

		if (applicationName == null) {
			query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_APPLICATIONNAME_1);
		}
		else if (applicationName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_APPLICATIONNAME_3);
		}
		else {
			bindApplicationName = true;

			query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_APPLICATIONNAME_2);
		}

		boolean bindStatusId = false;

		if (statusId == null) {
			query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_STATUSID_1);
		}
		else if (statusId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_STATUSID_3);
		}
		else {
			bindStatusId = true;

			query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_STATUSID_2);
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
			query.append(ApplicationStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindApplicationName) {
			qPos.add(applicationName);
		}

		if (bindStatusId) {
			qPos.add(statusId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(applicationStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ApplicationStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the application statuses where applicationName = &#63; and statusId = &#63; from the database.
	 *
	 * @param applicationName the application name
	 * @param statusId the status ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByApplicationNameStatusId(String applicationName,
		String statusId) throws SystemException {
		for (ApplicationStatus applicationStatus : findByApplicationNameStatusId(
				applicationName, statusId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(applicationStatus);
		}
	}

	/**
	 * Returns the number of application statuses where applicationName = &#63; and statusId = &#63;.
	 *
	 * @param applicationName the application name
	 * @param statusId the status ID
	 * @return the number of matching application statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByApplicationNameStatusId(String applicationName,
		String statusId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICATIONNAMESTATUSID;

		Object[] finderArgs = new Object[] { applicationName, statusId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_APPLICATIONSTATUS_WHERE);

			boolean bindApplicationName = false;

			if (applicationName == null) {
				query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_APPLICATIONNAME_1);
			}
			else if (applicationName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_APPLICATIONNAME_3);
			}
			else {
				bindApplicationName = true;

				query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_APPLICATIONNAME_2);
			}

			boolean bindStatusId = false;

			if (statusId == null) {
				query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_STATUSID_1);
			}
			else if (statusId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_STATUSID_3);
			}
			else {
				bindStatusId = true;

				query.append(_FINDER_COLUMN_APPLICATIONNAMESTATUSID_STATUSID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApplicationName) {
					qPos.add(applicationName);
				}

				if (bindStatusId) {
					qPos.add(statusId);
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

	private static final String _FINDER_COLUMN_APPLICATIONNAMESTATUSID_APPLICATIONNAME_1 =
		"applicationStatus.applicationName IS NULL AND ";
	private static final String _FINDER_COLUMN_APPLICATIONNAMESTATUSID_APPLICATIONNAME_2 =
		"applicationStatus.applicationName = ? AND ";
	private static final String _FINDER_COLUMN_APPLICATIONNAMESTATUSID_APPLICATIONNAME_3 =
		"(applicationStatus.applicationName IS NULL OR applicationStatus.applicationName = '') AND ";
	private static final String _FINDER_COLUMN_APPLICATIONNAMESTATUSID_STATUSID_1 =
		"applicationStatus.statusId IS NULL";
	private static final String _FINDER_COLUMN_APPLICATIONNAMESTATUSID_STATUSID_2 =
		"applicationStatus.statusId = ?";
	private static final String _FINDER_COLUMN_APPLICATIONNAMESTATUSID_STATUSID_3 =
		"(applicationStatus.statusId IS NULL OR applicationStatus.statusId = '')";

	public ApplicationStatusPersistenceImpl() {
		setModelClass(ApplicationStatus.class);
	}

	/**
	 * Caches the application status in the entity cache if it is enabled.
	 *
	 * @param applicationStatus the application status
	 */
	@Override
	public void cacheResult(ApplicationStatus applicationStatus) {
		EntityCacheUtil.putResult(ApplicationStatusModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationStatusImpl.class, applicationStatus.getPrimaryKey(),
			applicationStatus);

		applicationStatus.resetOriginalValues();
	}

	/**
	 * Caches the application statuses in the entity cache if it is enabled.
	 *
	 * @param applicationStatuses the application statuses
	 */
	@Override
	public void cacheResult(List<ApplicationStatus> applicationStatuses) {
		for (ApplicationStatus applicationStatus : applicationStatuses) {
			if (EntityCacheUtil.getResult(
						ApplicationStatusModelImpl.ENTITY_CACHE_ENABLED,
						ApplicationStatusImpl.class,
						applicationStatus.getPrimaryKey()) == null) {
				cacheResult(applicationStatus);
			}
			else {
				applicationStatus.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all application statuses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ApplicationStatusImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ApplicationStatusImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the application status.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ApplicationStatus applicationStatus) {
		EntityCacheUtil.removeResult(ApplicationStatusModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationStatusImpl.class, applicationStatus.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ApplicationStatus> applicationStatuses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ApplicationStatus applicationStatus : applicationStatuses) {
			EntityCacheUtil.removeResult(ApplicationStatusModelImpl.ENTITY_CACHE_ENABLED,
				ApplicationStatusImpl.class, applicationStatus.getPrimaryKey());
		}
	}

	/**
	 * Creates a new application status with the primary key. Does not add the application status to the database.
	 *
	 * @param applicationStatusId the primary key for the new application status
	 * @return the new application status
	 */
	@Override
	public ApplicationStatus create(long applicationStatusId) {
		ApplicationStatus applicationStatus = new ApplicationStatusImpl();

		applicationStatus.setNew(true);
		applicationStatus.setPrimaryKey(applicationStatusId);

		return applicationStatus;
	}

	/**
	 * Removes the application status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param applicationStatusId the primary key of the application status
	 * @return the application status that was removed
	 * @throws es.davinciti.liferay.NoSuchApplicationStatusException if a application status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplicationStatus remove(long applicationStatusId)
		throws NoSuchApplicationStatusException, SystemException {
		return remove((Serializable)applicationStatusId);
	}

	/**
	 * Removes the application status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the application status
	 * @return the application status that was removed
	 * @throws es.davinciti.liferay.NoSuchApplicationStatusException if a application status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplicationStatus remove(Serializable primaryKey)
		throws NoSuchApplicationStatusException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ApplicationStatus applicationStatus = (ApplicationStatus)session.get(ApplicationStatusImpl.class,
					primaryKey);

			if (applicationStatus == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchApplicationStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(applicationStatus);
		}
		catch (NoSuchApplicationStatusException nsee) {
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
	protected ApplicationStatus removeImpl(ApplicationStatus applicationStatus)
		throws SystemException {
		applicationStatus = toUnwrappedModel(applicationStatus);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(applicationStatus)) {
				applicationStatus = (ApplicationStatus)session.get(ApplicationStatusImpl.class,
						applicationStatus.getPrimaryKeyObj());
			}

			if (applicationStatus != null) {
				session.delete(applicationStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (applicationStatus != null) {
			clearCache(applicationStatus);
		}

		return applicationStatus;
	}

	@Override
	public ApplicationStatus updateImpl(
		es.davinciti.liferay.model.ApplicationStatus applicationStatus)
		throws SystemException {
		applicationStatus = toUnwrappedModel(applicationStatus);

		boolean isNew = applicationStatus.isNew();

		ApplicationStatusModelImpl applicationStatusModelImpl = (ApplicationStatusModelImpl)applicationStatus;

		Session session = null;

		try {
			session = openSession();

			if (applicationStatus.isNew()) {
				session.save(applicationStatus);

				applicationStatus.setNew(false);
			}
			else {
				session.merge(applicationStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ApplicationStatusModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((applicationStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICATIONNAMESTATUSID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						applicationStatusModelImpl.getOriginalApplicationName(),
						applicationStatusModelImpl.getOriginalStatusId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_APPLICATIONNAMESTATUSID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICATIONNAMESTATUSID,
					args);

				args = new Object[] {
						applicationStatusModelImpl.getApplicationName(),
						applicationStatusModelImpl.getStatusId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_APPLICATIONNAMESTATUSID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICATIONNAMESTATUSID,
					args);
			}
		}

		EntityCacheUtil.putResult(ApplicationStatusModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationStatusImpl.class, applicationStatus.getPrimaryKey(),
			applicationStatus);

		return applicationStatus;
	}

	protected ApplicationStatus toUnwrappedModel(
		ApplicationStatus applicationStatus) {
		if (applicationStatus instanceof ApplicationStatusImpl) {
			return applicationStatus;
		}

		ApplicationStatusImpl applicationStatusImpl = new ApplicationStatusImpl();

		applicationStatusImpl.setNew(applicationStatus.isNew());
		applicationStatusImpl.setPrimaryKey(applicationStatus.getPrimaryKey());

		applicationStatusImpl.setApplicationStatusId(applicationStatus.getApplicationStatusId());
		applicationStatusImpl.setApplicationName(applicationStatus.getApplicationName());
		applicationStatusImpl.setStatusId(applicationStatus.getStatusId());
		applicationStatusImpl.setName(applicationStatus.getName());
		applicationStatusImpl.setDescription(applicationStatus.getDescription());

		return applicationStatusImpl;
	}

	/**
	 * Returns the application status with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the application status
	 * @return the application status
	 * @throws es.davinciti.liferay.NoSuchApplicationStatusException if a application status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplicationStatus findByPrimaryKey(Serializable primaryKey)
		throws NoSuchApplicationStatusException, SystemException {
		ApplicationStatus applicationStatus = fetchByPrimaryKey(primaryKey);

		if (applicationStatus == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchApplicationStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return applicationStatus;
	}

	/**
	 * Returns the application status with the primary key or throws a {@link es.davinciti.liferay.NoSuchApplicationStatusException} if it could not be found.
	 *
	 * @param applicationStatusId the primary key of the application status
	 * @return the application status
	 * @throws es.davinciti.liferay.NoSuchApplicationStatusException if a application status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplicationStatus findByPrimaryKey(long applicationStatusId)
		throws NoSuchApplicationStatusException, SystemException {
		return findByPrimaryKey((Serializable)applicationStatusId);
	}

	/**
	 * Returns the application status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the application status
	 * @return the application status, or <code>null</code> if a application status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplicationStatus fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ApplicationStatus applicationStatus = (ApplicationStatus)EntityCacheUtil.getResult(ApplicationStatusModelImpl.ENTITY_CACHE_ENABLED,
				ApplicationStatusImpl.class, primaryKey);

		if (applicationStatus == _nullApplicationStatus) {
			return null;
		}

		if (applicationStatus == null) {
			Session session = null;

			try {
				session = openSession();

				applicationStatus = (ApplicationStatus)session.get(ApplicationStatusImpl.class,
						primaryKey);

				if (applicationStatus != null) {
					cacheResult(applicationStatus);
				}
				else {
					EntityCacheUtil.putResult(ApplicationStatusModelImpl.ENTITY_CACHE_ENABLED,
						ApplicationStatusImpl.class, primaryKey,
						_nullApplicationStatus);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ApplicationStatusModelImpl.ENTITY_CACHE_ENABLED,
					ApplicationStatusImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return applicationStatus;
	}

	/**
	 * Returns the application status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param applicationStatusId the primary key of the application status
	 * @return the application status, or <code>null</code> if a application status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplicationStatus fetchByPrimaryKey(long applicationStatusId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)applicationStatusId);
	}

	/**
	 * Returns all the application statuses.
	 *
	 * @return the application statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApplicationStatus> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the application statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ApplicationStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of application statuses
	 * @param end the upper bound of the range of application statuses (not inclusive)
	 * @return the range of application statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApplicationStatus> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the application statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ApplicationStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of application statuses
	 * @param end the upper bound of the range of application statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of application statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApplicationStatus> findAll(int start, int end,
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

		List<ApplicationStatus> list = (List<ApplicationStatus>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_APPLICATIONSTATUS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_APPLICATIONSTATUS;

				if (pagination) {
					sql = sql.concat(ApplicationStatusModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ApplicationStatus>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ApplicationStatus>(list);
				}
				else {
					list = (List<ApplicationStatus>)QueryUtil.list(q,
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
	 * Removes all the application statuses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ApplicationStatus applicationStatus : findAll()) {
			remove(applicationStatus);
		}
	}

	/**
	 * Returns the number of application statuses.
	 *
	 * @return the number of application statuses
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

				Query q = session.createQuery(_SQL_COUNT_APPLICATIONSTATUS);

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
	 * Initializes the application status persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.ApplicationStatus")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ApplicationStatus>> listenersList = new ArrayList<ModelListener<ApplicationStatus>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ApplicationStatus>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ApplicationStatusImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_APPLICATIONSTATUS = "SELECT applicationStatus FROM ApplicationStatus applicationStatus";
	private static final String _SQL_SELECT_APPLICATIONSTATUS_WHERE = "SELECT applicationStatus FROM ApplicationStatus applicationStatus WHERE ";
	private static final String _SQL_COUNT_APPLICATIONSTATUS = "SELECT COUNT(applicationStatus) FROM ApplicationStatus applicationStatus";
	private static final String _SQL_COUNT_APPLICATIONSTATUS_WHERE = "SELECT COUNT(applicationStatus) FROM ApplicationStatus applicationStatus WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "applicationStatus.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ApplicationStatus exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ApplicationStatus exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ApplicationStatusPersistenceImpl.class);
	private static ApplicationStatus _nullApplicationStatus = new ApplicationStatusImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ApplicationStatus> toCacheModel() {
				return _nullApplicationStatusCacheModel;
			}
		};

	private static CacheModel<ApplicationStatus> _nullApplicationStatusCacheModel =
		new CacheModel<ApplicationStatus>() {
			@Override
			public ApplicationStatus toEntityModel() {
				return _nullApplicationStatus;
			}
		};
}