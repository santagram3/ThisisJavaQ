package ch03;

public class Q3 {

	public static void main(String[] args) {
		 // 534 자루 연필을 30명 학생들에게 똑같은 개수로 나누어 줄때 1 인당 몇개를 가질 수 있거ㅗ ? 
			int pencils = 534;
			int students = 30; 
			
			// 학생 한명이 가지는 연필수 ? 
			int pencilsPerStudent = (pencils/students);
			System.out.println(pencilsPerStudent);
			
			// 남은 연필 수
			int pencilsLeft = (pencils%students); 
			System.out.println(pencilsLeft);
	}

}
