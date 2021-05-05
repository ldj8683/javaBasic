<%@page import="shop.BoardVO"%>
<%@page import="shop.BoardDb"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id");
    	
    	BoardVO bag = new BoardVO();
    	bag.setId(id);
    
    	BoardDb db = new BoardDb();
    	db.delete(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제 완료</title>
</head>
<body>
	<%= id %>님의 게시판의 글 삭제가 완료 되었습니다.
</body>
</html>