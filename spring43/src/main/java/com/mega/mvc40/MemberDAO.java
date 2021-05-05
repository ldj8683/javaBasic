package com.mega.mvc40;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // MemberDAO dao = new MemberDAO(); 한개만 객체 생성!, 싱글톤!
public class MemberDAO {

	// myBatis싱글톤 주소를 주입!
	@Autowired
	SqlSessionTemplate my;

	//json
	public List<MemberVO> all2() throws Exception {
		return my.selectList("member.all2");
	}
	
	public void create(MemberVO bag) throws Exception {
		//         mapper파일의 namespace이름.태그의id와 일치해야함.
		//         <mapper namespace="member">
		//		      <select id ="insert">
		my.insert("member.insert", bag);
	}

	public MemberVO login(MemberVO bag) {
		return my.selectOne("member.login", bag);
	}
}
