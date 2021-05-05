package repetitive;

public class RepetitiveFor {

	public static void main(String[] args) {
		// 반복문 
		// for(시작값;조건식;증감식){}
		// 시작값 -> 조건식 -> 코드 -> 증감식
		for(int i = 0; i < 5; i++) {	// 파이썬에서 range(0:5) 와 같은 의미
			System.out.println("나는 " + i + "번 프로그래머.");
		}
		
		for(int j = 1; j <= 100; j++) {
			System.out.println(j);
		}

	}

}
