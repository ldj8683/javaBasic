package shop;

import java.util.ArrayList;

public class ArrayListTest4 {

	public static void main(String[] args) {
		ArrayList<MemberVO> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			// 가방을 만들어서
			MemberVO bag = new MemberVO();
			
			// 가방에 값들을 넣은 다음에
			// String.valueOf(i) -- > 0 을 "0" 으로
			bag.setId(String.valueOf(i));
			bag.setPw(i + "");
			bag.setName(i + "");
			bag.setTel(i + "");

			// list에 넣음
			list.add(bag);
		}
		System.out.println("리스트의 가방 개수는 " + list.size() + "개");
		
		for(int i = 0 ; i < list.size(); i++) {
			MemberVO bag2 = list.get(i);
			System.out.println(bag2.getId());
			System.out.println(bag2.getPw());
			System.out.println(bag2.getName());
			System.out.println(bag2.getTel());
		}
	}

}
