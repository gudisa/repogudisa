package com.contactsdemo.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import com.contactsdemo.bo.User;
import com.contactsdemo.dao.ContactDatailsDAO;
import com.contactsdemo.forms.UserForm;
import org.apache.log4j.Logger;

public class UserAction extends DispatchAction {
	
	final static Logger logger = Logger.getLogger(UserAction.class);
	ContactDatailsDAO dao = new ContactDatailsDAO();
	public ActionForward add(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		logger.info("UserAction add() method is invoked.");
		try{
		UserForm userForm = (UserForm)form;
		User user = new User();
		user.setId(userForm.getId());
		user.setFirstName(userForm.getFirstName());
		user.setLastName(userForm.getLastName());
		user.setDob(userForm.getDob());
		user.setSsn(userForm.getSsn());
		user.setStreet(userForm.getStreet());
		user.setCity(userForm.getCity());
		user.setState(userForm.getState());
		user.setZip(userForm.getZip());
		dao.add(user);
		//userForm.getUsersDetailsMap().put(userForm.getId(), user);
		System.out.println("UserAction add() method is invoked. User Details : "+user);
		
		userForm.reset(mapping, request);
		request.setAttribute("usersDetailsMap", dao.getAll());
		} catch (Exception e) {
			logger.error("Exception: " + e.getMessage());
		}
		return mapping.findForward("home");
	}
	
	
	public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		logger.info("UserAction update() method is invoked.");
		try{
		UserForm userForm = (UserForm)form;
		User user = new User();
		user.setId(userForm.getId());
		/*userForm.setFirstName(user.getFirstName());
		userForm.setLastName(user.getLastName());
		userForm.setDob(user.getDob());
		userForm.setSsn(user.getSsn());
		userForm.setStreet(user.getStreet());
		userForm.setCity(user.getCity());
		userForm.setState(user.getState());
		userForm.setZip(user.getZip());	*/
		//System.out.println("UserAction update() method is invoked. user details end : "+userForm.getCity());
		
		dao.update(user);
		
	} catch (Exception e) {
		logger.error("Exception: " + e.getMessage());
	}
		return mapping.findForward("update");
		
		
	}
	
	
	public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
	   logger.info("UserAction delete() method is invoked.");
		
		try{
		UserForm userForm = (UserForm)form;
		dao.delete(userForm.getId());
		
		} catch (Exception e) {
			logger.error("Exception: " + e.getMessage());
		}
		return mapping.findForward("delete");
		
	}
	
	/*public ActionForward home(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		request.setAttribute("usersDetailsMap", dao.getAll());
		
		return mapping.findForward("home");
		
	}*/
	
	public ActionForward edit(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("UserAction edit() method is invoked.");
		UserForm userForm = (UserForm)form;
		User user = new User();
		user.setId(userForm.getId());
		dao.update(user);
		return mapping.findForward("update");
		
	}
	
	public ActionForward addUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		logger.info("UserAction addUser method is invoked.");
		return mapping.findForward("add");
		
	}
	
}
