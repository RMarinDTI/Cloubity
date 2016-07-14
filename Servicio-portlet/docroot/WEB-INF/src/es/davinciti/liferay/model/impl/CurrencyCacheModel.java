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

import es.davinciti.liferay.model.Currency;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Currency in entity cache.
 *
 * @author Cmes
 * @see Currency
 * @generated
 */
public class CurrencyCacheModel implements CacheModel<Currency>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{currencyId=");
		sb.append(currencyId);
		sb.append(", ccyMnrUnts=");
		sb.append(ccyMnrUnts);
		sb.append(", ccyName=");
		sb.append(ccyName);
		sb.append(", ccyNumber=");
		sb.append(ccyNumber);
		sb.append(", code=");
		sb.append(code);
		sb.append(", countryName=");
		sb.append(countryName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Currency toEntityModel() {
		CurrencyImpl currencyImpl = new CurrencyImpl();

		currencyImpl.setCurrencyId(currencyId);

		if (ccyMnrUnts == null) {
			currencyImpl.setCcyMnrUnts(StringPool.BLANK);
		}
		else {
			currencyImpl.setCcyMnrUnts(ccyMnrUnts);
		}

		if (ccyName == null) {
			currencyImpl.setCcyName(StringPool.BLANK);
		}
		else {
			currencyImpl.setCcyName(ccyName);
		}

		if (ccyNumber == null) {
			currencyImpl.setCcyNumber(StringPool.BLANK);
		}
		else {
			currencyImpl.setCcyNumber(ccyNumber);
		}

		if (code == null) {
			currencyImpl.setCode(StringPool.BLANK);
		}
		else {
			currencyImpl.setCode(code);
		}

		if (countryName == null) {
			currencyImpl.setCountryName(StringPool.BLANK);
		}
		else {
			currencyImpl.setCountryName(countryName);
		}

		currencyImpl.resetOriginalValues();

		return currencyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		currencyId = objectInput.readLong();
		ccyMnrUnts = objectInput.readUTF();
		ccyName = objectInput.readUTF();
		ccyNumber = objectInput.readUTF();
		code = objectInput.readUTF();
		countryName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(currencyId);

		if (ccyMnrUnts == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ccyMnrUnts);
		}

		if (ccyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ccyName);
		}

		if (ccyNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ccyNumber);
		}

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (countryName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(countryName);
		}
	}

	public long currencyId;
	public String ccyMnrUnts;
	public String ccyName;
	public String ccyNumber;
	public String code;
	public String countryName;
}