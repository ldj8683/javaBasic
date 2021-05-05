package com.mega.mvc40;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserInfoController {
	// 기능별 메서드
	
	@Autowired
	UserInfoDAO dao;
	
	@RequestMapping("userAgeInfo")
	@ResponseBody
	public List<UserInfoVO> userAgeInfo() throws Exception{
		List<UserInfoVO> userAgeInfo = dao.userAgeInfo();
		return userAgeInfo;
	}
	
	@RequestMapping("create")
	public void create(UserInfoVO bag) throws Exception{
		String uaddrString = bag.getUaddrRoad() + ", " + bag.getUaddrDetail();
		bag.setUaddr(uaddrString);
		dao.create(bag);
	}
	
	@RequestMapping("userLogin")
	public String userLogin(UserInfoVO bag, HttpSession session) throws Exception{
		UserInfoVO vo = dao.userLogin(bag);
		if(vo != null) {
			System.out.println("해당 id/pw가 있음.");
			session.setAttribute("userId", vo.getUserid());
			return "redirect:MainPage.jsp";
		} else {
			System.out.println("해당 id/pw가 없음.");
			return "notExistId";
		}
	}
	
	
	@RequestMapping("update")
	public void update(UserInfoVO bag) throws Exception{
		System.out.println(bag);
	}
	
	@RequestMapping("insertUserId")
	public void insert2(UserInfoVO bag) throws Exception{
		dao.create2(bag);
	}
}
