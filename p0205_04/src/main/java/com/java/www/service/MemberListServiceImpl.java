package com.java.www.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.MemberDao;
import com.java.www.dto.MemberDto;

public class MemberListServiceImpl implements MemberService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("execute");
		MemberDao mdao = new MemberDao();
		List<MemberDto> list = mdao.memberList();
		request.setAttribute("list", list);
		System.out.println("execute end");
	}

}
