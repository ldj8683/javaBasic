package classPractice;

public class familyAcoount2 {

	public static void main(String[] args) {
		BankAccount2 m1 = new BankAccount2();
		BankAccount2 m2 = new BankAccount2();
		System.out.println("우리 가족 계좌 정보");
		System.out.println("=======================");
		System.out.println("이름\t계좌이름\t금액");
		System.out.println("-----------------------");
		m1.name = "홍길동";
		m1.aName = "튼튼적금";
		m1.price = 1000;
		System.out.println(m1.name + "\t" + m1.aName + "\t" + m1.price);
		
		m2.name = "홍기사";
		m2.aName = "다음적금";
		m2.price = 3000;
		System.out.println(m2.name + "\t" + m2.aName + "\t" + m2.price);
		
		System.out.println("--------------------------------");
		m1.deposit(5000);
		System.out.println("--------------------------------");
		m2.withdraw(1000);		
	}

}
