package arrayReview;

public class UsingArray02 {

	public static void main(String[] args) {
		// 내가 알고 있는 경우
		String[] name = {"홍길동", "박길동", "정길동", "이길동"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		for (String s : name) {
			System.out.print(s + " ");		
		}
		
		
		System.out.println();
		// char 성별 넣어보고, 출력
		char[] gender = {'남', '여', '남', '남'};
		// 지역변수
		// 이 지역안 (for문 안)에서 만들어진 변수는 지역 밖(for문 밖)에서는 인식이 불가능하다.
		// 따라서 아래 for문의 지역변수 i는 for문 안에서만 사용가능하다.
		// 변수는 언제 만들어지는가? -> 타입 변수명; (선언을 할 때)
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		
		// boolean 아침을 먹었는지를 넣고, 출력
		boolean[] eat = {false, true, true, false};
		for (boolean b : eat) {
			System.out.print(b + " ");
		}
		System.out.println();
		
		// double 시력을 넣고, 출력
		double[] eye = {0.5, 1.2, 0.2, 0.8};
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i] + " ");
		}
		System.out.println();
		
		// System.out.println(test); // test를 선언한 곳보다 위에 있기 때문에 test변수를 사용을 할 수 없다.
		// 변수 선언시 에러가 발생하는 경우
		// 1. 오타, 2. 변수 범위(지역변수인지), 3. 위치(선언이 아래 되어있는지.
		int test = 100; // test라는 변수를 선언을 한 아래 코드들부터 test 변수를 쓸 수 있다.
		System.out.println(test);
		// int 나이 넣고, 출력
		int[] age = {62, 60, 31, 27};
		for (int i : age) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		// 하나에 대한 정보를 같은 인덱스를 둠으로 써 같이 출력이 가능해진다.
		System.out.print("이름\t성별\t식사\t시력\t나이\n");
		System.out.print("-------------------------------------\n");
		for (int i = 0; i < name.length; i++) {			
			System.out.print(name[i] + "\t" + gender[i] + "\t" + eat[i] + "\t" + eye[i] + "\t" + age[i] + "\n");
		}
	}
}
