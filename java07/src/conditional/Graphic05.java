package conditional;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Graphic05 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.BLACK);
		f.setSize(600, 650);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("먹고 싶은 음식 >>");
		l1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		l1.setForeground(Color.WHITE);
		l1.setBackground(Color.BLACK);
		l1.setBounds(12, 31, 267, 65);
		f.getContentPane().add(l1);
		
		t1 = new JTextField();
		t1.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		t1.setBounds(291, 31, 281, 65);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton b1 = new JButton("어디로 갈까?");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 첫 번째 문제
				// 먹고 싶은 음식을 입력받아 어디로 갈지 정하기
				String s1 = t1.getText(); // t1 텍스트상자에서 입력을 받아서 s1 문자열 변수에 저장
				
				// s1의 데이터를 원하는 값과 비교해서 참/거짓인지 비교
				// s1에 입력된 데이터는 문자열 이기 때문에 기본데이터형만으로 비교를 하는 비교연산자는 사용이 불가능합니다
				// 문자열을 비교를 할 수 있도록하는 equals() 함수를 이용해서 참/거짓을 판별 
				if(s1.equals("짬뽕")) {
					// 판별된 것이 참일 경우 아래 코드를 실행					
					// 아래 코드는 f라는 프레임 위에 '중국집으로 가자!' 라는 메시지가 들어간 메세지창을 띄워줌
					JOptionPane.showMessageDialog(f, "중국집으로 가자!");
				} else if (s1.equals("우동")) {
					JOptionPane.showMessageDialog(f, "일식집으로 가자!");
				} else if (s1.equals("라면")) {
					JOptionPane.showMessageDialog(f, "분식집으로 가자!");
				} else {
					JOptionPane.showMessageDialog(f, "그냥 집으로 가자!");
				}
			}
		});
		b1.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		b1.setBounds(12, 106, 560, 58);
		f.getContentPane().add(b1);
		
		JLabel l2 = new JLabel("당신의 나이는 >>");
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		l2.setBackground(Color.BLACK);
		l2.setBounds(12, 204, 267, 65);
		f.getContentPane().add(l2);
		
		t2 = new JTextField();
		t2.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		t2.setColumns(10);
		t2.setBounds(291, 204, 281, 65);
		f.getContentPane().add(t2);
		
		JButton b2 = new JButton("나의 내년 나이는?");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t2에 입력된 데이터를 s2라는 문자열 변수에 저장
				String s2 = t2.getText();
				
				// s2에 저장된 문자열 데이터를 Integer.parseInt() 기능을 이용해서 정수형(int)로 캐스팅해 age로 저장
				int age = Integer.parseInt(s2);
				// 원하는 값이 내년의 나이이기 때문에 age 정수형 변수에 1을 더해서 ageNext 변수에 저장 
				int ageNext = age + 1;
				
				// f 프레임 위에  내년 나이에 관한 메시지를 넣어 메시지 창을 띄움
				JOptionPane.showMessageDialog(f, "당신의 내년 나이는 " + ageNext + "세 입니다.");
			}
		});
		b2.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		b2.setBounds(12, 279, 560, 58);
		f.getContentPane().add(b2);
		
		JLabel l3 = new JLabel("나의 국어점수 >>");
		l3.setForeground(Color.WHITE);
		l3.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		l3.setBackground(Color.BLACK);
		l3.setBounds(12, 378, 267, 65);
		f.getContentPane().add(l3);
		
		t3 = new JTextField();
		t3.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		t3.setColumns(10);
		t3.setBounds(291, 378, 281, 65);
		f.getContentPane().add(t3);
		
		JButton b3 = new JButton("두 과목 점수의 평균은?");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t3, t4에 입력된 문자열 데이터를 s3, s4에 각각 저장
				String s3 = t3.getText();
				String s4 = t4.getText();
				
				// s3, s4에 저장된 문자열 데이터를 정수형으로 캐스팅해 kor, math라는 정수형 변수에 저장
				int kor = Integer.parseInt(s3);
				int math = Integer.parseInt(s4);
				
				// 평균을 구하기 위해서 kor, math 두 정수형 변수를 합한다.
				int sum = kor + math;
				// 계산이 되는 두 데이터중 하나라도 double 이면 결과가 double로 계산이 된다.
				// 우리가 원하는 값인 평균은 double인 실수형 데이터이다.
				// '평균을 구하는 두 데이터인 합  / 합해지는 데이터 갯수' 둘 중 하나를 실수형으로 캐스팅을 해줍니다.
				// 저는 sum이라는 정수형 변수를 실수형으로 강제캐스팅을 해주었습니다.
				// 계산된 값을 avg라는 실수형 변수에 저장해줍니다.
				double avg = (double)sum / 2;
				
				// f 라는 프레임위에 뒤에 입력한 메시지를 넣은 메시지창을 띄워줍니다.
				JOptionPane.showMessageDialog(f, "두 과목의 평균은 " + avg + "점 입니다.");
			}
		});
		b3.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		b3.setBounds(12, 533, 560, 58);
		f.getContentPane().add(b3);
		
		JLabel l4 = new JLabel("나의 수학점수 >>");
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		l4.setBackground(Color.BLACK);
		l4.setBounds(12, 457, 267, 65);
		f.getContentPane().add(l4);
		
		t4 = new JTextField();
		t4.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		t4.setColumns(10);
		t4.setBounds(291, 457, 281, 65);
		f.getContentPane().add(t4);
		
		JLabel lline1 = new JLabel("--------------------------------------------------------");
		lline1.setForeground(Color.WHITE);
		lline1.setBackground(Color.BLACK);
		lline1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lline1.setBounds(12, 174, 560, 21);
		f.getContentPane().add(lline1);
		
		JLabel lline2 = new JLabel("--------------------------------------------------------");
		lline2.setForeground(Color.WHITE);
		lline2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lline2.setBackground(Color.BLACK);
		lline2.setBounds(12, 347, 560, 21);
		f.getContentPane().add(lline2);
		f.setVisible(true);
	}
}
