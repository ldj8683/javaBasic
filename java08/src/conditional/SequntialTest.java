package conditional;

import javax.swing.JOptionPane;

public class SequntialTest {
	public static void main(String[] args) {
		// 1. 어떤것을 입력받아서, 1~2개 입력 받음
		// 2. 간단한 처리
		// 3. 처리 결과를 출력

		// 입력
		// 뭐하는 프로그램인지 알려주기위해서 메시지 창에 출력
		JOptionPane.showMessageDialog(null, "사칙연산 프로그램입니다.");
		// 데이터 입력
		String s1 = JOptionPane.showInputDialog("첫 번째 숫자를 입력하세요 >> ");
		String s2 = JOptionPane.showInputDialog("두 번째 숫자를 입력하세요 >> ");

		// 처리
		// String을 정수형으로 캐스팅
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		// 사칙연산을 할 변수들 선언
		int sum = 0;
		int sub = 0;
		int mul = 0;
		double div = 0.0;
		// 출력을 해줄 String 비어있는 변수 result 선언
		String result = "";
		// 입력할 두 수가 뭔지를 알려주기위해서 추가
		result = "입력하신 두 수는 " + num1 + "과 " + num2 + "입니다.\n";

		// 덧셈을 해준다. 위에 초깃값을 선언해주었기 때문에 sum 앞에 데이터 형식을 넣어주지 않음.
		sum = num1 + num2;
		// 덧셈 연산을 해서 저장한 sum이라는 변수를 result 문자열에 추가.
		result = result + "두 수의 합은 " + sum + "입니다.\n";
		sub = num1 - num2; // 뺄셈 연산입니다.
		result = result + "두 수의 차는 " + sub + "입니다.\n"; // result 변수에 추가주었습니다.
		mul = num1 * num2; // 곱샘 연산입니다.
		result = result + "두 수의 곱은 " + mul + "입니다.\n"; // result 변수에 추가주었습니다.
		div = (double) num1 / num2; // 나눗셈 연산입니다. div변수는 실수형이기 때문에 연산을 할 두 값중 하나를 캐스팅해주었습니다.
		result = result + "두 수의 나눗셈은 " + div + "입니다.\n"; // result 변수에 추가주었습니다.

		// 출력
		JOptionPane.showMessageDialog(null, result); //위에서 계속 추가해준 result를 메시지창에 넣어 메시지창을 띄워줍니다.
	}
}
