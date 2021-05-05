package com.mega.mvc40;

//import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //어노테이션, 표시
public class PersonController {
	
	@Autowired
	PersonDAO dao; //싱글톤으로 만들어진 객체의 주소를 넣어주세요.
	
	@RequestMapping("insertperson")
	public void insert(PersonVO bag) throws Exception {
		dao.create(bag);
	}
}
