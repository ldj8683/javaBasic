package makeClass;

public class livingRoom {

	public static void main(String[] args) {
		// 클래스는 그 안의 함수가 중요하다!, 그 사용하는 객체마다 기능과 성질이 있다.
		// 클래스에 속성(성질)을 만들고 싶다면 변수를 이용하면 됩니다.
		
		// int x = 100;
		// 타입 변수명 = 값;
		// *클래스명은 변수의 티입으로 사용할 수 있다.
		// 클래스명 변수명 = new 클래스명();
		// 변수명은 객체의 이름을 말한다.

		Tv tv1 = new Tv();
		Tv tv2 = new Tv();

		
		// tv1, tv2 객체의 멤버변수가 각자 저장되어야 한다.
		// tv1, tv2 객체의 멤버변수를 저장할 공간이 필요하다
		// new할 때, 멤버 변수가 복사된다.
		
		
		tv1.color = "빨강색";
		tv1.size = 50;
		
		tv2.color = "검정색";
		tv2.size = 42;		
		
		System.out.println(tv1.color);
		System.out.println(tv1.size);
		System.out.println(tv2.color);
		System.out.println(tv2.size);
		
		
		tv1.on();
		tv1.off();
		
		tv2.on();
		tv2.ch();
		
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		dog1.name = "후추";
		dog2.name = "소금";
		
		dog1.livingRoom();
		dog2.livingRoom();

	}

}
