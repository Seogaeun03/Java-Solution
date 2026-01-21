import java.util.Scanner;

public class ProductValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("상품의 개수: ");
		int n = sc.nextInt();

		System.out.println("상품들의 가격: ");
		int[] price = new int[n];

		// 상품의 가격 입력하기
		for (int i = 0; i < price.length; i++) {
			price[i] = sc.nextInt();
		}

		int[] rank = new int[n]; // 상품들의 등수(가치)
		int count = 1; // 자신보다 높은 상품이 있을 시 증가
		for (int i = 0; i < price.length; i++) {
			count = 1;
			for (int j = 0; j < price.length; j++) {
				if (price[i] < price[j]) {
					count++;
				}
			}
			rank[i] = count;
		}

		for (int r : rank) {
			System.out.print(r + " ");
		}
	}

}