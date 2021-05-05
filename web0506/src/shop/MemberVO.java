package shop;

// 전달할 때 각 값들을 따로 보내는 것보다 가방을 만들어서 값들을 넣어 한번에 전달하는게 효율적이고 편하다.
public class MemberVO {
	// 가방 안에 변수들로 공간을 만들어 준다.
	String id;
	String pw;
	String name;
	String tel;
	
	// 값을 넣고 뺄 때는 변수 하나씩 기능을 처리한다.
	// 각 변수마다 넣는기능, 꺼내는 기능이 필요하다.
	// 기능을 메서드로 만든다
	
	public void setId(String id) {
		this.id = id;
		// this라는건 해당 클래스(MemberVO)를 의미함
		// id = id 일 경우 둘다 지역변수가 되어 버림.
		// 앞의 id는 MemberVO의 id 임을 알려주기 위해서 this. 을 넣어줘서 두 id를 구분 지어준다.
		// setters, getters
		// source 메뉴에서 자동 생성한다.
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
