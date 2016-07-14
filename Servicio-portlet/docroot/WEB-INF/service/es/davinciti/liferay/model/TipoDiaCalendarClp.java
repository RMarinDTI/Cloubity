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
import es.davinciti.liferay.service.TipoDiaCalendarLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class TipoDiaCalendarClp extends BaseModelImpl<TipoDiaCalendar>
	implements TipoDiaCalendar {
	public TipoDiaCalendarClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TipoDiaCalendar.class;
	}

	@Override
	public String getModelClassName() {
		return TipoDiaCalendar.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _tipoDiaCalendarId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTipoDiaCalendarId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tipoDiaCalendarId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tipoDiaCalendarId", getTipoDiaCalendarId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("fondoColor", getFondoColor());
		attributes.put("letraColor", getLetraColor());
		attributes.put("strong", getStrong());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tipoDiaCalendarId = (Long)attributes.get("tipoDiaCalendarId");

		if (tipoDiaCalendarId != null) {
			setTipoDiaCalendarId(tipoDiaCalendarId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String fondoColor = (String)attributes.get("fondoColor");

		if (fondoColor != null) {
			setFondoColor(fondoColor);
		}

		String letraColor = (String)attributes.get("letraColor");

		if (letraColor != null) {
			setLetraColor(letraColor);
		}

		String strong = (String)attributes.get("strong");

		if (strong != null) {
			setStrong(strong);
		}
	}

	@Override
	public long getTipoDiaCalendarId() {
		return _tipoDiaCalendarId;
	}

	@Override
	public void setTipoDiaCalendarId(long tipoDiaCalendarId) {
		_tipoDiaCalendarId = tipoDiaCalendarId;

		if (_tipoDiaCalendarRemoteModel != null) {
			try {
				Class<?> clazz = _tipoDiaCalendarRemoteModel.getClass();

				Method method = clazz.getMethod("setTipoDiaCalendarId",
						long.class);

				method.invoke(_tipoDiaCalendarRemoteModel, tipoDiaCalendarId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescripcion() {
		return _descripcion;
	}

	@Override
	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;

		if (_tipoDiaCalendarRemoteModel != null) {
			try {
				Class<?> clazz = _tipoDiaCalendarRemoteModel.getClass();

				Method method = clazz.getMethod("setDescripcion", String.class);

				method.invoke(_tipoDiaCalendarRemoteModel, descripcion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFondoColor() {
		return _fondoColor;
	}

	@Override
	public void setFondoColor(String fondoColor) {
		_fondoColor = fondoColor;

		if (_tipoDiaCalendarRemoteModel != null) {
			try {
				Class<?> clazz = _tipoDiaCalendarRemoteModel.getClass();

				Method method = clazz.getMethod("setFondoColor", String.class);

				method.invoke(_tipoDiaCalendarRemoteModel, fondoColor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLetraColor() {
		return _letraColor;
	}

	@Override
	public void setLetraColor(String letraColor) {
		_letraColor = letraColor;

		if (_tipoDiaCalendarRemoteModel != null) {
			try {
				Class<?> clazz = _tipoDiaCalendarRemoteModel.getClass();

				Method method = clazz.getMethod("setLetraColor", String.class);

				method.invoke(_tipoDiaCalendarRemoteModel, letraColor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStrong() {
		return _strong;
	}

	@Override
	public void setStrong(String strong) {
		_strong = strong;

		if (_tipoDiaCalendarRemoteModel != null) {
			try {
				Class<?> clazz = _tipoDiaCalendarRemoteModel.getClass();

				Method method = clazz.getMethod("setStrong", String.class);

				method.invoke(_tipoDiaCalendarRemoteModel, strong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTipoDiaCalendarRemoteModel() {
		return _tipoDiaCalendarRemoteModel;
	}

	public void setTipoDiaCalendarRemoteModel(
		BaseModel<?> tipoDiaCalendarRemoteModel) {
		_tipoDiaCalendarRemoteModel = tipoDiaCalendarRemoteModel;
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

		Class<?> remoteModelClass = _tipoDiaCalendarRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tipoDiaCalendarRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TipoDiaCalendarLocalServiceUtil.addTipoDiaCalendar(this);
		}
		else {
			TipoDiaCalendarLocalServiceUtil.updateTipoDiaCalendar(this);
		}
	}

	@Override
	public TipoDiaCalendar toEscapedModel() {
		return (TipoDiaCalendar)ProxyUtil.newProxyInstance(TipoDiaCalendar.class.getClassLoader(),
			new Class[] { TipoDiaCalendar.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TipoDiaCalendarClp clone = new TipoDiaCalendarClp();

		clone.setTipoDiaCalendarId(getTipoDiaCalendarId());
		clone.setDescripcion(getDescripcion());
		clone.setFondoColor(getFondoColor());
		clone.setLetraColor(getLetraColor());
		clone.setStrong(getStrong());

		return clone;
	}

	@Override
	public int compareTo(TipoDiaCalendar tipoDiaCalendar) {
		long primaryKey = tipoDiaCalendar.getPrimaryKey();

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

		if (!(obj instanceof TipoDiaCalendarClp)) {
			return false;
		}

		TipoDiaCalendarClp tipoDiaCalendar = (TipoDiaCalendarClp)obj;

		long primaryKey = tipoDiaCalendar.getPrimaryKey();

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

		sb.append("{tipoDiaCalendarId=");
		sb.append(getTipoDiaCalendarId());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", fondoColor=");
		sb.append(getFondoColor());
		sb.append(", letraColor=");
		sb.append(getLetraColor());
		sb.append(", strong=");
		sb.append(getStrong());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.TipoDiaCalendar");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>tipoDiaCalendarId</column-name><column-value><![CDATA[");
		sb.append(getTipoDiaCalendarId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fondoColor</column-name><column-value><![CDATA[");
		sb.append(getFondoColor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>letraColor</column-name><column-value><![CDATA[");
		sb.append(getLetraColor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>strong</column-name><column-value><![CDATA[");
		sb.append(getStrong());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _tipoDiaCalendarId;
	private String _descripcion;
	private String _fondoColor;
	private String _letraColor;
	private String _strong;
	private BaseModel<?> _tipoDiaCalendarRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}