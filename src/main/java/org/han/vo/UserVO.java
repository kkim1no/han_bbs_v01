package org.han.vo;

import java.util.Date;

public class UserVO {

	private String userid; 
	private String userpw; 
	private String email; 
	private Date regdate;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
<<<<<<< HEAD
	
	
	@Override
	public String toString() {
		return "User_vo [userid=" + userid + ", userpw=" + userpw + ", email="
				+ email + ", regdate=" + regdate + "]";
	} 
=======
	@Override
	public String toString() {
		return "UserVO [userid=" + userid + ", userpw=" + userpw + ", email="
				+ email + ", regdate=" + regdate + "]";
	}
>>>>>>> a7b933850419c765e92cdf9883138f6190cf8635
	
	
}