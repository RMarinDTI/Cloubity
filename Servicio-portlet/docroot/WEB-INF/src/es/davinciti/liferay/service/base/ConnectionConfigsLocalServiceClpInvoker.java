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

import es.davinciti.liferay.service.ConnectionConfigsLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Cmes
 * @generated
 */
public class ConnectionConfigsLocalServiceClpInvoker {
	public ConnectionConfigsLocalServiceClpInvoker() {
		_methodName0 = "addConnectionConfigs";

		_methodParameterTypes0 = new String[] {
				"es.davinciti.liferay.model.ConnectionConfigs"
			};

		_methodName1 = "createConnectionConfigs";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteConnectionConfigs";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteConnectionConfigs";

		_methodParameterTypes3 = new String[] {
				"es.davinciti.liferay.model.ConnectionConfigs"
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

		_methodName10 = "fetchConnectionConfigs";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getConnectionConfigs";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getConnectionConfigses";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getConnectionConfigsesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateConnectionConfigs";

		_methodParameterTypes15 = new String[] {
				"es.davinciti.liferay.model.ConnectionConfigs"
			};

		_methodName16 = "addConnectionTypesConnectionConfigs";

		_methodParameterTypes16 = new String[] { "long", "long" };

		_methodName17 = "addConnectionTypesConnectionConfigs";

		_methodParameterTypes17 = new String[] {
				"long", "es.davinciti.liferay.model.ConnectionConfigs"
			};

		_methodName18 = "addConnectionTypesConnectionConfigses";

		_methodParameterTypes18 = new String[] { "long", "long[][]" };

		_methodName19 = "addConnectionTypesConnectionConfigses";

		_methodParameterTypes19 = new String[] { "long", "java.util.List" };

		_methodName20 = "clearConnectionTypesConnectionConfigses";

		_methodParameterTypes20 = new String[] { "long" };

		_methodName21 = "deleteConnectionTypesConnectionConfigs";

		_methodParameterTypes21 = new String[] { "long", "long" };

		_methodName22 = "deleteConnectionTypesConnectionConfigs";

		_methodParameterTypes22 = new String[] {
				"long", "es.davinciti.liferay.model.ConnectionConfigs"
			};

		_methodName23 = "deleteConnectionTypesConnectionConfigses";

		_methodParameterTypes23 = new String[] { "long", "long[][]" };

		_methodName24 = "deleteConnectionTypesConnectionConfigses";

		_methodParameterTypes24 = new String[] { "long", "java.util.List" };

		_methodName25 = "getConnectionTypesConnectionConfigses";

		_methodParameterTypes25 = new String[] { "long" };

		_methodName26 = "getConnectionTypesConnectionConfigses";

		_methodParameterTypes26 = new String[] { "long", "int", "int" };

		_methodName27 = "getConnectionTypesConnectionConfigses";

		_methodParameterTypes27 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName28 = "getConnectionTypesConnectionConfigsesCount";

		_methodParameterTypes28 = new String[] { "long" };

		_methodName29 = "hasConnectionTypesConnectionConfigs";

		_methodParameterTypes29 = new String[] { "long", "long" };

		_methodName30 = "hasConnectionTypesConnectionConfigses";

		_methodParameterTypes30 = new String[] { "long" };

		_methodName31 = "setConnectionTypesConnectionConfigses";

		_methodParameterTypes31 = new String[] { "long", "long[][]" };

		_methodName32 = "addConnectionActionTypesConnectionConfigs";

		_methodParameterTypes32 = new String[] { "long", "long" };

		_methodName33 = "addConnectionActionTypesConnectionConfigs";

		_methodParameterTypes33 = new String[] {
				"long", "es.davinciti.liferay.model.ConnectionConfigs"
			};

		_methodName34 = "addConnectionActionTypesConnectionConfigses";

		_methodParameterTypes34 = new String[] { "long", "long[][]" };

		_methodName35 = "addConnectionActionTypesConnectionConfigses";

		_methodParameterTypes35 = new String[] { "long", "java.util.List" };

		_methodName36 = "clearConnectionActionTypesConnectionConfigses";

		_methodParameterTypes36 = new String[] { "long" };

		_methodName37 = "deleteConnectionActionTypesConnectionConfigs";

		_methodParameterTypes37 = new String[] { "long", "long" };

		_methodName38 = "deleteConnectionActionTypesConnectionConfigs";

		_methodParameterTypes38 = new String[] {
				"long", "es.davinciti.liferay.model.ConnectionConfigs"
			};

		_methodName39 = "deleteConnectionActionTypesConnectionConfigses";

		_methodParameterTypes39 = new String[] { "long", "long[][]" };

		_methodName40 = "deleteConnectionActionTypesConnectionConfigses";

		_methodParameterTypes40 = new String[] { "long", "java.util.List" };

		_methodName41 = "getConnectionActionTypesConnectionConfigses";

		_methodParameterTypes41 = new String[] { "long" };

		_methodName42 = "getConnectionActionTypesConnectionConfigses";

		_methodParameterTypes42 = new String[] { "long", "int", "int" };

		_methodName43 = "getConnectionActionTypesConnectionConfigses";

		_methodParameterTypes43 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName44 = "getConnectionActionTypesConnectionConfigsesCount";

		_methodParameterTypes44 = new String[] { "long" };

		_methodName45 = "hasConnectionActionTypesConnectionConfigs";

		_methodParameterTypes45 = new String[] { "long", "long" };

		_methodName46 = "hasConnectionActionTypesConnectionConfigses";

		_methodParameterTypes46 = new String[] { "long" };

		_methodName47 = "setConnectionActionTypesConnectionConfigses";

		_methodParameterTypes47 = new String[] { "long", "long[][]" };

		_methodName48 = "addConnectionDataConnectionConfigs";

		_methodParameterTypes48 = new String[] { "long", "long" };

		_methodName49 = "addConnectionDataConnectionConfigs";

		_methodParameterTypes49 = new String[] {
				"long", "es.davinciti.liferay.model.ConnectionConfigs"
			};

		_methodName50 = "addConnectionDataConnectionConfigses";

		_methodParameterTypes50 = new String[] { "long", "long[][]" };

		_methodName51 = "addConnectionDataConnectionConfigses";

		_methodParameterTypes51 = new String[] { "long", "java.util.List" };

		_methodName52 = "clearConnectionDataConnectionConfigses";

		_methodParameterTypes52 = new String[] { "long" };

		_methodName53 = "deleteConnectionDataConnectionConfigs";

		_methodParameterTypes53 = new String[] { "long", "long" };

		_methodName54 = "deleteConnectionDataConnectionConfigs";

		_methodParameterTypes54 = new String[] {
				"long", "es.davinciti.liferay.model.ConnectionConfigs"
			};

		_methodName55 = "deleteConnectionDataConnectionConfigses";

		_methodParameterTypes55 = new String[] { "long", "long[][]" };

		_methodName56 = "deleteConnectionDataConnectionConfigses";

		_methodParameterTypes56 = new String[] { "long", "java.util.List" };

		_methodName57 = "getConnectionDataConnectionConfigses";

		_methodParameterTypes57 = new String[] { "long" };

		_methodName58 = "getConnectionDataConnectionConfigses";

		_methodParameterTypes58 = new String[] { "long", "int", "int" };

		_methodName59 = "getConnectionDataConnectionConfigses";

		_methodParameterTypes59 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName60 = "getConnectionDataConnectionConfigsesCount";

		_methodParameterTypes60 = new String[] { "long" };

		_methodName61 = "hasConnectionDataConnectionConfigs";

		_methodParameterTypes61 = new String[] { "long", "long" };

		_methodName62 = "hasConnectionDataConnectionConfigses";

		_methodParameterTypes62 = new String[] { "long" };

		_methodName63 = "setConnectionDataConnectionConfigses";

		_methodParameterTypes63 = new String[] { "long", "long[][]" };

		_methodName202 = "getBeanIdentifier";

		_methodParameterTypes202 = new String[] {  };

		_methodName203 = "setBeanIdentifier";

		_methodParameterTypes203 = new String[] { "java.lang.String" };

		_methodName208 = "getConnectionTypes";

		_methodParameterTypes208 = new String[] { "long" };

		_methodName209 = "getConnectionActionTypes";

		_methodParameterTypes209 = new String[] { "long" };

		_methodName210 = "getConnectionData";

		_methodParameterTypes210 = new String[] { "long" };

		_methodName211 = "deleteConnectionTypes";

		_methodParameterTypes211 = new String[] { "long" };

		_methodName212 = "deleteConnectionActionTypes";

		_methodParameterTypes212 = new String[] { "long" };

		_methodName213 = "deleteConnectionData";

		_methodParameterTypes213 = new String[] { "long" };

		_methodName214 = "testConnectionErp";

		_methodParameterTypes214 = new String[] { "long" };

		_methodName215 = "getInfo";

		_methodParameterTypes215 = new String[] {
				"java.lang.String", "long", "java.util.List"
			};

		_methodName216 = "getWebAccessToken";

		_methodParameterTypes216 = new String[] { "long", "java.lang.String" };

		_methodName217 = "getApplicationCode";

		_methodParameterTypes217 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName218 = "findByCompanyId";

		_methodParameterTypes218 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.addConnectionConfigs((es.davinciti.liferay.model.ConnectionConfigs)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.createConnectionConfigs(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.deleteConnectionConfigs(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.deleteConnectionConfigs((es.davinciti.liferay.model.ConnectionConfigs)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.fetchConnectionConfigs(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionConfigs(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionConfigses(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionConfigsesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.updateConnectionConfigs((es.davinciti.liferay.model.ConnectionConfigs)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.addConnectionTypesConnectionConfigs(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.addConnectionTypesConnectionConfigs(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.ConnectionConfigs)arguments[1]);

			return null;
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.addConnectionTypesConnectionConfigses(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.addConnectionTypesConnectionConfigses(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.ConnectionConfigs>)arguments[1]);

			return null;
		}

		if (_methodName20.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.clearConnectionTypesConnectionConfigses(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName21.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.deleteConnectionTypesConnectionConfigs(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName22.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.deleteConnectionTypesConnectionConfigs(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.ConnectionConfigs)arguments[1]);

			return null;
		}

		if (_methodName23.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.deleteConnectionTypesConnectionConfigses(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.deleteConnectionTypesConnectionConfigses(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.ConnectionConfigs>)arguments[1]);

			return null;
		}

		if (_methodName25.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionTypesConnectionConfigses(((Long)arguments[0]).longValue());
		}

		if (_methodName26.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionTypesConnectionConfigses(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName27.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionTypesConnectionConfigses(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName28.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionTypesConnectionConfigsesCount(((Long)arguments[0]).longValue());
		}

		if (_methodName29.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.hasConnectionTypesConnectionConfigs(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.hasConnectionTypesConnectionConfigses(((Long)arguments[0]).longValue());
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.setConnectionTypesConnectionConfigses(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName32.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.addConnectionActionTypesConnectionConfigs(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName33.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes33, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.addConnectionActionTypesConnectionConfigs(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.ConnectionConfigs)arguments[1]);

			return null;
		}

		if (_methodName34.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.addConnectionActionTypesConnectionConfigses(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName35.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes35, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.addConnectionActionTypesConnectionConfigses(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.ConnectionConfigs>)arguments[1]);

			return null;
		}

		if (_methodName36.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.clearConnectionActionTypesConnectionConfigses(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName37.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.deleteConnectionActionTypesConnectionConfigs(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName38.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes38, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.deleteConnectionActionTypesConnectionConfigs(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.ConnectionConfigs)arguments[1]);

			return null;
		}

		if (_methodName39.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes39, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.deleteConnectionActionTypesConnectionConfigses(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.deleteConnectionActionTypesConnectionConfigses(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.ConnectionConfigs>)arguments[1]);

			return null;
		}

		if (_methodName41.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionActionTypesConnectionConfigses(((Long)arguments[0]).longValue());
		}

		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionActionTypesConnectionConfigses(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionActionTypesConnectionConfigses(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionActionTypesConnectionConfigsesCount(((Long)arguments[0]).longValue());
		}

		if (_methodName45.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes45, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.hasConnectionActionTypesConnectionConfigs(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.hasConnectionActionTypesConnectionConfigses(((Long)arguments[0]).longValue());
		}

		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.setConnectionActionTypesConnectionConfigses(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.addConnectionDataConnectionConfigs(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.addConnectionDataConnectionConfigs(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.ConnectionConfigs)arguments[1]);

			return null;
		}

		if (_methodName50.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.addConnectionDataConnectionConfigses(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName51.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.addConnectionDataConnectionConfigses(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.ConnectionConfigs>)arguments[1]);

			return null;
		}

		if (_methodName52.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.clearConnectionDataConnectionConfigses(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName53.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.deleteConnectionDataConnectionConfigs(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName54.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.deleteConnectionDataConnectionConfigs(((Long)arguments[0]).longValue(),
				(es.davinciti.liferay.model.ConnectionConfigs)arguments[1]);

			return null;
		}

		if (_methodName55.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.deleteConnectionDataConnectionConfigses(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName56.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.deleteConnectionDataConnectionConfigses(((Long)arguments[0]).longValue(),
				(java.util.List<es.davinciti.liferay.model.ConnectionConfigs>)arguments[1]);

			return null;
		}

		if (_methodName57.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionDataConnectionConfigses(((Long)arguments[0]).longValue());
		}

		if (_methodName58.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionDataConnectionConfigses(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName59.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes59, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionDataConnectionConfigses(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName60.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionDataConnectionConfigsesCount(((Long)arguments[0]).longValue());
		}

		if (_methodName61.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.hasConnectionDataConnectionConfigs(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName62.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.hasConnectionDataConnectionConfigses(((Long)arguments[0]).longValue());
		}

		if (_methodName63.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes63, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.setConnectionDataConnectionConfigses(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName202.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes202, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName203.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes203, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName208.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes208, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionTypes(((Long)arguments[0]).longValue());
		}

		if (_methodName209.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes209, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionActionTypes(((Long)arguments[0]).longValue());
		}

		if (_methodName210.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes210, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getConnectionData(((Long)arguments[0]).longValue());
		}

		if (_methodName211.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes211, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.deleteConnectionTypes(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName212.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes212, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.deleteConnectionActionTypes(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName213.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes213, parameterTypes)) {
			ConnectionConfigsLocalServiceUtil.deleteConnectionData(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName214.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes214, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.testConnectionErp(((Long)arguments[0]).longValue());
		}

		if (_methodName215.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes215, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getInfo((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(java.util.List<java.lang.String>)arguments[2]);
		}

		if (_methodName216.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes216, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getWebAccessToken(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName217.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes217, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.getApplicationCode((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName218.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes218, parameterTypes)) {
			return ConnectionConfigsLocalServiceUtil.findByCompanyId(((Long)arguments[0]).longValue());
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
	private String _methodName215;
	private String[] _methodParameterTypes215;
	private String _methodName216;
	private String[] _methodParameterTypes216;
	private String _methodName217;
	private String[] _methodParameterTypes217;
	private String _methodName218;
	private String[] _methodParameterTypes218;
}