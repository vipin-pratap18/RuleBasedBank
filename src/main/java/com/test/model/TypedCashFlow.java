package com.test.model;

import java.util.Date;

public class TypedCashFlow extends CashFlow{
	
	public static final int CREDIT = 0;
	public static final int DEBIT = 1;
	
	private int type;
	
	public TypedCashFlow(){}
	
	public TypedCashFlow(Date date, int type, double amount){
		super(date, amount);
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public String toString() {

        return "TypedCashflow[date=" + getDate() + ",type=" + (type == CREDIT ? "Credit" : "Debit") + ",amount=" + getAmount() + "]";

    }
	

}
