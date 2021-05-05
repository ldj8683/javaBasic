package yesterday;

public class BasicDataQuiz02 {
	public static void main(String[] args) {
		// 반지름이 2.2인 원의 면적을 구하는 프로그램
		final double PI = 3.14;	// final을 쓰면 수정이 불가능한 값 => 상수
								// 변경 불가능한 것은 대문자로 변수를 설정한다.
		// 추상적 (abstract) => 명확하지 않고 아직은 불완전하다.
			// 정확하게 알 수가 없으니 클래스로서 가져올수 없게된다.
		// 구현 (implement) => 명확하고 완전하게 만드는 것
		double r = 2.2;
		double area = 0.0;
		area = PI * r * r;
		System.out.printf("원의 면적은 %.4f 입니다.",area);		
		}	
}
