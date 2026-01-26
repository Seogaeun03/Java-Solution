package _객체배열관리;

public class BookManager {
	int MAX_SIZE = 100;
	Book[] books = new Book[MAX_SIZE];
	int size = 0;

	// 싱글톤
	private static BookManager manager = new BookManager();

	private BookManager() {
	}

	public static BookManager getManager() {
		return manager;
	}

	// add
	public void add(Book book) {
		if (size <= MAX_SIZE) {
			books[size] = book;
			size++;
		} else {
			System.out.println("더 이상 저장 할 수 없습니다!");
		}
	}

	// remove
	public void remove(String isbn) {
		for (int i = 0; i < size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				for (int j = i; j < size - 1; j++) {
					books[j] = books[j + 1];
				}
				size--;
				System.out.println("정상적으로 삭제되었습니다.");
				return;
			} else {
				System.out.println("발견되지 않았습니다. 다시 입력해주세요.");
			}
		}
	}
	
	//getList
	public Book[] getList() {
		Book[] tmp = new Book[size];
		
		for (int i = 0; i < size; i++) {
			tmp[i] = books[i];
		}
		return tmp;
	}
	
	//searchByIsbn
	public Book searchByIsbn(String isbn) {
		Book result = new Book();
		
		for (int i = 0; i < size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				result = books[i];
			}
		}
		
		return result;
	}

}

