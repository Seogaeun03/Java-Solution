package _1차원배열;

import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		for (int a : arr) {
			System.out.print(a);
		}
		
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //숫자 입력 값 받기
		
		String[] food = new String[num]; //입력 받은 숫자의 길이를 가진 배열 생성
		
		for (int i = 0; i < food.length; i++) {
			String foodName = sc.next();
			food[i] = foodName;
		}
		
		for (String b : food) {
			System.out.println(b);
		}
	}
}
