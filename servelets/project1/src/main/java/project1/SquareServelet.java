package project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServelet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

//		retreving the data using the session from another servelet.

//		HttpSession session = req.getSession();
//		int k = (int) session.getAttribute("k");

		int k = 0;
		Cookie cookies[] = req.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}

//			PrintWriter out = res.getWriter();
//			out.println("Hello from square");
//			int k=Integer.parseInt(req.getParameter("k"));

		// using the cookies
		k = k * k;
		PrintWriter out = res.getWriter();
		out.print("resuslt is " + k);

		System.out.print("called me");
		;
	}
}
