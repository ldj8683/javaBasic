package repetitive;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// 랜덤
		Random r = new Random();
		int num = r.nextInt(100); //-21억에서 21억중에서 아무거나 랜덤하게 생성
		System.out.println(num);
	}

}
