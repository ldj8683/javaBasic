package operator;

public class Arithmetic {
	
	public static void main(String[] args) {
		// 산술연산자(arithmetic) : 사칙연산 +, -, *, /, % ( 자바에는 // 가 없다)
		// 한줄 복사 : 복사를 원하는 줄로 가고 컨트롤 알트 + 화살표 + 아래
		// 이전것 취소 : 컨트럴 + z
		// 한줄 삭제 : 컨트롤  + 쉬프트 + del
		// 한 단어 삭제 : 컨트롤 + del
		// type을 쓰고 변수를 쓰는 것이 ram에 올라가는 순간으로 선언이라고 한다
		int x = 200;	// x라는 정수형 변수를 만들고 200 이라는 값을 x라는 변수에 대입
		int y = 100;
		
		// 연산 : cpu가 하는 간단한 처리
		// 연산자(기호): 간단한 처리는 코딩상에 기호로 표시
		// int sum --> x + y --> = 	// 선언, 처리, 대입
		int sum = x + y;				
		System.out.println(x + " + " + y + " = " + sum);
		int sub = x - y;
		System.out.println(x + " - " + y + " = " + sub);
		int mul = x * y;
		System.out.println(x + " * " + y + " = " + mul);
		int div = x / y;
		System.out.println(x + " / " + y + " = " + div);
		int odd = x % y;
		System.out.println(x + " % " + y + " = " + odd);
		
		
	}

}
