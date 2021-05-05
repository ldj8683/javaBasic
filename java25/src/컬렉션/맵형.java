package 컬렉션;

import java.util.HashMap;

public class 맵형 {

	public static void main(String[] args) {
		HashMap dic = new HashMap();
		dic.put("apple", "사과");
		dic.put("banana", "바나나");
		dic.put("melon", "멜론");
		System.out.println(dic);
		System.out.println(dic.size());
		System.out.println(dic.get("apple"));
		dic.put(1,"one");
		System.out.println(dic);
	}

}
