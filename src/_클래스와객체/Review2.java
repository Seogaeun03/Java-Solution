package _클래스와객체;

public class Review2 {
	
	int reviewId;
	int resId;
	String writer;
	String content;
	
	Review2() {
	}
	
	Review2(int reviewId, int resId, String writer, String content) {
		this.reviewId = reviewId;
		this.resId = resId;
		this.writer = writer;
		this.content = content;
	}
	
	public String toString() {
		return String.format("Review [reviewId=%s, resId=%s, writer=%s, content=%s]", reviewId, resId, writer, content);
	}
}

