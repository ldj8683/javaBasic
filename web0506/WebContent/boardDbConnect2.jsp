<%@page import="shop.BoardVO"%>
<%@page import="shop.BoardDb"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id");
    	String title = request.getParameter("title");
    	String content = request.getParameter("content");
    	
    	BoardVO bag = new BoardVO();
    	bag.setId(id);
    	bag.setTitle(title);
    	bag.setContent(content);
    	
    	BoardDb db = new BoardDb();
    	db.update(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정 완료</title>
</head>
<body>
	<%= id %>님의 게시판의 글 수정이 완료 되었습니다.
</body>
</html>