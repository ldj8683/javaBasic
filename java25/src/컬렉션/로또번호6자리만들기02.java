package 컬렉션;

import java.util.Random;

public class 로또번호6자리만들기02 {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] a = new int[6];

		for (int i = 0; i < 6; i++) {
			// 1~45  까지 난수 발생
			a[i] = rand.nextInt(45) + 1;
			
			// 방금 삽입된 수와 비교해서 같은수가 있으면 i를 앞으로 밀어서 다음 반복에서 같은 칸에 다른수를 쓰게 만듬
			for (int y = 0; y < i; y++) {
				if (a[i] == a[y]) {
					i--; //i를 앞으로 밀어줌
					break; // 검색할 필요가 없을 경우 중복 검사 반복을 나감
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			if (i > 0) { // 맨앞을 제외하고 ", "를 추가
				System.out.print(", ");
			}
			System.out.print(a[i]);
		}
	}

}
