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

import es.davinciti.liferay.model.LineaGastoCategoria;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LineaGastoCategoria in entity cache.
 *
 * @author Cmes
 * @see LineaGastoCategoria
 * @generated
 */
public class LineaGastoCategoriaCacheModel implements CacheModel<LineaGastoCategoria>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{categoriaId=");
		sb.append(categoriaId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", categoryCode=");
		sb.append(categoryCode);
		sb.append(", accountCode=");
		sb.append(accountCode);
		sb.append(", changePrice=");
		sb.append(changePrice);
		sb.append(", needQuantity=");
		sb.append(needQuantity);
		sb.append(", price=");
		sb.append(price);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LineaGastoCategoria toEntityModel() {
		LineaGastoCategoriaImpl lineaGastoCategoriaImpl = new LineaGastoCategoriaImpl();

		lineaGastoCategoriaImpl.setCategoriaId(categoriaId);

		if (name == null) {
			lineaGastoCategoriaImpl.setName(StringPool.BLANK);
		}
		else {
			lineaGastoCategoriaImpl.setName(name);
		}

		if (description == null) {
			lineaGastoCategoriaImpl.setDescription(StringPool.BLANK);
		}
		else {
			lineaGastoCategoriaImpl.setDescription(description);
		}

		if (categoryCode == null) {
			lineaGastoCategoriaImpl.setCategoryCode(StringPool.BLANK);
		}
		else {
			lineaGastoCategoriaImpl.setCategoryCode(categoryCode);
		}

		if (accountCode == null) {
			lineaGastoCategoriaImpl.setAccountCode(StringPool.BLANK);
		}
		else {
			lineaGastoCategoriaImpl.setAccountCode(accountCode);
		}

		if (changePrice == null) {
			lineaGastoCategoriaImpl.setChangePrice(StringPool.BLANK);
		}
		else {
			lineaGastoCategoriaImpl.setChangePrice(changePrice);
		}

		if (needQuantity == null) {
			lineaGastoCategoriaImpl.setNeedQuantity(StringPool.BLANK);
		}
		else {
			lineaGastoCategoriaImpl.setNeedQuantity(needQuantity);
		}

		if (price == null) {
			lineaGastoCategoriaImpl.setPrice(StringPool.BLANK);
		}
		else {
			lineaGastoCategoriaImpl.setPrice(price);
		}

		lineaGastoCategoriaImpl.resetOriginalValues();

		return lineaGastoCategoriaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		categoriaId = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		categoryCode = objectInput.readUTF();
		accountCode = objectInput.readUTF();
		changePrice = objectInput.readUTF();
		needQuantity = objectInput.readUTF();
		price = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(categoriaId);

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

		if (categoryCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(categoryCode);
		}

		if (accountCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(accountCode);
		}

		if (changePrice == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(changePrice);
		}

		if (needQuantity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(needQuantity);
		}

		if (price == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(price);
		}
	}

	public long categoriaId;
	public String name;
	public String description;
	public String categoryCode;
	public String accountCode;
	public String changePrice;
	public String needQuantity;
	public String price;
}