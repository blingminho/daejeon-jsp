package user.model;

public class UserVO {
	private String name;
	private String userId;
	private String password;
	
	public UserVO() {
		super();
	}
	
	public UserVO(String name, String userId, String password) {
		super();
		this.name = name;
		this.userId = userId;
		this.password = password;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserVO [name=" + name + ", userId=" + userId + ", password="
				+ password + "]";
	}
	
}
