package ch04;

public class q2 {

	public static void main(String[] args) {

		// 왼쪽 을 expression 으로 바꿔서 작성하시오 !
		// 왼쪽

//		String grade = "B";
//
//		int score1 = 0;
//		switch (grade) {
//		case "A":
//			score1 = 100;
//			break;
//		case "B":
//			int result = 100 - 20;
//			score1 = result;
//			break;
//		default:
//			score1 = 60;
//
//		}

		// 오른쪽

		String grade = "B";

		int score1 = 0;
		switch (grade) {
		case "A" -> {

			score1 = 100;
			break;
		}
		case "B" -> {
			int result = 100 - 20;
			score1 = result;
			break;
		}

		default -> {
			score1 = 60;
		}

		}

	}

}
