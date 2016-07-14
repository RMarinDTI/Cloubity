package es.davinciti.usuarios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.CompanyThreadLocal;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserGroupRoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import es.davinciti.util.Constants;
import es.davinciti.liferay.model.SapEmployee;
import es.davinciti.liferay.service.ConnectionConfigsLocalServiceUtil;
import es.davinciti.liferay.service.SapEmployeeLocalServiceUtil;

/**
 * Portlet implementation class MigrarUsuarios
 */
public class MigrarUsuarios extends MVCPortlet {	
 
	public void migrarUsuariosSAP(ActionRequest actionRequest, ActionResponse actionResponse) {
		String result = "";
		long configId = ParamUtil.getLong(actionRequest, "configId", 0);
		String methodName = ParamUtil.getString(actionRequest, "methodName", "");		
		//System.out.println("MigrarUsuarios _ migrarUsuarios - configId : "+configId+" - methodName : "+methodName);
		if (configId > 0) {
			try {
				// Para pruebas forzamos la de SAPBO al tener 2 --> SAGE = 202, SAPBO = 201
				//configId = 201;
				result = ConnectionConfigsLocalServiceUtil.getInfo(methodName, configId, new ArrayList<String>());
				//System.out.println("MigrarUsuarios _ migrarUsuarios - result : "+result);
			} catch(Exception e) {
				System.out.println("MigrarUsuarios - getInfo ERROR: "+e.getMessage());
				result = "MigrarUsuarios - getInfo ERROR: "+e.getMessage();
				SessionErrors.add(actionRequest.getPortletSession(),"migrarUsuarios-form-error");
			}			
			if (!result.contentEquals("")) {
				JSONArray usuarios = JSONFactoryUtil.createJSONArray();
				try { 
					usuarios = JSONFactoryUtil.createJSONArray(result);
				} catch(Exception e) {
					//e.printStackTrace();
					System.out.println("MigrarUsuarios _ JSONArray ERROR: "+e.getMessage());
					result = "MigrarUsuarios _ JSONArray ERROR: "+e.getMessage();
					SessionErrors.add(actionRequest.getPortletSession(),"migrarUsuarios-form-error");
				}
				if (usuarios.length() > 0) {
					//System.out.println("MigrarUsuarios _ Empezando proceso de migración de "+usuarios.length()+ " usuarios");
					List<Long> userIds = new ArrayList<Long>();
					boolean usersOk = true;
					for (int i=0; i<usuarios.length(); i++) {
						JSONObject usuario = usuarios.getJSONObject(i);						
						long userId = addUser(usuario);
						long employeeId = 0;
						boolean userOk = false;
						if (userId > 0) {
							userIds.add(userId);
							employeeId = sapEmployeeAdd(userId, usuario);	
						}
						if (employeeId > 0) {
							userOk = expandoUserEmployee(userId, employeeId);
						}
						if (userId == 0 || employeeId == 0 || !userOk) {
							//usersOk = false;
							System.out.println(" ERROR USER --- usuario - EmployeeID : "+usuario.getLong("EmployeeID")+" - FirstName : "+usuario.getString("FirstName")+" - LastName : "+usuario.getString("LastName")+" - eMail : "+usuario.getString("eMail")+" - userId : "+userId+" - employeeId : "+employeeId);
							SessionErrors.add(actionRequest.getPortletSession(),"migrarUsuarios-form-error");
							result = " ERROR USER --- usuario - EmployeeID : "+usuario.getLong("EmployeeID")+" - FirstName : "+usuario.getString("FirstName")+" - LastName : "+usuario.getString("LastName")+" - eMail : "+usuario.getString("eMail")+" - userId : "+userId+" - employeeId : "+employeeId;
						}
					}
					if (userIds.size() > 0 && usersOk) {
						long[] usersIds = new long[userIds.size()];
						for (int j=0; j<userIds.size(); j++) {
							usersIds[j] = userIds.get(j);
						}
						try {
							long companyId = CompanyThreadLocal.getCompanyId(); 
							UserGroupRoleLocalServiceUtil.addUserGroupRoles(usersIds, GroupLocalServiceUtil.getGroup(companyId, Constants.USUARIO_GUEST).getGroupId(), RoleLocalServiceUtil.getRole(companyId, Constants.USUARIO_BASICO_ROLE).getRoleId());
							//System.out.println("MigrarUsuarios _ asignar usergrouprole - Roles asignados correctamente a "+usersIds.length + " usuarios");
						} catch(Exception e) {
							System.out.println("MigrarUsuarios _ asignar usergrouprole ERROR "+e.getMessage());
							result = "MigrarUsuarios _ asignar usergrouprole ERROR "+e.getMessage();
							SessionErrors.add(actionRequest.getPortletSession(),"migrarUsuarios-form-error");
						}
					}
					SessionMessages.add(actionRequest.getPortletSession(),"migrarUsuarios-form-success");
					System.out.println("Proceso de Migración Finalizado! Se han Migrado un total de "+userIds.size()+ " usuarios de "+usuarios.length()+" iniciales.");
					result = "Proceso de Migración Finalizado! Se han Migrado un total de "+userIds.size()+ " usuarios de "+usuarios.length()+" iniciales.";
				}
			}			
		}				
		
		actionResponse.setRenderParameter("result", result);		
		//return result;		
	}
	
	public void migrarUsuariosSAGE(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		String result = "";
		long configId = ParamUtil.getLong(actionRequest, "configId", 0);
		String methodName = ParamUtil.getString(actionRequest, "methodName", "");		
		//System.out.println("MigrarUsuarios _ migrarUsuarios - configId : "+configId+" - methodName : "+methodName);
		if (configId > 0) {
			try {
				// Para pruebas forzamos la de SAPBO al tener 2 --> SAGE = 202, SAPBO = 201
				//configId = 201;
				result = ConnectionConfigsLocalServiceUtil.getInfo(methodName, configId, new ArrayList<String>());
				//System.out.println("MigrarUsuarios _ migrarUsuarios - result : "+result);
			} catch(Exception e) {
				System.out.println("MigrarUsuarios - getInfo ERROR: "+e.getMessage());
				result = "MigrarUsuarios - getInfo ERROR: "+e.getMessage();
				SessionErrors.add(actionRequest.getPortletSession(),"migrarUsuarios-form-error");
			}	
		}				
		SessionMessages.add(actionRequest.getPortletSession(),"migrarUsuarios-form-success");
		actionResponse.setRenderParameter("result", result);		
		//return result;		
	}
	
	private long addUser(JSONObject usuario) {
		long userId = 0;
		try {
			Date date=new Date();			
			ServiceContext serviceContext = new ServiceContext();
			serviceContext.setUuid(UUID.randomUUID().toString());
			serviceContext.setCreateDate(date);
			serviceContext.setModifiedDate(date);
			long companyId=CompanyThreadLocal.getCompanyId();
			long creatorUserId=0;
			boolean autoPassword=false;
			boolean autoScreenName=true;
			boolean male=true;
			boolean sendEmail = false;
			int prefixId=1;
			int suffixId=1;
			int birthdayMonth=1;
			int birthdayDay=1;
			int birthdayYear=1970;
			String screenName="";
			String jobTitle="";
			long[] groupIds = new long[]{GroupLocalServiceUtil.getGroup(companyId, Constants.USUARIO_GUEST).getGroupId()};
			long[] organizationIds = null;
			long[] userGroupIds = null; //new long[]{};
			String password1 = "test";
			String password2 = "test";
			String firstName = usuario.getString("FirstName");
			String lastName = usuario.getString("LastName");
			String emailAddress = usuario.getString("eMail");
			long facebookId=0;
			String openId="";
			Locale locale=LocaleUtil.getDefault();
			//Role rolePu = RoleLocalServiceUtil.getRole(companyId, Constants.USUARIO_BASICO_ROLE); //RoleLocalServiceUtil.getRole(companyId, RoleConstants.POWER_USER);
			long[] roleIds = null; //{rolePu.getRoleId()};
			User user = UserLocalServiceUtil.addUserWithWorkflow(creatorUserId, companyId, autoPassword, password1,
			password2, autoScreenName, screenName, emailAddress, facebookId, openId, locale, firstName,
			"", lastName, prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds,
			organizationIds, roleIds, userGroupIds, sendEmail, serviceContext);			
			userId = user.getUserId();	
			
			//long groupId = GroupLocalServiceUtil.getCompanyGroup(companyId).getGroupId();
			//GroupServiceUtil.getGroup(companyId, "")
			//UserGroupRoleLocalServiceUtil.addUserGroupRoles(userId, groupId, roleIds);
			//System.out.println(" --- usuario ["+usuario.getLong("EmployeeID")+"] - eMail : "+usuario.getString("eMail")+" añadido correctamente con userId : "+userId+" a la companyID : "+companyId);
		} catch(Exception e) {
			//System.out.println("MigrarUsuarios _ createUser ID["+usuario.getLong("EmployeeID")+"] -eMail : "+usuario.getString("eMail")+" ERROR: "+e.getMessage());
		}
		
		return userId;
	}
	
	private long sapEmployeeAdd(long userId, JSONObject usuario) {
		long employeeId = 0;
		try {
			long sapEmployeeId = CounterLocalServiceUtil.increment(SapEmployee.class.getName());
			SapEmployee sapEmployee = SapEmployeeLocalServiceUtil.createSapEmployee(sapEmployeeId);
			sapEmployee.setEmployeeID(usuario.getLong("EmployeeID"));
			sapEmployee.setUserId(userId);
			sapEmployee.setMiddleName(usuario.getString("MiddleName"));
			sapEmployee.setGender(usuario.getString("Gender"));
			sapEmployee.setJobTitle(usuario.getString("JobTitle"));
			sapEmployee.setEmployeeType(usuario.getString("EmployeeType"));
			sapEmployee = SapEmployeeLocalServiceUtil.addSapEmployee(sapEmployee);
			employeeId = sapEmployee.getSapEmployeeId();
			//System.out.println("MigrarUsuarios _ createSapEmployee con EmployeeID["+usuario.getLong("EmployeeID")+"] creado correctamente con sapEmployeeId : "+employeeId);
		} catch(Exception e) {
			System.out.println("MigrarUsuarios _ sapEmployeeAdd ID["+usuario.getLong("EmployeeID")+"] ERROR: "+e.getMessage());
		}		
		
		return employeeId;		
	}
		
	private boolean expandoUserEmployee(long userId, long employeeId) {
		boolean userOk = false;
		try {
			User user = UserLocalServiceUtil.getUser(userId);
			user.getExpandoBridge().setAttribute("erpID", String.valueOf(employeeId));			
			userOk = true;
			//System.out.println("MigrarUsuarios _ expandoUserEmployee userId["+userId+"] creado correctamente con sapEmployeeId : "+employeeId);
		} catch(Exception e) {
			System.out.println("MigrarUsuarios _ expandoUserEmployee userId["+userId+"] - employeeId : "+employeeId+" ERROR: "+e.getMessage());
		}
		
		return userOk;
	}
	
}
