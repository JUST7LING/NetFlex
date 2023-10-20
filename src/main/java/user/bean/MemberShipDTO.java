package user.bean;

import org.springframework.stereotype.Component;


@Component 
public class MemberShipDTO {
	private int seqMembership;
	private String type;
	private int price;
	private String quality;
	private String resolution;
	public int getSeqMembership() {
		return seqMembership;
	}
	public void setSeqMembership(int seqMembership) {
		this.seqMembership = seqMembership;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	
	
}
