package 생성자;

public class Day {
	// 멤버 변수는 객체 생성될 때마다 다이나믹하게 동적으로 메모리가 할당
	// 객체가 3개 생성되면, 객체마다 각각 다른 속성값들을 가져야한다.
	// 실제로 그 객체에 해당하는 실제 값들이 구체적으로 저장되는 특징
	// 실제값 >> instance(인스턴스)
	// 객체 생성할 때마다 복사되는 변수 : 인스턴스 변수
	
	// 전역변수 선언
	String doing;
	int time;
	String place;
	
	// static 변수는 클래스당 한개만 가지고
	// 클래스 이름. 변수명, day.count!
	// 객체생성과는 상관 없다.
	// static은 객체생성하지 않아도 사용이 가능하다.
	
	// 객체 생성과 상관없이 클래스에 1개만 갖고있으며,
	// 생성된 여러개의 객체들이 공유할 목적으로 만드는 변수
	// 객체 생성 시는 멤버 변수가 객체마다 따로 생성(다이나믹한 성격, 인스턴트 변수)
	static int sum = 0;
	static int count = 0;
	
	// Day 생성자 메서드 생성
	public Day(String doing, int time, String place) {
		this.doing = doing;
		this.time = time;
		this.place = place;
		sum += time;
		count++;
	}

	
	@Override // toString 재정의
	public String toString() {
		return "Day [하는 일=" + doing + ", 시간=" + time + ", 장소=" + place + "]";
	}
	
}
