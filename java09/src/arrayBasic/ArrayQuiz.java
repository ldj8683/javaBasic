package arrayBasic;

public class ArrayQuiz {
	public static void main(String[] args) {
		// 1. 정수 5개 크기의 배열을 만들어 10,20,30,40,50을 순서대로 넣고, 첫째값과 셋째값을 더해서 출력
		int[] num = new int[5];
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (1 + i) * 10;
			System.out.println("num[" + i + "] : " + num[i]);
		}
		sum = num[0] + num[2];
		System.out.println("Q1______________________________");
		System.out.println("첫번째값 " + num[0] + " 과 세번째값 " + num[2] + " 의 합은 " + sum + "입니다.");
		// 2. 스트링 3개 크기의 배열을 만들어서 자바, 스프링, jsp를 순서대로 넣고, "자바보다는 스프링"으로 출력
		String[] str = new String[3];
		str[0] = "자바";
		str[1] = "스프링";
		str[2] = "JSP";
		
		System.out.println("Q2______________________________");
		System.out.println(str[0] + " 보다는 " + str[1]);
	}
}
