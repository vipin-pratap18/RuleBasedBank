package com.test.model;

import java.util.Date;

public class AllocatedCashFlow extends TypedCashFlow {
	
	private Account account;
	
	public AllocatedCashFlow(){
	}
	
	public AllocatedCashFlow(Account account, Date date, int type, double amount){
		super(date, type, amount);
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	 public String toString() {

	        return "AllocatedCashflow[" +

	               "account=" + account +

	               ",date=" + getDate() + 

	               ",type=" + (getType() == CREDIT ? "Credit" : "Debit") + 

	               ",amount=" + getAmount() + "]";

	    }

}
