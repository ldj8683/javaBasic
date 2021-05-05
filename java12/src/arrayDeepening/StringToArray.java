package arrayDeepening;

public class StringToArray {

	public static void main(String[] args) {
		// 스트링을 배열로
		String s = "감자,고구마,양파";
		// ,를 기준으로 나눠서 배열로 저장
		String[] s2 = s.split(",");
		
		//음식의 개수는 몇개일까요
		int count = 0;
		for (int i = 0; i < s2.length; i++) { // 배열의 수만큼 반복
			count++;	// 몇 개인지 세기위해서
		}
		System.out.println("음식의 갯수는 " + count + "개 입니다.");
		
		String s3 = "     홍길동";
		String s4 = s3.trim(); // String 에서 공백을 날릴때 씀
		System.out.println(s4.length());
		
		String s5 = s3.replace("     ", ""); // 공백을 null 로 대체
		System.out.println(s5);

	}

}
