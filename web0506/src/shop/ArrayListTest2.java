package shop;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("게임");
		list.add("여행");
		list.add("잠");
		list.add("등산");
		list.add("아무것도 하기 싫다");
		
		for (int i = 0 ; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}

	}

}
