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

import es.davinciti.liferay.service.NotaGastoLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Cmes
 * @generated
 */
public class NotaGastoLocalServiceClpInvoker {
	public NotaGastoLocalServiceClpInvoker() {
		_methodName0 = "addNotaGasto";

		_methodParameterTypes0 = new String[] {
				"es.davinciti.liferay.model.NotaGasto"
			};

		_methodName1 = "createNotaGasto";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteNotaGasto";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteNotaGasto";

		_methodParameterTypes3 = new String[] {
				"es.davinciti.liferay.model.NotaGasto"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchNotaGasto";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getNotaGasto";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getNotaGastos";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getNotaGastosCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateNotaGasto";

		_methodParameterTypes15 = new String[] {
				"es.davinciti.liferay.model.NotaGasto"
			};

		_methodName16 = "addHistoricoNotaNotaGasto";

		_methodParameterTypes16 = new String[] { "long", "long" };

		_methodName17 = "addHistoricoNotaNotaGasto";

		_methodParameterTypes17 = new String[] {
				"long", "es.davinciti.liferay.model.NotaGasto"
			};

		_methodName18 = "addHistoricoNotaNotaGastos";

		_methodParameterTypes18 = new String[] { "long", "long[][]" };

		_methodName19 = "addHistoricoNotaNotaGastos";

		_methodParameterTypes19 = new String[] { "long", "java.util.List" };

		_methodName20 = "clearHistoricoNotaNotaGastos";

		_methodParameterTypes20 = new String[] { "long" };

		_methodName21 = "deleteHistoricoNotaNotaGasto";

		_methodParameterTypes21 = new String[] { "long", "long" };

		_methodName22 = "deleteHistoricoNotaNotaGasto";

		_methodParameterTypes22 = new String[] {
				"long", "es.davinciti.liferay.model.NotaGasto"
			};

		_methodName23 = "deleteHistoricoNotaNotaGastos";

		_methodParameterTypes23 = new String[] { "long", "long[][]" };

		_methodName24 = "deleteHistoricoNotaNotaGastos";

		_methodParameterTypes24 = new String[] { "long", "java.util.List" };

		_methodName25 = "getHistoricoNotaNotaGastos";

		_methodParameterTypes25 = new String[] { "long" };

		_methodName26 = "getHistoricoNotaNotaGastos";

		_methodParameterTypes26 = new String[] { "long", "int", "int" };

		_methodName27 = "getHistoricoNotaNotaGastos";

		_methodParameterTypes27 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName28 = "getHistoricoNotaNotaGastosCount";

		_methodParameterTypes28 = new String[] { "long" };

		_methodName29 = "hasHistoricoNotaNotaGasto";

		_methodParameterTypes29 = new String[] { "long", "long" };

		_methodName30 = "hasHistoricoNotaNotaGastos";

		_methodParameterTypes30 = new String[] { "long" };

		_methodName31 = "setHistoricoNotaNotaGastos";

		_methodParameterTypes31 = new String[] { "long", "long[][]" };

		_methodName32 = "addLineaGastoNotaGasto";

		_methodParameterTypes32 = new String[] { "long", "long" };

		_methodName33 = "addLineaGastoNotaGasto";

		_methodParameterTypes33 = new String[] {
				"long", "es.davinciti.liferay.model.NotaGasto"
			};

		_methodName34 = "addLineaGastoNotaGastos";

		_methodParameterTypes34 = new String[] { "long", "long[][]" };

		_methodName35 = "addLineaGastoNotaGastos";

		_methodParameterTypes35 = new String[] { "long", "java.util.List" };

		_methodName36 = "clearLineaGastoNotaGastos";

		_methodParameterTypes36 = new String[] { "long" };

		_methodName37 = "deleteLineaGastoNotaGasto";

		_methodParameterTypes37 = new String[] { "long", "long" };

		_methodName38 = "deleteLineaGastoNotaGasto";

		_methodParameterTypes38 = new String[] {
				"long", "es.davinciti.liferay.model.NotaGasto"
			};

		_methodName39 = "deleteLineaGastoNotaGastos";

		_methodParameterTypes39 = new String[] { "long", "long[][]" };

		_methodName40 = "deleteLineaGastoNotaGastos";

		_methodParameterTypes40 = new String[] { "long", "java.util.List" };

		_methodName41 = "getLineaGastoNotaGastos";

		_methodParameterTypes41 = new String[] { "long" };

		_methodName42 = "getLineaGastoNotaGastos";

		_methodParameterTypes42 = new String[] { "long", "int", "int" };

		_methodName43 = "getLineaGastoNotaGastos";

		_methodParameterTypes43 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName44 = "getLineaGastoNotaGastosCount";

		_methodParameterTypes44 = new String[] { "long" };

		_methodName45 = "hasLineaGastoNotaGasto";

		_methodParameterTypes45 = new String[] { "long", "long" };

		_methodName46 = "hasLineaGastoNotaGastos";

		_methodParameterTypes46 = new String[] { "long" };

		_methodName47 = "setLineaGastoNotaGastos";

		_methodParameterTypes47 = new String[] { "long", "long[][]" };

		_methodName48 = "addOrganizationSageCompanyNotaGasto";

		_methodParameterTypes48 = new String[] { "long", "long" };

		_methodName49 = "addOrganizationSageCompanyNotaGasto";

		_methodParameterTypes49 = new String[] {
				"long", "es.davinciti.liferay.model.NotaGasto"
			};

		_methodName50 = "addOrganizationSageCompanyNotaGastos";

		_methodParameterTypes50 = new String[] { "long", "long[][]" };

		_methodName51 = "addOrganizationSageCompanyNotaGastos";

		_methodParameterTypes51 = new String[] { "long", "java.util.List" };

		_methodName52 = "clearOrganizationSageCompanyNotaGastos";

		_methodParameterTypes52 = new String[] { "long" };

		_methodName53 = "deleteOrganizationSageCompanyNotaGasto";

		_methodParameterTypes53 = new String[] { "long", "long" };

		_methodName54 = "deleteOrganizationSageCompanyNotaGasto";

		_methodParameterTypes54 = new String[] {
				"long", "es.davinciti.liferay.model.NotaGasto"
			};

		_methodName55 = "deleteOrganizationSageCompanyNotaGastos";

		_methodParameterTypes55 = new String[] { "long", "long[][]" };

		_methodName56 = "deleteOrganizationSageCompanyNotaGastos";

		_methodParameterTypes56 = new String[] { "long", "java.util.List" };

		_methodName57 = "getOrganizationSageCompanyNotaGastos";

		_methodParameterTypes57 = new String[] { "long" };

		_methodName58 = "getOrganizationSageCompanyNotaGastos";

		_methodParameterTypes58 = new String[] { "long", "int", "int" };

		_methodName59 = "getOrganizationSageCompanyNotaGastos";

		_methodParameterTypes59 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName60 = "getOrganizationSageCompanyNotaGastosCount";

		_methodParameterTypes60 = new String[] { "long" };

		_methodName61 = "hasOrganizationSageCompanyNotaGasto";

		_methodParameterTypes61 = new String[] { "long", "long" };

		_methodName62 = "hasOrganizationSageCompanyNotaGastos";

		_methodParameterTypes62 = new String[] { "long" };

		_methodName63 = "setOrganizationSageCompanyNotaGastos";

		_methodParameterTypes63 = new String[] { "long", "long[][]" };

		_methodName202 = "getBeanIdentifier";

		_methodParameterTypes202 = new String[] {  };

		_methodName203 = "setBeanIdentifier";

		_methodParameterTypes203 = new String[] { "java.lang.String" };

		_methodName208 = "getOrganizationsSageCompanies";

		_methodParameterTypes208 = new String[] { "long" };

		_methodName209 = "getSageCompany";

		_methodParameterTypes209 = new String[] { "long" };

		_methodName210 = "findByCompanyIdUserId";

		_methodParameterTypes210 = new String[] { "long", "long" };

		_methodName211 = "findByCompanyId";

		_methodParameterTypes211 = new String[] { "long" };

		_methodName212 = "deleteNotaGastoLineas";

		_methodParameterTypes212 = new String[] { "long" };

		_methodName213 = "validateNotaGasto";

		_methodParameterTypes213 = new String[] {
				"long", "long", "long", "java.util.Locale"
			};

		_methodName214 = "getSageEmployeeId";

		_methodParameterTypes214 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return NotaGastoLocalServiceUtil.addNotaGasto((es.davinciti.liferay.model.NotaGasto)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return NotaGastoLocalServiceUtil.createNotaGasto(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return NotaGastoLocalServiceUtil.deleteNotaGasto(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return NotaGastoLocalServiceUtil.deleteNotaGasto((es.davinciti.liferay.model.NotaGasto)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return NotaGastoLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return NotaGastoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return NotaGastoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return NotaGastoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return NotaGastoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return NotaGastoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return NotaGastoLocalServiceUtil.fetchNotaGasto(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getNotaGasto(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getNotaGastos(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getNotaGastosCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return NotaGastoLocalServiceUtil.updateNotaGasto((es.davinciti.liferay.model.NotaGasto)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			NotaGastoLocalServiceUtil.addHistoricoNotaNotaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			NotaGastoLocalServiceUtil.addHistoricoNotaNotaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.NotaGasto)arguments[1]);

			return null;
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			NotaGastoLocalServiceUtil.addHistoricoNotaNotaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			NotaGastoLocalServiceUtil.addHistoricoNotaNotaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.NotaGasto>)arguments[1]);

			return null;
		}

		if (_methodName20.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
			NotaGastoLocalServiceUtil.clearHistoricoNotaNotaGastos(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName21.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
			NotaGastoLocalServiceUtil.deleteHistoricoNotaNotaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName22.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
			NotaGastoLocalServiceUtil.deleteHistoricoNotaNotaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.NotaGasto)arguments[1]);

			return null;
		}

		if (_methodName23.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
			NotaGastoLocalServiceUtil.deleteHistoricoNotaNotaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			NotaGastoLocalServiceUtil.deleteHistoricoNotaNotaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.NotaGasto>)arguments[1]);

			return null;
		}

		if (_methodName25.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getHistoricoNotaNotaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName26.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getHistoricoNotaNotaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName27.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getHistoricoNotaNotaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName28.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getHistoricoNotaNotaGastosCount(((Long)arguments[0]).longValue());
		}

		if (_methodName29.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
			return NotaGastoLocalServiceUtil.hasHistoricoNotaNotaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return NotaGastoLocalServiceUtil.hasHistoricoNotaNotaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			NotaGastoLocalServiceUtil.setHistoricoNotaNotaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName32.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
			NotaGastoLocalServiceUtil.addLineaGastoNotaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName33.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes33, parameterTypes)) {
			NotaGastoLocalServiceUtil.addLineaGastoNotaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.NotaGasto)arguments[1]);

			return null;
		}

		if (_methodName34.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
			NotaGastoLocalServiceUtil.addLineaGastoNotaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName35.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes35, parameterTypes)) {
			NotaGastoLocalServiceUtil.addLineaGastoNotaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.NotaGasto>)arguments[1]);

			return null;
		}

		if (_methodName36.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
			NotaGastoLocalServiceUtil.clearLineaGastoNotaGastos(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName37.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
			NotaGastoLocalServiceUtil.deleteLineaGastoNotaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName38.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes38, parameterTypes)) {
			NotaGastoLocalServiceUtil.deleteLineaGastoNotaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.NotaGasto)arguments[1]);

			return null;
		}

		if (_methodName39.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes39, parameterTypes)) {
			NotaGastoLocalServiceUtil.deleteLineaGastoNotaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			NotaGastoLocalServiceUtil.deleteLineaGastoNotaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.NotaGasto>)arguments[1]);

			return null;
		}

		if (_methodName41.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getLineaGastoNotaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getLineaGastoNotaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getLineaGastoNotaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getLineaGastoNotaGastosCount(((Long)arguments[0]).longValue());
		}

		if (_methodName45.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes45, parameterTypes)) {
			return NotaGastoLocalServiceUtil.hasLineaGastoNotaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			return NotaGastoLocalServiceUtil.hasLineaGastoNotaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
			NotaGastoLocalServiceUtil.setLineaGastoNotaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
			NotaGastoLocalServiceUtil.addOrganizationSageCompanyNotaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
			NotaGastoLocalServiceUtil.addOrganizationSageCompanyNotaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.NotaGasto)arguments[1]);

			return null;
		}

		if (_methodName50.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
			NotaGastoLocalServiceUtil.addOrganizationSageCompanyNotaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName51.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
			NotaGastoLocalServiceUtil.addOrganizationSageCompanyNotaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.NotaGasto>)arguments[1]);

			return null;
		}

		if (_methodName52.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
			NotaGastoLocalServiceUtil.clearOrganizationSageCompanyNotaGastos(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName53.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
			NotaGastoLocalServiceUtil.deleteOrganizationSageCompanyNotaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName54.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
			NotaGastoLocalServiceUtil.deleteOrganizationSageCompanyNotaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.NotaGasto)arguments[1]);

			return null;
		}

		if (_methodName55.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
			NotaGastoLocalServiceUtil.deleteOrganizationSageCompanyNotaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName56.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
			NotaGastoLocalServiceUtil.deleteOrganizationSageCompanyNotaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.NotaGasto>)arguments[1]);

			return null;
		}

		if (_methodName57.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getOrganizationSageCompanyNotaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName58.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getOrganizationSageCompanyNotaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName59.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes59, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getOrganizationSageCompanyNotaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName60.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getOrganizationSageCompanyNotaGastosCount(((Long)arguments[0]).longValue());
		}

		if (_methodName61.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
			return NotaGastoLocalServiceUtil.hasOrganizationSageCompanyNotaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName62.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
			return NotaGastoLocalServiceUtil.hasOrganizationSageCompanyNotaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName63.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes63, parameterTypes)) {
			NotaGastoLocalServiceUtil.setOrganizationSageCompanyNotaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName202.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes202, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName203.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes203, parameterTypes)) {
			NotaGastoLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName208.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes208, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getOrganizationsSageCompanies(((Long)arguments[0]).longValue());
		}

		if (_methodName209.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes209, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getSageCompany(((Long)arguments[0]).longValue());
		}

		if (_methodName210.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes210, parameterTypes)) {
			return NotaGastoLocalServiceUtil.findByCompanyIdUserId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName211.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes211, parameterTypes)) {
			return NotaGastoLocalServiceUtil.findByCompanyId(((Long)arguments[0]).longValue());
		}

		if (_methodName212.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes212, parameterTypes)) {
			NotaGastoLocalServiceUtil.deleteNotaGastoLineas(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName213.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes213, parameterTypes)) {
			return NotaGastoLocalServiceUtil.validateNotaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(), (java.util.Locale)arguments[3]);
		}

		if (_methodName214.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes214, parameterTypes)) {
			return NotaGastoLocalServiceUtil.getSageEmployeeId(((Long)arguments[0]).longValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
	private String _methodName22;
	private String[] _methodParameterTypes22;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
	private String _methodName26;
	private String[] _methodParameterTypes26;
	private String _methodName27;
	private String[] _methodParameterTypes27;
	private String _methodName28;
	private String[] _methodParameterTypes28;
	private String _methodName29;
	private String[] _methodParameterTypes29;
	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName32;
	private String[] _methodParameterTypes32;
	private String _methodName33;
	private String[] _methodParameterTypes33;
	private String _methodName34;
	private String[] _methodParameterTypes34;
	private String _methodName35;
	private String[] _methodParameterTypes35;
	private String _methodName36;
	private String[] _methodParameterTypes36;
	private String _methodName37;
	private String[] _methodParameterTypes37;
	private String _methodName38;
	private String[] _methodParameterTypes38;
	private String _methodName39;
	private String[] _methodParameterTypes39;
	private String _methodName40;
	private String[] _methodParameterTypes40;
	private String _methodName41;
	private String[] _methodParameterTypes41;
	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName44;
	private String[] _methodParameterTypes44;
	private String _methodName45;
	private String[] _methodParameterTypes45;
	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName48;
	private String[] _methodParameterTypes48;
	private String _methodName49;
	private String[] _methodParameterTypes49;
	private String _methodName50;
	private String[] _methodParameterTypes50;
	private String _methodName51;
	private String[] _methodParameterTypes51;
	private String _methodName52;
	private String[] _methodParameterTypes52;
	private String _methodName53;
	private String[] _methodParameterTypes53;
	private String _methodName54;
	private String[] _methodParameterTypes54;
	private String _methodName55;
	private String[] _methodParameterTypes55;
	private String _methodName56;
	private String[] _methodParameterTypes56;
	private String _methodName57;
	private String[] _methodParameterTypes57;
	private String _methodName58;
	private String[] _methodParameterTypes58;
	private String _methodName59;
	private String[] _methodParameterTypes59;
	private String _methodName60;
	private String[] _methodParameterTypes60;
	private String _methodName61;
	private String[] _methodParameterTypes61;
	private String _methodName62;
	private String[] _methodParameterTypes62;
	private String _methodName63;
	private String[] _methodParameterTypes63;
	private String _methodName202;
	private String[] _methodParameterTypes202;
	private String _methodName203;
	private String[] _methodParameterTypes203;
	private String _methodName208;
	private String[] _methodParameterTypes208;
	private String _methodName209;
	private String[] _methodParameterTypes209;
	private String _methodName210;
	private String[] _methodParameterTypes210;
	private String _methodName211;
	private String[] _methodParameterTypes211;
	private String _methodName212;
	private String[] _methodParameterTypes212;
	private String _methodName213;
	private String[] _methodParameterTypes213;
	private String _methodName214;
	private String[] _methodParameterTypes214;
}