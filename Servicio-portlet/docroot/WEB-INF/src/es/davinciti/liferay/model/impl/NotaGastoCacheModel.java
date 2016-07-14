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

import es.davinciti.liferay.model.NotaGasto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing NotaGasto in entity cache.
 *
 * @author Cmes
 * @see NotaGasto
 * @generated
 */
public class NotaGastoCacheModel implements CacheModel<NotaGasto>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{notagastoId=");
		sb.append(notagastoId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", description=");
		sb.append(description);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", comments=");
		sb.append(comments);
		sb.append(", status=");
		sb.append(status);
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", updateDate=");
		sb.append(updateDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NotaGasto toEntityModel() {
		NotaGastoImpl notaGastoImpl = new NotaGastoImpl();

		notaGastoImpl.setNotagastoId(notagastoId);
		notaGastoImpl.setCompanyId(companyId);
		notaGastoImpl.setUserId(userId);

		if (description == null) {
			notaGastoImpl.setDescription(StringPool.BLANK);
		}
		else {
			notaGastoImpl.setDescription(description);
		}

		if (startDate == null) {
			notaGastoImpl.setStartDate(StringPool.BLANK);
		}
		else {
			notaGastoImpl.setStartDate(startDate);
		}

		if (endDate == null) {
			notaGastoImpl.setEndDate(StringPool.BLANK);
		}
		else {
			notaGastoImpl.setEndDate(endDate);
		}

		if (comments == null) {
			notaGastoImpl.setComments(StringPool.BLANK);
		}
		else {
			notaGastoImpl.setComments(comments);
		}

		if (status == null) {
			notaGastoImpl.setStatus(StringPool.BLANK);
		}
		else {
			notaGastoImpl.setStatus(status);
		}

		if (amount == null) {
			notaGastoImpl.setAmount(StringPool.BLANK);
		}
		else {
			notaGastoImpl.setAmount(amount);
		}

		if (createDate == null) {
			notaGastoImpl.setCreateDate(StringPool.BLANK);
		}
		else {
			notaGastoImpl.setCreateDate(createDate);
		}

		if (updateDate == null) {
			notaGastoImpl.setUpdateDate(StringPool.BLANK);
		}
		else {
			notaGastoImpl.setUpdateDate(updateDate);
		}

		notaGastoImpl.resetOriginalValues();

		return notaGastoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		notagastoId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		description = objectInput.readUTF();
		startDate = objectInput.readUTF();
		endDate = objectInput.readUTF();
		comments = objectInput.readUTF();
		status = objectInput.readUTF();
		amount = objectInput.readUTF();
		createDate = objectInput.readUTF();
		updateDate = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(notagastoId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
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

		if (comments == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(comments);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (amount == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(amount);
		}

		if (createDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createDate);
		}

		if (updateDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(updateDate);
		}
	}

	public long notagastoId;
	public long companyId;
	public long userId;
	public String description;
	public String startDate;
	public String endDate;
	public String comments;
	public String status;
	public String amount;
	public String createDate;
	public String updateDate;
}