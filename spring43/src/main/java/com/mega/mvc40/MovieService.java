package com.mega.mvc40;

import org.springframework.stereotype.Component;

@Component
public class MovieService {
	
	public String movieIn(String title, String price) {
		String cont = title + "의 영화 관람료는 " + price + "입니다.";
		return cont;
	}

}
