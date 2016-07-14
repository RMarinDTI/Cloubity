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

import es.davinciti.liferay.model.LineaGastoCliente;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LineaGastoCliente in entity cache.
 *
 * @author Cmes
 * @see LineaGastoCliente
 * @generated
 */
public class LineaGastoClienteCacheModel implements CacheModel<LineaGastoCliente>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{clienteId=");
		sb.append(clienteId);
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
	public LineaGastoCliente toEntityModel() {
		LineaGastoClienteImpl lineaGastoClienteImpl = new LineaGastoClienteImpl();

		lineaGastoClienteImpl.setClienteId(clienteId);
		lineaGastoClienteImpl.setCompanyId(companyId);

		if (name == null) {
			lineaGastoClienteImpl.setName(StringPool.BLANK);
		}
		else {
			lineaGastoClienteImpl.setName(name);
		}

		if (description == null) {
			lineaGastoClienteImpl.setDescription(StringPool.BLANK);
		}
		else {
			lineaGastoClienteImpl.setDescription(description);
		}

		lineaGastoClienteImpl.resetOriginalValues();

		return lineaGastoClienteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		clienteId = objectInput.readLong();
		companyId = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(clienteId);
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

	public long clienteId;
	public long companyId;
	public String name;
	public String description;
}