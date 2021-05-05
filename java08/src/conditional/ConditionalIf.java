package conditional;

import java.util.Date;

public class ConditionalIf {

	public static void main(String[] args) {
		// new 키워드를 이용해서  Date에 대한 부품을 찍어냄
		// java와 javax는 미리 만들어진 라이브러리들이 때문에 추후 클래스를 만들때 쓰지 않도록 한다.
		// Date는 날짜와 시간에 대한 정보를 알려주는 Class
		Date date = new Date(); // 가져오는 클래스 이름이 짧은경우 보통 그 이름을 소문자로 바꿔서 씀.
		int hour = date.getHours(); // 12시, -가 쭉 써져있는건 예전것이라 굳이 쓸필요가 있는냐라는것임, 그냥 써도 무방하다.
		
		System.out.println("1. 시간에 따른 인사.");
		System.out.println("현재 시각은 " + hour + "시");
		// if~else if는 break 기능이 있음
		if( hour <= 11 ) {
			System.out.println("굿 모닝");
		} else if ( hour <= 16) {
			System.out.println("굿 애프터눈");			
		} else if ( hour <= 22) {			
			System.out.println("굿 이브닝");
		} else {
			System.out.println("굿 나잇");			
		}		
	}

}
