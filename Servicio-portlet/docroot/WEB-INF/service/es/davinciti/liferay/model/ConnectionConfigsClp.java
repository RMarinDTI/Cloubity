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
import es.davinciti.liferay.service.ConnectionConfigsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class ConnectionConfigsClp extends BaseModelImpl<ConnectionConfigs>
	implements ConnectionConfigs {
	public ConnectionConfigsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ConnectionConfigs.class;
	}

	@Override
	public String getModelClassName() {
		return ConnectionConfigs.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _configId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setConfigId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _configId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("configId", getConfigId());
		attributes.put("companyId", getCompanyId());
		attributes.put("installationId", getInstallationId());
		attributes.put("companyCode", getCompanyCode());
		attributes.put("productCode", getProductCode());
		attributes.put("disableDate", getDisableDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long configId = (Long)attributes.get("configId");

		if (configId != null) {
			setConfigId(configId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String installationId = (String)attributes.get("installationId");

		if (installationId != null) {
			setInstallationId(installationId);
		}

		String companyCode = (String)attributes.get("companyCode");

		if (companyCode != null) {
			setCompanyCode(companyCode);
		}

		String productCode = (String)attributes.get("productCode");

		if (productCode != null) {
			setProductCode(productCode);
		}

		Date disableDate = (Date)attributes.get("disableDate");

		if (disableDate != null) {
			setDisableDate(disableDate);
		}
	}

	@Override
	public long getConfigId() {
		return _configId;
	}

	@Override
	public void setConfigId(long configId) {
		_configId = configId;

		if (_connectionConfigsRemoteModel != null) {
			try {
				Class<?> clazz = _connectionConfigsRemoteModel.getClass();

				Method method = clazz.getMethod("setConfigId", long.class);

				method.invoke(_connectionConfigsRemoteModel, configId);
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

		if (_connectionConfigsRemoteModel != null) {
			try {
				Class<?> clazz = _connectionConfigsRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_connectionConfigsRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInstallationId() {
		return _installationId;
	}

	@Override
	public void setInstallationId(String installationId) {
		_installationId = installationId;

		if (_connectionConfigsRemoteModel != null) {
			try {
				Class<?> clazz = _connectionConfigsRemoteModel.getClass();

				Method method = clazz.getMethod("setInstallationId",
						String.class);

				method.invoke(_connectionConfigsRemoteModel, installationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCompanyCode() {
		return _companyCode;
	}

	@Override
	public void setCompanyCode(String companyCode) {
		_companyCode = companyCode;

		if (_connectionConfigsRemoteModel != null) {
			try {
				Class<?> clazz = _connectionConfigsRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyCode", String.class);

				method.invoke(_connectionConfigsRemoteModel, companyCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductCode() {
		return _productCode;
	}

	@Override
	public void setProductCode(String productCode) {
		_productCode = productCode;

		if (_connectionConfigsRemoteModel != null) {
			try {
				Class<?> clazz = _connectionConfigsRemoteModel.getClass();

				Method method = clazz.getMethod("setProductCode", String.class);

				method.invoke(_connectionConfigsRemoteModel, productCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDisableDate() {
		return _disableDate;
	}

	@Override
	public void setDisableDate(Date disableDate) {
		_disableDate = disableDate;

		if (_connectionConfigsRemoteModel != null) {
			try {
				Class<?> clazz = _connectionConfigsRemoteModel.getClass();

				Method method = clazz.getMethod("setDisableDate", Date.class);

				method.invoke(_connectionConfigsRemoteModel, disableDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getConnectionConfigsRemoteModel() {
		return _connectionConfigsRemoteModel;
	}

	public void setConnectionConfigsRemoteModel(
		BaseModel<?> connectionConfigsRemoteModel) {
		_connectionConfigsRemoteModel = connectionConfigsRemoteModel;
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

		Class<?> remoteModelClass = _connectionConfigsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_connectionConfigsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ConnectionConfigsLocalServiceUtil.addConnectionConfigs(this);
		}
		else {
			ConnectionConfigsLocalServiceUtil.updateConnectionConfigs(this);
		}
	}

	@Override
	public ConnectionConfigs toEscapedModel() {
		return (ConnectionConfigs)ProxyUtil.newProxyInstance(ConnectionConfigs.class.getClassLoader(),
			new Class[] { ConnectionConfigs.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ConnectionConfigsClp clone = new ConnectionConfigsClp();

		clone.setConfigId(getConfigId());
		clone.setCompanyId(getCompanyId());
		clone.setInstallationId(getInstallationId());
		clone.setCompanyCode(getCompanyCode());
		clone.setProductCode(getProductCode());
		clone.setDisableDate(getDisableDate());

		return clone;
	}

	@Override
	public int compareTo(ConnectionConfigs connectionConfigs) {
		long primaryKey = connectionConfigs.getPrimaryKey();

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

		if (!(obj instanceof ConnectionConfigsClp)) {
			return false;
		}

		ConnectionConfigsClp connectionConfigs = (ConnectionConfigsClp)obj;

		long primaryKey = connectionConfigs.getPrimaryKey();

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

		sb.append("{configId=");
		sb.append(getConfigId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", installationId=");
		sb.append(getInstallationId());
		sb.append(", companyCode=");
		sb.append(getCompanyCode());
		sb.append(", productCode=");
		sb.append(getProductCode());
		sb.append(", disableDate=");
		sb.append(getDisableDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.ConnectionConfigs");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>configId</column-name><column-value><![CDATA[");
		sb.append(getConfigId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>installationId</column-name><column-value><![CDATA[");
		sb.append(getInstallationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyCode</column-name><column-value><![CDATA[");
		sb.append(getCompanyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productCode</column-name><column-value><![CDATA[");
		sb.append(getProductCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>disableDate</column-name><column-value><![CDATA[");
		sb.append(getDisableDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _configId;
	private long _companyId;
	private String _installationId;
	private String _companyCode;
	private String _productCode;
	private Date _disableDate;
	private BaseModel<?> _connectionConfigsRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}