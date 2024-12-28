package project1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServelet extends HttpServlet {
//public void service(HttpServletRequest req,HttpServletResponse res) {
//public void doPost(HttpServletRequest req,HttpServletResponse res) {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

//	try {
//		res.getWriter().println("the sum of the values is  "+(i+j));
//	  } catch (IOException e) {
//		e.printStackTrace();
//	  }

		int k = i + j;

		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);

//  data transfer between the servelets using the sesssion 
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);

//		res.sendRedirect("square");
		res.sendRedirect("parameters");

//	 res.sendRedirect("square?k="+k);//session management this is called url re-writing

//	RequestDispatcher rd=req.getRequestDispatcher("square");
//	rd.forward(req, res);
//	
	}
}
