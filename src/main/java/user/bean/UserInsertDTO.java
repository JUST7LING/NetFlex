package user.bean;

import java.util.Date;

import org.springframework.stereotype.Component;
 

@Component
public class UserInsertDTO {
	private String email;
	private String name;
	private String password;
	private int age;
	private String phone;
	private int active;
	private int seqMembership;
	private Date membershipStartDate;
	private Date membershipEndDate;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public int getSeqMembership() {
		return seqMembership;
	}
	public void setSeqMembership(int seqMembership) {
		this.seqMembership = seqMembership;
	}
	public Date getMembershipStartDate() {
		return membershipStartDate;
	}
	public void setMembershipStartDate(Date membershipStartDate) {
		this.membershipStartDate = membershipStartDate;
	}
	public Date getMembershipEndDate() {
		return membershipEndDate;
	}
	public void setMembershipEndDate(Date membershipEndDate) {
		this.membershipEndDate = membershipEndDate;
	}
	
	
}
