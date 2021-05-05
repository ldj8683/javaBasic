package 클래스사용;

import 클래스만들기.MemberDAO;

public class MemberDAO사용 {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();	// 1) dao 객체 생성
		System.out.println(dao);			// 2) toString 재정의해서 사용
		System.out.println("-----------------------");
		dao.create("lee", "1234", "daejun");
		System.out.println("-----------------------");
		dao.delete("lee");
	}
}
