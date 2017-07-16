package com.organically4u.resources;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.gridfs.GridFSDBFile;
import com.organically4u.exception.ProductException;
import com.organically4u.model.dto.ProductDTO;
import com.organically4u.service.ProductService;

@RestController
@RequestMapping("/get")
public class EnquiryResource {

	@Autowired
	ProductService productService;
	
	
	@RequestMapping(value="/AllProducts",method={RequestMethod.GET})
	@ResponseBody
	public ResponseEntity<List<ProductDTO>> getAllProduct() throws ProductException{
		System.out.println("getAllProudct");
		if(1==1)
			throw new ProductException("1 = 1");
		return new ResponseEntity<List<ProductDTO>>(productService.getAllProducts(), HttpStatus.OK);
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