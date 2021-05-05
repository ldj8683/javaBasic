package 클래스만들기;

public class 계좌 {
	public String name;
	public String field;
	public int price;
	
	public void 예금하다(String name, String field, int price) {
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 통장 종류는 " + field + "입니다.");
		System.out.println("당신의 입금 금액 " + price + "입니다.");
		this.name = name;
		this.field = field;
		this.price = this.price + price;
		System.out.println("당신의 총 입금 금액 " + this.price + "입니다.");
		System.out.println();
	}
	public void 예금하다(String name, int price) {
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 추가 입금 금액 " + price + "입니다.");
		this.name = name;
		this.price = this.price + price;
		System.out.println("당신의 총 입금 금액 " + this.price + "입니다.");
		System.out.println();
	}
	public void 출금하다(int price) {
		System.out.println("당신의 출금 금액 " + price + "입니다.");
		this.price = this.price - price;
		System.out.println("당신의 총 입금 금액 " + this.price + "입니다.");
		System.out.println();
	}
	@Override
	public String toString() {
		return "계좌 [name=" + name + ", kind=" + field + ", price=" + price + "]";
	}
}
