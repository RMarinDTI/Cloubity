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

import es.davinciti.liferay.model.LineaGastoPayMode;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LineaGastoPayMode in entity cache.
 *
 * @author Cmes
 * @see LineaGastoPayMode
 * @generated
 */
public class LineaGastoPayModeCacheModel implements CacheModel<LineaGastoPayMode>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{paymodeId=");
		sb.append(paymodeId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LineaGastoPayMode toEntityModel() {
		LineaGastoPayModeImpl lineaGastoPayModeImpl = new LineaGastoPayModeImpl();

		lineaGastoPayModeImpl.setPaymodeId(paymodeId);
		lineaGastoPayModeImpl.setCompanyId(companyId);

		if (name == null) {
			lineaGastoPayModeImpl.setName(StringPool.BLANK);
		}
		else {
			lineaGastoPayModeImpl.setName(name);
		}

		if (description == null) {
			lineaGastoPayModeImpl.setDescription(StringPool.BLANK);
		}
		else {
			lineaGastoPayModeImpl.setDescription(description);
		}

		lineaGastoPayModeImpl.resetOriginalValues();

		return lineaGastoPayModeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		paymodeId = objectInput.readLong();
		companyId = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(paymodeId);
		objectOutput.writeLong(companyId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long paymodeId;
	public long companyId;
	public String name;
	public String description;
}