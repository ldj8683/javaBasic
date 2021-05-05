package repetitive;

public class RepetitiveWhile {

	public static void main(String[] args) {
		String food = "분식"; // 임의의 데이터를 food라는 문자열변수에 저장합니다.
		switch (food) { // case에 food변수 안에 있는 데이터가 있는지 여부를 확인하는 switch문을 생성합니다.
		case "양식": // food 변수안에 저장된 데이터가 양식이라면 아래 구문을 실행합니다.
			System.out.println(food + "은/는 왼쪽으로"); // 출력을 해줍니다.
			break; // switch문에서 나옵니다.
		case "분식":
			System.out.println(food + "은/는 길건너로");
			break;
		case "한식":
			System.out.println(food + "은/는 오른쪽으로");
			break;
		default: // food 안의 데이터가 위의 3가지 경우를 제외한 나머지인 경우
			System.out.println(food + "은/는 집에서");
			break; // switch문에서 나옵니다.
		}
	}

}
