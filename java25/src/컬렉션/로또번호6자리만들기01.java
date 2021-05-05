package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 로또번호6자리만들기01 {

	public static void main(String[] args) {
		// 난수발생시키는 객체 todtjd
		Random r = new Random();

		// 중복체크를 해서 넣어주는 클래스 사용: HashSet
		HashSet<Integer> lotto = new HashSet<Integer>();
		while(lotto.size() < 6) {
			lotto.add((r.nextInt(45) + 1));
		}
		System.out.println(lotto);

	}
}
