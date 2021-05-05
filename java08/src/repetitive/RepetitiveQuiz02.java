package repetitive;

import java.util.Random;

import javax.swing.JOptionPane;

public class RepetitiveQuiz02 {

	public static void main(String[] args) {
		Random r = new Random();
		int goal = r.nextInt(100) + 1;	// r.nextInt(100)은 0~99중 랜덤하게 숫자를 발생시킨다. 뒤에  +1에 의해서 1~100까지로 범위가 바뀐다.
		int count = 0;
		while (true) {			
			String s1 = JOptionPane.showInputDialog("정답을 찾아보세요");
			int score = Integer.parseInt(s1);
			count++;
			if (goal == score) {
				System.out.println(score + "가/이 정답입니다. 축하합니다!!!\n" + count + "번 만에 맞추셧네요!");
				break;
			} else {				
				if (goal >= score) {
					System.out.println("틀렸습니다. " + score + "은/는 정답보다 작아요 좀더 높은 수를 입력하세요!");
				} else {
					System.out.println("틀렸습니다. " + score + "은/는 정답보다 커요 좀더 낮은 수를 입력하세요!");
				}
			}
		}
	}
}
