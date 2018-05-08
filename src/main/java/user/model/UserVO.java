package user.model;

import java.util.Date;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class UserVO implements HttpSessionBindingListener{
	
	private String name;
	private String userId;
	private String password;

	
	private String mem_id;
	private String mem_pass;
	private String mem_name;
	private String mem_add1;
	private String mem_add2;
	private String mem_zip;
	private Date mem_bir;
	private String mem_alias;
	private String mem_profile;
	
	public UserVO() {
		super();
	}
	
	public UserVO(String name, String userId, String password) {
		super();
		this.name = name;
		this.userId = userId;
		this.password = password;
	}
	

	public UserVO(String name, String userId, String password, String mem_id,
			String mem_pass, String mem_name, String mem_add1, String mem_add2,
			String mem_zip, Date mem_bir, String mem_alias, String mem_profile) {
		super();
		this.name = name;
		this.userId = userId;
		this.password = password;
		this.mem_id = mem_id;
		this.mem_pass = mem_pass;
		this.mem_name = mem_name;
		this.mem_add1 = mem_add1;
		this.mem_add2 = mem_add2;
		this.mem_zip = mem_zip;
		this.mem_bir = mem_bir;
		this.mem_alias = mem_alias;
		this.mem_profile = mem_profile;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_pass() {
		return mem_pass;
	}

	public void setMem_pass(String mem_pass) {
		this.mem_pass = mem_pass;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public String getMem_add1() {
		return mem_add1;
	}

	public void setMem_add1(String mem_add1) {
		this.mem_add1 = mem_add1;
	}

	public String getMem_add2() {
		return mem_add2;
	}

	public void setMem_add2(String mem_add2) {
		this.mem_add2 = mem_add2;
	}

	public String getMem_zip() {
		return mem_zip;
	}

	public void setMem_zip(String mem_zip) {
		this.mem_zip = mem_zip;
	}

	public Date getMem_bir() {
		return mem_bir;
	}

	public void setMem_bir(Date mem_bir) {
		this.mem_bir = mem_bir;
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
				+ password + ", mem_id=" + mem_id + ", mem_pass=" + mem_pass
				+ ", mem_name=" + mem_name + ", mem_add1=" + mem_add1
				+ ", mem_add2=" + mem_add2 + ", mem_zip=" + mem_zip
				+ ", mem_bir=" + mem_bir + ", mem_alias=" + mem_alias
				+ ", mem_profile=" + mem_profile + "]";
	}
	
	/**
	 * Method : valueBound
	 * 최초작성일 : 2018. 5. 3.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param event
	 * Method 설명 :
	 */
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("valueBound : " + event.getName());
	}
	
	/**
	 * Method : valueUnbound
	 * 최초작성일 : 2018. 5. 3.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param event
	 * Method 설명 :
	 */
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("valueUnbound : " + event.getName());
		
	}

	public String getMem_alias() {
		return mem_alias;
	}

	public void setMem_alias(String mem_alias) {
		this.mem_alias = mem_alias;
	}

	public String getMem_profile() {
		return mem_profile;
	}

	public void setMem_profile(String mem_profile) {
		this.mem_profile = mem_profile;
	}
	
}
