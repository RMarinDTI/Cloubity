create index IX_6ED9E40B on CMES_ApplicationStatus (applicationName, statusId);

create index IX_7EABBEE2 on CMES_Calendario (companyId, userId, year);

create index IX_E46205F0 on CMES_Clientes_Proyectos (clienteId);
create index IX_C9C1E209 on CMES_Clientes_Proyectos (proyectoId);

create index IX_F0A6143F on CMES_Configs_Actions (configId);
create index IX_7481530B on CMES_Configs_Actions (connectionActionTypeId);

create index IX_941ED60B on CMES_Configs_Datas (configId);
create index IX_AEAF1771 on CMES_Configs_Datas (connectionDataId);

create index IX_E473007B on CMES_Configs_Types (configId);
create index IX_F0372971 on CMES_Configs_Types (connectionTypeId);

create index IX_F9444576 on CMES_ConnectionConfigs (companyId);

create index IX_9F1CD0FB on CMES_CurrenciesCompany (companyId);

create index IX_8E32F5A8 on CMES_DiasVacaciones (companyId);
create index IX_83776D53 on CMES_DiasVacaciones (companyId, userId, year);
create index IX_BD85D6BA on CMES_DiasVacaciones (userId);

create index IX_C7626946 on CMES_Familias_Categorias (categoriaId);
create index IX_88AC1C20 on CMES_Familias_Categorias (familiaId);

create index IX_EA4FB1CD on CMES_LineaGasto (date_);
create index IX_83C6D40C on CMES_LineaGasto (notaGastos, date_);

create index IX_7351E656 on CMES_LineaGastoCliente (companyId);

create index IX_81CBC3A3 on CMES_LineaGastoFamilia (companyId);

create index IX_5D442185 on CMES_LineaGastoPayMode (companyId);

create index IX_80492BA6 on CMES_Lineas_Categorias (categoriaId);
create index IX_B13D10EE on CMES_Lineas_Categorias (lineagastoId);

create index IX_74A6EE74 on CMES_Lineas_Clientes (clienteId);
create index IX_77F6BF87 on CMES_Lineas_Clientes (lineagastoId);

create index IX_DA8E6C72 on CMES_Lineas_Currencies (currenciescompanyId);
create index IX_5A3EBEC7 on CMES_Lineas_Currencies (currencyId);
create index IX_37AC4DBD on CMES_Lineas_Currencies (lineagastoId);

create index IX_9DF37FF9 on CMES_Lineas_CurrenciesCompanies (currenciescompanyId);
create index IX_7F451416 on CMES_Lineas_CurrenciesCompanies (lineagastoId);

create index IX_E8BB42DA on CMES_Lineas_Familias (familiaId);
create index IX_D0772E54 on CMES_Lineas_Familias (lineagastoId);

create index IX_5AE9CB36 on CMES_Lineas_PayModes (lineagastoId);
create index IX_765A58F6 on CMES_Lineas_PayModes (paymodeId);

create index IX_A6617B78 on CMES_Lineas_Proyectos (lineagastoId);
create index IX_4B350E36 on CMES_Lineas_Proyectos (proyectoId);

create index IX_B838EC43 on CMES_NotaGasto (companyId);
create index IX_E33517D on CMES_NotaGasto (companyId, userId);

create index IX_6784CD on CMES_Notas_HistoricoNotas (historiconotaId);
create index IX_3463F9D5 on CMES_Notas_HistoricoNotas (notagastoId);

create index IX_883963 on CMES_Notas_Lineas (lineagastoId);
create index IX_49BF8DC4 on CMES_Notas_Lineas (notagastoId);

create index IX_927BBE70 on CMES_Notas_OrganizationSageCompanies (notagastoId);
create index IX_F334975D on CMES_Notas_OrganizationSageCompanies (orgsagecompanyId);

create index IX_22CF16DF on CMES_OrganizationSageCompany (organizationId);

create index IX_22DFE264 on CMES_SageEmployee (employeeID);
create index IX_289285A1 on CMES_SageEmployee (userId);

create index IX_361CA4EC on CMES_SapEmployee (employeeID);
create index IX_FB65CC29 on CMES_SapEmployee (userId);

create index IX_821F4A78 on CMES_TipoDiaCalendar (descripcion);