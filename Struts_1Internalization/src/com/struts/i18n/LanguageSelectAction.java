package com.struts.i18n;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;



public class LanguageSelectAction extends Action{
	
	public ActionForward english(HttpServletRequest request, HttpServletResponse response,
			                     ActionMapping mapping, ActionForm form) throws Exception{
		
		request.getSession().setAttribute(Globals.LOCALE_KEY, Locale.ENGLISH);
		return mapping.findForward("success");
	}
	
	public ActionForward german(HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping, ActionForm form) throws Exception {
		
		request.getSession().setAttribute(Globals.LOCALE_KEY, Locale.FRANCE);
		return mapping.findForward("success");
		
	}
	

}
