<%@page import="shop.BoardVO"%>
<%@page import="shop.BoardDb"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id");
    	String title = request.getParameter("title");
    	String content = request.getParameter("content");
    	String writer = request.getParameter("writer");
    	
    	//db.create(id, title, content, writer);
    	// 1. 가방을 만들어라
    	BoardVO bag = new BoardVO();
    	// 2. 가방에 넣어라  => set 메서드 이용
    	bag.setId(id);
    	bag.setTitle(title);
    	bag.setContent(content);
    	bag.setWriter(writer);
    	
    	BoardDb db = new BoardDb();
    	db.create(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록 완료</title>
</head>
<body>
	<%= id %>님의 게시판의 글 등록이 완료 되었습니다.
</body>
</html>