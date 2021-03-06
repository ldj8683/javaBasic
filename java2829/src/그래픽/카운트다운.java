package 그래픽;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Date;

public class 카운트다운 extends JFrame {
	// 카운트다운 클래서 노란색 줄이라 그냥 해결만 해놓은것, 지금은 무시 ㄱㄱ
	private static final long serialVersionUID = 1L;
	
	// 객체생성하지 않아도 언제든지 static 메서드에서 접근해서 사용하려면 멤버변수도 반드시 static이 되어야 한다.
	JLabel count, image, day;
	// 500초 동안 이미지가 계속 돌게하기 위해서 while문에 사용되게 함
	int cnt2 = 100;

	public 카운트다운() {

		getContentPane().setBackground(Color.LIGHT_GRAY);
		setSize(800, 300);
		getContentPane().setLayout(null);

		count = new JLabel("");
		count.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		count.setBounds(91, 55, 300, 96);
		getContentPane().add(count);

		image = new JLabel("");
		image.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		image.setBounds(404, 10, 246, 171);
		getContentPane().add(image);
		/*
		 * ImageIcon icon = new ImageIcon("001.png"); image.setIcon(icon);
		 */

		day = new JLabel("");
		day.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		day.setBounds(91, 189, 575, 62);
		getContentPane().add(day);
		/*
		 * Date date = new Date(); day.setText(date + "");
		 */

		// Count Thread
		//카운트2 cnt = new 카운트2();
		//cnt.start();
		
		// Day Thread
		날짜2 day = new 날짜2();
		day.start();
		
		// Image Thread
		이미지2 img = new 이미지2();
		img.start();

		setVisible(true);
	}

	public static void main(String[] args) {
		카운트다운 t = new 카운트다운();
		// 외부에 있는 Count 클래스를 가져와서 사용
		Count c2 = new Count(t.count);
		c2.start();
	}// main end

	// 변수를 공유해야하는 두 클래스가 있다면 클래스안에 클래스를 낄 수 있다.
	// inner class(안쪽 클래스), 내부 클래스
	// 내부클래스는 독립적으로 쓸 수 없다 외부에서 쓸 수 없다.
	public class 카운트2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {
				// System.out.println("카운트 >> " + i);
				// JLabel에 넣어줌
				count.setText("카운트 >> " + i);
				try {
					// 0.5초에 한번씩 실행
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// interrupt : 일시적 방해, 중단 >> esc, ctrl+c, power-off, alt+f4
				}
			}
		}
	}

	public class 날짜2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date2 = new Date();
				// JLabel에 넣어줌
				day.setText("날짜>>" + date2);
				try {
					// 1초에 한번씩 실행
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// interrupt : 일시적 방해, 중단 >> esc, ctrl+c, power-off, alt+f4
				}
			}
		}
	}

	public class 이미지2 extends Thread {
		@Override
		public void run() {
			String[] list = { "001.png", "002.png", "003.png", "004.png", "005.png" };
			//cnt2가 감소하면서 0이 되면 반복을 그만둠
			while(cnt2>0) {
				for (int i = 0; i < list.length; i++) {
					// JFrame에 이미지를 넣을수 있게 하는 객체 생성
					ImageIcon icon = new ImageIcon(list[i]);
					image.setIcon(icon);
					// 0이 될때까지 줄어들면서 반복하기 위해서  cnt2-- 를 주었습니다.
					cnt2--;
					try {
						// 5초에 한번씩 이미지가 바뀌도록 설정
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// interrupt : 일시적 방해, 중단 >> esc, ctrl+c, power-off, alt+f4
					}
				}
			}
		}
	}
}// class end
