package org.edu.vo;

import java.util.Date;

/**
 * 
 * @author 김다혜 2020-12-04
 *
 */
public class MemberVO {
	//멤버변수 선언(클래스 전역변수)
	private String user_id;
	private String user_pw;
	private String user_name;
	private String email;
	private Integer point;//int(not null) 기본형 ->참조형은 Integer(null가능)
	//member_write.jsp에서 전송값이 point가 반값으로 올때,int형에러발생, Integer이 에러가 없음.
	private Boolean enabled;//불린형은 true,false 2개의 값중 1개.
	private String levels;//오라클에서는 level이 예약어라서 levels로 변경
	private Date reg_date;//회원정보 수정일 필드.
	//get,set 메서드가 필요한 이유는 member_list(write,update).jsp<-겟셋메서드->컨트롤러<-겟셋메서드->DB
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getLevels() {
		return levels;
	}
	public void setLevels(String levels) {
		this.levels = levels;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
}
