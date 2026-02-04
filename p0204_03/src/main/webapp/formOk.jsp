<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>결과</h2>
		<% // post방식 = setCharacterEncoding() 한글처리
		   request.setCharacterEncoding("utf-8");
		  int i = 10;
		  out.println(i+100+"<br>");
		%>
		<!-- jsp태그랑 함께 사용할수 없음. jstl태그를 사용하게 됨. -->
		<p>el태그 사용 : ${ param.title }</p>
		<p>el태그 사용 : ${ param.name }</p>
		<p>el태그 session 이름만 : ${ session_id }</p>
		<p>el태그 cookie : ${ cookie.cookie_id.value }</p>
		
		<p>el태그 session : ${ sessionScope.session_id }</p>
		<p>변수선언 i : ${i}</p>
		
		<p>---------------------------------------</p>
		
		<p>jsp request : <%= request.getParameter("title") %></p>
		<p>jsp request : <%= request.getParameter("name") %></p>
		<p>jsp 섹션 : <%= session.getAttribute("session_id") %></p>
		<p>jsp 쿠키 : 
			<%
			  Cookie[] cookies = request.getCookies();
			  for(Cookie cookie:cookies){
				  out.println("쿠키 : "+cookie.getValue()+"<br>");
			  }
			%>
		</p>
		
		
		<p><%= i+100 %></p>
	
	</body>
</html>