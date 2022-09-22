package ch05;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 주어진 배열 항목에서 최대값을 출력하는 코드를 작성하시오 ? 
		
		int[] array = {1,5,3,8,2};
		// 최대값을 저장하는 변수 a 
		int a = array[0];
		for (int i = 0; i < array.length; i++) {
			if(a < array[i]) {
				a = array[i];
			}
			System.out.println(a);
			
		}
		System.out.println("==================\n");
		System.out.println("MAX A = "+ a);
		
		
		
	}

}
