package arrayReview;

import java.util.Random;

public class UsingArray01 {

	public static void main(String[] args) {
		// 배열을 사용하는 경우
		// 1. 배열을 만드는 순간 데이터를 모르는 경우
		//		공간을 만들어 두었다가 나중에 넣는다.
		int[] num = new int[5];
		Random r = new Random(42);	// random(42) 라는 벽돌을 만들어서 r에 저장을 한다.
									// r에는 주소값이 들어가있다.(java는 기본형 데이터가 아닌 경우 주소값이 들어가게 된다.)
		System.out.println(r);
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100);	// 0~99			
		}
		// 2. 배열을 만드는 순간 데이터를 아는 경우
		//		배열을 생성할 때 바로 데이터를 넣는다.
		int[] num2 = {10, 20, 30, 40, 50};	// 기본형 데이터(=기초 데이터=원시적 데이터)라고 하는 데이터가 들어가있다.
			// num2 는 주소가 들어감. --> 참조형 변수
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);			
		}				
	}
}
