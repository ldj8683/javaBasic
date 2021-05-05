package arrayBasic;

public class ToiecScoring {

	public static void main(String[] args) {
		// int[] CorrectAnswer = new int[999];
		// int[] MyAnswer = new int[999];

		// 저장공간이 5개인 배열 num을 생성
		int[] num = new int[5];
		// 인덱스가 0부터 배열의 크기만큼 반복되는 for문 생성
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);
		}
		
		// 구분
		System.out.println("=================");
		
		// for-each : 뭔가 꺼내어서 반복해서 알고 싶을경우 사용
		// 배열에서 순서대로 꺼내어 특정한 처리를 할때 사용
		// 알아서 인덱스 0부터 시작해서 끝까지 1씩 증가하면서 하나씩 꺼내와라
		for (int x : num) {
			System.out.println(x);
		}
	}

}
