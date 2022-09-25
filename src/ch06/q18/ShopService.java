package ch06.q18;

public class ShopService {
	
	// 자기 자신 객체를 만들기 클래스 안에 만들어보리기 ! 
	private static ShopService service = new ShopService();
	
	// 생성자 막기 
	private ShopService() {
		
	}
	// getinstance 로 가져갈수있게 메서드 만들기 
	public ShopService getInstance() {
		return service ; 
	}

}
