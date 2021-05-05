package arrayApplication;

import java.util.Random;

public class ToeicScoring {

	public static void main(String[] args) {
		// 문제 990 답안, 내답
		Random r = new Random(42);

		int[] answer = new int[990];
		int[] myAnswer = new int[990];
		// 1~4까지의 값을 두 배열에 넣어보세요
		for (int i = 0; i < myAnswer.length; i++) {
			answer[i] = r.nextInt(4) + 1; // 1~4
			myAnswer[i] = r.nextInt(4) + 1;
			//myAnswer[i] = 3;
		}

		// print
		System.out.println("번호	:  답안 <-> 내답");
		System.out.println("------------------------");
		for (int i = 0; i < myAnswer.length; i++) {
			System.out.println((i + 1) + "	:  " + answer[i] + "  <->  " + myAnswer[i]);
		}

		// 채점
		int score = 0;
		for (int i = 0; i < myAnswer.length; i++) {
			if (answer[i] == myAnswer[i]) {
				score++;
			}
		}
		System.out.println("토익 채점 결과 점수는 : " + score + "점 입니다.");
	}

}
