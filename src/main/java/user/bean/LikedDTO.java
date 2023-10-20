package user.bean;

import org.springframework.stereotype.Component;

@Component
public class LikedDTO {
	private int seqliked;
	private int seqMovie;
	private int seqNick;
	private String email;
	public int getSeqliked() {
		return seqliked;
	}
	public void setSeqliked(int seqliked) {
		this.seqliked = seqliked;
	}
	public int getSeqMovie() {
		return seqMovie;
	}
	public void setSeqMovie(int seqMovie) {
		this.seqMovie = seqMovie;
	}
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
	
	
}
