<%@page import="loginTest.memberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	memberDB db = new memberDB();
	boolean result = db.check(id, pw);	
	
	if(result){
		session.setAttribute("id", id);
	}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인 확인 결과입니다.</h2>
	<hr color="red">	
	로그인 결과는 <%= result %> 입니다.<br>
	<a href="login.jsp">
		<button>돌아가기</button>
	</a>
</body>
</html>