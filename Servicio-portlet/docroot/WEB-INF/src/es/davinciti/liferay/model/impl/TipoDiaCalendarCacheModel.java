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

import es.davinciti.liferay.model.TipoDiaCalendar;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TipoDiaCalendar in entity cache.
 *
 * @author Cmes
 * @see TipoDiaCalendar
 * @generated
 */
public class TipoDiaCalendarCacheModel implements CacheModel<TipoDiaCalendar>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{tipoDiaCalendarId=");
		sb.append(tipoDiaCalendarId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", fondoColor=");
		sb.append(fondoColor);
		sb.append(", letraColor=");
		sb.append(letraColor);
		sb.append(", strong=");
		sb.append(strong);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TipoDiaCalendar toEntityModel() {
		TipoDiaCalendarImpl tipoDiaCalendarImpl = new TipoDiaCalendarImpl();

		tipoDiaCalendarImpl.setTipoDiaCalendarId(tipoDiaCalendarId);

		if (descripcion == null) {
			tipoDiaCalendarImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			tipoDiaCalendarImpl.setDescripcion(descripcion);
		}

		if (fondoColor == null) {
			tipoDiaCalendarImpl.setFondoColor(StringPool.BLANK);
		}
		else {
			tipoDiaCalendarImpl.setFondoColor(fondoColor);
		}

		if (letraColor == null) {
			tipoDiaCalendarImpl.setLetraColor(StringPool.BLANK);
		}
		else {
			tipoDiaCalendarImpl.setLetraColor(letraColor);
		}

		if (strong == null) {
			tipoDiaCalendarImpl.setStrong(StringPool.BLANK);
		}
		else {
			tipoDiaCalendarImpl.setStrong(strong);
		}

		tipoDiaCalendarImpl.resetOriginalValues();

		return tipoDiaCalendarImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tipoDiaCalendarId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		fondoColor = objectInput.readUTF();
		letraColor = objectInput.readUTF();
		strong = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(tipoDiaCalendarId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		if (fondoColor == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fondoColor);
		}

		if (letraColor == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(letraColor);
		}

		if (strong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(strong);
		}
	}

	public long tipoDiaCalendarId;
	public String descripcion;
	public String fondoColor;
	public String letraColor;
	public String strong;
}