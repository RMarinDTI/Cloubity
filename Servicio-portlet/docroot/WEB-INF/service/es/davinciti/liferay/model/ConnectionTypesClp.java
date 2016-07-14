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

import es.davinciti.liferay.service.ClpSerializer;
import es.davinciti.liferay.service.ConnectionTypesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class ConnectionTypesClp extends BaseModelImpl<ConnectionTypes>
	implements ConnectionTypes {
	public ConnectionTypesClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ConnectionTypes.class;
	}

	@Override
	public String getModelClassName() {
		return ConnectionTypes.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _connectionTypeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setConnectionTypeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _connectionTypeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("connectionTypeId", getConnectionTypeId());
		attributes.put("name", getName());
		attributes.put("disableDate", getDisableDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long connectionTypeId = (Long)attributes.get("connectionTypeId");

		if (connectionTypeId != null) {
			setConnectionTypeId(connectionTypeId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Date disableDate = (Date)attributes.get("disableDate");

		if (disableDate != null) {
			setDisableDate(disableDate);
		}
	}

	@Override
	public long getConnectionTypeId() {
		return _connectionTypeId;
	}

	@Override
	public void setConnectionTypeId(long connectionTypeId) {
		_connectionTypeId = connectionTypeId;

		if (_connectionTypesRemoteModel != null) {
			try {
				Class<?> clazz = _connectionTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setConnectionTypeId",
						long.class);

				method.invoke(_connectionTypesRemoteModel, connectionTypeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_connectionTypesRemoteModel != null) {
			try {
				Class<?> clazz = _connectionTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_connectionTypesRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDisableDate() {
		return _disableDate;
	}

	@Override
	public void setDisableDate(Date disableDate) {
		_disableDate = disableDate;

		if (_connectionTypesRemoteModel != null) {
			try {
				Class<?> clazz = _connectionTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setDisableDate", Date.class);

				method.invoke(_connectionTypesRemoteModel, disableDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getConnectionTypesRemoteModel() {
		return _connectionTypesRemoteModel;
	}

	public void setConnectionTypesRemoteModel(
		BaseModel<?> connectionTypesRemoteModel) {
		_connectionTypesRemoteModel = connectionTypesRemoteModel;
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

		Class<?> remoteModelClass = _connectionTypesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_connectionTypesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ConnectionTypesLocalServiceUtil.addConnectionTypes(this);
		}
		else {
			ConnectionTypesLocalServiceUtil.updateConnectionTypes(this);
		}
	}

	@Override
	public ConnectionTypes toEscapedModel() {
		return (ConnectionTypes)ProxyUtil.newProxyInstance(ConnectionTypes.class.getClassLoader(),
			new Class[] { ConnectionTypes.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ConnectionTypesClp clone = new ConnectionTypesClp();

		clone.setConnectionTypeId(getConnectionTypeId());
		clone.setName(getName());
		clone.setDisableDate(getDisableDate());

		return clone;
	}

	@Override
	public int compareTo(ConnectionTypes connectionTypes) {
		long primaryKey = connectionTypes.getPrimaryKey();

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

		if (!(obj instanceof ConnectionTypesClp)) {
			return false;
		}

		ConnectionTypesClp connectionTypes = (ConnectionTypesClp)obj;

		long primaryKey = connectionTypes.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{connectionTypeId=");
		sb.append(getConnectionTypeId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", disableDate=");
		sb.append(getDisableDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.ConnectionTypes");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>connectionTypeId</column-name><column-value><![CDATA[");
		sb.append(getConnectionTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>disableDate</column-name><column-value><![CDATA[");
		sb.append(getDisableDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _connectionTypeId;
	private String _name;
	private Date _disableDate;
	private BaseModel<?> _connectionTypesRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}