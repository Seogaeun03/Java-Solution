package SSAFY_GIT._기본문법

import java.util.Scanner;

public class DigitTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("번호를 입력하세요.");
		int num = sc.nextInt();

		int pan = 0;  // 게임 횟수
		int win = 0;  // 승리 횟수
		int lose = 0; // 진 횟수

		if (num == 1) {
			pan = 5; // 5판 3선승
		} else if (num == 2) {
			pan = 3; // 3판 2선승
		} else {
			pan = 1; // 1판 1선승
		}

		// 가위바위보 숫자로 변환
		int n = 0;

		for (int i = 0; i < pan; i++) {
			int computer = (int) (Math.random() * 3) + 1;

			System.out.print("가위바위보 중 하나 입력: ");
			String s = sc.next();

			if (s.equals("가위")) {
				n = 1;
			} else if (s.equals("주먹")) {
				n = 2;
			} else {
				n = 3;
			}
			
			// 가위바위보 진행
			if ((computer == 1 && n == 2) || (computer == 2 && n == 3) || (computer == 3 && n == 1)) {
				win++;
				System.out.println("이겼습니다!!!");
			} else if ((computer == 1 && n == 1) || (computer == 2 && n == 2) || (computer == 3 && n == 3)) {
				System.out.println("비겼습니다!!!");
			} else if ((computer == 1 && n == 3) || (computer == 2 && n == 1) || (computer == 3 && n == 2)) {
				System.out.println("졌습니다!!!");
				lose++;
			}
			
			// 이미 승패가 확정이 나면 반복문 빠져나감
			if ((win == (pan / 2) + 1) || (lose == (pan / 2) + 1)) {
				break; 
			}
		}

		switch (pan) {
		case 5:
			if (win >= 3) {
				System.out.println("### 사용자 승!!!");
			} else {
				System.out.println("### 컴퓨터 승!!!");
			}
			break;
		case 3:
			if (win >= 2) {
				System.out.println("### 사용자 승!!!");
			} else {
				System.out.println("### 컴퓨터 승!!!");
			}
			break;
		case 1:
			if (win >= 1) {
				System.out.println("### 사용자 승!!!");
			} else {
				System.out.println("### 컴퓨터 승!!!");
			}
			break;
		} 

	}

}
