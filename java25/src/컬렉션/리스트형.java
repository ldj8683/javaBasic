package 컬렉션;

import java.util.ArrayList;

public class 리스트형 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// 순서가 의미있는 데이터들의 모음
		list.add("먹기");
		list.add("마시기");
		list.add("운동");
		// System.out.println(list.get(0));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		for (String x : list) {
			System.out.println(x);			
		}
		
		// arraylist는 toString이 override 되어있어서
		// 주소값이 아닌 뭐가 들었는지 출력하도록 설정되어있다.
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		list.add(1, "쉬기");
		System.out.println(list);
		System.out.println(list.size());
	}

}
