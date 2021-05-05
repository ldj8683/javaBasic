package control;

import javax.swing.JOptionPane;

public class Iteration_quiz {

	public static void main(String[] args) {
		// 순차문 정리 문제
		// 당신의 취미 : 골프(입력)
		// 당신의 여행지 : 제주도(입력)
		// 당신은 제주도로 골프를 즐기러 간다.(출력)
		String hobby = JOptionPane.showInputDialog("당신의 취미? >> ");
		String place = JOptionPane.showInputDialog("당신의 여행지? >> ");
		
		String result = "당신은 " + place + "로 " + hobby + "를 즐기로 간다.";
		
		// null의 부분은 어디에 뜰 것인지를 나타내는 것
		JOptionPane.showMessageDialog(null, result);
	}

}
