package com.mega.mvc40;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInfoDAO {

	@Autowired
	SqlSessionTemplate my;
	
	//json
	public List<UserInfoVO> userAgeInfo() throws Exception{
		return my.selectList("user_information.userAgeInfo");
	}
	
	public void create(UserInfoVO bag) throws Exception {
		my.insert("user_information.insert", bag);
	}
	public void create2(UserInfoVO bag) throws Exception {
		my.insert("user_information.insert2", bag);
	}
	
	public UserInfoVO userLogin(UserInfoVO bag) throws Exception {
		return my.selectOne("user_information.loginCk", bag);
	}
	
	public void update(UserInfoVO bag) throws Exception {
		my.update("user_information.update", bag);
	}
	
}
