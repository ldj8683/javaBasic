package 파일저장;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Diary {
	private static JTextField t1;
	private static JTextField t2;

	public void open() {
		JFrame f = new JFrame("일기장입니다.");
		f.getContentPane().setForeground(Color.WHITE);
		f.getContentPane().setBackground(Color.BLACK);
		f.setSize(350, 500);
		f.getContentPane().setLayout(null);

		JLabel l1 = new JLabel("오늘의 날짜 >>");
		l1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		l1.setForeground(Color.WHITE);
		l1.setBounds(12, 10, 157, 44);
		f.getContentPane().add(l1);

		JLabel l2 = new JLabel("오늘의 제목 >>");
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		l2.setBounds(12, 64, 157, 44);
		f.getContentPane().add(l2);

		JLabel l3 = new JLabel("오늘의 내용");
		l3.setForeground(Color.WHITE);
		l3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		l3.setBounds(12, 118, 157, 44);
		f.getContentPane().add(l3);

		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("굴림체", Font.BOLD, 18));
		t1.setBounds(165, 10, 157, 44);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setFont(new Font("굴림체", Font.BOLD, 18));
		t2.setColumns(10);
		t2.setBounds(165, 64, 157, 44);
		f.getContentPane().add(t2);
		
		JTextArea ta1 = new JTextArea();
		ta1.setLineWrap(true);
		ta1.setRows(5);
		ta1.setColumns(10);
		ta1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		ta1.setBounds(12, 157, 310, 240);
		f.getContentPane().add(ta1);

		JButton save = new JButton("파일에 일기 저장");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=t1.getText();
				String s2=t2.getText();
				String s3=ta1.getText();
				try {
					// 해당 폴더와 스트림(연결통로)을 만든다.
					// 스트림의 특징은 한방향!
					FileWriter file = new FileWriter("C:/data/" + s1 + ".txt");
					// 절대 경로를 이용해서 저장이 될 곳을 지정해준다.
					// 상대 경로는 현재 위치를 기준으로해서 상대적으로 써주는 경로
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					file.close(); // 스트림을 다쓰고 나서는 반드시 지원을 해제!
					JOptionPane.showMessageDialog(f, "파일에 저장성공!");
				} catch (IOException e1) {
					System.out.println("파일로 저장하는 중 에러가 발생함!");
					System.out.println("에러정보 >> " + e1.getMessage());
				}
			}
		});
		save.setBackground(Color.LIGHT_GRAY);
		save.setForeground(Color.BLACK);
		save.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		save.setBounds(12, 407, 310, 44);
		f.getContentPane().add(save);


		f.setVisible(true);
	}
}
