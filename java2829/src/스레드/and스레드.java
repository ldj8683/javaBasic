package 스레드;

public class and스레드 extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 100 ; j++) {
				System.out.print("&");
			}
			System.out.println();
		}
	}
}

