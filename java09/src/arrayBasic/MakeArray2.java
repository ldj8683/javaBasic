package arrayBasic;

public class MakeArray2 {

	public static void main(String[] args) {
		double[] num = new double[3];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = 3 * i;
			System.out.println(i + ": " + num[i]);
		}
		
		for (double y : num) {
			// for-each문에서 y는 num.length만큼 재사용
			System.out.println(y);
		}
	}

}
