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

import es.davinciti.liferay.model.ConnectionTypes;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ConnectionTypes in entity cache.
 *
 * @author Cmes
 * @see ConnectionTypes
 * @generated
 */
public class ConnectionTypesCacheModel implements CacheModel<ConnectionTypes>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{connectionTypeId=");
		sb.append(connectionTypeId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", disableDate=");
		sb.append(disableDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ConnectionTypes toEntityModel() {
		ConnectionTypesImpl connectionTypesImpl = new ConnectionTypesImpl();

		connectionTypesImpl.setConnectionTypeId(connectionTypeId);

		if (name == null) {
			connectionTypesImpl.setName(StringPool.BLANK);
		}
		else {
			connectionTypesImpl.setName(name);
		}

		if (disableDate == Long.MIN_VALUE) {
			connectionTypesImpl.setDisableDate(null);
		}
		else {
			connectionTypesImpl.setDisableDate(new Date(disableDate));
		}

		connectionTypesImpl.resetOriginalValues();

		return connectionTypesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		connectionTypeId = objectInput.readLong();
		name = objectInput.readUTF();
		disableDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(connectionTypeId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(disableDate);
	}

	public long connectionTypeId;
	public String name;
	public long disableDate;
}