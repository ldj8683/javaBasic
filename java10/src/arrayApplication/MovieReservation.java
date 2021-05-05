package arrayApplication;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MovieReservation {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 450);
		
		//flowlayout : 물 흐르듯이 순서대로 배치를 해주는 부품 필요
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		int[] seat = new int[200];		
		
		for (int i = 0; i < 200; i++) {
			JButton b = new JButton();
			b.setText(i + "");
			f.add(b);
			b.setBackground(Color.yellow);
			
			b.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("버튼을 눌렀군요!");	
					b.setBackground(Color.red);
					System.out.println("좌석번호는 " + b.getText());
					// 좌석 번호가 seat배열의 index 역할! => int
					int index = Integer.parseInt(b.getText()); 
					// 배열의 각 index값이 0인 경우 : 예매가 안 된 상황이라고 가정
					// 배열의 각 index값이 1인 경우 : 예매가 된 상황이라고 가정
					seat[index] = 1;	//seat[100] = 1 -> 클릭한 인덱스가 1이 된다 -> 그 1이 된 자리만 예매가 된 상황이라 생각하면 된다.
					b.setEnabled(false);//클릭기능을 막음
				}
			});			
		}
		
		JButton b2 = new JButton();
		b2.setText("결제하기");
		f.add(b2);
		b2.setBackground(Color.green);
				
		b2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				String seatNo = " ";
				// seat배열에 있는 값을 하나씩 가져와서, 각 값이 1인 경우
				// 예매가 된 자리입니다를 프린트!
				for (int i = 0; i < seat.length; i++) {
					if(seat[i] == 1) {
						seatNo = seatNo + i + " ";
						count++;
					}
				}
				System.out.println(seatNo + ">> 예매된 자리입니다.");
				System.out.println("결제금액은 " + count * 10000 + "원");
			}
		});	
		
		
		
		f.setVisible(true);
	}

}
