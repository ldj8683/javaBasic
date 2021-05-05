package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class Quiz07 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[5000];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(50000) + 1; // 0~49999
		}

		// set을 이용해서 중복 제거
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}
		// 출력
		System.out.println(set);
		System.out.println(set.size());
	}
}
