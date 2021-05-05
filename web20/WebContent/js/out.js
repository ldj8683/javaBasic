/**
 * 최종 수정 날짜: 2021. 2. 23 
 * 작성자: 홍길동
 * 수정내용: 함수 추가
 */
// 내장된 것들도 있지만 대부분 함수를 만들어서 그것을 중심으로 해서 사용한다.
function site(name) {
	//변수를 선언하지 않아도 됨. var!
	//site = prompt('사이트 명을 입력하세요.')

	if (name == "naver") {
		location.href = "http://www.naver.com"
	} else if (name == "daum") {
		location.href = "http://www.daum.net"
	} else {
		alert('해당 사이트가 없습니다.')
	}
}
function data() {
	s1 = prompt('숫자1 입력')
	s2 = prompt('숫자2 입력')
	
	n1 = parseInt(s1)
	n2 = parseInt(s2)
	
	alert(n1 + n2)
}