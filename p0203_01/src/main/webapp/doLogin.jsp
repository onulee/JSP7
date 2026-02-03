<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인확인</title>
	</head>
	<body>
	  <!-- 스크립트릿,표현식,선언식,지시자,주석,액션태그 -->
	  <%--  : jsp주석 
	      <% %> : 스크립트릿
	      <%= %> : 표현식
	      <%! %> : 선언식
	      <%@ %> : 지시자
	      
	      request.getParameter : 1개 데이터 받기
	      getParameterValues : checkbox 여러개 받기
	  --%>
	  
	  <h2>로그인결과</h2>
	  <p>아이디 :  <%= request.getParameter("id") %></p>
	  <p>패스워드 : <%= request.getParameter("pw") %> </p>
	  
	
	</body>
</html>