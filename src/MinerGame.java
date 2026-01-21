import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class MinerGame {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("input.txt"));

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
		int[] r4 = { 1, -1, 0, 0 }; // 동작 상하좌우
		int[] c4 = { 0, 0, -1, 1 }; // 동작 상하좌우

		int[] r8 = { 1, 1, 0, -1, -1, -1, 0, 1 }; // 다이너마이트 행
		int[] c8 = { 0, -1, -1, -1, 0, 1, 1, 1 }; // 다이너마이트 열

		int r = 0; // 행 이동 좌표
		int c = 0; // 열 이동 좌표
		for (int x = 0; x < action.length; x++) {

			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {

					switch (action[x]) {
					case 'U': // 상
						r = i + r4[0];
						c = j + c4[0];
					case 'D': // 하
						r = i + r4[1];
						c = j + c4[1];
					case 'L': // 좌
						r = i + r4[2];
						c = j + c4[2];
					case 'R': // 우
						r = i + r4[3];
						c = j + c4[3];
					}
					
					if (r >= 0 && r < n && c >= 0 && c < n) {
						map[r][c]
					}
				}
			}
		}
	}
}