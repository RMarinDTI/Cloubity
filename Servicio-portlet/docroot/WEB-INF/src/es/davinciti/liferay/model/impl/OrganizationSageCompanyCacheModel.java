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

import es.davinciti.liferay.model.OrganizationSageCompany;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing OrganizationSageCompany in entity cache.
 *
 * @author Cmes
 * @see OrganizationSageCompany
 * @generated
 */
public class OrganizationSageCompanyCacheModel implements CacheModel<OrganizationSageCompany>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{orgsagecompanyId=");
		sb.append(orgsagecompanyId);
		sb.append(", organizationId=");
		sb.append(organizationId);
		sb.append(", sageCompanyId=");
		sb.append(sageCompanyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OrganizationSageCompany toEntityModel() {
		OrganizationSageCompanyImpl organizationSageCompanyImpl = new OrganizationSageCompanyImpl();

		organizationSageCompanyImpl.setOrgsagecompanyId(orgsagecompanyId);
		organizationSageCompanyImpl.setOrganizationId(organizationId);

		if (sageCompanyId == null) {
			organizationSageCompanyImpl.setSageCompanyId(StringPool.BLANK);
		}
		else {
			organizationSageCompanyImpl.setSageCompanyId(sageCompanyId);
		}

		organizationSageCompanyImpl.resetOriginalValues();

		return organizationSageCompanyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		orgsagecompanyId = objectInput.readLong();
		organizationId = objectInput.readLong();
		sageCompanyId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(orgsagecompanyId);
		objectOutput.writeLong(organizationId);

		if (sageCompanyId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sageCompanyId);
		}
	}

	public long orgsagecompanyId;
	public long organizationId;
	public String sageCompanyId;
}