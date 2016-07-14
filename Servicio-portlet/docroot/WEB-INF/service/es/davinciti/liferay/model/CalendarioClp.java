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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import es.davinciti.liferay.service.CalendarioLocalServiceUtil;
import es.davinciti.liferay.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class CalendarioClp extends BaseModelImpl<Calendario>
	implements Calendario {
	public CalendarioClp() {
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

	@Override
	public long getCalendarioId() {
		return _calendarioId;
	}

	@Override
	public void setCalendarioId(long calendarioId) {
		_calendarioId = calendarioId;

		if (_calendarioRemoteModel != null) {
			try {
				Class<?> clazz = _calendarioRemoteModel.getClass();

				Method method = clazz.getMethod("setCalendarioId", long.class);

				method.invoke(_calendarioRemoteModel, calendarioId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_calendarioRemoteModel != null) {
			try {
				Class<?> clazz = _calendarioRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_calendarioRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_calendarioRemoteModel != null) {
			try {
				Class<?> clazz = _calendarioRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_calendarioRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public int getYear() {
		return _year;
	}

	@Override
	public void setYear(int year) {
		_year = year;

		if (_calendarioRemoteModel != null) {
			try {
				Class<?> clazz = _calendarioRemoteModel.getClass();

				Method method = clazz.getMethod("setYear", int.class);

				method.invoke(_calendarioRemoteModel, year);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCalendarJson() {
		return _calendarJson;
	}

	@Override
	public void setCalendarJson(String calendarJson) {
		_calendarJson = calendarJson;

		if (_calendarioRemoteModel != null) {
			try {
				Class<?> clazz = _calendarioRemoteModel.getClass();

				Method method = clazz.getMethod("setCalendarJson", String.class);

				method.invoke(_calendarioRemoteModel, calendarJson);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_calendarioRemoteModel != null) {
			try {
				Class<?> clazz = _calendarioRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_calendarioRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCalendarioRemoteModel() {
		return _calendarioRemoteModel;
	}

	public void setCalendarioRemoteModel(BaseModel<?> calendarioRemoteModel) {
		_calendarioRemoteModel = calendarioRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _calendarioRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_calendarioRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CalendarioLocalServiceUtil.addCalendario(this);
		}
		else {
			CalendarioLocalServiceUtil.updateCalendario(this);
		}
	}

	@Override
	public Calendario toEscapedModel() {
		return (Calendario)ProxyUtil.newProxyInstance(Calendario.class.getClassLoader(),
			new Class[] { Calendario.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CalendarioClp clone = new CalendarioClp();

		clone.setCalendarioId(getCalendarioId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setYear(getYear());
		clone.setCalendarJson(getCalendarJson());
		clone.setStatus(getStatus());

		return clone;
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

		if (!(obj instanceof CalendarioClp)) {
			return false;
		}

		CalendarioClp calendario = (CalendarioClp)obj;

		long primaryKey = calendario.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
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

	private long _calendarioId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private int _year;
	private String _calendarJson;
	private String _status;
	private BaseModel<?> _calendarioRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}