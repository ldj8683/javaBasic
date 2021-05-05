package makeClass;

public class MyRoom {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		// p1은 기본형이 아니기 때문에 주소가 들어있다.
		// 함수(어떤 특정한 기능)을 사용하고 싶으면 -> 객체를 생성 후 -> 생성된 객체의 주소를 통해서 함수를 사용할 수 있다.
		// 함수만 쓰는 것은 자바에 존재하지 않는다. print도 system.out 이 있다.

		p1.phoneCall();
		p1.sendText();

		// 함수를 추가하고 싶다면 Phone 클래스에 추가를 해주어야 합니다.
		p1.kaTalk();
		p1.useInternet();
		p1.useInternet();

	}
}
