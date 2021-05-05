package operator;

import javax.swing.JOptionPane;

public class Logical {

	public static void main(String[] args) {
		// 논리연산자(logical): &&(그리고,and), ||(또는,or), !(not)
		int id1 = 1000;
		int id2 = 2000;
		int pw1 = 2222;
		int pw2 = 2222;
		System.out.println(id1 == id2 && pw1 == pw2);
		if (id1 == id2 && pw1 == pw2) {
			JOptionPane.showMessageDialog(null, "로그인 성공함.");
		} else {
			// jop + 컨트롤 + 스페이스바
			JOptionPane.showMessageDialog(null, "로그인 실패함.");
		}
	}

}
