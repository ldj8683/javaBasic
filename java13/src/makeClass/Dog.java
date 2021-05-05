package makeClass;

public class Dog {
	// 멤버 변수 => 성질
	// 객체 생성할 때 마다 멤버 변수는 복사가 된다.
	public String name;
	public String color;
	public String type;
	
	public void livingRoom() {
		System.out.println(name + "이/가 거실에 있습니다.");		
	}
	public void bark() {
		System.out.println(name + "이/가 짖고 있습니다.");
	}
	public void walk() {
		System.out.println(name + "이/가 샌책을 가고 있습니다.");
	}
}
