package es.davinciti.util;

public class Constants {
	// CONSTANTES LIFERAY
	public static final String USUARIO_BASICO_ROLE = "Usuario Básico";
	public static final String USUARIO_GUEST = "Guest";
	public static final String USUARIO_ADMINISTRADOR_ROLE = "Usuario Administrador";
	public static final String USUARIO_VALIDADOR_ROLE = "Usuario Validador";
	
	// CONSTANTES DE LA APLICACIÓN
	public static final String COOKIES_HEADER = "Set-Cookie";
	public static final String SEPARADOR = "#";
	public static final String DOLLAR_SEPARADOR = "$";
	public static final String METODO_ESPECIAL_VALIDAR_NOTAGASTO = "validateNotaGasto";
		
	// CONSTANTES DE CONEXIÓN CON SAP BO
	public static final String LOGIN_END_POINT = "/Login";
	public static final String LOGOUT_END_POINT = "/Logout";
	public static final String SAP_BO_OPTION_COUNT = "$count";
	public static final String SAP_BO_OPTION_TOP = "$top";
	
	// CONSTANTES DE CONEXIÓN CON SAGE
	public static final String SAGE_CONNECTION_URL = "signon.sso.services.sage.com/SSO/OAuthService/";
	public static final String SAGE_SERVICES_URL = "/es/services";
	public static final String SAGE_MURANO_URL = "/es/murano";	
	public static final String SAGE_SERVICES_HOST = "api.columbus.sage.com";
	public static final String START_AUTHORIZATION = "WebStartAuthorisationAttempt";
	public static final String ACCESS_TOKEN = "WebGetAccessToken";
	public static final String REDIRECT_URI = "http://localhost:14312/Home/Authorise";
	public static final String USER_AGENT = "Mozilla/5.0";
	public static final String SAGE_APPLICATION_TOKEN_URL = "suscripciones.sage.es/Sage.LicensingServices/api/v1/security/auth/apps/credential";	
	public static final String SAGE_USER_AGENT = "Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0";
	
	// CONSTANTES DE MÉTODOS SAP BO
	public static final String GET_USUARIOS_SAP = "EmployeesInfo";
	
	// CONSTANTES DE MÉTODOS SAGE
	public static final String SAGE_MIGRATE_USUARIOS = "MigrateUsers";
	public static final String SAGE_GET_COMPANIES = "/payrolls/v1/companies";
	public static final String SAGE_GET_PERSONS = "/payrolls/v1/persons";
	public static final String SAGE_GET_EMPLOYEES = "/payrolls/v1/employees";
	public static final String SAGE_VALIDATE_EXPENSES_NOTE = "/payrolls/v1/payment_incidents";
	
	// CONSTANTES BASE DE DATOS
	public static final String BBDD_APPLICATIONSTATUS_NAME_EXPENSESNOTES = "NOTAGASTOS";
}