package com.organically4u.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	
	@Id
	private String id;

	private String productName;
	private String productShortDesc;
	private String productLongDesc;
	
	public Product(){
	}
	
	public Product(String productName, String productShortDesc, String productLongDesc) {
		this.productName =productName;
		this.productShortDesc=productShortDesc;
		this.productLongDesc=productLongDesc;
		
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductShortDesc() {
		return productShortDesc;
	}
	public void setProductShortDesc(String productShortDesc) {
		this.productShortDesc = productShortDesc;
	}
	public String getProductLongDesc() {
		return productLongDesc;
	}
	public void setProductLongDesc(String productLongDesc) {
		this.productLongDesc = productLongDesc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
