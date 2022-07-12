package doa;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response){
		try {
			ServletConfig config = getServletConfig();
			ServletContext application = config.getServletContext();
			String url = application.getInitParameter("url");
			String user = application.getInitParameter("user");
			String password = application.getInitParameter("password");
			String driver = application.getInitParameter("driver");
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,password);
			String s1 = request.getParameter("fName");
			String s2 = request.getParameter("lName");
			String s3 = request.getParameter("uName");
			String s4 = request.getParameter("password");
			String s5 = request.getParameter("email");
			String s6 = request.getParameter("contact");
			String s7 = request.getParameter("address");
			PreparedStatement ps = con.prepareStatement("insert into login values(?,?,?,?,?,?,?)");
			ps.setString(1, s1);
			ps.setString(2, s2);
			ps.setString(3, s3);
			ps.setString(4, s4);
			ps.setString(5, s5);
			ps.setString(6, s6);
			ps.setString(7, s7);
			ps.executeUpdate();
			con.close();
			PrintWriter pw = response.getWriter();
			//pw.print(s1+"\t"+s2+"\t"+s3+"\t"+s4+"\t"+s5+"\t"+s6+"\t"+s7);
			pw.println("<html><head>"
					+ "    <meta charset=ISO-8859-1 />"
					+ "    <title>NareshIT</title>"
					+ "    <link rel=stylesheet href=style.css />"
					+ "    <link rel=icon href=nareshITLogo.jpg />"
					+ "  </head><body><h1>Registration Successfull</h1><div class=aligncenter>"
					+ "  <a href=login.jsp  >login</a></div></body></html>");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
