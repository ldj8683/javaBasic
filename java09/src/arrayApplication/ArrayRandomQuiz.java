package arrayApplication;

import java.util.Random;

public class ArrayRandomQuiz {

	public static void main(String[] args) {
		int[] num = new int[1000];	// 저장공간이 1000개인 배열 num을 생성
		Random r = new Random(42);	// Seed값이 42인 고정된 랜덤값이 나오는 r 변수를 생성
		for (int i = 0; i < num.length; i++) {	// num배열의 저장공간 수만큼 반복하는 반복문
			num[i] = r.nextInt(1000);	//반복을 하면서 0~999 중 랜덤한 숫자를 num배열에 저장
		}
		int countOther = 0;	// 300미만의 갯수를 세기 위해서
		int count300 = 0;	// 300이상 400미만의 갯수를 세기 위해서
		int count400 = 0;	// 400이상 500미만의 갯수를 세기 위해서
		int count500 = 0;	// 500이상 600미만의 갯수를 세기 위해서
		int count600 = 0;	// 600이상의 갯수를 세기 위해서
		int sum = 0;		// 총 1000개가 맞는지 확인하기 위해서
		for (int x : num) {	// 배열 num에 저장된 숫자형 데이터들을 끝날때까지 하나씩 꺼내옴
			if (x >= 600) {	// 600이상인 경우 아래 코드를 수행
				count600++;	// 횟수를 세기 위해서 1씩 증가
			} else if (x >= 500) {	// 600미만의 수 중 500 이상인 경우 아래 코드 증가
				count500++;	// 횟수를 세기 위해서 1씩 증가
			} else if (x >= 400) {	// 500미만의 수 중 400 이상인 경우 아래 코드 증가
				count400++;	// 횟수를 세기 위해서 1씩 증가
			} else if (x >= 300) {	// 400미만의 수 중 300 이상인 경우 아래 코드 증가
				count300++;	// 횟수를 세기 위해서 1씩 증가
			} else {	// 300미만의 수인 경우 아래 코드 증가
				countOther++;	// 횟수를 세기 위해서 1씩 증가
			}
		}
		sum = countOther + count600 + count500 + count400 + count300; // 1000개 인지 확인하기위해서
		// 출력
		System.out.println("600개 이상의 갯수 : " + count600 + " 개");
		System.out.println("500개 이상의 갯수 : " + count500 + " 개");
		System.out.println("400개 이상의 갯수 : " + count400 + " 개");
		System.out.println("300개 이상의 갯수 : " + count300 + " 개");
		System.out.println("300개 미만의 갯수 : " + countOther + " 개");
		
		System.out.println("총 갯수 : " + sum + " 개");
	}

}
