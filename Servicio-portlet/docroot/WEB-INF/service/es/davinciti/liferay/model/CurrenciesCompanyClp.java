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
import es.davinciti.liferay.service.CurrenciesCompanyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class CurrenciesCompanyClp extends BaseModelImpl<CurrenciesCompany>
	implements CurrenciesCompany {
	public CurrenciesCompanyClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CurrenciesCompany.class;
	}

	@Override
	public String getModelClassName() {
		return CurrenciesCompany.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _currenciescompanyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCurrenciescompanyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _currenciescompanyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("currenciescompanyId", getCurrenciescompanyId());
		attributes.put("companyId", getCompanyId());
		attributes.put("currenciesJson", getCurrenciesJson());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long currenciescompanyId = (Long)attributes.get("currenciescompanyId");

		if (currenciescompanyId != null) {
			setCurrenciescompanyId(currenciescompanyId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String currenciesJson = (String)attributes.get("currenciesJson");

		if (currenciesJson != null) {
			setCurrenciesJson(currenciesJson);
		}
	}

	@Override
	public long getCurrenciescompanyId() {
		return _currenciescompanyId;
	}

	@Override
	public void setCurrenciescompanyId(long currenciescompanyId) {
		_currenciescompanyId = currenciescompanyId;

		if (_currenciesCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _currenciesCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrenciescompanyId",
						long.class);

				method.invoke(_currenciesCompanyRemoteModel, currenciescompanyId);
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

		if (_currenciesCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _currenciesCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_currenciesCompanyRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrenciesJson() {
		return _currenciesJson;
	}

	@Override
	public void setCurrenciesJson(String currenciesJson) {
		_currenciesJson = currenciesJson;

		if (_currenciesCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _currenciesCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrenciesJson",
						String.class);

				method.invoke(_currenciesCompanyRemoteModel, currenciesJson);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCurrenciesCompanyRemoteModel() {
		return _currenciesCompanyRemoteModel;
	}

	public void setCurrenciesCompanyRemoteModel(
		BaseModel<?> currenciesCompanyRemoteModel) {
		_currenciesCompanyRemoteModel = currenciesCompanyRemoteModel;
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

		Class<?> remoteModelClass = _currenciesCompanyRemoteModel.getClass();

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

		Object returnValue = method.invoke(_currenciesCompanyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CurrenciesCompanyLocalServiceUtil.addCurrenciesCompany(this);
		}
		else {
			CurrenciesCompanyLocalServiceUtil.updateCurrenciesCompany(this);
		}
	}

	@Override
	public CurrenciesCompany toEscapedModel() {
		return (CurrenciesCompany)ProxyUtil.newProxyInstance(CurrenciesCompany.class.getClassLoader(),
			new Class[] { CurrenciesCompany.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CurrenciesCompanyClp clone = new CurrenciesCompanyClp();

		clone.setCurrenciescompanyId(getCurrenciescompanyId());
		clone.setCompanyId(getCompanyId());
		clone.setCurrenciesJson(getCurrenciesJson());

		return clone;
	}

	@Override
	public int compareTo(CurrenciesCompany currenciesCompany) {
		long primaryKey = currenciesCompany.getPrimaryKey();

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

		if (!(obj instanceof CurrenciesCompanyClp)) {
			return false;
		}

		CurrenciesCompanyClp currenciesCompany = (CurrenciesCompanyClp)obj;

		long primaryKey = currenciesCompany.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{currenciescompanyId=");
		sb.append(getCurrenciescompanyId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", currenciesJson=");
		sb.append(getCurrenciesJson());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.CurrenciesCompany");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>currenciescompanyId</column-name><column-value><![CDATA[");
		sb.append(getCurrenciescompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currenciesJson</column-name><column-value><![CDATA[");
		sb.append(getCurrenciesJson());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _currenciescompanyId;
	private long _companyId;
	private String _currenciesJson;
	private BaseModel<?> _currenciesCompanyRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}