package classPractice;

public class cafeCalc {

	public static void main(String[] args) {
		int coffeePrice = 4600;
		int juicePrcie = 4000;
		
		int coffeeCount = 5;
		int juiceCount = 3;
				
		Calculator cal = new Calculator();
		
		// 전체 몇 잔을 주문했을까요?
		int totalCount = cal.add(coffeeCount, juiceCount);
		System.out.println("전체 주문 수: " + totalCount);
		
		// 커피값은 얼마일까요?
		int coffeeResult = cal.mul(coffeePrice, coffeeCount);
		System.out.println("커피값: " + coffeeResult);
		// 주스값은 얼마일까요?
		int juiceResult = cal.mul(juicePrcie, juiceCount);
		System.out.println("주스값: " + juiceResult);
		
		//	전체 값은 얼마일까요?
		// 메서드를 사용할 때 => 메서드 호출(call, 콜, 호출)할 때
		// 그 처리 결과값을 가져와서 다시 사용해야하는 경우가 있다.
		// 이때는 반환을 받아와야한다. --> return
		int totalResult = cal.add(coffeeResult, juiceResult);
		System.out.println("전체값: " + totalResult);
		
		int hour = cal.getHour();
		System.out.println("현재 시각: " + hour);

	}	

}
