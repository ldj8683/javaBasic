package 컬렉션;

import java.util.ArrayList;
import java.util.Random;

public class 리스트형중복제거2 {

	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < 5000; i++) {
			//5000개의 랜덤한 값을 넣어서
			list.add((r.nextInt(5000)+1));			
		}
		for (Integer x : list) {
			if(!list2.contains(x)) {
				list2.add(x);
			}
		}
		
		System.out.println(list2);
		System.out.println(list2.size());
	}

}
