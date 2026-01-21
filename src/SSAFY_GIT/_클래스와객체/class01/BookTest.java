package SSAFY_GIT._클래스와객체.class01;

public class BookTest {

	public static void main(String[] args) {
		System.out.println("*****************************도서목록*****************************");
		
		Book book1 = new Book("21424", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기본 문법");
		Book book2 = new Book("35355", "분석설계", "소나무", "jaen.kr", 30000, "SW 모델링");
		
		String result1 = book1.toString();
		String result2 = book2.toString();
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
