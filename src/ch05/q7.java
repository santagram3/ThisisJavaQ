package ch05;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 주어진 배열 항목에서 최대값을 출력하는 코드를 작성하시오 ?

		int[] array = { 1, 5, 3, 8, 2 };
		// 최대값을 저장하는 변수 a
		int a = array[0];
		for (int i = 0; i < array.length; i++) {
			if (a < array[i]) {
				a = array[i];
			}
			System.out.println(a);

		}
		System.out.println("==================\n");
		System.out.println("MAX = " + a);
		System.out.println("==================\n");
		// 최소값 구하기!
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
			System.out.println(min);

		}
		System.out.println("==================\n");
		System.out.println("MIN = " + min);
		System.out.println("==================\n");

		// 오름차순 정렬
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int b : array) {
			System.out.print(" , " + b);
		}
		System.out.println("\n=========================");
			// 내림차수 비교
			int temp2 = 0;
			for (int i = 0; i < array.length; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] < array[j]) {
						temp2 = array[i];
						array[i] = array[j];
						array[j] = temp2;
					}
				}
			}
			for (int e : array) {
				System.out.print(" , " + e);
			}
			

		}

	}

