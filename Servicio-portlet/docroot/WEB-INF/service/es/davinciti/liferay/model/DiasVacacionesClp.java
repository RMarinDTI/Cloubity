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
import es.davinciti.liferay.service.DiasVacacionesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class DiasVacacionesClp extends BaseModelImpl<DiasVacaciones>
	implements DiasVacaciones {
	public DiasVacacionesClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DiasVacaciones.class;
	}

	@Override
	public String getModelClassName() {
		return DiasVacaciones.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _diasVacacionesId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDiasVacacionesId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _diasVacacionesId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("diasVacacionesId", getDiasVacacionesId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("year", getYear());
		attributes.put("disponibles", getDisponibles());
		attributes.put("solicitados", getSolicitados());
		attributes.put("aprobados", getAprobados());
		attributes.put("pendientes", getPendientes());
		attributes.put("asignado", getAsignado());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long diasVacacionesId = (Long)attributes.get("diasVacacionesId");

		if (diasVacacionesId != null) {
			setDiasVacacionesId(diasVacacionesId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Integer year = (Integer)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		Integer disponibles = (Integer)attributes.get("disponibles");

		if (disponibles != null) {
			setDisponibles(disponibles);
		}

		Integer solicitados = (Integer)attributes.get("solicitados");

		if (solicitados != null) {
			setSolicitados(solicitados);
		}

		Integer aprobados = (Integer)attributes.get("aprobados");

		if (aprobados != null) {
			setAprobados(aprobados);
		}

		Integer pendientes = (Integer)attributes.get("pendientes");

		if (pendientes != null) {
			setPendientes(pendientes);
		}

		String asignado = (String)attributes.get("asignado");

		if (asignado != null) {
			setAsignado(asignado);
		}
	}

	@Override
	public long getDiasVacacionesId() {
		return _diasVacacionesId;
	}

	@Override
	public void setDiasVacacionesId(long diasVacacionesId) {
		_diasVacacionesId = diasVacacionesId;

		if (_diasVacacionesRemoteModel != null) {
			try {
				Class<?> clazz = _diasVacacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setDiasVacacionesId",
						long.class);

				method.invoke(_diasVacacionesRemoteModel, diasVacacionesId);
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

		if (_diasVacacionesRemoteModel != null) {
			try {
				Class<?> clazz = _diasVacacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_diasVacacionesRemoteModel, companyId);
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

		if (_diasVacacionesRemoteModel != null) {
			try {
				Class<?> clazz = _diasVacacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_diasVacacionesRemoteModel, userId);
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
	public int getYear() {
		return _year;
	}

	@Override
	public void setYear(int year) {
		_year = year;

		if (_diasVacacionesRemoteModel != null) {
			try {
				Class<?> clazz = _diasVacacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setYear", int.class);

				method.invoke(_diasVacacionesRemoteModel, year);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDisponibles() {
		return _disponibles;
	}

	@Override
	public void setDisponibles(int disponibles) {
		_disponibles = disponibles;

		if (_diasVacacionesRemoteModel != null) {
			try {
				Class<?> clazz = _diasVacacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setDisponibles", int.class);

				method.invoke(_diasVacacionesRemoteModel, disponibles);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSolicitados() {
		return _solicitados;
	}

	@Override
	public void setSolicitados(int solicitados) {
		_solicitados = solicitados;

		if (_diasVacacionesRemoteModel != null) {
			try {
				Class<?> clazz = _diasVacacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setSolicitados", int.class);

				method.invoke(_diasVacacionesRemoteModel, solicitados);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAprobados() {
		return _aprobados;
	}

	@Override
	public void setAprobados(int aprobados) {
		_aprobados = aprobados;

		if (_diasVacacionesRemoteModel != null) {
			try {
				Class<?> clazz = _diasVacacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setAprobados", int.class);

				method.invoke(_diasVacacionesRemoteModel, aprobados);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPendientes() {
		return _pendientes;
	}

	@Override
	public void setPendientes(int pendientes) {
		_pendientes = pendientes;

		if (_diasVacacionesRemoteModel != null) {
			try {
				Class<?> clazz = _diasVacacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setPendientes", int.class);

				method.invoke(_diasVacacionesRemoteModel, pendientes);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAsignado() {
		return _asignado;
	}

	@Override
	public void setAsignado(String asignado) {
		_asignado = asignado;

		if (_diasVacacionesRemoteModel != null) {
			try {
				Class<?> clazz = _diasVacacionesRemoteModel.getClass();

				Method method = clazz.getMethod("setAsignado", String.class);

				method.invoke(_diasVacacionesRemoteModel, asignado);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDiasVacacionesRemoteModel() {
		return _diasVacacionesRemoteModel;
	}

	public void setDiasVacacionesRemoteModel(
		BaseModel<?> diasVacacionesRemoteModel) {
		_diasVacacionesRemoteModel = diasVacacionesRemoteModel;
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

		Class<?> remoteModelClass = _diasVacacionesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_diasVacacionesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DiasVacacionesLocalServiceUtil.addDiasVacaciones(this);
		}
		else {
			DiasVacacionesLocalServiceUtil.updateDiasVacaciones(this);
		}
	}

	@Override
	public DiasVacaciones toEscapedModel() {
		return (DiasVacaciones)ProxyUtil.newProxyInstance(DiasVacaciones.class.getClassLoader(),
			new Class[] { DiasVacaciones.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DiasVacacionesClp clone = new DiasVacacionesClp();

		clone.setDiasVacacionesId(getDiasVacacionesId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setYear(getYear());
		clone.setDisponibles(getDisponibles());
		clone.setSolicitados(getSolicitados());
		clone.setAprobados(getAprobados());
		clone.setPendientes(getPendientes());
		clone.setAsignado(getAsignado());

		return clone;
	}

	@Override
	public int compareTo(DiasVacaciones diasVacaciones) {
		long primaryKey = diasVacaciones.getPrimaryKey();

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

		if (!(obj instanceof DiasVacacionesClp)) {
			return false;
		}

		DiasVacacionesClp diasVacaciones = (DiasVacacionesClp)obj;

		long primaryKey = diasVacaciones.getPrimaryKey();

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

		sb.append("{diasVacacionesId=");
		sb.append(getDiasVacacionesId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", year=");
		sb.append(getYear());
		sb.append(", disponibles=");
		sb.append(getDisponibles());
		sb.append(", solicitados=");
		sb.append(getSolicitados());
		sb.append(", aprobados=");
		sb.append(getAprobados());
		sb.append(", pendientes=");
		sb.append(getPendientes());
		sb.append(", asignado=");
		sb.append(getAsignado());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.DiasVacaciones");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>diasVacacionesId</column-name><column-value><![CDATA[");
		sb.append(getDiasVacacionesId());
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
			"<column><column-name>year</column-name><column-value><![CDATA[");
		sb.append(getYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>disponibles</column-name><column-value><![CDATA[");
		sb.append(getDisponibles());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>solicitados</column-name><column-value><![CDATA[");
		sb.append(getSolicitados());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>aprobados</column-name><column-value><![CDATA[");
		sb.append(getAprobados());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pendientes</column-name><column-value><![CDATA[");
		sb.append(getPendientes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asignado</column-name><column-value><![CDATA[");
		sb.append(getAsignado());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _diasVacacionesId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private int _year;
	private int _disponibles;
	private int _solicitados;
	private int _aprobados;
	private int _pendientes;
	private String _asignado;
	private BaseModel<?> _diasVacacionesRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}