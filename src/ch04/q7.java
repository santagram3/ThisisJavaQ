package ch04;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {

		// while 문과 scanner 의 nextline() 메소드
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true ; 
		
		int yourMoney = 0; 
		
		while(run) {
	
			System.out.println("------------------------------");
			System.out.println("1.예금   2.출금    3.잔고    4.종료");
			System.out.println("------------------------------");
			
			int  menu =Integer.parseInt(sc.nextLine());
			
			switch(menu) {
				case 1 : System.out.println("예금액 > ");
				int  plusMoney =Integer.parseInt(sc.nextLine());
				
				yourMoney += plusMoney; 
				System.out.println("예금이 정장 처리 되었습니다.");
				System.out.println("현재 너의 잔액은 : " + yourMoney + " 입니다");
				break;
				case 2 : System.out.println("출금액 > ");
				int  minusMoney =Integer.parseInt(sc.nextLine());
				if(yourMoney < minusMoney) {
					System.out.println("현재 귀여운 너의 잔액은 : " + yourMoney +"원 입니다");
					System.out.println("다시 입력 해주세요 ");
					break;
				}
				
				yourMoney -= minusMoney; 
				System.out.println("출금이 정장 처리 되었습니다.");
				System.out.println("현재 너의 잔액은 : " + yourMoney + " 입니다");
				
				
				break;
				case 3 : System.out.println("잔고 > ");
				System.out.println("현재 너의 잔액은 : " + yourMoney + " 입니다");
				break;
				case 4 : run = !run;
			}
			
		
			
			
			
			
			
		}
		
		
		
		
		

	}

}
