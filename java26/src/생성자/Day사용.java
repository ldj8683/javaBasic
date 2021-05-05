package 생성자;

public class Day사용 {

	public static void main(String[] args) {
		// 객체 생성
		Day d1 = new Day("자바공부", 10, "강남");
		Day d2 = new Day("여행", 15, "강원도");
		Day d3 = new Day("운동", 11, "피트니스");

		// 출력
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println("-----------------------------------");
		System.out.println("전체 하는 일의 시간>> " + Day.sum + "시간");
		System.out.println("일한 날짜>> " + Day.count + "일");
		System.out.println("평균 하는 일의 시간>> " + (double) Day.sum / Day.count + "시간");
	}

}
