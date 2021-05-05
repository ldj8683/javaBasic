package useClass;

import makeClass.Dog;

public class yard {

	public static void main(String[] args) {
		// 접근제어자가 몇가지가가 있는가?
		// --> default(안쓰는것), public, private, protected
		// dog1과 dog2에는 주소가 들어있다.
		Dog dog1 = new Dog();
		// new를 하면 객체의 이름인 dog1이라는 변수 하나와 Dog 클래스 안의 멤버변수의 수만큼 변수가 생성된다.
		// dog1이라는 변수가 Dog클래스의 멤버 변수를 가르키고 있는 주소가 저장되어있다.
		Dog dog2 = new Dog();
		// new를 하면 객체의 이름인 dog2라는 변수 하나와 Dog 클래스 안의 멤버변수의 수만큼 변수가 생성된다.
		// 여기까지 6개의 변수가 생성되었다.
		
		dog1.name = "만두";
		dog2.name = "오뎅";
		
		dog1.bark();
		dog2.livingRoom();
	}

}
