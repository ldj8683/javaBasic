package classPractice;

public class BankAccount2 {
	String name;
	String aName;
	int price;
	// 선언을 해서 변수가 만들어지면 사용할 수 있는 범위가 클래스 아래에서 선언된다.
	// 클래서 전역에서 사용이 가능하다 이를 전역변수, 글로벌 변수라고 함. --> 전역 변수는 자동 초기화 된다.
	
	public void deposit(int x) {
		System.out.println(name + "이 " + aName + "에 돈을 " + price + "원 입금하다.");
		System.out.println(x + "원이 추가로 입금되었습니다.");
		System.out.println(name + "님의 총 금액은 " + (price + x) + "원 입니다.");
	}
	public void withdraw(int x) {
		System.out.println(name + "이 " + aName + "에 돈을 " + price + "원 출금하다.");
		System.out.println(x + "원이 출금되었습니다.");
		System.out.println(name + "님의 총 금액은 " + (price - x) + "원 입니다.");
	}	
}
