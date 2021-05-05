package cleanupQuiz;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class CalcGraphic {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.getContentPane().setForeground(Color.BLACK);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		f.setTitle("사칙연산 프로그램입니다.");
		
		JLabel l1 = new JLabel("첫번째 숫자 >");
		l1.setForeground(Color.RED);
		l1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		l1.setBounds(12, 10, 194, 66);
		f.getContentPane().add(l1);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		t1.setBounds(218, 10, 254, 66);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel l2 = new JLabel("두번째 숫자 >");
		l2.setForeground(Color.RED);
		l2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		l2.setBounds(12, 86, 194, 66);
		f.getContentPane().add(l2);
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(218, 86, 254, 66);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setForeground(Color.RED);
		t3.setBackground(Color.ORANGE);
		t3.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		t3.setBounds(12, 162, 460, 66);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		JButton b1 = new JButton("덧셈");
		b1.setBackground(new Color(0, 0, 0));
		b1.setForeground(Color.WHITE);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = t1.getText();//t1에서 입력받아서 first에 저장
				String second = t2.getText();//t2에서 입력받아서 second에 저장
				
				int num1 = Integer.parseInt(first);//문자열을 정수형으로 캐스팅
				int num2 = Integer.parseInt(second);//문자열을 정수형으로 캐스팅
				
				Calculator cal = new Calculator();// 계산할 수 있는 객체 생성
				int result = cal.add(num1, num2);// 계산 결과 저장
				t3.setText("더한 결과 : " + result);// 결과를 텍스트 필드 t3에 출력
			}
		});
		b1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		b1.setBounds(12, 238, 217, 66);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("뺄셈");
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = t1.getText();	//t1에서 입력받아서 first에 저장
				String second = t2.getText();	//t2에서 입력받아서 second에 저장
				
				int num1 = Integer.parseInt(first); //문자열을 정수형으로 캐스팅
				int num2 = Integer.parseInt(second);//문자열을 정수형으로 캐스팅
				
				Calculator cal = new Calculator();// 계산할 수 있는 객체 생성
				int result = cal.minus(num1, num2);// 계산 결과 저장
				t3.setText("뺀 결과 : " + result);// 결과를 텍스트 필드 t3에 출력
			}
		});
		b2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		b2.setBounds(241, 238, 231, 66);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("곱셈");
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		b3.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = t1.getText();	//t1에서 입력받아서 first에 저장
				String second = t2.getText();	//t2에서 입력받아서 second에 저장
				
				int num1 = Integer.parseInt(first);		//문자열을 정수형으로 캐스팅
				int num2 = Integer.parseInt(second);	//문자열을 정수형으로 캐스팅
				
				Calculator cal = new Calculator();	// 계산할 수 있는 객체 생성
				int result = cal.mul(num1, num2);	// 계산 결과 저장
				t3.setText("곱한 결과 : " + result); // 결과를 텍스트 필드 t3에 출력
			}
		});
		b3.setBounds(12, 314, 217, 66);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("나눗셈");
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first = t1.getText();	// 텍스트 필드에 입력된 데이터 가져와서 first 문자열 변수에 저장
				String second = t2.getText();	// 텍스트 필드에 입력된 데이터 가져와서 second 문자열 변수에 저장
				
				double num1 = Double.parseDouble(first);	// 문자열을 실수형으로 캐스팅
				double num2 = Double.parseDouble(second);	// 문자열을 실수형으로 캐스팅
				
				Calculator cal = new Calculator();	// 계산을 해주는 클래스의 객체를 생성
				double result = cal.div(num1, num2); // 실수형으로 캐스팅
				String result1 = String.format("%.2f", result);	// 소수점 두자리수까지만 나오도록 문자열 저장 
				t3.setText("나눈 결과 : " + result1); // 계산된 값을 t3 텍스트필드에 출력
			}
		});
		b4.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		b4.setBounds(241, 314, 231, 66);
		f.getContentPane().add(b4);
		
		JButton btnNewButton = new JButton("종료");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	// 시스템 종료
			}
		});
		btnNewButton.setBounds(181, 390, 109, 61);
		f.getContentPane().add(btnNewButton);
		
		
		f.setVisible(true);

	}

}
