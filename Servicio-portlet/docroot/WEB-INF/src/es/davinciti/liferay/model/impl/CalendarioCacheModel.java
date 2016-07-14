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

import es.davinciti.liferay.model.Calendario;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Calendario in entity cache.
 *
 * @author Cmes
 * @see Calendario
 * @generated
 */
public class CalendarioCacheModel implements CacheModel<Calendario>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{calendarioId=");
		sb.append(calendarioId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", year=");
		sb.append(year);
		sb.append(", calendarJson=");
		sb.append(calendarJson);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Calendario toEntityModel() {
		CalendarioImpl calendarioImpl = new CalendarioImpl();

		calendarioImpl.setCalendarioId(calendarioId);
		calendarioImpl.setCompanyId(companyId);
		calendarioImpl.setUserId(userId);
		calendarioImpl.setYear(year);

		if (calendarJson == null) {
			calendarioImpl.setCalendarJson(StringPool.BLANK);
		}
		else {
			calendarioImpl.setCalendarJson(calendarJson);
		}

		if (status == null) {
			calendarioImpl.setStatus(StringPool.BLANK);
		}
		else {
			calendarioImpl.setStatus(status);
		}

		calendarioImpl.resetOriginalValues();

		return calendarioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		calendarioId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		year = objectInput.readInt();
		calendarJson = objectInput.readUTF();
		status = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(calendarioId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);
		objectOutput.writeInt(year);

		if (calendarJson == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(calendarJson);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}
	}

	public long calendarioId;
	public long companyId;
	public long userId;
	public int year;
	public String calendarJson;
	public String status;
}