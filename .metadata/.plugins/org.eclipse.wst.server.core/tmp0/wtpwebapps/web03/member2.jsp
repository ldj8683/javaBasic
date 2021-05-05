<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="shop.OnlyDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 입력한 값을 서버에서 받아 와야함 -->
<%
	// HttpServletRequest request = new HttpServletRequest();
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	String company = request.getParameter("company");
	String gender = request.getParameter("gender");
	// 서버에서 받아올 값이 여러개인 경우 다르게 처리해주어야한다 -> getParameterValues -> 배열이다
	String[] hobby = request.getParameterValues("hobby");
	String result = "";
	for(String x: hobby){
		result = result + x + " ";
	}
	String word = request.getParameter("word");
%>
<!-- 입력한 값 db 처리를 전담하는 클래스한테 create 하라고 명령 -->
<%
	OnlyDB db = new OnlyDB();
	db.create();
%>
<!-- 회원 가입 처리 결과를 알려줌. 클라이언트: html -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>당신의 회원 정보를 확인해 주세요.</h3>
<hr color="red">
당신이 입력한 id: <%= id %> <br>
당신이 입력한 pw: <%= pw %> <br>
당신이 입력한 name: <%= name %> <br>
당신이 입력한 tel: <%= company %> <%= tel %> <br>
당신이 입력한 gender: <%= gender %><br>
당신이 입력한 hobby: <%= result %><br>
당신이 입력한 word: <%= word %><br>
</body>
</html>