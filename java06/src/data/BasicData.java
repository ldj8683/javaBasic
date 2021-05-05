package data;

public class BasicData {

	public static void main(String[] args) {
		// 기본데이터 4가지 => 정수, 실수, 문자, 논리
		// 문자1개와 문자여러개를 구분해준다. => 문자1(char), 문자여러개(String)
		int age = 100;
		double eye = 1.5;
		char gender = '남';
		boolean food = true;
		
		// 컨트롤 + 스페이스바
		// sysout, syso + 컨트롤 + 스페이스바
		System.out.println("내 시력은 " + eye);
		// 컨트롤 + f11 : 실행
		System.out.println("내 성별은 " + gender);
		System.out.println("내 나이는 " + age);
		System.out.println("점심 유무 " + food);
	}
}
