package repetitive;

import javax.swing.JOptionPane;

public class RepetitiveQuiz03 {

	public static void main(String[] args) {
		char dep = ' ';
		char pos = ' ';
		int num = 0;
		String s1 = JOptionPane.showInputDialog("사원번호를 입력하세요.");
		dep = s1.charAt(0);
		pos = s1.charAt(1);
		//num = Integer.parseInt((s1.charAt(2)+s1.charAt(3)));
	}

}
