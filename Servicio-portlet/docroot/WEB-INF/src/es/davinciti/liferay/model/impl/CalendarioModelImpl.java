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

import es.davinciti.liferay.model.Calendario;
import es.davinciti.liferay.model.CalendarioModel;
import es.davinciti.liferay.model.CalendarioSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Calendario service. Represents a row in the &quot;CMES_Calendario&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link es.davinciti.liferay.model.CalendarioModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CalendarioImpl}.
 * </p>
 *
 * @author Cmes
 * @see CalendarioImpl
 * @see es.davinciti.liferay.model.Calendario
 * @see es.davinciti.liferay.model.CalendarioModel
 * @generated
 */
@JSON(strict = true)
public class CalendarioModelImpl extends BaseModelImpl<Calendario>
	implements CalendarioModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a calendario model instance should use the {@link es.davinciti.liferay.model.Calendario} interface instead.
	 */
	public static final String TABLE_NAME = "CMES_Calendario";
	public static final Object[][] TABLE_COLUMNS = {
			{ "calendarioId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "year", Types.INTEGER },
			{ "calendarJson", Types.VARCHAR },
			{ "status", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table CMES_Calendario (calendarioId LONG not null primary key,companyId LONG,userId LONG,year INTEGER,calendarJson STRING null,status VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table CMES_Calendario";
	public static final String ORDER_BY_JPQL = " ORDER BY calendario.calendarioId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMES_Calendario.calendarioId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.es.davinciti.liferay.model.Calendario"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.es.davinciti.liferay.model.Calendario"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.es.davinciti.liferay.model.Calendario"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long USERID_COLUMN_BITMASK = 2L;
	public static long YEAR_COLUMN_BITMASK = 4L;
	public static long CALENDARIOID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Calendario toModel(CalendarioSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Calendario model = new CalendarioImpl();

		model.setCalendarioId(soapModel.getCalendarioId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setYear(soapModel.getYear());
		model.setCalendarJson(soapModel.getCalendarJson());
		model.setStatus(soapModel.getStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Calendario> toModels(CalendarioSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Calendario> models = new ArrayList<Calendario>(soapModels.length);

		for (CalendarioSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.es.davinciti.liferay.model.Calendario"));

	public CalendarioModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _calendarioId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCalendarioId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _calendarioId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Calendario.class;
	}

	@Override
	public String getModelClassName() {
		return Calendario.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("calendarioId", getCalendarioId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("year", getYear());
		attributes.put("calendarJson", getCalendarJson());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long calendarioId = (Long)attributes.get("calendarioId");

		if (calendarioId != null) {
			setCalendarioId(calendarioId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Integer year = (Integer)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		String calendarJson = (String)attributes.get("calendarJson");

		if (calendarJson != null) {
			setCalendarJson(calendarJson);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@JSON
	@Override
	public long getCalendarioId() {
		return _calendarioId;
	}

	@Override
	public void setCalendarioId(long calendarioId) {
		_calendarioId = calendarioId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

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

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	@Override
	public int getYear() {
		return _year;
	}

	@Override
	public void setYear(int year) {
		_columnBitmask |= YEAR_COLUMN_BITMASK;

		if (!_setOriginalYear) {
			_setOriginalYear = true;

			_originalYear = _year;
		}

		_year = year;
	}

	public int getOriginalYear() {
		return _originalYear;
	}

	@JSON
	@Override
	public String getCalendarJson() {
		if (_calendarJson == null) {
			return StringPool.BLANK;
		}
		else {
			return _calendarJson;
		}
	}

	@Override
	public void setCalendarJson(String calendarJson) {
		_calendarJson = calendarJson;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_status == null) {
			return StringPool.BLANK;
		}
		else {
			return _status;
		}
	}

	@Override
	public void setStatus(String status) {
		_status = status;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Calendario.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Calendario toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Calendario)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CalendarioImpl calendarioImpl = new CalendarioImpl();

		calendarioImpl.setCalendarioId(getCalendarioId());
		calendarioImpl.setCompanyId(getCompanyId());
		calendarioImpl.setUserId(getUserId());
		calendarioImpl.setYear(getYear());
		calendarioImpl.setCalendarJson(getCalendarJson());
		calendarioImpl.setStatus(getStatus());

		calendarioImpl.resetOriginalValues();

		return calendarioImpl;
	}

	@Override
	public int compareTo(Calendario calendario) {
		long primaryKey = calendario.getPrimaryKey();

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

		if (!(obj instanceof Calendario)) {
			return false;
		}

		Calendario calendario = (Calendario)obj;

		long primaryKey = calendario.getPrimaryKey();

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
		CalendarioModelImpl calendarioModelImpl = this;

		calendarioModelImpl._originalCompanyId = calendarioModelImpl._companyId;

		calendarioModelImpl._setOriginalCompanyId = false;

		calendarioModelImpl._originalUserId = calendarioModelImpl._userId;

		calendarioModelImpl._setOriginalUserId = false;

		calendarioModelImpl._originalYear = calendarioModelImpl._year;

		calendarioModelImpl._setOriginalYear = false;

		calendarioModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Calendario> toCacheModel() {
		CalendarioCacheModel calendarioCacheModel = new CalendarioCacheModel();

		calendarioCacheModel.calendarioId = getCalendarioId();

		calendarioCacheModel.companyId = getCompanyId();

		calendarioCacheModel.userId = getUserId();

		calendarioCacheModel.year = getYear();

		calendarioCacheModel.calendarJson = getCalendarJson();

		String calendarJson = calendarioCacheModel.calendarJson;

		if ((calendarJson != null) && (calendarJson.length() == 0)) {
			calendarioCacheModel.calendarJson = null;
		}

		calendarioCacheModel.status = getStatus();

		String status = calendarioCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			calendarioCacheModel.status = null;
		}

		return calendarioCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{calendarioId=");
		sb.append(getCalendarioId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", year=");
		sb.append(getYear());
		sb.append(", calendarJson=");
		sb.append(getCalendarJson());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.Calendario");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>calendarioId</column-name><column-value><![CDATA[");
		sb.append(getCalendarioId());
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
			"<column><column-name>year</column-name><column-value><![CDATA[");
		sb.append(getYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>calendarJson</column-name><column-value><![CDATA[");
		sb.append(getCalendarJson());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Calendario.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Calendario.class
		};
	private long _calendarioId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private int _year;
	private int _originalYear;
	private boolean _setOriginalYear;
	private String _calendarJson;
	private String _status;
	private long _columnBitmask;
	private Calendario _escapedModel;
}