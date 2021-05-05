
<%@page import="shop.BoardDb"%>
<%@page import="shop.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id");
    	   	
    
    	BoardDb db = new BoardDb();
    	BoardVO bag = db.read(id); //
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
	검색된 title : <%= bag.getTitle() %><br>
	검색된 content : <%= bag.getContent() %><br>
	검색된 writer : <%= bag.getWriter() %><br>
</body>
</html>
