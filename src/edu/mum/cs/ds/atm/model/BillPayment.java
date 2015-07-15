package edu.mum.cs.ds.atm.model;

import java.util.Date;

public abstract class BillPayment {
	protected Bill bill;
	public BillPayment(Bill bill)
	{
		this.bill = bill;
	}
	abstract void pay() throws Exception;
}
