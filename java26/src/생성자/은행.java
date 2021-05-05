package 생성자;

public class 은행 {

	public static void main(String[] args) {
		계좌 acc1 = new 계좌("홍길동", "정기예금", 10000);
		System.out.println(acc1);
		
		계좌 acc2 = new 계좌("김길동", "정기적금", 20000);
		System.out.println(acc2);
		
		계좌 acc3 = new 계좌("송길동", "정기예금특", 30000);
		System.out.println(acc3);
	}

}
