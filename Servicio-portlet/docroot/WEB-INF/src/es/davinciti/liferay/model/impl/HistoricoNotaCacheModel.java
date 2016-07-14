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

import es.davinciti.liferay.model.HistoricoNota;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing HistoricoNota in entity cache.
 *
 * @author Cmes
 * @see HistoricoNota
 * @generated
 */
public class HistoricoNotaCacheModel implements CacheModel<HistoricoNota>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{historiconotaId=");
		sb.append(historiconotaId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", comments=");
		sb.append(comments);
		sb.append(", updateAt=");
		sb.append(updateAt);
		sb.append(", prevStatus=");
		sb.append(prevStatus);
		sb.append(", newStatus=");
		sb.append(newStatus);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HistoricoNota toEntityModel() {
		HistoricoNotaImpl historicoNotaImpl = new HistoricoNotaImpl();

		historicoNotaImpl.setHistoriconotaId(historiconotaId);
		historicoNotaImpl.setCompanyId(companyId);
		historicoNotaImpl.setUserId(userId);

		if (comments == null) {
			historicoNotaImpl.setComments(StringPool.BLANK);
		}
		else {
			historicoNotaImpl.setComments(comments);
		}

		if (updateAt == null) {
			historicoNotaImpl.setUpdateAt(StringPool.BLANK);
		}
		else {
			historicoNotaImpl.setUpdateAt(updateAt);
		}

		if (prevStatus == null) {
			historicoNotaImpl.setPrevStatus(StringPool.BLANK);
		}
		else {
			historicoNotaImpl.setPrevStatus(prevStatus);
		}

		if (newStatus == null) {
			historicoNotaImpl.setNewStatus(StringPool.BLANK);
		}
		else {
			historicoNotaImpl.setNewStatus(newStatus);
		}

		historicoNotaImpl.resetOriginalValues();

		return historicoNotaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		historiconotaId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		comments = objectInput.readUTF();
		updateAt = objectInput.readUTF();
		prevStatus = objectInput.readUTF();
		newStatus = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(historiconotaId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (comments == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(comments);
		}

		if (updateAt == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(updateAt);
		}

		if (prevStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(prevStatus);
		}

		if (newStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(newStatus);
		}
	}

	public long historiconotaId;
	public long companyId;
	public long userId;
	public String comments;
	public String updateAt;
	public String prevStatus;
	public String newStatus;
}