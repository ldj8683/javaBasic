package 형변환;

public class 기본형형변환2 {

	public static void main(String[] args) {
		int sum = 333;
		int count = 5;
		// 평균을 내는 경우 하나라도 double이면
		// 결과가 double임
		double avg1 = (double)sum/count;
		// 333을 333.0
		// 333.0/5 = 66.6
		double avg2 = (double)(sum/count); // 정수끼리의 계산은 무조건 int
		// 정수끼리의 계산을 먼저 한 뒤 그 상태에서 double로 형변환을 한다
		// 333/5 = 66
		// (double)66 = 66.0
		
		System.out.println(avg1);
		System.out.println(avg2);
	}

}
