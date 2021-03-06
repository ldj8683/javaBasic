package Graphic1;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Crowling {

	public static void main(String[] args) throws IOException {
		String[] sList = {"005930","035720","068270","035420","000660"};
		for (int i = 0; i < sList.length; i++) {
			Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code="+sList[i]);
			Document doc = con.get();
			
			Elements name = doc.select("div.wrap_company a");
			Elements code = doc.select("span.code");
			Elements price = doc.select("div.rate_info div.today");
			//System.out.println(name.size());
			//System.out.println(code.size());
			//System.out.println(info.size());
			System.out.println("=============");
			System.out.println(name.text());
			System.out.println(code.text());
			System.out.println(price.text());
			System.out.println(price.text().split(" ")[0]);
			System.out.println(price.text().split(" ")[3]+".png");
		}
		System.out.println("=============");
	}

}
