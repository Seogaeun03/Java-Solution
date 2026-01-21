import java.util.Scanner;

public class AirCrashes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("비행기 사고 횟수: ");
		int n = sc.nextInt();

		System.out.println("비행기 사고 사상자 수: ");
		int[] deathCount = new int[n];

		for (int i = 0; i < deathCount.length; i++) {
			deathCount[i] = sc.nextInt();
		}

		int maxCasualtyCount = 0; // 최대 사상자 수
		int LastCnt = deathCount[deathCount.length - 1]; // 마지막 사상자 수
		int lessThanLastCnt = 0; // 마지막 사고보다 적은 사상자 수

		for (int i = 0; i < deathCount.length; i++) {
			maxCasualtyCount = Math.max(maxCasualtyCount, deathCount[i]);
			if (deathCount[i] < LastCnt) {
				lessThanLastCnt = deathCount[i];
			}
		}

		if (lessThanLastCnt == 0) {
			System.out.println(-1);
		} else {
			System.out.println(maxCasualtyCount - lessThanLastCnt);
		}
	}
}