import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		while (num != 0) {
			for (int i = 0; i < 10; i++) { 
				System.out.println(num + " X " + i + " = " + (i*num));
			}
			System.out.print("다음 숫자 입력: ");
			num = sc.nextInt();
		}
		
		System.out.println("프로그램 종료");

	}

}
