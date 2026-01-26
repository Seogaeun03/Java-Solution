package _클래스와객체;

import java.util.Date;

public class Article {

	int articleId;
	String title;
	String content;
	int userSeq;
	int viewCnt;
	Date regDate;

	Article() {
	}

	Article(int articleId, String title, String content, int userSeq, int viewCnt) {
		this.articleId = articleId;
		this.title = title;
		this.content = content;
		this.userSeq = userSeq;
		this.viewCnt = viewCnt;
		this.regDate = new Date();
	}

	public String toString() {
		return String.format("Article [articleId=%s, title=%s, content=%s, userSeq=%s, viewCnt=%s, regDate=%s]",
				articleId, title, content, userSeq, viewCnt, regDate);
	}
}

