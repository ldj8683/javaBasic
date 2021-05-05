package 스레드;

public class 동시프로그램실행 {

	public static void main(String[] args) {
		동시프로그램 t1 = new 동시프로그램();
		동시프로그램2 t2 = new 동시프로그램2();
		
		// cpu한테 스레드 2개 만든 것 스레드 등록
		t1.start();
		t2.start();
		
		a스레드 t3 = new a스레드();
		and스레드 t4 = new and스레드();
		s스레드 t5 = new s스레드();
		t3.start();
		t4.start();
		t5.start();
	}

}
