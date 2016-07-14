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

import es.davinciti.liferay.service.LineaGastoLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Cmes
 * @generated
 */
public class LineaGastoLocalServiceClpInvoker {
	public LineaGastoLocalServiceClpInvoker() {
		_methodName0 = "addLineaGasto";

		_methodParameterTypes0 = new String[] {
				"es.davinciti.liferay.model.LineaGasto"
			};

		_methodName1 = "createLineaGasto";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteLineaGasto";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteLineaGasto";

		_methodParameterTypes3 = new String[] {
				"es.davinciti.liferay.model.LineaGasto"
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

		_methodName10 = "fetchLineaGasto";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getLineaGasto";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getLineaGastos";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getLineaGastosCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateLineaGasto";

		_methodParameterTypes15 = new String[] {
				"es.davinciti.liferay.model.LineaGasto"
			};

		_methodName16 = "addNotaGastoLineaGasto";

		_methodParameterTypes16 = new String[] { "long", "long" };

		_methodName17 = "addNotaGastoLineaGasto";

		_methodParameterTypes17 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGasto"
			};

		_methodName18 = "addNotaGastoLineaGastos";

		_methodParameterTypes18 = new String[] { "long", "long[][]" };

		_methodName19 = "addNotaGastoLineaGastos";

		_methodParameterTypes19 = new String[] { "long", "java.util.List" };

		_methodName20 = "clearNotaGastoLineaGastos";

		_methodParameterTypes20 = new String[] { "long" };

		_methodName21 = "deleteNotaGastoLineaGasto";

		_methodParameterTypes21 = new String[] { "long", "long" };

		_methodName22 = "deleteNotaGastoLineaGasto";

		_methodParameterTypes22 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGasto"
			};

		_methodName23 = "deleteNotaGastoLineaGastos";

		_methodParameterTypes23 = new String[] { "long", "long[][]" };

		_methodName24 = "deleteNotaGastoLineaGastos";

		_methodParameterTypes24 = new String[] { "long", "java.util.List" };

		_methodName25 = "getNotaGastoLineaGastos";

		_methodParameterTypes25 = new String[] { "long" };

		_methodName26 = "getNotaGastoLineaGastos";

		_methodParameterTypes26 = new String[] { "long", "int", "int" };

		_methodName27 = "getNotaGastoLineaGastos";

		_methodParameterTypes27 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName28 = "getNotaGastoLineaGastosCount";

		_methodParameterTypes28 = new String[] { "long" };

		_methodName29 = "hasNotaGastoLineaGasto";

		_methodParameterTypes29 = new String[] { "long", "long" };

		_methodName30 = "hasNotaGastoLineaGastos";

		_methodParameterTypes30 = new String[] { "long" };

		_methodName31 = "setNotaGastoLineaGastos";

		_methodParameterTypes31 = new String[] { "long", "long[][]" };

		_methodName32 = "addLineaGastoPayModeLineaGasto";

		_methodParameterTypes32 = new String[] { "long", "long" };

		_methodName33 = "addLineaGastoPayModeLineaGasto";

		_methodParameterTypes33 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGasto"
			};

		_methodName34 = "addLineaGastoPayModeLineaGastos";

		_methodParameterTypes34 = new String[] { "long", "long[][]" };

		_methodName35 = "addLineaGastoPayModeLineaGastos";

		_methodParameterTypes35 = new String[] { "long", "java.util.List" };

		_methodName36 = "clearLineaGastoPayModeLineaGastos";

		_methodParameterTypes36 = new String[] { "long" };

		_methodName37 = "deleteLineaGastoPayModeLineaGasto";

		_methodParameterTypes37 = new String[] { "long", "long" };

		_methodName38 = "deleteLineaGastoPayModeLineaGasto";

		_methodParameterTypes38 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGasto"
			};

		_methodName39 = "deleteLineaGastoPayModeLineaGastos";

		_methodParameterTypes39 = new String[] { "long", "long[][]" };

		_methodName40 = "deleteLineaGastoPayModeLineaGastos";

		_methodParameterTypes40 = new String[] { "long", "java.util.List" };

		_methodName41 = "getLineaGastoPayModeLineaGastos";

		_methodParameterTypes41 = new String[] { "long" };

		_methodName42 = "getLineaGastoPayModeLineaGastos";

		_methodParameterTypes42 = new String[] { "long", "int", "int" };

		_methodName43 = "getLineaGastoPayModeLineaGastos";

		_methodParameterTypes43 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName44 = "getLineaGastoPayModeLineaGastosCount";

		_methodParameterTypes44 = new String[] { "long" };

		_methodName45 = "hasLineaGastoPayModeLineaGasto";

		_methodParameterTypes45 = new String[] { "long", "long" };

		_methodName46 = "hasLineaGastoPayModeLineaGastos";

		_methodParameterTypes46 = new String[] { "long" };

		_methodName47 = "setLineaGastoPayModeLineaGastos";

		_methodParameterTypes47 = new String[] { "long", "long[][]" };

		_methodName48 = "addCurrencyLineaGasto";

		_methodParameterTypes48 = new String[] { "long", "long" };

		_methodName49 = "addCurrencyLineaGasto";

		_methodParameterTypes49 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGasto"
			};

		_methodName50 = "addCurrencyLineaGastos";

		_methodParameterTypes50 = new String[] { "long", "long[][]" };

		_methodName51 = "addCurrencyLineaGastos";

		_methodParameterTypes51 = new String[] { "long", "java.util.List" };

		_methodName52 = "clearCurrencyLineaGastos";

		_methodParameterTypes52 = new String[] { "long" };

		_methodName53 = "deleteCurrencyLineaGasto";

		_methodParameterTypes53 = new String[] { "long", "long" };

		_methodName54 = "deleteCurrencyLineaGasto";

		_methodParameterTypes54 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGasto"
			};

		_methodName55 = "deleteCurrencyLineaGastos";

		_methodParameterTypes55 = new String[] { "long", "long[][]" };

		_methodName56 = "deleteCurrencyLineaGastos";

		_methodParameterTypes56 = new String[] { "long", "java.util.List" };

		_methodName57 = "getCurrencyLineaGastos";

		_methodParameterTypes57 = new String[] { "long" };

		_methodName58 = "getCurrencyLineaGastos";

		_methodParameterTypes58 = new String[] { "long", "int", "int" };

		_methodName59 = "getCurrencyLineaGastos";

		_methodParameterTypes59 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName60 = "getCurrencyLineaGastosCount";

		_methodParameterTypes60 = new String[] { "long" };

		_methodName61 = "hasCurrencyLineaGasto";

		_methodParameterTypes61 = new String[] { "long", "long" };

		_methodName62 = "hasCurrencyLineaGastos";

		_methodParameterTypes62 = new String[] { "long" };

		_methodName63 = "setCurrencyLineaGastos";

		_methodParameterTypes63 = new String[] { "long", "long[][]" };

		_methodName64 = "addLineaGastoFamiliaLineaGasto";

		_methodParameterTypes64 = new String[] { "long", "long" };

		_methodName65 = "addLineaGastoFamiliaLineaGasto";

		_methodParameterTypes65 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGasto"
			};

		_methodName66 = "addLineaGastoFamiliaLineaGastos";

		_methodParameterTypes66 = new String[] { "long", "long[][]" };

		_methodName67 = "addLineaGastoFamiliaLineaGastos";

		_methodParameterTypes67 = new String[] { "long", "java.util.List" };

		_methodName68 = "clearLineaGastoFamiliaLineaGastos";

		_methodParameterTypes68 = new String[] { "long" };

		_methodName69 = "deleteLineaGastoFamiliaLineaGasto";

		_methodParameterTypes69 = new String[] { "long", "long" };

		_methodName70 = "deleteLineaGastoFamiliaLineaGasto";

		_methodParameterTypes70 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGasto"
			};

		_methodName71 = "deleteLineaGastoFamiliaLineaGastos";

		_methodParameterTypes71 = new String[] { "long", "long[][]" };

		_methodName72 = "deleteLineaGastoFamiliaLineaGastos";

		_methodParameterTypes72 = new String[] { "long", "java.util.List" };

		_methodName73 = "getLineaGastoFamiliaLineaGastos";

		_methodParameterTypes73 = new String[] { "long" };

		_methodName74 = "getLineaGastoFamiliaLineaGastos";

		_methodParameterTypes74 = new String[] { "long", "int", "int" };

		_methodName75 = "getLineaGastoFamiliaLineaGastos";

		_methodParameterTypes75 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName76 = "getLineaGastoFamiliaLineaGastosCount";

		_methodParameterTypes76 = new String[] { "long" };

		_methodName77 = "hasLineaGastoFamiliaLineaGasto";

		_methodParameterTypes77 = new String[] { "long", "long" };

		_methodName78 = "hasLineaGastoFamiliaLineaGastos";

		_methodParameterTypes78 = new String[] { "long" };

		_methodName79 = "setLineaGastoFamiliaLineaGastos";

		_methodParameterTypes79 = new String[] { "long", "long[][]" };

		_methodName80 = "addLineaGastoCategoriaLineaGasto";

		_methodParameterTypes80 = new String[] { "long", "long" };

		_methodName81 = "addLineaGastoCategoriaLineaGasto";

		_methodParameterTypes81 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGasto"
			};

		_methodName82 = "addLineaGastoCategoriaLineaGastos";

		_methodParameterTypes82 = new String[] { "long", "long[][]" };

		_methodName83 = "addLineaGastoCategoriaLineaGastos";

		_methodParameterTypes83 = new String[] { "long", "java.util.List" };

		_methodName84 = "clearLineaGastoCategoriaLineaGastos";

		_methodParameterTypes84 = new String[] { "long" };

		_methodName85 = "deleteLineaGastoCategoriaLineaGasto";

		_methodParameterTypes85 = new String[] { "long", "long" };

		_methodName86 = "deleteLineaGastoCategoriaLineaGasto";

		_methodParameterTypes86 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGasto"
			};

		_methodName87 = "deleteLineaGastoCategoriaLineaGastos";

		_methodParameterTypes87 = new String[] { "long", "long[][]" };

		_methodName88 = "deleteLineaGastoCategoriaLineaGastos";

		_methodParameterTypes88 = new String[] { "long", "java.util.List" };

		_methodName89 = "getLineaGastoCategoriaLineaGastos";

		_methodParameterTypes89 = new String[] { "long" };

		_methodName90 = "getLineaGastoCategoriaLineaGastos";

		_methodParameterTypes90 = new String[] { "long", "int", "int" };

		_methodName91 = "getLineaGastoCategoriaLineaGastos";

		_methodParameterTypes91 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName92 = "getLineaGastoCategoriaLineaGastosCount";

		_methodParameterTypes92 = new String[] { "long" };

		_methodName93 = "hasLineaGastoCategoriaLineaGasto";

		_methodParameterTypes93 = new String[] { "long", "long" };

		_methodName94 = "hasLineaGastoCategoriaLineaGastos";

		_methodParameterTypes94 = new String[] { "long" };

		_methodName95 = "setLineaGastoCategoriaLineaGastos";

		_methodParameterTypes95 = new String[] { "long", "long[][]" };

		_methodName96 = "addLineaGastoClienteLineaGasto";

		_methodParameterTypes96 = new String[] { "long", "long" };

		_methodName97 = "addLineaGastoClienteLineaGasto";

		_methodParameterTypes97 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGasto"
			};

		_methodName98 = "addLineaGastoClienteLineaGastos";

		_methodParameterTypes98 = new String[] { "long", "long[][]" };

		_methodName99 = "addLineaGastoClienteLineaGastos";

		_methodParameterTypes99 = new String[] { "long", "java.util.List" };

		_methodName100 = "clearLineaGastoClienteLineaGastos";

		_methodParameterTypes100 = new String[] { "long" };

		_methodName101 = "deleteLineaGastoClienteLineaGasto";

		_methodParameterTypes101 = new String[] { "long", "long" };

		_methodName102 = "deleteLineaGastoClienteLineaGasto";

		_methodParameterTypes102 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGasto"
			};

		_methodName103 = "deleteLineaGastoClienteLineaGastos";

		_methodParameterTypes103 = new String[] { "long", "long[][]" };

		_methodName104 = "deleteLineaGastoClienteLineaGastos";

		_methodParameterTypes104 = new String[] { "long", "java.util.List" };

		_methodName105 = "getLineaGastoClienteLineaGastos";

		_methodParameterTypes105 = new String[] { "long" };

		_methodName106 = "getLineaGastoClienteLineaGastos";

		_methodParameterTypes106 = new String[] { "long", "int", "int" };

		_methodName107 = "getLineaGastoClienteLineaGastos";

		_methodParameterTypes107 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName108 = "getLineaGastoClienteLineaGastosCount";

		_methodParameterTypes108 = new String[] { "long" };

		_methodName109 = "hasLineaGastoClienteLineaGasto";

		_methodParameterTypes109 = new String[] { "long", "long" };

		_methodName110 = "hasLineaGastoClienteLineaGastos";

		_methodParameterTypes110 = new String[] { "long" };

		_methodName111 = "setLineaGastoClienteLineaGastos";

		_methodParameterTypes111 = new String[] { "long", "long[][]" };

		_methodName112 = "addLineaGastoProyectoLineaGasto";

		_methodParameterTypes112 = new String[] { "long", "long" };

		_methodName113 = "addLineaGastoProyectoLineaGasto";

		_methodParameterTypes113 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGasto"
			};

		_methodName114 = "addLineaGastoProyectoLineaGastos";

		_methodParameterTypes114 = new String[] { "long", "long[][]" };

		_methodName115 = "addLineaGastoProyectoLineaGastos";

		_methodParameterTypes115 = new String[] { "long", "java.util.List" };

		_methodName116 = "clearLineaGastoProyectoLineaGastos";

		_methodParameterTypes116 = new String[] { "long" };

		_methodName117 = "deleteLineaGastoProyectoLineaGasto";

		_methodParameterTypes117 = new String[] { "long", "long" };

		_methodName118 = "deleteLineaGastoProyectoLineaGasto";

		_methodParameterTypes118 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGasto"
			};

		_methodName119 = "deleteLineaGastoProyectoLineaGastos";

		_methodParameterTypes119 = new String[] { "long", "long[][]" };

		_methodName120 = "deleteLineaGastoProyectoLineaGastos";

		_methodParameterTypes120 = new String[] { "long", "java.util.List" };

		_methodName121 = "getLineaGastoProyectoLineaGastos";

		_methodParameterTypes121 = new String[] { "long" };

		_methodName122 = "getLineaGastoProyectoLineaGastos";

		_methodParameterTypes122 = new String[] { "long", "int", "int" };

		_methodName123 = "getLineaGastoProyectoLineaGastos";

		_methodParameterTypes123 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName124 = "getLineaGastoProyectoLineaGastosCount";

		_methodParameterTypes124 = new String[] { "long" };

		_methodName125 = "hasLineaGastoProyectoLineaGasto";

		_methodParameterTypes125 = new String[] { "long", "long" };

		_methodName126 = "hasLineaGastoProyectoLineaGastos";

		_methodParameterTypes126 = new String[] { "long" };

		_methodName127 = "setLineaGastoProyectoLineaGastos";

		_methodParameterTypes127 = new String[] { "long", "long[][]" };

		_methodName266 = "getBeanIdentifier";

		_methodParameterTypes266 = new String[] {  };

		_methodName267 = "setBeanIdentifier";

		_methodParameterTypes267 = new String[] { "java.lang.String" };

		_methodName272 = "findByDate";

		_methodParameterTypes272 = new String[] { "java.lang.String" };

		_methodName273 = "findByNotaGastoCategoryDate";

		_methodParameterTypes273 = new String[] { "long", "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return LineaGastoLocalServiceUtil.addLineaGasto((es.davinciti.liferay.model.LineaGasto)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return LineaGastoLocalServiceUtil.createLineaGasto(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return LineaGastoLocalServiceUtil.deleteLineaGasto(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return LineaGastoLocalServiceUtil.deleteLineaGasto((es.davinciti.liferay.model.LineaGasto)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return LineaGastoLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return LineaGastoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return LineaGastoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return LineaGastoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return LineaGastoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return LineaGastoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return LineaGastoLocalServiceUtil.fetchLineaGasto(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGasto(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastos(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastosCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return LineaGastoLocalServiceUtil.updateLineaGasto((es.davinciti.liferay.model.LineaGasto)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			LineaGastoLocalServiceUtil.addNotaGastoLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			LineaGastoLocalServiceUtil.addNotaGastoLineaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGasto)arguments[1]);

			return null;
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			LineaGastoLocalServiceUtil.addNotaGastoLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			LineaGastoLocalServiceUtil.addNotaGastoLineaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGasto>)arguments[1]);

			return null;
		}

		if (_methodName20.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
			LineaGastoLocalServiceUtil.clearNotaGastoLineaGastos(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName21.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteNotaGastoLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName22.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteNotaGastoLineaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGasto)arguments[1]);

			return null;
		}

		if (_methodName23.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteNotaGastoLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteNotaGastoLineaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGasto>)arguments[1]);

			return null;
		}

		if (_methodName25.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getNotaGastoLineaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName26.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getNotaGastoLineaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName27.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getNotaGastoLineaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName28.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getNotaGastoLineaGastosCount(((Long)arguments[0]).longValue());
		}

		if (_methodName29.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
			return LineaGastoLocalServiceUtil.hasNotaGastoLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return LineaGastoLocalServiceUtil.hasNotaGastoLineaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			LineaGastoLocalServiceUtil.setNotaGastoLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName32.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoPayModeLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName33.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes33, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoPayModeLineaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGasto)arguments[1]);

			return null;
		}

		if (_methodName34.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoPayModeLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName35.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes35, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoPayModeLineaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGasto>)arguments[1]);

			return null;
		}

		if (_methodName36.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
			LineaGastoLocalServiceUtil.clearLineaGastoPayModeLineaGastos(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName37.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoPayModeLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName38.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes38, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoPayModeLineaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGasto)arguments[1]);

			return null;
		}

		if (_methodName39.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes39, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoPayModeLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoPayModeLineaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGasto>)arguments[1]);

			return null;
		}

		if (_methodName41.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoPayModeLineaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoPayModeLineaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoPayModeLineaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoPayModeLineaGastosCount(((Long)arguments[0]).longValue());
		}

		if (_methodName45.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes45, parameterTypes)) {
			return LineaGastoLocalServiceUtil.hasLineaGastoPayModeLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			return LineaGastoLocalServiceUtil.hasLineaGastoPayModeLineaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
			LineaGastoLocalServiceUtil.setLineaGastoPayModeLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
			LineaGastoLocalServiceUtil.addCurrencyLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
			LineaGastoLocalServiceUtil.addCurrencyLineaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGasto)arguments[1]);

			return null;
		}

		if (_methodName50.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
			LineaGastoLocalServiceUtil.addCurrencyLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName51.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
			LineaGastoLocalServiceUtil.addCurrencyLineaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGasto>)arguments[1]);

			return null;
		}

		if (_methodName52.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
			LineaGastoLocalServiceUtil.clearCurrencyLineaGastos(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName53.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteCurrencyLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName54.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteCurrencyLineaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGasto)arguments[1]);

			return null;
		}

		if (_methodName55.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteCurrencyLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName56.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteCurrencyLineaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGasto>)arguments[1]);

			return null;
		}

		if (_methodName57.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getCurrencyLineaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName58.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getCurrencyLineaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName59.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes59, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getCurrencyLineaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName60.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getCurrencyLineaGastosCount(((Long)arguments[0]).longValue());
		}

		if (_methodName61.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
			return LineaGastoLocalServiceUtil.hasCurrencyLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName62.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
			return LineaGastoLocalServiceUtil.hasCurrencyLineaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName63.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes63, parameterTypes)) {
			LineaGastoLocalServiceUtil.setCurrencyLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName64.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes64, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoFamiliaLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName65.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes65, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoFamiliaLineaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGasto)arguments[1]);

			return null;
		}

		if (_methodName66.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes66, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoFamiliaLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName67.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes67, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoFamiliaLineaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGasto>)arguments[1]);

			return null;
		}

		if (_methodName68.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
			LineaGastoLocalServiceUtil.clearLineaGastoFamiliaLineaGastos(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName69.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoFamiliaLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName70.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoFamiliaLineaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGasto)arguments[1]);

			return null;
		}

		if (_methodName71.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes71, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoFamiliaLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName72.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoFamiliaLineaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGasto>)arguments[1]);

			return null;
		}

		if (_methodName73.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes73, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoFamiliaLineaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName74.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoFamiliaLineaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName75.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes75, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoFamiliaLineaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName76.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoFamiliaLineaGastosCount(((Long)arguments[0]).longValue());
		}

		if (_methodName77.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
			return LineaGastoLocalServiceUtil.hasLineaGastoFamiliaLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName78.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
			return LineaGastoLocalServiceUtil.hasLineaGastoFamiliaLineaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName79.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
			LineaGastoLocalServiceUtil.setLineaGastoFamiliaLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName80.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoCategoriaLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName81.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoCategoriaLineaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGasto)arguments[1]);

			return null;
		}

		if (_methodName82.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoCategoriaLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName83.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes83, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoCategoriaLineaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGasto>)arguments[1]);

			return null;
		}

		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			LineaGastoLocalServiceUtil.clearLineaGastoCategoriaLineaGastos(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoCategoriaLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName86.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoCategoriaLineaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGasto)arguments[1]);

			return null;
		}

		if (_methodName87.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoCategoriaLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName88.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoCategoriaLineaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGasto>)arguments[1]);

			return null;
		}

		if (_methodName89.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoCategoriaLineaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoCategoriaLineaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoCategoriaLineaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoCategoriaLineaGastosCount(((Long)arguments[0]).longValue());
		}

		if (_methodName93.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
			return LineaGastoLocalServiceUtil.hasLineaGastoCategoriaLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			return LineaGastoLocalServiceUtil.hasLineaGastoCategoriaLineaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			LineaGastoLocalServiceUtil.setLineaGastoCategoriaLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoClienteLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoClienteLineaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGasto)arguments[1]);

			return null;
		}

		if (_methodName98.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoClienteLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName99.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoClienteLineaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGasto>)arguments[1]);

			return null;
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			LineaGastoLocalServiceUtil.clearLineaGastoClienteLineaGastos(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoClienteLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName102.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoClienteLineaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGasto)arguments[1]);

			return null;
		}

		if (_methodName103.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoClienteLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoClienteLineaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGasto>)arguments[1]);

			return null;
		}

		if (_methodName105.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoClienteLineaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoClienteLineaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoClienteLineaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoClienteLineaGastosCount(((Long)arguments[0]).longValue());
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			return LineaGastoLocalServiceUtil.hasLineaGastoClienteLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return LineaGastoLocalServiceUtil.hasLineaGastoClienteLineaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			LineaGastoLocalServiceUtil.setLineaGastoClienteLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoProyectoLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoProyectoLineaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGasto)arguments[1]);

			return null;
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoProyectoLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
			LineaGastoLocalServiceUtil.addLineaGastoProyectoLineaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGasto>)arguments[1]);

			return null;
		}

		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
			LineaGastoLocalServiceUtil.clearLineaGastoProyectoLineaGastos(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoProyectoLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName118.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoProyectoLineaGasto(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGasto)arguments[1]);

			return null;
		}

		if (_methodName119.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoProyectoLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName120.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
			LineaGastoLocalServiceUtil.deleteLineaGastoProyectoLineaGastos(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGasto>)arguments[1]);

			return null;
		}

		if (_methodName121.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoProyectoLineaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoProyectoLineaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName123.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoProyectoLineaGastos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName124.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getLineaGastoProyectoLineaGastosCount(((Long)arguments[0]).longValue());
		}

		if (_methodName125.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
			return LineaGastoLocalServiceUtil.hasLineaGastoProyectoLineaGasto(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName126.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
			return LineaGastoLocalServiceUtil.hasLineaGastoProyectoLineaGastos(((Long)arguments[0]).longValue());
		}

		if (_methodName127.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
			LineaGastoLocalServiceUtil.setLineaGastoProyectoLineaGastos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName266.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes266, parameterTypes)) {
			return LineaGastoLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName267.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes267, parameterTypes)) {
			LineaGastoLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName272.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes272, parameterTypes)) {
			return LineaGastoLocalServiceUtil.findByDate((java.lang.String)arguments[0]);
		}

		if (_methodName273.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes273, parameterTypes)) {
			return LineaGastoLocalServiceUtil.findByNotaGastoCategoryDate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
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
	private String _methodName64;
	private String[] _methodParameterTypes64;
	private String _methodName65;
	private String[] _methodParameterTypes65;
	private String _methodName66;
	private String[] _methodParameterTypes66;
	private String _methodName67;
	private String[] _methodParameterTypes67;
	private String _methodName68;
	private String[] _methodParameterTypes68;
	private String _methodName69;
	private String[] _methodParameterTypes69;
	private String _methodName70;
	private String[] _methodParameterTypes70;
	private String _methodName71;
	private String[] _methodParameterTypes71;
	private String _methodName72;
	private String[] _methodParameterTypes72;
	private String _methodName73;
	private String[] _methodParameterTypes73;
	private String _methodName74;
	private String[] _methodParameterTypes74;
	private String _methodName75;
	private String[] _methodParameterTypes75;
	private String _methodName76;
	private String[] _methodParameterTypes76;
	private String _methodName77;
	private String[] _methodParameterTypes77;
	private String _methodName78;
	private String[] _methodParameterTypes78;
	private String _methodName79;
	private String[] _methodParameterTypes79;
	private String _methodName80;
	private String[] _methodParameterTypes80;
	private String _methodName81;
	private String[] _methodParameterTypes81;
	private String _methodName82;
	private String[] _methodParameterTypes82;
	private String _methodName83;
	private String[] _methodParameterTypes83;
	private String _methodName84;
	private String[] _methodParameterTypes84;
	private String _methodName85;
	private String[] _methodParameterTypes85;
	private String _methodName86;
	private String[] _methodParameterTypes86;
	private String _methodName87;
	private String[] _methodParameterTypes87;
	private String _methodName88;
	private String[] _methodParameterTypes88;
	private String _methodName89;
	private String[] _methodParameterTypes89;
	private String _methodName90;
	private String[] _methodParameterTypes90;
	private String _methodName91;
	private String[] _methodParameterTypes91;
	private String _methodName92;
	private String[] _methodParameterTypes92;
	private String _methodName93;
	private String[] _methodParameterTypes93;
	private String _methodName94;
	private String[] _methodParameterTypes94;
	private String _methodName95;
	private String[] _methodParameterTypes95;
	private String _methodName96;
	private String[] _methodParameterTypes96;
	private String _methodName97;
	private String[] _methodParameterTypes97;
	private String _methodName98;
	private String[] _methodParameterTypes98;
	private String _methodName99;
	private String[] _methodParameterTypes99;
	private String _methodName100;
	private String[] _methodParameterTypes100;
	private String _methodName101;
	private String[] _methodParameterTypes101;
	private String _methodName102;
	private String[] _methodParameterTypes102;
	private String _methodName103;
	private String[] _methodParameterTypes103;
	private String _methodName104;
	private String[] _methodParameterTypes104;
	private String _methodName105;
	private String[] _methodParameterTypes105;
	private String _methodName106;
	private String[] _methodParameterTypes106;
	private String _methodName107;
	private String[] _methodParameterTypes107;
	private String _methodName108;
	private String[] _methodParameterTypes108;
	private String _methodName109;
	private String[] _methodParameterTypes109;
	private String _methodName110;
	private String[] _methodParameterTypes110;
	private String _methodName111;
	private String[] _methodParameterTypes111;
	private String _methodName112;
	private String[] _methodParameterTypes112;
	private String _methodName113;
	private String[] _methodParameterTypes113;
	private String _methodName114;
	private String[] _methodParameterTypes114;
	private String _methodName115;
	private String[] _methodParameterTypes115;
	private String _methodName116;
	private String[] _methodParameterTypes116;
	private String _methodName117;
	private String[] _methodParameterTypes117;
	private String _methodName118;
	private String[] _methodParameterTypes118;
	private String _methodName119;
	private String[] _methodParameterTypes119;
	private String _methodName120;
	private String[] _methodParameterTypes120;
	private String _methodName121;
	private String[] _methodParameterTypes121;
	private String _methodName122;
	private String[] _methodParameterTypes122;
	private String _methodName123;
	private String[] _methodParameterTypes123;
	private String _methodName124;
	private String[] _methodParameterTypes124;
	private String _methodName125;
	private String[] _methodParameterTypes125;
	private String _methodName126;
	private String[] _methodParameterTypes126;
	private String _methodName127;
	private String[] _methodParameterTypes127;
	private String _methodName266;
	private String[] _methodParameterTypes266;
	private String _methodName267;
	private String[] _methodParameterTypes267;
	private String _methodName272;
	private String[] _methodParameterTypes272;
	private String _methodName273;
	private String[] _methodParameterTypes273;
}