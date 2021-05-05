package classPractice;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GraphicTest {
	public static void main(String[] arg) {
		// void는 return이 없다.
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		JButton b = new JButton();
		b.setText("나를 눌러요");
		b.setBackground(Color.red);
				
		f.add(b);
		// java에서는 입력받는 매개변수가 다르면 다르게 인식하기 때문에 같은 이름도 다른 매개변수라면 사용이 가능하다.
		
		Font font = new Font("궁서", 1, 50);
		b.setFont(font);
		
		f.setVisible(true);
	}
}
