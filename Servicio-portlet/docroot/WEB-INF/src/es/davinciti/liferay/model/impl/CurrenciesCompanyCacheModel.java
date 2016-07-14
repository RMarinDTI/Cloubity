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

import es.davinciti.liferay.model.CurrenciesCompany;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CurrenciesCompany in entity cache.
 *
 * @author Cmes
 * @see CurrenciesCompany
 * @generated
 */
public class CurrenciesCompanyCacheModel implements CacheModel<CurrenciesCompany>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{currenciescompanyId=");
		sb.append(currenciescompanyId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", currenciesJson=");
		sb.append(currenciesJson);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CurrenciesCompany toEntityModel() {
		CurrenciesCompanyImpl currenciesCompanyImpl = new CurrenciesCompanyImpl();

		currenciesCompanyImpl.setCurrenciescompanyId(currenciescompanyId);
		currenciesCompanyImpl.setCompanyId(companyId);

		if (currenciesJson == null) {
			currenciesCompanyImpl.setCurrenciesJson(StringPool.BLANK);
		}
		else {
			currenciesCompanyImpl.setCurrenciesJson(currenciesJson);
		}

		currenciesCompanyImpl.resetOriginalValues();

		return currenciesCompanyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		currenciescompanyId = objectInput.readLong();
		companyId = objectInput.readLong();
		currenciesJson = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(currenciescompanyId);
		objectOutput.writeLong(companyId);

		if (currenciesJson == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currenciesJson);
		}
	}

	public long currenciescompanyId;
	public long companyId;
	public String currenciesJson;
}