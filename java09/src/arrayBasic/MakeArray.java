package arrayBasic;

public class MakeArray {

	public static void main(String[] args) {
		// 배열(Array) : 늘어놓다라는 의미
		// int[] 는 int배열이라는 의미, int[1000]은 천개를 저장훌 수 있다는 의미.
		// num은 주소
		int[] num = new int[1000];
		
		int[] num2 = new int[5];
		// num2 : 데이터들이 들어있는 주소
		// int[5] : 자동 초기화된 값, 0으로 초기화
		// length : 읽기전용인 베열에 들어간 저장공간의 개수
				// 배열은 크기를 변경할 수 없다.
				// 숫자가 정해진 목록과 같은 것을 사용할때 씀
				// 가변적 크기를 가진것에는 좋지 않다.
		System.out.println(num2[0]);
		
		num2[1] = 300;
		System.out.println(num2[1]);
		System.out.println(num2.length);
		System.out.println(num2);
		System.out.println(num);

	}

}
