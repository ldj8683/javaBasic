package arrayDeepening;

public class StringToArray2 {

	public static void main(String[] args) {
		// 스트링을 배열로
		String all = "국어, 영어, 수학, 컴퓨터";
		//1. String[]로 바꿔보세요
		System.out.print("1. ");
		String[] s1 = all.split(",");
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]);
		}
		System.out.println();
		//2. 바꾼후 공백이 포함되어있다면, 공백을 제거 후 다시 배열에 넣으세요
		System.out.print("2. ");
		for (int i = 0; i < s1.length; i++) {
			s1[i] = s1[i].trim();
			System.out.print(s1[i]);
		}
		System.out.println();
		
		//3. 과목수는?
		int count = 0;
		for (int i = 0; i < s1.length; i++) {
			count++;
		}
		System.out.println("3. 과목의 수는 : " + count + "개 입니다.");
		//4. 컴퓨터의 위치는 어디인가요?
		int place = 0;
		for (int i = 0; i < s1.length; i++) {
			if(s1[i].equals("컴퓨터")) {
				place = i;
			}
		}
		System.out.println("4. 컴퓨터의 위치는 " + place + "에 있습니다.");
		
		//5. 과목명이 3글자 미만의 과목수는?
		int count2 = 0;
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].length() < 3) {
				count2++;
			}
		}
		System.out.println("5. 과목명이 3글자 미만의 과목 수 : " + count2);
		
		System.out.println("\n==========================");
		String t = "나는 프로그래머프야";
		String t2 = "진짜!!";
		System.out.println(t + t2); // 스트링 결합
		System.out.println(t.concat(t2)); // 스트링 결합
		System.out.println(t.charAt(0));	// 문자 1글자 추출
		System.out.println(t.endsWith("야")); // 특정한 문자로 끝나는 지를 확인
		System.out.println(t.substring(3)); // 인덱스 3 이후 글자들 모두 추출
		System.out.println(t.substring(3, 8)); // 인덱스 3~7까지 추출
		System.out.println(t.contains(t2)); // t1에 t2가 포함되었는지
		System.out.println(t.lastIndexOf("프")); // t중 프 글자의 위치
		System.out.println(t.toUpperCase()); // 대문자로
		System.out.println(t.toLowerCase()); // 소문자로
		System.out.println(t.length()); //글자수
		System.out.println(t.replace("나", "너"));
		
		
	}

}
