package ch04;

public class ex1 {

	public static void main(String[] args) {
		
		double num1 = Math.random();
		
		System.out.println(num1);
		
		int num2 = (int)(Math.random()*7)+1;
		
		System.out.println(num2);
		
		switch(num2) {
		case 1 :
			System.out.println("1번이 나왔습니다.");
			break;
		case 2 :
			System.out.println("2번이 나왔습니다.");
			break;
		case 3 :
			System.out.println("3번이 나왔습니다.");
			break;
		case 4 :
			System.out.println("4번이 나왔습니다.");
			break;
		case 5 :
			System.out.println("5번이 나왔습니다.");
			break;
		case 6 :
			System.out.println("6번이 나왔습니다.");
			break;
		default : 
			System.out.println("7번이 나왔습니다~ ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
