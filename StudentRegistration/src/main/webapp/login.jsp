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
<body>
	 <h1>Login to NarehIT</h1>
    <div class="aligncenter">
      <form action="LoginServlet" method="post">
        <div class="tab">
          <table>
            <tr>
              <td><label>User-Name</label></td>
              <td><input type="text" name="uName" /></td>
            </tr>
        
            <tr>
              <td><label>Password</label></td>
              <td><input type="password" name="password" /></td>
            </tr>
            
          </table>
        </div>
        <br />
        <button type="submit">Login</button>
      </form>
    </div>
</body>
</html>