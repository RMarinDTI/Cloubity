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
import es.davinciti.liferay.service.NotaGastoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class NotaGastoClp extends BaseModelImpl<NotaGasto> implements NotaGasto {
	public NotaGastoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return NotaGasto.class;
	}

	@Override
	public String getModelClassName() {
		return NotaGasto.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _notagastoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNotagastoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _notagastoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("notagastoId", getNotagastoId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("description", getDescription());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("comments", getComments());
		attributes.put("status", getStatus());
		attributes.put("amount", getAmount());
		attributes.put("createDate", getCreateDate());
		attributes.put("updateDate", getUpdateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long notagastoId = (Long)attributes.get("notagastoId");

		if (notagastoId != null) {
			setNotagastoId(notagastoId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String startDate = (String)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		String endDate = (String)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String amount = (String)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		String createDate = (String)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String updateDate = (String)attributes.get("updateDate");

		if (updateDate != null) {
			setUpdateDate(updateDate);
		}
	}

	@Override
	public long getNotagastoId() {
		return _notagastoId;
	}

	@Override
	public void setNotagastoId(long notagastoId) {
		_notagastoId = notagastoId;

		if (_notaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _notaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setNotagastoId", long.class);

				method.invoke(_notaGastoRemoteModel, notagastoId);
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

		if (_notaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _notaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_notaGastoRemoteModel, companyId);
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

		if (_notaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _notaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_notaGastoRemoteModel, userId);
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
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_notaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _notaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_notaGastoRemoteModel, description);
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

		if (_notaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _notaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setStartDate", String.class);

				method.invoke(_notaGastoRemoteModel, startDate);
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

		if (_notaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _notaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setEndDate", String.class);

				method.invoke(_notaGastoRemoteModel, endDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getComments() {
		return _comments;
	}

	@Override
	public void setComments(String comments) {
		_comments = comments;

		if (_notaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _notaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setComments", String.class);

				method.invoke(_notaGastoRemoteModel, comments);
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

		if (_notaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _notaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_notaGastoRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAmount() {
		return _amount;
	}

	@Override
	public void setAmount(String amount) {
		_amount = amount;

		if (_notaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _notaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setAmount", String.class);

				method.invoke(_notaGastoRemoteModel, amount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(String createDate) {
		_createDate = createDate;

		if (_notaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _notaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", String.class);

				method.invoke(_notaGastoRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUpdateDate() {
		return _updateDate;
	}

	@Override
	public void setUpdateDate(String updateDate) {
		_updateDate = updateDate;

		if (_notaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _notaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdateDate", String.class);

				method.invoke(_notaGastoRemoteModel, updateDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getNotaGastoRemoteModel() {
		return _notaGastoRemoteModel;
	}

	public void setNotaGastoRemoteModel(BaseModel<?> notaGastoRemoteModel) {
		_notaGastoRemoteModel = notaGastoRemoteModel;
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

		Class<?> remoteModelClass = _notaGastoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_notaGastoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			NotaGastoLocalServiceUtil.addNotaGasto(this);
		}
		else {
			NotaGastoLocalServiceUtil.updateNotaGasto(this);
		}
	}

	@Override
	public NotaGasto toEscapedModel() {
		return (NotaGasto)ProxyUtil.newProxyInstance(NotaGasto.class.getClassLoader(),
			new Class[] { NotaGasto.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		NotaGastoClp clone = new NotaGastoClp();

		clone.setNotagastoId(getNotagastoId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setDescription(getDescription());
		clone.setStartDate(getStartDate());
		clone.setEndDate(getEndDate());
		clone.setComments(getComments());
		clone.setStatus(getStatus());
		clone.setAmount(getAmount());
		clone.setCreateDate(getCreateDate());
		clone.setUpdateDate(getUpdateDate());

		return clone;
	}

	@Override
	public int compareTo(NotaGasto notaGasto) {
		long primaryKey = notaGasto.getPrimaryKey();

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

		if (!(obj instanceof NotaGastoClp)) {
			return false;
		}

		NotaGastoClp notaGasto = (NotaGastoClp)obj;

		long primaryKey = notaGasto.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{notagastoId=");
		sb.append(getNotagastoId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", startDate=");
		sb.append(getStartDate());
		sb.append(", endDate=");
		sb.append(getEndDate());
		sb.append(", comments=");
		sb.append(getComments());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", amount=");
		sb.append(getAmount());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", updateDate=");
		sb.append(getUpdateDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.NotaGasto");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>notagastoId</column-name><column-value><![CDATA[");
		sb.append(getNotagastoId());
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
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
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
			"<column><column-name>comments</column-name><column-value><![CDATA[");
		sb.append(getComments());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount</column-name><column-value><![CDATA[");
		sb.append(getAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updateDate</column-name><column-value><![CDATA[");
		sb.append(getUpdateDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _notagastoId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _description;
	private String _startDate;
	private String _endDate;
	private String _comments;
	private String _status;
	private String _amount;
	private String _createDate;
	private String _updateDate;
	private BaseModel<?> _notaGastoRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}