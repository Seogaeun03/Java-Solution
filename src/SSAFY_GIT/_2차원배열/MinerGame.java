package SSAFY_GIT._2차원배열;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class MinerGame {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("res/input.txt"));

		int n = sc.nextInt(); // 광산의 크기

		int[][] map = new int[n][n];

		for (int i = 0; i < n; i++) {
			String line = sc.next();
			for (int j = 0; j < n; j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}

		int m = sc.nextInt(); // 광부의 이동횟수
		char[] action = new char[m];

		for (int i = 0; i < m; i++) {
			action[i] = sc.next().charAt(0);
		}
		// 알고리즘 시작======================================
		int[] r4 = { -1, 1, 0, 0 }; // 동작 상하좌우
		int[] c4 = { 0, 0, -1, 1 }; // 동작 상하좌우

		int[] r8 = { 1, 1, 0, -1, -1, -1, 0, 1 }; // 다이너마이트 행
		int[] c8 = { 0, -1, -1, -1, 0, 1, 1, 1 }; // 다이너마이트 열

		int r = 0; // 행 이동 좌표
		int c = 0; // 열 이동 좌표
		int miner_r = 0; // 농부의 행 좌표
		int miner_c = 0; // 농부의 열 좌표
		int removedRockCount = 0; // 광부가 없앤 땅의 개수

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 0) {
					// 현재 광부 위치 설정
					miner_r = i;
					miner_c = j;
				}
			}
		}

		for (int x = 0; x < action.length; x++) {

			switch (action[x]) {
			case 'U': // 상
				r = miner_r + r4[0];
				c = miner_c + c4[0];
				break;
			case 'D': // 하
				r = miner_r + r4[1];
				c = miner_c + c4[1];
				break;
			case 'L': // 좌
				r = miner_r + r4[2];
				c = miner_c + c4[2];
				break;
			case 'R': // 우
				r = miner_r + r4[3];
				c = miner_c + c4[3];
				break;
			case 'X': // 다이너마이트 사용

				int br = 0; // 터뜨릴 땅 좌표 따로 생성
				int bc = 0; // 기존 움직이고 있는 땅 좌표 건드리면 안됨(다이너마이트는 이동 X)
				for (int a = 0; a < 8; a++) {
					br = miner_r + r8[a];
					bc = miner_c + c8[a];

					if (br >= 0 && br < n && bc >= 0 && bc < n) {
						map[br][bc] = 0; // 터뜨린 땅
					}
				}
				continue;
			}

			if ((action[x] != 'X') && r >= 0 && r < n && c >= 0 && c < n) {
				if (map[r][c] != 0) {
					map[r][c]--;
				}
			}

			// 만약 땅이 0이 됐으면 이동하기
			if (r >= 0 && r < n && c >= 0 && c < n) {
				if (map[r][c] == 0) {
					miner_r = r;
					miner_c = c;
				}
			}
		}

		// 없어진 암석의 개수
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 0) {
					removedRockCount++;
				}
			}
		}

		System.out.println("광부 위치 : (" + miner_r + "," + miner_c + ")");
		System.out.println("부순 암석 개수 : " + (removedRockCount - 1)); // 광부가 '부순'암석 개수이기 때문에 처음 시작 부분 제외
	}
}