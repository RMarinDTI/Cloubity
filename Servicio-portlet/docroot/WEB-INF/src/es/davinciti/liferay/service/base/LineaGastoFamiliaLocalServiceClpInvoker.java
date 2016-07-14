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

import es.davinciti.liferay.service.LineaGastoFamiliaLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Cmes
 * @generated
 */
public class LineaGastoFamiliaLocalServiceClpInvoker {
	public LineaGastoFamiliaLocalServiceClpInvoker() {
		_methodName0 = "addLineaGastoFamilia";

		_methodParameterTypes0 = new String[] {
				"es.davinciti.liferay.model.LineaGastoFamilia"
			};

		_methodName1 = "createLineaGastoFamilia";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteLineaGastoFamilia";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteLineaGastoFamilia";

		_methodParameterTypes3 = new String[] {
				"es.davinciti.liferay.model.LineaGastoFamilia"
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

		_methodName10 = "fetchLineaGastoFamilia";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getLineaGastoFamilia";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getLineaGastoFamilias";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getLineaGastoFamiliasCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateLineaGastoFamilia";

		_methodParameterTypes15 = new String[] {
				"es.davinciti.liferay.model.LineaGastoFamilia"
			};

		_methodName16 = "addLineaGastoLineaGastoFamilia";

		_methodParameterTypes16 = new String[] { "long", "long" };

		_methodName17 = "addLineaGastoLineaGastoFamilia";

		_methodParameterTypes17 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGastoFamilia"
			};

		_methodName18 = "addLineaGastoLineaGastoFamilias";

		_methodParameterTypes18 = new String[] { "long", "long[][]" };

		_methodName19 = "addLineaGastoLineaGastoFamilias";

		_methodParameterTypes19 = new String[] { "long", "java.util.List" };

		_methodName20 = "clearLineaGastoLineaGastoFamilias";

		_methodParameterTypes20 = new String[] { "long" };

		_methodName21 = "deleteLineaGastoLineaGastoFamilia";

		_methodParameterTypes21 = new String[] { "long", "long" };

		_methodName22 = "deleteLineaGastoLineaGastoFamilia";

		_methodParameterTypes22 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGastoFamilia"
			};

		_methodName23 = "deleteLineaGastoLineaGastoFamilias";

		_methodParameterTypes23 = new String[] { "long", "long[][]" };

		_methodName24 = "deleteLineaGastoLineaGastoFamilias";

		_methodParameterTypes24 = new String[] { "long", "java.util.List" };

		_methodName25 = "getLineaGastoLineaGastoFamilias";

		_methodParameterTypes25 = new String[] { "long" };

		_methodName26 = "getLineaGastoLineaGastoFamilias";

		_methodParameterTypes26 = new String[] { "long", "int", "int" };

		_methodName27 = "getLineaGastoLineaGastoFamilias";

		_methodParameterTypes27 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName28 = "getLineaGastoLineaGastoFamiliasCount";

		_methodParameterTypes28 = new String[] { "long" };

		_methodName29 = "hasLineaGastoLineaGastoFamilia";

		_methodParameterTypes29 = new String[] { "long", "long" };

		_methodName30 = "hasLineaGastoLineaGastoFamilias";

		_methodParameterTypes30 = new String[] { "long" };

		_methodName31 = "setLineaGastoLineaGastoFamilias";

		_methodParameterTypes31 = new String[] { "long", "long[][]" };

		_methodName32 = "addLineaGastoCategoriaLineaGastoFamilia";

		_methodParameterTypes32 = new String[] { "long", "long" };

		_methodName33 = "addLineaGastoCategoriaLineaGastoFamilia";

		_methodParameterTypes33 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGastoFamilia"
			};

		_methodName34 = "addLineaGastoCategoriaLineaGastoFamilias";

		_methodParameterTypes34 = new String[] { "long", "long[][]" };

		_methodName35 = "addLineaGastoCategoriaLineaGastoFamilias";

		_methodParameterTypes35 = new String[] { "long", "java.util.List" };

		_methodName36 = "clearLineaGastoCategoriaLineaGastoFamilias";

		_methodParameterTypes36 = new String[] { "long" };

		_methodName37 = "deleteLineaGastoCategoriaLineaGastoFamilia";

		_methodParameterTypes37 = new String[] { "long", "long" };

		_methodName38 = "deleteLineaGastoCategoriaLineaGastoFamilia";

		_methodParameterTypes38 = new String[] {
				"long", "es.davinciti.liferay.model.LineaGastoFamilia"
			};

		_methodName39 = "deleteLineaGastoCategoriaLineaGastoFamilias";

		_methodParameterTypes39 = new String[] { "long", "long[][]" };

		_methodName40 = "deleteLineaGastoCategoriaLineaGastoFamilias";

		_methodParameterTypes40 = new String[] { "long", "java.util.List" };

		_methodName41 = "getLineaGastoCategoriaLineaGastoFamilias";

		_methodParameterTypes41 = new String[] { "long" };

		_methodName42 = "getLineaGastoCategoriaLineaGastoFamilias";

		_methodParameterTypes42 = new String[] { "long", "int", "int" };

		_methodName43 = "getLineaGastoCategoriaLineaGastoFamilias";

		_methodParameterTypes43 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName44 = "getLineaGastoCategoriaLineaGastoFamiliasCount";

		_methodParameterTypes44 = new String[] { "long" };

		_methodName45 = "hasLineaGastoCategoriaLineaGastoFamilia";

		_methodParameterTypes45 = new String[] { "long", "long" };

		_methodName46 = "hasLineaGastoCategoriaLineaGastoFamilias";

		_methodParameterTypes46 = new String[] { "long" };

		_methodName47 = "setLineaGastoCategoriaLineaGastoFamilias";

		_methodParameterTypes47 = new String[] { "long", "long[][]" };

		_methodName186 = "getBeanIdentifier";

		_methodParameterTypes186 = new String[] {  };

		_methodName187 = "setBeanIdentifier";

		_methodParameterTypes187 = new String[] { "java.lang.String" };

		_methodName192 = "findByCompanyId";

		_methodParameterTypes192 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.addLineaGastoFamilia((es.davinciti.liferay.model.LineaGastoFamilia)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.createLineaGastoFamilia(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.deleteLineaGastoFamilia(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.deleteLineaGastoFamilia((es.davinciti.liferay.model.LineaGastoFamilia)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.fetchLineaGastoFamilia(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.getLineaGastoFamilia(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.getLineaGastoFamilias(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.getLineaGastoFamiliasCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.updateLineaGastoFamilia((es.davinciti.liferay.model.LineaGastoFamilia)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.addLineaGastoLineaGastoFamilia(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.addLineaGastoLineaGastoFamilia(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGastoFamilia)arguments[1]);

			return null;
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.addLineaGastoLineaGastoFamilias(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.addLineaGastoLineaGastoFamilias(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGastoFamilia>)arguments[1]);

			return null;
		}

		if (_methodName20.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.clearLineaGastoLineaGastoFamilias(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName21.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.deleteLineaGastoLineaGastoFamilia(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName22.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.deleteLineaGastoLineaGastoFamilia(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGastoFamilia)arguments[1]);

			return null;
		}

		if (_methodName23.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.deleteLineaGastoLineaGastoFamilias(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.deleteLineaGastoLineaGastoFamilias(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGastoFamilia>)arguments[1]);

			return null;
		}

		if (_methodName25.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.getLineaGastoLineaGastoFamilias(((Long)arguments[0]).longValue());
		}

		if (_methodName26.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.getLineaGastoLineaGastoFamilias(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName27.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.getLineaGastoLineaGastoFamilias(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName28.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.getLineaGastoLineaGastoFamiliasCount(((Long)arguments[0]).longValue());
		}

		if (_methodName29.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.hasLineaGastoLineaGastoFamilia(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.hasLineaGastoLineaGastoFamilias(((Long)arguments[0]).longValue());
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.setLineaGastoLineaGastoFamilias(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName32.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.addLineaGastoCategoriaLineaGastoFamilia(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName33.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes33, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.addLineaGastoCategoriaLineaGastoFamilia(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGastoFamilia)arguments[1]);

			return null;
		}

		if (_methodName34.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.addLineaGastoCategoriaLineaGastoFamilias(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName35.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes35, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.addLineaGastoCategoriaLineaGastoFamilias(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGastoFamilia>)arguments[1]);

			return null;
		}

		if (_methodName36.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.clearLineaGastoCategoriaLineaGastoFamilias(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName37.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.deleteLineaGastoCategoriaLineaGastoFamilia(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName38.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes38, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.deleteLineaGastoCategoriaLineaGastoFamilia(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.LineaGastoFamilia)arguments[1]);

			return null;
		}

		if (_methodName39.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes39, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.deleteLineaGastoCategoriaLineaGastoFamilias(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.deleteLineaGastoCategoriaLineaGastoFamilias(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.LineaGastoFamilia>)arguments[1]);

			return null;
		}

		if (_methodName41.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.getLineaGastoCategoriaLineaGastoFamilias(((Long)arguments[0]).longValue());
		}

		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.getLineaGastoCategoriaLineaGastoFamilias(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.getLineaGastoCategoriaLineaGastoFamilias(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.getLineaGastoCategoriaLineaGastoFamiliasCount(((Long)arguments[0]).longValue());
		}

		if (_methodName45.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes45, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.hasLineaGastoCategoriaLineaGastoFamilia(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.hasLineaGastoCategoriaLineaGastoFamilias(((Long)arguments[0]).longValue());
		}

		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.setLineaGastoCategoriaLineaGastoFamilias(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName186.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes186, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName187.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes187, parameterTypes)) {
			LineaGastoFamiliaLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName192.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes192, parameterTypes)) {
			return LineaGastoFamiliaLocalServiceUtil.findByCompanyId(((Long)arguments[0]).longValue());
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
	private String _methodName186;
	private String[] _methodParameterTypes186;
	private String _methodName187;
	private String[] _methodParameterTypes187;
	private String _methodName192;
	private String[] _methodParameterTypes192;
}