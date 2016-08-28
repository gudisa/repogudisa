<%@ taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html:html>
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

<body >
<html:form action="/user" method="post">
<table>
<tr>
<td align="center" colspan="2">
<font size="4">Enter user Id you want to delete</font>
</tr>
<tr>
<td align="left" colspan="2">
<font color="red"><html:errors/></font>
</tr>
<tr>
<td align="right">User Id </td>
<td align="left">
<html:text property="id" size="30" maxlength="30"/>
</td>
</tr>

</table>

<html:submit title="delete" property="action" value="delete" />
</html:form>
</body>
</html:html>

