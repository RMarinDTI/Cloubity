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
import es.davinciti.liferay.service.SageEmployeeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class SageEmployeeClp extends BaseModelImpl<SageEmployee>
	implements SageEmployee {
	public SageEmployeeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return SageEmployee.class;
	}

	@Override
	public String getModelClassName() {
		return SageEmployee.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _sageEmployeeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSageEmployeeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sageEmployeeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sageEmployeeId", getSageEmployeeId());
		attributes.put("userId", getUserId());
		attributes.put("employeeID", getEmployeeID());
		attributes.put("applicationId", getApplicationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("personId", getPersonId());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("seniority", getSeniority());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sageEmployeeId = (Long)attributes.get("sageEmployeeId");

		if (sageEmployeeId != null) {
			setSageEmployeeId(sageEmployeeId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String employeeID = (String)attributes.get("employeeID");

		if (employeeID != null) {
			setEmployeeID(employeeID);
		}

		String applicationId = (String)attributes.get("applicationId");

		if (applicationId != null) {
			setApplicationId(applicationId);
		}

		String companyId = (String)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String personId = (String)attributes.get("personId");

		if (personId != null) {
			setPersonId(personId);
		}

		String startDate = (String)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		String endDate = (String)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		String seniority = (String)attributes.get("seniority");

		if (seniority != null) {
			setSeniority(seniority);
		}
	}

	@Override
	public long getSageEmployeeId() {
		return _sageEmployeeId;
	}

	@Override
	public void setSageEmployeeId(long sageEmployeeId) {
		_sageEmployeeId = sageEmployeeId;

		if (_sageEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _sageEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setSageEmployeeId", long.class);

				method.invoke(_sageEmployeeRemoteModel, sageEmployeeId);
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

		if (_sageEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _sageEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_sageEmployeeRemoteModel, userId);
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
	public String getEmployeeID() {
		return _employeeID;
	}

	@Override
	public void setEmployeeID(String employeeID) {
		_employeeID = employeeID;

		if (_sageEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _sageEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeID", String.class);

				method.invoke(_sageEmployeeRemoteModel, employeeID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApplicationId() {
		return _applicationId;
	}

	@Override
	public void setApplicationId(String applicationId) {
		_applicationId = applicationId;

		if (_sageEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _sageEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicationId", String.class);

				method.invoke(_sageEmployeeRemoteModel, applicationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(String companyId) {
		_companyId = companyId;

		if (_sageEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _sageEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", String.class);

				method.invoke(_sageEmployeeRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPersonId() {
		return _personId;
	}

	@Override
	public void setPersonId(String personId) {
		_personId = personId;

		if (_sageEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _sageEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setPersonId", String.class);

				method.invoke(_sageEmployeeRemoteModel, personId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStartDate() {
		return _startDate;
	}

	@Override
	public void setStartDate(String startDate) {
		_startDate = startDate;

		if (_sageEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _sageEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setStartDate", String.class);

				method.invoke(_sageEmployeeRemoteModel, startDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEndDate() {
		return _endDate;
	}

	@Override
	public void setEndDate(String endDate) {
		_endDate = endDate;

		if (_sageEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _sageEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setEndDate", String.class);

				method.invoke(_sageEmployeeRemoteModel, endDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSeniority() {
		return _seniority;
	}

	@Override
	public void setSeniority(String seniority) {
		_seniority = seniority;

		if (_sageEmployeeRemoteModel != null) {
			try {
				Class<?> clazz = _sageEmployeeRemoteModel.getClass();

				Method method = clazz.getMethod("setSeniority", String.class);

				method.invoke(_sageEmployeeRemoteModel, seniority);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSageEmployeeRemoteModel() {
		return _sageEmployeeRemoteModel;
	}

	public void setSageEmployeeRemoteModel(BaseModel<?> sageEmployeeRemoteModel) {
		_sageEmployeeRemoteModel = sageEmployeeRemoteModel;
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

		Class<?> remoteModelClass = _sageEmployeeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_sageEmployeeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SageEmployeeLocalServiceUtil.addSageEmployee(this);
		}
		else {
			SageEmployeeLocalServiceUtil.updateSageEmployee(this);
		}
	}

	@Override
	public SageEmployee toEscapedModel() {
		return (SageEmployee)ProxyUtil.newProxyInstance(SageEmployee.class.getClassLoader(),
			new Class[] { SageEmployee.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SageEmployeeClp clone = new SageEmployeeClp();

		clone.setSageEmployeeId(getSageEmployeeId());
		clone.setUserId(getUserId());
		clone.setEmployeeID(getEmployeeID());
		clone.setApplicationId(getApplicationId());
		clone.setCompanyId(getCompanyId());
		clone.setPersonId(getPersonId());
		clone.setStartDate(getStartDate());
		clone.setEndDate(getEndDate());
		clone.setSeniority(getSeniority());

		return clone;
	}

	@Override
	public int compareTo(SageEmployee sageEmployee) {
		long primaryKey = sageEmployee.getPrimaryKey();

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

		if (!(obj instanceof SageEmployeeClp)) {
			return false;
		}

		SageEmployeeClp sageEmployee = (SageEmployeeClp)obj;

		long primaryKey = sageEmployee.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{sageEmployeeId=");
		sb.append(getSageEmployeeId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", employeeID=");
		sb.append(getEmployeeID());
		sb.append(", applicationId=");
		sb.append(getApplicationId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", personId=");
		sb.append(getPersonId());
		sb.append(", startDate=");
		sb.append(getStartDate());
		sb.append(", endDate=");
		sb.append(getEndDate());
		sb.append(", seniority=");
		sb.append(getSeniority());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.SageEmployee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sageEmployeeId</column-name><column-value><![CDATA[");
		sb.append(getSageEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeID</column-name><column-value><![CDATA[");
		sb.append(getEmployeeID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicationId</column-name><column-value><![CDATA[");
		sb.append(getApplicationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personId</column-name><column-value><![CDATA[");
		sb.append(getPersonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startDate</column-name><column-value><![CDATA[");
		sb.append(getStartDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endDate</column-name><column-value><![CDATA[");
		sb.append(getEndDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>seniority</column-name><column-value><![CDATA[");
		sb.append(getSeniority());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _sageEmployeeId;
	private long _userId;
	private String _userUuid;
	private String _employeeID;
	private String _applicationId;
	private String _companyId;
	private String _personId;
	private String _startDate;
	private String _endDate;
	private String _seniority;
	private BaseModel<?> _sageEmployeeRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}