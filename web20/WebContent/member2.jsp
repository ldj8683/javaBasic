<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript">
		function check(){
		// 아이디에 입력한 값을 가지고 와야 함
			// body 부분에 있을때 가져오는 방법
			// 태그 추출
			idTag = document.getElementById('id')
			// value값 추출
			idValue = idTag.value
			console.log('입력한 id는 ' + idValue)
				
		// 글자 길이가 어떻게 되는지 처리해야함
		}
		
		function check2() {
			idTag = document.getElementById('pw')
			idValue = idTag.value
			console.log('입력한 pw는 ' + idValue)
		}
	</script>
</head>
<body>
	<!-- name은 파라미터 넘길때 사용하기 위해 쓴다. id는 이 하나만 지정하고 싶을 때 사용한다. value는 그 안에 들어있는값을 의미 -->
	<!-- name은 서버에서, id는 클라이언트에서  사용하기 위해서-->
	아이디 : <input type="text" name = "id" id="id" value='root'><br>
	<button type="button" onclick="check()">아이디 길이 체크</button>
	<br>
	패스워드 : <input type="text" name = "id" id="pw"><br>
	<button type="button" onclick="check2()">패스워드 길이 체크</button>
</body>
</html>