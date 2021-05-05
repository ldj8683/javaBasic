package 컬렉션;

import java.util.HashSet;

public class 셋형 {

	public static void main(String[] args) {
		HashSet<String> bag = new HashSet<String>();
		
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("휴대폰");
		bag.add("휴대폰");
		
		// set이기 때문에 중복되는 것은 들어가지 않기때문에 휴대폰이 하나만 들어간다.
		System.out.println(bag.size());
		System.out.println(bag);
		bag.remove("휴지");
		System.out.println(bag);
	}

}
