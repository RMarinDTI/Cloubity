package es.davinciti.conexiones.test;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import es.davinciti.liferay.model.ConnectionConfigs;
import es.davinciti.liferay.service.ConnectionConfigsLocalServiceUtil;

/**
 * Portlet implementation class TestConexiones
 */
public class TestConexiones extends MVCPortlet {
	
	public String testConnectionErp(ActionRequest actionRequest, ActionResponse actionResponse) {
		String result = "";
		
		long configId = ParamUtil.getLong(actionRequest, "configId", 0);
		String jspPage = ParamUtil.get(actionRequest, "jspPage", "");
		System.out.println("TestConexiones _ testConexionErp - configId : "+configId+" - jspPage : "+jspPage);
		
		if (configId > 0) {
			try {				
				result = ConnectionConfigsLocalServiceUtil.testConnectionErp(configId);				
				SessionMessages.add(actionRequest.getPortletSession(), "test-conexionErp-ok");
			} catch(Exception e) {
				result = e.getMessage();
				SessionErrors.add(actionRequest.getPortletSession(), "test-conexionErp-error");
			}
		}
		
		actionResponse.setRenderParameter("jspPage", jspPage);
		actionResponse.setRenderParameter("configId", String.valueOf(configId));
		actionResponse.setRenderParameter("conexionTestResult", result);
		
		return result;
	}
	
	public String getWebAccessToken(ActionRequest actionRequest, ActionResponse actionResponse) {
		String result = "";
		long configId = ParamUtil.getLong(actionRequest, "configId", 0);
		String code = ParamUtil.get(actionRequest, "code", "");
		String test = ParamUtil.get(actionRequest, "test", "");
		//String cookie = ParamUtil.get(actionRequest, "cookie", "");
		//System.out.println("TestConexiones _ getWebAccessTokenURL - configId : "+configId+" - code : "+code);
		result = ConnectionConfigsLocalServiceUtil.getWebAccessToken(configId, code);
		//System.out.println("TestConexiones _ getWebAccessTokenURL - result : "+result+" - test : "+test);		
		// Si ha ido bien y es Test, volvemos a llamar al método Test
		if (result.contentEquals("OK") && test.contentEquals("test") && configId > 0) {
			try {
				result = ConnectionConfigsLocalServiceUtil.testConnectionErp(configId);
				SessionMessages.add(actionRequest.getPortletSession(),"test-conexionErp-ok");
			} catch(Exception e) {
				SessionErrors.add(actionRequest.getPortletSession(),"test-conexionErp-error");
				result = e.getMessage();
			}
		}
		
		return result;
	}
	
}
