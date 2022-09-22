package ch05;

import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 학생들의 점수를 분석하는 프로그램을 만들려고 합ㄴ디ㅏ. 
		// 키보드로브터 학생수와 각 학생들의 점수를 입력받고 while 문과 Scanner 와 nextLine() 메소드를 이용해서 
		// 최고 점수 및 평균을 출력하는 코드를 작성해 보세요
		
		
		// 스캐너 만들기 
		Scanner sc = new Scanner(System.in);
		
		// 멈추게할 boolean 타입 문자 만들기 
		boolean trueAndFalse = true ; 
		
		while (trueAndFalse) {
			
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			int num = Integer.parseInt(sc.nextLine());
			System.out.println("선택 > " + num);
			switch(num) {
			case 1 : 
				System.out.println("학생수 > ");
				int num2 = Integer.parseInt(sc.nextLine());
				int[] scores = new int[num2];
				break; 
			case 2 : 
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]  > ",i);
					int score = Integer.parseInt(sc.nextLine());
					
				}
				
				
			}
			
			
			
		}
		
		
		
		
		
		
		
	}

}
