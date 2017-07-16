package com.organically4u.resources;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.organically4u.model.dto.ProductDTO;
import com.organically4u.service.ProductService;

@RestController
@RequestMapping("/admin")
public class PostingAdminResource {

	
	@Autowired
	ProductService productService;
	
	
	
	@PostMapping(value="/addProduct",consumes="application/json")
	public String addProduct(@RequestBody ProductDTO productDTO){
		System.out.println("Add:"+productDTO.toString());
		return productService.addProduct(productDTO);
	}
	
	@RequestMapping(value="/deleteProduct",method={RequestMethod.GET})
	public String getProduct(@RequestParam String id){
	System.out.println("Delete prod:"+id);
	return productService.deleteProduct(id);
	}
	
	
	@RequestMapping(value="/storeImage",method={RequestMethod.GET})
	public String storeImage(){
		try {
			return productService.storeProductImage();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	
}
