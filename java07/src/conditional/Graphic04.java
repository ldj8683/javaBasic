package conditional;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Graphic04 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		t1.setBounds(235, 79, 264, 68);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		t2.setColumns(10);
		t2.setBounds(235, 174, 264, 68);
		f.getContentPane().add(t2);
		
		JButton b1 = new JButton("더하기");
		b1.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1. 입력한 t1,t2 값을 가지고 와야한다.
				// 외부에서 입력한 데이터 타입은 모두 String이다.
				// t1과 t2에 입력된 String을 각각 s1과 s2라는 문자열 변수에 저장.
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				//2. 내가 지정한 id/pw가 동일한지 확인
				// 자바에서는 + 연산자를 쓸때 하나라도 String 이면 결합의 의미를 갖는다.
				// 부품과 기본형데이터 감의 cpu가 하는 캐스팅은 불가능하다. --> 바꾸어주는 부품을 써야한다.
				// Integer 라는 클래스 안에 있는 parseInt는 String을 Int형 데이터로 캐스팅해준다.
				
				// s1의 String 데이터를 CPU에 가져와서 Integer.parseInt()로 정수형 데이터로 캐스팅해서 num1 이라는 정수형 변수에 저장.
				int num1 = Integer.parseInt(s1);
				int num2 = Integer.parseInt(s2);
				
				// 캐스팅된 num1과 num2를 cpu가 연산을 해서 sum이라는 정수형 변수에 저장.
				int sum = num1 + num2;
				
				//3. 결과를 출력
				//메시지를 출력되는 창을 띄워준다. f는 f라는 프레임위에 메시지창을 띄워준다는 의미이고,
					//그 뒤에 "숫자1 + 숫자2 : " + sum은 출력할 메시지를 나타냄
				JOptionPane.showMessageDialog(f, "숫자1 + 숫자2 : " + sum);
			}
		});
		b1.setBounds(91, 269, 408, 68);
		f.getContentPane().add(b1);
		
		JLabel l1 = new JLabel("숫자1:");
		l1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		l1.setBounds(91, 79, 132, 68);
		f.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("숫자2:");
		l2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		l2.setBounds(91, 174, 132, 68);
		f.getContentPane().add(l2);
		
		JButton b2 = new JButton("빼기");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();	// t1입력창의 String 데이터를 가져와 s1이라는 문자열 변수에 저장
				String s2 = t2.getText();	// t2입력창의 String 데이터를 가져와 s2이라는 문자열 변수에 저장
				
				int num1 = Integer.parseInt(s1);	// s1의 문자열형태를 Integer.parseInt()를 이용해서 정수형(int)으로 캐스팅하여 num1에 저장
				int num2 = Integer.parseInt(s2);	// s2의 문자열형태를 Integer.parseInt()를 이용해서 정수형(int)으로 캐스팅하여 num2에 저장
				int sub = num1 - num2;	// 정수형 변수인 num1, num2를 연산을 해서 sub이라는 정수형 변수에 저장
				
				JOptionPane.showMessageDialog(f, "숫자1 - 숫자2 : " + sub);	// 
				
			}
		});
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		b2.setBackground(Color.BLACK);
		b2.setBounds(91, 347, 408, 68);
		f.getContentPane().add(b2);
		f.setSize(600, 600);
		f.setVisible(true);
	}
}
