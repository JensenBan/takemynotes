package ca.techguys.takemynotes.beans;

import java.io.Serializable;

/**
 * Test Object bean
 * @author Alex.Liu
 * @date 2014.1.29
 * @email alexliubo@gmail.com
 */
public class News implements Serializable{

	private String title;//���ű���
	private String link;//���ų�����
	private String description;//��������
	private String image_large;//��ͼƬ����
	private String image_small;//СͼƬ����
	private String category; //�������
	private String image_local_path;//ͼƬ_���ص�ַ
	private int imageId;//ͼƬ����id
	private String webData;//��ҳ����
	
	public String getWebData() {
		return webData;
	}
	public void setWebData(String webData) {
		this.webData = webData;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage_large() {
		return image_large;
	}
	public void setImage_large(String imageLarge) {
		image_large = imageLarge;
	}
	public String getImage_small() {
		return image_small;
	}
	public void setImage_small(String imageSmall) {
		image_small = imageSmall;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImage_local_path() {
		return image_local_path;
	}
	public void setImage_local_path(String imageLocalPath) {
		image_local_path = imageLocalPath;
	}
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	@Override
	public String toString() {
		return "News [category=" + category + ", description=" + description
				+ ", imageId=" + imageId + ", image_large=" + image_large
				+ ", image_local_path=" + image_local_path + ", image_small="
				+ image_small + ", link=" + link + ", title=" + title + "]";
	}
	
	
}
