package ch06.q19;

public class Account {
	
	// 필드 ! 
	int balance ;
	final static int MIN_BALANCE = 0; // 0원 
	final static int MAX_BALANCE = 1000000;// 백만원

	public int getBalance() {
		return balance;
	}

	public void setBalance(int money) {
		if (balance < MIN_BALANCE) {
			return; 
		}else if (balance > MAX_BALANCE) {
			return ;
		} else {
			this.balance = money ;
		}
		
	} 
	
	

}
