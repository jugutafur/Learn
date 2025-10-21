package Domain.dto.Potfolio;

import java.io.Serializable;

public class NavigatorPhoto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String itemImageSrc;
	private String thumbnailImageSrc;
	private String alt;
	private String title;

	public NavigatorPhoto() {}

	public NavigatorPhoto(String itemImageSrc, String thumbnailImageSrc, String alt, String title) {
		this.itemImageSrc = itemImageSrc;
		this.thumbnailImageSrc = thumbnailImageSrc;
		this.alt = alt;
		this.title = title;
	}

	public String getItemImageSrc() {return itemImageSrc;}
	public void setItemImageSrc(String itemImageSrc) {this.itemImageSrc = itemImageSrc;}

	public String getThumbnailImageSrc() {return thumbnailImageSrc;}
	public void setThumbnailImageSrc(String thumbnailImageSrc) {this.thumbnailImageSrc = thumbnailImageSrc;}

	public String getAlt() {return alt;}
	public void setAlt(String alt) {this.alt = alt;}

	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}

	@Override
	public String toString() {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("NavigatorPhoto = [")
		.append(" itemImageSrc=" + itemImageSrc)
		.append(" thumbnailImageSrc=" + thumbnailImageSrc)
		.append(" alt="+ alt )
		.append(" title=" + title)
		.append("]");
		
		return stringBuilder.toString();
	}
	

}
