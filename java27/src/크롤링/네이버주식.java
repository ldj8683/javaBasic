package 크롤링;

import java.io.FileWriter;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버주식 {

	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("https://finance.naver.com/sise/");
		Document doc = con.get();

		
		Elements div = doc.select("div.rgt ul#popularItemList a");
		Elements div2 = doc.select("div.rgt ul#popularItemList span");
		System.out.println(div.size());

		// span 에서 1개씩 띄어서 주식 가격이 저장되기때문에 j 는 2씩 상승 하기때문에  분할을 해서 배열에 넣어주어야함
		
		String[] a = new String[10];
		int i = 0;
		while (i < a.length) {
			for (int j = 0; j < div2.size(); j += 2) {
				a[i] = div2.get(j).text();
				i++;
			}
		}

		// 출력 확인
		System.out.println();
		for (int k = 0; k < a.length; k++) {
			System.out.println(div.get(k).text() + " \t " + a[k]);
		}

		// text 저장
		try {
			FileWriter f = new FileWriter("C:/data/주식.txt");
			for (int k = 0; k < a.length; k++) {
				f.write(div.get(k).text() + "\t " + a[k] + "\n");
			}
			f.close();
		} catch (Exception e) {
			System.out.println("파일로 저장하는 중 에러가 발생함!");
			System.out.println("에러정보 >> " + e.getMessage());
		}
	}

}
