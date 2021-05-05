<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 삭제</title>
</head>
<body>
	<h2>등록된 책 삭제하는 화면 입니다.</h2>
	<hr color="red">
	<form action="delete.jsp"> <!-- 아래 삭제 버튼을 누르면 form 안의 데이터들이 delete.jsp로 넘어감` -->
		<table> <!-- 테이블 생성 -->
			<tr> <!-- 테이블의 한줄 생성 -->
				<td style="text-align: right;">책 이름</td> <!-- 오른쪽 정렬을 한 테이블 데이터 셀 생성 -->
				
				<td style="text-align: left;">	<!-- 왼쪽 정렬을 한 테이블 데이터 셀 생성 -->
					<input name="title" type="text"> <!-- title이라는 이름을 가진 입력창 생성 -->
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: right;"> <!-- 2열을 합병한 오른쪽 정렬 td 생성 -->
					<button type="submit">삭제</button>	<!-- form형식에서 데이터를 넘길때 사용할 버튼 -->
				</td>
			</tr>
		</table>
	</form>
</body>
</html>