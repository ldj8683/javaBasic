<%@page import="shop.productDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 입력값 서버에서 받아오기 -->
<%
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	String briefing = request.getParameter("briefing");
	String type = request.getParameter("type");
	String price = request.getParameter("price");
	String info = request.getParameter("info");
	
%>
<%
	productDB db = new productDB();
	db.create();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제주어때</title>
</head>
<body>
	<h3>당신이 입력하신 숙소 상세 정보입니다.</h3>
	<hr color="black">
	사장님이 입력하신 이름	: <%= name %><br>
	사장님이 입력하신 주소	: <%= address %><br>
	사장님이 입력하신 간단한 호텔 소개	: <%= briefing %><br>
	사장님이 입력하신 숙소 타입	: <%= type %><br>
	사장님이 입력하신 숙소 가격	: <%= price %><br>
	사장님이 입력하신 숙소 정보	: <%= info %><br>
</body>
</html>