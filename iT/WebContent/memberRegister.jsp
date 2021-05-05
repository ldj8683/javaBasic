<%@page import="loginTest.memberVO"%>
<%@page import="loginTest.memberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 등록화면입니다.</title>
</head>
<body>
	<h2>회원정보 등록 화면입니다.</h2>
	<hr color="red">	
	<div>
		<form action="dbConnect.jsp">
			<table>
				<tr>
					<td style="text-align:right;">
						아이디 >> 
					</td>
					<td style="text-align:left;">
						<input name="id">
					</td>
				</tr>
				<tr>
					<td style="text-align:right;">
						패스워드 >> 
					</td>
					<td style="text-align:left;">
						<input name="pw">
					</td>
				</tr>
				<tr>
					<td style="text-align:right;">
						name >> 
					</td>
					<td style="text-align:left;">
						<input name="name">
					</td>
				</tr>
				<tr>
					<td style="text-align:right;">
						전화번호 >> 
					</td>
					<td style="text-align:left;">
						<input name="tel">
					</td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: right;">
						<button type="submit">회원가입</button>
					</td>				
				</tr>
			</table>
		</form>
	</div>
	<div style="padding-left: 184px;">
		<a href="login.jsp">
			<button>돌아가기</button>
		</a>
	</div>
</body>
</html>