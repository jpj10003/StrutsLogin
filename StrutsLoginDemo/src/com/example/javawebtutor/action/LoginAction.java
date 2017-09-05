/**
 * 
 */
package com.example.javawebtutor.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.example.javawebtutor.dbHelper.LoginQuery;
import com.example.javawebtutor.form.LoginForm;

/**
 * @author Jevic
 *
 */
public class LoginAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception
	{
		LoginForm loginForm = (LoginForm) form;
		LoginQuery lq = new LoginQuery();
		
		
		String forward = lq.validateUser(loginForm,request);
		
		
			return mapping.findForward("success");
	
		
	}
	
	
	
}
