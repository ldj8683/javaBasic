package 크롤링;

import java.io.FileWriter;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class OPGG2 {

	public static void main(String[] args) throws Exception {
		// 사이트를 연결해 html 문서를 가져옴
		Connection con = Jsoup.connect("https://overwatch.op.gg/heroes/global");
		Document doc = con.get();

		// 테그의 위치를 찾아서 데이터를 가져옴
		// num = 랭크, hero = 영웅이름, val = 픽률, 승률, 폭주, k/d
		Elements num = doc.select("td.Id");
		Elements hero = doc.select("span.Name");
		Elements val = doc.select("table.HeroesRank span.Value");

		// 연속된 4개의 값들을 한번에 넣을 배열 생성
		String[] a = new String[num.size()];
		// 배열 a의 인덱스 에 사용될 x 선언
		int x = 0;
		// rank의 크기만큼 반복
		while (x < num.size()) {
			// 4개의 연속된 데이터가 하나의 데이터이기 때문에 4씩 증가하는 반복문
			for (int i = 0; i < val.size(); i += 4) {
				// 한번 돌때마다 4개가 배열 a에 저장됨
				a[x] = val.get(i).text() + "\t" + val.get(i + 1).text() + "\t" + val.get(i + 2).text() + "\t"
						+ val.get(i + 3).text();
				// 배열a의 인덱스값
				x++;
			}
		}
		// 순위와 영웅 이름, 그에 관한 배열 a의 데이터를 한번에 저장해줄 배열 b 생성
		String[] b = new String[num.size()];
		for (int i = 0; i < num.size(); i++) {
			// 확인을 위한 콘솔 출력
			System.out.printf("%3s%15s\t%s\n", num.get(i).text(), hero.get(i).text(), a[i]);
			// 배열 b 에 저장
			b[i] = String.format("%3s%15s\t%s\n", num.get(i).text(), hero.get(i).text(), a[i]);
		}
		try {
			FileWriter f = new FileWriter("C:/data/lolrank.txt");
			for (int i = 0; i < num.size(); i++) {
				// 저장된것들을 파일에 저장
				f.write(b[i] + "\n");
			}
			f.close();
		} catch (Exception e) {
			System.out.println("파일로 저장하는 중 에러가 발생함!");
			System.out.println("에러정보 >> " + e.getMessage());
		}

	}
}
