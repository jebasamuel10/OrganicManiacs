package com.organically4u.resources;

import java.io.FileNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.organically4u.model.dto.ProductDTO;
import com.organically4u.service.ProductService;


import groovy.util.logging.Slf4j;

@Slf4j
@RestController
@RequestMapping("/admin")
public class PostingAdminResource {

	private static Logger log = LoggerFactory.getLogger(PostingAdminResource.class);
	
	@Autowired
	ProductService productService;
	
	
	//Product CRUD Operations -Start
	@PostMapping(value="/addProduct",consumes="application/json")
	public String addProduct(@RequestBody ProductDTO productDTO){
		log.debug("Add:"+productDTO.toString());
		System.out.println("Add:"+productDTO.toString());
		return productService.addProduct(productDTO);
	}
	
	@RequestMapping(value="/deleteProduct",method={RequestMethod.GET})
	public String deleteProduct(@RequestParam String id){
	log.debug("Delete prod:"+id);
	return productService.deleteProduct(id);
	}
	
	
	@PostMapping(value="/updateProdDtl",consumes="application/json")
	public String updateProductDetails(@RequestBody ProductDTO productDTO){
		log.debug("Add:"+productDTO.toString());
		return productService.addProduct(productDTO);
	}
	
	//Product CRUD Operations -End
	
	//Category CRUD Operations -Start
	@PostMapping(value="/addCategory",consumes="application/json")
	public String addCategory(@RequestBody ProductDTO productDTO){
		log.debug("Add:"+productDTO.toString());
		return productService.addProduct(productDTO);
	}
	
	@RequestMapping(value="/deleteCategory",method={RequestMethod.GET})
	public String deleteCategory(@RequestParam String id){
	log.debug("Delete prod:"+id);
	return productService.deleteProduct(id);
	}
	
	
	@PostMapping(value="/updateCategory",consumes="application/json")
	public String updateCategory(@RequestBody ProductDTO productDTO){
		log.debug("Add:"+productDTO.toString());
		return productService.addProduct(productDTO);
	}
	//Category CRUD Operations -End
	
	
	
	//SourceFrom CRUD Operations -Start
	@PostMapping(value="/addSrcFrom",consumes="application/json")
	public String addSourceFrom(@RequestBody ProductDTO productDTO){
		log.debug("Add:"+productDTO.toString());
		return productService.addProduct(productDTO);
	}
	
	@RequestMapping(value="/deleteSrcFrom",method={RequestMethod.GET})
	public String delteSourceFrom(@RequestParam String id){
	log.debug("Delete prod:"+id);
	return productService.deleteProduct(id);
	}
	
	
	@PostMapping(value="/updateSrcFrom",consumes="application/json")
	public String updateSourceFrom(@RequestBody ProductDTO productDTO){
		log.debug("Add:"+productDTO.toString());
		return productService.addProduct(productDTO);
	}
	//SourceFrom CRUD Operations -End


	
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
