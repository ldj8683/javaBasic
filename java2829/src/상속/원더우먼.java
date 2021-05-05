package 상속;

public class 원더우먼 extends 우먼 {

	boolean fly;
	public void 우주를날다() {
		System.out.println("이름이 " + name + "인 원더우먼이 지구밖인 우주를 날다.");
	}
	@Override
	public String toString() {
		return "원더우먼 [fly=" + fly + ", speed=" + speed + ", name=" + name + ", age=" + age + "]";
	}
	
}
