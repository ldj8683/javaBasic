package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDb {
	public ArrayList<MemberVO> list() throws Exception {
		ArrayList<MemberVO> list = new ArrayList<>();
		// return을 ArrayList<MemberVO로 받는다.>
		
		// 1. 커넥터를 사용하겠다고 설정.
		Class.forName("com.mysql.jdbc.Driver"); // 클래스는 처음 대문자를 써줘야한다
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공."); // 연결이 성공 하면 브라우저에 성공했음을 띄워준다.

		// 2. db 연결을 해보기 - shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";
		// 포트번호를 확인하자, localhost는 내 컴퓨터 안에서 사용할때 쓴다.
		// jsp 자동 import : ctrl + shift + m
		Connection con = DriverManager.getConnection(url, "root", "1234"); // 설정한 곳이 위치한 주소를 가져온다.
		System.out.println("2. DB 연결 성공.");

		// 3. SQL문을 만듬 => 해당 부품을 써서 SQL로 인식하게 해야한다.
		// 아래 sql문은 mySQL이 사용한다. 서버는 만들어 주기만 함.
		// set(수정) <--> get(얻다)
		String sql = "select * from member"; // ?는 입력값을 모를 때 넣어둠(입력받은 값을 넣어줄때 사용)
		PreparedStatement ps = con.prepareStatement(sql);// PreparedStatement => sql을 담당하는 부품
		System.out.println("3. SQL문을 만들기 성공.");

		// 4. 만든 SQL문을 mySQL 서버로 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문을 mySQL 서버로 전송 성공.");
				
		while(rs.next()) {
			// rs.next를 호출 할 때마다 한 행씩 내려가서 그행이 있는지를 확인한다.
			// db 내부의 각 항목에 값이 있으면 true, 없으면 false 이기때문에
			// true이면 각 항목의 값들을 꺼내주고, false이면 끝이 날것이다. -> while문이기 때문에
			
			// 꺼내주는 방법은 2가지
			// 1. 항목명을 가지고 꺼내기
			// 2. 항목의 인덱스를 가지고 꺼내기
			String id2 = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			
			// 가방을 만들어서 꺼내준 값들을 가방에 넣는다.
			MemberVO bag = new MemberVO();
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
			
			//가방들을 넣어줄 컨테이너에 하나씩 넣어준다.
			list.add(bag);
		}
		return list;
		
	}
	public boolean check(String id, String pw) throws Exception {
		// 1. 커넥터를 사용하겠다고 설정.
		Class.forName("com.mysql.jdbc.Driver"); // 클래스는 처음 대문자를 써줘야한다
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공."); // 연결이 성공 하면 브라우저에 성공했음을 띄워준다.

		// 2. db 연결을 해보기 - shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop2";
		// 포트번호를 확인하자, localhost는 내 컴퓨터 안에서 사용할때 쓴다.
		// jsp 자동 import : ctrl + shift + m
		Connection con = DriverManager.getConnection(url, "root", "1234"); // 설정한 곳이 위치한 주소를 가져온다.
		System.out.println("2. DB 연결 성공.");

		// 3. SQL문을 만듬 => 해당 부품을 써서 SQL로 인식하게 해야한다.
		// 아래 sql문은 mySQL이 사용한다. 서버는 만들어 주기만 함.
		String sql = "select * from member where id = ? and pw = ?"; // ?는 입력값을 모를 때 넣어둠(입력받은 값을 넣어줄때 사용)
		PreparedStatement ps = con.prepareStatement(sql);// PreparedStatement => sql을 담당하는 부품
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. SQL문을 만들기 성공.");

		// 4. 만든 SQL문을 mySQL 서버로 부터 가져옴
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문을 이용해 mySQL 서버로부터 가져오기 성공.");
		
		// 1. 검색결과가 있는지 체크해야한다.
		//System.out.println(rs.next()); // true이면 있다는 예기
		
		// 2. 만약에 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내주면 된다.
		boolean result = false;
		if(rs.next()) {
			result = true;	// db에 맞는 내용이 있다면 참으로 반환 
		}
		return result;
	}
	
	public void create(String id, String pw, String name, String tel) throws Exception {
		// 1. 커넥터를 사용하겠다고 설정.
		Class.forName("com.mysql.jdbc.Driver"); // 클래스는 처음 대문자를 써줘야한다
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공."); // 연결이 성공 하면 브라우저에 성공했음을 띄워준다.

		// 2. db 연결을 해보기 - shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";
		// 포트번호를 확인하자, localhost는 내 컴퓨터 안에서 사용할때 쓴다.
		// jsp 자동 import : ctrl + shift + m
		Connection con = DriverManager.getConnection(url, "root", "1234"); // 설정한 곳이 위치한 주소를 가져온다.
		System.out.println("2. DB 연결 성공.");

		// 3. SQL문을 만듬 => 해당 부품을 써서 SQL로 인식하게 해야한다.
		// 아래 sql문은 mySQL이 사용한다. 서버는 만들어 주기만 함.
		String sql = "insert into member values (?, ?, ?, ?)"; // ?는 입력값을 모를 때 넣어둠(입력받은 값을 넣어줄때 사용)
		PreparedStatement ps = con.prepareStatement(sql);// PreparedStatement => sql을 담당하는 부품
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL문을 만들기 성공.");

		// 4. 만든 SQL문을 mySQL 서버로 전송
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL 서버로 전송 성공.");
	}

	public void delete(String id) throws Exception {
		// 1. 커넥터를 사용하겠다고 설정.
		Class.forName("com.mysql.jdbc.Driver"); // 클래스는 처음 대문자를 써줘야한다
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공."); // 연결이 성공 하면 브라우저에 성공했음을 띄워준다.

		// 2. db 연결을 해보기 - shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";
		// 포트번호를 확인하자, localhost는 내 컴퓨터 안에서 사용할때 쓴다.
		// jsp 자동 import : ctrl + shift + m
		Connection con = DriverManager.getConnection(url, "root", "1234"); // 설정한 곳이 위치한 주소를 가져온다.
		System.out.println("2. DB 연결 성공.");

		// 3. SQL문을 만듬 => 해당 부품을 써서 SQL로 인식하게 해야한다.
		// 아래 sql문은 mySQL이 사용한다. 서버는 만들어 주기만 함.
		String sql = "delete from member where id = ?"; // ?는 입력값을 모를 때 넣어둠(입력받은 값을 넣어줄때 사용)
		PreparedStatement ps = con.prepareStatement(sql);// PreparedStatement => sql을 담당하는 부품
		ps.setString(1, id);		
		System.out.println("3. SQL문을 만들기 성공.");

		// 4. 만든 SQL문을 mySQL 서버로 전송
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL 서버로 전송 성공.");
	}
	
	public void update(String id, String pw, String tel) throws Exception {
		// 1. 커넥터를 사용하겠다고 설정.
		Class.forName("com.mysql.jdbc.Driver"); // 클래스는 처음 대문자를 써줘야한다
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공."); // 연결이 성공 하면 브라우저에 성공했음을 띄워준다.

		// 2. db 연결을 해보기 - shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";
		// 포트번호를 확인하자, localhost는 내 컴퓨터 안에서 사용할때 쓴다.
		// jsp 자동 import : ctrl + shift + m
		Connection con = DriverManager.getConnection(url, "root", "1234"); // 설정한 곳이 위치한 주소를 가져온다.
		System.out.println("2. DB 연결 성공.");

		// 3. SQL문을 만듬 => 해당 부품을 써서 SQL로 인식하게 해야한다.
		// 아래 sql문은 mySQL이 사용한다. 서버는 만들어 주기만 함.
		// set(수정) <--> get(얻다)
		String sql = "update member set pw = ?, tel = ? where id = ?"; // ?는 입력값을 모를 때 넣어둠(입력받은 값을 넣어줄때 사용)
		PreparedStatement ps = con.prepareStatement(sql);// PreparedStatement => sql을 담당하는 부품
		ps.setString(1, pw);	// ?의 순서대로 한다.
		ps.setString(2, tel);		
		ps.setString(3, id);
		System.out.println("3. SQL문을 만들기 성공.");

		// 4. 만든 SQL문을 mySQL 서버로 전송
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL 서버로 전송 성공.");
	}
	
	
	public MemberVO read(String id) throws Exception {
		// 1. 커넥터를 사용하겠다고 설정.
		Class.forName("com.mysql.jdbc.Driver"); // 클래스는 처음 대문자를 써줘야한다
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공."); // 연결이 성공 하면 브라우저에 성공했음을 띄워준다.

		// 2. db 연결을 해보기 - shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop2";
		// 포트번호를 확인하자, localhost는 내 컴퓨터 안에서 사용할때 쓴다.
		// jsp 자동 import : ctrl + shift + m
		Connection con = DriverManager.getConnection(url, "root", "1234"); // 설정한 곳이 위치한 주소를 가져온다.
		System.out.println("2. DB 연결 성공.");

		// 3. SQL문을 만듬 => 해당 부품을 써서 SQL로 인식하게 해야한다.
		// 아래 sql문은 mySQL이 사용한다. 서버는 만들어 주기만 함.
		String sql = "select * from member where id = ?"; // ?는 입력값을 모를 때 넣어둠(입력받은 값을 넣어줄때 사용)
		PreparedStatement ps = con.prepareStatement(sql);// PreparedStatement => sql을 담당하는 부품
		ps.setString(1, id);
		System.out.println("3. SQL문을 만들기 성공.");

		// 4. 만든 SQL문을 mySQL 서버로 부터 가져옴
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문을 이용해 mySQL 서버로부터 가져오기 성공.");
		
		// 1. 검색결과가 있는지 체크해야한다.
		//System.out.println(rs.next()); // true이면 있다는 예기
		
		// 2. 만약에 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내주면 된다.
		MemberVO bag = new MemberVO();
		if(rs.next()) {
			// 꺼내주는 방법은 2가지
			// 1. 항목명을 가지고 꺼내기
			// 2. 항목의 인덱스를 가지고 꺼내기
			String id2 = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
		}
		return bag;
	}
}
