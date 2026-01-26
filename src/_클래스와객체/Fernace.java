package _클래스와객체;

import java.util.Scanner;

public class Fernace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 온도를 입력하세요: ");
		int currentTemp = sc.nextInt();
		
		System.out.print("원하는 온도를 입력하세요: ");
		int targetTemp = sc.nextInt();
		
		System.out.print("지정된 온도가 몇개인가요? ");
		int n = sc.nextInt();
		
		int[] setTemp = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("지정된 온도를 입력하세요: ");
			setTemp[i] = sc.nextInt(); //지정된 온도 배열
		}
		
		//---------------------------------------------
		// 1. 초기값: 버튼(±1)으로만 이동할 때 걸리는 시간
		int minTime = Math.abs(currentTemp - targetTemp);

		// 2. 지정 온도를 하나씩 확인하며 '가장 빠른 시간'을 갱신
		for (int i = 0; i < n; i++) {
		    // 특정 지정 온도로 점프(1초) + 그 온도에서 목표까지의 거리
		    int timeViaPreset = 1 + Math.abs(setTemp[i] - targetTemp);
		    
		    // 이전에 알던 시간보다 지금 방법이 더 빠르면 갱신
		    if (timeViaPreset < minTime) {
		        minTime = timeViaPreset;
		    }
		}

		// 3. 최종 결과가 600초(10분)를 넘는지 확인
		if (minTime > 600) {
		    System.out.println(-1);
		} else {
		    System.out.println(minTime);
		}
	}

}

