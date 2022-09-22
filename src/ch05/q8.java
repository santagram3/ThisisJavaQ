package ch05;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 8. 주어진 배열 항목의 전체 합과 평균을 구해출력하는 코드 
		
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		// 전체합을 넣어줄 변수 sum 
		int sum = 0;
		// 전체 배열안에 갯수를 구하는 totalLength 
		int totalLength = 0; 
		for (int i = 0; i < array.length; i++) {
			// 안에있는 배열들의 길이들을 더해준다 
			totalLength += array[i].length;
			for (int j = 0; j < array[i].length; j++) {
				// 배열안에 있는 숫자들을 다 더해준다 
				sum += array[i][j]; 
			}
			
		}
		
		// 전체합 : 
		System.out.println("전체합 : " + sum);
		System.out.println("전체 평균 : " + (double)sum/totalLength);
		
		
		
	}

}
