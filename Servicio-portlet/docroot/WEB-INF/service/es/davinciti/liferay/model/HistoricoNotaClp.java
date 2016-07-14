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
import es.davinciti.liferay.service.HistoricoNotaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class HistoricoNotaClp extends BaseModelImpl<HistoricoNota>
	implements HistoricoNota {
	public HistoricoNotaClp() {
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

	@Override
	public long getHistoriconotaId() {
		return _historiconotaId;
	}

	@Override
	public void setHistoriconotaId(long historiconotaId) {
		_historiconotaId = historiconotaId;

		if (_historicoNotaRemoteModel != null) {
			try {
				Class<?> clazz = _historicoNotaRemoteModel.getClass();

				Method method = clazz.getMethod("setHistoriconotaId", long.class);

				method.invoke(_historicoNotaRemoteModel, historiconotaId);
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

		if (_historicoNotaRemoteModel != null) {
			try {
				Class<?> clazz = _historicoNotaRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_historicoNotaRemoteModel, companyId);
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

		if (_historicoNotaRemoteModel != null) {
			try {
				Class<?> clazz = _historicoNotaRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_historicoNotaRemoteModel, userId);
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
	public String getComments() {
		return _comments;
	}

	@Override
	public void setComments(String comments) {
		_comments = comments;

		if (_historicoNotaRemoteModel != null) {
			try {
				Class<?> clazz = _historicoNotaRemoteModel.getClass();

				Method method = clazz.getMethod("setComments", String.class);

				method.invoke(_historicoNotaRemoteModel, comments);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUpdateAt() {
		return _updateAt;
	}

	@Override
	public void setUpdateAt(String updateAt) {
		_updateAt = updateAt;

		if (_historicoNotaRemoteModel != null) {
			try {
				Class<?> clazz = _historicoNotaRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdateAt", String.class);

				method.invoke(_historicoNotaRemoteModel, updateAt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPrevStatus() {
		return _prevStatus;
	}

	@Override
	public void setPrevStatus(String prevStatus) {
		_prevStatus = prevStatus;

		if (_historicoNotaRemoteModel != null) {
			try {
				Class<?> clazz = _historicoNotaRemoteModel.getClass();

				Method method = clazz.getMethod("setPrevStatus", String.class);

				method.invoke(_historicoNotaRemoteModel, prevStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNewStatus() {
		return _newStatus;
	}

	@Override
	public void setNewStatus(String newStatus) {
		_newStatus = newStatus;

		if (_historicoNotaRemoteModel != null) {
			try {
				Class<?> clazz = _historicoNotaRemoteModel.getClass();

				Method method = clazz.getMethod("setNewStatus", String.class);

				method.invoke(_historicoNotaRemoteModel, newStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getHistoricoNotaRemoteModel() {
		return _historicoNotaRemoteModel;
	}

	public void setHistoricoNotaRemoteModel(
		BaseModel<?> historicoNotaRemoteModel) {
		_historicoNotaRemoteModel = historicoNotaRemoteModel;
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

		Class<?> remoteModelClass = _historicoNotaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_historicoNotaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			HistoricoNotaLocalServiceUtil.addHistoricoNota(this);
		}
		else {
			HistoricoNotaLocalServiceUtil.updateHistoricoNota(this);
		}
	}

	@Override
	public HistoricoNota toEscapedModel() {
		return (HistoricoNota)ProxyUtil.newProxyInstance(HistoricoNota.class.getClassLoader(),
			new Class[] { HistoricoNota.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		HistoricoNotaClp clone = new HistoricoNotaClp();

		clone.setHistoriconotaId(getHistoriconotaId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setComments(getComments());
		clone.setUpdateAt(getUpdateAt());
		clone.setPrevStatus(getPrevStatus());
		clone.setNewStatus(getNewStatus());

		return clone;
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

		if (!(obj instanceof HistoricoNotaClp)) {
			return false;
		}

		HistoricoNotaClp historicoNota = (HistoricoNotaClp)obj;

		long primaryKey = historicoNota.getPrimaryKey();

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

	private long _historiconotaId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _comments;
	private String _updateAt;
	private String _prevStatus;
	private String _newStatus;
	private BaseModel<?> _historicoNotaRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}