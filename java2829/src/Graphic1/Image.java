package Graphic1;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Image extends Thread {
	JLabel image;
	public Image(JLabel image) {
		this.image = image;
	}
	@Override
	public void run() {
		String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
		int cnt = 100;
		while(cnt>0) {
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				cnt--;
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					//interrupt : 일시적 방해, 중단 >> esc, ctrl+c, power-off, alt+f4
				}
			}
		}
	}
}