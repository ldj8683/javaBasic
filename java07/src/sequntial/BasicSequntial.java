package sequntial;

import javax.swing.JOptionPane;

public class BasicSequntial {

	public static void main(String[] args) {
		// 입력 -> 처리 -> 출력
		// 입력해주는 부분
		String food
			= JOptionPane.showInputDialog("먹고싶은 점심 메뉴는");
		// showInputDialog는 해당 내용이 들어가 있는 윈도우 창을 띄우고
		// 입력받은 정보를 가지고 오는 것 까지를 한다.
		// String food 라고 선언된 food 변수에 = 을 사용해서 대입한다.
		// System.out.println(food);

		// 처리해주는 부분
		String result = "";
		// 문자열인 경우에 비교를 할 때는 함수 기능을 사용한다.
		// if~else if~else 문은 true인 경우 실행을 하고 거기서 break를 해준다.
		if (food.equals("짬뽕")) {
			result = "중식집으로 갑시다.";
		}else if (food.equals("우동")){
			result = "일식집으로 갑시다.";
		}else if (food.equals("라면")) {
			result = "분식집으로 갑시다.";
		}else {
			result = "집으로 갑시다.";
		}
		
		// 출력해주는 부분
		JOptionPane.showMessageDialog(null, result);
	}

}
