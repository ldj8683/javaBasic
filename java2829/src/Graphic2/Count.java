package Graphic2;

import javax.swing.JLabel;

public class Count extends Thread{
	JLabel count;
	public Count(JLabel count) {
		this.count = count;
	}
	@Override
	public void run() {
		for(int i = 500 ; i > 0 ; i --) {
			count.setText("카운트 >> " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//interrupt : 일시적 방해, 중단 >> esc, ctrl+c, power-off, alt+f4
			}
		}
	}
}
