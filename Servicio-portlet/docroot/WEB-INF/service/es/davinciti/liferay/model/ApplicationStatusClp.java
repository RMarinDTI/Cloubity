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

import es.davinciti.liferay.service.ApplicationStatusLocalServiceUtil;
import es.davinciti.liferay.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class ApplicationStatusClp extends BaseModelImpl<ApplicationStatus>
	implements ApplicationStatus {
	public ApplicationStatusClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ApplicationStatus.class;
	}

	@Override
	public String getModelClassName() {
		return ApplicationStatus.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _applicationStatusId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setApplicationStatusId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _applicationStatusId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("applicationStatusId", getApplicationStatusId());
		attributes.put("applicationName", getApplicationName());
		attributes.put("statusId", getStatusId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long applicationStatusId = (Long)attributes.get("applicationStatusId");

		if (applicationStatusId != null) {
			setApplicationStatusId(applicationStatusId);
		}

		String applicationName = (String)attributes.get("applicationName");

		if (applicationName != null) {
			setApplicationName(applicationName);
		}

		String statusId = (String)attributes.get("statusId");

		if (statusId != null) {
			setStatusId(statusId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public long getApplicationStatusId() {
		return _applicationStatusId;
	}

	@Override
	public void setApplicationStatusId(long applicationStatusId) {
		_applicationStatusId = applicationStatusId;

		if (_applicationStatusRemoteModel != null) {
			try {
				Class<?> clazz = _applicationStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicationStatusId",
						long.class);

				method.invoke(_applicationStatusRemoteModel, applicationStatusId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApplicationName() {
		return _applicationName;
	}

	@Override
	public void setApplicationName(String applicationName) {
		_applicationName = applicationName;

		if (_applicationStatusRemoteModel != null) {
			try {
				Class<?> clazz = _applicationStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicationName",
						String.class);

				method.invoke(_applicationStatusRemoteModel, applicationName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatusId() {
		return _statusId;
	}

	@Override
	public void setStatusId(String statusId) {
		_statusId = statusId;

		if (_applicationStatusRemoteModel != null) {
			try {
				Class<?> clazz = _applicationStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusId", String.class);

				method.invoke(_applicationStatusRemoteModel, statusId);
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

		if (_applicationStatusRemoteModel != null) {
			try {
				Class<?> clazz = _applicationStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_applicationStatusRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_applicationStatusRemoteModel != null) {
			try {
				Class<?> clazz = _applicationStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_applicationStatusRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getApplicationStatusRemoteModel() {
		return _applicationStatusRemoteModel;
	}

	public void setApplicationStatusRemoteModel(
		BaseModel<?> applicationStatusRemoteModel) {
		_applicationStatusRemoteModel = applicationStatusRemoteModel;
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

		Class<?> remoteModelClass = _applicationStatusRemoteModel.getClass();

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

		Object returnValue = method.invoke(_applicationStatusRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ApplicationStatusLocalServiceUtil.addApplicationStatus(this);
		}
		else {
			ApplicationStatusLocalServiceUtil.updateApplicationStatus(this);
		}
	}

	@Override
	public ApplicationStatus toEscapedModel() {
		return (ApplicationStatus)ProxyUtil.newProxyInstance(ApplicationStatus.class.getClassLoader(),
			new Class[] { ApplicationStatus.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ApplicationStatusClp clone = new ApplicationStatusClp();

		clone.setApplicationStatusId(getApplicationStatusId());
		clone.setApplicationName(getApplicationName());
		clone.setStatusId(getStatusId());
		clone.setName(getName());
		clone.setDescription(getDescription());

		return clone;
	}

	@Override
	public int compareTo(ApplicationStatus applicationStatus) {
		long primaryKey = applicationStatus.getPrimaryKey();

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

		if (!(obj instanceof ApplicationStatusClp)) {
			return false;
		}

		ApplicationStatusClp applicationStatus = (ApplicationStatusClp)obj;

		long primaryKey = applicationStatus.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{applicationStatusId=");
		sb.append(getApplicationStatusId());
		sb.append(", applicationName=");
		sb.append(getApplicationName());
		sb.append(", statusId=");
		sb.append(getStatusId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.ApplicationStatus");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>applicationStatusId</column-name><column-value><![CDATA[");
		sb.append(getApplicationStatusId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicationName</column-name><column-value><![CDATA[");
		sb.append(getApplicationName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusId</column-name><column-value><![CDATA[");
		sb.append(getStatusId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _applicationStatusId;
	private String _applicationName;
	private String _statusId;
	private String _name;
	private String _description;
	private BaseModel<?> _applicationStatusRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}