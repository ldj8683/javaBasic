<%@page import="shop.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.BoardDb"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	BoardDb db = new BoardDb();
	ArrayList<BoardVO> list = db.list();
%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판 검색</title>
	</head>
	<body>
		<table>
		<%
			for(int i = 0; i < list.size(); i++){ // 저장된 수만큼 반복
				BoardVO bag2 = list.get(i);	// 가방생성
		%>				
					<tr>
						<td>
							<%= bag2.getId() %>
						</td>
						<td>
							<%= bag2.getTitle() %>
						</td>
						<td>
							<%= bag2.getContent()%>
						</td>
						<td>
							<%= bag2.getWriter() %>
						</td>
					</tr>				
		<% } %>
		</table>
		
		<hr>
		
		<table>
		<%
			for(int j = list.size()-1 ; j >= 0 ; j--){ // 저장된 수만큼 반복
				BoardVO bag2 = list.get(j);	// 가방생성
		%>				
					<tr>
						<td>
							<%= bag2.getId() %>
						</td>
						<td>
							<%= bag2.getTitle() %>
						</td>
						<td>
							<%= bag2.getContent()%>
						</td>
						<td>
							<%= bag2.getWriter() %>
						</td>
					</tr>				
		<% } %>
		</table>
	</body>
</html>