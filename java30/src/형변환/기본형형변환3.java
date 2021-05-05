package 형변환;

public class 기본형형변환3 {

	public static void main(String[] args) {
		double sum = 333; // 8바이트 <--- 4바이트, 큰것으로 자동 변환
		// 333.0으로 자동으로 들어가게 됨
		int count = 5;
		
		double avg = sum/count;
		System.out.println(avg);
	}

}
