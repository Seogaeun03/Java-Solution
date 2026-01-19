//switch
public class Java05_조건문4 {
	public static void main(String[] args) {
		int month = 12;
		// 345 봄, 678 여름, 91011 가을, 1212겨울
		// 31일인 달 / 30일인 달 / 29일인 달

		switch (month) {
		case 3:
		case 4:
		case 5: {
			System.out.println("봄");
			break;
		}
		case 6:
		case 7:
		case 8: {
			System.out.println("여름");
			break;
		}
		case 9:
		case 10:
		case 11: {
			System.out.println("가을");
			break;
		}
		case 12:
		case 1:
		case 2: {
			System.out.println("겨울");
			break;
		}
		}
	}
}
