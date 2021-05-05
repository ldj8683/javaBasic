<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 등록</title>
</head>
<body>
	<h2>책을 등록하는 화면입니다.</h2> <!-- heading를 생성 -->
	<hr color="red"> <!-- 빨간색 줄을 생성 -->
	<form action="insert.jsp"> <!-- 버튼을 눌렀을 때 insert.jsp로 넘기는 form을 생성 -->
		<table> <!-- 테이블 생성 -->
			<tr> <!-- 테이블에 한 줄을 생성 -->
				<td style="text-align: right">아이디 >></td>
					<!-- 생성된 한 줄에 하나의 데이터 셀을 생성, 오른쪽 정렬 --> <!-- /td는 데이터셀을 닫아준다는 의미 -->				
				<td style="text-align: left">	<!-- 생성된 한 줄에 하나의 데이터 셀을 생성, 왼쪽 정렬 -->
					<input name = "id" type="text">
							<!-- id라는 이름을 가진 입력하는 창을 생성, 나중에 넘겨줄때 id=입력값 과 같은 형식으로 넘겨줌 -->
				</td> <!-- 데이터셀을 닫아줌 -->
			</tr> <!-- 테이블에 한줄 생성한 것을 닫아줌, 테이블 한줄 완성-->
			<tr>
				<td style="text-align: right">책 이름 >></td>				
				<td style="text-align: left">
					<input name = "title" type="text">
				</td>
			</tr>
			<tr>
				<td style="text-align: right">책 내용 >></td>
				<td style="text-align: left">
					<input name = "story" type="text">
				</td>
			</tr>
			<tr>
				<td style="text-align: right">출판사 >></td>
				<td style="text-align: left">
					<input name = "company" type="text">
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: right"> <!-- 2열을 합병한 테이블 데이터 셀을 생성 -->
					<button type="submit">책 등록</button>	
							<!-- 버튼을 생성, 버튼을 누르게되면 form 내부에서 입력받은 데이터를 insert.jsp로 전송 -->
				</td>
			</tr>
		</table>
	</form>
</body>
</html>