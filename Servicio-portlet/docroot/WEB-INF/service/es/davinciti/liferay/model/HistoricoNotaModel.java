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

package es.davinciti.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the HistoricoNota service. Represents a row in the &quot;CMES_HistoricoNota&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link es.davinciti.liferay.model.impl.HistoricoNotaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link es.davinciti.liferay.model.impl.HistoricoNotaImpl}.
 * </p>
 *
 * @author Cmes
 * @see HistoricoNota
 * @see es.davinciti.liferay.model.impl.HistoricoNotaImpl
 * @see es.davinciti.liferay.model.impl.HistoricoNotaModelImpl
 * @generated
 */
public interface HistoricoNotaModel extends BaseModel<HistoricoNota> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a historico nota model instance should use the {@link HistoricoNota} interface instead.
	 */

	/**
	 * Returns the primary key of this historico nota.
	 *
	 * @return the primary key of this historico nota
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this historico nota.
	 *
	 * @param primaryKey the primary key of this historico nota
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the historiconota ID of this historico nota.
	 *
	 * @return the historiconota ID of this historico nota
	 */
	public long getHistoriconotaId();

	/**
	 * Sets the historiconota ID of this historico nota.
	 *
	 * @param historiconotaId the historiconota ID of this historico nota
	 */
	public void setHistoriconotaId(long historiconotaId);

	/**
	 * Returns the company ID of this historico nota.
	 *
	 * @return the company ID of this historico nota
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this historico nota.
	 *
	 * @param companyId the company ID of this historico nota
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this historico nota.
	 *
	 * @return the user ID of this historico nota
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this historico nota.
	 *
	 * @param userId the user ID of this historico nota
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this historico nota.
	 *
	 * @return the user uuid of this historico nota
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this historico nota.
	 *
	 * @param userUuid the user uuid of this historico nota
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the comments of this historico nota.
	 *
	 * @return the comments of this historico nota
	 */
	@AutoEscape
	public String getComments();

	/**
	 * Sets the comments of this historico nota.
	 *
	 * @param comments the comments of this historico nota
	 */
	public void setComments(String comments);

	/**
	 * Returns the update at of this historico nota.
	 *
	 * @return the update at of this historico nota
	 */
	@AutoEscape
	public String getUpdateAt();

	/**
	 * Sets the update at of this historico nota.
	 *
	 * @param updateAt the update at of this historico nota
	 */
	public void setUpdateAt(String updateAt);

	/**
	 * Returns the prev status of this historico nota.
	 *
	 * @return the prev status of this historico nota
	 */
	@AutoEscape
	public String getPrevStatus();

	/**
	 * Sets the prev status of this historico nota.
	 *
	 * @param prevStatus the prev status of this historico nota
	 */
	public void setPrevStatus(String prevStatus);

	/**
	 * Returns the new status of this historico nota.
	 *
	 * @return the new status of this historico nota
	 */
	@AutoEscape
	public String getNewStatus();

	/**
	 * Sets the new status of this historico nota.
	 *
	 * @param newStatus the new status of this historico nota
	 */
	public void setNewStatus(String newStatus);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(es.davinciti.liferay.model.HistoricoNota historicoNota);

	@Override
	public int hashCode();

	@Override
	public CacheModel<es.davinciti.liferay.model.HistoricoNota> toCacheModel();

	@Override
	public es.davinciti.liferay.model.HistoricoNota toEscapedModel();

	@Override
	public es.davinciti.liferay.model.HistoricoNota toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}