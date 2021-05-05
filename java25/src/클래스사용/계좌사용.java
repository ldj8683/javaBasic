package 클래스사용;

import 클래스만들기.계좌;

public class 계좌사용 {

	public static void main(String[] args) {
		계좌 acc1 = new 계좌();
		계좌 acc2 = new 계좌();
		계좌 acc3 = new 계좌();
		
		System.out.println("---------------------------------------");
		acc1.예금하다("lee", "적금", 10000);
		acc1.예금하다("lee", 10000);
		acc1.출금하다(10000);
		System.out.println(acc1);
		System.out.println("\n---------------------------------------");
		
		acc2.예금하다("kim", "예금", 20000);
		acc2.예금하다("kim", 30000);
		acc2.출금하다(5000);
		System.out.println(acc2);
		System.out.println("\n---------------------------------------");
		
		acc3.예금하다("park", "적금", 40000);
		acc3.예금하다("park", 20000);
		acc3.출금하다(32000);
		System.out.println(acc3);
		System.out.println("\n---------------------------------------");
		
	}
}
