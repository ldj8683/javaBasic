package shop;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListTest3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i<3 ; i++) {
			String data = JOptionPane.showInputDialog("하고싶은 말 입력: ");
			list.add(data);
		}
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
	}

}
