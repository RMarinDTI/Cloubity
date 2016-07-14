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
import es.davinciti.liferay.service.LineaGastoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class LineaGastoClp extends BaseModelImpl<LineaGasto>
	implements LineaGasto {
	public LineaGastoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LineaGasto.class;
	}

	@Override
	public String getModelClassName() {
		return LineaGasto.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _lineagastoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLineagastoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _lineagastoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("lineagastoId", getLineagastoId());
		attributes.put("date", getDate());
		attributes.put("amount", getAmount());
		attributes.put("documentId", getDocumentId());
		attributes.put("comments", getComments());
		attributes.put("status", getStatus());
		attributes.put("price", getPrice());
		attributes.put("quantity", getQuantity());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long lineagastoId = (Long)attributes.get("lineagastoId");

		if (lineagastoId != null) {
			setLineagastoId(lineagastoId);
		}

		String date = (String)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		String amount = (String)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		String documentId = (String)attributes.get("documentId");

		if (documentId != null) {
			setDocumentId(documentId);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String price = (String)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		String quantity = (String)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}
	}

	@Override
	public long getLineagastoId() {
		return _lineagastoId;
	}

	@Override
	public void setLineagastoId(long lineagastoId) {
		_lineagastoId = lineagastoId;

		if (_lineaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setLineagastoId", long.class);

				method.invoke(_lineaGastoRemoteModel, lineagastoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDate() {
		return _date;
	}

	@Override
	public void setDate(String date) {
		_date = date;

		if (_lineaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setDate", String.class);

				method.invoke(_lineaGastoRemoteModel, date);
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

		if (_lineaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setAmount", String.class);

				method.invoke(_lineaGastoRemoteModel, amount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocumentId() {
		return _documentId;
	}

	@Override
	public void setDocumentId(String documentId) {
		_documentId = documentId;

		if (_lineaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentId", String.class);

				method.invoke(_lineaGastoRemoteModel, documentId);
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

		if (_lineaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setComments", String.class);

				method.invoke(_lineaGastoRemoteModel, comments);
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

		if (_lineaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_lineaGastoRemoteModel, status);
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

		if (_lineaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setPrice", String.class);

				method.invoke(_lineaGastoRemoteModel, price);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuantity() {
		return _quantity;
	}

	@Override
	public void setQuantity(String quantity) {
		_quantity = quantity;

		if (_lineaGastoRemoteModel != null) {
			try {
				Class<?> clazz = _lineaGastoRemoteModel.getClass();

				Method method = clazz.getMethod("setQuantity", String.class);

				method.invoke(_lineaGastoRemoteModel, quantity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLineaGastoRemoteModel() {
		return _lineaGastoRemoteModel;
	}

	public void setLineaGastoRemoteModel(BaseModel<?> lineaGastoRemoteModel) {
		_lineaGastoRemoteModel = lineaGastoRemoteModel;
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

		Class<?> remoteModelClass = _lineaGastoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_lineaGastoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LineaGastoLocalServiceUtil.addLineaGasto(this);
		}
		else {
			LineaGastoLocalServiceUtil.updateLineaGasto(this);
		}
	}

	@Override
	public LineaGasto toEscapedModel() {
		return (LineaGasto)ProxyUtil.newProxyInstance(LineaGasto.class.getClassLoader(),
			new Class[] { LineaGasto.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LineaGastoClp clone = new LineaGastoClp();

		clone.setLineagastoId(getLineagastoId());
		clone.setDate(getDate());
		clone.setAmount(getAmount());
		clone.setDocumentId(getDocumentId());
		clone.setComments(getComments());
		clone.setStatus(getStatus());
		clone.setPrice(getPrice());
		clone.setQuantity(getQuantity());

		return clone;
	}

	@Override
	public int compareTo(LineaGasto lineaGasto) {
		long primaryKey = lineaGasto.getPrimaryKey();

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

		if (!(obj instanceof LineaGastoClp)) {
			return false;
		}

		LineaGastoClp lineaGasto = (LineaGastoClp)obj;

		long primaryKey = lineaGasto.getPrimaryKey();

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

		sb.append("{lineagastoId=");
		sb.append(getLineagastoId());
		sb.append(", date=");
		sb.append(getDate());
		sb.append(", amount=");
		sb.append(getAmount());
		sb.append(", documentId=");
		sb.append(getDocumentId());
		sb.append(", comments=");
		sb.append(getComments());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", price=");
		sb.append(getPrice());
		sb.append(", quantity=");
		sb.append(getQuantity());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.LineaGasto");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>lineagastoId</column-name><column-value><![CDATA[");
		sb.append(getLineagastoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date</column-name><column-value><![CDATA[");
		sb.append(getDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount</column-name><column-value><![CDATA[");
		sb.append(getAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentId</column-name><column-value><![CDATA[");
		sb.append(getDocumentId());
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
			"<column><column-name>price</column-name><column-value><![CDATA[");
		sb.append(getPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantity</column-name><column-value><![CDATA[");
		sb.append(getQuantity());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _lineagastoId;
	private String _date;
	private String _amount;
	private String _documentId;
	private String _comments;
	private String _status;
	private String _price;
	private String _quantity;
	private BaseModel<?> _lineaGastoRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}