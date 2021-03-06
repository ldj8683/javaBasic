package 파일저장;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	// 전역변수 t1, t2
	// main이 static 이기 때문에 전역변수들도 static을 해줘야한다.
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setTitle("로그인 창입니다.");
		f.setSize(350, 500);
		f.getContentPane().setLayout(null);
		
		JLabel top = new JLabel("");
		top.setBounds(42, 10, 245, 165);
		f.getContentPane().add(top);
		
		// top에 이미지를 넣기위해서 객체 생성
		ImageIcon icon = new ImageIcon("top.png");
		top.setIcon(icon);
		
		JLabel l2 = new JLabel("아이디");
		l2.setFont(new Font("굴림체", Font.BOLD, 20));
		l2.setBounds(27, 185, 107, 48);
		f.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("패스워드");
		l3.setFont(new Font("굴림체", Font.BOLD, 20));
		l3.setBounds(27, 243, 107, 48);
		f.getContentPane().add(l3);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setBackground(Color.CYAN);
		t1.setFont(new Font("굴림체", Font.BOLD, 20));
		t1.setBounds(143, 186, 160, 47);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setBackground(Color.CYAN);
		t2.setFont(new Font("굴림체", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBounds(143, 243, 160, 47);
		f.getContentPane().add(t2);
		
		JButton login = new JButton("");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 로그인 처리
				String s1=t1.getText();	// id
				String s2=t2.getText(); // pw
				
				// root, 1234 동일하면 "로그인 성공", 동일하지 않으면 "로그인 실패"
				if(s1.equals("root") && s2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					Diary diary = new Diary();
					diary.open();
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		});
		login.setBounds(27, 301, 115, 116);
		f.getContentPane().add(login);
		//ImageIcon icon2 = new ImageIcon("login.png");
		//login.setIcon(icon2);
		login.setIcon(new ImageIcon("login.png"));
		
		JButton reset = new JButton("");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼을 클릭했을 때 처리 내용
				// t1, t2의 입력 내용 지우기.
				t1.setText("");
				t2.setText("");
			}
		});
		reset.setBounds(188, 300, 115, 116);
		f.getContentPane().add(reset);
		ImageIcon icon3 = new ImageIcon("reset.png");
		reset.setIcon(icon3);
		
		JLabel l4 = new JLabel("Login");
		l4.setFont(new Font("굴림체", Font.BOLD, 18));
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setBounds(27, 415, 115, 36);
		f.getContentPane().add(l4);
		
		JLabel l5 = new JLabel("Reset");
		l5.setFont(new Font("굴림체", Font.BOLD, 18));
		l5.setHorizontalAlignment(SwingConstants.CENTER);
		l5.setBounds(188, 415, 115, 36);
		f.getContentPane().add(l5);
		
		f.setVisible(true);
	}
}
