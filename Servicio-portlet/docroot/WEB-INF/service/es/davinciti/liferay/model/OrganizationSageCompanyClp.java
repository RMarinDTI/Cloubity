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
import es.davinciti.liferay.service.OrganizationSageCompanyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cmes
 */
public class OrganizationSageCompanyClp extends BaseModelImpl<OrganizationSageCompany>
	implements OrganizationSageCompany {
	public OrganizationSageCompanyClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return OrganizationSageCompany.class;
	}

	@Override
	public String getModelClassName() {
		return OrganizationSageCompany.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _orgsagecompanyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOrgsagecompanyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _orgsagecompanyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("orgsagecompanyId", getOrgsagecompanyId());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("sageCompanyId", getSageCompanyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long orgsagecompanyId = (Long)attributes.get("orgsagecompanyId");

		if (orgsagecompanyId != null) {
			setOrgsagecompanyId(orgsagecompanyId);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		String sageCompanyId = (String)attributes.get("sageCompanyId");

		if (sageCompanyId != null) {
			setSageCompanyId(sageCompanyId);
		}
	}

	@Override
	public long getOrgsagecompanyId() {
		return _orgsagecompanyId;
	}

	@Override
	public void setOrgsagecompanyId(long orgsagecompanyId) {
		_orgsagecompanyId = orgsagecompanyId;

		if (_organizationSageCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _organizationSageCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setOrgsagecompanyId",
						long.class);

				method.invoke(_organizationSageCompanyRemoteModel,
					orgsagecompanyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;

		if (_organizationSageCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _organizationSageCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationId", long.class);

				method.invoke(_organizationSageCompanyRemoteModel,
					organizationId);
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

		if (_organizationSageCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _organizationSageCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setSageCompanyId", String.class);

				method.invoke(_organizationSageCompanyRemoteModel, sageCompanyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getOrganizationSageCompanyRemoteModel() {
		return _organizationSageCompanyRemoteModel;
	}

	public void setOrganizationSageCompanyRemoteModel(
		BaseModel<?> organizationSageCompanyRemoteModel) {
		_organizationSageCompanyRemoteModel = organizationSageCompanyRemoteModel;
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

		Class<?> remoteModelClass = _organizationSageCompanyRemoteModel.getClass();

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

		Object returnValue = method.invoke(_organizationSageCompanyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OrganizationSageCompanyLocalServiceUtil.addOrganizationSageCompany(this);
		}
		else {
			OrganizationSageCompanyLocalServiceUtil.updateOrganizationSageCompany(this);
		}
	}

	@Override
	public OrganizationSageCompany toEscapedModel() {
		return (OrganizationSageCompany)ProxyUtil.newProxyInstance(OrganizationSageCompany.class.getClassLoader(),
			new Class[] { OrganizationSageCompany.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OrganizationSageCompanyClp clone = new OrganizationSageCompanyClp();

		clone.setOrgsagecompanyId(getOrgsagecompanyId());
		clone.setOrganizationId(getOrganizationId());
		clone.setSageCompanyId(getSageCompanyId());

		return clone;
	}

	@Override
	public int compareTo(OrganizationSageCompany organizationSageCompany) {
		long primaryKey = organizationSageCompany.getPrimaryKey();

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

		if (!(obj instanceof OrganizationSageCompanyClp)) {
			return false;
		}

		OrganizationSageCompanyClp organizationSageCompany = (OrganizationSageCompanyClp)obj;

		long primaryKey = organizationSageCompany.getPrimaryKey();

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

		sb.append("{orgsagecompanyId=");
		sb.append(getOrgsagecompanyId());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", sageCompanyId=");
		sb.append(getSageCompanyId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.OrganizationSageCompany");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>orgsagecompanyId</column-name><column-value><![CDATA[");
		sb.append(getOrgsagecompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sageCompanyId</column-name><column-value><![CDATA[");
		sb.append(getSageCompanyId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _orgsagecompanyId;
	private long _organizationId;
	private String _sageCompanyId;
	private BaseModel<?> _organizationSageCompanyRemoteModel;
	private Class<?> _clpSerializerClass = es.davinciti.liferay.service.ClpSerializer.class;
}