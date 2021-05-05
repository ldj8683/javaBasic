<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String money = request.getParameter("money");
	String choice = request.getParameter("choice");
	int moneyInt = Integer.parseInt(money);
	int choiceInt = Integer.parseInt(choice);
	if(choiceInt == 1){
		moneyInt = moneyInt * 8 / 10;
	} else if(choiceInt == 2){
		moneyInt = moneyInt * 9 / 10;
	} else if(choiceInt == 3){
		moneyInt = moneyInt * 1;
	} else {
		choice = "잘못 입력하셧습니다.";
	}
	
%>결제 금액 계산해서 넘길 예정임!!! <%= moneyInt %>원, 선택번호 <%= choice %>