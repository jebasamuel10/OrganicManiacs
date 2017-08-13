package com.organically4u.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SourceFrom {

	@Id
	private String id_srcFrom;
	private ImageDetail srcFromImg;
	private String srcFromName;
	private String srcFromdistrict;
	private String srcFromphNo;
	private String srcFromaddress;
	private List<String> productList;
	
	public SourceFrom(){
	}

	public String getId_srcFrom() {
		return id_srcFrom;
	}

	public void setId_srcFrom(String id_srcFrom) {
		this.id_srcFrom = id_srcFrom;
	}

	public ImageDetail getSrcFromImg() {
		return srcFromImg;
	}

	public void setSrcFromImg(ImageDetail srcFromImg) {
		this.srcFromImg = srcFromImg;
	}

	public String getSrcFromName() {
		return srcFromName;
	}

	public void setSrcFromName(String srcFromName) {
		this.srcFromName = srcFromName;
	}

	public String getSrcFromdistrict() {
		return srcFromdistrict;
	}

	public void setSrcFromdistrict(String srcFromdistrict) {
		this.srcFromdistrict = srcFromdistrict;
	}

	public String getSrcFromphNo() {
		return srcFromphNo;
	}

	public void setSrcFromphNo(String srcFromphNo) {
		this.srcFromphNo = srcFromphNo;
	}

	public String getSrcFromaddress() {
		return srcFromaddress;
	}

	public void setSrcFromaddress(String srcFromaddress) {
		this.srcFromaddress = srcFromaddress;
	}

	public List<String> getProductList() {
		return productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}

	
}
