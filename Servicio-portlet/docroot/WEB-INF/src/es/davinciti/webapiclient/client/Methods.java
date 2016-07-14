package es.davinciti.webapiclient.client;

import java.text.SimpleDateFormat;
import java.util.*;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.CompanyThreadLocal;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserGroupRoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;

import es.davinciti.liferay.model.ConnectionData;
import es.davinciti.liferay.model.LineaGasto;
import es.davinciti.liferay.model.NotaGasto;
import es.davinciti.liferay.model.SageEmployee;
import es.davinciti.liferay.service.ConnectionConfigsLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoCategoriaLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoLocalServiceUtil;
import es.davinciti.liferay.service.NotaGastoLocalServiceUtil;
import es.davinciti.liferay.service.OrganizationSageCompanyLocalServiceUtil;
import es.davinciti.liferay.service.SageEmployeeLocalServiceUtil;
import es.davinciti.util.Constants;

public class Methods {
	
	private static SimpleDateFormat sageFormat =  new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
	private static SimpleDateFormat lineaFormat =  new SimpleDateFormat("dd/MM/yyyy");
	
	public String MigrarUsuarios(long configId) {
		String result = "";		
		List<String> headers = new ArrayList<String>();
		if (configId > 0) {
			// Inicializamos lo necesario
			ConnectionData conData = ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0);
			AccountClient_SAGE accountClient = new AccountClient_SAGE();
			String companies = "";
			String persons = "";
			String employees = "";
			List<String> companiesList = new ArrayList<String>();	
			List<Long> userIds = new ArrayList<Long>();
			boolean usersOk = true;
			int totPersons = 0;
			try {	
				 // Refrescamos Tokens 
				 boolean acToken = accountClient.getAccessToken(conData);
				 if (acToken) {
					 // Recuperamos todas las Companies
					 companies = accountClient.getInfo(Constants.SAGE_GET_COMPANIES, configId, headers);
					 //System.out.println("---------- companies : "+companies);
					 if (companies.contains("$resources")) {
						 JSONArray companiesJson = JSONFactoryUtil.createJSONArray(JSONFactoryUtil.createJSONObject(companies).getString("$resources"));
						 for (int c=0; c<companiesJson.length(); c++) {
							 companiesList.add(companiesJson.getJSONObject(c).getString("id"));
						 }
					 }
					 // Por cada Company recuperada...
					 for (String company : companiesList) {
						 headers.clear();
						 headers.add("X-Company"+Constants.SEPARADOR+company);
						 // Recuperamos las Persons asociadas
						 persons = accountClient.getInfo(Constants.SAGE_GET_PERSONS, configId, headers);
						 //System.out.println("------------- persons of company["+company+"] : "+persons);						 						 
						 if (persons.contains("$resources")) {
							 JSONArray personsJson = JSONFactoryUtil.createJSONArray(JSONFactoryUtil.createJSONObject(persons).getString("$resources"));
							 totPersons += personsJson.length();
							 for (int p=0; p<personsJson.length(); p++) {
								 JSONObject person = JSONFactoryUtil.createJSONObject(personsJson.getJSONObject(p).toString());								 
								 // Por cada Person recuperamos los Employees asociados
								 String filter = "?where=person_id+eq+"+person.getString("id");
								 employees = accountClient.getInfo(Constants.SAGE_GET_EMPLOYEES+filter, configId, headers);
								 //System.out.println("------------- employees of person["+person.getString("id")+"] : "+employees);
								 boolean employeesOk = true;								 
								 if (employees.contains("$resources")) {									 
									 JSONArray employeesJson = JSONFactoryUtil.createJSONArray(JSONFactoryUtil.createJSONObject(employees).getString("$resources"));
									 // Damos de Alta el Usuario
									 long userId = addUser(person);									 
									 //System.out.println(" ----- userId : "+userId+" - employeesJson : "+employeesJson.toString());								 
									 if (userId > 0) {
										userIds.add(userId);
										for (int e=0; e<employeesJson.length(); e++) {
											JSONObject employee = JSONFactoryUtil.createJSONObject(employeesJson.getJSONObject(e).toString());
											boolean employeeOk = sageEmployeeAdd(userId, employee);
											if (!employeeOk) employeesOk = false;
										}
									 }
								 }
								 if (!employeesOk) usersOk = false;
							 }
						 }	
						 // System.out.println("---- usersOk : "+usersOk+" - userIds.size : "+userIds.size());						 
						 if (usersOk && userIds.size() > 0) {
							long[] usersIds = new long[userIds.size()];
							for (int j=0; j<userIds.size(); j++) {
								usersIds[j] = userIds.get(j);
							}
							try {
								long companyId = CompanyThreadLocal.getCompanyId(); 
								UserGroupRoleLocalServiceUtil.addUserGroupRoles(usersIds, GroupLocalServiceUtil.getGroup(companyId, Constants.USUARIO_GUEST).getGroupId(), RoleLocalServiceUtil.getRole(companyId, Constants.USUARIO_BASICO_ROLE).getRoleId());
								//System.out.println("MigrarUsuarios _ asignar usergrouprole - Roles asignados correctamente a "+usersIds.length + " usuarios");
							} catch(Exception e) {
								result = e.getMessage();
								//System.out.println("MigrarUsuarios _ asignar usergrouprole ERROR "+e.getMessage());
							}
							
							result = "Proceso de Migración Finalizado! Se han Migrado un total de "+userIds.size()+ " usuarios de "+totPersons+" iniciales.";
						 }
					 }					 				 
				 }
				 
			} catch(Exception e) {
				result = e.getMessage();
			}	
		}
		
		System.out.println("MigrarUsuarios - result : "+result);
		
		return result;	
	}
	
	private long addUser(JSONObject person) {
		long userId = 0;
		System.out.println("addUser - person : "+person.toString());
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
			String firstName = person.getString("first_name");
			String lastName = person.getString("surname_one");
			String names = person.getString("first_name")+"."+person.getString("surname_one");
			String email = eliminarAcentos(names)+"@"+CompanyLocalServiceUtil.getCompany(companyId).getMx();			
			String emailAddress = person.getString("email").contentEquals("") ? email : person.getString("email");
			System.out.println("email generado - emailIni : "+names+" - email tratado : "+email+" - emailJson : "+person.getString("email")+" - email definitivo : "+emailAddress);
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
			//System.out.println("Creado Usuario con PersonId["+person.getString("id")+"] - userId["+userId+"] - eMail : "+emailAddress);
		} catch(Exception e) {
			System.out.println("MigrarUsuarios _ createUser ID["+person.getString("id")+"] -eMail : "+person.getString("email")+" ERROR: "+e.getMessage());
			//e.printStackTrace();
		}
		
		return userId;
	}
	
	// La siguiente funcion elimina los acentos de las letras
    private static String eliminarAcentos(String str) {
 
        final String ORIGINAL = "ÁáÉéÍíÓóÚúÑñÜü";
        final String REEMPLAZO = "AaEeIiOoUuNnUu";
 
        if (str == null) {
            return null;
        }
        char[] array = str.toCharArray();
        for (int indice = 0; indice < array.length; indice++) {
            int pos = ORIGINAL.indexOf(array[indice]);
            if (pos > -1) {
                array[indice] = REEMPLAZO.charAt(pos);
            }
        }
        return new String(array);
    }
	
	private boolean sageEmployeeAdd(long userId, JSONObject employee) {
		boolean employeeAdd = false;
		try {
			long sageEmployeeId = CounterLocalServiceUtil.increment(SageEmployee.class.getName());
			SageEmployee sageEmployee = SageEmployeeLocalServiceUtil.createSageEmployee(sageEmployeeId);
			sageEmployee.setUserId(userId);
			sageEmployee.setEmployeeID(employee.getString("id"));			
			sageEmployee.setCompanyId(employee.getString("company_id"));
			sageEmployee.setApplicationId(employee.getString("application_id"));
			sageEmployee.setPersonId(employee.getString("person_id"));
			sageEmployee.setStartDate(employee.getString("start_date"));
			sageEmployee.setSeniority(employee.getString("seniority"));
			sageEmployee.setEndDate(employee.getString("end_date"));
			sageEmployee = SageEmployeeLocalServiceUtil.addSageEmployee(sageEmployee);
			sageEmployeeId = sageEmployee.getSageEmployeeId();
			employeeAdd = true;
			//System.out.println("sageEmployeeAdd con UserId["+userId+"] & EmployeeID["+employee.getString("id")+"] creado correctamente con EmployeeId : "+sageEmployeeId);
		} catch(Exception e) {
			System.out.println("MigrarUsuarios _ sage - UserID["+userId+"] & EmployeeAdd ID["+employee.getString("id")+"] ERROR: "+e.getMessage());
		}		
		
		return employeeAdd;		
	}
	
	public String validarNotaGasto(long configId, JSONArray paramsData, Locale locale) {
		System.out.println("validarNotaGasto - configId : "+configId+" - paramsData : "+paramsData.toString());
		String result = "";
		long notagastoId = 0;
		long userId = 0;
		List<String> headers = new ArrayList<String>();
		String company = "";
		int linesOk = 0;
		JSONArray lineas = JSONFactoryUtil.createJSONArray();
		try {
			notagastoId = Long.parseLong(paramsData.getJSONObject(0).getString("notagastoId"));
			userId = Long.parseLong(paramsData.getJSONObject(0).getString("userId"));
		} catch(Exception e) { }
		System.out.println("validarNotaGasto - notagastoId : "+notagastoId+" - userId : "+userId);
		if (configId > 0 && notagastoId > 0) {
			// Inicializamos lo necesario
			ConnectionData conData = ConnectionConfigsLocalServiceUtil.getConnectionData(configId).get(0);
			AccountClient_SAGE accountClient = new AccountClient_SAGE();
			try {	
				 // Refrescamos Tokens 
				 boolean acToken = accountClient.getAccessToken(conData);
				 if (acToken) {
					 // Asignamos la SageCompanyId a los Headers
					 long orgsagecompanyId = OrganizationSageCompanyLocalServiceUtil.getNotaGastoOrganizationSageCompanies(notagastoId).get(0).getOrgsagecompanyId();
					 company = OrganizationSageCompanyLocalServiceUtil.getOrganizationSageCompany(orgsagecompanyId).getSageCompanyId();
					 headers.clear();
					 headers.add("X-Company"+Constants.SEPARADOR+company);
					 System.out.println("validarNotaGasto - notagastoId : "+notagastoId+" - userId : "+userId+" X-Company : "+company);
					 // Tratamos la Nota de Gastos agrupando las lineas por Categoría y Fecha
					 lineas = trataLineasNotaGasto(notagastoId, userId);
					 // Finalmente enviamos a validar cada linea de la Nota de Gastos ya tratada
					 System.out.println("validarNotaGasto - lineas.length() : "+lineas.length());					 
					 for (int l=0; l<lineas.length(); l++) { 
						JSONObject lineaJson = lineas.getJSONObject(l);
						JSONArray lineasJson = JSONFactoryUtil.createJSONArray();
						lineasJson.put(lineaJson);
						System.out.println("validarNotaGasto - lineasJson : "+lineasJson.toString()+" - headers : "+headers.toString());
						result = accountClient.setInfo(Constants.SAGE_VALIDATE_EXPENSES_NOTE, configId, headers, lineasJson, locale);
						if (result.contentEquals("201")) linesOk += 1;
						System.out.println("validarNotaGasto - result : "+result);
					} 
					if (lineas.length() > 0) {
						NotaGasto nota = NotaGastoLocalServiceUtil.getNotaGasto(notagastoId);
						List<Object> arguments = new ArrayList<Object>();
						// Si se han validado todas pasamos a Estado Accounted_For
						if (lineas.length() - linesOk == 0) {							
							nota.setStatus("5");
							nota.setUpdateDate(lineaFormat.format(new Date()));
						} else {
							nota.setStatus("4");
							nota.setUpdateDate(lineaFormat.format(new Date()));
						}
							NotaGastoLocalServiceUtil.updateNotaGasto(nota);
							arguments.add(lineas.length());
							arguments.add(linesOk);
							result = LanguageUtil.format(locale, "expenses-note-validate-message-success", arguments); 
						}
				 }
			} catch(Exception e) {
				System.out.println("validarNotaGasto - ERROR : "+e.getMessage());
				result = LanguageUtil.get(locale, "expenses-note-validate-message-error");
			}	
			
			  
		}
		
		return result;
	}
	
	private static JSONArray trataLineasNotaGasto(long notagastoId, long userId) {
		System.out.println("trataLineasNotaGasto - notagastoId : "+notagastoId+" - userId : "+userId+" running ...");
		JSONArray lineasJson = JSONFactoryUtil.createJSONArray();
		try {
			List<LineaGasto> lineas = LineaGastoLocalServiceUtil.getNotaGastoLineaGastos(notagastoId);
			new ArrayList<String>();
			int cost = 0;
			int quantity = 0;
			String note = NotaGastoLocalServiceUtil.getNotaGasto(notagastoId).getDescription();
			List<LineaGasto> lineasMatch = new ArrayList<LineaGasto>();
			for (LineaGasto linea : lineas) {
				// Si es una Linea que ya esta "Matcheada" la saltamos
				if (lineasMatch.contains(linea)) continue;
				// De cada Línea comprobamos si hay más líenas de la misma Categoría y Fecha 
				List<LineaGasto> lineasMatching = LineaGastoLocalServiceUtil.findByNotaGastoCategoryDate(notagastoId, linea.getLineagastoId());
				System.out.println("trataLineasNotaGasto - lineasMatching : "+lineasMatching.size());
				String company_id = NotaGastoLocalServiceUtil.getSageCompany(notagastoId);
				String employee_id = NotaGastoLocalServiceUtil.getSageEmployeeId(userId);
				String categoryCode = LineaGastoCategoriaLocalServiceUtil.getLineaGastoLineaGastoCategorias(linea.getLineagastoId()).get(0).getCategoryCode();
				String payment_incident_type_id = company_id+Constants.DOLLAR_SEPARADOR+categoryCode;
				String transfer_date = lineaGastoDate(linea.getDate());
				String total_amount = linea.getAmount().contentEquals("") ? "0" : linea.getAmount();
				Double totAmount = Double.parseDouble(total_amount);
				if (lineasMatching.size() > 0) {					
					for (LineaGasto lineaMatching : lineasMatching) {
						System.out.println("trataLineasNotaGasto - lineasMatching Id : "+lineaMatching.getLineagastoId());
						totAmount += Double.parseDouble(lineaMatching.getAmount().contentEquals("") ? "0.0" : lineaMatching.getAmount());
						lineasMatch.add(lineaMatching);
					}
				}				
				JSONObject lineaJson = JSONFactoryUtil.createJSONObject();
				lineaJson.put("company_id", company_id);
				lineaJson.put("employee_id", employee_id);
				lineaJson.put("payment_incident_type_id", payment_incident_type_id);
				lineaJson.put("transfer_date", transfer_date);
				lineaJson.put("total_amount", totAmount);
				lineaJson.put("cost", cost);
				lineaJson.put("quantity", quantity);
				lineaJson.put("note", note);
				lineaJson.put("payroll_code", "");
				System.out.println("trataLineasNotaGasto - lineaJson : "+lineaJson.toString());
				lineasJson.put(lineaJson);
			}
			
		} catch(Exception e) { 
			System.out.println("trataLineasNotaGasto - ERROR : "+e.getMessage());
		}
		
		System.out.println("trataLineasNotaGasto - lineasJson : "+lineasJson.toString());
		
		return lineasJson;		
	}
	
	private static String lineaGastoDate(String date) {
		String formatDate ="";
		try {
			Date dateIni = lineaFormat.parse(date);
			formatDate = sageFormat.format(dateIni);
		} catch(Exception e) { }
		
		
		return formatDate;
	}
	
}