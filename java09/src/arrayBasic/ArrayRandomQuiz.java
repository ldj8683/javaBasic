package arrayBasic;

import java.util.Random;

public class ArrayRandomQuiz {

	public static void main(String[] args) {
		int[] num = new int[1000];
		Random r = new Random(42);
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);			
		}
		int countOther = 0;
		int count300 = 0;
		int count400 = 0;
		int count500 = 0;
		int count600 = 0;
		int sum = 0;
		for (int x : num) {		
			if(x>=600) {
				count600++;
			}else if(x>=500){
				count500++;
			}else if(x>=400) {
				count400++;
			}else if(x>=300) {
				count300++;
			}else {
				countOther++;
			}
		}
		sum = countOther + count600 + count500 + count400 + count300; 
		System.out.println(count600);
		System.out.println(count500);
		System.out.println(count400);
		System.out.println(count300);
		System.out.println(countOther);
		System.out.println(sum);
	}

}
