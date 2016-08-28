package com.contactsdemo.dao;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import com.contactsdemo.bo.User;

public class ContactDatailsDAO {
	
	 private static Map<Long, User> contacts = new ConcurrentHashMap<Long, User>();
	 
	 public User add(User user) {
	  return contacts.put(user.getId(), user);
	 }
	 
	 public User delete(Long id) {
	  return contacts.remove(id);
	 }
	 
	 public User update(User user) {
	  if(null != contacts.get(user.getId())) {
	   return contacts.put(user.getId(), user);
	   
	   
	  }
	  
	  return null;
	 }
	 
	 public User updateUser(User user)
	 {
         
		 
		 
		// contacts.get(user.getId()).equals(user.getId());
		// contacts.get(user.getId()).equals(user.getId());
		 
		 
		 return null; 
		 
	 }

	  public User update1User(User user)
	 {
         
		 
		 
		// contacts.get(user.getId()).equals(user.getId());
		// contacts.get(user.getId()).equals(user.getId());
		 
		 
		 return null; 
		 
	 }
	 public Collection<User> getAll() {
	  return contacts.values();
	 }
	

}
