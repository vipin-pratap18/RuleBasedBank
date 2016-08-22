package com.test.model;

import java.util.Date;

public class CashFlow {
	
	private Date date;
	private double amount;
	
	public CashFlow(){}
	
	public CashFlow(Date date, double amount){
		this.date = date;
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String toString(){
		return "CashFlow [date = "+date+", amount = "+amount+"]";
	}

}
