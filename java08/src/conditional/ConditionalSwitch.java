package conditional;

import java.util.Date;

public class ConditionalSwitch {

	public static void main(String[] args) {
		// 조건이 많을 때, 조건이 특정한 값인 경우
		Date date = new Date();
		int month = date.getMonth() + 1;//
		System.out.println(month);
		// break가 없으면 다음 break가 있을때까지 수행한다.
		// switch(변수) => 정수(int), 문자1(char), String 까지만
		// switch는 실수 사용이 불가능하다.
		switch (month) {
		case 2:
			System.out.println("28일까지 있음");
			break;
		// 4 다음에 break가 없기때문에 6, 9 ,11까지 전부 확인을 한다.
		case 4: case 6: case 9: case 11: 
			System.out.println("30일까지 있음");
			break;
		// default는 if문의 else와 같다
		default:
			System.out.println("31일까지 있음");
			break;
		}
	}

}
