package arrayDeepening;

public class BasicCopy {

	public static void main(String[] args) {
		int x = 100;
		int y = x;	// x에 있는 100을 복사해서 y에 들어가라 --> 기본형 복사
		System.out.println("변경 전 x:" + x);
		System.out.println("변경 전 y:" + y);
		x = 200;
		System.out.println("변경 후 x:" + x);
		System.out.println("변경 후 y:" + y);
		
	}
}
