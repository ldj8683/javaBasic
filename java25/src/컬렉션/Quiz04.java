package 컬렉션;

import java.util.HashMap;

public class Quiz04 {

	public static void main(String[] args) {
		// 1번~4번까지 각 번호에 해당하는 데이터가 있기 때문에 Map을 이용
		HashMap<Integer, String> tel = new HashMap<Integer, String>();
		
		// 각 key값에 맞는 value 값을 차례로 대입
		// map은 add가 아닌 put을 이용해서 넣음
		tel.put(1,"엄마");
		tel.put(2,"아빠");
		tel.put(3,"친구");
		tel.put(4,"동생");
		
		// 2번이 누구인지 알기위해서 get을이용해서 2번에 해당하는 value값을 출력
		System.out.println("2번 >> " + tel.get(2));
	}
}
