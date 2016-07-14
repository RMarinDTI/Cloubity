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

package es.davinciti.liferay.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import es.davinciti.liferay.model.HistoricoNota;
import es.davinciti.liferay.model.HistoricoNotaModel;
import es.davinciti.liferay.model.HistoricoNotaSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the HistoricoNota service. Represents a row in the &quot;CMES_HistoricoNota&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link es.davinciti.liferay.model.HistoricoNotaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HistoricoNotaImpl}.
 * </p>
 *
 * @author Cmes
 * @see HistoricoNotaImpl
 * @see es.davinciti.liferay.model.HistoricoNota
 * @see es.davinciti.liferay.model.HistoricoNotaModel
 * @generated
 */
@JSON(strict = true)
public class HistoricoNotaModelImpl extends BaseModelImpl<HistoricoNota>
	implements HistoricoNotaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a historico nota model instance should use the {@link es.davinciti.liferay.model.HistoricoNota} interface instead.
	 */
	public static final String TABLE_NAME = "CMES_HistoricoNota";
	public static final Object[][] TABLE_COLUMNS = {
			{ "historiconotaId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "comments", Types.VARCHAR },
			{ "updateAt", Types.VARCHAR },
			{ "prevStatus", Types.VARCHAR },
			{ "newStatus", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table CMES_HistoricoNota (historiconotaId LONG not null primary key,companyId LONG,userId LONG,comments VARCHAR(75) null,updateAt VARCHAR(75) null,prevStatus VARCHAR(75) null,newStatus VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table CMES_HistoricoNota";
	public static final String ORDER_BY_JPQL = " ORDER BY historicoNota.historiconotaId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMES_HistoricoNota.historiconotaId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.es.davinciti.liferay.model.HistoricoNota"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.es.davinciti.liferay.model.HistoricoNota"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static HistoricoNota toModel(HistoricoNotaSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		HistoricoNota model = new HistoricoNotaImpl();

		model.setHistoriconotaId(soapModel.getHistoriconotaId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setComments(soapModel.getComments());
		model.setUpdateAt(soapModel.getUpdateAt());
		model.setPrevStatus(soapModel.getPrevStatus());
		model.setNewStatus(soapModel.getNewStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<HistoricoNota> toModels(HistoricoNotaSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<HistoricoNota> models = new ArrayList<HistoricoNota>(soapModels.length);

		for (HistoricoNotaSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final String MAPPING_TABLE_CMES_NOTAS_HISTORICONOTAS_NAME = "CMES_Notas_HistoricoNotas";
	public static final Object[][] MAPPING_TABLE_CMES_NOTAS_HISTORICONOTAS_COLUMNS =
		{
			{ "historiconotaId", Types.BIGINT },
			{ "notagastoId", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_CMES_NOTAS_HISTORICONOTAS_SQL_CREATE =
		"create table CMES_Notas_HistoricoNotas (historiconotaId LONG not null,notagastoId LONG not null,primary key (historiconotaId, notagastoId))";
	public static final boolean FINDER_CACHE_ENABLED_CMES_NOTAS_HISTORICONOTAS = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.CMES_Notas_HistoricoNotas"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.es.davinciti.liferay.model.HistoricoNota"));

	public HistoricoNotaModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _historiconotaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setHistoriconotaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _historiconotaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return HistoricoNota.class;
	}

	@Override
	public String getModelClassName() {
		return HistoricoNota.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("historiconotaId", getHistoriconotaId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("comments", getComments());
		attributes.put("updateAt", getUpdateAt());
		attributes.put("prevStatus", getPrevStatus());
		attributes.put("newStatus", getNewStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long historiconotaId = (Long)attributes.get("historiconotaId");

		if (historiconotaId != null) {
			setHistoriconotaId(historiconotaId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}

		String updateAt = (String)attributes.get("updateAt");

		if (updateAt != null) {
			setUpdateAt(updateAt);
		}

		String prevStatus = (String)attributes.get("prevStatus");

		if (prevStatus != null) {
			setPrevStatus(prevStatus);
		}

		String newStatus = (String)attributes.get("newStatus");

		if (newStatus != null) {
			setNewStatus(newStatus);
		}
	}

	@JSON
	@Override
	public long getHistoriconotaId() {
		return _historiconotaId;
	}

	@Override
	public void setHistoriconotaId(long historiconotaId) {
		_historiconotaId = historiconotaId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getComments() {
		if (_comments == null) {
			return StringPool.BLANK;
		}
		else {
			return _comments;
		}
	}

	@Override
	public void setComments(String comments) {
		_comments = comments;
	}

	@JSON
	@Override
	public String getUpdateAt() {
		if (_updateAt == null) {
			return StringPool.BLANK;
		}
		else {
			return _updateAt;
		}
	}

	@Override
	public void setUpdateAt(String updateAt) {
		_updateAt = updateAt;
	}

	@JSON
	@Override
	public String getPrevStatus() {
		if (_prevStatus == null) {
			return StringPool.BLANK;
		}
		else {
			return _prevStatus;
		}
	}

	@Override
	public void setPrevStatus(String prevStatus) {
		_prevStatus = prevStatus;
	}

	@JSON
	@Override
	public String getNewStatus() {
		if (_newStatus == null) {
			return StringPool.BLANK;
		}
		else {
			return _newStatus;
		}
	}

	@Override
	public void setNewStatus(String newStatus) {
		_newStatus = newStatus;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			HistoricoNota.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public HistoricoNota toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (HistoricoNota)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		HistoricoNotaImpl historicoNotaImpl = new HistoricoNotaImpl();

		historicoNotaImpl.setHistoriconotaId(getHistoriconotaId());
		historicoNotaImpl.setCompanyId(getCompanyId());
		historicoNotaImpl.setUserId(getUserId());
		historicoNotaImpl.setComments(getComments());
		historicoNotaImpl.setUpdateAt(getUpdateAt());
		historicoNotaImpl.setPrevStatus(getPrevStatus());
		historicoNotaImpl.setNewStatus(getNewStatus());

		historicoNotaImpl.resetOriginalValues();

		return historicoNotaImpl;
	}

	@Override
	public int compareTo(HistoricoNota historicoNota) {
		long primaryKey = historicoNota.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HistoricoNota)) {
			return false;
		}

		HistoricoNota historicoNota = (HistoricoNota)obj;

		long primaryKey = historicoNota.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<HistoricoNota> toCacheModel() {
		HistoricoNotaCacheModel historicoNotaCacheModel = new HistoricoNotaCacheModel();

		historicoNotaCacheModel.historiconotaId = getHistoriconotaId();

		historicoNotaCacheModel.companyId = getCompanyId();

		historicoNotaCacheModel.userId = getUserId();

		historicoNotaCacheModel.comments = getComments();

		String comments = historicoNotaCacheModel.comments;

		if ((comments != null) && (comments.length() == 0)) {
			historicoNotaCacheModel.comments = null;
		}

		historicoNotaCacheModel.updateAt = getUpdateAt();

		String updateAt = historicoNotaCacheModel.updateAt;

		if ((updateAt != null) && (updateAt.length() == 0)) {
			historicoNotaCacheModel.updateAt = null;
		}

		historicoNotaCacheModel.prevStatus = getPrevStatus();

		String prevStatus = historicoNotaCacheModel.prevStatus;

		if ((prevStatus != null) && (prevStatus.length() == 0)) {
			historicoNotaCacheModel.prevStatus = null;
		}

		historicoNotaCacheModel.newStatus = getNewStatus();

		String newStatus = historicoNotaCacheModel.newStatus;

		if ((newStatus != null) && (newStatus.length() == 0)) {
			historicoNotaCacheModel.newStatus = null;
		}

		return historicoNotaCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{historiconotaId=");
		sb.append(getHistoriconotaId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", comments=");
		sb.append(getComments());
		sb.append(", updateAt=");
		sb.append(getUpdateAt());
		sb.append(", prevStatus=");
		sb.append(getPrevStatus());
		sb.append(", newStatus=");
		sb.append(getNewStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.HistoricoNota");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>historiconotaId</column-name><column-value><![CDATA[");
		sb.append(getHistoriconotaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comments</column-name><column-value><![CDATA[");
		sb.append(getComments());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updateAt</column-name><column-value><![CDATA[");
		sb.append(getUpdateAt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>prevStatus</column-name><column-value><![CDATA[");
		sb.append(getPrevStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>newStatus</column-name><column-value><![CDATA[");
		sb.append(getNewStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = HistoricoNota.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			HistoricoNota.class
		};
	private long _historiconotaId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _comments;
	private String _updateAt;
	private String _prevStatus;
	private String _newStatus;
	private HistoricoNota _escapedModel;
}