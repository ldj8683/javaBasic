<%@page import="loginTest.memberDB"%>
<%@page import="loginTest.memberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String id = request.getParameter("id");
	
	
	memberDB db = new memberDB();
	memberVO bag = db.read(id);
	db.delete(id);	
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>탈퇴 완료</title>
</head>
<body>
	<h2>탈퇴 확인 화면입니다.</h2>
	<hr color="red">
	<%= id %>님의 회원 탈퇴가 완료 되었습니다.
	<a href="login.jsp?id=<%= bag.getId() %>">
		<button>돌아가기</button>
	</a>
</body>
</html>