<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html>
<head>
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

table, th, td {
    border: 5px solid gree;
    
</style>
</head>
<body>
	<h2>Add User Details</h2>

	<html:form action="/user">
	
	<table>



<tr>
<td align="right">User Id : </td>
<td align="left">
<html:text property="id" size="30" maxlength="30"/>
</td>
</tr>
<tr>
<td align="right">FirstName : </td>
<td align="left">
<html:text property="firstName" size="30" maxlength="30"/>
</td>
</tr>
<tr>
<td align="right">Last Name : </td>
<td align="left">
<html:text property="lastName" size="30" maxlength="30"/>
</td>
</tr>

<tr>
<td align="right">Date Of Birth :  </td>
<td align="left">
<html:text property="dob" size="30" maxlength="30"/>
</td>
</tr>
<tr>
<td align="right">Social Security Number  :  </td>
<td align="left">
<html:text property="ssn" size="30" maxlength="30"/>
</td>
</tr>

<tr>
<td align="right">Street  :  </td>
<td align="left">
<html:text property="street" size="30" maxlength="30"/>
</td>
</tr>

<tr>
<td align="right">City  :  </td>
<td align="left">
<html:text property="city" size="30" maxlength="30"/>
</td>
</tr>
<tr>
<td align="right">State  :  </td>
<td align="left">
<html:text property="state" size="30" maxlength="30"/>
</td>
</tr>
<tr>
<td align="right">Zip Code :  </td>
<td align="left">
<html:text property="zip" size="30" maxlength="30"/>
</td>
</tr>

</table>

<p>
		<html:submit title="Create New User" property="action" value="add" />
		</p>


	</html:form>

</body>
</html>
