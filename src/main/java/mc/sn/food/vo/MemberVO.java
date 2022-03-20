package mc.sn.food.vo;

import org.springframework.stereotype.Component;

@Component("memberVO")
public class MemberVO {
	private String email;
	private String pwd;
	private String name;
	private String phone;
	private String proImg;
	
	
	public MemberVO() {
		
	}


	public MemberVO(String email, String pwd, String name, String phone, String proImg) {
		super();
		this.email = email;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.proImg = proImg;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getProImg() {
		return proImg;
	}


	public void setProImg(String proImg) {
		this.proImg = proImg;
	}

}
