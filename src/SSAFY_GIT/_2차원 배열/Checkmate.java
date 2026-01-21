import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Checkmate {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(new File("res/input.txt"));

		// 1. 전체 테스트 케이스 T 입력
		int T = sc.nextInt();

		for (int testcase = 1; testcase <= T; testcase++) {
			// 2. 체스판 크기 N 입력
			int N = sc.nextInt();

			// 3. N x N 크기의 페스판 생성
			int[][] map = new int[N][N];

			// 알고리즘 구현 시작 ===============================
			int kr = sc.nextInt() - 1; // 킹의 가로 좌표
			int kc = sc.nextInt() - 1; // 킹의 세로 좌표
			int qr = sc.nextInt() - 1; // 퀸의 가로 좌표
			int qc = sc.nextInt() - 1; // 퀸의 세로 좌표

			map[kc][kr] = 1; // 킹 위치
			map[qc][qr] = 1; // 퀸 위치

			int count = 0;

			// 가로 세로 판별하기
			if (kc == qc || kr == qr) {
				count++;
			}

			// 대각선 판별하기
			if (Math.abs(kc - qc) == Math.abs(kr - qr)) {
				count++;
			}

			// count가 0이상이면 1 아니면 0
			if (count > 0) {
				System.out.println("#" + testcase + 1);
			} else {
				System.out.println("#" + testcase + 0);
			}
		}
	}
}