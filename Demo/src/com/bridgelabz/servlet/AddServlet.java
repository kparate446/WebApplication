package com.bridgelabz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.RequestDispatcher;

public class AddServlet extends HttpServlet {// Service--> dopost
	/** 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {// (res)Servlet send the data in responce Object
		int i =Integer.parseInt(req.getParameter("num1"));
		int j =Integer.parseInt(req.getParameter("num2"));
		int k= i+j;
		
		Cookie cookie =new Cookie("k", k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
		/**HttpSession session =req.getSession();
		session.setAttribute("k", k);
		res.sendRedirect("sq");*/
			///res.sendRedirect("sq?k="+k);/** Session Management Url Rewriting*/
		/*req.setAttribute("k",k); // Request to set the Attribute*/
//		System.out.println("Result is:"+k);
//		PrintWriter out =res.getWriter();//getWriter return the Object of Print Writer
//		out.println("Result is:"+k);
		// Request Dispature and redirect
		
		/*RequestDispatcher rd = (RequestDispatcher) req.getRequestDispatcher("sq");
		rd.forward(req, res);*/
		
	}
	

}
