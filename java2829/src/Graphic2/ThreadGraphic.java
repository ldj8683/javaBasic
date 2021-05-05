package Graphic2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic extends JFrame {
	private static final long serialVersionUID = 1L;
	// JFrame이 가지고 있던 메서드, 멤버변수 모두 상속받아 TrheadGraphic 클래스 생성
	// ThreadGraphic에서 JFrame의 것을 다 쓸 수 있음.
	JLabel count, image, day;// 전역 변수 선언

	// 기본 생성자
	// void 를 넣으면 생성자가 아니게 된다
	public ThreadGraphic() {
		// 객체 생성이 이부분이 자동으로 실행이 될 것이다.
		// 객체를 생성하자마자 뜨게하고 싶으면 함수 이름 그대로 --> 생성자!
		// or 메서드를 이용하고 싶을때는 public void open()
		
		// JFrame 전체 틀 설정
		getContentPane().setBackground(Color.YELLOW);
		setSize(800, 350);
		getContentPane().setLayout(null);

		// JLabel을 생성해서  Count가 들어갈 부분
		count = new JLabel("");
		count.setFont(new Font("돋움체", Font.BOLD, 40));
		count.setForeground(Color.BLUE);
		count.setBounds(105, 102, 307, 89);
		getContentPane().add(count);

		// JLabel을 생성해서 Image가 들어갈 부분
		image = new JLabel("");
		image.setForeground(Color.BLUE);
		image.setFont(new Font("돋움체", Font.BOLD, 40));
		image.setBounds(401, 30, 259, 175);
		getContentPane().add(image);

		// JLabel을 생성해서  Day가 들어갈 부분
		day = new JLabel("");
		day.setForeground(Color.BLUE);
		day.setFont(new Font("돋움체", Font.BOLD, 35));
		day.setBounds(50, 200, 700, 71);
		getContentPane().add(day);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// 
		ThreadGraphic t = new ThreadGraphic();
		
		// ThreadGraphic 외부에 있는 클래스를 사용
		// Count 메서드를 이용할 cnt 객체 생성
		Count cnt = new Count(t.count);
		// Count 메서드의 
		cnt.start();
		Day day2 = new Day(t.day);
		day2.start();
		Image img = new Image(t.image);
		img.start();
	}
}
