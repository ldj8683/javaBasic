package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 배열의중복값제거 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[10000];
		for(int i=0; i<num.length;i++) {
			num[i] = r.nextInt(10000); //0~999
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}
		System.out.println(set);
		System.out.println(set.size());
		
	}

}
