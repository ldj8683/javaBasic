package 크롤링;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class InnerClass extends JFrame {
	private static final long serialVersionUID = 1L;
	JLabel name, price, table, day;

	public InnerClass() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setSize(800, 300);
		getContentPane().setLayout(null);

		name = new JLabel("New label");
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(new Font("굴림", Font.BOLD, 30));
		name.setBounds(278, 10, 252, 50);
		getContentPane().add(name);

		price = new JLabel("price");
		price.setHorizontalAlignment(SwingConstants.CENTER);
		price.setFont(new Font("굴림", Font.BOLD, 30));
		price.setBounds(119, 96, 252, 50);
		getContentPane().add(price);

		table = new JLabel("table");
		table.setHorizontalAlignment(SwingConstants.CENTER);
		table.setFont(new Font("굴림", Font.BOLD, 30));
		table.setBounds(389, 96, 252, 50);
		getContentPane().add(table);

		day = new JLabel("date");
		day.setHorizontalAlignment(SwingConstants.CENTER);
		day.setFont(new Font("굴림", Font.BOLD, 30));
		day.setBounds(106, 180, 536, 50);
		getContentPane().add(day);

		Day d = new Day();
		d.start();
		Crowling c = new Crowling();
		c.start();
		setVisible(true);
	}

	public static void main(String[] args) {
		new InnerClass();
	}

	public class Day extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date1 = new Date();
				day.setText("" + date1);
				try {
					// 1초에 한번씩 실행
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// interrupt : 일시적 방해, 중단 >> esc, ctrl+c, power-off, alt+f4
				}
			}
		}
	}

	public class Crowling extends Thread {
		@Override
		public void run() {
			Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005930");
			Document doc = null;
			try {
				doc = con.get();
			} catch (IOException e) { // TODO Auto-generated catch
				e.printStackTrace();
			}
			Elements name1 = doc.select("div.wrap_company a");
			Elements price1 = doc.select("div.today p.no_today");
			Elements table1 = doc.select("table.no_info");
			for (int i = 0; i < 1000; i++) {
				name.setText(name1.text());
				price.setText(price1.text().split(" ")[0]);
				table.setText(table1.text());
			}
		}
	}
}
