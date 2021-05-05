package Graphic2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic3{
	// JFrame이 가지고 있던 메서드, 멤버변수 모두 상속받아 TrheadGraphic 클래스 생성
	// ThreadGraphic에서 JFrame의 것을 다 쓸 수 있음.
	static JLabel count, image, day;// 전역 변수 선언

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(800, 350);
		f.getContentPane().setLayout(null);

		// JLabel을 생성해서  Count가 들어갈 부분
		count = new JLabel("");
		count.setFont(new Font("돋움체", Font.BOLD, 40));
		count.setForeground(Color.BLUE);
		count.setBounds(105, 102, 307, 89);
		f.getContentPane().add(count);

		// JLabel을 생성해서 Image가 들어갈 부분
		image = new JLabel("");
		image.setForeground(Color.BLUE);
		image.setFont(new Font("돋움체", Font.BOLD, 40));
		image.setBounds(401, 30, 259, 175);
		f.getContentPane().add(image);

		// JLabel을 생성해서  Day가 들어갈 부분
		day = new JLabel("");
		day.setForeground(Color.BLUE);
		day.setFont(new Font("돋움체", Font.BOLD, 35));
		day.setBounds(50, 200, 700, 71);
		f.getContentPane().add(day);
		
		// ThreadGraphic 외부에 있는 클래스를 사용
		// Count 메서드를 이용할 cnt 객체 생성
		Count cnt = new Count(count);
		// Count 메서드의 
		cnt.start();
		Day day2 = new Day(day);
		day2.start();
		Image img = new Image(image);
		img.start();
		
		f.setVisible(true);
	}
}
