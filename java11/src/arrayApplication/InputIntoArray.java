package arrayApplication;

import javax.swing.JOptionPane;

public class InputIntoArray {
	public static void main(String[] args) {
		String[] s = new String[3];	// String은 기본형이 아니기 때문에 null로 초기화가 된다. --> {null, null, null}
		
		// 입력을 받아서 배열에 넣음
		for (int i = 0; i < s.length; i++) {
			s[i] = JOptionPane.showInputDialog("가고싶은 장소를 입력하세요.");
		}
		
		// 넣은 데이터를 출력
		for (String x : s) {
			System.out.print(x + " ");			
		}
		
		// 배열 안에 제주도가 있는지를 확인
		for (int i = 0; i < s.length; i++) {
			if ( s[i].equals("제주도") ) { // 저장된 데이터가 기본형이 아닌 String 이기 때문에 equals 함수를 이용해서 비교
				// 참조형에서 ==(논리연산자)를 쓰면 주소를 비교하는것이다.
				// 주소가 가르키는 값을 비교하고 싶다면 그 부품에서 제공하는 명령어를 가지고 써야한다.
				// String 이 가장 많이 사용되기때문에 equals()를 많이 사용하게 될것이다. --> String은 equals로 값을 비교한다.
				System.out.println("제주도가 있음.");
				System.out.println("위치는 " + i + "에 있습니다.");
			}
			
		}
	}	
}
