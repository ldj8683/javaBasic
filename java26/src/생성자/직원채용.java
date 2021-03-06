package 생성자;

public class 직원채용 {

	public static void main(String[] args) {
		// 객체 생성
		// wk1, wk2, wk3 는 참조형 변수
		직원 wk1 = new 직원("홍길동", "남", 25);
		직원 wk2 = new 직원("김길동", "여", 26);
		직원 wk3 = new 직원("송길동", "남", 27);
		
		// 생성되며 입력된 모든 직원의 정보를 출력
		System.out.println(wk1);
		System.out.println(wk2);
		System.out.println(wk3);
		
		// 생성된 수는 직원수이기 때문에 직원수를 사용할때 직원 class에서 얻은 count 를 사용해서 출력
		System.out.println("직원의 수 >> " + 직원.count +"명");
		// age를 더한것인 static 변수 sum과 직원수를 의미하는 객체생성 횟수의 static 변수 count를 이용해 평균을 구함
		System.out.println("직원의 평균 나이 >> " + (double)직원.sum / 직원.count + "살");
		직원.getAvg();
		
	}

}
