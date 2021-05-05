package arrayDeepening;

import java.util.Random;

public class FindMax {

	public static void main(String[] args) {
		// 최댓값 찾기
		// 같은 타입의 많은 양의 데이터가 있으면 배열에 넣으세요.
		// 반복문을 통해서 많은 양의 데이터를 효율적으로 다를 수 있습니다.
		// int[] num = {11, 33, 55, 22, 44};
		int[] num = new int[1000];
		Random r = new Random(42);
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}

		// 초기값을 넣어줄 경우, 배열에 들어있는것들이 모두 음수라면 초깃값이 최대값이 되는 경우가 발생할 수 있다.
		// 따라서 초기화를 하는 것이 아니라.
		int max = num[0];
		// int min = num[0];
		String index = "";
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}			
		}
		for (int i = 0; i < num.length; i++) {
			if (max == num[i]) {
				count++;
				index = index + i + " ";
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최대값의 수 : " + count);
		System.out.println("최대값의 위치 : " + index);
		
		//split을 이용
		String[] s = index.split(" ");
		System.out.println(s[0]);
		System.out.println(s[1]);

	}

}
