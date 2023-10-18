package user.bean;

import java.util.Date;

import org.springframework.stereotype.Component;
 
@Component
public class MovieEpDTO {
	int ep;
	String eptitle;
	String epstory;
	Date runtime;
	String thumbnail;
	String Grade;
	String url;
	int seqMovie;
	public int getEp() {
		return ep;
	}
	public void setEp(int ep) {
		this.ep = ep;
	}
	public String getEptitle() {
		return eptitle;
	}
	public void setEptitle(String eptitle) {
		this.eptitle = eptitle;
	}
	public String getEpstory() {
		return epstory;
	}
	public void setEpstory(String epstory) {
		this.epstory = epstory;
	}
	public Date getRuntime() {
		return runtime;
	}
	public void setRuntime(Date runtime) {
		this.runtime = runtime;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getSeqMovie() {
		return seqMovie;
	}
	public void setSeqMovie(int seqMovie) {
		this.seqMovie = seqMovie;
	}
	
	
}
