package 형변환;

import java.util.ArrayList;
import java.util.Random;

public class 참조형형변환2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// 자동형변환 Object로 변환!
		// 자동형변환의 단점 : 부가적으로 추가되는 기능을 쓸 수 없다.
		list.add("홍길동"); //index 0
		list.add(new 맨()); //index 1
		list.add(new Random()); //index 2
		list.add(new 슈퍼맨()); //index 3
		System.out.println(list);
		//list.get(0).charAt(0);
		//list.get(1).run();
		// String에서 추가된 메서드들은 바로 쓸 수 없다.
		// String 의 추가 기능을 사용하고 싶으면 다시 String으로 형병환 해주어야한다.
		// String(작) <----- Object(zms), (String)변수
		String name = (String)list.get(0);
		System.out.println(name.charAt(0));
		
		맨 man = (맨)list.get(1);
		man.run();
		
		
	}

}
