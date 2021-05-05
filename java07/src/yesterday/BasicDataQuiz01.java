package yesterday;

public class BasicDataQuiz01 {

	public static void main(String[] args) {
		// 학기 평균을 구하는 프로그램
		int ath = 66;
		int math = 77;
		int eng = 88;
		int kor = 99;
		int sum = 0;
		double avg = 0.0;
		sum = ath + math + eng + kor;
		
		// 자바는 int와 int의 계산은 결과가 항상 int!		
		// 자바는 하나라도 double이면 무조건 항상 double!
		// 데이터 타입을 내가 원하는 타입으로 변경해주는 것 --> 캐스팅
		avg = sum / 4;
		// ram에는 원래 타입이 그대로 있다.
		// cpu가 ram에 들어있던 데이터를 가져다가 강제캐스팅함
			// (변경하고자하는 타입명)변수 = (double)sum
		double avg2 = (double)sum / 4;
		double avg3 = sum / 4.0;
		
		System.out.printf("모든 과목 총점은 %d점 이고, 평균은 %.1f점 입니다.\n",sum,avg);
		System.out.printf("모든 과목 총점은 %d점 이고, 평균은 %.1f점 입니다.\n",sum,avg2);
		System.out.printf("모든 과목 총점은 %d점 이고, 평균은 %.1f점 입니다.\n",sum,avg3);

	}
	
}
