package ch06.q15;

public class MemberService {
	
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
