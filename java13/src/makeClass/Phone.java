package makeClass;

public class Phone {
	// 함수 정의 => 이 부품이 처리해야 할 기능을 정의
	// function!
	public void phoneCall() {
		// void는 없다라는 의미로 반환값이 없다를 말함. -> void를 사용하면 return을 사용하지 않는다.
		System.out.println("전화기로 전화하다.");
	}
	public void sendText() {
		System.out.println("전화기로 문자하다.");
	}
	public void kaTalk() {
		System.out.println("전화기로 카톡하다.");		
	}
	public void useInternet() {
		System.out.println("전화기로 인터넷하다");
	}
}
