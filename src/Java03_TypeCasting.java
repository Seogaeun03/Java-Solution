//마음의 숙제 -> 마숙
public class Java03_TypeCasting {
	public static void main(String[] args) {

		// 형변환: 자료형을 바꾸는 것
		// 1. 묵시적 형변환
		// -범위가 작은 자료형 -> 범위가 큰 자료형으로 이사

		int number = 10;
		long number2 = number;
		
		
		// 2. 명시적 형변환
		// -범위가 큰 자료형 -> 범위가 작은 자료형으로 이사
		// -기본적으로 에러가 남. 안됨.
		// -프로그래머가 명시적으로 바꿔줘야 함.
		// -형변환 연산자 사용 : (바꾸고싶은자료형)

		number = (int) number2; // 8byte -> 4byte
		
		// 리터럴
		// -값을 소스코드상에 적어 놓은 것.
		// -데이터형에 따라서 값의 표기 방법이 다르다.

		
	}
}
