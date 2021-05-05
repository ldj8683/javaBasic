<%@page import="loginTest.memberVO"%>
<%@page import="loginTest.memberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	memberDB db = new memberDB();
	memberVO bag = db.read(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴 화면</title>
</head>
<body>
	<h2>회원을 탈퇴합니다.</h2>
	<hr color="red">
		<div>
			<form action="dbConnect3.jsp?id=<%= bag.getId() %>">
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
							이름 >>
						</th>
						<td style="text-align: left;">
							<input type="text" name="name" value="<%= bag.getName()%>"  readonly="readonly">
						</td>
					</tr>
					<tr>
						<th style="text-align: right;">
							전화번호 >>
						</th>
						<td style="text-align: left;">
							<input type="text" name="tel" value="<%= bag.getTel()%>"  readonly="readonly">
						</td>
					</tr>
					<tr>
						<td colspan="2" style="text-align: right;">
							정말 탈퇴 하시겠습니까?
						</td>				
					</tr>
					<tr>
						<td colspan="2" style="text-align: right;">
							<button type="submit">삭제</button>
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