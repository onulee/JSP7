package com.java.www.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.do")
public class FController extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		String viewPage = null;
		
		String uri = request.getRequestURI();          // /p0205_02/login.do
		System.out.println("uri : "+uri);
		String contextPath = request.getContextPath(); // /p0205_02
		System.out.println("contextPath : "+contextPath);
		String fileName = uri.substring(contextPath.length()); // /login.do
		System.out.println("fileName : "+fileName);
		
		if(fileName.equals("/login.do")) {
			response.sendRedirect("./login.jsp");
		}else if(fileName.equals("/membership.do")) {
			response.sendRedirect("./membership.jsp");
		}else if(fileName.equals("/logout.do")) {
			response.sendRedirect("./logout.jsp");
		}else if(fileName.equals("/board.do")) {
			response.sendRedirect("./board.jsp");
		}else if(fileName.equals("/member.do")) {
			response.sendRedirect("./member.jsp");
		}
		
	}
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request,response);
	}

}
