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

import es.davinciti.liferay.model.ApplicationStatus;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ApplicationStatus in entity cache.
 *
 * @author Cmes
 * @see ApplicationStatus
 * @generated
 */
public class ApplicationStatusCacheModel implements CacheModel<ApplicationStatus>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{applicationStatusId=");
		sb.append(applicationStatusId);
		sb.append(", applicationName=");
		sb.append(applicationName);
		sb.append(", statusId=");
		sb.append(statusId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ApplicationStatus toEntityModel() {
		ApplicationStatusImpl applicationStatusImpl = new ApplicationStatusImpl();

		applicationStatusImpl.setApplicationStatusId(applicationStatusId);

		if (applicationName == null) {
			applicationStatusImpl.setApplicationName(StringPool.BLANK);
		}
		else {
			applicationStatusImpl.setApplicationName(applicationName);
		}

		if (statusId == null) {
			applicationStatusImpl.setStatusId(StringPool.BLANK);
		}
		else {
			applicationStatusImpl.setStatusId(statusId);
		}

		if (name == null) {
			applicationStatusImpl.setName(StringPool.BLANK);
		}
		else {
			applicationStatusImpl.setName(name);
		}

		if (description == null) {
			applicationStatusImpl.setDescription(StringPool.BLANK);
		}
		else {
			applicationStatusImpl.setDescription(description);
		}

		applicationStatusImpl.resetOriginalValues();

		return applicationStatusImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		applicationStatusId = objectInput.readLong();
		applicationName = objectInput.readUTF();
		statusId = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(applicationStatusId);

		if (applicationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicationName);
		}

		if (statusId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusId);
		}

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

	public long applicationStatusId;
	public String applicationName;
	public String statusId;
	public String name;
	public String description;
}