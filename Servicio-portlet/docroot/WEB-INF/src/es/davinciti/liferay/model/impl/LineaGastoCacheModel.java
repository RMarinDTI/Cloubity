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

import es.davinciti.liferay.model.LineaGasto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LineaGasto in entity cache.
 *
 * @author Cmes
 * @see LineaGasto
 * @generated
 */
public class LineaGastoCacheModel implements CacheModel<LineaGasto>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{lineagastoId=");
		sb.append(lineagastoId);
		sb.append(", date=");
		sb.append(date);
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", documentId=");
		sb.append(documentId);
		sb.append(", comments=");
		sb.append(comments);
		sb.append(", status=");
		sb.append(status);
		sb.append(", price=");
		sb.append(price);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LineaGasto toEntityModel() {
		LineaGastoImpl lineaGastoImpl = new LineaGastoImpl();

		lineaGastoImpl.setLineagastoId(lineagastoId);

		if (date == null) {
			lineaGastoImpl.setDate(StringPool.BLANK);
		}
		else {
			lineaGastoImpl.setDate(date);
		}

		if (amount == null) {
			lineaGastoImpl.setAmount(StringPool.BLANK);
		}
		else {
			lineaGastoImpl.setAmount(amount);
		}

		if (documentId == null) {
			lineaGastoImpl.setDocumentId(StringPool.BLANK);
		}
		else {
			lineaGastoImpl.setDocumentId(documentId);
		}

		if (comments == null) {
			lineaGastoImpl.setComments(StringPool.BLANK);
		}
		else {
			lineaGastoImpl.setComments(comments);
		}

		if (status == null) {
			lineaGastoImpl.setStatus(StringPool.BLANK);
		}
		else {
			lineaGastoImpl.setStatus(status);
		}

		if (price == null) {
			lineaGastoImpl.setPrice(StringPool.BLANK);
		}
		else {
			lineaGastoImpl.setPrice(price);
		}

		if (quantity == null) {
			lineaGastoImpl.setQuantity(StringPool.BLANK);
		}
		else {
			lineaGastoImpl.setQuantity(quantity);
		}

		lineaGastoImpl.resetOriginalValues();

		return lineaGastoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		lineagastoId = objectInput.readLong();
		date = objectInput.readUTF();
		amount = objectInput.readUTF();
		documentId = objectInput.readUTF();
		comments = objectInput.readUTF();
		status = objectInput.readUTF();
		price = objectInput.readUTF();
		quantity = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(lineagastoId);

		if (date == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(date);
		}

		if (amount == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(amount);
		}

		if (documentId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(documentId);
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

		if (price == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(price);
		}

		if (quantity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(quantity);
		}
	}

	public long lineagastoId;
	public String date;
	public String amount;
	public String documentId;
	public String comments;
	public String status;
	public String price;
	public String quantity;
}