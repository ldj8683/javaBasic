package Graphic2;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Image extends Thread {
	JLabel image;
	public Image(JLabel image) {
		this.image = image;
	}
	@Override
	public void run() {
		String[] list = {"001.png", "002.png", "003.png", "004.png", "005.png"};
		int cnt = 100;
		while(cnt>0) {
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				cnt--;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					//interrupt : 일시적 방해, 중단 >> esc, ctrl+c, power-off, alt+f4
				}
			}
		}
	}
}
