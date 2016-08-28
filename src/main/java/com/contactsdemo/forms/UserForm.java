package com.contactsdemo.forms;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.contactsdemo.bo.User;

public class UserForm extends ActionForm{
	
	/*private Map<Long, User> usersDetailsMap = new HashMap<Long, User>();*/
	private User currentUser = new User();
	private long personId = new Date().getTime();
	
	
	
	/*public Map<Long, User> getUsersDetailsMap() {
		return usersDetailsMap;
	}
	public void setUsersDetailsMap(Map<Long, User> usersDetailsMap) {
		this.usersDetailsMap = usersDetailsMap;
	}*/
	
	public long getId() {
		return this.currentUser.getId();
	}
	public void setId(long id) {
		this.currentUser.setId(id);
	}
	public String getFirstName() {
		return this.currentUser.getFirstName();
	}
	public void setFirstName(String firstName) {
		this.currentUser.setFirstName(firstName);
	}
	public String getLastName() {
		return this.currentUser.getLastName();
	}
	public void setLastName(String lastName) {
		this.currentUser.setLastName(lastName);
	}
	public String getDob() {
		return this.currentUser.getDob();
	}
	public void setDob(String dob) {
		this.currentUser.setDob(dob);
	}
	public String getSsn() {
		return this.currentUser.getSsn();
	}
	public void setSsn(String ssn) {
		this.currentUser.setSsn(ssn);
	}
	public String getStreet() {
		return this.currentUser.getStreet();
	}
	public void setStreet(String street) {
		this.currentUser.setStreet(street);
	}
	public String getCity() {
		return this.currentUser.getCity();
	}
	public void setCity(String city) {
		this.currentUser.setCity(city);
	}
	public String getState() {
		return this.currentUser.getState();
	}
	public void setState(String state) {
		this.currentUser.setState(state);
	}
	public String getZip() {
		return this.currentUser.getZip();
	}
	public void setZip(String zip) {
		this.currentUser.setZip(zip);
	}
	
	public long getKey()
	{
		return this.currentUser.getId();
	}
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.currentUser.setCity("");
		this.currentUser.setDob("");
		this.currentUser.setFirstName("");
		this.currentUser.setId(0);
		this.currentUser.setLastName("");
		this.currentUser.setSsn("");
		this.currentUser.setState("");
		this.currentUser.setStreet("");
		this.currentUser.setZip("");
		super.reset(mapping, request);
	}
	
/*	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request)
	{
		ActionErrors errors = new ActionErrors();

		boolean nameEntered = false;
		boolean ssNumEntered = false;

		// Determine if name has been entered.
		if (currentUser.getFirstName() != null && currentUser.getFirstName().length() > 0) {
			nameEntered = true;
		}

		// Determine if name has been entered.
		if (currentUser.getLastName() != null && currentUser.getLastName().length() > 0) {
			nameEntered = true;
		}


		// Determine if social security number has been entered.
		if (currentUser.getSsn() != null && currentUser.getSsn().length() > 0) {
			ssNumEntered = true;
		}

		 Validate that either name or social security number
			      has been entered. 
		if (!nameEntered && !ssNumEntered) {
			errors.add(null,
					new ActionError("error.search.criteria.missing"));
		}

		 Validate format of social security number if
			      it has been entered. 
		if (ssNumEntered && !isValidSsNum(currentUser.getSsn().trim())) {
			errors.add("ssn",
					new ActionError("error.search.ssNum.invalid"));
		}

		return errors;
	}

	// Validate format of social security number.
	private static boolean isValidSsNum(String ssn) {
		if (ssn.length() < 11) {
			return false;
		}

		for (int i = 0; i < 11; i++) {
			if (i == 3 || i == 6) {
				if (ssn.charAt(i) != '-') {
					return false;
				}
			} else if ("0123456789".indexOf(ssn.charAt(i)) == -1) {
				return false;
			}
		}

		return true;
	}*/

	
}
