import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class BuildingTest {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("res/input.txt"));

		// 1. 전체 테스트 케이스 T 입력
		int T = sc.nextInt();

		for (int testcase = 1; testcase <= T; testcase++) {
			// 2. 지도의 크기 N 입력
			int N = sc.nextInt();

			// 3. N x N 크기의 지도 생성
			char[][] map = new char[N][N];

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					map[r][c] = sc.next().charAt(0);
				}
			}

			// 알고리즘 구현 시작 ============================
			// 상, 좌상, 좌, 좌하, 하, 우하, 우, 우상}
			int[] rm = { -1, -1, 0, 1, 1, 1, 0, -1 }; // 행
			int[] cm = { 0, -1, -1, -1, 0, 1, 1, 1 }; // 열
			int count = 0;
			int max = 0;

			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {

					// 해당 위치가 'B'일 때
					if (map[i][j] == 'B') {

						// 주변 8칸 확인 해보기
						for (int a = 0; a < 8; a++) {
							int r = i + rm[a]; // 주변 8칸 row
							int c = j + cm[a]; // 두변 8칸 columns

							// 인덱스 값을 넘어가지 않는 선에서
							if (r >= 0 && r < map.length && c >= 0 && c < map.length) {
								// 8칸 중 하나라도 'G'일 시 2층 건물 확정
								if (map[r][c] == 'G') {
									count = 2;
									break;
								}
							}
						}
						// 모두 'B'일 시 가로 세로 'B' 개수 구하기
						if (count != 2) {
							for (int x = 0; x < N; x++) {
								if (map[i][x] == 'B') {
									count++;
								}
								if (map[x][j] == 'B') {
									count++;
								}
							}
							// 자기 자신의 값은 중복 되었으니 하나 빼주기
							count--;
						}
						// 최댓값 업데이트
						max = Math.max(max, count);
						count = 0;
					}
				}
			}
			System.out.println("#" + testcase + " " + max);
		}
	}
}