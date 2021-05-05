package classPractice;

public class Calculator2 {
	//계산기, 메서드 중심
	public void addition(int num1, int num2) {
		// 메서드의 입력값이 있는 경우, 입력되는 값의 타입과 수에 따라 변수를 만들어주어야
		// 전달되는 값을 받아서 저장해 두었다거 꺼내어 계산할 수 있다.
		// 전달해주는 값과 받는 값의 데이터 형이 같아야 한다.
		int add = num1 + num2;
		System.out.println("계산기로 " + num1 + "과 " + num2 + "를 계산한 결과 : " + add);		
	}
	public void minus(int num1, int num2) {
		// 중간에 값을 전달 받는 변수이기 때문에 매개체 역할을 해주는 변수라 하여서 매개변수(Parameter, 파라메터) 라고함
		// 전달 받은 값이 2개이면, 매개 변수 2개를 만들어 주어야함.
		// 전달 받은 값이 순서대로 매개 변수에 저장됨.
		// 이렇게 저장된 값을 가지고 메서드 내에서 처리.
		// 파라메터도 내가 조정을 할 수 있는것도 있고 없는 것도 있다.
		// 매개변수는 개수, 타입, 순서가 모두 맞아야 한다!
		int min = num1 - num2;		
		System.out.println("계산기로 " + num1 + "과 " + num2 + "를 계산한 결과 : " + min);
	}
	public void multiplication(int num1, int num2) {
		int mul = num1 * num2;
		System.out.println("계산기로 " + num1 + "과 " + num2 + "를 계산한 결과 : " + mul);
	}
	public void divsion(int num1, int num2) {
		double div = (double) num1 / num2;
		System.out.println("계산기로 " + num1 + "과 " + num2 + "를 계산한 결과 : " + div);
	}
}
