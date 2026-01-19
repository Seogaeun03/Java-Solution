import java.util.Scanner;

public class Season1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ans = 0;

		System.out.println("숫자 입력 >>");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				ans += i;
			}
		}
		
		System.out.println("1부터 10까지 수 중 짝수의 합 = " + ans);
		//sc.close();

	}

}