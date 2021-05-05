package arrayApplication;

public class InputIntoArrayQuiz02 {

	public static void main(String[] args) {
		String[] name = { "홍길동", "김길동", "송길동", "박길동", "정길동" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		int count = 0;
		// 1. 성정이 2학기에 향상된 학생의 수
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				System.out.println(name[i] + "의 2학기 성적이 향상됨. 위치는" + i);
				count++;
			}
		}
		System.out.println("2학기에 성적이 향상된 학생들의 수 : " + count + "명");

		System.out.println();
		System.out.println("------------------------------");
		// 2. 1학기 2학기 성적이 동일한 학생의 수
		int count2 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count2++;
				System.out.println(name[i] + "의 2학기 성적이 동일함. 위치는" + i);
			}
		}
		System.out.println("2학기에 성적이 동일한 학생들의 수 : " + count2 + "명");

		System.out.println();
		System.out.println("------------------------------");
		// 3. 2학기 성적이 떨어진 학생의 수
		int count3 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] > term2[i]) {
				count3++;
				System.out.println(name[i] + "의 2학기 성적이 떨어짐. 위치는" + i);
			}
		}
		System.out.println("2학기에 성적이 동일한 학생들의 수 : " + count3 + "명");
		
		System.out.println();
		System.out.println("------------------------------");
		// 4. 함께 채크해보자
		int count4 = 0;	//향상
		int count5 = 0; //동일
		for (int i = 0; i < term2.length; i++) {
			if(term1[i] == term2[i]) {
				count5++;
			} else if (term1[i] < term2[i]) {
				count4++;
			}
		}
		System.out.println("향상 : " + count4 + "명.");
		System.out.println("동일 : " + count5 + "명.");
	}
}
