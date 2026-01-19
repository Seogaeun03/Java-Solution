
public class Java04_Operator {
	public static void main(String[] args) {
		// 산술연산자 : 수학적인 연산
		//  +, -, *, /, %(나머지)
		// 정수와정수를 연산 -> 정수
		// 정수와실수를 연산 -> 실수
		
		System.out.println(4 / 2);
		System.out.println(4 % 2);
		System.out.println(5 / 2);
		
		// 비교연산자 : 결과가 true/ false 값으로 나온다.
		
		int num1 = 100;
		int num2 = 200;
		int num3 = 100;
		
		System.out.println(num1 < num2);
		System.out.println(num1 > num2);
		
		// 논리연산자 : 해당 결과들고 t/f 형태로
		// && : 둘 다 참 -> 참
		// || : 적어도 하나 참 -> 참
		// ! : 결과를 반대로
		// 단축평가를 잘 생각해보자 (생각보다 순서 중요함)
		
		if (num1 == num2 && num1 == num3) {
			System.out.println("둘다 참");
		}
		
		if (num1 == num2 || num1 == num3) {
			System.out.println("하나만 참");
		}
			
		// 대입 복합 연산자

		num1 += 20;
		System.out.println(num1);
		
		// 단항 연산자(증감)
		
		int f = 100;
		//System.out.println(f++);
		//System.out.println(f);
		
		//System.out.println(++f);
		//System.out.println(f);
		
		System.out.println(++f + f-- + f + --f);
		
		// 삼항 연산자 (조건)? (참):(거짓) 
		String s = "";
		
		s = (num1 % 2 == 0) ? ("짝수") : ("홀수");
		
		System.out.println(s);
		
		
		
		
		
	}
}
