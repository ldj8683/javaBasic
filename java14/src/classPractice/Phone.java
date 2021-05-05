package classPractice;

public class Phone {
	// 멤버 변수 2개
	String color;
	String model;
	
	// 멤버 메서드 2개
	public void on() {
		System.out.println(color + " " + model + " 전화기가 켜졌습니다.");
	}
	public void off() {
		System.out.println(color + " " + model + " 전화기가 꺼졌습니다.");
	}
	public void text(String name, String content, int time) {
		System.out.println(name + "가 " + content + "(이)라고 " + time + "시에 " + color + " " + model + " 전화기로 문자하다.");
		// System.out.println(color + " " + model + " 전화기로 문자하다.");		
	}
	public void internet(String engine, int time, String when) {
		System.out.println(engine + "를 " + when + " " + time + "시간 동안 " + color + " " + model + " 전화기로 서핑하다.");		
	}
}
