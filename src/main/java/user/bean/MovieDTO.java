package user.bean;

import java.util.Date;

import org.springframework.stereotype.Component;
 
@Component
public class MovieDTO {
	private int seqMovie;
	private String title;
	private String story;
	private String nation;
	private String director;
	private String actor;
	private Date year;
	private Date releasedate;
	private int liked;
	private int genrecode1;
	private int genrecode2;
	private int genrecode3;
	private String movieSrcUrl;
	private int hit;
	private String thumbnailSrc;
	private String thumbnailSrcUrl;
	public int getSeqMovie() {
		return seqMovie;
	}
	public void setSeqMovie(int seqMovie) {
		this.seqMovie = seqMovie;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	public Date getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(Date releasedate) {
		this.releasedate = releasedate;
	}
	public int getLiked() {
		return liked;
	}
	public void setLiked(int liked) {
		this.liked = liked;
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
	public String getMovieSrcUrl() {
		return movieSrcUrl;
	}
	public void setMovieSrcUrl(String movieSrcUrl) {
		this.movieSrcUrl = movieSrcUrl;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getThumbnailSrc() {
		return thumbnailSrc;
	}
	public void setThumbnailSrc(String thumbnailSrc) {
		this.thumbnailSrc = thumbnailSrc;
	}
	public String getThumbnailSrcUrl() {
		return thumbnailSrcUrl;
	}
	public void setThumbnailSrcUrl(String thumbnailSrcUrl) {
		this.thumbnailSrcUrl = thumbnailSrcUrl;
	}
	
	
}