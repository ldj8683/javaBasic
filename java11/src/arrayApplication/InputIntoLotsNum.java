package arrayApplication;

import javax.swing.JOptionPane;

public class InputIntoLotsNum {

	public static void main(String[] args) {
		int[] num = new int[3]; // {0, 0, 0}
		// 입력
		for (int i = 0; i < num.length; i++) { // 배열에 저장공간의 수만큼 for문 반복
			String data = JOptionPane.showInputDialog("점수를 입력하세요 : "); // 데이터를 입력받아서 문자열 변수 data에 저장"100"
			// Integer.parseInt() 는 입력된 String 값을 int 형으로 캐스팅해줍니다.
			// Double.parseDouble() 실수로 캐스팅할 경우에 사용합니다.
			int data2 = Integer.parseInt(data); // 입력받은 String 데이터를 int형 데이터로 캐스팅 해준다. 100 <-- "100"
			num[i] = data2; // 캐스팅된 정수형 데이터를 num 배열에 넣는다
		}

		// 확인을 하기 위해서 출력
		for (int x : num) {
			System.out.print(x + " ");
		}

		// 처리
		int sum = 0; // 변수를 만들어서 처음값을 넣어주는 것 => 초기화!
		// 변수만들 때 초기화를 꼭 해주어야 한다.
		// 초기화 되지 않는 변수의 상태를 쓰레기값이 들어가 있는 상태라고 한다.

		for (int x : num) { // num 배열 안에 있는 데이터를 모두 확인해줌
			sum += x; // 배열안에 있는 모든 수를 합한다.
		}

		// 출력
		System.out.println("\n===============");
		System.out.printf("%.2f\n", (double) sum / num.length);
		System.out.println(String.format("%.2f", (double) sum / num.length));
	}

}
