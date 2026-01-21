package class01;

public class Review {
	int reviewId;
	String pCode;
	String writer;
	String content;
	
	Review() {
	}
	
	Review(int reviewId, String pCode, String writer, String content) {
		this.reviewId = reviewId;
		this.pCode = pCode;
		this.writer = writer;
		this.content = content;
	}
	
	public String toString() {
		return String.format("Review [reviewId=%s, pCode=%s, writer=%s, content=%s]", reviewId, pCode, writer, content);
	}
}
