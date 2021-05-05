package 어제복습;

public class Phone {
	
	String color;
	int size;
	
	public Phone(String color, int size) {
		// this는 전역변수중에 있는 변수를 찾아주는 기능
		// this : 해당 클래스를 의미
		// this를 써주지 않으면 둘다 지역변수로 인식한다.
		// this.color는 해당 클래스 밑에 바로 선언되 color를 의미
		// this로  전역변수를 지정할 수있다.
		// 변수명이 전역/지역이 동일할 때 전역변수를 지정할 목적으로 사용
		this.color = color;
		this.size = size;
	}
	
	
	public void internet() {
		System.out.println("인터넷 하다.");
	}
	public void text() {
		System.out.println("문자하다.");
	}
	
	
	@Override // 재정의, 오버라이드
	public String toString() {
		return "Phone [color=" + color + ", size=" + size + "]";
	}
}
