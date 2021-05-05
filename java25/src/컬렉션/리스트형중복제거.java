package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 리스트형중복제거 {

	public static void main(String[] args) {
		Random r = new Random(42);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 5000; i++) {
			//5000개의 랜덤한 값을 넣어서
			list.add((r.nextInt(5000)+1));
		}
		// 중복 제거를 위해서 set을 이용해서 list의 갑중 중복 제거한 값들을 set에 넣음
		HashSet<Integer> set = new HashSet<Integer>();
		for(int j=0; j<list.size();j++) {
			set.add(list.get(j));
		}
		// 출력
		System.out.println(set);
		System.out.println(set.size());
	}

}
