package loginTest;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class memberDB {
	Connection con;
	
	public memberDB() throws Exception {
		// 1. 커넥터를 사용하겠다고 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공");
		
		// 2. db 연결하기
		String url = "jdbc:mysql://localhost:3306/logintest?useUnicode=true&characterEncoding=utf8";
		con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. DB연결 설정");
	}
	
	public void create(memberVO bag) throws Exception{
		// 3. SQL문 만들기
		String sql = "insert into memberinfo values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getPw());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());
		System.out.println("3. SQL문 만들기 성공");
		
		// 4. SQL문 서버로 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 mySQL 서버로 전송 성공");
		
		con.close();
	}
	
	public boolean check(String id, String pw) throws Exception {
		String sql = "select * from memberinfo where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. SQL문 만들기 성공");
		
		ResultSet rs = ps.executeQuery();
		System.out.println("4. 서버로부터 데이터 가져오기 성공");
		
		boolean result = false;
		if(rs.next()) {
			result = true;
		}
		con.close();
		return result;
	}
	
	/*
	 * public void update(memberVO bag) throws Exception {
	 * 
	 * }
	 */
	
	public memberVO read(String id) throws Exception{
		// 3. SQL문을 만듬
		String sql = "select * from memberinfo where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문 만들기 성공");
		
		// 4. SQL문에 해당하는 데이터를 mySQL 서버로부터 가져옴
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문을 이용해 mySQL 서버로부터 가져오기 성공");
		
		memberVO bag = new memberVO();
		if(rs.next()) {
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
	
	public void update(memberVO bag) throws Exception{
		String sql = "update memberinfo set pw = ?, name = ?, tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getPw());
		ps.setString(2, bag.getName());
		ps.setString(3, bag.getTel());
		ps.setString(4, bag.getId());
		System.out.println("3. SQL 문을 만들기 성공");
		
		//4. SQL문 서버로 전송
		ps.executeUpdate();
		System.out.println("4. 서버로 전송 성공");
		
		con.close();
		
	}
	
	public void delete(String id) throws Exception {
		String sql = "delete from memberinfo where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문 생성 성공");
		
		//4. 서버로 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 서버로 전송 성공");
		
		con.close();
		
	}
}
