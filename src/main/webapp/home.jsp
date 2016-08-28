<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html>
<style>
body {
    background-color: lightblue;
}

h2 {
    color: white;
    text-align: center;
}

p {
    font-family: verdana;
    font-size: 20px;
}

</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add-delete-update page</title>
</head>
<body>
<h2>Home User Details</h2>



User Details to Add-delete-update : <br>
	<logic:present name="userForm">
	<html:form action="/user">
	<%-- <html:hidden property="key" name="element"/> --%>
	
<logic:iterate name="usersDetailsMap" id="usersMapId">
      <bean:write name="usersMapId" property="id"/>
      <bean:write name="usersMapId" property="firstName"/>
   <html:submit value="update" property="action" />
   <html:submit value="delete" property="action"/>
  
 </logic:iterate>
	<html:submit value="addUser" property="action"/>
	</html:form>
	</logic:present>
	
	
	
	
	
	
</body>
</html>