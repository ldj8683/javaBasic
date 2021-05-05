package classPractice;

public class usingClass {

	public static void main(String[] args) {
		// 만들어진 Car 클래스를 사용합니다.
		Car c1 = new Car();
		// Car에 있었던 멤버 변수 color가 별도로 복사됩니다.
		c1.color = "빨간색";
		c1.run();
		
		Car c2 = new Car();
		c2.color = "파란색";
		c2.up();
		
		
		// Phone Class 이용
		Phone p1 = new Phone();
		// p1 이라는 참조형 변수, color, model이라는 멤버변수 => 총 3개의 변수가 선언
		p1.color = "검정색";
		p1.model = "갤럭시폰";
		System.out.println("전화기 색: " + p1.color);
		System.out.println("전화기 기종: " + p1.model);
		p1.on();
		p1.off();
		p1.text("철수", "굿모닝", 10);
		p1.text("홍길동", "굿애프터눈", 15);
		p1.internet("네이버", 10, "어제");
		
		

	}

}
