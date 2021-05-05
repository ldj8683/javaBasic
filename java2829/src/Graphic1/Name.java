package Graphic1;

import java.io.IOException;

import javax.swing.JLabel;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Name extends Thread{
	JLabel name;
	public Name(JLabel name) {
		this.name = name;
	}
	@Override
	public void run() {
		// 임의로 정한 주식의 종목 코드
		String[] sList = {"005930","035720","068270","035420","000660"};
		// 종목 코드를 크롤링해서 얻은 데이터를 한번에 출력하기 위한 객체 생성
		String[] list = new String[sList.length];
		
		// 종목 코드를 저장한 크기만큼 반복
		for (int i = 0; i < sList.length; i++) {
			Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code="+sList[i]);
			Document doc = null;
			try {
				doc = con.get();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// 각 종목의 이름과 코드를 가져옴
			Elements name = doc.select("div.wrap_company a");
			Elements code = doc.select("span.code");
			// 가져온 코드들을 list 배열에 넣음
			list[i] = name.text() + "(종목번호 >> " + code.text() + ")";
		}
		// 100번 반복하게 하기 위해서 선언
		int cnt = 100;
		// 
		while(cnt>0) {
			for(int i = 0; i < list.length ; i++ ) {
				name.setText(list[i]);
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
