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

package es.davinciti.liferay.service.base;

import es.davinciti.liferay.service.NotaGastoServiceUtil;

import java.util.Arrays;

/**
 * @author Cmes
 * @generated
 */
public class NotaGastoServiceClpInvoker {
	public NotaGastoServiceClpInvoker() {
		_methodName138 = "getBeanIdentifier";

		_methodParameterTypes138 = new String[] {  };

		_methodName139 = "setBeanIdentifier";

		_methodParameterTypes139 = new String[] { "java.lang.String" };

		_methodName144 = "getApplicationStatusName";

		_methodParameterTypes144 = new String[] { "long", "java.lang.String" };

		_methodName145 = "isUsuarioAdministrador";

		_methodParameterTypes145 = new String[] { "long", "long" };

		_methodName146 = "isUsuarioValidador";

		_methodParameterTypes146 = new String[] { "long", "long" };

		_methodName147 = "isUsuarioBasico";

		_methodParameterTypes147 = new String[] { "long", "long" };

		_methodName148 = "getOrganizationSageCompanies";

		_methodParameterTypes148 = new String[] { "long", "long" };

		_methodName149 = "getCompanyExpensesNote";

		_methodParameterTypes149 = new String[] { "long" };

		_methodName150 = "getUserExpensesNote";

		_methodParameterTypes150 = new String[] { "long", "long" };

		_methodName151 = "addNotaGasto";

		_methodParameterTypes151 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String"
			};

		_methodName152 = "editNotaGasto";

		_methodParameterTypes152 = new String[] {
				"long", "com.liferay.portal.kernel.json.JSONObject",
				"java.lang.String"
			};

		_methodName153 = "deleteNotaGasto";

		_methodParameterTypes153 = new String[] { "long", "java.lang.String" };

		_methodName154 = "sendValidateNotaGasto";

		_methodParameterTypes154 = new String[] { "long", "java.lang.String" };

		_methodName155 = "denyNotaGasto";

		_methodParameterTypes155 = new String[] { "long", "java.lang.String" };

		_methodName156 = "validateNotaGasto";

		_methodParameterTypes156 = new String[] {
				"long", "long", "long", "java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName138.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes138, parameterTypes)) {
			return NotaGastoServiceUtil.getBeanIdentifier();
		}

		if (_methodName139.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes139, parameterTypes)) {
			NotaGastoServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName144.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes144, parameterTypes)) {
			return NotaGastoServiceUtil.getApplicationStatusName(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName145.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes145, parameterTypes)) {
			return NotaGastoServiceUtil.isUsuarioAdministrador(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName146.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes146, parameterTypes)) {
			return NotaGastoServiceUtil.isUsuarioValidador(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName147.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes147, parameterTypes)) {
			return NotaGastoServiceUtil.isUsuarioBasico(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName148.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes148, parameterTypes)) {
			return NotaGastoServiceUtil.getOrganizationSageCompanies(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName149.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes149, parameterTypes)) {
			return NotaGastoServiceUtil.getCompanyExpensesNote(((Long)arguments[0]).longValue());
		}

		if (_methodName150.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes150, parameterTypes)) {
			return NotaGastoServiceUtil.getUserExpensesNote(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName151.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes151, parameterTypes)) {
			return NotaGastoServiceUtil.addNotaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3]);
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return NotaGastoServiceUtil.editNotaGasto(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.json.JSONObject)arguments[1],
				(java.lang.String)arguments[2]);
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			return NotaGastoServiceUtil.deleteNotaGasto(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName154.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes154, parameterTypes)) {
			return NotaGastoServiceUtil.sendValidateNotaGasto(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName155.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes155, parameterTypes)) {
			return NotaGastoServiceUtil.denyNotaGasto(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName156.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes156, parameterTypes)) {
			return NotaGastoServiceUtil.validateNotaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(), (java.lang.String)arguments[3]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName138;
	private String[] _methodParameterTypes138;
	private String _methodName139;
	private String[] _methodParameterTypes139;
	private String _methodName144;
	private String[] _methodParameterTypes144;
	private String _methodName145;
	private String[] _methodParameterTypes145;
	private String _methodName146;
	private String[] _methodParameterTypes146;
	private String _methodName147;
	private String[] _methodParameterTypes147;
	private String _methodName148;
	private String[] _methodParameterTypes148;
	private String _methodName149;
	private String[] _methodParameterTypes149;
	private String _methodName150;
	private String[] _methodParameterTypes150;
	private String _methodName151;
	private String[] _methodParameterTypes151;
	private String _methodName152;
	private String[] _methodParameterTypes152;
	private String _methodName153;
	private String[] _methodParameterTypes153;
	private String _methodName154;
	private String[] _methodParameterTypes154;
	private String _methodName155;
	private String[] _methodParameterTypes155;
	private String _methodName156;
	private String[] _methodParameterTypes156;
}