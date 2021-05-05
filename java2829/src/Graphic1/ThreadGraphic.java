package Graphic1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import Graphic2.Day;

import java.awt.Color;

public class ThreadGraphic extends JFrame{
	private static final long serialVersionUID = 1L;
	// 전역변수를 설정해서 아무곳에서나 사용이 가능하도록 함
	JLabel name, image, day, price, updown;

	//기본생성자
	public ThreadGraphic() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setForeground(Color.BLACK);
		setTitle("주식현황");
		setSize(800, 400);
		getContentPane().setLayout(null);
		
		name = new JLabel("");
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(new Font("돋움", Font.BOLD, 20));
		name.setBounds(240, 74, 474, 67);
		getContentPane().add(name);
		
		image = new JLabel("");
		image.setHorizontalAlignment(SwingConstants.CENTER);
		image.setFont(new Font("돋움", Font.BOLD, 30));
		image.setBounds(78, 74, 150, 150);
		getContentPane().add(image);
		
		day = new JLabel("");
		day.setHorizontalAlignment(SwingConstants.CENTER);
		day.setFont(new Font("돋움", Font.BOLD, 30));
		day.setBounds(64, 234, 650, 88);
		getContentPane().add(day);
		
		price = new JLabel("");
		price.setHorizontalAlignment(SwingConstants.CENTER);
		price.setFont(new Font("돋움", Font.BOLD, 30));
		price.setBounds(303, 151, 309, 67);
		getContentPane().add(price);
		
		updown = new JLabel("");
		updown.setHorizontalAlignment(SwingConstants.CENTER);
		updown.setFont(new Font("돋움", Font.BOLD, 30));
		updown.setBounds(267, 151, 51, 50);
		getContentPane().add(updown);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// 외부 클래스와 위에 빼놓은 프레임이 있는 생성자를 가져오기위해서 객체 t를 생성
		ThreadGraphic t = new ThreadGraphic();
		// 각 외부 클래스를 사용하기 위해서 객체를 생성하고 thread 시작
		Image img = new Image(t.image);
		img.start();
		Name na = new Name(t.name);
		na.start();
		Price m = new Price(t.price);
		m.start();
		UpDown ud = new UpDown(t.updown);
		ud.start();
		Day day2 = new Day(t.day);
		day2.start();
	}
}
