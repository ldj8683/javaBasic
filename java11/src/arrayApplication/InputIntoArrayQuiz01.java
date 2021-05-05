package arrayApplication;

import javax.swing.JOptionPane;

public class InputIntoArrayQuiz01 {

	public static void main(String[] args) {
		String[] s1 = new String[3];
		String[] s2 = new String[3];

		// 입력
		// 작년에 가고 싶었던 곳
		for (int i = 0; i < s1.length; i++) {
			s1[i] = JOptionPane.showInputDialog("작년에 가고 싶었던 곳을 입력하세요.");
		}
		// 올해 가고 싶었던 곳
		for (int i = 0; i < s2.length; i++) {
			s2[i] = JOptionPane.showInputDialog("올해에 가고 싶었던 곳을 입력하세요.");
		}

		// 확인하기 위한 출력
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s1[i] + " " + s2[i]);
		}

		int count = 0;
		// 처리(if문), 출력(println)
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s2[j].equals(s1[i])) {
					count++;
					System.out.println("일치하는 장소는 " + s2[j] + "입니다.");
				}
			}
		}
		System.out.println("같은 위치의 개수는 " + count);
	}
}
