<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판 등록</title>
	</head>
	<body>
		<h2>게시판 등록 화면입니다.</h2>
		<hr color="red">
		<!-- form태그는 값을 입력하고 싶을 때 사용 -->
		<!-- 입력값들은 모두 form들어가야 한다. -->
		<!-- action: 입력값을 받아서 처리하는 다음 페이지를 지정 -->
		<form action="boardDbConnect.jsp">			
			아이디: <input name="id"><br>
			제목: <input name="title"><br>
			<table>
				<tr>
					<td>
						내용:
					</td>
					<td>
						<textarea rows="10" cols="30" name="content"></textarea><br>
					</td>
				</tr>
			</table>				
			글쓴이: <input name="writer"><br>
			<button>게시판 등록</button>				
		</form>
	</body>
</html>