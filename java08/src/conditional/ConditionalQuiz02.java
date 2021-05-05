package conditional;

public class ConditionalQuiz02 {

	public static void main(String[] args) {
		String food = "분식";
		switch (food) {
		case "양식":
			System.out.println(food + "은/는 왼쪽으로");
			break;
		case "분식":
			System.out.println(food + "은/는 길건너로");
			break;
		case "한식":
			System.out.println(food + "은/는 오른쪽으로");
			break;
		default:
			System.out.println(food + "은/는 집에서");
			break;
		}
	}

}
