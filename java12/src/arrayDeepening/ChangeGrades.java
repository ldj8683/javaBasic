package arrayDeepening;

public class ChangeGrades {

	public static void main(String[] args) {
		// 성적 변동 확인
		String[] title = { "국어", "수학", "영어", "과학", "컴퓨터" };
		int[] term1 = { 100, 90, 70, 30, 50 };
		// 1학기, 2학기 점수 목록이 별도로 있어야하기 때문에 깊은 복사가 필요하단.
		int[] term2 = term1.clone();
		term2[3] = 55;
		term2[4] = 77;
		
		System.out.println("과목\t->\t1학기\t2학기");
		System.out.println("============================");
		for (int i = 0; i < title.length; i++) {
			System.out.println(title[i] + "\t->\t" + term1[i] + "\t" + term2[i]); 			
		}
		System.out.println("----------------------------");
		int count = 0;
		for (int i = 0; i < title.length; i++) {
			if (term1[i] < term2[i]) {
				count++;
			}
		}
		System.out.println("2학기 성적이 향상된 과목의 수 : " + count);
	}
}
