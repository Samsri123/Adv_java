package doa;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.io.*;
;
public class LoginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response){
		try {
			String uName= request.getParameter("uName");
			String pwd = request.getParameter("password");
			
			ServletConfig config = getServletConfig();
			ServletContext application = config.getServletContext();
			String url = application.getInitParameter("url");
			String user = application.getInitParameter("user");
			String password = application.getInitParameter("password");
			String driver = application.getInitParameter("driver");
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement ps = con.prepareStatement("select * from login where username=?");
			ps.setString(1, uName);
			ResultSet rs = ps.executeQuery();
			PrintWriter pw = response.getWriter();
			if(rs.next()) {
				String dbPassword = rs.getString("password");
				if(pwd.equals(dbPassword)) {
					response.sendRedirect("response.jsp");
				}else {
					pw.println("<html><body><h3>User credentials are invalid.<br/>Try again...</h3>  <br/><a href=login.html>Login</a><br /></body></html>");
				}
			}else {
				pw.println("<html><body><h3>User doesn't exists.<br/>Please Register into NareshIt..</h3></body></html");
			}
			con.close();
		} catch(Exception e) {
			System.err.println(e);
		}
	}

}
