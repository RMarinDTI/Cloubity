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

import es.davinciti.liferay.model.LineaGastoProyecto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LineaGastoProyecto in entity cache.
 *
 * @author Cmes
 * @see LineaGastoProyecto
 * @generated
 */
public class LineaGastoProyectoCacheModel implements CacheModel<LineaGastoProyecto>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{proyectoId=");
		sb.append(proyectoId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", codeName=");
		sb.append(codeName);
		sb.append(", sageCompanyId=");
		sb.append(sageCompanyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LineaGastoProyecto toEntityModel() {
		LineaGastoProyectoImpl lineaGastoProyectoImpl = new LineaGastoProyectoImpl();

		lineaGastoProyectoImpl.setProyectoId(proyectoId);

		if (name == null) {
			lineaGastoProyectoImpl.setName(StringPool.BLANK);
		}
		else {
			lineaGastoProyectoImpl.setName(name);
		}

		if (description == null) {
			lineaGastoProyectoImpl.setDescription(StringPool.BLANK);
		}
		else {
			lineaGastoProyectoImpl.setDescription(description);
		}

		if (codeName == null) {
			lineaGastoProyectoImpl.setCodeName(StringPool.BLANK);
		}
		else {
			lineaGastoProyectoImpl.setCodeName(codeName);
		}

		if (sageCompanyId == null) {
			lineaGastoProyectoImpl.setSageCompanyId(StringPool.BLANK);
		}
		else {
			lineaGastoProyectoImpl.setSageCompanyId(sageCompanyId);
		}

		lineaGastoProyectoImpl.resetOriginalValues();

		return lineaGastoProyectoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		proyectoId = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		codeName = objectInput.readUTF();
		sageCompanyId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(proyectoId);

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

		if (codeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(codeName);
		}

		if (sageCompanyId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sageCompanyId);
		}
	}

	public long proyectoId;
	public String name;
	public String description;
	public String codeName;
	public String sageCompanyId;
}