package com.organically4u.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;

import com.organically4u.model.Product;
import com.organically4u.model.Stock;
import com.organically4u.model.dto.ProductDTO;
import com.organically4u.model.dto.StockDTO;
import com.organically4u.service.TransactionService;
import com.organically4u.util.Converter;

import groovy.util.logging.Slf4j;


@Slf4j
@Service
public class TransactionServiceImpl implements TransactionService{

	private static Logger logger = LoggerFactory.getLogger(TransactionServiceImpl.class);
	
	@Autowired
	private MongoTemplate mongoTemplate;
	@Autowired
	private GridFsTemplate gridFsTemplate;
	@Autowired
	private Converter converter;
	
	@Override
	public String addStock(StockDTO stockDTO, int count) {
		// TODO Auto-generated method stub
		try {
			for(int i =0;i<count;i++){
				Stock stock = (Stock)converter.convert(Stock.class, stockDTO );
				mongoTemplate.insert(stock);
			}
			return ("success");
		}catch(Exception e) {
			e.printStackTrace();
			logger.error(e.toString());
			return null;
		}
	}
	
	@Override
	public List<StockDTO> getAllStocks(){
		
		List<Stock> stocktlist = new ArrayList<Stock>();
		List<StockDTO>stocktDTOlist = new ArrayList<StockDTO>();
		stocktlist.addAll(mongoTemplate.findAll(Stock.class));
		for(Stock stock :stocktlist){
			stocktDTOlist.add((StockDTO)converter.convert(StockDTO.class, stock ));
		}
		return stocktDTOlist;
	}
	
	
	
	

}
