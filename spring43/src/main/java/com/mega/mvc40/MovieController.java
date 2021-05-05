package com.mega.mvc40;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@Autowired
	MovieService ms;
	
	@RequestMapping("movie2")
	public void movie2(MovieVO vo, Model model) {
		System.out.println("무비 컨트롤러까지 넘어왔습니다.");
		String result = ms.movieIn(vo.getmTitle(), vo.getmPrice());
		System.out.println(result);
		model.addAttribute("result", result);
	}
}
