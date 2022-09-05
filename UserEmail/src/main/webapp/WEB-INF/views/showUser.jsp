<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	<h1>Userapp</h1>
	<form action="addEmail" method="post">
		<table>
			<tr>
				<td>User First Name</td>
				<td>
					<select name="fname">
						<c:forEach items="${users}" var="user">
							<option>${user.firstname}</option>
						</c:forEach>						
					</select>
				
				</td>
			</tr>
			<tr>
				<td>User Last Name</td>
				<td>
					<select name="lname">
						<c:forEach items="${users}" var="user">
							<option>${user.lastname}</option>
						</c:forEach>						
					</select>
				
				</td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" /></td>
			</tr>			
			<tr>
				<td></td>
				<td><input type="submit" value="Add" /></td>
			</tr>
		</table>
	</form>
	<br/><br/>
	<ul>
		<c:forEach items="${usermails}" var="usermail">
		
			<li>${usermail.id} | ${usermail.fname} | ${usermail.lname}|${usermail.email}</li>
		</c:forEach>
	</ul>
</body>
</html>