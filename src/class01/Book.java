package class01;

public class Book {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;
	
	// 기본 생성자
	Book() {
	}
	
	Book(String isbn, String title, String author, String publisher, int price, String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}
	
	public String toString() {
		return String.format("%s\t| %s\t| %s\t| %s\t| %d\t| %s", isbn, title, author, publisher, price, desc);
	}
}
