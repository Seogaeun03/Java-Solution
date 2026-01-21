package class02;
import java.util.Date;

public class Comment {
	
	int commentId;      
    int articleId;     
    int userSeq;      
    String content;  
    Date regDate;
    
    Comment() {
    }
    
    Comment(int commentId, int articleId, int userSeq, String content) {
        this.commentId = commentId;
        this.articleId = articleId;
        this.userSeq = userSeq;
        this.content = content;
        this.regDate = new Date();
    }
    
    public String toString() {
        return String.format("Comment [commentId=%s, articleId=%s, userSeq=%s, content=%s, regDate=%s]",
                commentId, articleId, userSeq, content, regDate);
    }
}
