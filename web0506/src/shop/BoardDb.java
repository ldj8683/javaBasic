package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BoardDb {
	public ArrayList<BoardVO> list() throws Exception{
		ArrayList<BoardVO> list = new ArrayList<>();
		
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
		// set(수정) <--> get(얻다)
		String sql = "select * from board"; // ?는 입력값을 모를 때 넣어둠(입력받은 값을 넣어줄때 사용)
		PreparedStatement ps = con.prepareStatement(sql);// PreparedStatement => sql을 담당하는 부품
		System.out.println("3. SQL문을 만들기 성공.");

		// 4. 만든 SQL문을 mySQL 서버로 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문을 mySQL 서버로 전송 성공.");
		
		while(rs.next()) {
			String id2 = rs.getString(1);
			String title = rs.getString(2);
			String content = rs.getString(3);
			String writer = rs.getString(4);
			
			BoardVO bag = new BoardVO();
			bag.setId(id2);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
			
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
		String sql = "select * from board where id = ? and pw = ?"; // ?는 입력값을 모를 때 넣어둠(입력받은 값을 넣어줄때 사용)
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
	
	public void create(BoardVO bag) throws Exception {
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
		String sql = "insert into board values (?, ?, ?, ?)"; // ?는 입력값을 모를 때 넣어둠(입력받은 값을 넣어줄때 사용)
		PreparedStatement ps = con.prepareStatement(sql);// PreparedStatement => sql을 담당하는 부품
		// 전달받은 가방을 꺼내야한다. 따라서 변수 대신 get을 이용한다.
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getTitle());
		ps.setString(3, bag.getContent());
		ps.setString(4, bag.getWriter());
		System.out.println("3. SQL문을 만들기 성공.");

		// 4. 만든 SQL문을 mySQL 서버로 전송
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL 서버로 전송 성공.");
	}
	
	public void update(BoardVO bag) throws Exception {
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
		String sql = "update board set title = ?, content = ? where id = ?"; // ?는 입력값을 모를 때 넣어둠(입력받은 값을 넣어줄때 사용)
		PreparedStatement ps = con.prepareStatement(sql);// PreparedStatement => sql을 담당하는 부품
		ps.setString(1, bag.getTitle());
		ps.setString(2, bag.getContent());
		ps.setString(3, bag.getId());
		System.out.println("3. SQL문을 만들기 성공.");

		// 4. 만든 SQL문을 mySQL 서버로 전송
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL 서버로 전송 성공.");
	}
	
	public void delete(BoardVO bag) throws Exception {
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
		String sql = "delete from board where id = ?"; // ?는 입력값을 모를 때 넣어둠(입력받은 값을 넣어줄때 사용)
		PreparedStatement ps = con.prepareStatement(sql);// PreparedStatement => sql을 담당하는 부품
		ps.setString(1, bag.getId());
		System.out.println("3. SQL문을 만들기 성공.");

		// 4. 만든 SQL문을 mySQL 서버로 전송
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL 서버로 전송 성공.");
	}
	
	public BoardVO read(String id) throws Exception {
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
		String sql = "select * from board where id = ?"; // ?는 입력값을 모를 때 넣어둠(입력받은 값을 넣어줄때 사용)
		PreparedStatement ps = con.prepareStatement(sql);// PreparedStatement => sql을 담당하는 부품
		ps.setString(1, id);
		System.out.println("3. SQL문을 만들기 성공.");

		// 4. 만든 SQL문을 mySQL 서버로 부터 가져옴
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문을 이용해 mySQL 서버로부터 가져오기 성공.");
		
		// 1. 검색결과가 있는지 체크해야한다.
		//System.out.println(rs.next()); // true이면 있다는 예기
		
		// 2. 만약에 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내주면 된다.
		BoardVO bag = new BoardVO();
		if(rs.next()) {
			// 꺼내주는 방법은 2가지
			// 1. 항목명을 가지고 꺼내기
			// 2. 항목의 인덱스를 가지고 꺼내기
			String id2 = rs.getString(1);
			String title = rs.getString(2);
			String content = rs.getString(3);
			String writer = rs.getString(4);
			bag.setId(id2);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
		}
		return bag;
	}
}
