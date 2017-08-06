package com.organically4u.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.organically4u.model.dto.ErrorResponse;
@ControllerAdvice
public class ExceptionController {
 
	
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<ErrorResponse> ProductExceptionHandler(ProductException ex) {
		ErrorResponse error = new ErrorResponse();
		error.setErrorCode(199);
		error.setErrorMessage(ex.getErrorMessage());              
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
		ErrorResponse error = new ErrorResponse();
		error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		error.setErrorMessage(ex.getMessage());
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
	}
	
	
}
