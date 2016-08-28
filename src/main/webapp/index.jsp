<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

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
<script>
$(document).ready(function(){
    $("button").click(function(){
        
        $(".test").hide();
    });
});
$(document).ready(function(){
    $("button").click(function(){
        
        $(".test").hide();
    });
});
</script></head>
<body>
<h2>Welcome Login Page</h2>
<pre>

	<html:form action="/user">
		 
	</html:form>
	
<html:form action="login">
<table>

<tr>
<td colspan = 2 >
<html:errors />
</td>
</tr>


<tr>
<td align="right">Enter User Name :  </td>
<td align="left">
<html:text property="userName" />

</td>
</tr>

<tr>
<td align="right">Enter Password  : </td>
<td align="left">
<html:password property="password" />

</td>
</tr>
</html:form>
	
	
<tr>
<td align="right"></td>
<td align="left">
<html:submit/>

</td>
</tr>
<h2 class ="test"> This is a heading
</h2>
<p class ="test">This is a paragraph
</p>
	
</table>	 

</pre>

</body>
</html>
