<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript" src='js/out.js'></script> <!-- 텍스트중 자바 스크립트를 쓰겠다는 의미 --> 
		<script type="text/javascript">
			//site()
			/* site('naver') */
			//data()
			function cal() {
				//alert('나는 계산기 기능이에여')
				console.log('나는 계산기 기능이에요..') // 브라우저의 f12의 콘솔에서 볼 수 있다.
			}
		</script>
	</head>
	<body>
		<button type="button" onclick="site('naver')">네이버 사이트로 이동해 보자.</button><br>
		<button type="button" onclick="site('daum')">다음 사이트로 이동해 보자.</button><br>
		<button type="button" onclick="cal()">계산기 기능을 사용해보자.</button>
	</body>
</html>