package com.organically4u.model.dto;

public class ProductDTO {
	
	String Id;
	String productName;
	String prodShotDesc;
	String prodLongDesc;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getProdShotDesc() {
		return prodShotDesc;
	}
	public void setProdShotDesc(String prodShotDesc) {
		this.prodShotDesc = prodShotDesc;
	}
	public String getProdLongDesc() {
		return prodLongDesc;
	}
	public void setProdLongDesc(String prodLongDesc) {
		this.prodLongDesc = prodLongDesc;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public ProductDTO(String id, String productName, String prodShotDesc, String prodLongDesc) {
		super();
		Id = id;
		this.productName = productName;
		this.prodShotDesc = prodShotDesc;
		this.prodLongDesc = prodLongDesc;
	}
	public ProductDTO(){}
	@Override
	public String toString() {
		return "ProductDTO [Id=" + Id + ", productName=" + productName + ", prodShotDesc=" + prodShotDesc
				+ ", prodLongDesc=" + prodLongDesc + "]";
	}
	
}
