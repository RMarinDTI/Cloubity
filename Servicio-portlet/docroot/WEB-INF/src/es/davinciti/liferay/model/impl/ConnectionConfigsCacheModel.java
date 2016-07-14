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

package es.davinciti.liferay.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import es.davinciti.liferay.model.ConnectionConfigs;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ConnectionConfigs in entity cache.
 *
 * @author Cmes
 * @see ConnectionConfigs
 * @generated
 */
public class ConnectionConfigsCacheModel implements CacheModel<ConnectionConfigs>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{configId=");
		sb.append(configId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", installationId=");
		sb.append(installationId);
		sb.append(", companyCode=");
		sb.append(companyCode);
		sb.append(", productCode=");
		sb.append(productCode);
		sb.append(", disableDate=");
		sb.append(disableDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ConnectionConfigs toEntityModel() {
		ConnectionConfigsImpl connectionConfigsImpl = new ConnectionConfigsImpl();

		connectionConfigsImpl.setConfigId(configId);
		connectionConfigsImpl.setCompanyId(companyId);

		if (installationId == null) {
			connectionConfigsImpl.setInstallationId(StringPool.BLANK);
		}
		else {
			connectionConfigsImpl.setInstallationId(installationId);
		}

		if (companyCode == null) {
			connectionConfigsImpl.setCompanyCode(StringPool.BLANK);
		}
		else {
			connectionConfigsImpl.setCompanyCode(companyCode);
		}

		if (productCode == null) {
			connectionConfigsImpl.setProductCode(StringPool.BLANK);
		}
		else {
			connectionConfigsImpl.setProductCode(productCode);
		}

		if (disableDate == Long.MIN_VALUE) {
			connectionConfigsImpl.setDisableDate(null);
		}
		else {
			connectionConfigsImpl.setDisableDate(new Date(disableDate));
		}

		connectionConfigsImpl.resetOriginalValues();

		return connectionConfigsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		configId = objectInput.readLong();
		companyId = objectInput.readLong();
		installationId = objectInput.readUTF();
		companyCode = objectInput.readUTF();
		productCode = objectInput.readUTF();
		disableDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(configId);
		objectOutput.writeLong(companyId);

		if (installationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(installationId);
		}

		if (companyCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(companyCode);
		}

		if (productCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productCode);
		}

		objectOutput.writeLong(disableDate);
	}

	public long configId;
	public long companyId;
	public String installationId;
	public String companyCode;
	public String productCode;
	public long disableDate;
}