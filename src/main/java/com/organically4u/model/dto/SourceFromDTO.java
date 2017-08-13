package com.organically4u.model.dto;

import java.util.List;


public class SourceFromDTO {

	private String id;
	private ImageDetailDTO img;
	private String name;
	private String district;
	private String phNo;
	private String address;
	private List<String> productList;

	public SourceFromDTO(){
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ImageDetailDTO getImg() {
		return img;
	}

	public void setImg(ImageDetailDTO img) {
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getProductList() {
		return productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "SourceFromDTO [id=" + id + ", img=" + img + ", name=" + name + ", district=" + district + ", phNo="
				+ phNo + ", address=" + address + ", productList=" + productList + "]";
	}

	
}
