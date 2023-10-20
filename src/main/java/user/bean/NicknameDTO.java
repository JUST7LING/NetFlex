package user.bean;

import java.util.Date;

import org.springframework.stereotype.Component;
 

@Component
public class NicknameDTO {
	private int seqNick;
	private String email;
	private String nickname;
	private int genrecode1;
	private int genrecode2;
	private int genrecode3;
	private int seqProfile;
	public int getSeqNick() {
		return seqNick;
	}
	public void setSeqNick(int seqNick) {
		this.seqNick = seqNick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getGenrecode1() {
		return genrecode1;
	}
	public void setGenrecode1(int genrecode1) {
		this.genrecode1 = genrecode1;
	}
	public int getGenrecode2() {
		return genrecode2;
	}
	public void setGenrecode2(int genrecode2) {
		this.genrecode2 = genrecode2;
	}
	public int getGenrecode3() {
		return genrecode3;
	}
	public void setGenrecode3(int genrecode3) {
		this.genrecode3 = genrecode3;
	}
	public int getSeqProfile() {
		return seqProfile;
	}
	public void setSeqProfile(int seqProfile) {
		this.seqProfile = seqProfile;
	}
	
	
}
