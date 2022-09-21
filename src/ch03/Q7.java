package ch03;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;
		
		if (Double.isInfinite(z)) {
			System.out.println("0.0으로 나눌수 없습니다.");
		} else {
			double result = z + 10 ;
			System.out.println("결과 : " + result);
		}
		
		
	}

}
