package classPractice;

public class familyAcoount {

	public static void main(String[] args) {
		BankAccount m1 = new BankAccount();
		BankAccount m2 = new BankAccount();
		System.out.println("우리 가족 계좌 정보");
		System.out.println("=======================");
		System.out.println("이름\t계좌이름\t금액");
		System.out.println("-----------------------");
		m1.member("홍길동", "튼튼적금", 1000);
		m2.member("홍기사", "다음적금", 3000);	
		
		m1.deposit = "입금";
		m2.withdraw = "출금";
		System.out.println("-----------------------");
		System.out.println("아버지는 " + m1.deposit + "하고 딸은 " + m2.withdraw + "하다.");
	}

}
