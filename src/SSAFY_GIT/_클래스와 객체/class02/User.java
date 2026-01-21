package class02;

public class User {

	int userSeq;
	String userId;
	String password;
	String userName;
	String nickName;
	String email;

	public User() {
	}

	public User(int userSeq, String userId, String password, String userName, String nickName, String email) {
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
