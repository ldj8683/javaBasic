package shop;

import java.util.ArrayList;

public class ArrayListTest5 {

	public static void main(String[] args) {
		ArrayList<BoardVO> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			BoardVO bag = new BoardVO(); // 가방 생성
			
			// 만들어 놓은 빈 가방에 데이터를 집어 넣음
			// String.valueOf(i) -- > 0 을 "0" 으로
			bag.setId(String.valueOf(i));
			bag.setTitle(String.valueOf(i));
			bag.setContent(String.valueOf(i));
			bag.setWriter(String.valueOf(i));
			
			// 데이터를 넣은 bag를 list에 넣음
			list.add(bag);
		}
		
		System.out.println("리스트의 가방 개수는 " + list.size() + "개"); // 개수 확인
		
		for (int i = 0; i < list.size(); i++) {
			BoardVO bag2 = list.get(i); // 저장된 리스트에서 꺼내서 bag2에 넣음
			// 꺼내서 bag2에 저장된 값들을 하나씩 꺼내줌
			System.out.println("가방에서 꺼낸 id는 " + bag2.getId());
			System.out.println("가방에서 꺼낸 title는 " + bag2.getTitle());
			System.out.println("가방에서 꺼낸 content는 " + bag2.getContent());
			System.out.println("가방에서 꺼낸 wirter는 " + bag2.getWriter());
		}

	}

}
