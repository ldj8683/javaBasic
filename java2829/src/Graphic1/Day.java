package Graphic1;

import java.util.Date;

import javax.swing.JLabel;

public class Day extends Thread {
	JLabel day;
	public Day(JLabel day) {
		this.day = day;
	}
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			Date d = new Date();
			day.setText("날짜>>" + d);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//interrupt : 일시적 방해, 중단 >> esc, ctrl+c, power-off, alt+f4
			}
		}
	}
}
