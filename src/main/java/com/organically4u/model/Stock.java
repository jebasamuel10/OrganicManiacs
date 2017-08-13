package com.organically4u.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Stock implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
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
	private int nos;
	
	
	public String getId_stock() {
		return Id_stock;
	}
	public void setId_stock(String id_stock) {
		Id_stock = id_stock;
	}
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
	public int getNos() {
		return nos;
	}
	public void setNos(int nos) {
		this.nos = nos;
	}

	public Stock(){
		
	}
}
