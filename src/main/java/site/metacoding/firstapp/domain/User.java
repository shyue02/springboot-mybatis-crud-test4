package site.metacoding.firstapp.domain;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class User {
	private Integer userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	private Timestamp createdAt;
	
	
	public User(String userName, String userPassword, String userEmail) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
	}
	
}
