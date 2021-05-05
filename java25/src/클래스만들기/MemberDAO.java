package 클래스만들기;

public class MemberDAO {
	// 전역변수, 자동초기화
	// 참조형 변수는 무조건 null로 초기화! -> 주소가 아직 없다. -> 아직 객체가 생성되지 않았다.
	// url : 멤버변수(개념적), 전역변수(가능 범위  <-> 지역변수), 참조형변수(기본형 데이터가 아님 <-> 기본형 변수)
	public String url = "jdbc:mysql://localhost:3306/shop";
	public String user = "root";
	public String passowrd = "1234";
	
	// 자바는 메서드 이름을 똑같이 쓸수 잇음
	// 메서드의 구분은 입력값에 따라서 하기때문
	// 하나의 이름을 여러가지 형태의 메서드를 정의해 호출할 수 있는 기능
	// 메서드 오버로딩(다형성, 폴리모피즘)
	public void create(String id, String pw, String name) {
		//id, pw, name // 지역변수(local 변수)
		System.out.println("당신이 입력한 id는 " + id);
		System.out.println("당신이 입력한 pw는 " + pw);
		System.out.println("당신이 입력한 name은 " + name);
	}
	public void create(String id, String pw, String name, String tel) {
		//id, pw, name // 지역변수(local 변수)
		System.out.println("당신이 입력한 id는 " + id);
		System.out.println("당신이 입력한 pw는 " + pw);
		System.out.println("당신이 입력한 name은 " + name);
		System.out.println("당신이 입력한 tel은 " + tel);
	}
	
	
	public void delete(String id) {
		// 위의 name과 같은 것은 지역변수이기 때문에 다른 메서드에 접근 불가.
		System.out.println("당신이 입력한 id는 " + id);
	}
	
	// 2) 전역변수 값 모두 확인, toString으로 재정의해서 사용
	@Override public String toString() {
		return "MemberDAO [url=" + url + ", user=" + user + ", passowrd=" + passowrd + "]"; }
		
}
