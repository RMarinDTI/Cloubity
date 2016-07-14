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

import com.liferay.portal.service.persistence.BasePersistence;

import es.davinciti.liferay.model.NotaGasto;

/**
 * The persistence interface for the nota gasto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see NotaGastoPersistenceImpl
 * @see NotaGastoUtil
 * @generated
 */
public interface NotaGastoPersistence extends BasePersistence<NotaGasto> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NotaGastoUtil} to access the nota gasto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the nota gastos where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.NotaGasto> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.NotaGasto> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.NotaGasto> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first nota gasto in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nota gasto
	* @throws es.davinciti.liferay.NoSuchNotaGastoException if a matching nota gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.NotaGasto findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchNotaGastoException;

	/**
	* Returns the first nota gasto in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nota gasto, or <code>null</code> if a matching nota gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.NotaGasto fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last nota gasto in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nota gasto
	* @throws es.davinciti.liferay.NoSuchNotaGastoException if a matching nota gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.NotaGasto findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchNotaGastoException;

	/**
	* Returns the last nota gasto in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nota gasto, or <code>null</code> if a matching nota gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.NotaGasto fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public es.davinciti.liferay.model.NotaGasto[] findByCompanyId_PrevAndNext(
		long notagastoId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchNotaGastoException;

	/**
	* Removes all the nota gastos where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of nota gastos where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the nota gastos where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @return the matching nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.NotaGasto> findByCompanyIdUserId(
		long companyId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.NotaGasto> findByCompanyIdUserId(
		long companyId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.NotaGasto> findByCompanyIdUserId(
		long companyId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public es.davinciti.liferay.model.NotaGasto findByCompanyIdUserId_First(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchNotaGastoException;

	/**
	* Returns the first nota gasto in the ordered set where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nota gasto, or <code>null</code> if a matching nota gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.NotaGasto fetchByCompanyIdUserId_First(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public es.davinciti.liferay.model.NotaGasto findByCompanyIdUserId_Last(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchNotaGastoException;

	/**
	* Returns the last nota gasto in the ordered set where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nota gasto, or <code>null</code> if a matching nota gasto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.NotaGasto fetchByCompanyIdUserId_Last(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public es.davinciti.liferay.model.NotaGasto[] findByCompanyIdUserId_PrevAndNext(
		long notagastoId, long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchNotaGastoException;

	/**
	* Removes all the nota gastos where companyId = &#63; and userId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyIdUserId(long companyId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of nota gastos where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @return the number of matching nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyIdUserId(long companyId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the nota gasto in the entity cache if it is enabled.
	*
	* @param notaGasto the nota gasto
	*/
	public void cacheResult(es.davinciti.liferay.model.NotaGasto notaGasto);

	/**
	* Caches the nota gastos in the entity cache if it is enabled.
	*
	* @param notaGastos the nota gastos
	*/
	public void cacheResult(
		java.util.List<es.davinciti.liferay.model.NotaGasto> notaGastos);

	/**
	* Creates a new nota gasto with the primary key. Does not add the nota gasto to the database.
	*
	* @param notagastoId the primary key for the new nota gasto
	* @return the new nota gasto
	*/
	public es.davinciti.liferay.model.NotaGasto create(long notagastoId);

	/**
	* Removes the nota gasto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param notagastoId the primary key of the nota gasto
	* @return the nota gasto that was removed
	* @throws es.davinciti.liferay.NoSuchNotaGastoException if a nota gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.NotaGasto remove(long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchNotaGastoException;

	public es.davinciti.liferay.model.NotaGasto updateImpl(
		es.davinciti.liferay.model.NotaGasto notaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the nota gasto with the primary key or throws a {@link es.davinciti.liferay.NoSuchNotaGastoException} if it could not be found.
	*
	* @param notagastoId the primary key of the nota gasto
	* @return the nota gasto
	* @throws es.davinciti.liferay.NoSuchNotaGastoException if a nota gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.NotaGasto findByPrimaryKey(
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchNotaGastoException;

	/**
	* Returns the nota gasto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param notagastoId the primary key of the nota gasto
	* @return the nota gasto, or <code>null</code> if a nota gasto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.davinciti.liferay.model.NotaGasto fetchByPrimaryKey(
		long notagastoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the nota gastos.
	*
	* @return the nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.NotaGasto> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.NotaGasto> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.NotaGasto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the nota gastos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of nota gastos.
	*
	* @return the number of nota gastos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the historico notas associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @return the historico notas associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.HistoricoNota> getHistoricoNotas(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.HistoricoNota> getHistoricoNotas(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.HistoricoNota> getHistoricoNotas(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of historico notas associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @return the number of historico notas associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public int getHistoricoNotasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the historico nota is associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotaPK the primary key of the historico nota
	* @return <code>true</code> if the historico nota is associated with the nota gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsHistoricoNota(long pk, long historicoNotaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the nota gasto has any historico notas associated with it.
	*
	* @param pk the primary key of the nota gasto to check for associations with historico notas
	* @return <code>true</code> if the nota gasto has any historico notas associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsHistoricoNotas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the nota gasto and the historico nota. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotaPK the primary key of the historico nota
	* @throws SystemException if a system exception occurred
	*/
	public void addHistoricoNota(long pk, long historicoNotaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the nota gasto and the historico nota. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNota the historico nota
	* @throws SystemException if a system exception occurred
	*/
	public void addHistoricoNota(long pk,
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the nota gasto and the historico notas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotaPKs the primary keys of the historico notas
	* @throws SystemException if a system exception occurred
	*/
	public void addHistoricoNotas(long pk, long[] historicoNotaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the nota gasto and the historico notas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotas the historico notas
	* @throws SystemException if a system exception occurred
	*/
	public void addHistoricoNotas(long pk,
		java.util.List<es.davinciti.liferay.model.HistoricoNota> historicoNotas)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the nota gasto and its historico notas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto to clear the associated historico notas from
	* @throws SystemException if a system exception occurred
	*/
	public void clearHistoricoNotas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the nota gasto and the historico nota. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotaPK the primary key of the historico nota
	* @throws SystemException if a system exception occurred
	*/
	public void removeHistoricoNota(long pk, long historicoNotaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the nota gasto and the historico nota. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNota the historico nota
	* @throws SystemException if a system exception occurred
	*/
	public void removeHistoricoNota(long pk,
		es.davinciti.liferay.model.HistoricoNota historicoNota)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the nota gasto and the historico notas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotaPKs the primary keys of the historico notas
	* @throws SystemException if a system exception occurred
	*/
	public void removeHistoricoNotas(long pk, long[] historicoNotaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the nota gasto and the historico notas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotas the historico notas
	* @throws SystemException if a system exception occurred
	*/
	public void removeHistoricoNotas(long pk,
		java.util.List<es.davinciti.liferay.model.HistoricoNota> historicoNotas)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the historico notas associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotaPKs the primary keys of the historico notas to be associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setHistoricoNotas(long pk, long[] historicoNotaPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the historico notas associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param historicoNotas the historico notas to be associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setHistoricoNotas(long pk,
		java.util.List<es.davinciti.liferay.model.HistoricoNota> historicoNotas)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the linea gastos associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @return the linea gastos associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.LineaGasto> getLineaGastos(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of linea gastos associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @return the number of linea gastos associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public int getLineaGastosSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the linea gasto is associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastoPK the primary key of the linea gasto
	* @return <code>true</code> if the linea gasto is associated with the nota gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the nota gasto has any linea gastos associated with it.
	*
	* @param pk the primary key of the nota gasto to check for associations with linea gastos
	* @return <code>true</code> if the nota gasto has any linea gastos associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the nota gasto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the nota gasto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the nota gasto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the nota gasto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the nota gasto and its linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto to clear the associated linea gastos from
	* @throws SystemException if a system exception occurred
	*/
	public void clearLineaGastos(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the nota gasto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastoPK the primary key of the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGasto(long pk, long lineaGastoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the nota gasto and the linea gasto. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGasto the linea gasto
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGasto(long pk,
		es.davinciti.liferay.model.LineaGasto lineaGasto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the nota gasto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastoPKs the primary keys of the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the nota gasto and the linea gastos. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastos the linea gastos
	* @throws SystemException if a system exception occurred
	*/
	public void removeLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gastos associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastoPKs the primary keys of the linea gastos to be associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastos(long pk, long[] lineaGastoPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the linea gastos associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param lineaGastos the linea gastos to be associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastos(long pk,
		java.util.List<es.davinciti.liferay.model.LineaGasto> lineaGastos)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the organization sage companies associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @return the organization sage companies associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> getOrganizationSageCompanies(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> getOrganizationSageCompanies(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> getOrganizationSageCompanies(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of organization sage companies associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @return the number of organization sage companies associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public int getOrganizationSageCompaniesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the organization sage company is associated with the nota gasto.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanyPK the primary key of the organization sage company
	* @return <code>true</code> if the organization sage company is associated with the nota gasto; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsOrganizationSageCompany(long pk,
		long organizationSageCompanyPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the nota gasto has any organization sage companies associated with it.
	*
	* @param pk the primary key of the nota gasto to check for associations with organization sage companies
	* @return <code>true</code> if the nota gasto has any organization sage companies associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsOrganizationSageCompanies(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the nota gasto and the organization sage company. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanyPK the primary key of the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public void addOrganizationSageCompany(long pk,
		long organizationSageCompanyPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the nota gasto and the organization sage company. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompany the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public void addOrganizationSageCompany(long pk,
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the nota gasto and the organization sage companies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanyPKs the primary keys of the organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public void addOrganizationSageCompanies(long pk,
		long[] organizationSageCompanyPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the nota gasto and the organization sage companies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanies the organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public void addOrganizationSageCompanies(long pk,
		java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> organizationSageCompanies)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the nota gasto and its organization sage companies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto to clear the associated organization sage companies from
	* @throws SystemException if a system exception occurred
	*/
	public void clearOrganizationSageCompanies(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the nota gasto and the organization sage company. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanyPK the primary key of the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public void removeOrganizationSageCompany(long pk,
		long organizationSageCompanyPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the nota gasto and the organization sage company. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompany the organization sage company
	* @throws SystemException if a system exception occurred
	*/
	public void removeOrganizationSageCompany(long pk,
		es.davinciti.liferay.model.OrganizationSageCompany organizationSageCompany)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the nota gasto and the organization sage companies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanyPKs the primary keys of the organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public void removeOrganizationSageCompanies(long pk,
		long[] organizationSageCompanyPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the nota gasto and the organization sage companies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanies the organization sage companies
	* @throws SystemException if a system exception occurred
	*/
	public void removeOrganizationSageCompanies(long pk,
		java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> organizationSageCompanies)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the organization sage companies associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanyPKs the primary keys of the organization sage companies to be associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setOrganizationSageCompanies(long pk,
		long[] organizationSageCompanyPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the organization sage companies associated with the nota gasto, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the nota gasto
	* @param organizationSageCompanies the organization sage companies to be associated with the nota gasto
	* @throws SystemException if a system exception occurred
	*/
	public void setOrganizationSageCompanies(long pk,
		java.util.List<es.davinciti.liferay.model.OrganizationSageCompany> organizationSageCompanies)
		throws com.liferay.portal.kernel.exception.SystemException;
}