package user.bean;

import org.springframework.stereotype.Component;
 

@Component
public class ReportDTO {
	int seqReport;
	int seqComment;
	String Comment;
	String nickname;
	String email;
	String content;
	int checked;
	public int getSeqReport() {
		return seqReport;
	}
	public void setSeqReport(int seqReport) {
		this.seqReport = seqReport;
	}
	public int getSeqComment() {
		return seqComment;
	}
	public void setSeqComment(int seqComment) {
		this.seqComment = seqComment;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getChecked() {
		return checked;
	}
	public void setChecked(int checked) {
		this.checked = checked;
	}
	
	
}
