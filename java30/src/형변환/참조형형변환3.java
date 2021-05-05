package 형변환;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 참조형형변환3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		// 자동형변환(LayoutManager(큰) <---- FlowLayout(작))
		f.setLayout(new FlowLayout());
		JButton me = new JButton("나를 눌러요");
		// 자동형변환 (Componenet(큰) <-- JButton(작))
		f.add(me);
		
		f.setVisible(true);
	}

}
