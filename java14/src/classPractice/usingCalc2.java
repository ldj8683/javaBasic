package classPractice;

public class usingCalc2 {

	public static void main(String[] args) {
		//계산기 생성
		Calculator2 cal = new Calculator2();
		int coffeePrice = 4600;
		int juicePrice = 5000;
		
		cal.addition(coffeePrice,juicePrice);
		cal.minus(coffeePrice,juicePrice);
		cal.multiplication(coffeePrice, juicePrice);
		cal.divsion(coffeePrice, juicePrice);
	}

}
