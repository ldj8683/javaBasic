package 상속;

public class Manager extends Employee{
	// private 접근제어자 : 해당 클래스 안에서만 접근 가능
	private int bonus = 100;
	
	public void test() {
		System.out.println(bonus + "만원의 보너스를 받으며 관리/감독을 합니다.");
	}
}
