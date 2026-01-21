package SSAFY_GIT._클래스와객체.class02;

public class BoardTest {

	public static void main(String[] args) {

		User user1 = new User(0, "ssafy", "1234", "김싸피", "김싸피", "ssafy@ssafy.com");
		User user2 = new User(1, "hong", "123", "홍싸피", "김싸피", "hong@ssafy.com");
		User user3 = new User(2, "samsic", "samsic", "김삼식", "김싸피", "kim@ssafy.com");
		User user4 = new User(3, "happy", "happy", "김싸피", "이싸피", "lee@ssafy.com");

		Article article1 = new Article(0, "공지사항", "게시글 내용", 0, 0);
		Article article2 = new Article(1, "코딩테스트란,", "게시글 내용", 1, 0);
		Article article3 = new Article(2, "취뽀는 나에게,", "게시글 내용", 2, 0);
		Article article4 = new Article(3, "완전정복,", "게시글 내용", 3, 0);

		Comment comment1 = new Comment(0, 1, 5, "잘 보았습니다.");
		Comment comment2 = new Comment(1, 1, 4, "좋은 글 입니다~~");

		String u1 = user1.toString();
		String u2 = user2.toString();
		String u3 = user3.toString();
		String u4 = user4.toString();

		String at1 = article1.toString();
		String at2 = article2.toString();
		String at3 = article3.toString();
		String at4 = article4.toString();

		String cm1 = comment1.toString();
		String cm2 = comment2.toString();

		System.out.println("User 출력");
		System.out.println("----------------------------------------");
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);
		System.out.println();
		System.out.println("게시글");
		System.out.println("----------------------------------------");
		System.out.println(at1);
		System.out.println(at2);
		System.out.println(at3);
		System.out.println(at4);
		System.out.println();
		System.out.println("게시글 댓글 출력");
		System.out.println("----------------------------------------");
		System.out.println(cm1);
		System.out.println(cm2);
	}

}
