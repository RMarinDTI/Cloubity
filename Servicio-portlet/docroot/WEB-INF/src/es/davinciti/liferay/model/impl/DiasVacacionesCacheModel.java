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

import es.davinciti.liferay.model.DiasVacaciones;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DiasVacaciones in entity cache.
 *
 * @author Cmes
 * @see DiasVacaciones
 * @generated
 */
public class DiasVacacionesCacheModel implements CacheModel<DiasVacaciones>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{diasVacacionesId=");
		sb.append(diasVacacionesId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", year=");
		sb.append(year);
		sb.append(", disponibles=");
		sb.append(disponibles);
		sb.append(", solicitados=");
		sb.append(solicitados);
		sb.append(", aprobados=");
		sb.append(aprobados);
		sb.append(", pendientes=");
		sb.append(pendientes);
		sb.append(", asignado=");
		sb.append(asignado);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DiasVacaciones toEntityModel() {
		DiasVacacionesImpl diasVacacionesImpl = new DiasVacacionesImpl();

		diasVacacionesImpl.setDiasVacacionesId(diasVacacionesId);
		diasVacacionesImpl.setCompanyId(companyId);
		diasVacacionesImpl.setUserId(userId);
		diasVacacionesImpl.setYear(year);
		diasVacacionesImpl.setDisponibles(disponibles);
		diasVacacionesImpl.setSolicitados(solicitados);
		diasVacacionesImpl.setAprobados(aprobados);
		diasVacacionesImpl.setPendientes(pendientes);

		if (asignado == null) {
			diasVacacionesImpl.setAsignado(StringPool.BLANK);
		}
		else {
			diasVacacionesImpl.setAsignado(asignado);
		}

		diasVacacionesImpl.resetOriginalValues();

		return diasVacacionesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		diasVacacionesId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		year = objectInput.readInt();
		disponibles = objectInput.readInt();
		solicitados = objectInput.readInt();
		aprobados = objectInput.readInt();
		pendientes = objectInput.readInt();
		asignado = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(diasVacacionesId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);
		objectOutput.writeInt(year);
		objectOutput.writeInt(disponibles);
		objectOutput.writeInt(solicitados);
		objectOutput.writeInt(aprobados);
		objectOutput.writeInt(pendientes);

		if (asignado == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(asignado);
		}
	}

	public long diasVacacionesId;
	public long companyId;
	public long userId;
	public int year;
	public int disponibles;
	public int solicitados;
	public int aprobados;
	public int pendientes;
	public String asignado;
}