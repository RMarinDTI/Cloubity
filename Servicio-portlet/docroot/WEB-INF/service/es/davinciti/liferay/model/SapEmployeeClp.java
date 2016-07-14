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

import es.davinciti.liferay.service.ClpSerializer;
import es.davinciti.liferay.service.SapEmployeeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class SapEmployeeClp extends BaseModelImpl<SapEmployee>
	implements SapEmployee {
	public SapEmployeeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return SapEmployee.class;
	}

	@Override
	public String getModelClassName() {
		return SapEmployee.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _sapEmployeeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSapEmployeeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sapEmployeeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sapEmployeeId", getSapEmployeeId());
		attributes.put("employeeID", getEmployeeID());
		attributes.put("userId", getUserId());
		attributes.put("middleName", getMiddleName());
		attributes.put("gender", getGender());
		attributes.put("jobTitle", getJobTitle());
		attributes.put("employeeType", getEmployeeType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sapEmployeeId = (Long)attributes.get("sapEmployeeId");

		if (sapEmployeeId != null) {
			setSapEmployeeId(sapEmployeeId);
		}

		Long employeeID = (Long)attributes.get("employeeID");

		if (employeeID != null) {
			setEmployeeID(employeeID);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String jobTitle = (String)attributes.get("jobTitle");

		if (jobTitle != null) {
			setJobTitle(jobTitle);
		}

		String employeeType = (String)attributes.get("employeeType");

		if (employeeType != null) {
			setEmployeeType(employeeType);
		}
	}

	@Override
	public long getSapEmployeeId() {
		return _sapEmployeeId;
	}

	@Override
	public void setSapEmployeeId(long sapEmployeeId) {
		_sapEmployeeId = sapEmployeeId;

		if (_sapEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _sapEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setSapEmployeeId", long.class);

				method.invoke(_sapEmployeeRemoteModel, sapEmployeeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEmployeeID() {
		return _employeeID;
	}

	@Override
	public void setEmployeeID(long employeeID) {
		_employeeID = employeeID;

		if (_sapEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _sapEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeID", long.class);

				method.invoke(_sapEmployeeRemoteModel, employeeID);
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

		if (_sapEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _sapEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_sapEmployeeRemoteModel, userId);
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
	public String getMiddleName() {
		return _middleName;
	}

	@Override
	public void setMiddleName(String middleName) {
		_middleName = middleName;

		if (_sapEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _sapEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setMiddleName", String.class);

				method.invoke(_sapEmployeeRemoteModel, middleName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGender() {
		return _gender;
	}

	@Override
	public void setGender(String gender) {
		_gender = gender;

		if (_sapEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _sapEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", String.class);

				method.invoke(_sapEmployeeRemoteModel, gender);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getJobTitle() {
		return _jobTitle;
	}

	@Override
	public void setJobTitle(String jobTitle) {
		_jobTitle = jobTitle;

		if (_sapEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _sapEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setJobTitle", String.class);

				method.invoke(_sapEmployeeRemoteModel, jobTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmployeeType() {
		return _employeeType;
	}

	@Override
	public void setEmployeeType(String employeeType) {
		_employeeType = employeeType;

		if (_sapEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _sapEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeType", String.class);

				method.invoke(_sapEmployeeRemoteModel, employeeType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSapEmployeeRemoteModel() {
		return _sapEmployeeRemoteModel;
	}

	public void setSapEmployeeRemoteModel(BaseModel<?> sapEmployeeRemoteModel) {
		_sapEmployeeRemoteModel = sapEmployeeRemoteModel;
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

		Class<?> remoteModelClass = _sapEmployeeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_sapEmployeeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SapEmployeeLocalServiceUtil.addSapEmployee(this);
		}
		else {
			SapEmployeeLocalServiceUtil.updateSapEmployee(this);
		}
	}

	@Override
	public SapEmployee toEscapedModel() {
		return (SapEmployee)ProxyUtil.newProxyInstance(SapEmployee.class.getClassLoader(),
			new Class[] { SapEmployee.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SapEmployeeClp clone = new SapEmployeeClp();

		clone.setSapEmployeeId(getSapEmployeeId());
		clone.setEmployeeID(getEmployeeID());
		clone.setUserId(getUserId());
		clone.setMiddleName(getMiddleName());
		clone.setGender(getGender());
		clone.setJobTitle(getJobTitle());
		clone.setEmployeeType(getEmployeeType());

		return clone;
	}

	@Override
	public int compareTo(SapEmployee sapEmployee) {
		long primaryKey = sapEmployee.getPrimaryKey();

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

		if (!(obj instanceof SapEmployeeClp)) {
			return false;
		}

		SapEmployeeClp sapEmployee = (SapEmployeeClp)obj;

		long primaryKey = sapEmployee.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{sapEmployeeId=");
		sb.append(getSapEmployeeId());
		sb.append(", employeeID=");
		sb.append(getEmployeeID());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", middleName=");
		sb.append(getMiddleName());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", jobTitle=");
		sb.append(getJobTitle());
		sb.append(", employeeType=");
		sb.append(getEmployeeType());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.SapEmployee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sapEmployeeId</column-name><column-value><![CDATA[");
		sb.append(getSapEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeID</column-name><column-value><![CDATA[");
		sb.append(getEmployeeID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>middleName</column-name><column-value><![CDATA[");
		sb.append(getMiddleName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobTitle</column-name><column-value><![CDATA[");
		sb.append(getJobTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeType</column-name><column-value><![CDATA[");
		sb.append(getEmployeeType());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _sapEmployeeId;
	private long _employeeID;
	private long _userId;
	private String _userUuid;
	private String _middleName;
	private String _gender;
	private String _jobTitle;
	private String _employeeType;
	private BaseModel<?> _sapEmployeeRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}