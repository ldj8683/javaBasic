package 컬렉션;

import java.util.ArrayList;

public class Quiz05 {

	public static void main(String[] args) {
		ArrayList<String> sub = new ArrayList<String>();
		// sub이라는 ArrayList에 시험일정 순서에 따라서 추가
		sub.add("국어");
		sub.add("수학");
		sub.add("영어");
		sub.add("컴퓨터");
		
		// 추가한 전체 시험 과목 출력
		System.out.println("전체 시험볼 과목" + sub);
		
		// 반복문을 이용해서 맨 앞에 것을 차례로 지우면서 출력
		for (int i = 0; i <= sub.size(); i++) {
			sub.remove(0);
			System.out.println((i+1) + "일차 시험 본 후 남은 과목 >> " + sub);
		}
		
	}
}
