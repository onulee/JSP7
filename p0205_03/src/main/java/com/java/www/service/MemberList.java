package com.java.www.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.MemberDao;
import com.java.www.dto.MemberDto;

public class MemberList implements MemberService {
	public void execute(HttpServletRequest request,HttpServletResponse response) {
		List<MemberDto> list = new ArrayList<MemberDto>();
		MemberDao mdao = new MemberDao();
		list = mdao.memberList();
		System.out.println("MemberList service : "+list.size());
		request.setAttribute("list", list); //객체1개
	}

}
