<%@page import="shop.MemberDb"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- java 코드 -->
    <%
    	// 입력해서 전송된 데이터를 받아야 한다.
        	String id = request.getParameter("id");
        	    	
        	// db 전담하는 부품에서 db에 넣어달라고 할 예정.
        	MemberDb db = new MemberDb();
        	db.delete(id);
    %>    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>DB Connect</title>
	</head>
	<body>
		<%= id %>가 탈퇴가 완료되었습니다.
	</body>
</html>