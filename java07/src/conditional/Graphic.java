package conditional;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Graphic {

	public static void main(String[] args) {
		// 각 변수명으로 할당하겠다.
		// JFrame 프레임을 만들겠다. 
		JFrame f = new JFrame();
		// f 라는 프레임의 크기를 정함
		f.setSize(500, 500);
		
		JButton b1 = new JButton("북쪽 버튼");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		f.getContentPane().add(b1, BorderLayout.NORTH);
		
		JButton b2 = new JButton("서쪽 버튼");
		f.getContentPane().add(b2, BorderLayout.WEST);
		
		JButton b3 = new JButton("가운데 버튼");
		b3.setFont(new Font("굴림", Font.BOLD, 30));
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(b3, BorderLayout.CENTER);
		
		JButton b4 = new JButton("동쪽 버튼");
		f.getContentPane().add(b4, BorderLayout.EAST);
		
		JButton b5 = new JButton("남쪽 버튼");
		f.getContentPane().add(b5, BorderLayout.SOUTH);
		// f 라는 프레임을 띄워줌
		//(최종적으로 조립한 것들을 띄워주는 것이기 때문에 창을 만드는 코딩에서 맨 마지막에 넣어줘야함)
		f.setVisible(true);
			
		
	}

}
