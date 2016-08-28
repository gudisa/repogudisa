package com.contactsdemo.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.contactsdemo.dao.ContactDatailsDAO;
import com.contactsdemo.forms.LoginForm;
import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.MessageResources;
import org.apache.log4j.Logger;

public class LoginAction extends Action{

	final static Logger logger = Logger.getLogger(LoginAction.class);
	ContactDatailsDAO dao = new ContactDatailsDAO();

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	     
		String target = null;
		LoginForm loginForm = (LoginForm)form; 
		MessageResources msgResource = getResources(request);
		String users = msgResource.getMessage("users");
		String passwords = msgResource.getMessage("passwords");
		try{
		List<String> userList = new ArrayList<String>();
		List<String> pwdList = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(users,",");
		
		while(st.hasMoreTokens()) {
			String usg = st.nextToken();
			userList.add(usg);
		}
		
		st = new StringTokenizer(passwords,",");
		while(st.hasMoreTokens()) {
			String pwd = st.nextToken();
			pwdList.add(pwd);
		}
		
		boolean userFound = false;
		for(int i=0; i<userList.size(); i++) {		

			String user = userList.get(i);
			String pwd = pwdList.get(i);

			if(StringUtils.equals(user, loginForm.getUserName())) {
				userFound = true;
				if(StringUtils.equals(pwd, loginForm.getPassword())) {
					
					logger.info("user/pwd are valid");
					target = "success";
				} else {
					
					logger.info("invalid password");
					target = "failure";
				}
				
			}
		
		}

		if(!userFound) {
			
			logger.info("user not found");
			target = "failure";				
		}
		
		// set the user into servletcontext so that, all users can acccess
		request.setAttribute("usersDetailsMap",  dao.getAll());
		
		//request.getSession().getServletContext().setAttribute("usersDetailsMap",  dao.getAll());
	} catch (Exception e) {
		logger.error("Exception: " + e.getMessage());
	}
		return mapping.findForward(target);
	}
	
}
