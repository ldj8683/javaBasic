package arrayBasic;

public class ArrayInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 100;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
	}

}
