package com.organically4u.model.dto;

import java.io.Serializable;
import java.util.Date;

public class StockDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String Id_stock;
	private String ProductId;
	private String measuringUnit;
	private String scaleLst;
	private double mrp;
	private double ourPrice;
	private Date packedDate;
	private Date receivedDate;
	private Date expireDate;
	private String scale;
	private int counter;
	
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public String getMeasuringUnit() {
		return measuringUnit;
	}
	public void setMeasuringUnit(String measuringUnit) {
		this.measuringUnit = measuringUnit;
	}
	public String getScaleLst() {
		return scaleLst;
	}
	public void setScaleLst(String scaleLst) {
		this.scaleLst = scaleLst;
	}
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	public double getOurPrice() {
		return ourPrice;
	}
	public void setOurPrice(double ourPrice) {
		this.ourPrice = ourPrice;
	}
	public Date getPackedDate() {
		return packedDate;
	}
	public void setPackedDate(Date packedDate) {
		this.packedDate = packedDate;
	}
	public Date getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	
	
	
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public String getId_stock() {
		return Id_stock;
	}
	public void setId_stock(String id_stock) {
		Id_stock = id_stock;
	}
	@Override
	public String toString() {
		return "StockDTO [Id_stock=" + Id_stock + ", ProductId=" + ProductId + ", measuringUnit=" + measuringUnit
				+ ", scaleLst=" + scaleLst + ", mrp=" + mrp + ", ourPrice=" + ourPrice + ", packedDate=" + packedDate
				+ ", receivedDate=" + receivedDate + ", expireDate=" + expireDate + ", scale=" + scale + ", counter="
				+ counter + "]";
	}

	
	public StockDTO(){
		
	}
}
