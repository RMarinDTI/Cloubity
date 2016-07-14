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

package es.davinciti.liferay.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import es.davinciti.liferay.model.ApplicationStatusClp;
import es.davinciti.liferay.model.CalendarioClp;
import es.davinciti.liferay.model.ConnectionActionTypesClp;
import es.davinciti.liferay.model.ConnectionConfigsClp;
import es.davinciti.liferay.model.ConnectionDataClp;
import es.davinciti.liferay.model.ConnectionTypesClp;
import es.davinciti.liferay.model.CurrenciesCompanyClp;
import es.davinciti.liferay.model.CurrencyClp;
import es.davinciti.liferay.model.DiasVacacionesClp;
import es.davinciti.liferay.model.HistoricoNotaClp;
import es.davinciti.liferay.model.LineaGastoCategoriaClp;
import es.davinciti.liferay.model.LineaGastoClienteClp;
import es.davinciti.liferay.model.LineaGastoClp;
import es.davinciti.liferay.model.LineaGastoFamiliaClp;
import es.davinciti.liferay.model.LineaGastoPayModeClp;
import es.davinciti.liferay.model.LineaGastoProyectoClp;
import es.davinciti.liferay.model.NotaGastoClp;
import es.davinciti.liferay.model.OrganizationSageCompanyClp;
import es.davinciti.liferay.model.SageEmployeeClp;
import es.davinciti.liferay.model.SapEmployeeClp;
import es.davinciti.liferay.model.TipoDiaCalendarClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cmes
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"Servicio-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"Servicio-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "Servicio-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(ApplicationStatusClp.class.getName())) {
			return translateInputApplicationStatus(oldModel);
		}

		if (oldModelClassName.equals(CalendarioClp.class.getName())) {
			return translateInputCalendario(oldModel);
		}

		if (oldModelClassName.equals(ConnectionActionTypesClp.class.getName())) {
			return translateInputConnectionActionTypes(oldModel);
		}

		if (oldModelClassName.equals(ConnectionConfigsClp.class.getName())) {
			return translateInputConnectionConfigs(oldModel);
		}

		if (oldModelClassName.equals(ConnectionDataClp.class.getName())) {
			return translateInputConnectionData(oldModel);
		}

		if (oldModelClassName.equals(ConnectionTypesClp.class.getName())) {
			return translateInputConnectionTypes(oldModel);
		}

		if (oldModelClassName.equals(CurrenciesCompanyClp.class.getName())) {
			return translateInputCurrenciesCompany(oldModel);
		}

		if (oldModelClassName.equals(CurrencyClp.class.getName())) {
			return translateInputCurrency(oldModel);
		}

		if (oldModelClassName.equals(DiasVacacionesClp.class.getName())) {
			return translateInputDiasVacaciones(oldModel);
		}

		if (oldModelClassName.equals(HistoricoNotaClp.class.getName())) {
			return translateInputHistoricoNota(oldModel);
		}

		if (oldModelClassName.equals(LineaGastoClp.class.getName())) {
			return translateInputLineaGasto(oldModel);
		}

		if (oldModelClassName.equals(LineaGastoCategoriaClp.class.getName())) {
			return translateInputLineaGastoCategoria(oldModel);
		}

		if (oldModelClassName.equals(LineaGastoClienteClp.class.getName())) {
			return translateInputLineaGastoCliente(oldModel);
		}

		if (oldModelClassName.equals(LineaGastoFamiliaClp.class.getName())) {
			return translateInputLineaGastoFamilia(oldModel);
		}

		if (oldModelClassName.equals(LineaGastoPayModeClp.class.getName())) {
			return translateInputLineaGastoPayMode(oldModel);
		}

		if (oldModelClassName.equals(LineaGastoProyectoClp.class.getName())) {
			return translateInputLineaGastoProyecto(oldModel);
		}

		if (oldModelClassName.equals(NotaGastoClp.class.getName())) {
			return translateInputNotaGasto(oldModel);
		}

		if (oldModelClassName.equals(OrganizationSageCompanyClp.class.getName())) {
			return translateInputOrganizationSageCompany(oldModel);
		}

		if (oldModelClassName.equals(SageEmployeeClp.class.getName())) {
			return translateInputSageEmployee(oldModel);
		}

		if (oldModelClassName.equals(SapEmployeeClp.class.getName())) {
			return translateInputSapEmployee(oldModel);
		}

		if (oldModelClassName.equals(TipoDiaCalendarClp.class.getName())) {
			return translateInputTipoDiaCalendar(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputApplicationStatus(BaseModel<?> oldModel) {
		ApplicationStatusClp oldClpModel = (ApplicationStatusClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getApplicationStatusRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCalendario(BaseModel<?> oldModel) {
		CalendarioClp oldClpModel = (CalendarioClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCalendarioRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputConnectionActionTypes(
		BaseModel<?> oldModel) {
		ConnectionActionTypesClp oldClpModel = (ConnectionActionTypesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getConnectionActionTypesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputConnectionConfigs(BaseModel<?> oldModel) {
		ConnectionConfigsClp oldClpModel = (ConnectionConfigsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getConnectionConfigsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputConnectionData(BaseModel<?> oldModel) {
		ConnectionDataClp oldClpModel = (ConnectionDataClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getConnectionDataRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputConnectionTypes(BaseModel<?> oldModel) {
		ConnectionTypesClp oldClpModel = (ConnectionTypesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getConnectionTypesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCurrenciesCompany(BaseModel<?> oldModel) {
		CurrenciesCompanyClp oldClpModel = (CurrenciesCompanyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCurrenciesCompanyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCurrency(BaseModel<?> oldModel) {
		CurrencyClp oldClpModel = (CurrencyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCurrencyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDiasVacaciones(BaseModel<?> oldModel) {
		DiasVacacionesClp oldClpModel = (DiasVacacionesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDiasVacacionesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputHistoricoNota(BaseModel<?> oldModel) {
		HistoricoNotaClp oldClpModel = (HistoricoNotaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getHistoricoNotaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLineaGasto(BaseModel<?> oldModel) {
		LineaGastoClp oldClpModel = (LineaGastoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLineaGastoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLineaGastoCategoria(
		BaseModel<?> oldModel) {
		LineaGastoCategoriaClp oldClpModel = (LineaGastoCategoriaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLineaGastoCategoriaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLineaGastoCliente(BaseModel<?> oldModel) {
		LineaGastoClienteClp oldClpModel = (LineaGastoClienteClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLineaGastoClienteRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLineaGastoFamilia(BaseModel<?> oldModel) {
		LineaGastoFamiliaClp oldClpModel = (LineaGastoFamiliaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLineaGastoFamiliaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLineaGastoPayMode(BaseModel<?> oldModel) {
		LineaGastoPayModeClp oldClpModel = (LineaGastoPayModeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLineaGastoPayModeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLineaGastoProyecto(BaseModel<?> oldModel) {
		LineaGastoProyectoClp oldClpModel = (LineaGastoProyectoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLineaGastoProyectoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputNotaGasto(BaseModel<?> oldModel) {
		NotaGastoClp oldClpModel = (NotaGastoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getNotaGastoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputOrganizationSageCompany(
		BaseModel<?> oldModel) {
		OrganizationSageCompanyClp oldClpModel = (OrganizationSageCompanyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getOrganizationSageCompanyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSageEmployee(BaseModel<?> oldModel) {
		SageEmployeeClp oldClpModel = (SageEmployeeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSageEmployeeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSapEmployee(BaseModel<?> oldModel) {
		SapEmployeeClp oldClpModel = (SapEmployeeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSapEmployeeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTipoDiaCalendar(BaseModel<?> oldModel) {
		TipoDiaCalendarClp oldClpModel = (TipoDiaCalendarClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTipoDiaCalendarRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.ApplicationStatusImpl")) {
			return translateOutputApplicationStatus(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.CalendarioImpl")) {
			return translateOutputCalendario(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.ConnectionActionTypesImpl")) {
			return translateOutputConnectionActionTypes(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.ConnectionConfigsImpl")) {
			return translateOutputConnectionConfigs(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.ConnectionDataImpl")) {
			return translateOutputConnectionData(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.ConnectionTypesImpl")) {
			return translateOutputConnectionTypes(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.CurrenciesCompanyImpl")) {
			return translateOutputCurrenciesCompany(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.CurrencyImpl")) {
			return translateOutputCurrency(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.DiasVacacionesImpl")) {
			return translateOutputDiasVacaciones(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.HistoricoNotaImpl")) {
			return translateOutputHistoricoNota(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.LineaGastoImpl")) {
			return translateOutputLineaGasto(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.LineaGastoCategoriaImpl")) {
			return translateOutputLineaGastoCategoria(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.LineaGastoClienteImpl")) {
			return translateOutputLineaGastoCliente(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.LineaGastoFamiliaImpl")) {
			return translateOutputLineaGastoFamilia(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.LineaGastoPayModeImpl")) {
			return translateOutputLineaGastoPayMode(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.LineaGastoProyectoImpl")) {
			return translateOutputLineaGastoProyecto(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.NotaGastoImpl")) {
			return translateOutputNotaGasto(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.OrganizationSageCompanyImpl")) {
			return translateOutputOrganizationSageCompany(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.SageEmployeeImpl")) {
			return translateOutputSageEmployee(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.SapEmployeeImpl")) {
			return translateOutputSapEmployee(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"es.davinciti.liferay.model.impl.TipoDiaCalendarImpl")) {
			return translateOutputTipoDiaCalendar(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"es.davinciti.liferay.NoSuchApplicationStatusException")) {
			return new es.davinciti.liferay.NoSuchApplicationStatusException();
		}

		if (className.equals("es.davinciti.liferay.NoSuchCalendarioException")) {
			return new es.davinciti.liferay.NoSuchCalendarioException();
		}

		if (className.equals(
					"es.davinciti.liferay.NoSuchConnectionActionTypesException")) {
			return new es.davinciti.liferay.NoSuchConnectionActionTypesException();
		}

		if (className.equals(
					"es.davinciti.liferay.NoSuchConnectionConfigsException")) {
			return new es.davinciti.liferay.NoSuchConnectionConfigsException();
		}

		if (className.equals(
					"es.davinciti.liferay.NoSuchConnectionDataException")) {
			return new es.davinciti.liferay.NoSuchConnectionDataException();
		}

		if (className.equals(
					"es.davinciti.liferay.NoSuchConnectionTypesException")) {
			return new es.davinciti.liferay.NoSuchConnectionTypesException();
		}

		if (className.equals(
					"es.davinciti.liferay.NoSuchCurrenciesCompanyException")) {
			return new es.davinciti.liferay.NoSuchCurrenciesCompanyException();
		}

		if (className.equals("es.davinciti.liferay.NoSuchCurrencyException")) {
			return new es.davinciti.liferay.NoSuchCurrencyException();
		}

		if (className.equals(
					"es.davinciti.liferay.NoSuchDiasVacacionesException")) {
			return new es.davinciti.liferay.NoSuchDiasVacacionesException();
		}

		if (className.equals(
					"es.davinciti.liferay.NoSuchHistoricoNotaException")) {
			return new es.davinciti.liferay.NoSuchHistoricoNotaException();
		}

		if (className.equals("es.davinciti.liferay.NoSuchLineaGastoException")) {
			return new es.davinciti.liferay.NoSuchLineaGastoException();
		}

		if (className.equals(
					"es.davinciti.liferay.NoSuchLineaGastoCategoriaException")) {
			return new es.davinciti.liferay.NoSuchLineaGastoCategoriaException();
		}

		if (className.equals(
					"es.davinciti.liferay.NoSuchLineaGastoClienteException")) {
			return new es.davinciti.liferay.NoSuchLineaGastoClienteException();
		}

		if (className.equals(
					"es.davinciti.liferay.NoSuchLineaGastoFamiliaException")) {
			return new es.davinciti.liferay.NoSuchLineaGastoFamiliaException();
		}

		if (className.equals(
					"es.davinciti.liferay.NoSuchLineaGastoPayModeException")) {
			return new es.davinciti.liferay.NoSuchLineaGastoPayModeException();
		}

		if (className.equals(
					"es.davinciti.liferay.NoSuchLineaGastoProyectoException")) {
			return new es.davinciti.liferay.NoSuchLineaGastoProyectoException();
		}

		if (className.equals("es.davinciti.liferay.NoSuchNotaGastoException")) {
			return new es.davinciti.liferay.NoSuchNotaGastoException();
		}

		if (className.equals(
					"es.davinciti.liferay.NoSuchOrganizationSageCompanyException")) {
			return new es.davinciti.liferay.NoSuchOrganizationSageCompanyException();
		}

		if (className.equals("es.davinciti.liferay.NoSuchSageEmployeeException")) {
			return new es.davinciti.liferay.NoSuchSageEmployeeException();
		}

		if (className.equals("es.davinciti.liferay.NoSuchSapEmployeeException")) {
			return new es.davinciti.liferay.NoSuchSapEmployeeException();
		}

		if (className.equals(
					"es.davinciti.liferay.NoSuchTipoDiaCalendarException")) {
			return new es.davinciti.liferay.NoSuchTipoDiaCalendarException();
		}

		return throwable;
	}

	public static Object translateOutputApplicationStatus(BaseModel<?> oldModel) {
		ApplicationStatusClp newModel = new ApplicationStatusClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setApplicationStatusRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCalendario(BaseModel<?> oldModel) {
		CalendarioClp newModel = new CalendarioClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCalendarioRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputConnectionActionTypes(
		BaseModel<?> oldModel) {
		ConnectionActionTypesClp newModel = new ConnectionActionTypesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setConnectionActionTypesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputConnectionConfigs(BaseModel<?> oldModel) {
		ConnectionConfigsClp newModel = new ConnectionConfigsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setConnectionConfigsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputConnectionData(BaseModel<?> oldModel) {
		ConnectionDataClp newModel = new ConnectionDataClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setConnectionDataRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputConnectionTypes(BaseModel<?> oldModel) {
		ConnectionTypesClp newModel = new ConnectionTypesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setConnectionTypesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCurrenciesCompany(BaseModel<?> oldModel) {
		CurrenciesCompanyClp newModel = new CurrenciesCompanyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCurrenciesCompanyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCurrency(BaseModel<?> oldModel) {
		CurrencyClp newModel = new CurrencyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCurrencyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDiasVacaciones(BaseModel<?> oldModel) {
		DiasVacacionesClp newModel = new DiasVacacionesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDiasVacacionesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputHistoricoNota(BaseModel<?> oldModel) {
		HistoricoNotaClp newModel = new HistoricoNotaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setHistoricoNotaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLineaGasto(BaseModel<?> oldModel) {
		LineaGastoClp newModel = new LineaGastoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLineaGastoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLineaGastoCategoria(
		BaseModel<?> oldModel) {
		LineaGastoCategoriaClp newModel = new LineaGastoCategoriaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLineaGastoCategoriaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLineaGastoCliente(BaseModel<?> oldModel) {
		LineaGastoClienteClp newModel = new LineaGastoClienteClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLineaGastoClienteRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLineaGastoFamilia(BaseModel<?> oldModel) {
		LineaGastoFamiliaClp newModel = new LineaGastoFamiliaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLineaGastoFamiliaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLineaGastoPayMode(BaseModel<?> oldModel) {
		LineaGastoPayModeClp newModel = new LineaGastoPayModeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLineaGastoPayModeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLineaGastoProyecto(
		BaseModel<?> oldModel) {
		LineaGastoProyectoClp newModel = new LineaGastoProyectoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLineaGastoProyectoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputNotaGasto(BaseModel<?> oldModel) {
		NotaGastoClp newModel = new NotaGastoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setNotaGastoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputOrganizationSageCompany(
		BaseModel<?> oldModel) {
		OrganizationSageCompanyClp newModel = new OrganizationSageCompanyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setOrganizationSageCompanyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSageEmployee(BaseModel<?> oldModel) {
		SageEmployeeClp newModel = new SageEmployeeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSageEmployeeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSapEmployee(BaseModel<?> oldModel) {
		SapEmployeeClp newModel = new SapEmployeeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSapEmployeeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTipoDiaCalendar(BaseModel<?> oldModel) {
		TipoDiaCalendarClp newModel = new TipoDiaCalendarClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTipoDiaCalendarRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}