package repetitive;

import javax.swing.JOptionPane;

public class RepetitiveQuiz01 {
	public static void main(String[] args) {
		int countA = 0;	// 90점 이상의 수
		int countB = 0; // 80점 이상의 수
		int countC = 0; // 70점 이상의 수
		int countD = 0; // 60점 이상의 수
		int countE = 0; // 60점 미만의 수
		int countSum = 0;	// 횟수. 전체 투표 횟수를 구하기 위해서 선언
		int totalScore = 0;	// 점수 누적 계산. 평균을 구하기 위해서 입력된 모든 점수를 더하는 변수
		double avg = 0.0;	// 입력된 모든 점수의 평균을 구하는 변수
		
		while (true) {	// break가 나올때까지 무한하게 반복하는 while 문 생성
		//입력
			String s1 = JOptionPane.showInputDialog("점수를 입력하세요(종료 0) : ");	// 점수를 입력받아 s1에 저장
			int score = Integer.parseInt(s1);	// s1에 저장된 문자열의 숫자를 정수형 숫자로 캐스팅
			
				// 0이 입력되면 종료
			if (score == 0) {	// 0이 입력되면 종료가 되어야 하기 때문에 종료를 해주는 if문 생성 
				System.out.println("시스템을 종료합니다.");	// 종료가 됬음을 알려주는 출력문
				break;	// while문 자체를 빠져나오는 while문의 break
			}
			
		// 처리
			if (score >= 90) {	// 90점 이상인 경우만 아래 구문을 실행
				countA++;	// 90점 이상의 데이터가 입력됬을 경우 1씩 증가하는 카운트
			} else if (score >= 80){ //80이상 90점 미만인 경우 아래 구문 실행
				countB++;	// 80점 이상 90점 미만의 데이터가 입력됬을 경우 1씩 증가하는 카운트
			} else if (score >= 70){ //70이상 80점 미만인 경우 아래 구문 실행
				countC++;	// 70점 이상 80점 미만의 데이터가 입력됬을 경우 1씩 증가하는 카운트
			} else if (score >= 60){ //60이상 70점 미만인 경우 아래 구문 실행
				countD++;	// 60점 이상 70점 미만의 데이터가 입력됬을 경우 1씩 증가하는 카운트
			} else { //30점 미만인 경우 아래 구문 실행
				countE++;	// 60점 미만의 데이터가 입력됬을 경우 1씩 증가하는 카운트
			}	// else end
			totalScore += score;	// 입력되는 모든 점수를 더해서 totalScore에 저장, 누적 점수
									// totalScore = totalScore + score 와 같은 의미
			countSum++;	// "while문이 반복되는 수 = 점수가 입력되는 수" 이기 때문에 while문이 몇번 반복되는지를 저장
						// 0을 눌러서 종료를 하게되면 그 종료가 되는 if문에서 
		}	// while end
		avg = (double)totalScore / countSum;	// avg는 평균이기 때문에 연산되는 정수형 두 데이터중 하나를 실수형으로 캐스팅해줍니다.
												// 여기서 저는 totalScore를 실수형으로 캐스팅 해주었습니다.
		
		// 출력
		System.out.println("------------------");	// 구분을 해주기 위해서 출력
		
		// 각 점수 범위별로 카운트되어 저장된 변수들을 각각 출력합니다.
		System.out.println("60점 미만 : " + countE + "명");
		System.out.println("60점 이상 : " + countD + "명");
		System.out.println("70점 이상 : " + countC + "명");
		System.out.println("80점 이상 : " + countB + "명");
		System.out.println("90점 이상 : " + countA + "명");
		
		System.out.println("------------------");	// 구분을 위해서 출력
		
		System.out.println("총 " + countSum + "명의 평균은 " + avg + "점");	// 총 입력된 횟수와 점수들의 평균을 출력
	}	// main end
}	//class end
