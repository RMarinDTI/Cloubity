create table CMES_ApplicationStatus (
	applicationStatusId LONG not null primary key,
	applicationName VARCHAR(75) null,
	statusId VARCHAR(75) null,
	name VARCHAR(75) null,
	description VARCHAR(75) null
);

create table CMES_Calendario (
	calendarioId LONG not null primary key,
	companyId LONG,
	userId LONG,
	year INTEGER,
	calendarJson STRING null,
	status VARCHAR(75) null
);

create table CMES_Clientes_Proyectos (
	clienteId LONG not null,
	proyectoId LONG not null,
	primary key (clienteId, proyectoId)
);

create table CMES_Configs_Actions (
	connectionActionTypeId LONG not null,
	configId LONG not null,
	primary key (connectionActionTypeId, configId)
);

create table CMES_Configs_Datas (
	configId LONG not null,
	connectionDataId LONG not null,
	primary key (configId, connectionDataId)
);

create table CMES_Configs_Types (
	configId LONG not null,
	connectionTypeId LONG not null,
	primary key (configId, connectionTypeId)
);

create table CMES_ConnectionActionTypes (
	connectionActionTypeId LONG not null primary key,
	name VARCHAR(75) null,
	disableDate DATE null
);

create table CMES_ConnectionConfigs (
	configId LONG not null primary key,
	companyId LONG,
	installationId VARCHAR(75) null,
	companyCode VARCHAR(75) null,
	productCode VARCHAR(75) null,
	disableDate DATE null
);

create table CMES_ConnectionData (
	connectionDataId LONG not null primary key,
	companyDB VARCHAR(75) null,
	username VARCHAR(75) null,
	password_ VARCHAR(75) null,
	url VARCHAR(75) null,
	server VARCHAR(75) null,
	port VARCHAR(75) null,
	accessToken STRING null,
	refreshToken STRING null,
	disableDate DATE null,
	secretKey VARCHAR(75) null,
	applicationToken STRING null,
	clientId VARCHAR(75) null,
	tokenType VARCHAR(75) null,
	expiresIn INTEGER,
	scope VARCHAR(75) null,
	clavePrimaria VARCHAR(75) null,
	claveSecundaria VARCHAR(75) null,
	sessionId VARCHAR(75) null,
	encodedClientCredentials STRING null,
	state_ VARCHAR(75) null,
	webSecretKey VARCHAR(75) null,
	applicationCode VARCHAR(75) null
);

create table CMES_ConnectionTypes (
	connectionTypeId LONG not null primary key,
	name VARCHAR(75) null,
	disableDate DATE null
);

create table CMES_CurrenciesCompany (
	currenciescompanyId LONG not null primary key,
	companyId LONG,
	currenciesJson VARCHAR(75) null
);

create table CMES_Currency (
	currencyId LONG not null primary key,
	ccyMnrUnts VARCHAR(75) null,
	ccyName VARCHAR(75) null,
	ccyNumber VARCHAR(75) null,
	code_ VARCHAR(75) null,
	countryName VARCHAR(75) null
);

create table CMES_DiasVacaciones (
	diasVacacionesId LONG not null primary key,
	companyId LONG,
	userId LONG,
	year INTEGER,
	disponibles INTEGER,
	solicitados INTEGER,
	aprobados INTEGER,
	pendientes INTEGER,
	asignado VARCHAR(75) null
);

create table CMES_Familias_Categorias (
	categoriaId LONG not null,
	familiaId LONG not null,
	primary key (categoriaId, familiaId)
);

create table CMES_HistoricoNota (
	historiconotaId LONG not null primary key,
	companyId LONG,
	userId LONG,
	comments VARCHAR(75) null,
	updateAt VARCHAR(75) null,
	prevStatus VARCHAR(75) null,
	newStatus VARCHAR(75) null
);

create table CMES_LineaGasto (
	lineagastoId LONG not null primary key,
	date_ VARCHAR(75) null,
	amount VARCHAR(75) null,
	documentId VARCHAR(75) null,
	comments VARCHAR(75) null,
	status VARCHAR(75) null,
	price VARCHAR(75) null,
	quantity VARCHAR(75) null
);

create table CMES_LineaGastoCategoria (
	categoriaId LONG not null primary key,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	categoryCode VARCHAR(75) null,
	accountCode VARCHAR(75) null,
	changePrice VARCHAR(75) null,
	needQuantity VARCHAR(75) null,
	price VARCHAR(75) null
);

create table CMES_LineaGastoCliente (
	clienteId LONG not null primary key,
	companyId LONG,
	name VARCHAR(75) null,
	description VARCHAR(75) null
);

create table CMES_LineaGastoFamilia (
	familiaId LONG not null primary key,
	companyId LONG,
	name VARCHAR(75) null,
	description VARCHAR(75) null
);

create table CMES_LineaGastoPayMode (
	paymodeId LONG not null primary key,
	companyId LONG,
	name VARCHAR(75) null,
	description VARCHAR(75) null
);

create table CMES_LineaGastoProyecto (
	proyectoId LONG not null primary key,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	codeName VARCHAR(75) null,
	sageCompanyId VARCHAR(75) null
);

create table CMES_Lineas_Categorias (
	lineagastoId LONG not null,
	categoriaId LONG not null,
	primary key (lineagastoId, categoriaId)
);

create table CMES_Lineas_Clientes (
	lineagastoId LONG not null,
	clienteId LONG not null,
	primary key (lineagastoId, clienteId)
);

create table CMES_Lineas_Currencies (
	currencyId LONG not null,
	lineagastoId LONG not null,
	primary key (currencyId, lineagastoId)
);

create table CMES_Lineas_CurrenciesCompanies (
	currenciescompanyId LONG not null,
	lineagastoId LONG not null,
	primary key (currenciescompanyId, lineagastoId)
);

create table CMES_Lineas_Familias (
	lineagastoId LONG not null,
	familiaId LONG not null,
	primary key (lineagastoId, familiaId)
);

create table CMES_Lineas_PayModes (
	lineagastoId LONG not null,
	paymodeId LONG not null,
	primary key (lineagastoId, paymodeId)
);

create table CMES_Lineas_Proyectos (
	lineagastoId LONG not null,
	proyectoId LONG not null,
	primary key (lineagastoId, proyectoId)
);

create table CMES_NotaGasto (
	notagastoId LONG not null primary key,
	companyId LONG,
	userId LONG,
	description VARCHAR(75) null,
	startDate VARCHAR(75) null,
	endDate VARCHAR(75) null,
	comments VARCHAR(75) null,
	status VARCHAR(75) null,
	amount VARCHAR(75) null,
	createDate VARCHAR(75) null,
	updateDate VARCHAR(75) null
);

create table CMES_Notas_HistoricoNotas (
	historiconotaId LONG not null,
	notagastoId LONG not null,
	primary key (historiconotaId, notagastoId)
);

create table CMES_Notas_Lineas (
	lineagastoId LONG not null,
	notagastoId LONG not null,
	primary key (lineagastoId, notagastoId)
);

create table CMES_Notas_OrganizationSageCompanies (
	notagastoId LONG not null,
	orgsagecompanyId LONG not null,
	primary key (notagastoId, orgsagecompanyId)
);

create table CMES_OrganizationSageCompany (
	orgsagecompanyId LONG not null primary key,
	organizationId LONG,
	sageCompanyId VARCHAR(75) null
);

create table CMES_SageEmployee (
	sageEmployeeId LONG not null primary key,
	userId LONG,
	employeeID VARCHAR(75) null,
	applicationId VARCHAR(75) null,
	companyId VARCHAR(75) null,
	personId VARCHAR(75) null,
	startDate VARCHAR(75) null,
	endDate VARCHAR(75) null,
	seniority VARCHAR(75) null
);

create table CMES_SapEmployee (
	sapEmployeeId LONG not null primary key,
	employeeID LONG,
	userId LONG,
	middleName VARCHAR(75) null,
	gender VARCHAR(75) null,
	jobTitle VARCHAR(75) null,
	employeeType VARCHAR(75) null
);

create table CMES_TipoDiaCalendar (
	tipoDiaCalendarId LONG not null primary key,
	descripcion VARCHAR(75) null,
	fondoColor VARCHAR(75) null,
	letraColor VARCHAR(75) null,
	strong VARCHAR(75) null
);