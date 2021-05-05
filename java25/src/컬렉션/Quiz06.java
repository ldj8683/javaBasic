package 컬렉션;

import java.util.HashSet;

public class Quiz06 {
	public static void main(String[] args) {
		String[] food = { "감자", "고구마", "양파", "감자", "고구마" };
		// 중복 제거를 위해서 set을 이용
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < food.length; i++) {
			set.add(food[i]);
		}
		// 중복이 제거후 결과 출력
		System.out.println(set);
	}
}
