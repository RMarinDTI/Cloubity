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
import es.davinciti.liferay.service.LineaGastoClienteLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class LineaGastoClienteClp extends BaseModelImpl<LineaGastoCliente>
	implements LineaGastoCliente {
	public LineaGastoClienteClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LineaGastoCliente.class;
	}

	@Override
	public String getModelClassName() {
		return LineaGastoCliente.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _clienteId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setClienteId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _clienteId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("clienteId", getClienteId());
		attributes.put("companyId", getCompanyId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long clienteId = (Long)attributes.get("clienteId");

		if (clienteId != null) {
			setClienteId(clienteId);
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
	public long getClienteId() {
		return _clienteId;
	}

	@Override
	public void setClienteId(long clienteId) {
		_clienteId = clienteId;

		if (_lineaGastoClienteRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoClienteRemoteModel.getClass();

				Method method = clazz.getMethod("setClienteId", long.class);

				method.invoke(_lineaGastoClienteRemoteModel, clienteId);
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

		if (_lineaGastoClienteRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoClienteRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_lineaGastoClienteRemoteModel, companyId);
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

		if (_lineaGastoClienteRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoClienteRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_lineaGastoClienteRemoteModel, name);
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

		if (_lineaGastoClienteRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoClienteRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_lineaGastoClienteRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLineaGastoClienteRemoteModel() {
		return _lineaGastoClienteRemoteModel;
	}

	public void setLineaGastoClienteRemoteModel(
		BaseModel<?> lineaGastoClienteRemoteModel) {
		_lineaGastoClienteRemoteModel = lineaGastoClienteRemoteModel;
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

		Class<?> remoteModelClass = _lineaGastoClienteRemoteModel.getClass();

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

		Object returnValue = method.invoke(_lineaGastoClienteRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LineaGastoClienteLocalServiceUtil.addLineaGastoCliente(this);
		}
		else {
			LineaGastoClienteLocalServiceUtil.updateLineaGastoCliente(this);
		}
	}

	@Override
	public LineaGastoCliente toEscapedModel() {
		return (LineaGastoCliente)ProxyUtil.newProxyInstance(LineaGastoCliente.class.getClassLoader(),
			new Class[] { LineaGastoCliente.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LineaGastoClienteClp clone = new LineaGastoClienteClp();

		clone.setClienteId(getClienteId());
		clone.setCompanyId(getCompanyId());
		clone.setName(getName());
		clone.setDescription(getDescription());

		return clone;
	}

	@Override
	public int compareTo(LineaGastoCliente lineaGastoCliente) {
		long primaryKey = lineaGastoCliente.getPrimaryKey();

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

		if (!(obj instanceof LineaGastoClienteClp)) {
			return false;
		}

		LineaGastoClienteClp lineaGastoCliente = (LineaGastoClienteClp)obj;

		long primaryKey = lineaGastoCliente.getPrimaryKey();

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

		sb.append("{clienteId=");
		sb.append(getClienteId());
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
		sb.append("es.davinciti.liferay.model.LineaGastoCliente");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>clienteId</column-name><column-value><![CDATA[");
		sb.append(getClienteId());
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

	private long _clienteId;
	private long _companyId;
	private String _name;
	private String _description;
	private BaseModel<?> _lineaGastoClienteRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}