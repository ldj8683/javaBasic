package 클래스만들기;

public class TV {
	// 멤버변수 => 전역변수(글로벌 변수)
	// 선언: ram에 변수가 생성되는 것
	//		선언의 위치가 변수를 사용할 수 있는 범위를 결정한다
	// public 접근 제어자를 써야 다른 패키지에서도 사용할 수 있다.
	public int ch; // 선언, public을 써주어야 다른 패키지에서도 사용을 할 수 있게 된다.
	public int vol;
	public boolean onOff;
	
	
	// 멤버메서드
	// 기능을 정의 => 메서드 정의
	public void on() {
		System.out.println("TV를 켜다");
	}
	public void off() {
		System.out.println("TV를 끄다");
	}
	public void changeCh() {
		System.out.println("채널을 바꾸다");
	}
	
	// 기존에 있던 메서드를 덮어쓰고 싶으면, 기존에 있던 메서드를 똑같이 써주면 된다.
	// 오버라이딩(재정의), override
	@Override
	public String toString() {
		return "TV [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}
}
