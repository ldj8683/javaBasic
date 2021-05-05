package com.mega.mvc40;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@RequestMapping("product")
	public void product(ProductVO vo, Model model) {
		System.out.println("프로덕트 컨트롤러까지 넘어왔음 >> " + vo);
		model.addAttribute("vo", vo);
	}
}
