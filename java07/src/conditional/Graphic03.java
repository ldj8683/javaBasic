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

public class Graphic03 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		t1.setBounds(234, 139, 264, 68);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		t2.setColumns(10);
		t2.setBounds(234, 234, 264, 68);
		f.getContentPane().add(t2);
		
		JButton b1 = new JButton("로그인");
		b1.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1. 입력한 t1,t2 값을 가지고 와야한다.
				// 외부에서 입력한 데이터 타입은 모두 String이다.
				String id = t1.getText();
				String pw = t2.getText();
				
				//2. 내가 지정한 id/pw가 동일한지 확인
				//3. 결과를 출력
				if(id.equals("root") && pw.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}				
			}
		});
		b1.setBounds(90, 329, 408, 68);
		f.getContentPane().add(b1);
		
		JLabel l1 = new JLabel("아 이 디:");
		l1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		l1.setBounds(90, 139, 132, 68);
		f.getContentPane().add(l1);
		
		JLabel l1_1 = new JLabel("패스워드:");
		l1_1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		l1_1.setBounds(90, 234, 132, 68);
		f.getContentPane().add(l1_1);
		f.setSize(600, 600);
		f.setVisible(true);
	}
}
