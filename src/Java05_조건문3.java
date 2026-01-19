//if-else if-else
public class Java05_조건문3 {
	public static void main(String[] args) {

		int score = 97;
		String result = "";
		// 90점 이상 A
		// 80점 이상 90점 미만 B
		// 70점 이상 80점 미만 C
		// 그 외 F
		
		if (score >= 90) {
			result = "A";
		} else if (score >= 80) {
			result = "B";
		} else if (score >= 70) {
			result = "C";
		} else {
			result = "F";
		}
		
		System.out.println("점수 = " + score + ", 등급: " + result);
	}
}
