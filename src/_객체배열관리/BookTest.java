package _객체배열관리;

public class BookTest {

	public static void main(String[] args) {
		//객체 생성
		Book b1 = new Book("21424", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기본 문법");
        Book b2 = new Book("21425", "Java Pro2", "김하나", "jaen.kr", 25000, "Java 응용");
        Book b3 = new Book("35355", "분석설계", "소나무", "jaen.kr", 30000, "SW 모델링");
        
        BookManager.getManager().add(b1);
        BookManager.getManager().add(b2);
        BookManager.getManager().add(b3);
        
        System.out.println("*****************도서목록*****************");
        for (Book b : BookManager.getManager().getList()) {
            System.out.println(b); 
        }
        
        System.out.println("*****************도서조회:21424*****************");
        System.out.println(BookManager.getManager().searchByIsbn("21424"));
        
        System.out.println("*****************도서삭제:21424*****************");
        BookManager.getManager().remove("21424");
        
        System.out.println("*****************도서목록*****************");
        for (Book b : BookManager.getManager().getList()) {
            System.out.println(b); 
        }
        
	}	

}

