package com.organically4u.model.converter;

import java.util.ArrayList;
import java.util.List;

import com.organically4u.model.Product;
import com.organically4u.model.dto.ProductDTO;

public class ConvertToModel {

	 public static List<Product> convertToModel(List<ProductDTO> dtoList) {
	    	List<Product> productList = new ArrayList();
	    	for (ProductDTO productDTO : dtoList) {
	    		productList.add(convertToModel(productDTO));
			}
	    	return productList;
	    }
	 
	 public static Product convertToModel(ProductDTO model) {
		 Product product = new Product();
		 product.setId(model.getId());
		 product.setProductName(model.getProductName());
		 product.setProductLongDesc(model.getProdLongDesc());
		 product.setProductShortDesc(model.getProdShotDesc());
	     return product;
	    }
}
