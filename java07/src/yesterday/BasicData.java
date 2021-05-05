package yesterday;

public class BasicData {

	public static void main(String[] args) {
		// public은 아무나 누구든지 쓸수 있음을 나타냄(아니어도 되지만 대체로 public을 씀)
		// main은 시작점으로 어디서나 시작을 한다.
		// static은 주로 클래스들이 할당하며, 모든 객체가 메모리를 공유한다. Garbage Collector가 관여안함
			// heap은 주로 객체들에 할당하며 메모리를 공유하지 않는다. Garbage Collector가 관여함		
		System.out.println("자바 두번째 날입니다.");
		
		// 기본 데이터 : 정수, 실수, 문자1개, 논리
		// 변수 : 기본 데이터를 넣을 수 있는  공간
		// 변수명 : 그 변수에 대한 이름
		// 자바에서 저장공간 생성 시기 : 타입을 쓰고 변수명을 썼을때
		int num = 0;	// 저장공간이 생성이 될 때! => 선언!
					// 선언을 할 때 자바는 변수가 할당 된다. int는 4bite(-21억~21억 공간)
		
		double eye = 0.0;	// 8bite공간, 소숫점 16자리까지 할당이 됨.
		
		char gender = 'a';	// 2bite
		
		boolean food = false;	// 1bite
		
		// 변수를 선언할 때는 처음값(초기값)을 넣어주는 것이 좋다.
		// 초기값을 넣어주는 것을 --> 초기화
		// 변수는 초기화를 해주어야 한다!
		
		// String은 기본데이터가 아니지만 우리가 많이사용하는 데이터 형태
		// 기본형처럼 사용하도록 만들어 놓음. 단, 부품이기때문에 대문자를 사용한다.
		System.out.println("hi" + num + eye + gender + food);
	}

}
