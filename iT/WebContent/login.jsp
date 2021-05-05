<%@page import="loginTest.memberVO"%>
<%@page import="loginTest.memberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	/* memberDB db = new memberDB();
	memberVO bag = db */
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지 입니다.</title>
</head>
<body>
	<h2>로그인 화면입니다.</h2>
	<hr color="red">	
	<% if(session.getAttribute("id") == null) { %>
		<div>
			<form action="check.jsp">
				<table>
					<tr>
						<th style="text-align: right;">
							아이디 >>
						</th>
						<td style="text-align: left;">
							<input type="text" name="id">
						</td>
					</tr>
					<tr>
						<th style="text-align: right;">
							패스워드 >>
						</th>
						<td style="text-align: left;">
							<input type="text" name="pw">
						</td>
					</tr>
					<tr>
						<td colspan="2" style="text-align: right;">
							<button type="submit">로그인</button>
						</td>				
					</tr>
				</table>
			</form>
		</div>
		<div style="padding-left: 182px;">
			<a href="memberRegister.jsp">
				<button>회원 가입</button>
			</a>
		</div>
	<% } else { %> 
		<%= session.getAttribute("id") %> 님 환영합니다.<br>
		<table>
			<tr>
				<td>
					<a href="memberUpdate.jsp?id=<%= session.getAttribute("id") %>">
						<button type="button">정보 수정</button>
					</a>
				</td>
				<td>
					<a href="memberDelete.jsp?id=<%= session.getAttribute("id") %>">
						<button type="button">정보 삭제</button>
					</a>
				</td>
				<td>
					<a href="logout.jsp">
						<button type="button">로그 아웃</button>
					</a>
				</td>
			</tr>
		</table>
	<% } %>
	</body>
</html>