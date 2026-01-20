import java.util.Scanner;

public class AppleTree {

	public static void main(String[] args) {

		int[][] soil = {
			    {1, 1, 1, 1, 1},
			    {1, 1, 1, 2, 3},
			    {1, 1, 1, 2, 1},
			    {1, 9, 1, 1, 1},
			    {1, 1, 1, 1, 1}
			};
		
		int max = 0;
		int[] di = {-1, 1, 0, 0}; //행
		int[] dj = {0, 0, -1, 1}; //열 
				
		for (int i = 0; i < soil.length; i++) {
			for (int j = 0; j < soil[i].length; j++) {
				int sum = soil[i][j];
				
				// 상하좌우 확인 후 sum에 더해주기
				for (int d = 0; d < 4; d++) {
					int ni = i + di[d];
					int nj = j + dj[d];
					
					if(ni >= 0 && ni < 5 && nj >= 0 && nj < 5) {
						sum += soil[ni][nj];
					}
				}
				
				max = Math.max(max, sum);
			}
		}
		System.out.println(max);
		
	}
}