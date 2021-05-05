package com.mega.mvc40;

import java.util.Random;

import org.springframework.stereotype.Component;



//service 부분 만들기
@Component
public class TextService {
	
	public int text(String tel) {
		//랜덤한 값 6자리 만들어서 controller에게 리턴 시켜줘야한ㅁ
		Random r = new Random();
		int num2 = r.nextInt(900000) + 100000; // 100000~999999 의 정수
		return num2;
	}
	
}
