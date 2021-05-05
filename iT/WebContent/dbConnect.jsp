<%@page import="loginTest.memberDB"%>
<%@page import="loginTest.memberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	
	memberVO bag = new memberVO();
	bag.setId(id);
	bag.setPw(pw);
	bag.setName(name);
	bag.setTel(tel);
	
	memberDB db = new memberDB();
	db.create(bag);
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입완료</title>
</head>
<body>
	<h2>화원가입 확인 화면입니다.</h2>
	<hr color="red">
	<%= id %>님의 회원가입이 완료 되었습니다.
	<a href="login.jsp?id=<%= bag.getId() %>">
		<button>돌아가기</button>
	</a>
</body>
</html>