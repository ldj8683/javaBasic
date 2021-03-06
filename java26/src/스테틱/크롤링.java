package 스테틱;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링 {

	public static void main(String[] args) throws Exception {
		// . .을 가지고 계속 해서 연결하는 방식 => 체인식 연결 방식
		// 1. 사이트에 연결하세요
		Connection con = Jsoup.connect("https://movie.naver.com/movie/running/current.nhn");
		//System.out.println(con);
		
		// 2. 연결한 사이트에 html 문서를 가져온다.
		Document doc = con.get();
		//System.out.println(doc);
		
		Elements a = doc.select("dt.tit a");
		Elements num = doc.select("dl.info_exp span.num");
		//System.out.println(anav);
		System.out.println(a.size());
		System.out.println(num.size());
		/*
		 * for (Element e : anav) { System.out.println(e.text()); }
		 */
		for (int i = 0; i < num.size(); i++) {
			System.out.println(a.get(i).text() + "------예매율 >> " + num.get(i).text() + "%");			
		}
	}

}
