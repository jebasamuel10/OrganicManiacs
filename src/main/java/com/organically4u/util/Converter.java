package com.organically4u.util;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Converter {
	
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
	
	
	public Object convert(Class <?> clazz, Object model){
		Object model2 = modelMapper().map(model, clazz);
		return model2;
	}
			
}
