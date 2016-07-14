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
import es.davinciti.liferay.service.LineaGastoProyectoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class LineaGastoProyectoClp extends BaseModelImpl<LineaGastoProyecto>
	implements LineaGastoProyecto {
	public LineaGastoProyectoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LineaGastoProyecto.class;
	}

	@Override
	public String getModelClassName() {
		return LineaGastoProyecto.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _proyectoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setProyectoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _proyectoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("proyectoId", getProyectoId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("codeName", getCodeName());
		attributes.put("sageCompanyId", getSageCompanyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long proyectoId = (Long)attributes.get("proyectoId");

		if (proyectoId != null) {
			setProyectoId(proyectoId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String codeName = (String)attributes.get("codeName");

		if (codeName != null) {
			setCodeName(codeName);
		}

		String sageCompanyId = (String)attributes.get("sageCompanyId");

		if (sageCompanyId != null) {
			setSageCompanyId(sageCompanyId);
		}
	}

	@Override
	public long getProyectoId() {
		return _proyectoId;
	}

	@Override
	public void setProyectoId(long proyectoId) {
		_proyectoId = proyectoId;

		if (_lineaGastoProyectoRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoProyectoRemoteModel.getClass();

				Method method = clazz.getMethod("setProyectoId", long.class);

				method.invoke(_lineaGastoProyectoRemoteModel, proyectoId);
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

		if (_lineaGastoProyectoRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoProyectoRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_lineaGastoProyectoRemoteModel, name);
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

		if (_lineaGastoProyectoRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoProyectoRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_lineaGastoProyectoRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCodeName() {
		return _codeName;
	}

	@Override
	public void setCodeName(String codeName) {
		_codeName = codeName;

		if (_lineaGastoProyectoRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoProyectoRemoteModel.getClass();

				Method method = clazz.getMethod("setCodeName", String.class);

				method.invoke(_lineaGastoProyectoRemoteModel, codeName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSageCompanyId() {
		return _sageCompanyId;
	}

	@Override
	public void setSageCompanyId(String sageCompanyId) {
		_sageCompanyId = sageCompanyId;

		if (_lineaGastoProyectoRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoProyectoRemoteModel.getClass();

				Method method = clazz.getMethod("setSageCompanyId", String.class);

				method.invoke(_lineaGastoProyectoRemoteModel, sageCompanyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLineaGastoProyectoRemoteModel() {
		return _lineaGastoProyectoRemoteModel;
	}

	public void setLineaGastoProyectoRemoteModel(
		BaseModel<?> lineaGastoProyectoRemoteModel) {
		_lineaGastoProyectoRemoteModel = lineaGastoProyectoRemoteModel;
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

		Class<?> remoteModelClass = _lineaGastoProyectoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_lineaGastoProyectoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LineaGastoProyectoLocalServiceUtil.addLineaGastoProyecto(this);
		}
		else {
			LineaGastoProyectoLocalServiceUtil.updateLineaGastoProyecto(this);
		}
	}

	@Override
	public LineaGastoProyecto toEscapedModel() {
		return (LineaGastoProyecto)ProxyUtil.newProxyInstance(LineaGastoProyecto.class.getClassLoader(),
			new Class[] { LineaGastoProyecto.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LineaGastoProyectoClp clone = new LineaGastoProyectoClp();

		clone.setProyectoId(getProyectoId());
		clone.setName(getName());
		clone.setDescription(getDescription());
		clone.setCodeName(getCodeName());
		clone.setSageCompanyId(getSageCompanyId());

		return clone;
	}

	@Override
	public int compareTo(LineaGastoProyecto lineaGastoProyecto) {
		long primaryKey = lineaGastoProyecto.getPrimaryKey();

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

		if (!(obj instanceof LineaGastoProyectoClp)) {
			return false;
		}

		LineaGastoProyectoClp lineaGastoProyecto = (LineaGastoProyectoClp)obj;

		long primaryKey = lineaGastoProyecto.getPrimaryKey();

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

		sb.append("{proyectoId=");
		sb.append(getProyectoId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", codeName=");
		sb.append(getCodeName());
		sb.append(", sageCompanyId=");
		sb.append(getSageCompanyId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.LineaGastoProyecto");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>proyectoId</column-name><column-value><![CDATA[");
		sb.append(getProyectoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>codeName</column-name><column-value><![CDATA[");
		sb.append(getCodeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sageCompanyId</column-name><column-value><![CDATA[");
		sb.append(getSageCompanyId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _proyectoId;
	private String _name;
	private String _description;
	private String _codeName;
	private String _sageCompanyId;
	private BaseModel<?> _lineaGastoProyectoRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}