package shop;


public class Calculator {
	public int add(int x, int y) {
		// 메서드에서 선언된 변수는 메서드 안에서만 사용이 가능하다
		// 메서드 범위 지역 안에서만 사용이 가능한 변수를 지역변수라 한다.
		// 지역변수, 로컬변수 <--> 전역변수, 글로벌 변수		
		int result = x + y;
		return result; // 모든 처리후 반환이 되기 때문에 맨 마지막에 써주어야한다.
	}

	public int minus(int x, int y) {
		int result = x - y;
		return result;
	}

	public int mul(int x, int y) {
		int result = x * y;
		return result;
	}

	public double div(double x, double y) {
		double result = x / y;
		return result;
	}
}
