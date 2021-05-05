package Graphic1;

import java.io.IOException;

import javax.swing.JLabel;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Price extends Thread {
	JLabel price;
	public Price(JLabel price) {
		this.price = price;
	}
	@Override
	public void run() {
		String[] sList = {"005930","035720","068270","035420","000660"};
		String[] list = new String[sList.length];
		// 크롤링
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
			// 데이터를 가져왔을 때 한번에 긴 데이터가 있었고, " "로 구분을 할 수 있기때문에 인덱스를 찾아서 원하는 데이터를 list 배열에 저장
			list[i] = price.text().split(" ")[0];
		}
		int cnt = 100;
		while(cnt>0) {
			for(int i = 0; i < list.length ; i++ ) {
				price.setText(list[i]);
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
