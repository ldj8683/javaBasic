package 크롤링;


import java.io.FileWriter;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class OPGG {

	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("https://overwatch.op.gg/heroes/global");
		Document doc = con.get();
		
		Elements num = doc.select("td.Id");
		Elements hero = doc.select("span.Name");
		System.out.println(num.size());
		System.out.println(hero.size());
		
		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i).text() + " \t " + hero.get(i).text());
		}
		
		try {
			FileWriter f = new FileWriter("C:/data/lolrank.txt");
			for (int i = 0; i < num.size(); i++) {
				f.write(num.get(i).text() + " \t " + hero.get(i).text() + "\n");
			}
			f.close();
		} catch (Exception e) {
			System.out.println("파일로 저장하는 중 에러가 발생함!");
			System.out.println("에러정보 >> " + e.getMessage());
		}
	}
}
