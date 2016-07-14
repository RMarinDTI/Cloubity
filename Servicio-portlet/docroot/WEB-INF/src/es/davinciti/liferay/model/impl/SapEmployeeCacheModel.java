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

import es.davinciti.liferay.model.SapEmployee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SapEmployee in entity cache.
 *
 * @author Cmes
 * @see SapEmployee
 * @generated
 */
public class SapEmployeeCacheModel implements CacheModel<SapEmployee>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{sapEmployeeId=");
		sb.append(sapEmployeeId);
		sb.append(", employeeID=");
		sb.append(employeeID);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", jobTitle=");
		sb.append(jobTitle);
		sb.append(", employeeType=");
		sb.append(employeeType);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SapEmployee toEntityModel() {
		SapEmployeeImpl sapEmployeeImpl = new SapEmployeeImpl();

		sapEmployeeImpl.setSapEmployeeId(sapEmployeeId);
		sapEmployeeImpl.setEmployeeID(employeeID);
		sapEmployeeImpl.setUserId(userId);

		if (middleName == null) {
			sapEmployeeImpl.setMiddleName(StringPool.BLANK);
		}
		else {
			sapEmployeeImpl.setMiddleName(middleName);
		}

		if (gender == null) {
			sapEmployeeImpl.setGender(StringPool.BLANK);
		}
		else {
			sapEmployeeImpl.setGender(gender);
		}

		if (jobTitle == null) {
			sapEmployeeImpl.setJobTitle(StringPool.BLANK);
		}
		else {
			sapEmployeeImpl.setJobTitle(jobTitle);
		}

		if (employeeType == null) {
			sapEmployeeImpl.setEmployeeType(StringPool.BLANK);
		}
		else {
			sapEmployeeImpl.setEmployeeType(employeeType);
		}

		sapEmployeeImpl.resetOriginalValues();

		return sapEmployeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sapEmployeeId = objectInput.readLong();
		employeeID = objectInput.readLong();
		userId = objectInput.readLong();
		middleName = objectInput.readUTF();
		gender = objectInput.readUTF();
		jobTitle = objectInput.readUTF();
		employeeType = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(sapEmployeeId);
		objectOutput.writeLong(employeeID);
		objectOutput.writeLong(userId);

		if (middleName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(middleName);
		}

		if (gender == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gender);
		}

		if (jobTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(jobTitle);
		}

		if (employeeType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeType);
		}
	}

	public long sapEmployeeId;
	public long employeeID;
	public long userId;
	public String middleName;
	public String gender;
	public String jobTitle;
	public String employeeType;
}