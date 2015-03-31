<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
		<head>
			<title>Login Page</title>
		</head>
		
		<body>	
 			<form action="login.htm?method=doLogin" method="POST" >	
 				<table cellsapcing="0" cellpadding="0" border="0" align="center">
 				<tr>
 					<td><label>UserName:</label></td>
 					<td><input type='text' name='username' id='employeeCode'/></td>
 				</tr>
 
				 <tr>
 					<td><label>Password:</label></td>
 					<td><input name="password" type="password" /></td>
 				</tr>
 	
 				<tr>
 					<td></td><td><input type="submit" name="Submit" value="Login" />
 				</tr>
 				
 				<tr><td>
 					<c:out value ='${Error}'/>
			 	</td></tr>
 
 				</table>
  			</form>
 		 </body>
</html>
	