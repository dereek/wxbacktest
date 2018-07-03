package com.ceylonchina.stock.model;

public class StockInfo {
	private String id;
	private String stockId;
	private String date;
	private float value;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "StockInfo [id=" + id + ", stockId=" + stockId + ", date=" + date + ", value=" + value + "]";
	}
	
}
