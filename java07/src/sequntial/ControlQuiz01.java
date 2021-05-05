package sequntial;



public class ControlQuiz01 {

	public static void main(String[] args) {
		// 암호를 입력받아 참 거짓 판별
		final char pw1 = 'p';
		char pw2 = 'q';
		
		// 비교연산자는 기본형만 쓸 수 있다.
		if (pw1 == pw2) {	//true
			System.out.println("PASS!");
		} else {			//false
		System.out.println("재입력!");
		}

	}

}
