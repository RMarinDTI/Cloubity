package es.davinciti.notagastos;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import es.davinciti.liferay.model.LineaGasto;
import es.davinciti.liferay.model.LineaGastoCategoria;
import es.davinciti.liferay.model.LineaGastoProyecto;
import es.davinciti.liferay.model.NotaGasto;
import es.davinciti.liferay.service.ConnectionConfigsLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoCategoriaLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoClienteLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoFamiliaLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoPayModeLocalServiceUtil;
import es.davinciti.liferay.service.LineaGastoProyectoLocalServiceUtil;
import es.davinciti.liferay.service.NotaGastoLocalServiceUtil;
import es.davinciti.liferay.service.OrganizationSageCompanyLocalServiceUtil;

public class NotaGastos extends MVCPortlet {
	
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public void addNotaGasto(ActionRequest actionRequest, ActionResponse actionResponse) {
		//System.out.println("addNotaGasto init...");
		long companyId = ParamUtil.getLong(actionRequest, "companyId", 0);
		long userId = ParamUtil.getLong(actionRequest, "userId", 0);
		String date = ParamUtil.getString(actionRequest, "date", "");
		long organizationId = ParamUtil.getLong(actionRequest, "organizationId", 0);
		String description = ParamUtil.getString(actionRequest, "description", "");
		String startDate = ParamUtil.getString(actionRequest, "startDate", "");
		String endDate = ParamUtil.getString(actionRequest, "endDate", "");
		String comments = ParamUtil.getString(actionRequest, "comments", "");
		long notagastoId = 0;
		long orgSageCompanyId = 0;
		//System.out.println("addNotaGasto - companyId : "+companyId+" - userId : "+userId+" - date : "+date+" - organizationId : "+organizationId+" - description : "+description+" - startDate : "+startDate+" - endDate : "+endDate+" - comments : "+comments);
		if (companyId > 0 && userId > 0) {
			try{
				notagastoId = CounterLocalServiceUtil.increment(NotaGasto.class.getName());
				NotaGasto nota = NotaGastoLocalServiceUtil.createNotaGasto(notagastoId);
				nota.setCompanyId(companyId);
				nota.setUserId(userId);
				nota.setCreateDate(date);
				nota.setDescription(description);
				nota.setStartDate(startDate);
				nota.setEndDate(endDate);
				//nota.setAmount(amount);
				nota.setComments(comments);
				nota.setStatus("1");
				nota = NotaGastoLocalServiceUtil.addNotaGasto(nota);
				notagastoId = nota.getNotagastoId();		
			} catch(Exception e) { 
				//System.out.println("addNotaGasto ERROR "+e.getMessage());
				SessionErrors.add(actionRequest.getPortletSession(),"notaGasto-add-error");
			}			
			try {
				orgSageCompanyId = OrganizationSageCompanyLocalServiceUtil.findByOrganizationId(organizationId).get(0).getOrgsagecompanyId();				
			} catch(Exception e) { 
				SessionErrors.add(actionRequest.getPortletSession(),"notaGasto-add-error");
			}
			
			if (notagastoId > 0 && orgSageCompanyId > 0) {
				try {
					OrganizationSageCompanyLocalServiceUtil.addNotaGastoOrganizationSageCompany(notagastoId, orgSageCompanyId);
					SessionMessages.add(actionRequest.getPortletSession(),"notaGasto-add-success");
				} catch(Exception e) { 
					SessionErrors.add(actionRequest.getPortletSession(),"notaGasto-add-error");
				}
			}
		}
		
	}
	
	public void editNotaGasto(ActionRequest actionRequest, ActionResponse actionResponse) {
		long notagastoId = ParamUtil.getLong(actionRequest, "nostagastoId", 0);
		long companyId = ParamUtil.getLong(actionRequest, "companyId", 0);
		long userId = ParamUtil.getLong(actionRequest, "userId", 0);		
		long organizationId = ParamUtil.getLong(actionRequest, "organizationId", 0);
		String date = ParamUtil.getString(actionRequest, "date", "");
		String description = ParamUtil.getString(actionRequest, "description", "");
		String startDate = ParamUtil.getString(actionRequest, "startDate", "");
		String endDate = ParamUtil.getString(actionRequest, "endDate", "");
		String amount = ParamUtil.getString(actionRequest, "amount", "");
		String comments = ParamUtil.getString(actionRequest, "comments", "");	
		String vista = ParamUtil.getString(actionRequest, "vista", "U");
		long orgSageCompanyId = 0;
		//System.out.println("editNotaGasto - notagastoId : "+notagastoId+" - companyId : "+companyId+" - userId : "+userId+" - date : "+date+" - organizationId : "+organizationId+" - description : "+description+" - startDate : "+startDate+" - endDate : "+endDate+" - amount : "+amount+" - comments : "+comments);
		if (notagastoId > 0) {
			try {
				NotaGasto nota = NotaGastoLocalServiceUtil.getNotaGasto(notagastoId);
				nota.setAmount(amount);
				nota.setDescription(description);
				nota.setStartDate(startDate);
				nota.setEndDate(endDate);
				nota.setComments(comments);
				nota.setUpdateDate(date);
				nota = NotaGastoLocalServiceUtil.updateNotaGasto(nota);
				// Limpiamos y asignamos Organizaciones
				try {
					orgSageCompanyId = OrganizationSageCompanyLocalServiceUtil.findByOrganizationId(organizationId).get(0).getOrgsagecompanyId();				
				} catch(Exception e) { 
					SessionErrors.add(actionRequest.getPortletSession(),"notaGasto-edit-error");
				}				
				if (orgSageCompanyId > 0) {
					try {
						// Limpiamos primero
						OrganizationSageCompanyLocalServiceUtil.clearNotaGastoOrganizationSageCompanies(notagastoId);
						OrganizationSageCompanyLocalServiceUtil.addNotaGastoOrganizationSageCompany(notagastoId, orgSageCompanyId);
						SessionMessages.add(actionRequest.getPortletSession(),"notaGasto-edit-success");
					} catch(Exception e) { 
						SessionErrors.add(actionRequest.getPortletSession(),"notaGasto-edit-error");
					}
				}
			} catch(Exception e) {
				SessionErrors.add(actionRequest.getPortletSession(),"notaGasto-edit-error");
			}
		}
		
		actionResponse.setRenderParameter("vista", vista);
	}
	
	public void deleteNotaGasto(ActionRequest actionRequest, ActionResponse actionResponse) {
		String vista = ParamUtil.getString(actionRequest, "vista", "U");
		long notagastoId = vista.contentEquals("H") ? ParamUtil.getLong(actionRequest, "notaGastoDelHId", 0) :ParamUtil.getLong(actionRequest, "notaGastoDelId", 0);
		//System.out.println("deleteNotaGasto - notagastoId : "+notagastoId);
		if (notagastoId > 0) {
			try {
				// Borramos todos los Documentos asociados a las Lineas de la Nota
				List<LineaGasto> lineas = LineaGastoLocalServiceUtil.getNotaGastoLineaGastos(notagastoId);
				for (LineaGasto linea : lineas) {
					long documentId = Long.parseLong(linea.getDocumentId());
					DLFileEntryLocalServiceUtil.deleteDLFileEntry(documentId);
				}
				// Limpiamos las tablas hijas relacionadas
				LineaGastoLocalServiceUtil.clearNotaGastoLineaGastos(notagastoId);				
				NotaGastoLocalServiceUtil.deleteNotaGasto(notagastoId);
				SessionMessages.add(actionRequest.getPortletSession(),"notaGasto-delete-success");
			} catch(Exception e) { 
				SessionErrors.add(actionRequest.getPortletSession(),"notaGasto-delete-error");
			}
		}
		
		actionResponse.setRenderParameter("vista", vista);
	}	
			
	public void addLineaGasto(ActionRequest actionRequest, ActionResponse actionResponse) {
		long notagastoId = ParamUtil.getLong(actionRequest, "notagastoId", 0);
		long familiaId = ParamUtil.getLong(actionRequest, "familia", 0);
		long categoriaId = ParamUtil.getLong(actionRequest, "categoria", 0);
		long clienteId = ParamUtil.getLong(actionRequest, "cliente", 0);
		long proyectoId = ParamUtil.getLong(actionRequest, "proyecto", 0);
		String date = ParamUtil.getString(actionRequest, "date", "");
		long paymodeId = ParamUtil.getLong(actionRequest, "paymode", 0);
		String amount = ParamUtil.getString(actionRequest, "amount", "0");
		String quantity = ParamUtil.getString(actionRequest, "quantity", "0");
		String price = ParamUtil.getString(actionRequest, "price", "0");
		String comments = ParamUtil.getString(actionRequest, "comments", "");		
		long currencyId = ParamUtil.getLong(actionRequest, "currency", 0);
		long documentId = ParamUtil.getLong(actionRequest, "documentId", 0);		
		//System.out.println("addLineaGasto - notagastoId : "+notagastoId+" - familiaId : "+familiaId+" - categoriaId : "+categoriaId+" - clienteId : "+clienteId+" - proyectoId : "+proyectoId+" - date : "+date+" - paymodeId : "+paymodeId+" - amount : "+amount+" - quantity : "+quantity+" - price : "+price+" - comments : "+comments+" - currencyId : "+currencyId+" - documentId : "+documentId);
		// Preparamos la subida del archivo y lo subimos
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);				
		File file = null;		
		try {
			file = uploadPortletRequest.getFile("document");
		} catch(Exception e) { 
			System.out.println("file upload ERROR : "+e.getMessage());
		}
		if (file.isFile()) {
			try {
				file = uploadPortletRequest.getFile("document");
				ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
				long realUserId = themeDisplay.getRealUserId();
				long scopeGroupId = themeDisplay.getScopeGroupId();
				ServiceContext serviceContext = new ServiceContext();
				serviceContext.setScopeGroupId(scopeGroupId);			
				String folderName = "Expenses Notes";
				String description = "Folder for files";
				String filename = "Expense_Note_"+realUserId+"_"+new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
				long folderId = 0;
				try {
					DLFolder folder = DLFolderLocalServiceUtil.addFolder(realUserId, scopeGroupId, scopeGroupId, false, 0, folderName, description, false, serviceContext);
					folderId = folder.getFolderId();
				} catch(Exception e) { 
					System.out.println("DLFolderLocalServiceUtil.addFolder Exception : "+e.getMessage());
				}
				if (folderId == 0) {
					try{
						folderId = DLFolderLocalServiceUtil.getFolder(scopeGroupId, 0, folderName).getFolderId();
					} catch(Exception e) { 
						System.out.println("DLFolderLocalServiceUtil.getFolder Exception : "+e.getMessage());
					}
				}
				FileEntry fileEntry = DLAppLocalServiceUtil.addFileEntry(realUserId, scopeGroupId, folderId, file.getName(), MimeTypesUtil.getContentType(file), filename, "", "changeLog", file, serviceContext);
				documentId = fileEntry.getFileEntryId();			
			} catch(Exception e) { 
				System.out.println("upload file Exception : "+e.getMessage());
			}
		}
		if (documentId == 0) SessionErrors.add(actionRequest.getPortletSession(),"document-add-error");
		if (notagastoId > 0 && documentId > 0) {
			try {
				long lineagastoId = CounterLocalServiceUtil.increment(LineaGasto.class.getName());
				LineaGasto linea = LineaGastoLocalServiceUtil.createLineaGasto(lineagastoId);
				linea.setDate(date);
				linea.setAmount(amount);
				linea.setPrice(price);
				linea.setQuantity(quantity);
				linea.setComments(comments);
				linea.setDocumentId(String.valueOf(documentId));
				linea = LineaGastoLocalServiceUtil.addLineaGasto(linea);
				lineagastoId = linea.getLineagastoId();
				// Recalculamos el Amount de la Nota de Gastos
				NotaGasto nota = NotaGastoLocalServiceUtil.getNotaGasto(notagastoId);
				Double amountIni = nota.getAmount().contentEquals("") ? 0.0 : Double.parseDouble(nota.getAmount()); 
				nota.setAmount(String.valueOf(amountIni+Double.parseDouble(amount)));
				nota = NotaGastoLocalServiceUtil.updateNotaGasto(nota);
				notagastoId = nota.getNotagastoId();
				// Vinculamos los Padres - Hijos
				// Nota Gasto
				NotaGastoLocalServiceUtil.addLineaGastoNotaGasto(lineagastoId, notagastoId);
				// Familia
				if (familiaId > 0) LineaGastoLocalServiceUtil.addLineaGastoFamiliaLineaGasto(familiaId, lineagastoId);
				// Categoria
				if (categoriaId > 0) LineaGastoLocalServiceUtil.addLineaGastoCategoriaLineaGasto(categoriaId, lineagastoId);
				// Cliente
				if (clienteId > 0) LineaGastoLocalServiceUtil.addLineaGastoClienteLineaGasto(clienteId, lineagastoId);
				// Proyecto
				if (proyectoId > 0) LineaGastoLocalServiceUtil.addLineaGastoProyectoLineaGasto(proyectoId, lineagastoId);
				// Paymode
				if (paymodeId > 0) LineaGastoLocalServiceUtil.addLineaGastoPayModeLineaGasto(paymodeId, lineagastoId);	
				// Currency
				if (currencyId > 0) LineaGastoLocalServiceUtil.addCurrencyLineaGasto(currencyId, lineagastoId);
				SessionMessages.add(actionRequest.getPortletSession(),"lineaGasto-add-success");			
			} catch(Exception e) {
				System.out.println("add Linea Gasto Exception : "+e.getMessage());
				SessionErrors.add(actionRequest.getPortletSession(),"lineaGasto-add-error");
			}			
		}
		String portletName = (String)actionRequest.getAttribute(WebKeys.PORTLET_ID);
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		PortletURL redirectURL = PortletURLFactoryUtil.create(PortalUtil.getHttpServletRequest(actionRequest), portletName, themeDisplay.getLayout().getPlid(), PortletRequest.RENDER_PHASE);
		redirectURL.setParameter("jspPage", "/html/notagastos/edit.jsp");
		redirectURL.setParameter("backURL", "/expenses-notes");
		redirectURL.setParameter("notaGastoId", notagastoId > 0 ? String.valueOf(notagastoId) : "0");
		try {
			actionResponse.sendRedirect(redirectURL.toString()); 
		} catch(Exception e) {
			System.out.println("deleteLineaGasto actionResponse sendredirect ERROR : "+e.getMessage());
		}
	}
	
	public void editLineaGasto(ActionRequest actionRequest, ActionResponse actionResponse) {		
		long notagastoId = ParamUtil.getLong(actionRequest, "notagastoId", 0);
		long lineagastoId = ParamUtil.getLong(actionRequest, "lineagastoId", 0);
		long familiaId = ParamUtil.getLong(actionRequest, "familia", 0);
		long categoriaId = ParamUtil.getLong(actionRequest, "categoria", 0);
		long clienteId = ParamUtil.getLong(actionRequest, "cliente", 0);
		long proyectoId = ParamUtil.getLong(actionRequest, "proyecto", 0);
		long paymodeId = ParamUtil.getLong(actionRequest, "paymode", 0);
		long documentId = ParamUtil.getLong(actionRequest, "documentId", 0);
		String date = ParamUtil.getString(actionRequest, "date", "");		
		String price = ParamUtil.getString(actionRequest, "price", "0");
		String quantity = ParamUtil.getString(actionRequest, "quantity", "0");
		String amount = ParamUtil.getString(actionRequest, "amount", "0");
		String comments = ParamUtil.getString(actionRequest, "comments", "");
		String vista = ParamUtil.getString(actionRequest, "vista", "U");
		//System.out.println("editLineaGasto - notagastoId : "+notagastoId+" - lineagastoId : "+lineagastoId+" - familiaId : "+familiaId+" - categoriaId : "+categoriaId+" - clienteId : "+clienteId+" - proyectoId : "+proyectoId+" - paymodeId : "+paymodeId+" - documentId : "+documentId+" - date : "+date+" - price : "+price+" - quantity : "+quantity+" - amount : "+amount+" - comments : "+comments+" - vista : "+vista);
		// Preparamos la subida del archivo y lo subimos
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		File file = null;		
		try {
			file = uploadPortletRequest.getFile("document");
		} catch(Exception e) { 
			System.out.println("file upload ERROR : "+e.getMessage());
		}
		//System.out.println("File is file? "+file.isFile());
		if (file.isFile()) {
			try {
				ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
				long realUserId = themeDisplay.getRealUserId();
				long scopeGroupId = themeDisplay.getScopeGroupId();
				ServiceContext serviceContext = new ServiceContext();
				serviceContext.setScopeGroupId(scopeGroupId);			
				String folderName = "Expenses Notes";
				String description = "Folder for files";
				String filename = "Expense_Note_"+new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
				DLFolder folder = DLFolderLocalServiceUtil.addFolder(realUserId, scopeGroupId, scopeGroupId, false, 0, folderName, description, false, serviceContext);
				FileEntry fileEntry = DLAppLocalServiceUtil.addFileEntry(realUserId, scopeGroupId, folder.getFolderId(), file.getName(), MimeTypesUtil.getContentType(file), filename, "", "changeLog", file, serviceContext);
				documentId = fileEntry.getFileEntryId();
			} catch(Exception e) { }
		}
		if (notagastoId > 0 && lineagastoId > 0) {
			try { 
				LineaGasto linea = LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId);
				Double amountIni = linea.getAmount().contentEquals("") ? 0.0 : Double.parseDouble(linea.getAmount());
				linea.setDate(date);
				linea.setAmount(amount);
				linea.setPrice(price);
				linea.setQuantity(quantity);				
				linea.setComments(comments);
				if (documentId > 0) linea.setDocumentId(String.valueOf(documentId));
				linea = LineaGastoLocalServiceUtil.updateLineaGasto(linea);
				lineagastoId = linea.getLineagastoId();
				// Recalculamos el Amount de la Nota de Gastos
				NotaGasto nota = NotaGastoLocalServiceUtil.getNotaGasto(notagastoId);
				nota.setAmount(String.valueOf((Double.parseDouble(nota.getAmount())-amountIni)+Double.parseDouble(amount)));
				nota = NotaGastoLocalServiceUtil.updateNotaGasto(nota);
				notagastoId = nota.getNotagastoId();
				// Borramos el Documento si ha cambiado
				long documentOldId = ParamUtil.getLong(actionRequest, "documentId", 0);  
				if (documentOldId != documentId && documentOldId > 0) DLFileEntryLocalServiceUtil.deleteDLFileEntry(documentOldId);
				// Limpiamos las tablas hijas relacionadas
				NotaGastoLocalServiceUtil.clearLineaGastoNotaGastos(lineagastoId);
				LineaGastoFamiliaLocalServiceUtil.clearLineaGastoLineaGastoFamilias(lineagastoId);
				LineaGastoCategoriaLocalServiceUtil.clearLineaGastoLineaGastoCategorias(lineagastoId);
				LineaGastoClienteLocalServiceUtil.clearLineaGastoLineaGastoClientes(lineagastoId);
				LineaGastoProyectoLocalServiceUtil.clearLineaGastoLineaGastoProyectos(lineagastoId);
				LineaGastoPayModeLocalServiceUtil.clearLineaGastoLineaGastoPayModes(lineagastoId);
				// Vinculamos los Padres - Hijos
				// Nota Gasto
				NotaGastoLocalServiceUtil.addLineaGastoNotaGasto(lineagastoId, notagastoId);
				// Familia
				if (familiaId > 0) LineaGastoLocalServiceUtil.addLineaGastoFamiliaLineaGasto(familiaId, lineagastoId);
				// Categoria
				if (categoriaId > 0) LineaGastoLocalServiceUtil.addLineaGastoCategoriaLineaGasto(categoriaId, lineagastoId);
				// Cliente
				if (clienteId > 0) LineaGastoLocalServiceUtil.addLineaGastoClienteLineaGasto(clienteId, lineagastoId);
				// Proyecto
				if (proyectoId > 0) LineaGastoLocalServiceUtil.addLineaGastoProyectoLineaGasto(proyectoId, lineagastoId);
				// Paymode
				if (paymodeId > 0) LineaGastoLocalServiceUtil.addLineaGastoPayModeLineaGasto(paymodeId, lineagastoId);	
				SessionMessages.add(actionRequest.getPortletSession(),"lineaGasto-edit-success");
			} catch(Exception e) {
				SessionErrors.add(actionRequest.getPortletSession(),"lineaGasto-edit-error");
			}
		}
		String portletName = (String)actionRequest.getAttribute(WebKeys.PORTLET_ID);
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		PortletURL redirectURL = PortletURLFactoryUtil.create(PortalUtil.getHttpServletRequest(actionRequest), portletName, themeDisplay.getLayout().getPlid(), PortletRequest.RENDER_PHASE);
		redirectURL.setParameter("jspPage", "/html/notagastos/edit.jsp");
		redirectURL.setParameter("backURL", "/expenses-notes");
		redirectURL.setParameter("vista", vista);
		redirectURL.setParameter("notaGastoId", notagastoId > 0 ? String.valueOf(notagastoId) : "0");
		try {
			actionResponse.sendRedirect(redirectURL.toString()); 
		} catch(Exception e) {
			System.out.println("deleteLineaGasto actionResponse sendredirect ERROR : "+e.getMessage());
		}
	}	
	
	public void deleteLineaGasto(ActionRequest actionRequest, ActionResponse actionResponse) {
		long lineagastoId = ParamUtil.getLong(actionRequest, "lineaGastoId", 0);
		long notagastoId = ParamUtil.getLong(actionRequest, "notaGastoId", 0);
		//System.out.println("deleteLineaGasto - lineagastoId : "+lineagastoId);
		if (lineagastoId > 0 && notagastoId > 0) {
			try { 
				// Recalculamos el Amount de la Nota de Gastos
				NotaGasto nota = NotaGastoLocalServiceUtil.getNotaGasto(notagastoId);
				LineaGasto linea = LineaGastoLocalServiceUtil.getLineaGasto(lineagastoId);
				nota.setAmount(String.valueOf(Double.parseDouble(nota.getAmount())-Double.parseDouble(linea.getAmount())));
				nota = NotaGastoLocalServiceUtil.updateNotaGasto(nota);
				notagastoId = nota.getNotagastoId();
				// Borramos Docuimento asociado (si existe)
				long documentId = Long.parseLong(linea.getDocumentId());
				if (documentId > 0) DLFileEntryLocalServiceUtil.deleteDLFileEntry(documentId);
				// Limpiamos las tablas hijas relacionadas
				NotaGastoLocalServiceUtil.clearLineaGastoNotaGastos(lineagastoId);
				LineaGastoFamiliaLocalServiceUtil.clearLineaGastoLineaGastoFamilias(lineagastoId);
				LineaGastoCategoriaLocalServiceUtil.clearLineaGastoLineaGastoCategorias(lineagastoId);
				LineaGastoClienteLocalServiceUtil.clearLineaGastoLineaGastoClientes(lineagastoId);
				LineaGastoProyectoLocalServiceUtil.clearLineaGastoLineaGastoProyectos(lineagastoId);
				LineaGastoPayModeLocalServiceUtil.clearLineaGastoLineaGastoPayModes(lineagastoId);
				LineaGastoLocalServiceUtil.deleteLineaGasto(lineagastoId);
				SessionMessages.add(actionRequest.getPortletSession(),"lineaGasto-delete-success");
			} catch(Exception e) {
				SessionErrors.add(actionRequest.getPortletSession(),"lineaGasto-delete-error");
			}
		}
		String portletName = (String)actionRequest.getAttribute(WebKeys.PORTLET_ID);
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		PortletURL redirectURL = PortletURLFactoryUtil.create(PortalUtil.getHttpServletRequest(actionRequest), portletName, themeDisplay.getLayout().getPlid(), PortletRequest.RENDER_PHASE);
		redirectURL.setParameter("jspPage", "/html/notagastos/edit.jsp");
		redirectURL.setParameter("notaGastoId", notagastoId > 0 ? String.valueOf(notagastoId) : "0");
		try {
			actionResponse.sendRedirect(redirectURL.toString()); 
		} catch(Exception e) {
			System.out.println("deleteLineaGasto actionResponse sendredirect ERROR : "+e.getMessage());
		}
	}
	
	 @Override
     public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		 //System.out.println("serveResource running...");
		 JSONObject jsonObject = null;
         JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
         long familiaId = ParamUtil.getLong(resourceRequest, "familiaId", 0);
         long clienteId = ParamUtil.getLong(resourceRequest, "clienteId", 0);
         long categoriaId = ParamUtil.getLong(resourceRequest, "categoriaId", 0);
         //System.out.println("serveResource - familiaId : "+familiaId+" - clienteId : "+clienteId+" - categoriaId : "+categoriaId);
         // getCategoriasFamilia
         if (familiaId > 0) {
        	 try {
        		 List<LineaGastoCategoria> categories = LineaGastoCategoriaLocalServiceUtil.getLineaGastoFamiliaLineaGastoCategorias(familiaId);
        		 for (LineaGastoCategoria category : categories) {
        			jsonObject =  JSONFactoryUtil.createJSONObject();
        			jsonObject.put("categoriaId", category.getCategoriaId());
        			jsonObject.put("name", category.getName());
        			jsonArray.put(jsonObject);        			
        		 }
        		 PrintWriter out=resourceResponse.getWriter();
                 //System.out.println("getCategoriasFamilia : "+jsonArray.toString());
                 out.print(jsonArray.toString());
        	 } catch(Exception e) { 
        		 System.out.println("serveResource ERROR : "+e.getMessage());
        	 }
         }
         // getProyectosCliente
         if (clienteId > 0) {
        	 try {
        		 List<LineaGastoProyecto> proyectos = LineaGastoProyectoLocalServiceUtil.getLineaGastoClienteLineaGastoProyectos(clienteId);
        		 for (LineaGastoProyecto proyecto : proyectos) {
        			jsonObject =  JSONFactoryUtil.createJSONObject();
        			jsonObject.put("proyectoId", proyecto.getProyectoId());
        			jsonObject.put("name", proyecto.getName());
        			jsonArray.put(jsonObject);        			
        		 }
        		 PrintWriter out = resourceResponse.getWriter();
                 //System.out.println("getProyectosCliente : "+jsonArray.toString());
                 out.print(jsonArray.toString());
        	 } catch(Exception e) { 
        		 System.out.println("serveResource ERROR : "+e.getMessage());
        	 }
         }
         // getCategoria
         if (categoriaId > 0) {
        	 try {
        		LineaGastoCategoria categoria = LineaGastoCategoriaLocalServiceUtil.getLineaGastoCategoria(categoriaId);
        		jsonObject =  JSONFactoryUtil.createJSONObject();     			
     			jsonObject.put("changePrice", categoria.getChangePrice());
     			jsonObject.put("needQuantity", categoria.getNeedQuantity());
     			jsonObject.put("price", categoria.getPrice());
     			//jsonArray.put(jsonObject);     			
     			PrintWriter out = resourceResponse.getWriter();
                //System.out.println("getCategoria : "+jsonObject.toString());
                out.print(jsonObject.toString());
        	 } catch(Exception e) { 
        		 System.out.println("serveResource ERROR : "+e.getMessage());
        	 }
         }
	 
	 }
	 
	 public void sendValidateNotaGasto(ActionRequest actionRequest, ActionResponse actionResponse) {
			long notagastoId = ParamUtil.getLong(actionRequest, "notaGastoSValId", 0);
			//System.out.println("sendValidateNotaGasto - notagastoId : "+notagastoId);
			if (notagastoId > 0) {
				try {
					NotaGasto nota = NotaGastoLocalServiceUtil.getNotaGasto(notagastoId);
					nota.setStatus("2");
					nota.setUpdateDate(dateFormat.format(new Date()));
					NotaGastoLocalServiceUtil.updateNotaGasto(nota);
					
					SessionMessages.add(actionRequest.getPortletSession(),"notaGasto-sendValidate-success");
				} catch(Exception e) { 
					SessionErrors.add(actionRequest.getPortletSession(),"notaGasto-sendValidate-error");
				}
			}		
			String portletName = (String)actionRequest.getAttribute(WebKeys.PORTLET_ID);
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			PortletURL redirectURL = PortletURLFactoryUtil.create(PortalUtil.getHttpServletRequest(actionRequest), portletName, themeDisplay.getLayout().getPlid(), PortletRequest.RENDER_PHASE);
			redirectURL.setParameter("jspPage", "/html/notagastos/view.jsp");		
			try {
				actionResponse.sendRedirect(redirectURL.toString()); 
			} catch(Exception e) {
				System.out.println("sendValidateNotaGasto actionResponse sendredirect ERROR : "+e.getMessage());
			}
		}
	 
	 public void validateNotaGasto(ActionRequest actionRequest, ActionResponse actionResponse) {
			long notagastoId = ParamUtil.getLong(actionRequest, "notaGastoValId", 0);
			long companyId = ParamUtil.getLong(actionRequest, "companyId", 0);
			long userId = ParamUtil.getLong(actionRequest, "userId", 0);
			Locale locale = PortalUtil.getUploadPortletRequest(actionRequest).getLocale();
			//System.out.println("validateNotaGasto - notaGastoValId : "+notagastoId+" - companyId : "+companyId+" - userId : "+userId+" running ...");
			String result = "";			
			if (notagastoId > 0) {
				try {					
					long configId = ConnectionConfigsLocalServiceUtil.findByCompanyId(companyId).get(0).getConfigId();
					result = NotaGastoLocalServiceUtil.validateNotaGasto(notagastoId, configId, userId, locale);										
					
					SessionMessages.add(actionRequest.getPortletSession(),"notaGasto-validate-success");
				} catch(Exception e) { 
					SessionErrors.add(actionRequest.getPortletSession(),"notaGasto-validate-error");
				}
			}		
			String portletName = (String)actionRequest.getAttribute(WebKeys.PORTLET_ID);
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			PortletURL redirectURL = PortletURLFactoryUtil.create(PortalUtil.getHttpServletRequest(actionRequest), portletName, themeDisplay.getLayout().getPlid(), PortletRequest.RENDER_PHASE);
			redirectURL.setParameter("jspPage", "/html/notagastos/view.jsp");
			redirectURL.setParameter("vista", "D");
			try {
				actionResponse.sendRedirect(redirectURL.toString()); 
			} catch(Exception e) {
				System.out.println("validateNotaGasto actionResponse sendredirect ERROR : "+e.getMessage());
			}
		}
	 
	 public void denyNotaGasto(ActionRequest actionRequest, ActionResponse actionResponse) {
		long notagastoId = ParamUtil.getLong(actionRequest, "notaGastoDenId", 0);
		//System.out.println("denyNotaGasto - notagastoId : "+notagastoId);
		if (notagastoId > 0) {
			try {
				NotaGasto nota = NotaGastoLocalServiceUtil.getNotaGasto(notagastoId);
				nota.setStatus("3");
				nota.setUpdateDate(dateFormat.format(new Date()));
				NotaGastoLocalServiceUtil.updateNotaGasto(nota);
				SessionMessages.add(actionRequest.getPortletSession(),"notaGasto-deny-success");
			} catch(Exception e) { 
				SessionErrors.add(actionRequest.getPortletSession(),"notaGasto-deny-error");
			}
		}		
		String portletName = (String)actionRequest.getAttribute(WebKeys.PORTLET_ID);
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		PortletURL redirectURL = PortletURLFactoryUtil.create(PortalUtil.getHttpServletRequest(actionRequest), portletName, themeDisplay.getLayout().getPlid(), PortletRequest.RENDER_PHASE);
		redirectURL.setParameter("jspPage", "/html/notagastos/view.jsp");
		redirectURL.setParameter("vista", "D");
		try {
			actionResponse.sendRedirect(redirectURL.toString()); 
		} catch(Exception e) {
			System.out.println("validateNotaGasto actionResponse sendredirect ERROR : "+e.getMessage());
		}
	 }
	
}
