
public class Java06_반복문2 {
	public static void main(String[] args) {
		// while(조건식) { 반복내용}
		// 조건식 생략 불가능
		
		int i = 1;
		
		while (true) {
			if (i > 10) break;
		System.out.println(i++);
		}
		
		while (i <= 10) {
			System.out.println(i++);
		}
	}
}
