<%@page import="loginTest.memberVO"%>
<%@page import="loginTest.memberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	/* String pw = request.getParameter("pw:");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel"); */

	
	memberDB db = new memberDB();
	memberVO bag = db.read(id);
	
	/* memberVO bag2 = new memberVO();
	bag2.setId(id);
	bag2.setPw(pw);
	bag2.setName(name);
	bag2.setTel(tel);
	memberDB db2 = new memberDB();
	db2.update(bag2); */
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
</head>
<body>
	<h2>회원정보 수정화면 입니다.</h2>
	<hr color="red">
		<%-- <% if(session.getAttribute("id") == null) { %> --%>
		<div>
			<form action="dbConnect2.jsp?id=<%= bag.getId() %>">
				<table>
					<tr>
						<th style="text-align: right;">
							아이디 >>
						</th>
						<td style="text-align: left;">
							<input type="text" name="id" value="<%= bag.getId()%>" readonly="readonly">
						</td>
					</tr>
					<tr>
						<th style="text-align: right;">
							패스워드 >>
						</th>
						<td style="text-align: left;">
							<input type="text" name="pw" value="<%= bag.getPw()%>">
						</td>
					</tr>
					<tr>
						<th style="text-align: right;">
							이름 >>
						</th>
						<td style="text-align: left;">
							<input type="text" name="name" value="<%= bag.getName()%>">
						</td>
					</tr>
					<tr>
						<th style="text-align: right;">
							전화번호 >>
						</th>
						<td style="text-align: left;">
							<input type="text" name="tel" value="<%= bag.getTel()%>">
						</td>
					</tr>
					<tr>
						<td colspan="2" style="text-align: right;">
							<button type="submit">회원 정보 수정</button>
						</td>				
					</tr>
				</table>
			</form>
		</div>
		<div style="padding-left: 182px;">
			<a href="login.jsp?id=<%= bag.getId() %>">
				<button>돌아가기</button>
			</a>
		</div>
</body>
</html>