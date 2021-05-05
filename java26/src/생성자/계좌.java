package 생성자;

public class 계좌 {
	String name;
	String field;
	int money;
	
	// new 계좌() => 사용 불가
	public 계좌(String name, String field, int money) {
		super();
		this.name = name;
		this.field = field;
		this.money = money;
	}

	@Override
	public String toString() {
		return "계좌 [이름=" + name + ", 계좌이름=" + field + ", 금액=" + money + "]";
	}
}
