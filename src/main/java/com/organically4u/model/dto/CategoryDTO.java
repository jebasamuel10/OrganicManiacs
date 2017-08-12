package com.organically4u.model.dto;

public class CategoryDTO {
	private String id_category;
	private String categoryName;
	private String categoryDescription;
	
	
	public String getId_category() {
		return id_category;
	}
	public void setId_category(String id_category) {
		this.id_category = id_category;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	
	public CategoryDTO(){
	}
	
	@Override
	public String toString() {
		return "ProductDTO [Id=" + id_category + ", categoryName=" + categoryName + ", categoryDescription=" + categoryDescription +  "]";
	}
}