package ch06.q20;

public class Account {
	
	String accountNum ; // 계좌번호
	String name ; // 계좌 주인이름 
	int balance ; // 잔금 
	
	// 생성자 ! 

	public Account(String accountNum, String name, int balance) {
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [AccountNum=" + accountNum + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		accountNum = accountNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
