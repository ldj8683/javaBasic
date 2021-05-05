package sequntial;

public class ControlQuiz03 {
	public static void main(String[] args) {
		// 입력한 암호와 몸무게 변화에 대한 결과
		char pw1 = 'p';
		char pw2 = 'p';
		double weight = 2.2;
		// 두가지의 조건을각각 비교해서 둘다 참/거짓 여부를 확인하려면 논리연산자가 필요하다.
		// 논리연산사: &&, ||, !
		if ((pw1 == pw2) && (weight > 2)) {
			System.out.println("오늘은 성공!");			
		} else {
			System.out.println("내일 다시 도전!");
		}// else end
	}// main end
}// class end
