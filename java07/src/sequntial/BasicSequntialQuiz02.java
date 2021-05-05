package sequntial;

public class BasicSequntialQuiz02 {

	public static void main(String[] args) {
		int score = 88; // 지정 데이터

		if (score >= 90) { // 90 이상인지 비교
			System.out.println(score + "점 입니다. A"); // 출력
		} else if (score >= 80) { // 80 이상인지 비교
			System.out.println(score + "점 입니다. B"); // 출력
		} else if (score >= 70) { // 70 이상인지 비교
			System.out.println(score + "점 입니다. C"); // 출력
		} else { // 나머지
			System.out.println(score + "점 입니다. D"); // 출력
		}

	}

}
