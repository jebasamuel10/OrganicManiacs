package com.organically4u.service;

import java.util.List;

import com.organically4u.model.dto.StockDTO;

public interface TransactionService {

	public String addStock(StockDTO stockDTO);
	public List<StockDTO> getAllStocks();
	
}
