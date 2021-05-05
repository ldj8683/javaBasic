package 컬렉션;

import java.util.ArrayList;

public class Quiz03 {

	public static void main(String[] args) {
		// 등수 이기때문에 순서가 의미가 있기때문에 ArrayList 이용
		ArrayList<String> rank = new ArrayList<String>();
		
		// 등수에 맞춰서 1~4등까지 추가
		rank.add("박스키");
		rank.add("송스키");
		rank.add("김스키");
		rank.add("정스키");
		
		// 확인을 위해 출력
		System.out.println(rank);
		System.out.println("------------------------");
		
		// 2등이 반칙을 했기때문에 탈락함을 알려줌
		System.out.println("2등의 반칙으로 탈락");
		
		// 탈락했기 때문에 ArrayList에서 2등에 해당하는 인덱스 1을 삭제
		rank.remove(1);
		
		// rank의 크기만큼 반복해서 출력
		for(int i = 0; i < rank.size(); i++ ) {
			System.out.println((i+1) + "등 >> " + rank.get(i));
		}
	}

}
