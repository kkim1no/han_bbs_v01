package org.han.vo;

import java.util.Date;

public class ReplyVO {
<<<<<<< HEAD

=======
	
>>>>>>> a7b933850419c765e92cdf9883138f6190cf8635
	private Integer rno; 
	private Integer bno; 
	private String userid; 
	private String cont; 
	private Date regdate;
	public Integer getRno() {
		return rno;
	}
	public void setRno(Integer rno) {
		this.rno = rno;
	}
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
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
		return "Reply_vo [rno=" + rno + ", bno=" + bno + ", userid=" + userid
				+ ", cont=" + cont + ", regdate=" + regdate + "]";
	}
	
=======
	@Override
	public String toString() {
		return "ReplyVO [rno=" + rno + ", bno=" + bno + ", userid=" + userid
				+ ", cont=" + cont + ", regdate=" + regdate + "]";
	} 
>>>>>>> a7b933850419c765e92cdf9883138f6190cf8635
	
	

}
