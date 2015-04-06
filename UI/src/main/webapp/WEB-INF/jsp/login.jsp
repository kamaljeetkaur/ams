<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
		<head>
		<title><fmt:message key="lbl.title.loginPage" /></title>
		</head>
		
		<body>	
 			<form:form action="login.htm?method=doLogin" method="POST" commandName="loginUserVo">	
 				<table cellsapcing="0" cellpadding="0" border="0" align="center">
 				<tr>
 					<td><label>UserName:</label></td>
 					<td><form:input  path="userName"/></td>
 					<td><form:errors  path="userName"/></td>
 				</tr>
 
				 <tr>
 					<td><label>Password:</label></td>
 					<td><form:password path="password" /></td>
 					<td><form:errors  path="password" /></td>
 				</tr>
 	
 				<tr>
 					<td></td><td><input type="submit" name="Submit" value="Login" />
 				</tr>
 				
 				<tr><td>
 					<c:out value ='${Error}'/>
			 	</td></tr>
 
 				</table>
  			</form:form>
 		 </body>
</html>
	