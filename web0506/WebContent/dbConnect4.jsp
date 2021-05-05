
<%@page import="shop.MemberVO"%>
<%@page import="shop.MemberDb"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id");
    	   	
    
    	MemberDb db = new MemberDb();
    	MemberVO bag = db.read(id); //
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색 완료</title>
</head>
<body>
	<%= id %>님의 게시판의 글 검색이 완료 되었습니다.
	<hr><!-- 표현식, expression -->
	검색된 id : <%= bag.getId() %><br>
	검색된 pw : <%= bag.getPw() %><br>
	검색된 name : <%= bag.getName() %><br>
	검색된 tel : <%= bag.getTel() %><br>
</body>
</html>
