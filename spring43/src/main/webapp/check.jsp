<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
	
    String tel = request.getParameter("tel");
    String result="";
    String sub = tel.substring(3);
    int subInt = Integer.parseInt(sub);
    int subF = Integer.parseInt(sub.substring(0,1));
    int subDiv = (int)(subInt / subF);
    result = result + subDiv;
    
    Random r = new Random();
    int plus = r.nextInt(900) + 100;
    result = result + subDiv + plus;
%><%= result %>