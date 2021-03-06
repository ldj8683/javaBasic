package 생성자;

public class 직원 {
	// 인스턴스 변수, 전역변수
	String name;	// 객체에 입력된 이름
	String gender;	// 객체에 입력된 성별
	int age;		// 객체에 입력된 나이
	
	// static 변수를 생성, 전역변수
	static int count;	// 객체 생성 수 확인
	static int sum;		// 얻은 데이터중 나이를 모두 합할때 사용
	
	
	
	public 직원(String name, String gender, int age) {
		count++; // 사용될때마다 1씩 증가
		sum += age;	// age가 계속 더해짐
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	// static 메서드의 내부에서는 static 변수만 써야한다.
	public static void getAvg() {
		System.out.println((double) sum / count);
	}

	@Override	// toString 재정의
	public String toString() {
		return "직원 [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
}
