package operator;

public class Comparison {

	public static void main(String[] args) {
		// 비교연산자(comparison): == != >= >
		// --> 비교의 결과는 boolean(true/false)
		// 비교연산자는 기본형만 비교 가능하다.!
		//		--> 정수, 실수, 문자1, 논리만 비교가 가능하다
		//		--> String(문자여러개)은 비교연산자로 비교 불가
		int x = 100;
		int y = 200;
		System.out.println(x == y);
		System.out.println(x != y);
	}

}
