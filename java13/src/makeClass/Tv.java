package makeClass;

public class Tv {
	// 클래스 이름은 대문자로 시작해야함
	// 낙타표기법을 지키자

	// 성질(속성, property, attribute) ==> (멤버)변수
	// 멤버변수는 틀이기 때문에 특수한 경우를 제외하고는 넣지않는다. --> 선언만 해준다.
	// 특수한 경우란 예를들어 회사이름과 같이 모두 다 적용을 할 것은 변수에 데이터를 넣는다.
	// 멤버 변수는 자동 초기화가 된다.
	String color = ""; // 참조형은 무조건 null로 초기화
	int size;	// 기본형(정수형)은 0으로 초기화

	// 동작(함수, 기능처리, 명령어) ==> 메서드, method (방법, 다른 언어에서는 함수라 함)
	// (멤버)메서드(method) : 어떠한 기능을 처리하기 위한 방법을 정의
	public void on() {
		// 함수 이름은 소문자로 시작한다.
		System.out.println("TV를 켜다.");
	}

	public void off() {
		System.out.println("TV를 끄다.");
	}

	public void ch() {
		System.out.println("TV채널을 바꾸다.");
	}
}
