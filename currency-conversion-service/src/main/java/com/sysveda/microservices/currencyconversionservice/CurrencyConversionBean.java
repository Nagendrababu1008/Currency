package com.sysveda.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	private int id;
	private String from;
	private String to;
	private BigDecimal amount ;
	private BigDecimal conversionMultiple ;
	private BigDecimal calculatedAmount ;
	private int port;
	public CurrencyConversionBean() {
		
	}

	public CurrencyConversionBean(int id, String from, String to, BigDecimal amount, BigDecimal conversionMultiple,
			BigDecimal calcultedAmount, int port) {
		super();
		this.id=id;
		this.from=from;
		this.conversionMultiple=conversionMultiple;
		this.calculatedAmount=calcultedAmount;
		this.port=port;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal converionMultiple) {
		this.conversionMultiple = converionMultiple;
	}
	public BigDecimal getCalculatedAmount() {
		return calculatedAmount;
	}
	public void setCalculatedAmount(BigDecimal calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
}
