package project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParametersServlet extends HttpServlet {
	
	//servelet-context and servelet-config
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter obj = resp.getWriter();
	obj.println("hi there <br> are you coming in the name of prince of peace and the lord of lords");
	
	ServletContext ctx = getServletContext();
	String str = ctx.getInitParameter("Phone");
	obj.println("  "+str);
	
	String str1 =ctx.getInitParameter("Name");
	obj.println(" "+str1);
	
}
}
