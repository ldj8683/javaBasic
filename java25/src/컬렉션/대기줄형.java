package 컬렉션;

import java.util.LinkedList;

public class 대기줄형 {

	public static void main(String[] args) {
		LinkedList<String> milk = new LinkedList<String>();
		milk.add("상한우유");
		milk.add("오늘우유");
		milk.add("내일우유");
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
	}

}
