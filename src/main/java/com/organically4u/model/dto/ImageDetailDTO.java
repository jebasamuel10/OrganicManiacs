package com.organically4u.model.dto;

public class ImageDetailDTO {

	private String id_image;
	private String imgLocation;
	private String altText;

	public ImageDetailDTO() {
	}

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

	@Override
	public String toString() {
		return "ImageDetailDTO [id_image=" + id_image + ", imgLocation=" + imgLocation + ", altText=" + altText + "]";
	}

}
