package arrayBasic;

import java.util.Random;

// 많은 양의 자동 import : Ctrl + Shift + o
// f2를 눌러서 import 선택!

public class MakeLotto {

	public static void main(String[] args) {
		int[] lotto = new int[1000];
		Random r = new Random(42);// seed값을 지정해주면 고정된 랜덤값을 넣어줄 수 있다.
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
		}
		for (int x : lotto) {
			System.out.print(x + "\t");
		}
		System.out.println();
		int count = 0;
		for (int x : lotto) {
			if(x >= 40) {
				count++;
			}
		}
		System.out.println(count);
	}
}
