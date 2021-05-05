package grapicProgram;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import classPractice.Calculator;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcProgram {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("숫자1 >>");
		l1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		l1.setBounds(12, 10, 142, 55);
		f.getContentPane().add(l1);
		
		t1 = new JTextField();
		t1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		t1.setBounds(166, 10, 306, 55);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel l2 = new JLabel("숫자2 >>");
		l2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		l2.setBounds(12, 75, 142, 55);
		f.getContentPane().add(l2);
		
		t2 = new JTextField();
		t2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(166, 75, 306, 55);
		f.getContentPane().add(t2);
		
		JButton b1 = new JButton("더하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1, t2에 입력한 값을 가지고 와야함
				String s1 = t1.getText();	// 숫자1 입력값
				String s2 = t2.getText();	// 숫자2 입력값
				
				// String을 int로 변환해주어야함
				// 반환값이 있어야지만 변수에 결과값을 넣을 수 있음.
				int s1Int = Integer.parseInt(s1); // 입력받은 String 형식의 s1을 정수형으로 캐스팅해서 s1Int 변수에 저장
				int s2Int = Integer.parseInt(s2); // 입력받은 String 형식의 s2을 정수형으로 캐스팅해서 s2Int 변수에 저장
								
				Calculator cal = new Calculator();// Calculator 클래스를 불러와 cal 객체 생성
				int result = cal.add(s1Int, s2Int);	// 사칙연산 중 덧셈에 해당하는 add()함수를 사용해서 연산 후 반환된 값을 result 변수에 저장
				// 반환값이 있어야 프린트도 가능하고 변수에 결과값을 넣어줄 수 있다.
				System.out.println("====================="); // 구분하기 위해서 출력
				System.out.println("더하기 버튼 클릭됨"); // 설명 출력
				System.out.println("더하기 결과 : " + result); // 최종 결과를 출력
				t3.setText("더한 값 : " + result);	// 더한 값을 f 프레임에 t3라는 텍스트필드에 출력
			}
		});
		b1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		b1.setBounds(12, 213, 222, 55);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("빼기");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1 = t1.getText();	// 숫자1 입력값
				String s2 = t2.getText();	// 숫자2 입력값
				
				int s1Int = Integer.parseInt(s1);
				int s2Int = Integer.parseInt(s2);
				
				Calculator cal = new Calculator();
				int result = cal.minus(s1Int, s2Int);
				System.out.println("=====================");
				System.out.println("빼기 버튼 클릭됨");
				System.out.println("빼기 결과 : " + result);
				t3.setText("뺀 값 : " + result);
			}
		});
		b2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		b2.setBounds(250, 213, 222, 55);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("곱하기");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1 = t1.getText();	// 숫자1 입력값
				String s2 = t2.getText();	// 숫자2 입력값
				
				int s1Int = Integer.parseInt(s1);
				int s2Int = Integer.parseInt(s2);
				
				Calculator cal = new Calculator();
				int result = cal.mul(s1Int, s2Int);
				System.out.println("=====================");
				System.out.println("곱하기 버튼 클릭됨");
				System.out.println("곱하기 결과 : " + result);
				//f.setTitle("곱한 값은 " + result);
				t3.setText("곱한 값 : " + result);
			}
		});
		b3.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		b3.setBounds(12, 278, 222, 55);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("나누기");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();	// 숫자1 입력값
				String s2 = t2.getText();	// 숫자2 입력값
				
				double s1Dou = Double.parseDouble(s1);	// 입력받은 String s1을 실수형으로 캐스팅해서 s1Dou 변수에 저장
				double s2Dou = Double.parseDouble(s2);	// 입력받은 String s2을 실수형으로 캐스팅해서 s2Dou 변수에 저장
				
				Calculator cal = new Calculator();	// 계산이 가능한 Calculator 클래스의 객체를 생성
				double result = cal.div(s1Dou, s2Dou);	// 나눗셈이 가능한 div() 함수의 기능을 이용해서 연산 후 반환되는 값을  실수형 변수 result에 저장
				
				System.out.println("=====================");
				System.out.println("나누기 버튼 클릭됨");
				System.out.println("나누기 결과 : " + result);	// 반환된 값이 저장된 실수형 변수 result를 출력
				System.out.printf("%.3f",result);
				t3.setText("나눈 값 : " + result);
			}
		});
		b4.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		b4.setBounds(250, 278, 222, 55);
		f.getContentPane().add(b4);
		
		JLabel l3 = new JLabel("사칙 연산");
		l3.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		l3.setBounds(176, 162, 142, 41);
		f.getContentPane().add(l3);
		
		t3 = new JTextField();
		t3.setBackground(Color.YELLOW);
		t3.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		t3.setColumns(10);
		t3.setBounds(12, 344, 460, 55);
		f.getContentPane().add(t3);
		f.setVisible(true);
	}
}
