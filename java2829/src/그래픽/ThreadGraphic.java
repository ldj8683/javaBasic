package 그래픽;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;

public class ThreadGraphic extends JFrame {

	private static final long serialVersionUID = 1L;
	// JFrame이 가지고 있던 메서드, 멤버변수 다 가지고 태어남
	// ThreadGraphic에서 JFrame의 것을 다 쓸 수 있음
	JLabel count, image, day;
	int cnt = 100;

	// 기본 생성자
	public ThreadGraphic() {
		// 객체 생성이 이부분이 자동으로 실행이 될 것이다.
		getContentPane().setBackground(Color.YELLOW);
		setSize(800, 350);
		getContentPane().setLayout(null);

		count = new JLabel("");
		count.setFont(new Font("돋움체", Font.BOLD, 40));
		count.setForeground(Color.BLUE);
		count.setBounds(105, 102, 307, 89);
		getContentPane().add(count);

		image = new JLabel("");
		image.setForeground(Color.BLUE);
		image.setFont(new Font("돋움체", Font.BOLD, 40));
		image.setBounds(401, 30, 259, 175);
		getContentPane().add(image);

		day = new JLabel("");
		day.setForeground(Color.BLUE);
		day.setFont(new Font("돋움체", Font.BOLD, 40));
		day.setBounds(71, 215, 623, 71);
		getContentPane().add(day);

		Count cnt = new Count();
		cnt.start();

		Day day = new Day();
		day.start();
		
		Image img = new Image();
		img.start();

		setVisible(true);
	}
	// 파라메터 생성자, 생성자 오버로딩

	public static void main(String[] args) {
		new ThreadGraphic();
//		ThreadGraphic t = new ThreadGraphic();

	}

	public class Count extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("Count >> " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	public class Day extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date d = new Date();
				day.setText(d + "");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	public class Image extends Thread {
		String[] list = {"001.png", "002.png", "003.png", "004.png", "005.png"};

		@Override
		public void run() {
			while (cnt > 0) {
				for (int i = 0; i < list.length; i++) {
					ImageIcon icon = new ImageIcon(list[i]);
					image.setIcon(icon);
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
					}
					cnt--;
				}
			}
		}
	}

}
