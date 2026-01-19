import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("월 입력>>");
		int num = sc.nextInt();

		while (num != 0) {
			switch (num) {
			case 3: case 4: case 5: {
				System.out.println(num + "월은 봄입니다.");
				break;
			}
			case 6: case 7: case 8: {
				System.out.println(num + "월은 여름입니다.");
				break;
			}
			case 9: case 10: case 11: {
				System.out.println(num + "월은 가을입니다.");
				break;
			}
			case 12: case 1: case 2: {
				System.out.println(num + "월은 겨울입니다.");
				break;
				}
			}
			System.out.println("월 입력>>");
			num = sc.nextInt();
		}
	}

}