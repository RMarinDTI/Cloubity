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
import es.davinciti.liferay.service.CurrencyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class CurrencyClp extends BaseModelImpl<Currency> implements Currency {
	public CurrencyClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Currency.class;
	}

	@Override
	public String getModelClassName() {
		return Currency.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _currencyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCurrencyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _currencyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("currencyId", getCurrencyId());
		attributes.put("ccyMnrUnts", getCcyMnrUnts());
		attributes.put("ccyName", getCcyName());
		attributes.put("ccyNumber", getCcyNumber());
		attributes.put("code", getCode());
		attributes.put("countryName", getCountryName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long currencyId = (Long)attributes.get("currencyId");

		if (currencyId != null) {
			setCurrencyId(currencyId);
		}

		String ccyMnrUnts = (String)attributes.get("ccyMnrUnts");

		if (ccyMnrUnts != null) {
			setCcyMnrUnts(ccyMnrUnts);
		}

		String ccyName = (String)attributes.get("ccyName");

		if (ccyName != null) {
			setCcyName(ccyName);
		}

		String ccyNumber = (String)attributes.get("ccyNumber");

		if (ccyNumber != null) {
			setCcyNumber(ccyNumber);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String countryName = (String)attributes.get("countryName");

		if (countryName != null) {
			setCountryName(countryName);
		}
	}

	@Override
	public long getCurrencyId() {
		return _currencyId;
	}

	@Override
	public void setCurrencyId(long currencyId) {
		_currencyId = currencyId;

		if (_currencyRemoteModel != null) {
			try {
				Class<?> clazz = _currencyRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrencyId", long.class);

				method.invoke(_currencyRemoteModel, currencyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCcyMnrUnts() {
		return _ccyMnrUnts;
	}

	@Override
	public void setCcyMnrUnts(String ccyMnrUnts) {
		_ccyMnrUnts = ccyMnrUnts;

		if (_currencyRemoteModel != null) {
			try {
				Class<?> clazz = _currencyRemoteModel.getClass();

				Method method = clazz.getMethod("setCcyMnrUnts", String.class);

				method.invoke(_currencyRemoteModel, ccyMnrUnts);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCcyName() {
		return _ccyName;
	}

	@Override
	public void setCcyName(String ccyName) {
		_ccyName = ccyName;

		if (_currencyRemoteModel != null) {
			try {
				Class<?> clazz = _currencyRemoteModel.getClass();

				Method method = clazz.getMethod("setCcyName", String.class);

				method.invoke(_currencyRemoteModel, ccyName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCcyNumber() {
		return _ccyNumber;
	}

	@Override
	public void setCcyNumber(String ccyNumber) {
		_ccyNumber = ccyNumber;

		if (_currencyRemoteModel != null) {
			try {
				Class<?> clazz = _currencyRemoteModel.getClass();

				Method method = clazz.getMethod("setCcyNumber", String.class);

				method.invoke(_currencyRemoteModel, ccyNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode() {
		return _code;
	}

	@Override
	public void setCode(String code) {
		_code = code;

		if (_currencyRemoteModel != null) {
			try {
				Class<?> clazz = _currencyRemoteModel.getClass();

				Method method = clazz.getMethod("setCode", String.class);

				method.invoke(_currencyRemoteModel, code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCountryName() {
		return _countryName;
	}

	@Override
	public void setCountryName(String countryName) {
		_countryName = countryName;

		if (_currencyRemoteModel != null) {
			try {
				Class<?> clazz = _currencyRemoteModel.getClass();

				Method method = clazz.getMethod("setCountryName", String.class);

				method.invoke(_currencyRemoteModel, countryName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCurrencyRemoteModel() {
		return _currencyRemoteModel;
	}

	public void setCurrencyRemoteModel(BaseModel<?> currencyRemoteModel) {
		_currencyRemoteModel = currencyRemoteModel;
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

		Class<?> remoteModelClass = _currencyRemoteModel.getClass();

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

		Object returnValue = method.invoke(_currencyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CurrencyLocalServiceUtil.addCurrency(this);
		}
		else {
			CurrencyLocalServiceUtil.updateCurrency(this);
		}
	}

	@Override
	public Currency toEscapedModel() {
		return (Currency)ProxyUtil.newProxyInstance(Currency.class.getClassLoader(),
			new Class[] { Currency.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CurrencyClp clone = new CurrencyClp();

		clone.setCurrencyId(getCurrencyId());
		clone.setCcyMnrUnts(getCcyMnrUnts());
		clone.setCcyName(getCcyName());
		clone.setCcyNumber(getCcyNumber());
		clone.setCode(getCode());
		clone.setCountryName(getCountryName());

		return clone;
	}

	@Override
	public int compareTo(Currency currency) {
		long primaryKey = currency.getPrimaryKey();

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

		if (!(obj instanceof CurrencyClp)) {
			return false;
		}

		CurrencyClp currency = (CurrencyClp)obj;

		long primaryKey = currency.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{currencyId=");
		sb.append(getCurrencyId());
		sb.append(", ccyMnrUnts=");
		sb.append(getCcyMnrUnts());
		sb.append(", ccyName=");
		sb.append(getCcyName());
		sb.append(", ccyNumber=");
		sb.append(getCcyNumber());
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", countryName=");
		sb.append(getCountryName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.Currency");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>currencyId</column-name><column-value><![CDATA[");
		sb.append(getCurrencyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ccyMnrUnts</column-name><column-value><![CDATA[");
		sb.append(getCcyMnrUnts());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ccyName</column-name><column-value><![CDATA[");
		sb.append(getCcyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ccyNumber</column-name><column-value><![CDATA[");
		sb.append(getCcyNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryName</column-name><column-value><![CDATA[");
		sb.append(getCountryName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _currencyId;
	private String _ccyMnrUnts;
	private String _ccyName;
	private String _ccyNumber;
	private String _code;
	private String _countryName;
	private BaseModel<?> _currencyRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}