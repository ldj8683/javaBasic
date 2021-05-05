package conditional;

import javax.swing.JOptionPane;

public class ConditionalQuiz01 {
	public static void main(String[] args) {
		// 변수는 초기화 시켜주어야한다.
		int countIu = 0;
		int countYou = 0;
		int countPark = 0;
		int countFail = 0;

		while (true) { // 조건이 참이기 때문에 무한하게 반복하는 while문을 생성해줍니다.
			String result = ""; // 출력을 할 때 사용할 비어있는 문자열 변수 result를 선언합니다.
			String resultCount = "";
			// int totalCount = 0;
			// 데이터 를 입력받아서 data라는 문자열 형식의 변수에 저장합니다.
			String data = JOptionPane.showInputDialog("0)아이유, 1)유재석, 2)박명수, 3)종료");

			// 3이 입력 되면 종료가 되도록 반복문 while에서 나갈수 있는 if문을 생성합니다.
			if (data.equals("3")) { // data가 3인지를 비교하는 부분입니다.
				JOptionPane.showMessageDialog(null, "투표시스템을 종료합니다."); // 프로그램이 종료가 되었음을 알리기 위한 메시지창입니다.
				JOptionPane.showMessageDialog(null, resultCount);
				break; // while문을 나가는 부분입니다.
			}
			switch (data) { // switch문이고 조건은 data 입니다.
			case "0":// data의 값이 0일 경우에 참이 되어 아래 문장을 수행합니다.
				result = "아이유를 선택하셧습니다."; // result에 문자열을 저장을 합니다.
				countIu++; // ++:증감연산자 = countIu += 1;, countIu = countIu + 1;
				resultCount = "아이유의 총 투표수 : " + countIu + "표.";
				break; // case문에서 나오게 합니다.
			case "1":
				result = "유재석을 선택하셧습니다."; // result에 문자열을 저장을 합니다.
				countYou++; // countYou += 1;
				resultCount = "유재석의 총 투표수 : " + countYou + "표.";
				break;
			case "2":
				result = "박명수를 선택하셧습니다."; // result에 문자열을 저장을 합니다.
				countPark++; // countPark += 1;
				resultCount = "박명수의 총 투표수 : " + countPark + "표.";
				break;
			default:
				result = "해당 연예인이 없습니다."; // result에 문자열을 저장을 합니다.
				countFail++; // countFail += 1;
				resultCount = "무효표 총 투표수 : " + countFail + "표.";
				break;
			}
			JOptionPane.showMessageDialog(null, result); // result에 저장된 메시지를 메시지창에 넣어 띄워줍니다.
			
		}
	}
}
