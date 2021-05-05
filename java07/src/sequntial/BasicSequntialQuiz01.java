package sequntial;

import javax.swing.JOptionPane;

public class BasicSequntialQuiz01 {

	public static void main(String[] args) {
		// 구매항목을 입력받고, vip의 yes/no를 입력받는다.
		// 입력받은 데이터를 정해진 출력문 출력, vip는 1000원을 할인해주는 프로그램
		int money = 5000;
		String item = JOptionPane.showInputDialog("구매항목: "); // 구매항목 입력

		if (item.equals("과자")) { // 입력받은 변수에 과자가 들어있는지 비교
			JOptionPane.showMessageDialog(null, "어린아이군요!"); // 메세지창에 내용을 넣고 출력
		} else if (item.equals("라면")) { // 입력받은 변수에 라면이 들어있는지 비교
			JOptionPane.showMessageDialog(null, "성인이군요!"); // 메세지창에 내용을 넣고 출력
		} else { // 입력받은 변수에 과자와 라면을 제외한 나머지
			JOptionPane.showMessageDialog(null, "무었인가를 샀군요!"); // 메세지창에 내용을 넣고 출력
		}

		String vip = JOptionPane.showInputDialog("VIP 이십니까?(yes/no)"); // yes/no 입력
		int discount = 1000; // 할인금액
		int total = money - discount; // 할인된 가격
		String vipYes = "VIP이시군요! 1000원이 할인됩니다!\n" + total + "원을 결제하세요!"; // 메세지박스에 넣을 문자열
		String vipNo = "VIP가 아니시군요... 구매금액을 모두 결제해주세요."; // 메세지박스에 넣을 문자열
		if (vip.equals("yes")) { // vip에 yes가 들어있는지
			JOptionPane.showMessageDialog(null, vipYes); // yes일 경우 출력
		} else { // vip에 yes가 아닌 나머지
			JOptionPane.showMessageDialog(null, vipNo); // 메시지박스 출력
		}

	}

}
