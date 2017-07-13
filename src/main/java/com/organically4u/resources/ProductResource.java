package com.organically4u.resources;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.gridfs.GridFSDBFile;
import com.organically4u.model.Product;
import com.organically4u.model.dto.ProductDTO;
import com.organically4u.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductResource {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/getAllProducts",method={RequestMethod.GET})
	@ResponseBody
	public List<ProductDTO> getAllProduct(){
		System.out.println("getAllProudct");
		return productService.getAllProducts();
	}
	
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
	
	@ResponseBody
	@RequestMapping(value = "/getImage", method = RequestMethod.GET)
	public ResponseEntity getImage() throws IOException {
		GridFSDBFile gridFsFile = productService.retrieveProductImage();
	    return ResponseEntity.ok()
	            .contentLength(gridFsFile.getLength())
	            .contentType(MediaType.parseMediaType(gridFsFile.getContentType()))
	            .body(new InputStreamResource(gridFsFile.getInputStream()));
	    
	}
}
