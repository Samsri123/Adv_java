<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sri Technologies</title>
<link rel="icon" href="SRI.png"/>
<link rel="stylesheet" href="style.css"/>
</head>
<%
	
%>
<body>
	<h1>Registration Form</h1>
    <div class="aligncenter">
      <form action="DBServlet" method="post">
        <div class="tab">
          <table>
            <tr>
              <td><label>First name</label></td>
              <td><input type="text" name="fName" /></td>
            </tr>
            <tr>
              <td><label>Last name</label></td>
              <td><input type="text" name="lName" /></td>
            </tr>
            <tr>
              <td><label>User-Name</label></td>
              <td><input type="text" name="uName" /></td>
            </tr>
            <tr>
              <td><label>Password</label></td>
              <td><input type="password" name="password" /></td>
            </tr>
            <tr>
              <td><label>E-mail</label></td>
              <td><input type="email" name="email" /></td>
            </tr>
            <tr>
              <td><label>Contact</label></td>
              <td><input type="text" name="contact" /></td>
            </tr>
            <tr>
              <td><label>Address</label></td>
              <td><textarea rows="5" cols="30" name="address"></textarea></td>
            </tr>
          </table>
        </div>
        <br />
        <button type="submit">Register</button> &nbsp; &nbsp;
        <button type="reset">Reset</button>
      </form>
    </div>
</body>
</html>