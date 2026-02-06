package com.java.www.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.www.dao.BoardDao;

public class BInsertServiceImpl implements BoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {e.printStackTrace();}
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("session_id");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		String bfile = request.getParameter("bfile");
		
		// insert,update,delete -> return없음 / select -> return있음.
		BoardDao bdao = new BoardDao();
		bdao.boardInsert(id,btitle,bcontent);
		request.setAttribute("flag", 1);

	}

}
