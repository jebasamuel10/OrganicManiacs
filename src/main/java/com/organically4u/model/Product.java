package com.organically4u.model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.organically4u.model.dto.SupportURLDTO;

@Document
public class Product {
	
	@Id
	private String Id_product;
	//private List<ImageDetail> imgList;
	//private ImageDetail defaultImage;
	private String productName;
	private String prodLongDesc;
	private String shortDesc;
	private String categoryName;
	private String BrandName;
	private String measuringUnit;
	private Date expriyDate;
	private Date mfdate;
	private List<SupportURLDTO> benifits;
	private List<SupportURLDTO> recipe;
	
	
	public String getId_product() {
		return Id_product;
	}

	public void setId_product(String id) {
		this.Id_product = id;
	}

	
/*	public List<ImageDetail> getImgList() {
		return imgList;
	}

	public void setImgList(List<ImageDetail> imgList) {
		this.imgList = imgList;
	}
*/
/*
	public ImageDetail getDefaultImage() {
		return defaultImage;
	}

	public void setDefaultImage(ImageDetail defaultImage) {
		this.defaultImage = defaultImage;
	}
*/

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProdLongDesc() {
		return prodLongDesc;
	}

	public void setProdLongDesc(String prodLongDesc) {
		this.prodLongDesc = prodLongDesc;
	}
	
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getMeasuringUnit() {
		return measuringUnit;
	}

	public void setMeasuringUnit(String measuringUnit) {
		this.measuringUnit = measuringUnit;
	}

	public List<SupportURLDTO> getBenifits() {
		return benifits;
	}

	public void setBenifits(List<SupportURLDTO> benifits) {
		this.benifits = benifits;
	}

	public List<SupportURLDTO> getRecipe() {
		return recipe;
	}

	public void setRecipe(List<SupportURLDTO> recipe) {
		this.recipe = recipe;
	}
	
	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public Date getExpriyDate() {
		return expriyDate;
	}

	public void setExpriyDate(Date expriyDate) {
		this.expriyDate = expriyDate;
	}

	public Date getMfdate() {
		return mfdate;
	}

	public void setMfdate(Date mfdate) {
		this.mfdate = mfdate;
	}
}

