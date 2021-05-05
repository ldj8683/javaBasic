package 클래스사용;

import java.util.Date;

import 클래스만들기.반환값연습;

public class 반환값받기 {

	public static void main(String[] args) {
		반환값연습 re = new 반환값연습();
		
		re.add2();
		//String rest = re.add2(); // return값이 없기 때문에 에러가 발생한다.
		//System.out.println(re.add2()); // return값이 없기 때문에 에러가 발생한다.
		// void인 메서드를 호출하는 경우 변수에 그 결과값을 넣을 수 없음. => 프린트도 되지 않음
		
		// 메서드를 호출하고 나서 반환값이 있을때만 변수에 그 결과값을 넣을 수 있고, 출력도 가능
		int sum1 = re.add(10, 30);
		System.out.println(sum1);
		
		double sum2 = re.add(10.0, 50);
		System.out.println(sum2);
		
		String sum3 = re.add(40, "20");
		System.out.println(sum3);
		
		String sum4 = re.add("다음 시간은 ", "점심 시간");
		System.out.println(sum4);
		
		int[] sum5 = re.add();
		for(int x : sum5) {
			System.out.println(x);
		}
		
		Date d = re.getDate();
		System.out.println(d);
	}

}
