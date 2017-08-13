package com.organically4u.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ImageDetail {
	@Id
	private String id_image;
	private String imgLocation;
	private String altText;
	
	
	
	public String getId_image() {
		return id_image;
	}
	public void setId_image(String id_image) {
		this.id_image = id_image;
	}
	public String getImgLocation() {
		return imgLocation;
	}
	public void setImgLocation(String imgLocation) {
		this.imgLocation = imgLocation;
	}
	public String getAltText() {
		return altText;
	}
	public void setAltText(String altText) {
		this.altText = altText;
	}
	
	
}
