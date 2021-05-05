<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	String title = request.getParameter("title");
    	String content = request.getParameter("content");
    	String writer = request.getParameter("writer");
    %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판 등록 화면</title>
	</head>
	<body>
		<h3>글이 잘 등록 되었습니다.</h3>
		<hr width="1000" color="red">
		당신이 입력한 아이디 : <%= id %><br>
		당신이 입력한 제목 : <%= title %><br>
		당신이 입력한 내용 : <%= content %><br>
		당신이 입력한 지은이 : <%= writer %><br>
		
		<a href="bbs.html">게시판 등록화면으로!</a>
	</body>
</html>