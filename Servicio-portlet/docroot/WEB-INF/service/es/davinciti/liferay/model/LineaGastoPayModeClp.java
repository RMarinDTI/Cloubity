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
import es.davinciti.liferay.service.LineaGastoPayModeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class LineaGastoPayModeClp extends BaseModelImpl<LineaGastoPayMode>
	implements LineaGastoPayMode {
	public LineaGastoPayModeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LineaGastoPayMode.class;
	}

	@Override
	public String getModelClassName() {
		return LineaGastoPayMode.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _paymodeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPaymodeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _paymodeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("paymodeId", getPaymodeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long paymodeId = (Long)attributes.get("paymodeId");

		if (paymodeId != null) {
			setPaymodeId(paymodeId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
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
	public long getPaymodeId() {
		return _paymodeId;
	}

	@Override
	public void setPaymodeId(long paymodeId) {
		_paymodeId = paymodeId;

		if (_lineaGastoPayModeRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoPayModeRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymodeId", long.class);

				method.invoke(_lineaGastoPayModeRemoteModel, paymodeId);
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

		if (_lineaGastoPayModeRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoPayModeRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_lineaGastoPayModeRemoteModel, companyId);
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

		if (_lineaGastoPayModeRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoPayModeRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_lineaGastoPayModeRemoteModel, name);
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

		if (_lineaGastoPayModeRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoPayModeRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_lineaGastoPayModeRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLineaGastoPayModeRemoteModel() {
		return _lineaGastoPayModeRemoteModel;
	}

	public void setLineaGastoPayModeRemoteModel(
		BaseModel<?> lineaGastoPayModeRemoteModel) {
		_lineaGastoPayModeRemoteModel = lineaGastoPayModeRemoteModel;
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

		Class<?> remoteModelClass = _lineaGastoPayModeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_lineaGastoPayModeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LineaGastoPayModeLocalServiceUtil.addLineaGastoPayMode(this);
		}
		else {
			LineaGastoPayModeLocalServiceUtil.updateLineaGastoPayMode(this);
		}
	}

	@Override
	public LineaGastoPayMode toEscapedModel() {
		return (LineaGastoPayMode)ProxyUtil.newProxyInstance(LineaGastoPayMode.class.getClassLoader(),
			new Class[] { LineaGastoPayMode.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LineaGastoPayModeClp clone = new LineaGastoPayModeClp();

		clone.setPaymodeId(getPaymodeId());
		clone.setCompanyId(getCompanyId());
		clone.setName(getName());
		clone.setDescription(getDescription());

		return clone;
	}

	@Override
	public int compareTo(LineaGastoPayMode lineaGastoPayMode) {
		long primaryKey = lineaGastoPayMode.getPrimaryKey();

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

		if (!(obj instanceof LineaGastoPayModeClp)) {
			return false;
		}

		LineaGastoPayModeClp lineaGastoPayMode = (LineaGastoPayModeClp)obj;

		long primaryKey = lineaGastoPayMode.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{paymodeId=");
		sb.append(getPaymodeId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.LineaGastoPayMode");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>paymodeId</column-name><column-value><![CDATA[");
		sb.append(getPaymodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
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

	private long _paymodeId;
	private long _companyId;
	private String _name;
	private String _description;
	private BaseModel<?> _lineaGastoPayModeRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}