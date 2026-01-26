package _클래스와객체;

public class User2 {

	int userSeq;
	String userId;
	String password;
	String userName;
	String nickName;
	String email;

	public User2() {
	}

	public User2(int userSeq, String userId, String password, String userName, String nickName, String email) {
		this.userSeq = userSeq;
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.nickName = nickName;
		this.email = email;
	}

	public String toString() {
		return String.format("User [userSeq=%s, userId=%s, password=%s, userName=%s, nickName=%s, email=%s]", userSeq,
				userId, password, userName, nickName, email);
	}
}

