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

import es.davinciti.liferay.model.SageEmployee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SageEmployee in entity cache.
 *
 * @author Cmes
 * @see SageEmployee
 * @generated
 */
public class SageEmployeeCacheModel implements CacheModel<SageEmployee>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{sageEmployeeId=");
		sb.append(sageEmployeeId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", employeeID=");
		sb.append(employeeID);
		sb.append(", applicationId=");
		sb.append(applicationId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", personId=");
		sb.append(personId);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", seniority=");
		sb.append(seniority);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SageEmployee toEntityModel() {
		SageEmployeeImpl sageEmployeeImpl = new SageEmployeeImpl();

		sageEmployeeImpl.setSageEmployeeId(sageEmployeeId);
		sageEmployeeImpl.setUserId(userId);

		if (employeeID == null) {
			sageEmployeeImpl.setEmployeeID(StringPool.BLANK);
		}
		else {
			sageEmployeeImpl.setEmployeeID(employeeID);
		}

		if (applicationId == null) {
			sageEmployeeImpl.setApplicationId(StringPool.BLANK);
		}
		else {
			sageEmployeeImpl.setApplicationId(applicationId);
		}

		if (companyId == null) {
			sageEmployeeImpl.setCompanyId(StringPool.BLANK);
		}
		else {
			sageEmployeeImpl.setCompanyId(companyId);
		}

		if (personId == null) {
			sageEmployeeImpl.setPersonId(StringPool.BLANK);
		}
		else {
			sageEmployeeImpl.setPersonId(personId);
		}

		if (startDate == null) {
			sageEmployeeImpl.setStartDate(StringPool.BLANK);
		}
		else {
			sageEmployeeImpl.setStartDate(startDate);
		}

		if (endDate == null) {
			sageEmployeeImpl.setEndDate(StringPool.BLANK);
		}
		else {
			sageEmployeeImpl.setEndDate(endDate);
		}

		if (seniority == null) {
			sageEmployeeImpl.setSeniority(StringPool.BLANK);
		}
		else {
			sageEmployeeImpl.setSeniority(seniority);
		}

		sageEmployeeImpl.resetOriginalValues();

		return sageEmployeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sageEmployeeId = objectInput.readLong();
		userId = objectInput.readLong();
		employeeID = objectInput.readUTF();
		applicationId = objectInput.readUTF();
		companyId = objectInput.readUTF();
		personId = objectInput.readUTF();
		startDate = objectInput.readUTF();
		endDate = objectInput.readUTF();
		seniority = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(sageEmployeeId);
		objectOutput.writeLong(userId);

		if (employeeID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeID);
		}

		if (applicationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicationId);
		}

		if (companyId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(companyId);
		}

		if (personId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(personId);
		}

		if (startDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(startDate);
		}

		if (endDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(endDate);
		}

		if (seniority == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(seniority);
		}
	}

	public long sageEmployeeId;
	public long userId;
	public String employeeID;
	public String applicationId;
	public String companyId;
	public String personId;
	public String startDate;
	public String endDate;
	public String seniority;
}