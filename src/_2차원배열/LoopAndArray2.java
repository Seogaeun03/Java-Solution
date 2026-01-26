package _2차원배열;

public class LoopAndArray2 {

	public static void main(String[] args) {

		// Q. 5행 6열 크기를 갖는 int형 nuberList 배열을 생성해 봅시다.
		int[][] numberList = new int[5][6];

		// Q. (0, 0), (0, 1), (0, 2) ... (0, 5) (1, 0), (1, 1) ... (4, 4) 까지
		// 10부터 1씩 증가하여 저장해 봅시다.

		int num = 10;

		for (int rowIdx = 0; rowIdx < numberList.length; rowIdx++) {
			for (int colIdx = 0; colIdx < numberList[rowIdx].length; colIdx++) {
				numberList[rowIdx][colIdx] = num++;
			}
		}

		System.out.println("numberList 출력");
		for (int rowIdx = 0; rowIdx < numberList.length; rowIdx++) {
			for (int colIdx = 0; colIdx < numberList[rowIdx].length; colIdx++) {
				System.out.print(" " + numberList[rowIdx][colIdx]);
			}
			System.out.println();
		}

		System.out.println();

		// Q. (0, 0), (1, 0), (2, 0) ... (5, 0), (0, 1), (1, 1), (2, 1) ... (4, 4) 까지
		// 10부터 1씩 증가하여 저장해 봅시다.

		num = 10;

		for (int colIdx = 0; colIdx < 6; colIdx++) {
			for (int rowIdx = 0; rowIdx < 5; rowIdx++) {
				numberList[rowIdx][colIdx] = num++;
			}
		}

		System.out.println("numberList 출력");
		for (int rowIdx = 0; rowIdx < numberList.length; rowIdx++) {
			for (int colIdx = 0; colIdx < numberList[rowIdx].length; colIdx++) {
				System.out.print(" " + numberList[rowIdx][colIdx]);
			}
			System.out.println();
		}
	}
}
