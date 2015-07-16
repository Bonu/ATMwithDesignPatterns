package edu.mum.cs.ds.atm.model;

import java.io.Serializable;

public class Bill implements Serializable {
	public Account account;
	public double paymentAmount;
	public String date;
	public String billNo;
	
	public Bill(Account account, double paymentAmount, String date, String billNo) {
		super();
		this.account = account;
		this.paymentAmount = paymentAmount;
		this.date = date;
		this.billNo = billNo;
	}
	public Account getAccount() {
		return account;
	}
	
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public String getDate() {
		return date;
	}
	public String getBillNo() {
		return billNo;
	}
	
	public boolean payBill(){
		if((account.getAmount() - paymentAmount)<0)
			return false;
		else{
			account.setAmount(account.getAmount() - paymentAmount);
			return true;
		}
	}
	
	
	
	

}
