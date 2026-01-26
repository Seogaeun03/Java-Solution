package _1차원배열;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("스위치의 갯수를 입력하세요: ");
		int n = sc.nextInt();
		int[] switch_o = new int[n]; // n개의 배열 생성

		System.out.print("몇개의 값을 입력 하시겠습니까?: ");
		int m = sc.nextInt();

		int[] input = new int[m]; // m개의 배열 생성
		System.out.print("입력값: ");

		for (int i = 0; i < m; i++) {
			input[i] = sc.nextInt();
		}

		for (int j = 0; j < input.length; j++) {
			for (int a = input[j]; a <= switch_o.length; a += input[j]) {
				if (switch_o[a-1] == 0) {
					switch_o[a-1] = 1;
				} else {
					switch_o[a-1] = 0;
				}
			}
		}

		for (int val : switch_o) {
		    System.out.print(val + " ");
		}
	}
}