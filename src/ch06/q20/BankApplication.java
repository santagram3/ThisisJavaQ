package ch06.q20;

import java.util.Scanner;

public class BankApplication {

	
	
	// 스캐너 만들기
	static Scanner sc = new Scanner(System.in);
	// 계좌 리스트  
	static Account[] accountArray = new Account[100];

	public static void main(String[] args) {

		boolean result = true;
		int count = 0;

		while (result) {

			System.out.println("--------------------------------------");
			System.out.println("1.계좌생성 |2.계좌 목록 |3.예금 |4.출금 |5.종료");
			System.out.println("--------------------------------------");

			System.out.println("번호를 선택하세요");
			int num1 = Integer.parseInt(sc.nextLine());

			System.out.printf("선택 > %d \n", num1);

		
			switch (num1) {

			case 1:
				// 계좌 생성
				System.out.println("--------");
				System.out.println("계좌 생성 ");
				System.out.println("--------");

				System.out.println("계좌 번호 > ");
				String accountNum = sc.nextLine();
				System.out.println("계좌 주 >");
				String name = sc.nextLine();
				System.out.println("초기 입금액 > ");
				int putMoney = Integer.parseInt(sc.nextLine());
				
				Account man = new Account(accountNum, name, putMoney);

				// 계좌 정보 넣기
				accountArray[count++] = man;
				System.out.println(name+" 님의 계좌가 생성되었습니다.");
				break;

			case 2:

				System.out.println("-------------");
				System.out.println("계좌 목록 불러오기");
				System.out.println("-------------");

				for (Account account : accountArray) {
					if(!(account == null)) {
						System.out.println(account);
					}
					
				}
				break;

			case 3:
				System.out.println("----------");
				System.out.println("입 금 하 기 ");
				System.out.println("----------");

				System.out.println("계좌 번호 > ");
				String accountNum1 = sc.nextLine();

				System.out.println("입금액 > ");
				int putMoney1 = Integer.parseInt(sc.nextLine().trim());

				if (putMoney1 < 0) {
					System.out.println("마이너스 금액을 입금 할 수 없습니다.");
					return;
				}
				for (int i = 0; i < accountArray.length; i++) {
					if(accountArray[i]!=null) {
						if(accountArray[i].getAccountNum().equals(accountNum1)) {
							
							accountArray[i].setBalance(accountArray[i].getBalance() + putMoney1);
							
							System.out.println(accountArray[i].getName() + "님의 출금 후 자산 : " + accountArray[i].getBalance() + "원");
						}
					}
				}
				
//				for (int i = 0; i < accountArray.length; i++) {
//					if (accountArray[i].getAccountNum().equals(accountNum1)) {
//						// 계좌 주인 찾음 
//						Account account = accountArray[i];
//
//						// 돈 넣어주기
//						account.setBalance(account.getBalance() + putMoney1);
//
//						
//					}
//
//				}
				break;

			case 4:
				System.out.println("----------");
				System.out.println("출 금 하 기 ");
				System.out.println("----------");

				System.out.println("계좌 번호 > ");
				String accountNum2 = sc.nextLine();

				System.out.println("출금액 > ");
				int putMoney2 = Integer.parseInt(sc.nextLine());

				if (putMoney2 < 0) {
					System.out.println("마이너스 금액을 출금 할 수 없습니다.");
					return;
				}

				for (int i = 0; i < accountArray.length; i++) {
					if(accountArray[i]!=null) {
						if(accountArray[i].getAccountNum().equals(accountNum2)) {
							
							if (accountArray[i].getBalance() < putMoney2) {
								System.out.println("현재 가지고있는 금액보다 많은 금액을 출금 할수 없습니다.");
								return;
							}
							accountArray[i].setBalance(accountArray[i].getBalance() - putMoney2);
							
							System.out.println(accountArray[i].getName() + "님의 출금 후 자산 : " + accountArray[i].getBalance() + "원");
						
						}
					}
				}
				
				
//				for (int i = 0; i < accountArray.length; i++) {
//					if (accountArray[i].getAccountNum().equals(accountNum2)) {
//						Account account = accountArray[i];
//
//						if (account.getBalance() < putMoney2) {
//							System.out.println("현재 가지고있는 금액보다 많은 금액을 출금 할수 없습니다.");
//							return;
//						}
//
//						// 돈 넣어주기
//						account.setBalance(account.getBalance() - putMoney2);
//
//						System.out.println(account.getName() + "님의 출금 후 자산 : " + account.getBalance() + "원");
//
//					}
//
//				}
				break;

			case 5:

				System.out.println("프로그램 종료");
				result = false;
				break;
			}
			

		} // while 끝

	}

}
