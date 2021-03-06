package Graphic1;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class UpDown extends Thread {
	JLabel updown;
	public UpDown(JLabel upDown2) {
		updown = upDown2;
	}
	@Override
	public void run() {
		String[] sList = {"005930","035720","068270","035420","000660"};
		String[] list2 = new String[sList.length];
		for (int i = 0; i < sList.length; i++) {
			Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code="+sList[i]);
			Document doc = null;
			try {
				doc = con.get();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Elements price = doc.select("div.rate_info div.today");
			// 상승 하락에 관련된 부분이 4번째 인덱스에 있기때문에 split을 이용해서 4번째 위치한 인덱스를 가져왔고, equals를 이용해서 상승인지 하락인지 구분
			if(price.text().split(" ")[3].equals("상승")) {
				// 상승일 때 상승에 해당하는 이미지를 저장
				list2[i] = "01.png";
			} else {
				// 하락일때 하락에 해당하는 이미지를 저장
				list2[i] = "02.png";
			}
		}
		int cnt = 100;
		while(cnt>0) {
			for(int i = 0; i < sList.length ; i++ ) {
				// 저장된 이미지 이름을 이용해서 ImageIcon을 이용해서 출력
				ImageIcon icon = new ImageIcon(list2[i]);
				updown.setIcon(icon);
				try {
					Thread.sleep(1950);
				} catch (InterruptedException e) {
					//interrupt : 일시적 방해, 중단 >> esc, ctrl+c, power-off, alt+f4
				}
				cnt--;
			}
		}
	}
}
