package ch06.q13andq14;

public class Member {
	
	// q13 
	String name ; // 이름 
	String id ; // 아이디 
	String password ; // 비밀번호 
	int age ; // 나이 ! 
	
	// q14 
	// 생성자 name 과 id 를 대입하는 생성자! 
	
	public Member (String name , String id) {
		this.name = name ;
		this.id = id ;
	}
	
	// q15 
	public boolean login(String id , String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false ;
	}
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 하셨습니다.");
	}
	
	
	
	

}
