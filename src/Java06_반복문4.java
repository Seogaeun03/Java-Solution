
public class Java06_반복문4 {
	public static void main(String[] args) {
		// break : 가까이 있는 반복문을 종료
		// continue: 남아있는 구문을 수행하지 않고 다음 반복으로 이동
		
		for (int i = 1; i < 11; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
