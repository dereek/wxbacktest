package com.ceylonchina.stock.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ceylonchina.stock.model.Stock;

public interface StockDao {
	public Stock getById(String id);
	public List<Stock> getStockListByUserName(@Param("username") String username);
}
