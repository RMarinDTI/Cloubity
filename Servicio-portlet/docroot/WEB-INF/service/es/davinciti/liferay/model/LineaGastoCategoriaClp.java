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
import es.davinciti.liferay.service.LineaGastoCategoriaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class LineaGastoCategoriaClp extends BaseModelImpl<LineaGastoCategoria>
	implements LineaGastoCategoria {
	public LineaGastoCategoriaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LineaGastoCategoria.class;
	}

	@Override
	public String getModelClassName() {
		return LineaGastoCategoria.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _categoriaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCategoriaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _categoriaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("categoriaId", getCategoriaId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("categoryCode", getCategoryCode());
		attributes.put("accountCode", getAccountCode());
		attributes.put("changePrice", getChangePrice());
		attributes.put("needQuantity", getNeedQuantity());
		attributes.put("price", getPrice());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long categoriaId = (Long)attributes.get("categoriaId");

		if (categoriaId != null) {
			setCategoriaId(categoriaId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String categoryCode = (String)attributes.get("categoryCode");

		if (categoryCode != null) {
			setCategoryCode(categoryCode);
		}

		String accountCode = (String)attributes.get("accountCode");

		if (accountCode != null) {
			setAccountCode(accountCode);
		}

		String changePrice = (String)attributes.get("changePrice");

		if (changePrice != null) {
			setChangePrice(changePrice);
		}

		String needQuantity = (String)attributes.get("needQuantity");

		if (needQuantity != null) {
			setNeedQuantity(needQuantity);
		}

		String price = (String)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}
	}

	@Override
	public long getCategoriaId() {
		return _categoriaId;
	}

	@Override
	public void setCategoriaId(long categoriaId) {
		_categoriaId = categoriaId;

		if (_lineaGastoCategoriaRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoCategoriaRemoteModel.getClass();

				Method method = clazz.getMethod("setCategoriaId", long.class);

				method.invoke(_lineaGastoCategoriaRemoteModel, categoriaId);
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

		if (_lineaGastoCategoriaRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoCategoriaRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_lineaGastoCategoriaRemoteModel, name);
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

		if (_lineaGastoCategoriaRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoCategoriaRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_lineaGastoCategoriaRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCategoryCode() {
		return _categoryCode;
	}

	@Override
	public void setCategoryCode(String categoryCode) {
		_categoryCode = categoryCode;

		if (_lineaGastoCategoriaRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoCategoriaRemoteModel.getClass();

				Method method = clazz.getMethod("setCategoryCode", String.class);

				method.invoke(_lineaGastoCategoriaRemoteModel, categoryCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAccountCode() {
		return _accountCode;
	}

	@Override
	public void setAccountCode(String accountCode) {
		_accountCode = accountCode;

		if (_lineaGastoCategoriaRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoCategoriaRemoteModel.getClass();

				Method method = clazz.getMethod("setAccountCode", String.class);

				method.invoke(_lineaGastoCategoriaRemoteModel, accountCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChangePrice() {
		return _changePrice;
	}

	@Override
	public void setChangePrice(String changePrice) {
		_changePrice = changePrice;

		if (_lineaGastoCategoriaRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoCategoriaRemoteModel.getClass();

				Method method = clazz.getMethod("setChangePrice", String.class);

				method.invoke(_lineaGastoCategoriaRemoteModel, changePrice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNeedQuantity() {
		return _needQuantity;
	}

	@Override
	public void setNeedQuantity(String needQuantity) {
		_needQuantity = needQuantity;

		if (_lineaGastoCategoriaRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoCategoriaRemoteModel.getClass();

				Method method = clazz.getMethod("setNeedQuantity", String.class);

				method.invoke(_lineaGastoCategoriaRemoteModel, needQuantity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPrice() {
		return _price;
	}

	@Override
	public void setPrice(String price) {
		_price = price;

		if (_lineaGastoCategoriaRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoCategoriaRemoteModel.getClass();

				Method method = clazz.getMethod("setPrice", String.class);

				method.invoke(_lineaGastoCategoriaRemoteModel, price);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLineaGastoCategoriaRemoteModel() {
		return _lineaGastoCategoriaRemoteModel;
	}

	public void setLineaGastoCategoriaRemoteModel(
		BaseModel<?> lineaGastoCategoriaRemoteModel) {
		_lineaGastoCategoriaRemoteModel = lineaGastoCategoriaRemoteModel;
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

		Class<?> remoteModelClass = _lineaGastoCategoriaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_lineaGastoCategoriaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LineaGastoCategoriaLocalServiceUtil.addLineaGastoCategoria(this);
		}
		else {
			LineaGastoCategoriaLocalServiceUtil.updateLineaGastoCategoria(this);
		}
	}

	@Override
	public LineaGastoCategoria toEscapedModel() {
		return (LineaGastoCategoria)ProxyUtil.newProxyInstance(LineaGastoCategoria.class.getClassLoader(),
			new Class[] { LineaGastoCategoria.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LineaGastoCategoriaClp clone = new LineaGastoCategoriaClp();

		clone.setCategoriaId(getCategoriaId());
		clone.setName(getName());
		clone.setDescription(getDescription());
		clone.setCategoryCode(getCategoryCode());
		clone.setAccountCode(getAccountCode());
		clone.setChangePrice(getChangePrice());
		clone.setNeedQuantity(getNeedQuantity());
		clone.setPrice(getPrice());

		return clone;
	}

	@Override
	public int compareTo(LineaGastoCategoria lineaGastoCategoria) {
		long primaryKey = lineaGastoCategoria.getPrimaryKey();

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

		if (!(obj instanceof LineaGastoCategoriaClp)) {
			return false;
		}

		LineaGastoCategoriaClp lineaGastoCategoria = (LineaGastoCategoriaClp)obj;

		long primaryKey = lineaGastoCategoria.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{categoriaId=");
		sb.append(getCategoriaId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", categoryCode=");
		sb.append(getCategoryCode());
		sb.append(", accountCode=");
		sb.append(getAccountCode());
		sb.append(", changePrice=");
		sb.append(getChangePrice());
		sb.append(", needQuantity=");
		sb.append(getNeedQuantity());
		sb.append(", price=");
		sb.append(getPrice());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.LineaGastoCategoria");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>categoriaId</column-name><column-value><![CDATA[");
		sb.append(getCategoriaId());
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
			"<column><column-name>categoryCode</column-name><column-value><![CDATA[");
		sb.append(getCategoryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accountCode</column-name><column-value><![CDATA[");
		sb.append(getAccountCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>changePrice</column-name><column-value><![CDATA[");
		sb.append(getChangePrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>needQuantity</column-name><column-value><![CDATA[");
		sb.append(getNeedQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>price</column-name><column-value><![CDATA[");
		sb.append(getPrice());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _categoriaId;
	private String _name;
	private String _description;
	private String _categoryCode;
	private String _accountCode;
	private String _changePrice;
	private String _needQuantity;
	private String _price;
	private BaseModel<?> _lineaGastoCategoriaRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}