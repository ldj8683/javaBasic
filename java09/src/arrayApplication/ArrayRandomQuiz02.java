package arrayApplication;

import java.util.Random;

public class ArrayRandomQuiz02 {

	public static void main(String[] args) {
		int[] num = new int[1000]; // 저장공간이 1000개인 배열 num을 생성
		Random r = new Random(42); // Seed값이 42인 고정된 랜덤값이 나오는 r 변수를 생성
		for (int i = 0; i < num.length; i++) { // num배열의 저장공간 수만큼 반복하는 반복문
			num[i] = r.nextInt(1000); // 반복을 하면서 0~999 중 랜덤한 숫자를 num배열에 저장
		}
		int sum = 0; // 총 1000개가 맞는지 확인하기 위해서

		int[] count = new int[5];
		for (int x : num) { // 배열 num에 저장된 숫자형 데이터들을 끝날때까지 하나씩 꺼내옴
			if (x >= 600) { // 600이상인 경우 아래 코드를 수행
				count[0]++; // 횟수를 세기 위해서 1씩 증가
			} else if (x >= 500) { // 600미만의 수 중 500 이상인 경우 아래 코드 증가
				count[1]++; // 횟수를 세기 위해서 1씩 증가
			} else if (x >= 400) { // 500미만의 수 중 400 이상인 경우 아래 코드 증가
				count[2]++; // 횟수를 세기 위해서 1씩 증가
			} else if (x >= 300) { // 400미만의 수 중 300 이상인 경우 아래 코드 증가
				count[3]++; // 횟수를 세기 위해서 1씩 증가
			} else { // 300미만의 수인 경우 아래 코드 증가
				count[4]++; // 횟수를 세기 위해서 1씩 증가
			}
		}
		
		// 출력
		int start = 600;	// for문을 돌면서 몇이상이 되는지를 넣어주기위해서 생성
		for (int i = 0; i < count.length; i++) {	//count 배열의 저장공간 만큼 for문을 반복
			System.out.println(start + " 이상이 되는 갯수 : " + count[i] + "개");//출력
			start -= 100;	// 카운트를 셀때 100단위로 범위가 작아지기대문에 100씩 빼주는 역할
			sum += count[i];	// count 배열 안의 모든 수를 더해서 총 횟수가 1000개가 맞는지를 확인하기 위해서
		}
		System.out.println("총 갯수 : " + sum);	//출력
	}

}
