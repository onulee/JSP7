package com.java.www.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dto.MemberDto;
import com.java.www.service.MemberList;
import com.java.www.service.MemberService;


@WebServlet("*.do")
public class FController extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		//fileName 검색
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String fileName = uri.substring(contextPath.length());
		String viewPage = "";
		System.out.println("uri : "+uri);
		System.out.println("contextPath : "+contextPath);
		System.out.println("fileName : "+fileName);
		
		//controller 해야할 일: 페이지분기
		switch (fileName) {
		case "/member.do":
			MemberService mService = new MemberList();
			mService.execute(request,response);
			viewPage = "member.jsp";
			break;
		case "/membership.do":
			viewPage = "membership.jsp";
			break;
		case "/board.do":
			viewPage = "board.jsp";
			break;
		case "/bwrite.do":
			viewPage = "bwrite.jsp";
			break;
		
		}
		
		
		//request,response 함께 전송가능
	    RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request,response);
	}

}
