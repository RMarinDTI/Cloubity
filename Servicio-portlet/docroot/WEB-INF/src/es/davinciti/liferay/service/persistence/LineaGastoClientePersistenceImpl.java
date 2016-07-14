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

import es.davinciti.liferay.NoSuchLineaGastoClienteException;
import es.davinciti.liferay.model.LineaGastoCliente;
import es.davinciti.liferay.model.impl.LineaGastoClienteImpl;
import es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the linea gasto cliente service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see LineaGastoClientePersistence
 * @see LineaGastoClienteUtil
 * @generated
 */
public class LineaGastoClientePersistenceImpl extends BasePersistenceImpl<LineaGastoCliente>
	implements LineaGastoClientePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LineaGastoClienteUtil} to access the linea gasto cliente persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LineaGastoClienteImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LineaGastoClienteModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoClienteModelImpl.FINDER_CACHE_ENABLED,
			LineaGastoClienteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LineaGastoClienteModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoClienteModelImpl.FINDER_CACHE_ENABLED,
			LineaGastoClienteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LineaGastoClienteModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoClienteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(LineaGastoClienteModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoClienteModelImpl.FINDER_CACHE_ENABLED,
			LineaGastoClienteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(LineaGastoClienteModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoClienteModelImpl.FINDER_CACHE_ENABLED,
			LineaGastoClienteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			LineaGastoClienteModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(LineaGastoClienteModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoClienteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the linea gasto clientes where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching linea gasto clientes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoCliente> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the linea gasto clientes where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of linea gasto clientes
	 * @param end the upper bound of the range of linea gasto clientes (not inclusive)
	 * @return the range of matching linea gasto clientes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoCliente> findByCompanyId(long companyId, int start,
		int end) throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto clientes where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of linea gasto clientes
	 * @param end the upper bound of the range of linea gasto clientes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching linea gasto clientes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoCliente> findByCompanyId(long companyId, int start,
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

		List<LineaGastoCliente> list = (List<LineaGastoCliente>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LineaGastoCliente lineaGastoCliente : list) {
				if ((companyId != lineaGastoCliente.getCompanyId())) {
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

			query.append(_SQL_SELECT_LINEAGASTOCLIENTE_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LineaGastoClienteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<LineaGastoCliente>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LineaGastoCliente>(list);
				}
				else {
					list = (List<LineaGastoCliente>)QueryUtil.list(q,
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
	 * Returns the first linea gasto cliente in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching linea gasto cliente
	 * @throws es.davinciti.liferay.NoSuchLineaGastoClienteException if a matching linea gasto cliente could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCliente findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchLineaGastoClienteException, SystemException {
		LineaGastoCliente lineaGastoCliente = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (lineaGastoCliente != null) {
			return lineaGastoCliente;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLineaGastoClienteException(msg.toString());
	}

	/**
	 * Returns the first linea gasto cliente in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching linea gasto cliente, or <code>null</code> if a matching linea gasto cliente could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCliente fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<LineaGastoCliente> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last linea gasto cliente in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching linea gasto cliente
	 * @throws es.davinciti.liferay.NoSuchLineaGastoClienteException if a matching linea gasto cliente could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCliente findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchLineaGastoClienteException, SystemException {
		LineaGastoCliente lineaGastoCliente = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (lineaGastoCliente != null) {
			return lineaGastoCliente;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLineaGastoClienteException(msg.toString());
	}

	/**
	 * Returns the last linea gasto cliente in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching linea gasto cliente, or <code>null</code> if a matching linea gasto cliente could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCliente fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<LineaGastoCliente> list = findByCompanyId(companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the linea gasto clientes before and after the current linea gasto cliente in the ordered set where companyId = &#63;.
	 *
	 * @param clienteId the primary key of the current linea gasto cliente
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next linea gasto cliente
	 * @throws es.davinciti.liferay.NoSuchLineaGastoClienteException if a linea gasto cliente with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCliente[] findByCompanyId_PrevAndNext(long clienteId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchLineaGastoClienteException, SystemException {
		LineaGastoCliente lineaGastoCliente = findByPrimaryKey(clienteId);

		Session session = null;

		try {
			session = openSession();

			LineaGastoCliente[] array = new LineaGastoClienteImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, lineaGastoCliente,
					companyId, orderByComparator, true);

			array[1] = lineaGastoCliente;

			array[2] = getByCompanyId_PrevAndNext(session, lineaGastoCliente,
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

	protected LineaGastoCliente getByCompanyId_PrevAndNext(Session session,
		LineaGastoCliente lineaGastoCliente, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LINEAGASTOCLIENTE_WHERE);

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
			query.append(LineaGastoClienteModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lineaGastoCliente);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LineaGastoCliente> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the linea gasto clientes where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (LineaGastoCliente lineaGastoCliente : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(lineaGastoCliente);
		}
	}

	/**
	 * Returns the number of linea gasto clientes where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching linea gasto clientes
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

			query.append(_SQL_COUNT_LINEAGASTOCLIENTE_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "lineaGastoCliente.companyId = ?";

	public LineaGastoClientePersistenceImpl() {
		setModelClass(LineaGastoCliente.class);
	}

	/**
	 * Caches the linea gasto cliente in the entity cache if it is enabled.
	 *
	 * @param lineaGastoCliente the linea gasto cliente
	 */
	@Override
	public void cacheResult(LineaGastoCliente lineaGastoCliente) {
		EntityCacheUtil.putResult(LineaGastoClienteModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoClienteImpl.class, lineaGastoCliente.getPrimaryKey(),
			lineaGastoCliente);

		lineaGastoCliente.resetOriginalValues();
	}

	/**
	 * Caches the linea gasto clientes in the entity cache if it is enabled.
	 *
	 * @param lineaGastoClientes the linea gasto clientes
	 */
	@Override
	public void cacheResult(List<LineaGastoCliente> lineaGastoClientes) {
		for (LineaGastoCliente lineaGastoCliente : lineaGastoClientes) {
			if (EntityCacheUtil.getResult(
						LineaGastoClienteModelImpl.ENTITY_CACHE_ENABLED,
						LineaGastoClienteImpl.class,
						lineaGastoCliente.getPrimaryKey()) == null) {
				cacheResult(lineaGastoCliente);
			}
			else {
				lineaGastoCliente.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all linea gasto clientes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LineaGastoClienteImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LineaGastoClienteImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the linea gasto cliente.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LineaGastoCliente lineaGastoCliente) {
		EntityCacheUtil.removeResult(LineaGastoClienteModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoClienteImpl.class, lineaGastoCliente.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LineaGastoCliente> lineaGastoClientes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LineaGastoCliente lineaGastoCliente : lineaGastoClientes) {
			EntityCacheUtil.removeResult(LineaGastoClienteModelImpl.ENTITY_CACHE_ENABLED,
				LineaGastoClienteImpl.class, lineaGastoCliente.getPrimaryKey());
		}
	}

	/**
	 * Creates a new linea gasto cliente with the primary key. Does not add the linea gasto cliente to the database.
	 *
	 * @param clienteId the primary key for the new linea gasto cliente
	 * @return the new linea gasto cliente
	 */
	@Override
	public LineaGastoCliente create(long clienteId) {
		LineaGastoCliente lineaGastoCliente = new LineaGastoClienteImpl();

		lineaGastoCliente.setNew(true);
		lineaGastoCliente.setPrimaryKey(clienteId);

		return lineaGastoCliente;
	}

	/**
	 * Removes the linea gasto cliente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param clienteId the primary key of the linea gasto cliente
	 * @return the linea gasto cliente that was removed
	 * @throws es.davinciti.liferay.NoSuchLineaGastoClienteException if a linea gasto cliente with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCliente remove(long clienteId)
		throws NoSuchLineaGastoClienteException, SystemException {
		return remove((Serializable)clienteId);
	}

	/**
	 * Removes the linea gasto cliente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the linea gasto cliente
	 * @return the linea gasto cliente that was removed
	 * @throws es.davinciti.liferay.NoSuchLineaGastoClienteException if a linea gasto cliente with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCliente remove(Serializable primaryKey)
		throws NoSuchLineaGastoClienteException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LineaGastoCliente lineaGastoCliente = (LineaGastoCliente)session.get(LineaGastoClienteImpl.class,
					primaryKey);

			if (lineaGastoCliente == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLineaGastoClienteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lineaGastoCliente);
		}
		catch (NoSuchLineaGastoClienteException nsee) {
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
	protected LineaGastoCliente removeImpl(LineaGastoCliente lineaGastoCliente)
		throws SystemException {
		lineaGastoCliente = toUnwrappedModel(lineaGastoCliente);

		lineaGastoClienteToLineaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(lineaGastoCliente.getPrimaryKey());

		lineaGastoClienteToLineaGastoProyectoTableMapper.deleteLeftPrimaryKeyTableMappings(lineaGastoCliente.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lineaGastoCliente)) {
				lineaGastoCliente = (LineaGastoCliente)session.get(LineaGastoClienteImpl.class,
						lineaGastoCliente.getPrimaryKeyObj());
			}

			if (lineaGastoCliente != null) {
				session.delete(lineaGastoCliente);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lineaGastoCliente != null) {
			clearCache(lineaGastoCliente);
		}

		return lineaGastoCliente;
	}

	@Override
	public LineaGastoCliente updateImpl(
		es.davinciti.liferay.model.LineaGastoCliente lineaGastoCliente)
		throws SystemException {
		lineaGastoCliente = toUnwrappedModel(lineaGastoCliente);

		boolean isNew = lineaGastoCliente.isNew();

		LineaGastoClienteModelImpl lineaGastoClienteModelImpl = (LineaGastoClienteModelImpl)lineaGastoCliente;

		Session session = null;

		try {
			session = openSession();

			if (lineaGastoCliente.isNew()) {
				session.save(lineaGastoCliente);

				lineaGastoCliente.setNew(false);
			}
			else {
				session.merge(lineaGastoCliente);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LineaGastoClienteModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((lineaGastoClienteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lineaGastoClienteModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { lineaGastoClienteModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}
		}

		EntityCacheUtil.putResult(LineaGastoClienteModelImpl.ENTITY_CACHE_ENABLED,
			LineaGastoClienteImpl.class, lineaGastoCliente.getPrimaryKey(),
			lineaGastoCliente);

		return lineaGastoCliente;
	}

	protected LineaGastoCliente toUnwrappedModel(
		LineaGastoCliente lineaGastoCliente) {
		if (lineaGastoCliente instanceof LineaGastoClienteImpl) {
			return lineaGastoCliente;
		}

		LineaGastoClienteImpl lineaGastoClienteImpl = new LineaGastoClienteImpl();

		lineaGastoClienteImpl.setNew(lineaGastoCliente.isNew());
		lineaGastoClienteImpl.setPrimaryKey(lineaGastoCliente.getPrimaryKey());

		lineaGastoClienteImpl.setClienteId(lineaGastoCliente.getClienteId());
		lineaGastoClienteImpl.setCompanyId(lineaGastoCliente.getCompanyId());
		lineaGastoClienteImpl.setName(lineaGastoCliente.getName());
		lineaGastoClienteImpl.setDescription(lineaGastoCliente.getDescription());

		return lineaGastoClienteImpl;
	}

	/**
	 * Returns the linea gasto cliente with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the linea gasto cliente
	 * @return the linea gasto cliente
	 * @throws es.davinciti.liferay.NoSuchLineaGastoClienteException if a linea gasto cliente with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCliente findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLineaGastoClienteException, SystemException {
		LineaGastoCliente lineaGastoCliente = fetchByPrimaryKey(primaryKey);

		if (lineaGastoCliente == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLineaGastoClienteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lineaGastoCliente;
	}

	/**
	 * Returns the linea gasto cliente with the primary key or throws a {@link es.davinciti.liferay.NoSuchLineaGastoClienteException} if it could not be found.
	 *
	 * @param clienteId the primary key of the linea gasto cliente
	 * @return the linea gasto cliente
	 * @throws es.davinciti.liferay.NoSuchLineaGastoClienteException if a linea gasto cliente with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCliente findByPrimaryKey(long clienteId)
		throws NoSuchLineaGastoClienteException, SystemException {
		return findByPrimaryKey((Serializable)clienteId);
	}

	/**
	 * Returns the linea gasto cliente with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the linea gasto cliente
	 * @return the linea gasto cliente, or <code>null</code> if a linea gasto cliente with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCliente fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LineaGastoCliente lineaGastoCliente = (LineaGastoCliente)EntityCacheUtil.getResult(LineaGastoClienteModelImpl.ENTITY_CACHE_ENABLED,
				LineaGastoClienteImpl.class, primaryKey);

		if (lineaGastoCliente == _nullLineaGastoCliente) {
			return null;
		}

		if (lineaGastoCliente == null) {
			Session session = null;

			try {
				session = openSession();

				lineaGastoCliente = (LineaGastoCliente)session.get(LineaGastoClienteImpl.class,
						primaryKey);

				if (lineaGastoCliente != null) {
					cacheResult(lineaGastoCliente);
				}
				else {
					EntityCacheUtil.putResult(LineaGastoClienteModelImpl.ENTITY_CACHE_ENABLED,
						LineaGastoClienteImpl.class, primaryKey,
						_nullLineaGastoCliente);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LineaGastoClienteModelImpl.ENTITY_CACHE_ENABLED,
					LineaGastoClienteImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lineaGastoCliente;
	}

	/**
	 * Returns the linea gasto cliente with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param clienteId the primary key of the linea gasto cliente
	 * @return the linea gasto cliente, or <code>null</code> if a linea gasto cliente with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LineaGastoCliente fetchByPrimaryKey(long clienteId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)clienteId);
	}

	/**
	 * Returns all the linea gasto clientes.
	 *
	 * @return the linea gasto clientes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoCliente> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the linea gasto clientes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linea gasto clientes
	 * @param end the upper bound of the range of linea gasto clientes (not inclusive)
	 * @return the range of linea gasto clientes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoCliente> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto clientes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linea gasto clientes
	 * @param end the upper bound of the range of linea gasto clientes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gasto clientes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LineaGastoCliente> findAll(int start, int end,
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

		List<LineaGastoCliente> list = (List<LineaGastoCliente>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LINEAGASTOCLIENTE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LINEAGASTOCLIENTE;

				if (pagination) {
					sql = sql.concat(LineaGastoClienteModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LineaGastoCliente>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LineaGastoCliente>(list);
				}
				else {
					list = (List<LineaGastoCliente>)QueryUtil.list(q,
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
	 * Removes all the linea gasto clientes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LineaGastoCliente lineaGastoCliente : findAll()) {
			remove(lineaGastoCliente);
		}
	}

	/**
	 * Returns the number of linea gasto clientes.
	 *
	 * @return the number of linea gasto clientes
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

				Query q = session.createQuery(_SQL_COUNT_LINEAGASTOCLIENTE);

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
	 * Returns all the linea gastos associated with the linea gasto cliente.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @return the linea gastos associated with the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk)
		throws SystemException {
		return getLineaGastos(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the linea gastos associated with the linea gasto cliente.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param start the lower bound of the range of linea gasto clientes
	 * @param end the upper bound of the range of linea gasto clientes (not inclusive)
	 * @return the range of linea gastos associated with the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk,
		int start, int end) throws SystemException {
		return getLineaGastos(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gastos associated with the linea gasto cliente.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param start the lower bound of the range of linea gasto clientes
	 * @param end the upper bound of the range of linea gasto clientes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gastos associated with the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(long pk,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return lineaGastoClienteToLineaGastoTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of linea gastos associated with the linea gasto cliente.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @return the number of linea gastos associated with the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getLineaGastosSize(long pk) throws SystemException {
		long[] pks = lineaGastoClienteToLineaGastoTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the linea gasto is associated with the linea gasto cliente.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @return <code>true</code> if the linea gasto is associated with the linea gasto cliente; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		return lineaGastoClienteToLineaGastoTableMapper.containsTableMapping(pk,
			lineaGastoPK);
	}

	/**
	 * Returns <code>true</code> if the linea gasto cliente has any linea gastos associated with it.
	 *
	 * @param pk the primary key of the linea gasto cliente to check for associations with linea gastos
	 * @return <code>true</code> if the linea gasto cliente has any linea gastos associated with it; <code>false</code> otherwise
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
	 * Adds an association between the linea gasto cliente and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		lineaGastoClienteToLineaGastoTableMapper.addTableMapping(pk,
			lineaGastoPK);
	}

	/**
	 * Adds an association between the linea gasto cliente and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGasto the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws SystemException {
		lineaGastoClienteToLineaGastoTableMapper.addTableMapping(pk,
			lineaGasto.getPrimaryKey());
	}

	/**
	 * Adds an association between the linea gasto cliente and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoPKs the primary keys of the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		for (long lineaGastoPK : lineaGastoPKs) {
			lineaGastoClienteToLineaGastoTableMapper.addTableMapping(pk,
				lineaGastoPK);
		}
	}

	/**
	 * Adds an association between the linea gasto cliente and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastos the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastos(long pk,
		List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGasto lineaGasto : lineaGastos) {
			lineaGastoClienteToLineaGastoTableMapper.addTableMapping(pk,
				lineaGasto.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the linea gasto cliente and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente to clear the associated linea gastos from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearLineaGastos(long pk) throws SystemException {
		lineaGastoClienteToLineaGastoTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the linea gasto cliente and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoPK the primary key of the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGasto(long pk, long lineaGastoPK)
		throws SystemException {
		lineaGastoClienteToLineaGastoTableMapper.deleteTableMapping(pk,
			lineaGastoPK);
	}

	/**
	 * Removes the association between the linea gasto cliente and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGasto the linea gasto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws SystemException {
		lineaGastoClienteToLineaGastoTableMapper.deleteTableMapping(pk,
			lineaGasto.getPrimaryKey());
	}

	/**
	 * Removes the association between the linea gasto cliente and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoPKs the primary keys of the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		for (long lineaGastoPK : lineaGastoPKs) {
			lineaGastoClienteToLineaGastoTableMapper.deleteTableMapping(pk,
				lineaGastoPK);
		}
	}

	/**
	 * Removes the association between the linea gasto cliente and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastos the linea gastos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastos(long pk,
		List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGasto lineaGasto : lineaGastos) {
			lineaGastoClienteToLineaGastoTableMapper.deleteTableMapping(pk,
				lineaGasto.getPrimaryKey());
		}
	}

	/**
	 * Sets the linea gastos associated with the linea gasto cliente, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoPKs the primary keys of the linea gastos to be associated with the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws SystemException {
		Set<Long> newLineaGastoPKsSet = SetUtil.fromArray(lineaGastoPKs);
		Set<Long> oldLineaGastoPKsSet = SetUtil.fromArray(lineaGastoClienteToLineaGastoTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeLineaGastoPKsSet = new HashSet<Long>(oldLineaGastoPKsSet);

		removeLineaGastoPKsSet.removeAll(newLineaGastoPKsSet);

		for (long removeLineaGastoPK : removeLineaGastoPKsSet) {
			lineaGastoClienteToLineaGastoTableMapper.deleteTableMapping(pk,
				removeLineaGastoPK);
		}

		newLineaGastoPKsSet.removeAll(oldLineaGastoPKsSet);

		for (long newLineaGastoPK : newLineaGastoPKsSet) {
			lineaGastoClienteToLineaGastoTableMapper.addTableMapping(pk,
				newLineaGastoPK);
		}
	}

	/**
	 * Sets the linea gastos associated with the linea gasto cliente, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastos the linea gastos to be associated with the linea gasto cliente
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
			FinderCacheUtil.clearCache(LineaGastoClienteModelImpl.MAPPING_TABLE_CMES_LINEAS_CLIENTES_NAME);
		}
	}

	/**
	 * Returns all the linea gasto proyectos associated with the linea gasto cliente.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @return the linea gasto proyectos associated with the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk) throws SystemException {
		return getLineaGastoProyectos(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the linea gasto proyectos associated with the linea gasto cliente.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param start the lower bound of the range of linea gasto clientes
	 * @param end the upper bound of the range of linea gasto clientes (not inclusive)
	 * @return the range of linea gasto proyectos associated with the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk, int start, int end) throws SystemException {
		return getLineaGastoProyectos(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linea gasto proyectos associated with the linea gasto cliente.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.LineaGastoClienteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param start the lower bound of the range of linea gasto clientes
	 * @param end the upper bound of the range of linea gasto clientes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linea gasto proyectos associated with the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<es.davinciti.liferay.model.LineaGastoProyecto> getLineaGastoProyectos(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return lineaGastoClienteToLineaGastoProyectoTableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of linea gasto proyectos associated with the linea gasto cliente.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @return the number of linea gasto proyectos associated with the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getLineaGastoProyectosSize(long pk) throws SystemException {
		long[] pks = lineaGastoClienteToLineaGastoProyectoTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the linea gasto proyecto is associated with the linea gasto cliente.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	 * @return <code>true</code> if the linea gasto proyecto is associated with the linea gasto cliente; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGastoProyecto(long pk, long lineaGastoProyectoPK)
		throws SystemException {
		return lineaGastoClienteToLineaGastoProyectoTableMapper.containsTableMapping(pk,
			lineaGastoProyectoPK);
	}

	/**
	 * Returns <code>true</code> if the linea gasto cliente has any linea gasto proyectos associated with it.
	 *
	 * @param pk the primary key of the linea gasto cliente to check for associations with linea gasto proyectos
	 * @return <code>true</code> if the linea gasto cliente has any linea gasto proyectos associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsLineaGastoProyectos(long pk)
		throws SystemException {
		if (getLineaGastoProyectosSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the linea gasto cliente and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoProyecto(long pk, long lineaGastoProyectoPK)
		throws SystemException {
		lineaGastoClienteToLineaGastoProyectoTableMapper.addTableMapping(pk,
			lineaGastoProyectoPK);
	}

	/**
	 * Adds an association between the linea gasto cliente and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoProyecto the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoProyecto(long pk,
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws SystemException {
		lineaGastoClienteToLineaGastoProyectoTableMapper.addTableMapping(pk,
			lineaGastoProyecto.getPrimaryKey());
	}

	/**
	 * Adds an association between the linea gasto cliente and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoProyectos(long pk, long[] lineaGastoProyectoPKs)
		throws SystemException {
		for (long lineaGastoProyectoPK : lineaGastoProyectoPKs) {
			lineaGastoClienteToLineaGastoProyectoTableMapper.addTableMapping(pk,
				lineaGastoProyectoPK);
		}
	}

	/**
	 * Adds an association between the linea gasto cliente and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoProyectos the linea gasto proyectos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addLineaGastoProyectos(long pk,
		List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto : lineaGastoProyectos) {
			lineaGastoClienteToLineaGastoProyectoTableMapper.addTableMapping(pk,
				lineaGastoProyecto.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the linea gasto cliente and its linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente to clear the associated linea gasto proyectos from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearLineaGastoProyectos(long pk) throws SystemException {
		lineaGastoClienteToLineaGastoProyectoTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the linea gasto cliente and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoProyectoPK the primary key of the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoProyecto(long pk, long lineaGastoProyectoPK)
		throws SystemException {
		lineaGastoClienteToLineaGastoProyectoTableMapper.deleteTableMapping(pk,
			lineaGastoProyectoPK);
	}

	/**
	 * Removes the association between the linea gasto cliente and the linea gasto proyecto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoProyecto the linea gasto proyecto
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoProyecto(long pk,
		es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto)
		throws SystemException {
		lineaGastoClienteToLineaGastoProyectoTableMapper.deleteTableMapping(pk,
			lineaGastoProyecto.getPrimaryKey());
	}

	/**
	 * Removes the association between the linea gasto cliente and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoProyectos(long pk, long[] lineaGastoProyectoPKs)
		throws SystemException {
		for (long lineaGastoProyectoPK : lineaGastoProyectoPKs) {
			lineaGastoClienteToLineaGastoProyectoTableMapper.deleteTableMapping(pk,
				lineaGastoProyectoPK);
		}
	}

	/**
	 * Removes the association between the linea gasto cliente and the linea gasto proyectos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoProyectos the linea gasto proyectos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeLineaGastoProyectos(long pk,
		List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws SystemException {
		for (es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto : lineaGastoProyectos) {
			lineaGastoClienteToLineaGastoProyectoTableMapper.deleteTableMapping(pk,
				lineaGastoProyecto.getPrimaryKey());
		}
	}

	/**
	 * Sets the linea gasto proyectos associated with the linea gasto cliente, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoProyectoPKs the primary keys of the linea gasto proyectos to be associated with the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastoProyectos(long pk, long[] lineaGastoProyectoPKs)
		throws SystemException {
		Set<Long> newLineaGastoProyectoPKsSet = SetUtil.fromArray(lineaGastoProyectoPKs);
		Set<Long> oldLineaGastoProyectoPKsSet = SetUtil.fromArray(lineaGastoClienteToLineaGastoProyectoTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeLineaGastoProyectoPKsSet = new HashSet<Long>(oldLineaGastoProyectoPKsSet);

		removeLineaGastoProyectoPKsSet.removeAll(newLineaGastoProyectoPKsSet);

		for (long removeLineaGastoProyectoPK : removeLineaGastoProyectoPKsSet) {
			lineaGastoClienteToLineaGastoProyectoTableMapper.deleteTableMapping(pk,
				removeLineaGastoProyectoPK);
		}

		newLineaGastoProyectoPKsSet.removeAll(oldLineaGastoProyectoPKsSet);

		for (long newLineaGastoProyectoPK : newLineaGastoProyectoPKsSet) {
			lineaGastoClienteToLineaGastoProyectoTableMapper.addTableMapping(pk,
				newLineaGastoProyectoPK);
		}
	}

	/**
	 * Sets the linea gasto proyectos associated with the linea gasto cliente, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the linea gasto cliente
	 * @param lineaGastoProyectos the linea gasto proyectos to be associated with the linea gasto cliente
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setLineaGastoProyectos(long pk,
		List<es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoProyectos)
		throws SystemException {
		try {
			long[] lineaGastoProyectoPKs = new long[lineaGastoProyectos.size()];

			for (int i = 0; i < lineaGastoProyectos.size(); i++) {
				es.davinciti.liferay.model.LineaGastoProyecto lineaGastoProyecto =
					lineaGastoProyectos.get(i);

				lineaGastoProyectoPKs[i] = lineaGastoProyecto.getPrimaryKey();
			}

			setLineaGastoProyectos(pk, lineaGastoProyectoPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(LineaGastoClienteModelImpl.MAPPING_TABLE_CMES_CLIENTES_PROYECTOS_NAME);
		}
	}

	/**
	 * Initializes the linea gasto cliente persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.davinciti.liferay.model.LineaGastoCliente")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LineaGastoCliente>> listenersList = new ArrayList<ModelListener<LineaGastoCliente>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LineaGastoCliente>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		lineaGastoClienteToLineaGastoTableMapper = TableMapperFactory.getTableMapper("CMES_Lineas_Clientes",
				"clienteId", "lineagastoId", this, lineaGastoPersistence);

		lineaGastoClienteToLineaGastoProyectoTableMapper = TableMapperFactory.getTableMapper("CMES_Clientes_Proyectos",
				"clienteId", "proyectoId", this, lineaGastoProyectoPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(LineaGastoClienteImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("CMES_Lineas_Clientes");
		TableMapperFactory.removeTableMapper("CMES_Clientes_Proyectos");
	}

	@BeanReference(type = LineaGastoPersistence.class)
	protected LineaGastoPersistence lineaGastoPersistence;
	protected TableMapper<LineaGastoCliente, es.davinciti.liferay.model.LineaGasto> lineaGastoClienteToLineaGastoTableMapper;
	@BeanReference(type = LineaGastoProyectoPersistence.class)
	protected LineaGastoProyectoPersistence lineaGastoProyectoPersistence;
	protected TableMapper<LineaGastoCliente, es.davinciti.liferay.model.LineaGastoProyecto> lineaGastoClienteToLineaGastoProyectoTableMapper;
	private static final String _SQL_SELECT_LINEAGASTOCLIENTE = "SELECT lineaGastoCliente FROM LineaGastoCliente lineaGastoCliente";
	private static final String _SQL_SELECT_LINEAGASTOCLIENTE_WHERE = "SELECT lineaGastoCliente FROM LineaGastoCliente lineaGastoCliente WHERE ";
	private static final String _SQL_COUNT_LINEAGASTOCLIENTE = "SELECT COUNT(lineaGastoCliente) FROM LineaGastoCliente lineaGastoCliente";
	private static final String _SQL_COUNT_LINEAGASTOCLIENTE_WHERE = "SELECT COUNT(lineaGastoCliente) FROM LineaGastoCliente lineaGastoCliente WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lineaGastoCliente.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LineaGastoCliente exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LineaGastoCliente exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LineaGastoClientePersistenceImpl.class);
	private static LineaGastoCliente _nullLineaGastoCliente = new LineaGastoClienteImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LineaGastoCliente> toCacheModel() {
				return _nullLineaGastoClienteCacheModel;
			}
		};

	private static CacheModel<LineaGastoCliente> _nullLineaGastoClienteCacheModel =
		new CacheModel<LineaGastoCliente>() {
			@Override
			public LineaGastoCliente toEntityModel() {
				return _nullLineaGastoCliente;
			}
		};
}