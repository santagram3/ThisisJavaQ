package ch05;

import java.util.Scanner;

public class q9 {

	// 필드 (global) 선언 후 명시적으로 초기화 하지않더라도 jvm이 자동을 ㅗ초기화를 해줌
	static Scanner sc = new Scanner(System.in);
	static int[] scores; //
//	static int[] scores  = null;  자동으로 이렇게 만들어준다는 뜻 ! 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 학생들의 점수를 분석하는 프로그램을 만들려고 합니다.
		// 키보드로브터 학생수와 각 학생들의 점수를 입력받고 while 문과 Scanner 와 nextLine() 메소드를 이용해서
		// 최고 점수 및 평균을 출력하는 코드를 작성해 보세요

		// 멈추게할 boolean 타입 문자 만들기
		boolean trueAndFalse = true;

		while (trueAndFalse) {

			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			int num = Integer.parseInt(sc.nextLine());
			System.out.println("선택 > " + num);
			switch (num) {
			case 1: // 학생수 입력받기
				System.out.println("학생수 > ");
				int num2 = Integer.parseInt(sc.nextLine());
				scores = new int[num2];
				break;
			case 2: //
				if (scores == null) {
					System.out.println("학생수를 먼저 입력해주세요");
					break;
				}
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]  > ", i);
					int score = Integer.parseInt(sc.nextLine());
					// 입력받은 값을 넣어주기
					scores[i] = score;
				}
				break;

			case 3:
				if (scores == null) {
					System.out.println("학생수를 먼저 입력해주세요");
					break;
				}
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d] %d\n", i, scores[i]);
				}
				break;
			case 4:
				if (scores == null) {
					System.out.println("학생수를 먼저 입력해주세요");
					break;
				}
				// 최고점수 받을 변수 만들기 !
				int max = 0;
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						// 맥스값 넣어주기
						max = scores[i];
					}

				}
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + (double) max / scores.length);
				break;
			case 5:
				System.out.println("프로그램을 종료합니다! ");
				trueAndFalse = false;
			default :
				System.out.println("1~5 의 정수만 입력해주세요 ");

			}

		}

	}
}
