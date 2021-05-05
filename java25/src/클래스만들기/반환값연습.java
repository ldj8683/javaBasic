package 클래스만들기;

import java.util.Date;

public class 반환값연습 {
	public void add2() {
		System.out.println("더하기 기능을 수행합니다.");
	}
	public int add(int x, int y) { // double
		return x + y;
	}
	public double add(double x, int y) { // double이 하나면 double
		return x + y;
	}
	public String add(String x, String y) { // String일경우 무조건 String
		return x + y;// + 결합의 의미
	}
	public String add(int x, String y) {
		return x + y;// + 결합의 의미
	}
	public int[] add() {
		int[] x = {1,2,3};
		return x;
	}
	
	public Date getDate() {
		Date date = new Date();
		return date;
	}
}
