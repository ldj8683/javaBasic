package control;

import javax.swing.JOptionPane;

public class Iteration {

	public static void main(String[] args) {
		// 순차문(iteration)
		// 입력
		// String은 기본 데이터 타입이 아니라 부품이기 때문에 대문자를 써준다.
		// 데이터를 입력하면 JOptionPane까지 가져와지고 그것을 name에 대입해준다.
		String name = JOptionPane.showInputDialog("이름을 입력하세요");
		
		// 처리
		String result = name + "님 환영합니다.";
		
		// 출력
		JOptionPane.showMessageDialog(null, "이곳은 실행 결과 출력하는 곳입니다.\n" + result);

	}

}
