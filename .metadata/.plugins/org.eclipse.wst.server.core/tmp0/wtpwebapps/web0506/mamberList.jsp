<%@page import="shop.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.MemberDb"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	MemberDb db = new MemberDb();
	ArrayList<MemberVO> list = db.list();
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	for(int i = 0; i < list.size(); i++){ // 저장된 수만큼 반복
		MemberVO bag2 = list.get(i);	// 가방생성
%>
	<%= bag2.getId() %>,<%= bag2.getPw() %>, <%= bag2.getName() %>, <%= bag2.getTel() %><br> <!-- 브라우저 출력부분 -->

<% } %>

</body>
</html>