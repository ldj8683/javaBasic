package 형변환;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 참조형형변환4 {

	public static void main(String[] args) {
		// 객체설계할 때 2대 원칙
		// 하나의 클래스안에는 하나의 역할만을 정의해야한다 	>> 응집도 (Cohesion) 높게!
		// 결합시 특정한 클래스만 지정해 설계하면 안된다 	>> 결합도 (Coupling) 낮게!
		맨 m = new 맨(); // 죽어라 맨만 쓸 수있다.
		
		//하나의 이름으로 다양한 형태를 구현하여 사용하는 자바의 이특징
		// 자동형변환으로 가능, 오버로딩(다형성)
		사람 m2 = new 맨();// 위의 코드보다 더 좋은 코드이다. (이유 : 결합도가 낮은 코드)
		// 상황이 어떻게 바뀔지 모르기때문에
		// 사람으로 선언을 했기때문에 오른쪽에 "new 맨"을 다른 것들로 바꿀 수 있다. --> 결합도가 낮다!
		m2 = new 우먼();
		m2 = new 슈퍼맨();
		// 결합도가 낮은 코드는 유지보수하기도 좋고, 더 좋은 성능을 가진 클래스고 변경도 용이하다.
		
		List list = new ArrayList();
		list = new LinkedList();
	}

}
