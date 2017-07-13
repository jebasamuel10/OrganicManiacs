package com.organically4u.dto.converter;

import java.util.ArrayList;
import java.util.List;

import com.organically4u.model.Product;
import com.organically4u.model.dto.ProductDTO;

public class ConvertToDTO {

	 public static List<ProductDTO> convertToDTOs(List<Product> models) {
	    	List<ProductDTO> productDTOList = new ArrayList();
	    	System.out.println("models"+models);
	    	for (Product product : models) {
	    		productDTOList.add(convertToDTO(product));
			}
	    	return productDTOList;
	    }
	 
	 public static ProductDTO convertToDTO(Product model) {
	        ProductDTO dto = new ProductDTO();
	        dto.setId(model.getId());
	        dto.setProductName(model.getProductName());
	        dto.setProdLongDesc(model.getProductLongDesc());
	        dto.setProdShotDesc(model.getProductShortDesc());
	        return dto;
	    }
}
